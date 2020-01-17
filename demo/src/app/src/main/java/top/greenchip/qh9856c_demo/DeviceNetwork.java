package top.greenchip.qh9856c_demo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import top.greenchip.wificlock.WIFIclock_9856C;

@SuppressLint("ALL")
@SuppressWarnings("ALL")
public class DeviceNetwork extends AppCompatActivity implements View.OnClickListener {

    AlertDialog.Builder builder;
    TextView wifi_name, wifi_pass;
    Button configure;
    LinearLayout tips;
    int ts = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_network);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        builder = new AlertDialog.Builder(DeviceNetwork.this);
        builder.setCancelable(false);
        //////
        wifi_name = this.findViewById(R.id.wifi_name);
        wifi_pass = this.findViewById(R.id.wifi_pass);
        configure = this.findViewById(R.id.configure);
        tips = this.findViewById(R.id.tips);
        configure.setOnClickListener(this);
        //////
        MainActivity.instance.clock.setSuccessListener(new WIFIclock_9856C.SuccessConfigure() {
            @Override
            public void Success() {
                builder.setTitle(null);
                builder.setMessage("设备配置成功。");
                builder.setPositiveButton("确定", null);
                builder.create().show();
                //////
                configure.setTextColor(0xffffffff);
                configure.setBackgroundColor(0xff008577);
                tips.setVisibility(View.GONE);
                ts = 0;
            }
        });
        MainActivity.instance.clock.setFailListener(new WIFIclock_9856C.FailConfigure() {
            @Override
            public void Fail() {
                builder.setTitle(null);
                builder.setMessage("设备配置失败。");
                builder.setPositiveButton("确定", null);
                builder.create().show();
                //////
                configure.setTextColor(0xffffffff);
                configure.setBackgroundColor(0xff008577);
                tips.setVisibility(View.GONE);
                ts = 0;
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.configure:
                if (configure.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    configure.setTextColor(0xfff0f0f0);
                    configure.setBackgroundColor(0xff999999);
                    tips.setVisibility(View.VISIBLE);
                    //////
                    MainActivity.instance.clock.configureWIFI(wifi_name.getText().toString().trim(), wifi_pass.getText().toString().trim());
                    //////
                    Long tsLong = System.currentTimeMillis(); // 获取当前时间戳
                    ts = tsLong.intValue();
                    final int ts_ = tsLong.intValue();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            if (ts == ts_) {
                                if (configure.getTextColors() != ColorStateList.valueOf(0xffffffff)) {
                                    builder.setTitle(null);
                                    builder.setMessage("设备配置失败。");
                                    builder.setPositiveButton("确定", null);
                                    builder.create().show();
                                    //////
                                    configure.setTextColor(0xffffffff);
                                    configure.setBackgroundColor(0xff008577);
                                    tips.setVisibility(View.GONE);
                                    ts = 0;
                                }
                            }
                        }
                    }, 60000); // 延时60秒
                }
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}

package top.greenchip.qh9856c_demo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import top.greenchip.wificlock.WIFIclock_9856C;

@SuppressLint("ALL")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static MainActivity instance = null;
    AlertDialog.Builder builder;
    TextView deviceNetwork, deviceConnect;
    LinearLayout main, tips;

    WIFIclock_9856C clock;
    WIFIclock_9856C.Channel channel_;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;
        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);
        //////
        deviceNetwork = this.findViewById(R.id.deviceNetwork);
        deviceConnect = this.findViewById(R.id.deviceConnect);
        main = this.findViewById(R.id.main);
        tips = this.findViewById(R.id.tips);
        deviceNetwork.setOnClickListener(this);
        deviceConnect.setOnClickListener(this);
        //////
        clock = new WIFIclock_9856C();
        clock.setSuccessListener(new WIFIclock_9856C.SuccessListener() {
            @Override
            public void Success(String host, String mac, final WIFIclock_9856C.Channel channel) {
                builder.setTitle("设备连接成功");
                builder.setMessage("设备IP：" + host + "\n唯一序列：" + mac);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        channel_ = channel;
                        tips.setVisibility(View.GONE);
                        main.setVisibility(View.VISIBLE);
                        deviceConnect.setTextColor(0xffffffff);
                        deviceConnect.setBackgroundColor(0xff008577);
                        Intent intent = new Intent(MainActivity.this, DeviceConnect.class);
                        startActivity(intent);
                    }
                });
                builder.create().show();
            }
        });
        clock.setFailListener(new WIFIclock_9856C.FailListener() {
            @Override
            public void Fail() {
                deviceConnect.setTextColor(0xff000000);
                deviceConnect.setBackgroundColor(0xffeeeeee);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.deviceNetwork:
                Intent intent = new Intent(MainActivity.this, DeviceNetwork.class);
                startActivity(intent);
                break;
            case R.id.deviceConnect:
                if (deviceConnect.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    Intent i = new Intent(MainActivity.this, DeviceConnect.class);
                    startActivity(i);
                } else {
                    main.setVisibility(View.GONE);
                    tips.setVisibility(View.VISIBLE);
                    clock.run();
                }
//                Intent i = new Intent(MainActivity.this, DeviceConnect.class);
//                startActivity(i);
                break;
        }
    }

}

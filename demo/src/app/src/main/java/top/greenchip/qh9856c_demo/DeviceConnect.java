package top.greenchip.qh9856c_demo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import top.greenchip.wificlock.WIFIclock_9856C;

@SuppressLint("ALL")
@SuppressWarnings("ALL")
public class DeviceConnect extends AppCompatActivity implements View.OnClickListener {

    AlertDialog.Builder builder;
    ScrollView getAreaInfo_view;
    TextView getAreaInfo;
    TextView getAreaInfo_data;
    TextView getDeviceData, getDeviceData_data, getDeviceData_tips_1, getDeviceData_tips_2;
    TextView setDeviceArea, area_01, area_02;
    TextView setDeviceAlarm, alarm_01, alarm_02, alarm_03, alarm_04, alarm_05, alarm_06, alarm_07, alarm_08;
    TextView setDeviceParam, param_01, param_02, param_03, param_04, param_05, param_06, param_07, param_08;
    TextView setMuteAlarm, setLazyAlarm;
    TextView block;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_connect);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        builder = new AlertDialog.Builder(DeviceConnect.this);
        builder.setCancelable(false);
        //////
        getAreaInfo_view = this.findViewById(R.id.getAreaInfo_view);
        getAreaInfo = this.findViewById(R.id.getAreaInfo);
        getAreaInfo_data = this.findViewById(R.id.getAreaInfo_data);
        getDeviceData = this.findViewById(R.id.getDeviceData);
        getDeviceData_data = this.findViewById(R.id.getDeviceData_data);
        getDeviceData_tips_1 = this.findViewById(R.id.getDeviceData_tips_1);
        getDeviceData_tips_2 = this.findViewById(R.id.getDeviceData_tips_2);
        setDeviceArea = this.findViewById(R.id.setDeviceArea);
        area_01 = this.findViewById(R.id.area_01);
        area_02 = this.findViewById(R.id.area_02);
        setDeviceAlarm = this.findViewById(R.id.setDeviceAlarm);
        alarm_01 = this.findViewById(R.id.alarm_01);
        alarm_02 = this.findViewById(R.id.alarm_02);
        alarm_03 = this.findViewById(R.id.alarm_03);
        alarm_04 = this.findViewById(R.id.alarm_04);
        alarm_05 = this.findViewById(R.id.alarm_05);
        alarm_06 = this.findViewById(R.id.alarm_06);
        alarm_07 = this.findViewById(R.id.alarm_07);
        alarm_08 = this.findViewById(R.id.alarm_08);
        setDeviceParam = this.findViewById(R.id.setDeviceParam);
        param_01 = this.findViewById(R.id.param_01);
        param_02 = this.findViewById(R.id.param_02);
        param_03 = this.findViewById(R.id.param_03);
        param_04 = this.findViewById(R.id.param_04);
        param_05 = this.findViewById(R.id.param_05);
        param_06 = this.findViewById(R.id.param_06);
        param_07 = this.findViewById(R.id.param_07);
        param_08 = this.findViewById(R.id.param_08);
        setMuteAlarm = this.findViewById(R.id.setMuteAlarm);
        setLazyAlarm = this.findViewById(R.id.setLazyAlarm);
        block = this.findViewById(R.id.block);
        //////
        getAreaInfo.setOnClickListener(this);
        getDeviceData.setOnClickListener(this);
        setDeviceArea.setOnClickListener(this);
        setDeviceAlarm.setOnClickListener(this);
        setDeviceParam.setOnClickListener(this);
        setMuteAlarm.setOnClickListener(this);
        setLazyAlarm.setOnClickListener(this);
        //////
        MainActivity.instance.clock.setReturnListener(new WIFIclock_9856C.ReturnListener() {
            @Override
            public void Return(String data) {
                if (getAreaInfo.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    builder.setTitle(null);
                    builder.setMessage("已获取数据");
                    builder.setPositiveButton("确定", null);
                    builder.create().show();
                    //////
                    block.setVisibility(View.GONE);
                    getAreaInfo.setTextColor(0xffffffff);
                    getAreaInfo.setBackgroundColor(0xff008577);
                    getAreaInfo_view.setVisibility(View.VISIBLE);
                    getAreaInfo_data.setText(decodeUnicode(data));
                }
                if (getDeviceData.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    builder.setTitle(null);
                    builder.setMessage("已返回数据");
                    builder.setPositiveButton("确定", null);
                    builder.create().show();
                    //////
                    block.setVisibility(View.GONE);
                    getDeviceData.setTextColor(0xffffffff);
                    getDeviceData.setBackgroundColor(0xff008577);
                    getDeviceData_tips_1.setVisibility(View.VISIBLE);
                    getDeviceData_tips_2.setVisibility(View.VISIBLE);
                    getDeviceData_data.setVisibility(View.VISIBLE);
                    getDeviceData_data.setText(data);
                }
                if (setDeviceArea.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            builder.setTitle(null);
                            builder.setMessage("设置成功");
                            builder.setPositiveButton("确定", null);
                            builder.create().show();
                            //////
                            block.setVisibility(View.GONE);
                            setDeviceArea.setTextColor(0xffffffff);
                            setDeviceArea.setBackgroundColor(0xff008577);
                        }
                    }, 10000); // 设置成功后，设备会自已上网获取最新的时候，这个过程里，APP与设备的通信会中断，所以这里需要延时一段的时候，才告知用户成功。
                }
                if (setDeviceAlarm.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    builder.setTitle(null);
                    builder.setMessage("设置成功");
                    builder.setPositiveButton("确定", null);
                    builder.create().show();
                    //////
                    block.setVisibility(View.GONE);
                    setDeviceAlarm.setTextColor(0xffffffff);
                    setDeviceAlarm.setBackgroundColor(0xff008577);
                }
                if (setDeviceParam.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    builder.setTitle(null);
                    builder.setMessage("设置成功");
                    builder.setPositiveButton("确定", null);
                    builder.create().show();
                    //////
                    block.setVisibility(View.GONE);
                    setDeviceParam.setTextColor(0xffffffff);
                    setDeviceParam.setBackgroundColor(0xff008577);
                }
                if (setMuteAlarm.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    builder.setTitle(null);
                    builder.setMessage("设置成功");
                    builder.setPositiveButton("确定", null);
                    builder.create().show();
                    //////
                    block.setVisibility(View.GONE);
                    setMuteAlarm.setTextColor(0xffffffff);
                    setMuteAlarm.setBackgroundColor(0xff008577);
                }
                if (setLazyAlarm.getTextColors() == ColorStateList.valueOf(0xfff0f0f0)) {
                    builder.setTitle(null);
                    builder.setMessage("设置成功");
                    builder.setPositiveButton("确定", null);
                    builder.create().show();
                    //////
                    block.setVisibility(View.GONE);
                    setLazyAlarm.setTextColor(0xffffffff);
                    setLazyAlarm.setBackgroundColor(0xff008577);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.getAreaInfo:
                if (getAreaInfo.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    getAreaInfo.setTextColor(0xfff0f0f0);
                    getAreaInfo.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.getAreaInfo(); // 获取国家和城市数据
                }
                break;
            case R.id.getDeviceData:
                if (getDeviceData.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    getDeviceData.setTextColor(0xfff0f0f0);
                    getDeviceData.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.getDeviceData(); // 读取设备数据
                }
                break;
            case R.id.setDeviceArea:
                if (setDeviceArea.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    setDeviceArea.setTextColor(0xfff0f0f0);
                    setDeviceArea.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.setDeviceArea(area_01.getText().toString().trim(), area_02.getText().toString().trim()); // 设置国家与城市
                }
                break;
            case R.id.setDeviceAlarm:
                if (setDeviceAlarm.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    setDeviceAlarm.setTextColor(0xfff0f0f0);
                    setDeviceAlarm.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.setDeviceAlarm(alarm_01.getText().toString().trim(), alarm_02.getText().toString().trim(), alarm_03.getText().toString().trim(), alarm_04.getText().toString().trim(), alarm_05.getText().toString().trim(), alarm_06.getText().toString().trim(), alarm_07.getText().toString().trim(), alarm_08.getText().toString().trim()); // 设置闹钟时间
                }
                break;
            case R.id.setDeviceParam:
                if (setDeviceParam.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    setDeviceParam.setTextColor(0xfff0f0f0);
                    setDeviceParam.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.setDeviceParam(param_01.getText().toString().trim(), param_02.getText().toString().trim(), param_03.getText().toString().trim(), param_04.getText().toString().trim(), param_05.getText().toString().trim(), param_06.getText().toString().trim(), param_07.getText().toString().trim(), param_08.getText().toString().trim()); // 设置其它参数
                }
                break;
            case R.id.setMuteAlarm:
                if (setMuteAlarm.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    setMuteAlarm.setTextColor(0xfff0f0f0);
                    setMuteAlarm.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.setMuteAlarm(); // 关闭闹钟声音
                }
                break;
            case R.id.setLazyAlarm:
                if (setLazyAlarm.getTextColors() == ColorStateList.valueOf(0xffffffff)) {
                    block.setVisibility(View.VISIBLE);
                    setLazyAlarm.setTextColor(0xfff0f0f0);
                    setLazyAlarm.setBackgroundColor(0xff999999);
                    //////
                    MainActivity.instance.channel_.setLazyAlarm(); // 关闭闹钟声音
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

    // Unicode转中文
    public static String decodeUnicode(final String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 0; i < hex.length; i++) {
            try {
                // 汉字范围 \u4e00-\u9fa5 (中文)
                if (hex[i].length() >= 4) { // 取前四个，判断是否是汉字
                    String chinese = hex[i].substring(0, 4);
                    try {
                        int chr = Integer.parseInt(chinese, 16);
                        // 追加成string
                        string.append((char) chr);
                        // 并且追加后面的字符
                        String behindString = hex[i].substring(4);
                        string.append(behindString);
                    } catch (NumberFormatException e1) {
                        string.append(hex[i]);
                    }
                } else {
                    string.append(hex[i]);
                }
            } catch (NumberFormatException e) {
                string.append(hex[i]);
            }
        }
        return string.toString();
    }

}

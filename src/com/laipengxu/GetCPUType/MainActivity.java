package com.laipengxu.GetCPUType;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.laipengxu.cputypelibfactory.CpuTypeUtils;

/**
 * 华为TIT Arm64
 * 华为Nexus6p Arm64
 * Smartisan T1 armeabi-v7a
 * Smartisan T2 Arm64
 * ASUS Nexus7 armeabi-v7a
 */
public class MainActivity extends Activity {

    private TextView tv_cpu_type;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tv_cpu_type = (TextView) findViewById(R.id.tv_cpu_type);

        if (CpuTypeUtils.isArm64Cpu()) {
            tv_cpu_type.setText("arm64");
        }else if (CpuTypeUtils.isArm7Compatible()) {
            tv_cpu_type.setText("armeabi-v7a");
        }else if (CpuTypeUtils.isArmCpu()){
            tv_cpu_type.setText("armeabi");
        }else if (CpuTypeUtils.isMips64Cpu()){
            tv_cpu_type.setText("mips64");
        }else if (CpuTypeUtils.isMipsCpu()){
            tv_cpu_type.setText("mips");
        }else if (CpuTypeUtils.isX86_64Cpu()){
            tv_cpu_type.setText("x86_64");
        }else if (CpuTypeUtils.isX86Cpu()){
            tv_cpu_type.setText("x86");
        }else{
            tv_cpu_type.setText("unknow");
        }
    }
}

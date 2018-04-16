package com.laipengxu.cputypelibfactory;

/**
 * Created by Administrator on 2017/8/18.
 */
public class CpuTypeUtils {
    static {
        System.loadLibrary("CpuTypeLib");
    }

    public static final String ARMEABI_V7 = "armeabi-v7a";
    public static final String ARMEABI = "armeabi";
    public static final String MIPSABI = "mips";
    public static final  String X86ABI = "x86";

    public static native boolean isArmCpu();
    public static native boolean isArm7Compatible();
    public static native boolean isMipsCpu();
    public static native boolean isX86Cpu();
    public static native boolean isArm64Cpu();
    public static native boolean isMips64Cpu();
    public static native boolean isX86_64Cpu();

}

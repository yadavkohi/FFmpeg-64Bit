package com.github.hiteshsondhi88.libffmpeg;

import android.os.Build;

class CpuArchHelper {

    static CpuArch getCpuArch() {
        Log.d("Build.CPU_ABI : " + Build.CPU_ABI);
        // check if device is x86 or x86_64
        if (Build.CPU_ABI.equals(getx86CpuAbi())) {
            return CpuArch.x86;
        } else if(Build.CPU_ABI.equals(getx86_64CpuAbi())){
            return CpuArch.x86_64;
        }else {
            // check if device is armeabi
            if (Build.CPU_ABI.equals(getArmeabiv7CpuAbi())) {
                // check if device is arm64 which is supported by ARMV7
                    return CpuArch.ARMv7;
            } else if (Build.CPU_ABI.equals(getArm64CpuAbi())) {
                return CpuArch.ARMv8;
            }
        }
        return CpuArch.NONE;
    }

    static String getx86CpuAbi() {
        return "x86";
    }

    static String getx86_64CpuAbi() {
        return "x86_64";
    }

    static String getArm64CpuAbi() {
        return "arm64-v8a";
    }

    static String getArmeabiv7CpuAbi() {
        return "armeabi-v7a";
    }
}

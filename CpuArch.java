package com.github.hiteshsondhi88.libffmpeg;

import android.text.TextUtils;

enum CpuArch {
    x86("0dd4dbad305ff197a1ea9e6158bd2081d229e70e"),
    ARMv7("871888959ba2f063e18f56272d0d98ae01938ceb"),
    ARMv8("8cc6b01618b14a07d86ed1d2e19befc957eefae6"),
    x86_64("3f486973998ca951b735cb0c0dd58e05424c81d4"),
    NONE(null);

    private String sha1;

    CpuArch(String sha1) {
        this.sha1 = sha1;
    }

    String getSha1(){
        return sha1;
    }

    static CpuArch fromString(String sha1) {
        if (!TextUtils.isEmpty(sha1)) {
            for (CpuArch cpuArch : CpuArch.values()) {
                if (sha1.equalsIgnoreCase(cpuArch.sha1)) {
                    return cpuArch;
                }
            }
        }
        return NONE;
    }
}

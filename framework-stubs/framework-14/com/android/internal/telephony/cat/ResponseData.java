package com.android.internal.telephony.cat;

abstract class ResponseData {
    ResponseData() {}
    public abstract void format(java.io.ByteArrayOutputStream p0);
    public static void writeLength(java.io.ByteArrayOutputStream p0, int p1) {}
}

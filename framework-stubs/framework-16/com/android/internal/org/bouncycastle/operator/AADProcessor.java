package com.android.internal.org.bouncycastle.operator;

public interface AADProcessor {
    public java.io.OutputStream getAADStream();
    public byte[] getMAC();
}

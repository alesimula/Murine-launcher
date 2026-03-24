package com.android.internal.org.bouncycastle.operator;

public class MacCaptureStream extends java.io.OutputStream {
    int macIndex;
    public MacCaptureStream(java.io.OutputStream p0, int p1) { super(); }
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public void write(int p0) throws java.io.IOException {}
    public byte[] getMac() { return null; }
}

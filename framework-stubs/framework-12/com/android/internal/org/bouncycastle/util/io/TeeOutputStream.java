package com.android.internal.org.bouncycastle.util.io;

public class TeeOutputStream extends java.io.OutputStream {
    private java.io.OutputStream output1;
    private java.io.OutputStream output2;
    public TeeOutputStream(java.io.OutputStream p0, java.io.OutputStream p1) { super(); }
    public void write(byte[] p0) throws java.io.IOException {}
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public void write(int p0) throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
}

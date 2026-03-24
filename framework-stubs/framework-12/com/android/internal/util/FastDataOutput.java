package com.android.internal.util;

public class FastDataOutput implements java.io.DataOutput, java.io.Flushable, java.io.Closeable {
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private final java.io.OutputStream mOut = null;
    private final byte[] mBuffer = null;
    private final long mBufferPtr = 0L;
    private final int mBufferCap = 0;
    private int mBufferPos;
    private java.util.HashMap<java.lang.String, java.lang.Short> mStringRefs;
    public FastDataOutput(java.io.OutputStream p0, int p1) {}
    private void drain() throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public void write(int p0) throws java.io.IOException {}
    public void write(byte[] p0) throws java.io.IOException {}
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public void writeUTF(java.lang.String p0) throws java.io.IOException {}
    public void writeInternedUTF(java.lang.String p0) throws java.io.IOException {}
    public void writeBoolean(boolean p0) throws java.io.IOException {}
    public void writeByte(int p0) throws java.io.IOException {}
    public void writeShort(int p0) throws java.io.IOException {}
    public void writeChar(int p0) throws java.io.IOException {}
    public void writeInt(int p0) throws java.io.IOException {}
    public void writeLong(long p0) throws java.io.IOException {}
    public void writeFloat(float p0) throws java.io.IOException {}
    public void writeDouble(double p0) throws java.io.IOException {}
    public void writeBytes(java.lang.String p0) throws java.io.IOException {}
    public void writeChars(java.lang.String p0) throws java.io.IOException {}
}

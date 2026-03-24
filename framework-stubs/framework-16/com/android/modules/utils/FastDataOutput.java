package com.android.modules.utils;

public class FastDataOutput implements java.io.DataOutput, java.io.Flushable, java.io.Closeable {
    protected static final int MAX_UNSIGNED_SHORT = 65535;
    protected static final int DEFAULT_BUFFER_SIZE = 32768;
    protected final byte[] mBuffer = null;
    protected final int mBufferCap = 0;
    protected int mBufferPos;
    public FastDataOutput(java.io.OutputStream p0, int p1) {}
    public static com.android.modules.utils.FastDataOutput obtain(java.io.OutputStream p0) { return null; }
    public void release() {}
    public byte[] newByteArray(int p0) { return null; }
    protected void setOutput(java.io.OutputStream p0) {}
    protected void drain() throws java.io.IOException {}
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

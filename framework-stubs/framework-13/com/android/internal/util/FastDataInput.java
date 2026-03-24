package com.android.internal.util;

public class FastDataInput implements java.io.DataInput, java.io.Closeable {
    @java.lang.Deprecated
    public FastDataInput(java.io.InputStream p0, int p1) {}
    public FastDataInput(java.io.InputStream p0, int p1, boolean p2) {}
    public static com.android.internal.util.FastDataInput obtainUsing3ByteSequences(java.io.InputStream p0) { return null; }
    public static com.android.internal.util.FastDataInput obtainUsing4ByteSequences(java.io.InputStream p0) { return null; }
    public void release() {}
    public void close() throws java.io.IOException {}
    public void readFully(byte[] p0) throws java.io.IOException {}
    public void readFully(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public java.lang.String readUTF() throws java.io.IOException { return null; }
    public java.lang.String readInternedUTF() throws java.io.IOException { return null; }
    public boolean readBoolean() throws java.io.IOException { return false; }
    public byte peekByte() throws java.io.IOException { return 0; }
    public byte readByte() throws java.io.IOException { return 0; }
    public int readUnsignedByte() throws java.io.IOException { return 0; }
    public short readShort() throws java.io.IOException { return 0; }
    public int readUnsignedShort() throws java.io.IOException { return 0; }
    public char readChar() throws java.io.IOException { return 0; }
    public int readInt() throws java.io.IOException { return 0; }
    public long readLong() throws java.io.IOException { return 0L; }
    public float readFloat() throws java.io.IOException { return 0.0f; }
    public double readDouble() throws java.io.IOException { return 0.0; }
    public int skipBytes(int p0) throws java.io.IOException { return 0; }
    public java.lang.String readLine() throws java.io.IOException { return null; }
}

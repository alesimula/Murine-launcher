package com.android.internal.util;

public class FastDataInput implements java.io.DataInput, java.io.Closeable {
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private final java.io.InputStream mIn = null;
    private final byte[] mBuffer = null;
    private final long mBufferPtr = 0L;
    private final int mBufferCap = 0;
    private int mBufferPos;
    private int mBufferLim;
    private int mStringRefCount;
    private java.lang.String[] mStringRefs;
    public FastDataInput(java.io.InputStream p0, int p1) {}
    private void fill(int p0) throws java.io.IOException {}
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

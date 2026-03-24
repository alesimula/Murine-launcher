package com.android.internal.widget.remotecompose.core;

public class WireBuffer {
    int mMaxSize;
    byte[] mBuffer;
    int mIndex;
    int mStartingIndex;
    int mSize;
    public WireBuffer(int p0) {}
    public WireBuffer() {}
    public byte[] getBuffer() { return null; }
    public int getMax_size() { return 0; }
    public int getIndex() { return 0; }
    public int getSize() { return 0; }
    public void setIndex(int p0) {}
    public void start(int p0) {}
    public void startWithSize(int p0) {}
    public void endWithSize() {}
    public void reset(int p0) {}
    public int size() { return 0; }
    public boolean available() { return false; }
    public int readOperationType() { return 0; }
    public boolean readBoolean() { return false; }
    public int readByte() { return 0; }
    public int readShort() { return 0; }
    public int peekInt() { return 0; }
    public int readInt() { return 0; }
    public long readLong() { return 0L; }
    public float readFloat() { return 0.0f; }
    public double readDouble() { return 0.0; }
    public byte[] readBuffer() { return null; }
    public byte[] readBuffer(int p0) { return null; }
    public java.lang.String readUTF8() { return null; }
    public java.lang.String readUTF8(int p0) { return null; }
    public void writeBoolean(boolean p0) {}
    public void writeByte(int p0) {}
    public void writeShort(int p0) {}
    public void writeInt(int p0) {}
    public void writeLong(long p0) {}
    public void writeFloat(float p0) {}
    public void writeDouble(double p0) {}
    public void writeBuffer(byte[] p0) {}
    public void writeUTF8(java.lang.String p0) {}
}

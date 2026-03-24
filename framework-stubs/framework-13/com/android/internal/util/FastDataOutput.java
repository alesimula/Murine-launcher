package com.android.internal.util;

public class FastDataOutput implements java.io.DataOutput, java.io.Flushable, java.io.Closeable {
    @java.lang.Deprecated
    public FastDataOutput(java.io.OutputStream p0, int p1) {}
    public FastDataOutput(java.io.OutputStream p0, int p1, boolean p2) {}
    public static com.android.internal.util.FastDataOutput obtainUsing3ByteSequences(java.io.OutputStream p0) { return null; }
    public static com.android.internal.util.FastDataOutput obtainUsing4ByteSequences(java.io.OutputStream p0) { return null; }
    public void release() {}
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

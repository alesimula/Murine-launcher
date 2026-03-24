package com.android.framework.protobuf;

public abstract class ByteOutput {
    public ByteOutput() {}
    public abstract void write(byte p0) throws java.io.IOException;
    public abstract void write(byte[] p0, int p1, int p2) throws java.io.IOException;
    public abstract void writeLazy(byte[] p0, int p1, int p2) throws java.io.IOException;
    public abstract void write(java.nio.ByteBuffer p0) throws java.io.IOException;
    public abstract void writeLazy(java.nio.ByteBuffer p0) throws java.io.IOException;
}

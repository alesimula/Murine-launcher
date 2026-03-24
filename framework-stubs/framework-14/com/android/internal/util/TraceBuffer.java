package com.android.internal.util;

public class TraceBuffer<P extends java.lang.Object, S extends P, T extends P> {
    public TraceBuffer(int p0) {}
    public TraceBuffer(int p0, java.util.function.Consumer<T> p1) {}
    public TraceBuffer(int p0, com.android.internal.util.TraceBuffer.ProtoProvider p1, java.util.function.Consumer<T> p2) {}
    public int getAvailableSpace() { return 0; }
    public int size() { return 0; }
    public void setCapacity(int p0) {}
    public void add(T p0) {}
    public boolean contains(byte[] p0) { return false; }
    public void writeTraceToFile(java.io.File p0, S p1) throws java.io.IOException {}
    public void resetBuffer() {}
    public int getBufferSize() { return 0; }
    public java.lang.String getStatus() { return null; }

    private static class ProtoOutputStreamProvider implements com.android.internal.util.TraceBuffer.ProtoProvider<android.util.proto.ProtoOutputStream, android.util.proto.ProtoOutputStream, android.util.proto.ProtoOutputStream> {
        public int getItemSize(android.util.proto.ProtoOutputStream p0) { return 0; }
        public byte[] getBytes(android.util.proto.ProtoOutputStream p0) { return null; }
        public void write(android.util.proto.ProtoOutputStream p0, java.util.Queue<android.util.proto.ProtoOutputStream> p1, java.io.OutputStream p2) throws java.io.IOException {}
    }

    public static interface ProtoProvider<P extends java.lang.Object, S extends P, T extends P> {
        public int getItemSize(P p0);
        public byte[] getBytes(P p0);
        public void write(S p0, java.util.Queue<T> p1, java.io.OutputStream p2) throws java.io.IOException;
    }
}

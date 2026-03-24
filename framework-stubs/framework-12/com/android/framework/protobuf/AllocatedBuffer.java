package com.android.framework.protobuf;

abstract class AllocatedBuffer {
    AllocatedBuffer() {}
    public abstract boolean hasNioBuffer();
    public abstract boolean hasArray();
    public abstract java.nio.ByteBuffer nioBuffer();
    public abstract byte[] array();
    public abstract int arrayOffset();
    public abstract int position();
    public abstract com.android.framework.protobuf.AllocatedBuffer position(int p0);
    public abstract int limit();
    public abstract int remaining();
    public static com.android.framework.protobuf.AllocatedBuffer wrap(byte[] p0) { return null; }
    public static com.android.framework.protobuf.AllocatedBuffer wrap(byte[] p0, int p1, int p2) { return null; }
    public static com.android.framework.protobuf.AllocatedBuffer wrap(java.nio.ByteBuffer p0) { return null; }
    private static com.android.framework.protobuf.AllocatedBuffer wrapNoCheck(byte[] p0, int p1, int p2) { return null; }
}

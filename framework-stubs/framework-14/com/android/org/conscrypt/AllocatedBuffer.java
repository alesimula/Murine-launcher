package com.android.org.conscrypt;

public abstract class AllocatedBuffer {
    public AllocatedBuffer() {}
    public abstract java.nio.ByteBuffer nioBuffer();
    @java.lang.Deprecated
    public com.android.org.conscrypt.AllocatedBuffer retain() { return null; }
    public abstract com.android.org.conscrypt.AllocatedBuffer release();
    public static com.android.org.conscrypt.AllocatedBuffer wrap(java.nio.ByteBuffer p0) { return null; }
}

package com.android.org.conscrypt;

public abstract class BufferAllocator {
    public BufferAllocator() {}
    public static com.android.org.conscrypt.BufferAllocator unpooled() { return null; }
    public abstract com.android.org.conscrypt.AllocatedBuffer allocateDirectBuffer(int p0);
}

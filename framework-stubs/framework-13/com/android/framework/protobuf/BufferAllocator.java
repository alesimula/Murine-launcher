package com.android.framework.protobuf;

abstract class BufferAllocator {
    BufferAllocator() {}
    public static com.android.framework.protobuf.BufferAllocator unpooled() { return null; }
    public abstract com.android.framework.protobuf.AllocatedBuffer allocateHeapBuffer(int p0);
    public abstract com.android.framework.protobuf.AllocatedBuffer allocateDirectBuffer(int p0);
}

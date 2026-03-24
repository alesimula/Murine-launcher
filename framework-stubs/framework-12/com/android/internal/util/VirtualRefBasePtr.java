package com.android.internal.util;

public final class VirtualRefBasePtr {
    private long mNativePtr;
    public VirtualRefBasePtr(long p0) {}
    public long get() { return 0L; }
    public void release() {}
    protected void finalize() throws java.lang.Throwable {}
    private static native void nIncStrong(long p0);
    private static native void nDecStrong(long p0);
}

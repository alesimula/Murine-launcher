package com.android.internal.os;

class ZygoteCommandBuffer implements java.lang.AutoCloseable {
    private long mNativeBuffer;
    private final android.net.LocalSocket mSocket = null;
    private final int mNativeSocket = 0;
    ZygoteCommandBuffer(android.net.LocalSocket p0) {}
    ZygoteCommandBuffer(java.lang.String[] p0) {}
    private static native long getNativeBuffer(int p0);
    public void close() {}
    private static native void freeNativeBuffer(long p0);
    int getCount() { return 0; }
    private static native int nativeGetCount(long p0);
    private void setCommand(java.lang.String[] p0) {}
    private static native void insert(long p0, java.lang.String p1);
    java.lang.String nextArg() { return null; }
    private static native java.lang.String nativeNextArg(long p0);
    void readFullyAndReset() {}
    private static native void nativeReadFullyAndReset(long p0);
    boolean forkRepeatedly(java.io.FileDescriptor p0, int p1, int p2, java.lang.String p3) { return false; }
    private static native boolean nativeForkRepeatedly(long p0, int p1, int p2, int p3, java.lang.String p4);
}

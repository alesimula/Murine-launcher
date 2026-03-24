package com.android.internal.os;

public class ApplicationSharedMemory implements java.lang.AutoCloseable {
    public static final long INVALID_NETWORK_TIME = -1L;
    public static com.android.internal.os.ApplicationSharedMemory sInstance;
    public static com.android.internal.os.ApplicationSharedMemory getInstance() { return null; }
    public static void setInstance(com.android.internal.os.ApplicationSharedMemory p0) {}
    public static com.android.internal.os.ApplicationSharedMemory create() { return null; }
    public static com.android.internal.os.ApplicationSharedMemory fromFileDescriptor(java.io.FileDescriptor p0, boolean p1) { return null; }
    ApplicationSharedMemory(java.io.FileDescriptor p0, boolean p1, long p2) {}
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public java.io.FileDescriptor getReadOnlyFileDescriptor() throws java.io.IOException { return null; }
    public void setLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis(long p0) {}
    public void clearLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis() {}
    public long getLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis() throws java.time.DateTimeException { return 0L; }
    public static native long nativeGetLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis(long p0);
    public void closeFileDescriptor() {}
    public void close() {}
    public boolean isMapped() { return false; }
    public boolean isMutable() { return false; }
    public long getSystemNonceBlock() { return 0L; }
    public void writeSystemFeaturesCache(int[] p0) {}
    @android.annotation.NonNull
    public int[] readSystemFeaturesCache() { return null; }
    public void setCurrentAnimatorScale(float p0) {}
    public float getCurrentAnimatorScale() { return 0.0f; }
}

package android.hardware.camera2.utils;

public class CloseableLock implements java.lang.AutoCloseable {
    private static final boolean VERBOSE = false;
    private final java.lang.String TAG = null;
    private final java.lang.String mName = null;
    private volatile boolean mClosed;
    private boolean mExclusive;
    private int mSharedLocks;
    private final java.util.concurrent.locks.ReentrantLock mLock = null;
    private final java.util.concurrent.locks.Condition mCondition = null;
    private final java.lang.ThreadLocal<java.lang.Integer> mLockCount = null;
    public CloseableLock() {}
    public CloseableLock(java.lang.String p0) {}
    public void close() {}
    public android.hardware.camera2.utils.CloseableLock.ScopedLock acquireLock() { return null; }
    public android.hardware.camera2.utils.CloseableLock.ScopedLock acquireExclusiveLock() { return null; }
    public void releaseLock() {}
    private void log(java.lang.String p0) {}

    public class ScopedLock implements java.lang.AutoCloseable {
        private ScopedLock(android.hardware.camera2.utils.CloseableLock p0) {}
        public void close() {}
    }
}

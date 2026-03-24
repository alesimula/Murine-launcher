package android.hardware.camera2.utils;

public class CloseableLock implements java.lang.AutoCloseable {
    public CloseableLock() {}
    public CloseableLock(java.lang.String p0) {}
    public void close() {}
    public android.hardware.camera2.utils.CloseableLock.ScopedLock acquireLock() { return null; }
    public android.hardware.camera2.utils.CloseableLock.ScopedLock acquireExclusiveLock() { return null; }
    public void releaseLock() {}

    public class ScopedLock implements java.lang.AutoCloseable {
        public void close() {}
    }
}

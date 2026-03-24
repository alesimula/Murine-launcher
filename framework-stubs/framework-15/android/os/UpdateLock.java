package android.os;

public class UpdateLock {
    android.os.IBinder mToken;
    int mCount;
    boolean mRefCounted;
    boolean mHeld;
    final java.lang.String mTag = null;
    public static final java.lang.String UPDATE_LOCK_CHANGED = "android.os.UpdateLock.UPDATE_LOCK_CHANGED";
    public static final java.lang.String NOW_IS_CONVENIENT = "nowisconvenient";
    public static final java.lang.String TIMESTAMP = "timestamp";
    public UpdateLock(java.lang.String p0) {}
    public void setReferenceCounted(boolean p0) {}
    public boolean isHeld() { return false; }
    public void acquire() {}
    public void release() {}
    protected void finalize() throws java.lang.Throwable {}
}

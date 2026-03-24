package android.os;

public class UpdateLock {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "UpdateLock";
    private static android.os.IUpdateLock sService;
    android.os.IBinder mToken;
    int mCount;
    boolean mRefCounted;
    boolean mHeld;
    final java.lang.String mTag = null;
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String UPDATE_LOCK_CHANGED = "android.os.UpdateLock.UPDATE_LOCK_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String NOW_IS_CONVENIENT = "nowisconvenient";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String TIMESTAMP = "timestamp";
    private static void checkService() {}
    public UpdateLock(java.lang.String p0) {}
    public void setReferenceCounted(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isHeld() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void acquire() {}
    private void acquireLocked() {}
    @android.annotation.UnsupportedAppUsage
    public void release() {}
    private void releaseLocked() {}
    protected void finalize() throws java.lang.Throwable {}
}

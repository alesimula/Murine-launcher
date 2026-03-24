package android.media.tv.tuner;

@android.annotation.SystemApi
public class Descrambler implements java.lang.AutoCloseable {
    public static final int PID_TYPE_T = 1;
    public static final int PID_TYPE_MMTP = 2;
    private static final java.lang.String TAG = "Descrambler";
    private long mNativeContext;
    private boolean mIsClosed;
    private final java.lang.Object mLock = null;
    private native int nativeAddPid(int p0, int p1, android.media.tv.tuner.filter.Filter p2);
    private native int nativeRemovePid(int p0, int p1, android.media.tv.tuner.filter.Filter p2);
    private native int nativeSetKeyToken(byte[] p0);
    private native int nativeClose();
    private Descrambler() {}
    public int addPid(int p0, int p1, android.media.tv.tuner.filter.Filter p2) { return 0; }
    public int removePid(int p0, int p1, android.media.tv.tuner.filter.Filter p2) { return 0; }
    public int setKeyToken(byte[] p0) { return 0; }
    public void close() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PidType {
    }
}

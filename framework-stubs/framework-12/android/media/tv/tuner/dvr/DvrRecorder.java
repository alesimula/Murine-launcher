package android.media.tv.tuner.dvr;

@android.annotation.SystemApi
public class DvrRecorder implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "TvTunerRecord";
    private long mNativeContext;
    private android.media.tv.tuner.dvr.OnRecordStatusChangedListener mListener;
    private java.util.concurrent.Executor mExecutor;
    private int mUserId;
    private static int sInstantId;
    private int mSegmentId;
    private int mOverflow;
    private java.lang.Boolean mIsStopped;
    private final java.lang.Object mListenerLock = null;
    private native int nativeAttachFilter(android.media.tv.tuner.filter.Filter p0);
    private native int nativeDetachFilter(android.media.tv.tuner.filter.Filter p0);
    private native int nativeConfigureDvr(android.media.tv.tuner.dvr.DvrSettings p0);
    private native int nativeStartDvr();
    private native int nativeStopDvr();
    private native int nativeFlushDvr();
    private native int nativeClose();
    private native void nativeSetFileDescriptor(int p0);
    private native long nativeWrite(long p0);
    private native long nativeWrite(byte[] p0, long p1, long p2);
    private DvrRecorder() {}
    public void setListener(java.util.concurrent.Executor p0, android.media.tv.tuner.dvr.OnRecordStatusChangedListener p1) {}
    private void onRecordStatusChanged(int p0) {}
    public int attachFilter(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public int detachFilter(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public int configure(android.media.tv.tuner.dvr.DvrSettings p0) { return 0; }
    public int start() { return 0; }
    public int stop() { return 0; }
    public int flush() { return 0; }
    public void close() {}
    public void setFileDescriptor(android.os.ParcelFileDescriptor p0) {}
    public long write(long p0) { return 0L; }
    public long write(byte[] p0, long p1, long p2) { return 0L; }
}

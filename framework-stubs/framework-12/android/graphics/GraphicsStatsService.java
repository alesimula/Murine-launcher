package android.graphics;

public class GraphicsStatsService extends android.view.IGraphicsStats.Stub {
    public static final java.lang.String GRAPHICS_STATS_SERVICE = "graphicsstats";
    private static final java.lang.String TAG = "GraphicsStatsService";
    private static final int SAVE_BUFFER = 1;
    private static final int DELETE_OLD = 2;
    private static final int AID_STATSD = 1066;
    private final int mAshmemSize = 0;
    private final byte[] mZeroData = null;
    private final android.content.Context mContext = null;
    private final android.app.AppOpsManager mAppOps = null;
    private final android.app.AlarmManager mAlarmManager = null;
    private final java.lang.Object mLock = null;
    private java.util.ArrayList<android.graphics.GraphicsStatsService.ActiveBuffer> mActive;
    private java.io.File mGraphicsStatsDir;
    private final java.lang.Object mFileAccessLock = null;
    private android.os.Handler mWriteOutHandler;
    private boolean mRotateIsScheduled;
    public GraphicsStatsService(android.content.Context p0) { super(); }
    private void scheduleRotateLocked() {}
    private void onAlarm() {}
    public android.os.ParcelFileDescriptor requestBufferForProcess(java.lang.String p0, android.view.IGraphicsStatsCallback p1) throws android.os.RemoteException { return null; }
    private void pullGraphicsStats(boolean p0, long p1) throws android.os.RemoteException {}
    private void pullGraphicsStatsImpl(boolean p0, long p1) {}
    private android.os.ParcelFileDescriptor requestBufferForProcessLocked(android.view.IGraphicsStatsCallback p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException { return null; }
    private java.util.Calendar normalizeDate(long p0) { return null; }
    private java.io.File pathForApp(android.graphics.GraphicsStatsService.BufferInfo p0) { return null; }
    private void saveBuffer(android.graphics.GraphicsStatsService.HistoricalBuffer p0) {}
    private void deleteRecursiveLocked(java.io.File p0) {}
    private void deleteOldBuffers() {}
    private void addToSaveQueue(android.graphics.GraphicsStatsService.ActiveBuffer p0) {}
    private void processDied(android.graphics.GraphicsStatsService.ActiveBuffer p0) {}
    private android.graphics.GraphicsStatsService.ActiveBuffer fetchActiveBuffersLocked(android.view.IGraphicsStatsCallback p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException { return null; }
    private java.util.HashSet<java.io.File> dumpActiveLocked(long p0, java.util.ArrayList<android.graphics.GraphicsStatsService.HistoricalBuffer> p1) { return null; }
    private void dumpHistoricalLocked(long p0, java.util.HashSet<java.io.File> p1) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void finalize() throws java.lang.Throwable {}
    private native void nativeInit();
    private static native void nativeDestructor();
    private static native int nGetAshmemSize();
    private static native long nCreateDump(int p0, boolean p1);
    private static native void nAddToDump(long p0, java.lang.String p1, java.lang.String p2, long p3, long p4, long p5, byte[] p6);
    private static native void nAddToDump(long p0, java.lang.String p1);
    private static native void nFinishDump(long p0);
    private static native void nFinishDumpInMemory(long p0, long p1, boolean p2);
    private static native void nSaveBuffer(java.lang.String p0, java.lang.String p1, long p2, long p3, long p4, byte[] p5);

    private final class ActiveBuffer implements android.os.IBinder.DeathRecipient {
        final android.graphics.GraphicsStatsService.BufferInfo mInfo = null;
        final int mUid = 0;
        final int mPid = 0;
        final android.view.IGraphicsStatsCallback mCallback = null;
        final android.os.IBinder mToken = null;
        android.os.SharedMemory mProcessBuffer;
        java.nio.ByteBuffer mMapping;
        ActiveBuffer(android.graphics.GraphicsStatsService p0, android.view.IGraphicsStatsCallback p1, int p2, int p3, java.lang.String p4, long p5) throws android.os.RemoteException, java.io.IOException {}
        public void binderDied() {}
        void closeAllBuffers() {}
        android.os.ParcelFileDescriptor getPfd() { return null; }
        void readBytes(byte[] p0, int p1) throws java.io.IOException {}
    }

    private final class BufferInfo {
        final java.lang.String mPackageName = null;
        final long mVersionCode = 0L;
        long mStartTime;
        long mEndTime;
        BufferInfo(android.graphics.GraphicsStatsService p0, java.lang.String p1, long p2, long p3) {}
    }

    private final class HistoricalBuffer {
        final android.graphics.GraphicsStatsService.BufferInfo mInfo = null;
        final byte[] mData = null;
        HistoricalBuffer(android.graphics.GraphicsStatsService p0, android.graphics.GraphicsStatsService.ActiveBuffer p1) throws java.io.IOException {}
    }
}

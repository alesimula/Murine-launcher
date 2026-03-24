package android.graphics;

public class GraphicsStatsService extends android.view.IGraphicsStats.Stub {
    public static final java.lang.String GRAPHICS_STATS_SERVICE = "graphicsstats";
    public GraphicsStatsService(android.content.Context p0) { super(); }
    public android.os.ParcelFileDescriptor requestBufferForProcess(java.lang.String p0, android.view.IGraphicsStatsCallback p1) throws android.os.RemoteException { return null; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void finalize() throws java.lang.Throwable {}

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

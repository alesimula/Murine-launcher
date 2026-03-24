package android.telephony.mbms;

public class InternalDownloadStatusListener extends android.telephony.mbms.IDownloadStatusListener.Stub {
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.telephony.mbms.DownloadStatusListener mAppListener = null;
    private volatile boolean mIsStopped;
    public InternalDownloadStatusListener(android.telephony.mbms.DownloadStatusListener p0, java.util.concurrent.Executor p1) { super(); }
    public void onStatusUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2) throws android.os.RemoteException {}
    public void stop() {}
}

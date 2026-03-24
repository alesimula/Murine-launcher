package android.telephony.mbms;

public class InternalDownloadProgressListener extends android.telephony.mbms.IDownloadProgressListener.Stub {
    public InternalDownloadProgressListener(android.telephony.mbms.DownloadProgressListener p0, java.util.concurrent.Executor p1) { super(); }
    public void onProgressUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
    public void stop() {}
}

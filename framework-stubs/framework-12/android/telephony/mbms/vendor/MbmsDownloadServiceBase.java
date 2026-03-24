package android.telephony.mbms.vendor;

@android.annotation.SystemApi
public class MbmsDownloadServiceBase extends android.telephony.mbms.vendor.IMbmsDownloadService.Stub {
    private final java.util.Map<android.os.IBinder, android.telephony.mbms.DownloadStatusListener> mDownloadStatusListenerBinderMap = null;
    private final java.util.Map<android.os.IBinder, android.telephony.mbms.DownloadProgressListener> mDownloadProgressListenerBinderMap = null;
    private final java.util.Map<android.os.IBinder, android.os.IBinder.DeathRecipient> mDownloadCallbackDeathRecipients = null;
    public MbmsDownloadServiceBase() { super(); }
    public int initialize(int p0, android.telephony.mbms.MbmsDownloadSessionCallback p1) throws android.os.RemoteException { return 0; }
    public final int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException { return 0; }
    public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
    public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
    public int addServiceAnnouncement(int p0, byte[] p1) { return 0; }
    public int download(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
    public int addStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.DownloadStatusListener p1) throws android.os.RemoteException { return 0; }
    public final int addStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException { return 0; }
    public int removeStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.DownloadStatusListener p1) throws android.os.RemoteException { return 0; }
    public final int removeStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException { return 0; }
    public int addProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.DownloadProgressListener p1) throws android.os.RemoteException { return 0; }
    public final int addProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException { return 0; }
    public int removeProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.DownloadProgressListener p1) throws android.os.RemoteException { return 0; }
    public final int removeProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException { return 0; }
    public java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads(int p0) throws android.os.RemoteException { return null; }
    public int cancelDownload(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
    public int requestDownloadState(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1) throws android.os.RemoteException { return 0; }
    public int resetDownloadKnowledge(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
    public void dispose(int p0) throws android.os.RemoteException {}
    public void onAppCallbackDied(int p0, int p1) {}
    @android.annotation.SystemApi
    public android.os.IBinder asBinder() { return null; }
    @android.annotation.SystemApi
    public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

    private static abstract class VendorDownloadProgressListener extends android.telephony.mbms.DownloadProgressListener {
        private final android.telephony.mbms.IDownloadProgressListener mListener = null;
        public VendorDownloadProgressListener(android.telephony.mbms.IDownloadProgressListener p0) { super(); }
        public void onProgressUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2, int p3, int p4, int p5) {}
        protected abstract void onRemoteException(android.os.RemoteException p0);
    }

    private static abstract class VendorDownloadStatusListener extends android.telephony.mbms.DownloadStatusListener {
        private final android.telephony.mbms.IDownloadStatusListener mListener = null;
        public VendorDownloadStatusListener(android.telephony.mbms.IDownloadStatusListener p0) { super(); }
        public void onStatusUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2) {}
        protected abstract void onRemoteException(android.os.RemoteException p0);
    }
}

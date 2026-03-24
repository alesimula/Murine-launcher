package android.telephony.mbms.vendor;

public interface IMbmsDownloadService extends android.os.IInterface {
    public int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException;
    public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int addServiceAnnouncement(int p0, byte[] p1) throws android.os.RemoteException;
    public int download(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException;
    public int addStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException;
    public int removeStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException;
    public int addProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException;
    public int removeProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads(int p0) throws android.os.RemoteException;
    public int cancelDownload(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException;
    public int requestDownloadState(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1) throws android.os.RemoteException;
    public int resetDownloadKnowledge(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException;
    public void dispose(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.mbms.vendor.IMbmsDownloadService {
        public Default() {}
        public int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException { return 0; }
        public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
        public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int addServiceAnnouncement(int p0, byte[] p1) throws android.os.RemoteException { return 0; }
        public int download(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
        public int addStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException { return 0; }
        public int removeStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException { return 0; }
        public int addProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException { return 0; }
        public int removeProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads(int p0) throws android.os.RemoteException { return null; }
        public int cancelDownload(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
        public int requestDownloadState(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1) throws android.os.RemoteException { return 0; }
        public int resetDownloadKnowledge(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
        public void dispose(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.vendor.IMbmsDownloadService {
        public static final java.lang.String DESCRIPTOR = "android.telephony.mbms.vendor.IMbmsDownloadService";
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_requestUpdateFileServices = 2;
        static final int TRANSACTION_setTempFileRootDirectory = 3;
        static final int TRANSACTION_addServiceAnnouncement = 4;
        static final int TRANSACTION_download = 5;
        static final int TRANSACTION_addStatusListener = 6;
        static final int TRANSACTION_removeStatusListener = 7;
        static final int TRANSACTION_addProgressListener = 8;
        static final int TRANSACTION_removeProgressListener = 9;
        static final int TRANSACTION_listPendingDownloads = 10;
        static final int TRANSACTION_cancelDownload = 11;
        static final int TRANSACTION_requestDownloadState = 12;
        static final int TRANSACTION_resetDownloadKnowledge = 13;
        static final int TRANSACTION_dispose = 14;
        public Stub() { super(); }
        public static android.telephony.mbms.vendor.IMbmsDownloadService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.mbms.vendor.IMbmsDownloadService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException { return 0; }
            public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
            public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int addServiceAnnouncement(int p0, byte[] p1) throws android.os.RemoteException { return 0; }
            public int download(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
            public int addStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException { return 0; }
            public int removeStatusListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadStatusListener p1) throws android.os.RemoteException { return 0; }
            public int addProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException { return 0; }
            public int removeProgressListener(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.IDownloadProgressListener p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.mbms.DownloadRequest> listPendingDownloads(int p0) throws android.os.RemoteException { return null; }
            public int cancelDownload(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
            public int requestDownloadState(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1) throws android.os.RemoteException { return 0; }
            public int resetDownloadKnowledge(android.telephony.mbms.DownloadRequest p0) throws android.os.RemoteException { return 0; }
            public void dispose(int p0) throws android.os.RemoteException {}
        }
    }
}

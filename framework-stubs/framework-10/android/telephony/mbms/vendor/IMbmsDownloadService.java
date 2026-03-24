package android.telephony.mbms.vendor;

public interface IMbmsDownloadService extends android.os.IInterface {
    public int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException;
    public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException;
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

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.vendor.IMbmsDownloadService {
        private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.vendor.IMbmsDownloadService";
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_requestUpdateFileServices = 2;
        static final int TRANSACTION_setTempFileRootDirectory = 3;
        static final int TRANSACTION_download = 4;
        static final int TRANSACTION_addStatusListener = 5;
        static final int TRANSACTION_removeStatusListener = 6;
        static final int TRANSACTION_addProgressListener = 7;
        static final int TRANSACTION_removeProgressListener = 8;
        static final int TRANSACTION_listPendingDownloads = 9;
        static final int TRANSACTION_cancelDownload = 10;
        static final int TRANSACTION_requestDownloadState = 11;
        static final int TRANSACTION_resetDownloadKnowledge = 12;
        static final int TRANSACTION_dispose = 13;
        public Stub() { super(); }
        public static android.telephony.mbms.vendor.IMbmsDownloadService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.mbms.vendor.IMbmsDownloadService p0) { return false; }
        public static android.telephony.mbms.vendor.IMbmsDownloadService getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.mbms.vendor.IMbmsDownloadService {
            private android.os.IBinder mRemote;
            public static android.telephony.mbms.vendor.IMbmsDownloadService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException { return 0; }
            public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
            public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
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

    public static class Default implements android.telephony.mbms.vendor.IMbmsDownloadService {
        public Default() {}
        public int initialize(int p0, android.telephony.mbms.IMbmsDownloadSessionCallback p1) throws android.os.RemoteException { return 0; }
        public int requestUpdateFileServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
        public int setTempFileRootDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
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
}

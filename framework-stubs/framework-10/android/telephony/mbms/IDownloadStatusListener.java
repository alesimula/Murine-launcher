package android.telephony.mbms;

public interface IDownloadStatusListener extends android.os.IInterface {
    public void onStatusUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IDownloadStatusListener {
        private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IDownloadStatusListener";
        static final int TRANSACTION_onStatusUpdated = 1;
        public Stub() { super(); }
        public static android.telephony.mbms.IDownloadStatusListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.mbms.IDownloadStatusListener p0) { return false; }
        public static android.telephony.mbms.IDownloadStatusListener getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.mbms.IDownloadStatusListener {
            private android.os.IBinder mRemote;
            public static android.telephony.mbms.IDownloadStatusListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.mbms.IDownloadStatusListener {
        public Default() {}
        public void onStatusUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

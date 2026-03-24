package android.telephony.mbms;

public interface IDownloadProgressListener extends android.os.IInterface {
    public void onProgressUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException;

    public static class Default implements android.telephony.mbms.IDownloadProgressListener {
        public Default() {}
        public void onProgressUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IDownloadProgressListener {
        public static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IDownloadProgressListener";
        static final int TRANSACTION_onProgressUpdated = 1;
        public Stub() { super(); }
        public static android.telephony.mbms.IDownloadProgressListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.mbms.IDownloadProgressListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onProgressUpdated(android.telephony.mbms.DownloadRequest p0, android.telephony.mbms.FileInfo p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        }
    }
}

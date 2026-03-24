package android.telephony.mbms;

public interface IMbmsDownloadSessionCallback extends android.os.IInterface {
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> p0) throws android.os.RemoteException;
    public void onMiddlewareReady() throws android.os.RemoteException;

    public static class Default implements android.telephony.mbms.IMbmsDownloadSessionCallback {
        public Default() {}
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> p0) throws android.os.RemoteException {}
        public void onMiddlewareReady() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IMbmsDownloadSessionCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IMbmsDownloadSessionCallback";
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onFileServicesUpdated = 2;
        static final int TRANSACTION_onMiddlewareReady = 3;
        public Stub() { super(); }
        public static android.telephony.mbms.IMbmsDownloadSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.mbms.IMbmsDownloadSessionCallback p0) { return false; }
        public static android.telephony.mbms.IMbmsDownloadSessionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.mbms.IMbmsDownloadSessionCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.mbms.IMbmsDownloadSessionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> p0) throws android.os.RemoteException {}
            public void onMiddlewareReady() throws android.os.RemoteException {}
        }
    }
}

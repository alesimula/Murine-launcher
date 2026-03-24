package android.telephony.mbms;

public interface IMbmsStreamingSessionCallback extends android.os.IInterface {
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> p0) throws android.os.RemoteException;
    public void onMiddlewareReady() throws android.os.RemoteException;

    public static class Default implements android.telephony.mbms.IMbmsStreamingSessionCallback {
        public Default() {}
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> p0) throws android.os.RemoteException {}
        public void onMiddlewareReady() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IMbmsStreamingSessionCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IMbmsStreamingSessionCallback";
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onStreamingServicesUpdated = 2;
        static final int TRANSACTION_onMiddlewareReady = 3;
        public Stub() { super(); }
        public static android.telephony.mbms.IMbmsStreamingSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.mbms.IMbmsStreamingSessionCallback p0) { return false; }
        public static android.telephony.mbms.IMbmsStreamingSessionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.mbms.IMbmsStreamingSessionCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.mbms.IMbmsStreamingSessionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> p0) throws android.os.RemoteException {}
            public void onMiddlewareReady() throws android.os.RemoteException {}
        }
    }
}

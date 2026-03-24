package android.telephony.mbms;

public interface IStreamingServiceCallback extends android.os.IInterface {
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onStreamStateUpdated(int p0, int p1) throws android.os.RemoteException;
    public void onMediaDescriptionUpdated() throws android.os.RemoteException;
    public void onBroadcastSignalStrengthUpdated(int p0) throws android.os.RemoteException;
    public void onStreamMethodUpdated(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.mbms.IStreamingServiceCallback {
        public Default() {}
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onStreamStateUpdated(int p0, int p1) throws android.os.RemoteException {}
        public void onMediaDescriptionUpdated() throws android.os.RemoteException {}
        public void onBroadcastSignalStrengthUpdated(int p0) throws android.os.RemoteException {}
        public void onStreamMethodUpdated(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IStreamingServiceCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IStreamingServiceCallback";
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onStreamStateUpdated = 2;
        static final int TRANSACTION_onMediaDescriptionUpdated = 3;
        static final int TRANSACTION_onBroadcastSignalStrengthUpdated = 4;
        static final int TRANSACTION_onStreamMethodUpdated = 5;
        public Stub() { super(); }
        public static android.telephony.mbms.IStreamingServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.mbms.IStreamingServiceCallback p0) { return false; }
        public static android.telephony.mbms.IStreamingServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.mbms.IStreamingServiceCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.mbms.IStreamingServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onStreamStateUpdated(int p0, int p1) throws android.os.RemoteException {}
            public void onMediaDescriptionUpdated() throws android.os.RemoteException {}
            public void onBroadcastSignalStrengthUpdated(int p0) throws android.os.RemoteException {}
            public void onStreamMethodUpdated(int p0) throws android.os.RemoteException {}
        }
    }
}

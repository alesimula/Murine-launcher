package android.telephony;

public interface INetworkServiceCallback extends android.os.IInterface {
    public void onRequestNetworkRegistrationInfoComplete(int p0, android.telephony.NetworkRegistrationInfo p1) throws android.os.RemoteException;
    public void onNetworkStateChanged() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.INetworkServiceCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.INetworkServiceCallback";
        static final int TRANSACTION_onRequestNetworkRegistrationInfoComplete = 1;
        static final int TRANSACTION_onNetworkStateChanged = 2;
        public Stub() { super(); }
        public static android.telephony.INetworkServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.INetworkServiceCallback p0) { return false; }
        public static android.telephony.INetworkServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.INetworkServiceCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.INetworkServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRequestNetworkRegistrationInfoComplete(int p0, android.telephony.NetworkRegistrationInfo p1) throws android.os.RemoteException {}
            public void onNetworkStateChanged() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.INetworkServiceCallback {
        public Default() {}
        public void onRequestNetworkRegistrationInfoComplete(int p0, android.telephony.NetworkRegistrationInfo p1) throws android.os.RemoteException {}
        public void onNetworkStateChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

package android.location;

public interface IGnssNavigationMessageListener extends android.os.IInterface {
    public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) throws android.os.RemoteException;
    public void onStatusChanged(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.location.IGnssNavigationMessageListener {
        private static final java.lang.String DESCRIPTOR = "android.location.IGnssNavigationMessageListener";
        static final int TRANSACTION_onGnssNavigationMessageReceived = 1;
        static final int TRANSACTION_onStatusChanged = 2;
        public Stub() { super(); }
        public static android.location.IGnssNavigationMessageListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IGnssNavigationMessageListener p0) { return false; }
        public static android.location.IGnssNavigationMessageListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IGnssNavigationMessageListener {
            private android.os.IBinder mRemote;
            public static android.location.IGnssNavigationMessageListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) throws android.os.RemoteException {}
            public void onStatusChanged(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.location.IGnssNavigationMessageListener {
        public Default() {}
        public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) throws android.os.RemoteException {}
        public void onStatusChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

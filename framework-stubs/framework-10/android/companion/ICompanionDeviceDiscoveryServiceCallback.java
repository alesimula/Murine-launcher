package android.companion;

public interface ICompanionDeviceDiscoveryServiceCallback extends android.os.IInterface {
    public void onDeviceSelected(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void onDeviceSelectionCancel() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceDiscoveryServiceCallback {
        private static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceDiscoveryServiceCallback";
        static final int TRANSACTION_onDeviceSelected = 1;
        static final int TRANSACTION_onDeviceSelectionCancel = 2;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceDiscoveryServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.companion.ICompanionDeviceDiscoveryServiceCallback p0) { return false; }
        public static android.companion.ICompanionDeviceDiscoveryServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.companion.ICompanionDeviceDiscoveryServiceCallback {
            private android.os.IBinder mRemote;
            public static android.companion.ICompanionDeviceDiscoveryServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceSelected(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onDeviceSelectionCancel() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.companion.ICompanionDeviceDiscoveryServiceCallback {
        public Default() {}
        public void onDeviceSelected(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onDeviceSelectionCancel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

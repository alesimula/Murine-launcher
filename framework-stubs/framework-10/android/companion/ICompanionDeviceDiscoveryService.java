package android.companion;

public interface ICompanionDeviceDiscoveryService extends android.os.IInterface {
    public void startDiscovery(android.companion.AssociationRequest p0, java.lang.String p1, android.companion.IFindDeviceCallback p2, android.companion.ICompanionDeviceDiscoveryServiceCallback p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceDiscoveryService {
        private static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceDiscoveryService";
        static final int TRANSACTION_startDiscovery = 1;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceDiscoveryService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.companion.ICompanionDeviceDiscoveryService p0) { return false; }
        public static android.companion.ICompanionDeviceDiscoveryService getDefaultImpl() { return null; }

        private static class Proxy implements android.companion.ICompanionDeviceDiscoveryService {
            private android.os.IBinder mRemote;
            public static android.companion.ICompanionDeviceDiscoveryService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startDiscovery(android.companion.AssociationRequest p0, java.lang.String p1, android.companion.IFindDeviceCallback p2, android.companion.ICompanionDeviceDiscoveryServiceCallback p3) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.companion.ICompanionDeviceDiscoveryService {
        public Default() {}
        public void startDiscovery(android.companion.AssociationRequest p0, java.lang.String p1, android.companion.IFindDeviceCallback p2, android.companion.ICompanionDeviceDiscoveryServiceCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

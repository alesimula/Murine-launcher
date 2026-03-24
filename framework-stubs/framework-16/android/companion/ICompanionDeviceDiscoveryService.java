package android.companion;

public interface ICompanionDeviceDiscoveryService extends android.os.IInterface {
    public void startDiscovery(android.companion.AssociationRequest p0, java.lang.String p1, android.companion.IAssociationRequestCallback p2, com.android.internal.infra.AndroidFuture<java.lang.String> p3) throws android.os.RemoteException;
    public void onAssociationCreated() throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionDeviceDiscoveryService {
        public Default() {}
        public void startDiscovery(android.companion.AssociationRequest p0, java.lang.String p1, android.companion.IAssociationRequestCallback p2, com.android.internal.infra.AndroidFuture<java.lang.String> p3) throws android.os.RemoteException {}
        public void onAssociationCreated() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceDiscoveryService {
        public static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceDiscoveryService";
        static final int TRANSACTION_startDiscovery = 1;
        static final int TRANSACTION_onAssociationCreated = 2;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceDiscoveryService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.ICompanionDeviceDiscoveryService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startDiscovery(android.companion.AssociationRequest p0, java.lang.String p1, android.companion.IAssociationRequestCallback p2, com.android.internal.infra.AndroidFuture<java.lang.String> p3) throws android.os.RemoteException {}
            public void onAssociationCreated() throws android.os.RemoteException {}
        }
    }
}

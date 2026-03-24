package android.companion;

public interface ICompanionDeviceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceService";
    public void onDeviceAppeared(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onDeviceDisappeared(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onDispatchMessage(int p0, int p1, byte[] p2) throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionDeviceService {
        public Default() {}
        public void onDeviceAppeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onDeviceDisappeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onDispatchMessage(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceService {
        static final int TRANSACTION_onDeviceAppeared = 1;
        static final int TRANSACTION_onDeviceDisappeared = 2;
        static final int TRANSACTION_onDispatchMessage = 3;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.ICompanionDeviceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceAppeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onDeviceDisappeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onDispatchMessage(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        }
    }
}

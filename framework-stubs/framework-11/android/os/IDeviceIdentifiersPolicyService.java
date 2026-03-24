package android.os;

public interface IDeviceIdentifiersPolicyService extends android.os.IInterface {
    public java.lang.String getSerial() throws android.os.RemoteException;
    public java.lang.String getSerialForPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.os.IDeviceIdentifiersPolicyService {
        public Default() {}
        public java.lang.String getSerial() throws android.os.RemoteException { return null; }
        public java.lang.String getSerialForPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IDeviceIdentifiersPolicyService {
        private static final java.lang.String DESCRIPTOR = "android.os.IDeviceIdentifiersPolicyService";
        static final int TRANSACTION_getSerial = 1;
        static final int TRANSACTION_getSerialForPackage = 2;
        public Stub() { super(); }
        public static android.os.IDeviceIdentifiersPolicyService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IDeviceIdentifiersPolicyService p0) { return false; }
        public static android.os.IDeviceIdentifiersPolicyService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IDeviceIdentifiersPolicyService {
            private android.os.IBinder mRemote;
            public static android.os.IDeviceIdentifiersPolicyService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getSerial() throws android.os.RemoteException { return null; }
            public java.lang.String getSerialForPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        }
    }
}

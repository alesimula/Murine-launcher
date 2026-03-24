package android.security.rkp;

public interface IRemoteProvisioning extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.rkp.IRemoteProvisioning";
    public void getRegistration(java.lang.String p0, android.security.rkp.IGetRegistrationCallback p1) throws android.os.RemoteException;

    public static class Default implements android.security.rkp.IRemoteProvisioning {
        public Default() {}
        public void getRegistration(java.lang.String p0, android.security.rkp.IGetRegistrationCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.rkp.IRemoteProvisioning {
        static final int TRANSACTION_getRegistration = 1;
        public Stub() { super(); }
        public static android.security.rkp.IRemoteProvisioning asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.rkp.IRemoteProvisioning {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getRegistration(java.lang.String p0, android.security.rkp.IGetRegistrationCallback p1) throws android.os.RemoteException {}
        }
    }
}

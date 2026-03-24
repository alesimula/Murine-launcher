package android.security.keymaster;

public interface IKeyAttestationApplicationIdProvider extends android.os.IInterface {
    public android.security.keymaster.KeyAttestationApplicationId getKeyAttestationApplicationId(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.keymaster.IKeyAttestationApplicationIdProvider {
        public Default() {}
        public android.security.keymaster.KeyAttestationApplicationId getKeyAttestationApplicationId(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.keymaster.IKeyAttestationApplicationIdProvider {
        private static final java.lang.String DESCRIPTOR = "android.security.keymaster.IKeyAttestationApplicationIdProvider";
        static final int TRANSACTION_getKeyAttestationApplicationId = 1;
        public Stub() { super(); }
        public static android.security.keymaster.IKeyAttestationApplicationIdProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.keymaster.IKeyAttestationApplicationIdProvider p0) { return false; }
        public static android.security.keymaster.IKeyAttestationApplicationIdProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.security.keymaster.IKeyAttestationApplicationIdProvider {
            private android.os.IBinder mRemote;
            public static android.security.keymaster.IKeyAttestationApplicationIdProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.security.keymaster.KeyAttestationApplicationId getKeyAttestationApplicationId(int p0) throws android.os.RemoteException { return null; }
        }
    }
}

package android.security.metrics;

public interface IKeystoreMetrics extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public android.security.metrics.KeystoreAtom[] pullMetrics(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.metrics.IKeystoreMetrics {
        public Default() {}
        public android.security.metrics.KeystoreAtom[] pullMetrics(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.metrics.IKeystoreMetrics {
        static final int TRANSACTION_pullMetrics = 1;
        public Stub() { super(); }
        public static android.security.metrics.IKeystoreMetrics asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.metrics.IKeystoreMetrics {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.security.metrics.KeystoreAtom[] pullMetrics(int p0) throws android.os.RemoteException { return null; }
        }
    }
}

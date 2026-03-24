package android.app.usage;

public interface ICacheQuotaService extends android.os.IInterface {
    public void computeCacheQuotaHints(android.os.RemoteCallback p0, java.util.List<android.app.usage.CacheQuotaHint> p1) throws android.os.RemoteException;

    public static class Default implements android.app.usage.ICacheQuotaService {
        public Default() {}
        public void computeCacheQuotaHints(android.os.RemoteCallback p0, java.util.List<android.app.usage.CacheQuotaHint> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.usage.ICacheQuotaService {
        private static final java.lang.String DESCRIPTOR = "android.app.usage.ICacheQuotaService";
        static final int TRANSACTION_computeCacheQuotaHints = 1;
        public Stub() { super(); }
        public static android.app.usage.ICacheQuotaService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.usage.ICacheQuotaService p0) { return false; }
        public static android.app.usage.ICacheQuotaService getDefaultImpl() { return null; }

        private static class Proxy implements android.app.usage.ICacheQuotaService {
            private android.os.IBinder mRemote;
            public static android.app.usage.ICacheQuotaService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void computeCacheQuotaHints(android.os.RemoteCallback p0, java.util.List<android.app.usage.CacheQuotaHint> p1) throws android.os.RemoteException {}
        }
    }
}

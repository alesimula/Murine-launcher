package android.service.resolver;

public interface IResolverRankerService extends android.os.IInterface {
    public void predict(java.util.List<android.service.resolver.ResolverTarget> p0, android.service.resolver.IResolverRankerResult p1) throws android.os.RemoteException;
    public void train(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.service.resolver.IResolverRankerService {
        public Default() {}
        public void predict(java.util.List<android.service.resolver.ResolverTarget> p0, android.service.resolver.IResolverRankerResult p1) throws android.os.RemoteException {}
        public void train(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.resolver.IResolverRankerService {
        public static final java.lang.String DESCRIPTOR = "android.service.resolver.IResolverRankerService";
        static final int TRANSACTION_predict = 1;
        static final int TRANSACTION_train = 2;
        public Stub() { super(); }
        public static android.service.resolver.IResolverRankerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.resolver.IResolverRankerService p0) { return false; }
        public static android.service.resolver.IResolverRankerService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.resolver.IResolverRankerService {
            private android.os.IBinder mRemote;
            public static android.service.resolver.IResolverRankerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void predict(java.util.List<android.service.resolver.ResolverTarget> p0, android.service.resolver.IResolverRankerResult p1) throws android.os.RemoteException {}
            public void train(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) throws android.os.RemoteException {}
        }
    }
}

package android.service.rotationresolver;

public interface IRotationResolverCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.rotationresolver.IRotationResolverCallback";
    public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException;
    public void onSuccess(int p0) throws android.os.RemoteException;
    public void onFailure(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.rotationresolver.IRotationResolverCallback {
        public Default() {}
        public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        public void onSuccess(int p0) throws android.os.RemoteException {}
        public void onFailure(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.rotationresolver.IRotationResolverCallback {
        static final int TRANSACTION_onCancellable = 1;
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onFailure = 3;
        public Stub() { super(); }
        public static android.service.rotationresolver.IRotationResolverCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.rotationresolver.IRotationResolverCallback p0) { return false; }
        public static android.service.rotationresolver.IRotationResolverCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.rotationresolver.IRotationResolverCallback {
            private android.os.IBinder mRemote;
            public static android.service.rotationresolver.IRotationResolverCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
            public void onSuccess(int p0) throws android.os.RemoteException {}
            public void onFailure(int p0) throws android.os.RemoteException {}
        }
    }
}

package android.service.autofill;

public interface ISurfacePackageResultCallback extends android.os.IInterface {
    public void onResult(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.ISurfacePackageResultCallback {
        public Default() {}
        public void onResult(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.ISurfacePackageResultCallback {
        private static final java.lang.String DESCRIPTOR = "android.service.autofill.ISurfacePackageResultCallback";
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.service.autofill.ISurfacePackageResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.ISurfacePackageResultCallback p0) { return false; }
        public static android.service.autofill.ISurfacePackageResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.ISurfacePackageResultCallback {
            private android.os.IBinder mRemote;
            public static android.service.autofill.ISurfacePackageResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
        }
    }
}

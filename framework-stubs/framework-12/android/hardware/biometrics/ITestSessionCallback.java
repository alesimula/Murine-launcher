package android.hardware.biometrics;

public interface ITestSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.ITestSessionCallback";
    public void onCleanupStarted(int p0) throws android.os.RemoteException;
    public void onCleanupFinished(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.ITestSessionCallback {
        public Default() {}
        public void onCleanupStarted(int p0) throws android.os.RemoteException {}
        public void onCleanupFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.ITestSessionCallback {
        static final int TRANSACTION_onCleanupStarted = 1;
        static final int TRANSACTION_onCleanupFinished = 2;
        public Stub() { super(); }
        public static android.hardware.biometrics.ITestSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.ITestSessionCallback p0) { return false; }
        public static android.hardware.biometrics.ITestSessionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.ITestSessionCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.ITestSessionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCleanupStarted(int p0) throws android.os.RemoteException {}
            public void onCleanupFinished(int p0) throws android.os.RemoteException {}
        }
    }
}

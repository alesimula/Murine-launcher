package android.hardware.camera2;

public interface ICameraInjectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraInjectionCallback";
    public static final int ERROR_INJECTION_INVALID_ERROR = -1;
    public static final int ERROR_INJECTION_SESSION = 0;
    public static final int ERROR_INJECTION_SERVICE = 1;
    public static final int ERROR_INJECTION_UNSUPPORTED = 2;
    public void onInjectionError(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.ICameraInjectionCallback {
        public Default() {}
        public void onInjectionError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraInjectionCallback {
        static final int TRANSACTION_onInjectionError = 1;
        public Stub() { super(); }
        public static android.hardware.camera2.ICameraInjectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.ICameraInjectionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInjectionError(int p0) throws android.os.RemoteException {}
        }
    }
}

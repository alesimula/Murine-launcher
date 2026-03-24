package android.hardware.biometrics;

public interface IBiometricContextListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricContextListener";
    public void onFoldChanged(int p0) throws android.os.RemoteException;
    public void onDisplayStateChanged(int p0) throws android.os.RemoteException;
    public void onHardwareIgnoreTouchesChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricContextListener {
        public Default() {}
        public void onFoldChanged(int p0) throws android.os.RemoteException {}
        public void onDisplayStateChanged(int p0) throws android.os.RemoteException {}
        public void onHardwareIgnoreTouchesChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface FoldState {
        public static final int UNKNOWN = 0;
        public static final int HALF_OPENED = 1;
        public static final int FULLY_OPENED = 2;
        public static final int FULLY_CLOSED = 3;
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricContextListener {
        static final int TRANSACTION_onFoldChanged = 1;
        static final int TRANSACTION_onDisplayStateChanged = 2;
        static final int TRANSACTION_onHardwareIgnoreTouchesChanged = 3;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricContextListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.IBiometricContextListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFoldChanged(int p0) throws android.os.RemoteException {}
            public void onDisplayStateChanged(int p0) throws android.os.RemoteException {}
            public void onHardwareIgnoreTouchesChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}

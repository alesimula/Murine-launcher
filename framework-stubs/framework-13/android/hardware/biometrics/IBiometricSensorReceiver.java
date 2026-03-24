package android.hardware.biometrics;

public interface IBiometricSensorReceiver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricSensorReceiver";
    public void onAuthenticationSucceeded(int p0, byte[] p1) throws android.os.RemoteException;
    public void onAuthenticationFailed(int p0) throws android.os.RemoteException;
    public void onError(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onAcquired(int p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricSensorReceiver {
        public Default() {}
        public void onAuthenticationSucceeded(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onAuthenticationFailed(int p0) throws android.os.RemoteException {}
        public void onError(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onAcquired(int p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricSensorReceiver {
        static final int TRANSACTION_onAuthenticationSucceeded = 1;
        static final int TRANSACTION_onAuthenticationFailed = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onAcquired = 4;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricSensorReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.IBiometricSensorReceiver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAuthenticationSucceeded(int p0, byte[] p1) throws android.os.RemoteException {}
            public void onAuthenticationFailed(int p0) throws android.os.RemoteException {}
            public void onError(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onAcquired(int p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}

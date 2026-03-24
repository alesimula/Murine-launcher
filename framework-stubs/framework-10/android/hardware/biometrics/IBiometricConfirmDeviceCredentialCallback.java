package android.hardware.biometrics;

public interface IBiometricConfirmDeviceCredentialCallback extends android.os.IInterface {
    public void cancel() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback {
        private static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback";
        static final int TRANSACTION_cancel = 1;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback p0) { return false; }
        public static android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void cancel() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback {
        public Default() {}
        public void cancel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

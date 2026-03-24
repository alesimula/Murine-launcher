package android.hardware.biometrics;

public interface IBiometricSysuiReceiver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricSysuiReceiver";
    public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException;
    public void onTryAgainPressed() throws android.os.RemoteException;
    public void onDeviceCredentialPressed() throws android.os.RemoteException;
    public void onSystemEvent(int p0) throws android.os.RemoteException;
    public void onDialogAnimatedIn(boolean p0) throws android.os.RemoteException;
    public void onStartFingerprintNow() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricSysuiReceiver {
        public Default() {}
        public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onTryAgainPressed() throws android.os.RemoteException {}
        public void onDeviceCredentialPressed() throws android.os.RemoteException {}
        public void onSystemEvent(int p0) throws android.os.RemoteException {}
        public void onDialogAnimatedIn(boolean p0) throws android.os.RemoteException {}
        public void onStartFingerprintNow() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricSysuiReceiver {
        static final int TRANSACTION_onDialogDismissed = 1;
        static final int TRANSACTION_onTryAgainPressed = 2;
        static final int TRANSACTION_onDeviceCredentialPressed = 3;
        static final int TRANSACTION_onSystemEvent = 4;
        static final int TRANSACTION_onDialogAnimatedIn = 5;
        static final int TRANSACTION_onStartFingerprintNow = 6;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricSysuiReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.IBiometricSysuiReceiver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException {}
            public void onTryAgainPressed() throws android.os.RemoteException {}
            public void onDeviceCredentialPressed() throws android.os.RemoteException {}
            public void onSystemEvent(int p0) throws android.os.RemoteException {}
            public void onDialogAnimatedIn(boolean p0) throws android.os.RemoteException {}
            public void onStartFingerprintNow() throws android.os.RemoteException {}
        }
    }
}

package android.hardware.biometrics;

public interface IBiometricServiceReceiverInternal extends android.os.IInterface {
    public void onAuthenticationSucceeded(boolean p0, byte[] p1, boolean p2) throws android.os.RemoteException;
    public void onAuthenticationFailed() throws android.os.RemoteException;
    public void onError(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onAcquired(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException;
    public void onTryAgainPressed() throws android.os.RemoteException;
    public void onDeviceCredentialPressed() throws android.os.RemoteException;
    public void onSystemEvent(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricServiceReceiverInternal {
        public Default() {}
        public void onAuthenticationSucceeded(boolean p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
        public void onAuthenticationFailed() throws android.os.RemoteException {}
        public void onError(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onAcquired(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onTryAgainPressed() throws android.os.RemoteException {}
        public void onDeviceCredentialPressed() throws android.os.RemoteException {}
        public void onSystemEvent(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricServiceReceiverInternal {
        private static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricServiceReceiverInternal";
        static final int TRANSACTION_onAuthenticationSucceeded = 1;
        static final int TRANSACTION_onAuthenticationFailed = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onAcquired = 4;
        static final int TRANSACTION_onDialogDismissed = 5;
        static final int TRANSACTION_onTryAgainPressed = 6;
        static final int TRANSACTION_onDeviceCredentialPressed = 7;
        static final int TRANSACTION_onSystemEvent = 8;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricServiceReceiverInternal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.IBiometricServiceReceiverInternal p0) { return false; }
        public static android.hardware.biometrics.IBiometricServiceReceiverInternal getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.IBiometricServiceReceiverInternal {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.IBiometricServiceReceiverInternal sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAuthenticationSucceeded(boolean p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
            public void onAuthenticationFailed() throws android.os.RemoteException {}
            public void onError(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onAcquired(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException {}
            public void onTryAgainPressed() throws android.os.RemoteException {}
            public void onDeviceCredentialPressed() throws android.os.RemoteException {}
            public void onSystemEvent(int p0) throws android.os.RemoteException {}
        }
    }
}

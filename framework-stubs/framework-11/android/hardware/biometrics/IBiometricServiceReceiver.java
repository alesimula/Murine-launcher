package android.hardware.biometrics;

public interface IBiometricServiceReceiver extends android.os.IInterface {
    public void onAuthenticationSucceeded(int p0) throws android.os.RemoteException;
    public void onAuthenticationFailed() throws android.os.RemoteException;
    public void onError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onAcquired(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onDialogDismissed(int p0) throws android.os.RemoteException;
    public void onSystemEvent(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricServiceReceiver {
        public Default() {}
        public void onAuthenticationSucceeded(int p0) throws android.os.RemoteException {}
        public void onAuthenticationFailed() throws android.os.RemoteException {}
        public void onError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onAcquired(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onDialogDismissed(int p0) throws android.os.RemoteException {}
        public void onSystemEvent(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricServiceReceiver {
        private static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricServiceReceiver";
        static final int TRANSACTION_onAuthenticationSucceeded = 1;
        static final int TRANSACTION_onAuthenticationFailed = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onAcquired = 4;
        static final int TRANSACTION_onDialogDismissed = 5;
        static final int TRANSACTION_onSystemEvent = 6;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricServiceReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.IBiometricServiceReceiver p0) { return false; }
        public static android.hardware.biometrics.IBiometricServiceReceiver getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.IBiometricServiceReceiver {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.IBiometricServiceReceiver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAuthenticationSucceeded(int p0) throws android.os.RemoteException {}
            public void onAuthenticationFailed() throws android.os.RemoteException {}
            public void onError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onAcquired(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onDialogDismissed(int p0) throws android.os.RemoteException {}
            public void onSystemEvent(int p0) throws android.os.RemoteException {}
        }
    }
}

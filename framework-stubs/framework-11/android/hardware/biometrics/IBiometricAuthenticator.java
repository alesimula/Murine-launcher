package android.hardware.biometrics;

public interface IBiometricAuthenticator extends android.os.IInterface {
    public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricServiceReceiverInternal p4, java.lang.String p5, int p6, int p7, int p8, int p9) throws android.os.RemoteException;
    public void startPreparedClient(int p0) throws android.os.RemoteException;
    public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException;
    public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasEnrolledTemplates(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void resetLockout(byte[] p0) throws android.os.RemoteException;
    public void setActiveUser(int p0) throws android.os.RemoteException;
    public long getAuthenticatorId(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricAuthenticator {
        public Default() {}
        public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricServiceReceiverInternal p4, java.lang.String p5, int p6, int p7, int p8, int p9) throws android.os.RemoteException {}
        public void startPreparedClient(int p0) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException {}
        public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean hasEnrolledTemplates(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void resetLockout(byte[] p0) throws android.os.RemoteException {}
        public void setActiveUser(int p0) throws android.os.RemoteException {}
        public long getAuthenticatorId(int p0) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricAuthenticator {
        private static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricAuthenticator";
        static final int TRANSACTION_prepareForAuthentication = 1;
        static final int TRANSACTION_startPreparedClient = 2;
        static final int TRANSACTION_cancelAuthenticationFromService = 3;
        static final int TRANSACTION_isHardwareDetected = 4;
        static final int TRANSACTION_hasEnrolledTemplates = 5;
        static final int TRANSACTION_resetLockout = 6;
        static final int TRANSACTION_setActiveUser = 7;
        static final int TRANSACTION_getAuthenticatorId = 8;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricAuthenticator asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.IBiometricAuthenticator p0) { return false; }
        public static android.hardware.biometrics.IBiometricAuthenticator getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.IBiometricAuthenticator {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.IBiometricAuthenticator sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricServiceReceiverInternal p4, java.lang.String p5, int p6, int p7, int p8, int p9) throws android.os.RemoteException {}
            public void startPreparedClient(int p0) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException {}
            public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean hasEnrolledTemplates(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void resetLockout(byte[] p0) throws android.os.RemoteException {}
            public void setActiveUser(int p0) throws android.os.RemoteException {}
            public long getAuthenticatorId(int p0) throws android.os.RemoteException { return 0L; }
        }
    }
}

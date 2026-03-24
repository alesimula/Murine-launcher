package android.hardware.biometrics;

public interface IBiometricService extends android.os.IInterface {
    public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.os.Bundle p5, int p6, int p7, int p8) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException;
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0, int p1) throws android.os.RemoteException;
    public void setActiveUser(int p0) throws android.os.RemoteException;
    public void onReadyForAuthentication(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void resetLockout(byte[] p0) throws android.os.RemoteException;
    public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricService {
        public Default() {}
        public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.os.Bundle p5, int p6, int p7, int p8) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException {}
        public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0, int p1) throws android.os.RemoteException {}
        public void setActiveUser(int p0) throws android.os.RemoteException {}
        public void onReadyForAuthentication(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void resetLockout(byte[] p0) throws android.os.RemoteException {}
        public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricService";
        static final int TRANSACTION_authenticate = 1;
        static final int TRANSACTION_cancelAuthentication = 2;
        static final int TRANSACTION_canAuthenticate = 3;
        static final int TRANSACTION_hasEnrolledBiometrics = 4;
        static final int TRANSACTION_registerAuthenticator = 5;
        static final int TRANSACTION_registerEnabledOnKeyguardCallback = 6;
        static final int TRANSACTION_setActiveUser = 7;
        static final int TRANSACTION_onReadyForAuthentication = 8;
        static final int TRANSACTION_resetLockout = 9;
        static final int TRANSACTION_getAuthenticatorIds = 10;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.IBiometricService p0) { return false; }
        public static android.hardware.biometrics.IBiometricService getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.IBiometricService {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.IBiometricService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.os.Bundle p5, int p6, int p7, int p8) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException {}
            public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0, int p1) throws android.os.RemoteException {}
            public void setActiveUser(int p0) throws android.os.RemoteException {}
            public void onReadyForAuthentication(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void resetLockout(byte[] p0) throws android.os.RemoteException {}
            public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        }
    }
}

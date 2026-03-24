package android.hardware.biometrics;

public interface IAuthService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IAuthService";
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getUiPackage() throws android.os.RemoteException;
    public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public int canAuthenticate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException;
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException;
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException;
    public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IAuthService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getUiPackage() throws android.os.RemoteException { return null; }
        public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public int canAuthenticate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
        public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
        public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IAuthService {
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_getSensorProperties = 2;
        static final int TRANSACTION_getUiPackage = 3;
        static final int TRANSACTION_authenticate = 4;
        static final int TRANSACTION_cancelAuthentication = 5;
        static final int TRANSACTION_canAuthenticate = 6;
        static final int TRANSACTION_hasEnrolledBiometrics = 7;
        static final int TRANSACTION_registerEnabledOnKeyguardCallback = 8;
        static final int TRANSACTION_invalidateAuthenticatorIds = 9;
        static final int TRANSACTION_getAuthenticatorIds = 10;
        static final int TRANSACTION_resetLockoutTimeBound = 11;
        static final int TRANSACTION_getButtonLabel = 12;
        static final int TRANSACTION_getPromptMessage = 13;
        static final int TRANSACTION_getSettingName = 14;
        public Stub() { super(); }
        public static android.hardware.biometrics.IAuthService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.IAuthService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getUiPackage() throws android.os.RemoteException { return null; }
            public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public int canAuthenticate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
            public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
            public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
            public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        }
    }
}

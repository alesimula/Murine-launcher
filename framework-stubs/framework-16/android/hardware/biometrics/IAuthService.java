package android.hardware.biometrics;

public interface IAuthService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IAuthService";
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public java.lang.String getUiPackage() throws android.os.RemoteException;
    public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public int canAuthenticate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException;
    public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> getEnrollmentStatusList(java.lang.String p0) throws android.os.RemoteException;
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException;
    public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException;
    public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException;
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException;
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException;
    public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException;
    public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IAuthService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
        public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getUiPackage() throws android.os.RemoteException { return null; }
        public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public int canAuthenticate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> getEnrollmentStatusList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
        public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
        public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
        public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
        public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IAuthService {
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_setIdentityCheckTestStatus = 2;
        static final int TRANSACTION_getSensorProperties = 3;
        static final int TRANSACTION_getUiPackage = 4;
        static final int TRANSACTION_authenticate = 5;
        static final int TRANSACTION_cancelAuthentication = 6;
        static final int TRANSACTION_canAuthenticate = 7;
        static final int TRANSACTION_getLastAuthenticationTime = 8;
        static final int TRANSACTION_hasEnrolledBiometrics = 9;
        static final int TRANSACTION_getEnrollmentStatusList = 10;
        static final int TRANSACTION_registerEnabledOnKeyguardCallback = 11;
        static final int TRANSACTION_registerAuthenticationStateListener = 12;
        static final int TRANSACTION_unregisterAuthenticationStateListener = 13;
        static final int TRANSACTION_invalidateAuthenticatorIds = 14;
        static final int TRANSACTION_getAuthenticatorIds = 15;
        static final int TRANSACTION_resetLockoutTimeBound = 16;
        static final int TRANSACTION_resetLockout = 17;
        static final int TRANSACTION_getButtonLabel = 18;
        static final int TRANSACTION_getPromptMessage = 19;
        static final int TRANSACTION_getSettingName = 20;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.biometrics.IAuthService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void createTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void setIdentityCheckTestStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorProperties_enforcePermission() throws java.lang.SecurityException {}
        protected void getUiPackage_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.IAuthService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
            public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getUiPackage() throws android.os.RemoteException { return null; }
            public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public int canAuthenticate(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> getEnrollmentStatusList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
            public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
            public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
            public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
            public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
            public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        }
    }
}

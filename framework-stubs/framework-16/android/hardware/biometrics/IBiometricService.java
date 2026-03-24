package android.hardware.biometrics;

public interface IBiometricService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricService";
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onReadyForAuthentication(long p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getCurrentStrength(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getCurrentModality(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getSupportedModalities(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
        public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException {}
        public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
        public void onReadyForAuthentication(long p0, int p1) throws android.os.RemoteException {}
        public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
        public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
        public int getCurrentStrength(int p0) throws android.os.RemoteException { return 0; }
        public int getCurrentModality(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public int getSupportedModalities(int p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricService {
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_setIdentityCheckTestStatus = 2;
        static final int TRANSACTION_getSensorProperties = 3;
        static final int TRANSACTION_authenticate = 4;
        static final int TRANSACTION_cancelAuthentication = 5;
        static final int TRANSACTION_canAuthenticate = 6;
        static final int TRANSACTION_getLastAuthenticationTime = 7;
        static final int TRANSACTION_hasEnrolledBiometrics = 8;
        static final int TRANSACTION_registerAuthenticator = 9;
        static final int TRANSACTION_registerEnabledOnKeyguardCallback = 10;
        static final int TRANSACTION_onReadyForAuthentication = 11;
        static final int TRANSACTION_invalidateAuthenticatorIds = 12;
        static final int TRANSACTION_getAuthenticatorIds = 13;
        static final int TRANSACTION_resetLockoutTimeBound = 14;
        static final int TRANSACTION_resetLockout = 15;
        static final int TRANSACTION_getCurrentStrength = 16;
        static final int TRANSACTION_getCurrentModality = 17;
        static final int TRANSACTION_getSupportedModalities = 18;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void createTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void setIdentityCheckTestStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorProperties_enforcePermission() throws java.lang.SecurityException {}
        protected void authenticate_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void canAuthenticate_enforcePermission() throws java.lang.SecurityException {}
        protected void getLastAuthenticationTime_enforcePermission() throws java.lang.SecurityException {}
        protected void hasEnrolledBiometrics_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAuthenticator_enforcePermission() throws java.lang.SecurityException {}
        protected void registerEnabledOnKeyguardCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void onReadyForAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void invalidateAuthenticatorIds_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuthenticatorIds_enforcePermission() throws java.lang.SecurityException {}
        protected void resetLockoutTimeBound_enforcePermission() throws java.lang.SecurityException {}
        protected void resetLockout_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentStrength_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentModality_enforcePermission() throws java.lang.SecurityException {}
        protected void getSupportedModalities_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.IBiometricService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
            public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException {}
            public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
            public void onReadyForAuthentication(long p0, int p1) throws android.os.RemoteException {}
            public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
            public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
            public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
            public int getCurrentStrength(int p0) throws android.os.RemoteException { return 0; }
            public int getCurrentModality(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public int getSupportedModalities(int p0) throws android.os.RemoteException { return 0; }
        }
    }
}

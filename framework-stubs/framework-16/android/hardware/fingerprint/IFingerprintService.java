package android.hardware.fingerprint;

public interface IFingerprintService extends android.os.IInterface {
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public android.hardware.fingerprint.FingerprintSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException;
    public long authenticate(android.os.IBinder p0, long p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, android.hardware.fingerprint.FingerprintAuthenticateOptions p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long detectFingerprint(android.os.IBinder p0, android.hardware.fingerprint.IFingerprintServiceReceiver p1, android.hardware.fingerprint.FingerprintAuthenticateOptions p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void prepareForAuthentication(android.os.IBinder p0, long p1, android.hardware.biometrics.IBiometricSensorReceiver p2, android.hardware.fingerprint.FingerprintAuthenticateOptions p3, long p4, int p5, boolean p6, boolean p7) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void startPreparedClient(int p0, int p1) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, long p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void cancelFingerprintDetect(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2, long p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public long enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4, int p5, android.hardware.fingerprint.FingerprintEnrollOptions p6) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void cancelEnrollment(android.os.IBinder p0, long p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void removeAll(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isHardwareDetectedDeprecated(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException;
    public boolean hasEnrolledFingerprintsDeprecated(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean hasEnrolledFingerprints(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.RESET_FINGERPRINT_LOCKOUT")
    public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public boolean isClientActive() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_FINGERPRINT")
    public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerAuthenticators(android.hardware.fingerprint.FingerprintSensorConfigurations p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerDown(long p0, int p1, android.hardware.biometrics.fingerprint.PointerContext p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerUp(long p0, int p1, android.hardware.biometrics.fingerprint.PointerContext p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onUdfpsUiEvent(int p0, long p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setIgnoreDisplayTouches(long p0, int p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerBiometricStateListener(android.hardware.biometrics.IBiometricStateListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPowerPressed() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void scheduleWatchdog() throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.IFingerprintService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.fingerprint.FingerprintSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public long authenticate(android.os.IBinder p0, long p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, android.hardware.fingerprint.FingerprintAuthenticateOptions p3) throws android.os.RemoteException { return 0L; }
        public long detectFingerprint(android.os.IBinder p0, android.hardware.fingerprint.IFingerprintServiceReceiver p1, android.hardware.fingerprint.FingerprintAuthenticateOptions p2) throws android.os.RemoteException { return 0L; }
        public void prepareForAuthentication(android.os.IBinder p0, long p1, android.hardware.biometrics.IBiometricSensorReceiver p2, android.hardware.fingerprint.FingerprintAuthenticateOptions p3, long p4, int p5, boolean p6, boolean p7) throws android.os.RemoteException {}
        public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        public void cancelFingerprintDetect(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        public long enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4, int p5, android.hardware.fingerprint.FingerprintEnrollOptions p6) throws android.os.RemoteException { return 0L; }
        public void cancelEnrollment(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeAll(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
        public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean isHardwareDetectedDeprecated(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException {}
        public boolean hasEnrolledFingerprintsDeprecated(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean hasEnrolledFingerprints(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException {}
        public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isClientActive() throws android.os.RemoteException { return false; }
        public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        public void registerAuthenticators(android.hardware.fingerprint.FingerprintSensorConfigurations p0) throws android.os.RemoteException {}
        public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException {}
        public void onPointerDown(long p0, int p1, android.hardware.biometrics.fingerprint.PointerContext p2) throws android.os.RemoteException {}
        public void onPointerUp(long p0, int p1, android.hardware.biometrics.fingerprint.PointerContext p2) throws android.os.RemoteException {}
        public void onUdfpsUiEvent(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void setIgnoreDisplayTouches(long p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) throws android.os.RemoteException {}
        public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
        public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
        public void registerBiometricStateListener(android.hardware.biometrics.IBiometricStateListener p0) throws android.os.RemoteException {}
        public void onPowerPressed() throws android.os.RemoteException {}
        public void scheduleWatchdog() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintService {
        public static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintService";
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_dumpSensorServiceStateProto = 2;
        static final int TRANSACTION_getSensorPropertiesInternal = 3;
        static final int TRANSACTION_getSensorProperties = 4;
        static final int TRANSACTION_authenticate = 5;
        static final int TRANSACTION_detectFingerprint = 6;
        static final int TRANSACTION_prepareForAuthentication = 7;
        static final int TRANSACTION_startPreparedClient = 8;
        static final int TRANSACTION_cancelAuthentication = 9;
        static final int TRANSACTION_cancelFingerprintDetect = 10;
        static final int TRANSACTION_cancelAuthenticationFromService = 11;
        static final int TRANSACTION_enroll = 12;
        static final int TRANSACTION_cancelEnrollment = 13;
        static final int TRANSACTION_remove = 14;
        static final int TRANSACTION_removeAll = 15;
        static final int TRANSACTION_rename = 16;
        static final int TRANSACTION_getEnrolledFingerprints = 17;
        static final int TRANSACTION_isHardwareDetectedDeprecated = 18;
        static final int TRANSACTION_isHardwareDetected = 19;
        static final int TRANSACTION_generateChallenge = 20;
        static final int TRANSACTION_revokeChallenge = 21;
        static final int TRANSACTION_hasEnrolledFingerprintsDeprecated = 22;
        static final int TRANSACTION_hasEnrolledFingerprints = 23;
        static final int TRANSACTION_getLockoutModeForUser = 24;
        static final int TRANSACTION_invalidateAuthenticatorId = 25;
        static final int TRANSACTION_getAuthenticatorId = 26;
        static final int TRANSACTION_resetLockout = 27;
        static final int TRANSACTION_addLockoutResetCallback = 28;
        static final int TRANSACTION_isClientActive = 29;
        static final int TRANSACTION_addClientActiveCallback = 30;
        static final int TRANSACTION_removeClientActiveCallback = 31;
        static final int TRANSACTION_registerAuthenticators = 32;
        static final int TRANSACTION_addAuthenticatorsRegisteredCallback = 33;
        static final int TRANSACTION_onPointerDown = 34;
        static final int TRANSACTION_onPointerUp = 35;
        static final int TRANSACTION_onUdfpsUiEvent = 36;
        static final int TRANSACTION_setIgnoreDisplayTouches = 37;
        static final int TRANSACTION_setUdfpsOverlayController = 38;
        static final int TRANSACTION_registerAuthenticationStateListener = 39;
        static final int TRANSACTION_unregisterAuthenticationStateListener = 40;
        static final int TRANSACTION_registerBiometricStateListener = 41;
        static final int TRANSACTION_onPowerPressed = 42;
        static final int TRANSACTION_scheduleWatchdog = 43;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.fingerprint.IFingerprintService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void createTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void dumpSensorServiceStateProto_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorProperties_enforcePermission() throws java.lang.SecurityException {}
        protected void detectFingerprint_enforcePermission() throws java.lang.SecurityException {}
        protected void prepareForAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void startPreparedClient_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelFingerprintDetect_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelAuthenticationFromService_enforcePermission() throws java.lang.SecurityException {}
        protected void enroll_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelEnrollment_enforcePermission() throws java.lang.SecurityException {}
        protected void remove_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAll_enforcePermission() throws java.lang.SecurityException {}
        protected void rename_enforcePermission() throws java.lang.SecurityException {}
        protected void isHardwareDetected_enforcePermission() throws java.lang.SecurityException {}
        protected void generateChallenge_enforcePermission() throws java.lang.SecurityException {}
        protected void revokeChallenge_enforcePermission() throws java.lang.SecurityException {}
        protected void hasEnrolledFingerprints_enforcePermission() throws java.lang.SecurityException {}
        protected void getLockoutModeForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void invalidateAuthenticatorId_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuthenticatorId_enforcePermission() throws java.lang.SecurityException {}
        protected void resetLockout_enforcePermission() throws java.lang.SecurityException {}
        protected void addLockoutResetCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void isClientActive_enforcePermission() throws java.lang.SecurityException {}
        protected void addClientActiveCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void removeClientActiveCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAuthenticators_enforcePermission() throws java.lang.SecurityException {}
        protected void addAuthenticatorsRegisteredCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void onPointerDown_enforcePermission() throws java.lang.SecurityException {}
        protected void onPointerUp_enforcePermission() throws java.lang.SecurityException {}
        protected void onUdfpsUiEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void setIgnoreDisplayTouches_enforcePermission() throws java.lang.SecurityException {}
        protected void setUdfpsOverlayController_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAuthenticationStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterAuthenticationStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerBiometricStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void onPowerPressed_enforcePermission() throws java.lang.SecurityException {}
        protected void scheduleWatchdog_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.fingerprint.IFingerprintService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.fingerprint.FingerprintSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public long authenticate(android.os.IBinder p0, long p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, android.hardware.fingerprint.FingerprintAuthenticateOptions p3) throws android.os.RemoteException { return 0L; }
            public long detectFingerprint(android.os.IBinder p0, android.hardware.fingerprint.IFingerprintServiceReceiver p1, android.hardware.fingerprint.FingerprintAuthenticateOptions p2) throws android.os.RemoteException { return 0L; }
            public void prepareForAuthentication(android.os.IBinder p0, long p1, android.hardware.biometrics.IBiometricSensorReceiver p2, android.hardware.fingerprint.FingerprintAuthenticateOptions p3, long p4, int p5, boolean p6, boolean p7) throws android.os.RemoteException {}
            public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
            public void cancelFingerprintDetect(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
            public long enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4, int p5, android.hardware.fingerprint.FingerprintEnrollOptions p6) throws android.os.RemoteException { return 0L; }
            public void cancelEnrollment(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
            public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeAll(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
            public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean isHardwareDetectedDeprecated(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException {}
            public boolean hasEnrolledFingerprintsDeprecated(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean hasEnrolledFingerprints(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException {}
            public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isClientActive() throws android.os.RemoteException { return false; }
            public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
            public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
            public void registerAuthenticators(android.hardware.fingerprint.FingerprintSensorConfigurations p0) throws android.os.RemoteException {}
            public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException {}
            public void onPointerDown(long p0, int p1, android.hardware.biometrics.fingerprint.PointerContext p2) throws android.os.RemoteException {}
            public void onPointerUp(long p0, int p1, android.hardware.biometrics.fingerprint.PointerContext p2) throws android.os.RemoteException {}
            public void onUdfpsUiEvent(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void setIgnoreDisplayTouches(long p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) throws android.os.RemoteException {}
            public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
            public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
            public void registerBiometricStateListener(android.hardware.biometrics.IBiometricStateListener p0) throws android.os.RemoteException {}
            public void onPowerPressed() throws android.os.RemoteException {}
            public void scheduleWatchdog() throws android.os.RemoteException {}
        }
    }
}

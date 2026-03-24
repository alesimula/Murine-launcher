package android.hardware.fingerprint;

public interface IFingerprintService extends android.os.IInterface {
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.fingerprint.FingerprintSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void authenticate(android.os.IBinder p0, long p1, int p2, int p3, android.hardware.fingerprint.IFingerprintServiceReceiver p4, java.lang.String p5) throws android.os.RemoteException;
    public void detectFingerprint(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    public void prepareForAuthentication(int p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricSensorReceiver p4, java.lang.String p5, int p6, boolean p7) throws android.os.RemoteException;
    public void startPreparedClient(int p0, int p1) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelFingerprintDetect(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException;
    public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeAll(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isHardwareDetectedDeprecated(java.lang.String p0) throws android.os.RemoteException;
    public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException;
    public boolean hasEnrolledFingerprintsDeprecated(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasEnrolledFingerprints(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean hasEnrolledTemplatesForAnySensor(int p0, java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p1, java.lang.String p2) throws android.os.RemoteException;
    public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException;
    public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException;
    public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException;
    public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isClientActive() throws android.os.RemoteException;
    public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException;
    public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException;
    public void registerAuthenticators(java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p0) throws android.os.RemoteException;
    public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException;
    public void onPointerDown(int p0, int p1, int p2, float p3, float p4) throws android.os.RemoteException;
    public void onPointerUp(int p0) throws android.os.RemoteException;
    public void onUiReady(int p0) throws android.os.RemoteException;
    public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) throws android.os.RemoteException;
    public void setSidefpsController(android.hardware.fingerprint.ISidefpsController p0) throws android.os.RemoteException;
    public void registerFingerprintStateListener(android.hardware.fingerprint.IFingerprintStateListener p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.IFingerprintService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.fingerprint.FingerprintSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void authenticate(android.os.IBinder p0, long p1, int p2, int p3, android.hardware.fingerprint.IFingerprintServiceReceiver p4, java.lang.String p5) throws android.os.RemoteException {}
        public void detectFingerprint(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
        public void prepareForAuthentication(int p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricSensorReceiver p4, java.lang.String p5, int p6, boolean p7) throws android.os.RemoteException {}
        public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelFingerprintDetect(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
        public void enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
        public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
        public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeAll(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
        public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isHardwareDetectedDeprecated(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException {}
        public boolean hasEnrolledFingerprintsDeprecated(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasEnrolledFingerprints(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean hasEnrolledTemplatesForAnySensor(int p0, java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException {}
        public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isClientActive() throws android.os.RemoteException { return false; }
        public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        public void registerAuthenticators(java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p0) throws android.os.RemoteException {}
        public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException {}
        public void onPointerDown(int p0, int p1, int p2, float p3, float p4) throws android.os.RemoteException {}
        public void onPointerUp(int p0) throws android.os.RemoteException {}
        public void onUiReady(int p0) throws android.os.RemoteException {}
        public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) throws android.os.RemoteException {}
        public void setSidefpsController(android.hardware.fingerprint.ISidefpsController p0) throws android.os.RemoteException {}
        public void registerFingerprintStateListener(android.hardware.fingerprint.IFingerprintStateListener p0) throws android.os.RemoteException {}
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
        static final int TRANSACTION_hasEnrolledTemplatesForAnySensor = 24;
        static final int TRANSACTION_getLockoutModeForUser = 25;
        static final int TRANSACTION_invalidateAuthenticatorId = 26;
        static final int TRANSACTION_getAuthenticatorId = 27;
        static final int TRANSACTION_resetLockout = 28;
        static final int TRANSACTION_addLockoutResetCallback = 29;
        static final int TRANSACTION_isClientActive = 30;
        static final int TRANSACTION_addClientActiveCallback = 31;
        static final int TRANSACTION_removeClientActiveCallback = 32;
        static final int TRANSACTION_registerAuthenticators = 33;
        static final int TRANSACTION_addAuthenticatorsRegisteredCallback = 34;
        static final int TRANSACTION_onPointerDown = 35;
        static final int TRANSACTION_onPointerUp = 36;
        static final int TRANSACTION_onUiReady = 37;
        static final int TRANSACTION_setUdfpsOverlayController = 38;
        static final int TRANSACTION_setSidefpsController = 39;
        static final int TRANSACTION_registerFingerprintStateListener = 40;
        public Stub() { super(); }
        public static android.hardware.fingerprint.IFingerprintService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.fingerprint.IFingerprintService p0) { return false; }
        public static android.hardware.fingerprint.IFingerprintService getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.fingerprint.IFingerprintService {
            private android.os.IBinder mRemote;
            public static android.hardware.fingerprint.IFingerprintService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.fingerprint.FingerprintSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void authenticate(android.os.IBinder p0, long p1, int p2, int p3, android.hardware.fingerprint.IFingerprintServiceReceiver p4, java.lang.String p5) throws android.os.RemoteException {}
            public void detectFingerprint(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
            public void prepareForAuthentication(int p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricSensorReceiver p4, java.lang.String p5, int p6, boolean p7) throws android.os.RemoteException {}
            public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cancelFingerprintDetect(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
            public void enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
            public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
            public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeAll(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
            public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isHardwareDetectedDeprecated(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException {}
            public boolean hasEnrolledFingerprintsDeprecated(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasEnrolledFingerprints(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean hasEnrolledTemplatesForAnySensor(int p0, java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException {}
            public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isClientActive() throws android.os.RemoteException { return false; }
            public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
            public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
            public void registerAuthenticators(java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p0) throws android.os.RemoteException {}
            public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException {}
            public void onPointerDown(int p0, int p1, int p2, float p3, float p4) throws android.os.RemoteException {}
            public void onPointerUp(int p0) throws android.os.RemoteException {}
            public void onUiReady(int p0) throws android.os.RemoteException {}
            public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) throws android.os.RemoteException {}
            public void setSidefpsController(android.hardware.fingerprint.ISidefpsController p0) throws android.os.RemoteException {}
            public void registerFingerprintStateListener(android.hardware.fingerprint.IFingerprintStateListener p0) throws android.os.RemoteException {}
        }
    }
}

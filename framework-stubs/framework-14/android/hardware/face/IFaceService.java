package android.hardware.face;

public interface IFaceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.face.IFaceService";
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public android.hardware.face.FaceSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long authenticate(android.os.IBinder p0, long p1, android.hardware.face.IFaceServiceReceiver p2, android.hardware.face.FaceAuthenticateOptions p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long detectFace(android.os.IBinder p0, android.hardware.face.IFaceServiceReceiver p1, android.hardware.face.FaceAuthenticateOptions p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, android.hardware.biometrics.IBiometricSensorReceiver p3, android.hardware.face.FaceAuthenticateOptions p4, long p5, int p6, boolean p7) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void startPreparedClient(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void cancelFaceDetect(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2, long p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public long enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5, android.view.Surface p6, boolean p7) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public long enrollRemotely(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void cancelEnrollment(android.os.IBinder p0, long p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void removeAll(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean hasEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setFeature(android.os.IBinder p0, int p1, int p2, boolean p3, byte[] p4, android.hardware.face.IFaceServiceReceiver p5, java.lang.String p6) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_BIOMETRIC")
    public void getFeature(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerAuthenticators(java.util.List<android.hardware.face.FaceSensorPropertiesInternal> p0) throws android.os.RemoteException;
    public void addAuthenticatorsRegisteredCallback(android.hardware.face.IFaceAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException;
    public void registerBiometricStateListener(android.hardware.biometrics.IBiometricStateListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void scheduleWatchdog() throws android.os.RemoteException;

    public static class Default implements android.hardware.face.IFaceService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.face.FaceSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public long authenticate(android.os.IBinder p0, long p1, android.hardware.face.IFaceServiceReceiver p2, android.hardware.face.FaceAuthenticateOptions p3) throws android.os.RemoteException { return 0L; }
        public long detectFace(android.os.IBinder p0, android.hardware.face.IFaceServiceReceiver p1, android.hardware.face.FaceAuthenticateOptions p2) throws android.os.RemoteException { return 0L; }
        public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, android.hardware.biometrics.IBiometricSensorReceiver p3, android.hardware.face.FaceAuthenticateOptions p4, long p5, int p6, boolean p7) throws android.os.RemoteException {}
        public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public void cancelFaceDetect(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        public long enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5, android.view.Surface p6, boolean p7) throws android.os.RemoteException { return 0L; }
        public long enrollRemotely(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException { return 0L; }
        public void cancelEnrollment(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeAll(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
        public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException {}
        public boolean hasEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException {}
        public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setFeature(android.os.IBinder p0, int p1, int p2, boolean p3, byte[] p4, android.hardware.face.IFaceServiceReceiver p5, java.lang.String p6) throws android.os.RemoteException {}
        public void getFeature(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void registerAuthenticators(java.util.List<android.hardware.face.FaceSensorPropertiesInternal> p0) throws android.os.RemoteException {}
        public void addAuthenticatorsRegisteredCallback(android.hardware.face.IFaceAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException {}
        public void registerBiometricStateListener(android.hardware.biometrics.IBiometricStateListener p0) throws android.os.RemoteException {}
        public void scheduleWatchdog() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.face.IFaceService {
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_dumpSensorServiceStateProto = 2;
        static final int TRANSACTION_getSensorPropertiesInternal = 3;
        static final int TRANSACTION_getSensorProperties = 4;
        static final int TRANSACTION_authenticate = 5;
        static final int TRANSACTION_detectFace = 6;
        static final int TRANSACTION_prepareForAuthentication = 7;
        static final int TRANSACTION_startPreparedClient = 8;
        static final int TRANSACTION_cancelAuthentication = 9;
        static final int TRANSACTION_cancelFaceDetect = 10;
        static final int TRANSACTION_cancelAuthenticationFromService = 11;
        static final int TRANSACTION_enroll = 12;
        static final int TRANSACTION_enrollRemotely = 13;
        static final int TRANSACTION_cancelEnrollment = 14;
        static final int TRANSACTION_remove = 15;
        static final int TRANSACTION_removeAll = 16;
        static final int TRANSACTION_getEnrolledFaces = 17;
        static final int TRANSACTION_isHardwareDetected = 18;
        static final int TRANSACTION_generateChallenge = 19;
        static final int TRANSACTION_revokeChallenge = 20;
        static final int TRANSACTION_hasEnrolledFaces = 21;
        static final int TRANSACTION_getLockoutModeForUser = 22;
        static final int TRANSACTION_invalidateAuthenticatorId = 23;
        static final int TRANSACTION_getAuthenticatorId = 24;
        static final int TRANSACTION_resetLockout = 25;
        static final int TRANSACTION_addLockoutResetCallback = 26;
        static final int TRANSACTION_setFeature = 27;
        static final int TRANSACTION_getFeature = 28;
        static final int TRANSACTION_registerAuthenticators = 29;
        static final int TRANSACTION_addAuthenticatorsRegisteredCallback = 30;
        static final int TRANSACTION_registerBiometricStateListener = 31;
        static final int TRANSACTION_scheduleWatchdog = 32;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.face.IFaceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void createTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void dumpSensorServiceStateProto_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorPropertiesInternal_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorProperties_enforcePermission() throws java.lang.SecurityException {}
        protected void authenticate_enforcePermission() throws java.lang.SecurityException {}
        protected void detectFace_enforcePermission() throws java.lang.SecurityException {}
        protected void prepareForAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void startPreparedClient_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelFaceDetect_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelAuthenticationFromService_enforcePermission() throws java.lang.SecurityException {}
        protected void enroll_enforcePermission() throws java.lang.SecurityException {}
        protected void enrollRemotely_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelEnrollment_enforcePermission() throws java.lang.SecurityException {}
        protected void remove_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAll_enforcePermission() throws java.lang.SecurityException {}
        protected void getEnrolledFaces_enforcePermission() throws java.lang.SecurityException {}
        protected void isHardwareDetected_enforcePermission() throws java.lang.SecurityException {}
        protected void generateChallenge_enforcePermission() throws java.lang.SecurityException {}
        protected void revokeChallenge_enforcePermission() throws java.lang.SecurityException {}
        protected void hasEnrolledFaces_enforcePermission() throws java.lang.SecurityException {}
        protected void getLockoutModeForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void invalidateAuthenticatorId_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuthenticatorId_enforcePermission() throws java.lang.SecurityException {}
        protected void resetLockout_enforcePermission() throws java.lang.SecurityException {}
        protected void addLockoutResetCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void setFeature_enforcePermission() throws java.lang.SecurityException {}
        protected void getFeature_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAuthenticators_enforcePermission() throws java.lang.SecurityException {}
        protected void scheduleWatchdog_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.face.IFaceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.face.FaceSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public long authenticate(android.os.IBinder p0, long p1, android.hardware.face.IFaceServiceReceiver p2, android.hardware.face.FaceAuthenticateOptions p3) throws android.os.RemoteException { return 0L; }
            public long detectFace(android.os.IBinder p0, android.hardware.face.IFaceServiceReceiver p1, android.hardware.face.FaceAuthenticateOptions p2) throws android.os.RemoteException { return 0L; }
            public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, android.hardware.biometrics.IBiometricSensorReceiver p3, android.hardware.face.FaceAuthenticateOptions p4, long p5, int p6, boolean p7) throws android.os.RemoteException {}
            public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public void cancelFaceDetect(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
            public long enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5, android.view.Surface p6, boolean p7) throws android.os.RemoteException { return 0L; }
            public long enrollRemotely(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException { return 0L; }
            public void cancelEnrollment(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
            public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeAll(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
            public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException {}
            public boolean hasEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException {}
            public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setFeature(android.os.IBinder p0, int p1, int p2, boolean p3, byte[] p4, android.hardware.face.IFaceServiceReceiver p5, java.lang.String p6) throws android.os.RemoteException {}
            public void getFeature(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void registerAuthenticators(java.util.List<android.hardware.face.FaceSensorPropertiesInternal> p0) throws android.os.RemoteException {}
            public void addAuthenticatorsRegisteredCallback(android.hardware.face.IFaceAuthenticatorsRegisteredCallback p0) throws android.os.RemoteException {}
            public void registerBiometricStateListener(android.hardware.biometrics.IBiometricStateListener p0) throws android.os.RemoteException {}
            public void scheduleWatchdog() throws android.os.RemoteException {}
        }
    }
}

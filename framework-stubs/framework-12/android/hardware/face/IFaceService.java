package android.hardware.face;

public interface IFaceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.face.IFaceService";
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.face.FaceSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, boolean p5) throws android.os.RemoteException;
    public void detectFace(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    public void prepareForAuthentication(int p0, boolean p1, android.os.IBinder p2, long p3, int p4, android.hardware.biometrics.IBiometricSensorReceiver p5, java.lang.String p6, int p7, boolean p8) throws android.os.RemoteException;
    public void startPreparedClient(int p0, int p1) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelFaceDetect(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5, android.view.Surface p6, boolean p7) throws android.os.RemoteException;
    public void enrollRemotely(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException;
    public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException;
    public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeAll(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isHardwareDetected(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void generateChallenge(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    public void revokeChallenge(android.os.IBinder p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException;
    public boolean hasEnrolledFaces(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getLockoutModeForUser(int p0, int p1) throws android.os.RemoteException;
    public void invalidateAuthenticatorId(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    public long getAuthenticatorId(int p0, int p1) throws android.os.RemoteException;
    public void resetLockout(android.os.IBinder p0, int p1, int p2, byte[] p3, java.lang.String p4) throws android.os.RemoteException;
    public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFeature(android.os.IBinder p0, int p1, int p2, boolean p3, byte[] p4, android.hardware.face.IFaceServiceReceiver p5, java.lang.String p6) throws android.os.RemoteException;
    public void getFeature(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    public void registerAuthenticators(java.util.List<android.hardware.face.FaceSensorPropertiesInternal> p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.face.IFaceService {
        public Default() {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.face.FaceSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, boolean p5) throws android.os.RemoteException {}
        public void detectFace(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
        public void prepareForAuthentication(int p0, boolean p1, android.os.IBinder p2, long p3, int p4, android.hardware.biometrics.IBiometricSensorReceiver p5, java.lang.String p6, int p7, boolean p8) throws android.os.RemoteException {}
        public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelFaceDetect(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
        public void enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5, android.view.Surface p6, boolean p7) throws android.os.RemoteException {}
        public void enrollRemotely(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException {}
        public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
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
        public Stub() { super(); }
        public static android.hardware.face.IFaceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.face.IFaceService p0) { return false; }
        public static android.hardware.face.IFaceService getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.face.IFaceService {
            private android.os.IBinder mRemote;
            public static android.hardware.face.IFaceService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public byte[] dumpSensorServiceStateProto(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.face.FaceSensorPropertiesInternal getSensorProperties(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, boolean p5) throws android.os.RemoteException {}
            public void detectFace(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
            public void prepareForAuthentication(int p0, boolean p1, android.os.IBinder p2, long p3, int p4, android.hardware.biometrics.IBiometricSensorReceiver p5, java.lang.String p6, int p7, boolean p8) throws android.os.RemoteException {}
            public void startPreparedClient(int p0, int p1) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cancelFaceDetect(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
            public void enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5, android.view.Surface p6, boolean p7) throws android.os.RemoteException {}
            public void enrollRemotely(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException {}
            public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
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
        }
    }
}

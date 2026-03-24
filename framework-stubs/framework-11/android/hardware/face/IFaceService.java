package android.hardware.face;

public interface IFaceService extends android.os.IInterface {
    public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.face.IFaceServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricServiceReceiverInternal p4, java.lang.String p5, int p6, int p7, int p8, int p9) throws android.os.RemoteException;
    public void startPreparedClient(int p0) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException;
    public void enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException;
    public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException;
    public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException;
    public void rename(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException;
    public long generateChallenge(android.os.IBinder p0) throws android.os.RemoteException;
    public int revokeChallenge(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean hasEnrolledFaces(int p0, java.lang.String p1) throws android.os.RemoteException;
    public long getAuthenticatorId(int p0) throws android.os.RemoteException;
    public void resetLockout(byte[] p0) throws android.os.RemoteException;
    public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0) throws android.os.RemoteException;
    public void setActiveUser(int p0) throws android.os.RemoteException;
    public void enumerate(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2) throws android.os.RemoteException;
    public void setFeature(int p0, int p1, boolean p2, byte[] p3, android.hardware.face.IFaceServiceReceiver p4, java.lang.String p5) throws android.os.RemoteException;
    public void getFeature(int p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException;
    public void userActivity() throws android.os.RemoteException;
    public void initConfiguredStrength(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.face.IFaceService {
        public Default() {}
        public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.face.IFaceServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricServiceReceiverInternal p4, java.lang.String p5, int p6, int p7, int p8, int p9) throws android.os.RemoteException {}
        public void startPreparedClient(int p0) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException {}
        public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
        public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
        public void rename(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException { return false; }
        public long generateChallenge(android.os.IBinder p0) throws android.os.RemoteException { return 0L; }
        public int revokeChallenge(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean hasEnrolledFaces(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public long getAuthenticatorId(int p0) throws android.os.RemoteException { return 0L; }
        public void resetLockout(byte[] p0) throws android.os.RemoteException {}
        public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0) throws android.os.RemoteException {}
        public void setActiveUser(int p0) throws android.os.RemoteException {}
        public void enumerate(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2) throws android.os.RemoteException {}
        public void setFeature(int p0, int p1, boolean p2, byte[] p3, android.hardware.face.IFaceServiceReceiver p4, java.lang.String p5) throws android.os.RemoteException {}
        public void getFeature(int p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
        public void userActivity() throws android.os.RemoteException {}
        public void initConfiguredStrength(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.face.IFaceService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.face.IFaceService";
        static final int TRANSACTION_authenticate = 1;
        static final int TRANSACTION_prepareForAuthentication = 2;
        static final int TRANSACTION_startPreparedClient = 3;
        static final int TRANSACTION_cancelAuthentication = 4;
        static final int TRANSACTION_cancelAuthenticationFromService = 5;
        static final int TRANSACTION_enroll = 6;
        static final int TRANSACTION_cancelEnrollment = 7;
        static final int TRANSACTION_remove = 8;
        static final int TRANSACTION_rename = 9;
        static final int TRANSACTION_getEnrolledFaces = 10;
        static final int TRANSACTION_isHardwareDetected = 11;
        static final int TRANSACTION_generateChallenge = 12;
        static final int TRANSACTION_revokeChallenge = 13;
        static final int TRANSACTION_hasEnrolledFaces = 14;
        static final int TRANSACTION_getAuthenticatorId = 15;
        static final int TRANSACTION_resetLockout = 16;
        static final int TRANSACTION_addLockoutResetCallback = 17;
        static final int TRANSACTION_setActiveUser = 18;
        static final int TRANSACTION_enumerate = 19;
        static final int TRANSACTION_setFeature = 20;
        static final int TRANSACTION_getFeature = 21;
        static final int TRANSACTION_userActivity = 22;
        static final int TRANSACTION_initConfiguredStrength = 23;
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
            public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.face.IFaceServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricServiceReceiverInternal p4, java.lang.String p5, int p6, int p7, int p8, int p9) throws android.os.RemoteException {}
            public void startPreparedClient(int p0) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void enroll(int p0, android.os.IBinder p1, byte[] p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4, int[] p5) throws android.os.RemoteException {}
            public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
            public void remove(android.os.IBinder p0, int p1, int p2, android.hardware.face.IFaceServiceReceiver p3, java.lang.String p4) throws android.os.RemoteException {}
            public void rename(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException { return false; }
            public long generateChallenge(android.os.IBinder p0) throws android.os.RemoteException { return 0L; }
            public int revokeChallenge(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean hasEnrolledFaces(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public long getAuthenticatorId(int p0) throws android.os.RemoteException { return 0L; }
            public void resetLockout(byte[] p0) throws android.os.RemoteException {}
            public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0) throws android.os.RemoteException {}
            public void setActiveUser(int p0) throws android.os.RemoteException {}
            public void enumerate(android.os.IBinder p0, int p1, android.hardware.face.IFaceServiceReceiver p2) throws android.os.RemoteException {}
            public void setFeature(int p0, int p1, boolean p2, byte[] p3, android.hardware.face.IFaceServiceReceiver p4, java.lang.String p5) throws android.os.RemoteException {}
            public void getFeature(int p0, int p1, android.hardware.face.IFaceServiceReceiver p2, java.lang.String p3) throws android.os.RemoteException {}
            public void userActivity() throws android.os.RemoteException {}
            public void initConfiguredStrength(int p0) throws android.os.RemoteException {}
        }
    }
}

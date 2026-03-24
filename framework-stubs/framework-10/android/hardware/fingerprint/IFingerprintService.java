package android.hardware.fingerprint;

public interface IFingerprintService extends android.os.IInterface {
    public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void prepareForAuthentication(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiverInternal p3, java.lang.String p4, int p5, int p6, int p7, int p8) throws android.os.RemoteException;
    public void startPreparedClient(int p0) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException;
    public void enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException;
    public void remove(android.os.IBinder p0, int p1, int p2, int p3, android.hardware.fingerprint.IFingerprintServiceReceiver p4) throws android.os.RemoteException;
    public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isHardwareDetected(long p0, java.lang.String p1) throws android.os.RemoteException;
    public long preEnroll(android.os.IBinder p0) throws android.os.RemoteException;
    public int postEnroll(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean hasEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException;
    public long getAuthenticatorId(java.lang.String p0) throws android.os.RemoteException;
    public void resetTimeout(byte[] p0) throws android.os.RemoteException;
    public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0) throws android.os.RemoteException;
    public void setActiveUser(int p0) throws android.os.RemoteException;
    public void enumerate(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2) throws android.os.RemoteException;
    public boolean isClientActive() throws android.os.RemoteException;
    public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException;
    public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintService";
        static final int TRANSACTION_authenticate = 1;
        static final int TRANSACTION_prepareForAuthentication = 2;
        static final int TRANSACTION_startPreparedClient = 3;
        static final int TRANSACTION_cancelAuthentication = 4;
        static final int TRANSACTION_cancelAuthenticationFromService = 5;
        static final int TRANSACTION_enroll = 6;
        static final int TRANSACTION_cancelEnrollment = 7;
        static final int TRANSACTION_remove = 8;
        static final int TRANSACTION_rename = 9;
        static final int TRANSACTION_getEnrolledFingerprints = 10;
        static final int TRANSACTION_isHardwareDetected = 11;
        static final int TRANSACTION_preEnroll = 12;
        static final int TRANSACTION_postEnroll = 13;
        static final int TRANSACTION_hasEnrolledFingerprints = 14;
        static final int TRANSACTION_getAuthenticatorId = 15;
        static final int TRANSACTION_resetTimeout = 16;
        static final int TRANSACTION_addLockoutResetCallback = 17;
        static final int TRANSACTION_setActiveUser = 18;
        static final int TRANSACTION_enumerate = 19;
        static final int TRANSACTION_isClientActive = 20;
        static final int TRANSACTION_addClientActiveCallback = 21;
        static final int TRANSACTION_removeClientActiveCallback = 22;
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
            public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void prepareForAuthentication(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiverInternal p3, java.lang.String p4, int p5, int p6, int p7, int p8) throws android.os.RemoteException {}
            public void startPreparedClient(int p0) throws android.os.RemoteException {}
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
            public void remove(android.os.IBinder p0, int p1, int p2, int p3, android.hardware.fingerprint.IFingerprintServiceReceiver p4) throws android.os.RemoteException {}
            public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isHardwareDetected(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public long preEnroll(android.os.IBinder p0) throws android.os.RemoteException { return 0L; }
            public int postEnroll(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean hasEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public long getAuthenticatorId(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public void resetTimeout(byte[] p0) throws android.os.RemoteException {}
            public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0) throws android.os.RemoteException {}
            public void setActiveUser(int p0) throws android.os.RemoteException {}
            public void enumerate(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2) throws android.os.RemoteException {}
            public boolean isClientActive() throws android.os.RemoteException { return false; }
            public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
            public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.fingerprint.IFingerprintService {
        public Default() {}
        public void authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void prepareForAuthentication(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiverInternal p3, java.lang.String p4, int p5, int p6, int p7, int p8) throws android.os.RemoteException {}
        public void startPreparedClient(int p0) throws android.os.RemoteException {}
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void enroll(android.os.IBinder p0, byte[] p1, int p2, android.hardware.fingerprint.IFingerprintServiceReceiver p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void cancelEnrollment(android.os.IBinder p0) throws android.os.RemoteException {}
        public void remove(android.os.IBinder p0, int p1, int p2, int p3, android.hardware.fingerprint.IFingerprintServiceReceiver p4) throws android.os.RemoteException {}
        public void rename(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isHardwareDetected(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public long preEnroll(android.os.IBinder p0) throws android.os.RemoteException { return 0L; }
        public int postEnroll(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean hasEnrolledFingerprints(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public long getAuthenticatorId(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public void resetTimeout(byte[] p0) throws android.os.RemoteException {}
        public void addLockoutResetCallback(android.hardware.biometrics.IBiometricServiceLockoutResetCallback p0) throws android.os.RemoteException {}
        public void setActiveUser(int p0) throws android.os.RemoteException {}
        public void enumerate(android.os.IBinder p0, int p1, android.hardware.fingerprint.IFingerprintServiceReceiver p2) throws android.os.RemoteException {}
        public boolean isClientActive() throws android.os.RemoteException { return false; }
        public void addClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        public void removeClientActiveCallback(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

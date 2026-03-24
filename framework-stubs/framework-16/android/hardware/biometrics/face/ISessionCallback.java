package android.hardware.biometrics.face;

public interface ISessionCallback extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "c43fbb9be4a662cc9ace640dba21cccdb84c6c21";
    public static final java.lang.String DESCRIPTOR = null;
    public void onChallengeGenerated(long p0) throws android.os.RemoteException;
    public void onChallengeRevoked(long p0) throws android.os.RemoteException;
    public void onAuthenticationFrame(android.hardware.biometrics.face.AuthenticationFrame p0) throws android.os.RemoteException;
    public void onEnrollmentFrame(android.hardware.biometrics.face.EnrollmentFrame p0) throws android.os.RemoteException;
    public void onError(byte p0, int p1) throws android.os.RemoteException;
    public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException;
    public void onAuthenticationSucceeded(int p0, android.hardware.keymaster.HardwareAuthToken p1) throws android.os.RemoteException;
    public void onAuthenticationFailed() throws android.os.RemoteException;
    public void onLockoutTimed(long p0) throws android.os.RemoteException;
    public void onLockoutPermanent() throws android.os.RemoteException;
    public void onLockoutCleared() throws android.os.RemoteException;
    public void onInteractionDetected() throws android.os.RemoteException;
    public void onEnrollmentsEnumerated(int[] p0) throws android.os.RemoteException;
    public void onFeaturesRetrieved(byte[] p0) throws android.os.RemoteException;
    public void onFeatureSet(byte p0) throws android.os.RemoteException;
    public void onEnrollmentsRemoved(int[] p0) throws android.os.RemoteException;
    public void onAuthenticatorIdRetrieved(long p0) throws android.os.RemoteException;
    public void onAuthenticatorIdInvalidated(long p0) throws android.os.RemoteException;
    public void onSessionClosed() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.face.ISessionCallback {
        public Default() {}
        public void onChallengeGenerated(long p0) throws android.os.RemoteException {}
        public void onChallengeRevoked(long p0) throws android.os.RemoteException {}
        public void onAuthenticationFrame(android.hardware.biometrics.face.AuthenticationFrame p0) throws android.os.RemoteException {}
        public void onEnrollmentFrame(android.hardware.biometrics.face.EnrollmentFrame p0) throws android.os.RemoteException {}
        public void onError(byte p0, int p1) throws android.os.RemoteException {}
        public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException {}
        public void onAuthenticationSucceeded(int p0, android.hardware.keymaster.HardwareAuthToken p1) throws android.os.RemoteException {}
        public void onAuthenticationFailed() throws android.os.RemoteException {}
        public void onLockoutTimed(long p0) throws android.os.RemoteException {}
        public void onLockoutPermanent() throws android.os.RemoteException {}
        public void onLockoutCleared() throws android.os.RemoteException {}
        public void onInteractionDetected() throws android.os.RemoteException {}
        public void onEnrollmentsEnumerated(int[] p0) throws android.os.RemoteException {}
        public void onFeaturesRetrieved(byte[] p0) throws android.os.RemoteException {}
        public void onFeatureSet(byte p0) throws android.os.RemoteException {}
        public void onEnrollmentsRemoved(int[] p0) throws android.os.RemoteException {}
        public void onAuthenticatorIdRetrieved(long p0) throws android.os.RemoteException {}
        public void onAuthenticatorIdInvalidated(long p0) throws android.os.RemoteException {}
        public void onSessionClosed() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.face.ISessionCallback {
        static final int TRANSACTION_onChallengeGenerated = 1;
        static final int TRANSACTION_onChallengeRevoked = 2;
        static final int TRANSACTION_onAuthenticationFrame = 3;
        static final int TRANSACTION_onEnrollmentFrame = 4;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onEnrollmentProgress = 6;
        static final int TRANSACTION_onAuthenticationSucceeded = 7;
        static final int TRANSACTION_onAuthenticationFailed = 8;
        static final int TRANSACTION_onLockoutTimed = 9;
        static final int TRANSACTION_onLockoutPermanent = 10;
        static final int TRANSACTION_onLockoutCleared = 11;
        static final int TRANSACTION_onInteractionDetected = 12;
        static final int TRANSACTION_onEnrollmentsEnumerated = 13;
        static final int TRANSACTION_onFeaturesRetrieved = 14;
        static final int TRANSACTION_onFeatureSet = 15;
        static final int TRANSACTION_onEnrollmentsRemoved = 16;
        static final int TRANSACTION_onAuthenticatorIdRetrieved = 17;
        static final int TRANSACTION_onAuthenticatorIdInvalidated = 18;
        static final int TRANSACTION_onSessionClosed = 19;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.biometrics.face.ISessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.face.ISessionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onChallengeGenerated(long p0) throws android.os.RemoteException {}
            public void onChallengeRevoked(long p0) throws android.os.RemoteException {}
            public void onAuthenticationFrame(android.hardware.biometrics.face.AuthenticationFrame p0) throws android.os.RemoteException {}
            public void onEnrollmentFrame(android.hardware.biometrics.face.EnrollmentFrame p0) throws android.os.RemoteException {}
            public void onError(byte p0, int p1) throws android.os.RemoteException {}
            public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException {}
            public void onAuthenticationSucceeded(int p0, android.hardware.keymaster.HardwareAuthToken p1) throws android.os.RemoteException {}
            public void onAuthenticationFailed() throws android.os.RemoteException {}
            public void onLockoutTimed(long p0) throws android.os.RemoteException {}
            public void onLockoutPermanent() throws android.os.RemoteException {}
            public void onLockoutCleared() throws android.os.RemoteException {}
            public void onInteractionDetected() throws android.os.RemoteException {}
            public void onEnrollmentsEnumerated(int[] p0) throws android.os.RemoteException {}
            public void onFeaturesRetrieved(byte[] p0) throws android.os.RemoteException {}
            public void onFeatureSet(byte p0) throws android.os.RemoteException {}
            public void onEnrollmentsRemoved(int[] p0) throws android.os.RemoteException {}
            public void onAuthenticatorIdRetrieved(long p0) throws android.os.RemoteException {}
            public void onAuthenticatorIdInvalidated(long p0) throws android.os.RemoteException {}
            public void onSessionClosed() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

package android.hardware.biometrics.fingerprint;

public interface ISessionCallback extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "41a730a7a6b5aa9cebebce70ee5b5e509b0af6fb";
    public static final java.lang.String DESCRIPTOR = null;
    public void onChallengeGenerated(long p0) throws android.os.RemoteException;
    public void onChallengeRevoked(long p0) throws android.os.RemoteException;
    public void onAcquired(byte p0, int p1) throws android.os.RemoteException;
    public void onError(byte p0, int p1) throws android.os.RemoteException;
    public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException;
    public void onAuthenticationSucceeded(int p0, android.hardware.keymaster.HardwareAuthToken p1) throws android.os.RemoteException;
    public void onAuthenticationFailed() throws android.os.RemoteException;
    public void onLockoutTimed(long p0) throws android.os.RemoteException;
    public void onLockoutPermanent() throws android.os.RemoteException;
    public void onLockoutCleared() throws android.os.RemoteException;
    public void onInteractionDetected() throws android.os.RemoteException;
    public void onEnrollmentsEnumerated(int[] p0) throws android.os.RemoteException;
    public void onEnrollmentsRemoved(int[] p0) throws android.os.RemoteException;
    public void onAuthenticatorIdRetrieved(long p0) throws android.os.RemoteException;
    public void onAuthenticatorIdInvalidated(long p0) throws android.os.RemoteException;
    public void onSessionClosed() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.fingerprint.ISessionCallback {
        public Default() {}
        public void onChallengeGenerated(long p0) throws android.os.RemoteException {}
        public void onChallengeRevoked(long p0) throws android.os.RemoteException {}
        public void onAcquired(byte p0, int p1) throws android.os.RemoteException {}
        public void onError(byte p0, int p1) throws android.os.RemoteException {}
        public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException {}
        public void onAuthenticationSucceeded(int p0, android.hardware.keymaster.HardwareAuthToken p1) throws android.os.RemoteException {}
        public void onAuthenticationFailed() throws android.os.RemoteException {}
        public void onLockoutTimed(long p0) throws android.os.RemoteException {}
        public void onLockoutPermanent() throws android.os.RemoteException {}
        public void onLockoutCleared() throws android.os.RemoteException {}
        public void onInteractionDetected() throws android.os.RemoteException {}
        public void onEnrollmentsEnumerated(int[] p0) throws android.os.RemoteException {}
        public void onEnrollmentsRemoved(int[] p0) throws android.os.RemoteException {}
        public void onAuthenticatorIdRetrieved(long p0) throws android.os.RemoteException {}
        public void onAuthenticatorIdInvalidated(long p0) throws android.os.RemoteException {}
        public void onSessionClosed() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.ISessionCallback {
        static final int TRANSACTION_onChallengeGenerated = 1;
        static final int TRANSACTION_onChallengeRevoked = 2;
        static final int TRANSACTION_onAcquired = 3;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onEnrollmentProgress = 5;
        static final int TRANSACTION_onAuthenticationSucceeded = 6;
        static final int TRANSACTION_onAuthenticationFailed = 7;
        static final int TRANSACTION_onLockoutTimed = 8;
        static final int TRANSACTION_onLockoutPermanent = 9;
        static final int TRANSACTION_onLockoutCleared = 10;
        static final int TRANSACTION_onInteractionDetected = 11;
        static final int TRANSACTION_onEnrollmentsEnumerated = 12;
        static final int TRANSACTION_onEnrollmentsRemoved = 13;
        static final int TRANSACTION_onAuthenticatorIdRetrieved = 14;
        static final int TRANSACTION_onAuthenticatorIdInvalidated = 15;
        static final int TRANSACTION_onSessionClosed = 16;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.biometrics.fingerprint.ISessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.fingerprint.ISessionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onChallengeGenerated(long p0) throws android.os.RemoteException {}
            public void onChallengeRevoked(long p0) throws android.os.RemoteException {}
            public void onAcquired(byte p0, int p1) throws android.os.RemoteException {}
            public void onError(byte p0, int p1) throws android.os.RemoteException {}
            public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException {}
            public void onAuthenticationSucceeded(int p0, android.hardware.keymaster.HardwareAuthToken p1) throws android.os.RemoteException {}
            public void onAuthenticationFailed() throws android.os.RemoteException {}
            public void onLockoutTimed(long p0) throws android.os.RemoteException {}
            public void onLockoutPermanent() throws android.os.RemoteException {}
            public void onLockoutCleared() throws android.os.RemoteException {}
            public void onInteractionDetected() throws android.os.RemoteException {}
            public void onEnrollmentsEnumerated(int[] p0) throws android.os.RemoteException {}
            public void onEnrollmentsRemoved(int[] p0) throws android.os.RemoteException {}
            public void onAuthenticatorIdRetrieved(long p0) throws android.os.RemoteException {}
            public void onAuthenticatorIdInvalidated(long p0) throws android.os.RemoteException {}
            public void onSessionClosed() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

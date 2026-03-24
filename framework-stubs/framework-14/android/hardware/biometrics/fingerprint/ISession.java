package android.hardware.biometrics.fingerprint;

public interface ISession extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "637371b53fb7faf9bd43aa51b72c23852d6e6d96";
    public static final java.lang.String DESCRIPTOR = null;
    public void generateChallenge() throws android.os.RemoteException;
    public void revokeChallenge(long p0) throws android.os.RemoteException;
    public android.hardware.biometrics.common.ICancellationSignal enroll(android.hardware.keymaster.HardwareAuthToken p0) throws android.os.RemoteException;
    public android.hardware.biometrics.common.ICancellationSignal authenticate(long p0) throws android.os.RemoteException;
    public android.hardware.biometrics.common.ICancellationSignal detectInteraction() throws android.os.RemoteException;
    public void enumerateEnrollments() throws android.os.RemoteException;
    public void removeEnrollments(int[] p0) throws android.os.RemoteException;
    public void getAuthenticatorId() throws android.os.RemoteException;
    public void invalidateAuthenticatorId() throws android.os.RemoteException;
    public void resetLockout(android.hardware.keymaster.HardwareAuthToken p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    @java.lang.Deprecated
    public void onPointerDown(int p0, int p1, int p2, float p3, float p4) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void onPointerUp(int p0) throws android.os.RemoteException;
    public void onUiReady() throws android.os.RemoteException;
    public android.hardware.biometrics.common.ICancellationSignal authenticateWithContext(long p0, android.hardware.biometrics.common.OperationContext p1) throws android.os.RemoteException;
    public android.hardware.biometrics.common.ICancellationSignal enrollWithContext(android.hardware.keymaster.HardwareAuthToken p0, android.hardware.biometrics.common.OperationContext p1) throws android.os.RemoteException;
    public android.hardware.biometrics.common.ICancellationSignal detectInteractionWithContext(android.hardware.biometrics.common.OperationContext p0) throws android.os.RemoteException;
    public void onPointerDownWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException;
    public void onPointerUpWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException;
    public void onContextChanged(android.hardware.biometrics.common.OperationContext p0) throws android.os.RemoteException;
    public void onPointerCancelWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException;
    public void setIgnoreDisplayTouches(boolean p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.fingerprint.ISession {
        public Default() {}
        public void generateChallenge() throws android.os.RemoteException {}
        public void revokeChallenge(long p0) throws android.os.RemoteException {}
        public android.hardware.biometrics.common.ICancellationSignal enroll(android.hardware.keymaster.HardwareAuthToken p0) throws android.os.RemoteException { return null; }
        public android.hardware.biometrics.common.ICancellationSignal authenticate(long p0) throws android.os.RemoteException { return null; }
        public android.hardware.biometrics.common.ICancellationSignal detectInteraction() throws android.os.RemoteException { return null; }
        public void enumerateEnrollments() throws android.os.RemoteException {}
        public void removeEnrollments(int[] p0) throws android.os.RemoteException {}
        public void getAuthenticatorId() throws android.os.RemoteException {}
        public void invalidateAuthenticatorId() throws android.os.RemoteException {}
        public void resetLockout(android.hardware.keymaster.HardwareAuthToken p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void onPointerDown(int p0, int p1, int p2, float p3, float p4) throws android.os.RemoteException {}
        public void onPointerUp(int p0) throws android.os.RemoteException {}
        public void onUiReady() throws android.os.RemoteException {}
        public android.hardware.biometrics.common.ICancellationSignal authenticateWithContext(long p0, android.hardware.biometrics.common.OperationContext p1) throws android.os.RemoteException { return null; }
        public android.hardware.biometrics.common.ICancellationSignal enrollWithContext(android.hardware.keymaster.HardwareAuthToken p0, android.hardware.biometrics.common.OperationContext p1) throws android.os.RemoteException { return null; }
        public android.hardware.biometrics.common.ICancellationSignal detectInteractionWithContext(android.hardware.biometrics.common.OperationContext p0) throws android.os.RemoteException { return null; }
        public void onPointerDownWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException {}
        public void onPointerUpWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException {}
        public void onContextChanged(android.hardware.biometrics.common.OperationContext p0) throws android.os.RemoteException {}
        public void onPointerCancelWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException {}
        public void setIgnoreDisplayTouches(boolean p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.ISession {
        static final int TRANSACTION_generateChallenge = 1;
        static final int TRANSACTION_revokeChallenge = 2;
        static final int TRANSACTION_enroll = 3;
        static final int TRANSACTION_authenticate = 4;
        static final int TRANSACTION_detectInteraction = 5;
        static final int TRANSACTION_enumerateEnrollments = 6;
        static final int TRANSACTION_removeEnrollments = 7;
        static final int TRANSACTION_getAuthenticatorId = 8;
        static final int TRANSACTION_invalidateAuthenticatorId = 9;
        static final int TRANSACTION_resetLockout = 10;
        static final int TRANSACTION_close = 11;
        static final int TRANSACTION_onPointerDown = 12;
        static final int TRANSACTION_onPointerUp = 13;
        static final int TRANSACTION_onUiReady = 14;
        static final int TRANSACTION_authenticateWithContext = 15;
        static final int TRANSACTION_enrollWithContext = 16;
        static final int TRANSACTION_detectInteractionWithContext = 17;
        static final int TRANSACTION_onPointerDownWithContext = 18;
        static final int TRANSACTION_onPointerUpWithContext = 19;
        static final int TRANSACTION_onContextChanged = 20;
        static final int TRANSACTION_onPointerCancelWithContext = 21;
        static final int TRANSACTION_setIgnoreDisplayTouches = 22;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.biometrics.fingerprint.ISession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.fingerprint.ISession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void generateChallenge() throws android.os.RemoteException {}
            public void revokeChallenge(long p0) throws android.os.RemoteException {}
            public android.hardware.biometrics.common.ICancellationSignal enroll(android.hardware.keymaster.HardwareAuthToken p0) throws android.os.RemoteException { return null; }
            public android.hardware.biometrics.common.ICancellationSignal authenticate(long p0) throws android.os.RemoteException { return null; }
            public android.hardware.biometrics.common.ICancellationSignal detectInteraction() throws android.os.RemoteException { return null; }
            public void enumerateEnrollments() throws android.os.RemoteException {}
            public void removeEnrollments(int[] p0) throws android.os.RemoteException {}
            public void getAuthenticatorId() throws android.os.RemoteException {}
            public void invalidateAuthenticatorId() throws android.os.RemoteException {}
            public void resetLockout(android.hardware.keymaster.HardwareAuthToken p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void onPointerDown(int p0, int p1, int p2, float p3, float p4) throws android.os.RemoteException {}
            public void onPointerUp(int p0) throws android.os.RemoteException {}
            public void onUiReady() throws android.os.RemoteException {}
            public android.hardware.biometrics.common.ICancellationSignal authenticateWithContext(long p0, android.hardware.biometrics.common.OperationContext p1) throws android.os.RemoteException { return null; }
            public android.hardware.biometrics.common.ICancellationSignal enrollWithContext(android.hardware.keymaster.HardwareAuthToken p0, android.hardware.biometrics.common.OperationContext p1) throws android.os.RemoteException { return null; }
            public android.hardware.biometrics.common.ICancellationSignal detectInteractionWithContext(android.hardware.biometrics.common.OperationContext p0) throws android.os.RemoteException { return null; }
            public void onPointerDownWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException {}
            public void onPointerUpWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException {}
            public void onContextChanged(android.hardware.biometrics.common.OperationContext p0) throws android.os.RemoteException {}
            public void onPointerCancelWithContext(android.hardware.biometrics.fingerprint.PointerContext p0) throws android.os.RemoteException {}
            public void setIgnoreDisplayTouches(boolean p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

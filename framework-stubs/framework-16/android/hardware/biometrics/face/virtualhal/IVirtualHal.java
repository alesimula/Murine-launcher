package android.hardware.biometrics.face.virtualhal;

public interface IVirtualHal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.face.virtualhal.IVirtualHal";
    public static final int STATUS_INVALID_PARAMETER = 1;
    public void setEnrollments(int[] p0) throws android.os.RemoteException;
    public void setEnrollmentHit(int p0) throws android.os.RemoteException;
    public void setNextEnrollment(android.hardware.biometrics.face.virtualhal.NextEnrollment p0) throws android.os.RemoteException;
    public void setAuthenticatorId(long p0) throws android.os.RemoteException;
    public void setChallenge(long p0) throws android.os.RemoteException;
    public void setOperationAuthenticateFails(boolean p0) throws android.os.RemoteException;
    public void setOperationAuthenticateLatency(int[] p0) throws android.os.RemoteException;
    public void setOperationAuthenticateDuration(int p0) throws android.os.RemoteException;
    public void setOperationAuthenticateError(int p0) throws android.os.RemoteException;
    public void setOperationAuthenticateAcquired(android.hardware.biometrics.face.virtualhal.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException;
    public void setOperationEnrollLatency(int[] p0) throws android.os.RemoteException;
    public void setOperationDetectInteractionLatency(int[] p0) throws android.os.RemoteException;
    public void setOperationDetectInteractionFails(boolean p0) throws android.os.RemoteException;
    public void setLockout(boolean p0) throws android.os.RemoteException;
    public void setLockoutEnable(boolean p0) throws android.os.RemoteException;
    public void setLockoutTimedEnable(boolean p0) throws android.os.RemoteException;
    public void setLockoutTimedThreshold(int p0) throws android.os.RemoteException;
    public void setLockoutTimedDuration(int p0) throws android.os.RemoteException;
    public void setLockoutPermanentThreshold(int p0) throws android.os.RemoteException;
    public void resetConfigurations() throws android.os.RemoteException;
    public void setType(byte p0) throws android.os.RemoteException;
    public void setSensorStrength(byte p0) throws android.os.RemoteException;
    public android.hardware.biometrics.face.IFace getFaceHal() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.face.virtualhal.IVirtualHal {
        public Default() {}
        public void setEnrollments(int[] p0) throws android.os.RemoteException {}
        public void setEnrollmentHit(int p0) throws android.os.RemoteException {}
        public void setNextEnrollment(android.hardware.biometrics.face.virtualhal.NextEnrollment p0) throws android.os.RemoteException {}
        public void setAuthenticatorId(long p0) throws android.os.RemoteException {}
        public void setChallenge(long p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateFails(boolean p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateLatency(int[] p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateDuration(int p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateError(int p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateAcquired(android.hardware.biometrics.face.virtualhal.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException {}
        public void setOperationEnrollLatency(int[] p0) throws android.os.RemoteException {}
        public void setOperationDetectInteractionLatency(int[] p0) throws android.os.RemoteException {}
        public void setOperationDetectInteractionFails(boolean p0) throws android.os.RemoteException {}
        public void setLockout(boolean p0) throws android.os.RemoteException {}
        public void setLockoutEnable(boolean p0) throws android.os.RemoteException {}
        public void setLockoutTimedEnable(boolean p0) throws android.os.RemoteException {}
        public void setLockoutTimedThreshold(int p0) throws android.os.RemoteException {}
        public void setLockoutTimedDuration(int p0) throws android.os.RemoteException {}
        public void setLockoutPermanentThreshold(int p0) throws android.os.RemoteException {}
        public void resetConfigurations() throws android.os.RemoteException {}
        public void setType(byte p0) throws android.os.RemoteException {}
        public void setSensorStrength(byte p0) throws android.os.RemoteException {}
        public android.hardware.biometrics.face.IFace getFaceHal() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.face.virtualhal.IVirtualHal {
        static final int TRANSACTION_setEnrollments = 1;
        static final int TRANSACTION_setEnrollmentHit = 2;
        static final int TRANSACTION_setNextEnrollment = 3;
        static final int TRANSACTION_setAuthenticatorId = 4;
        static final int TRANSACTION_setChallenge = 5;
        static final int TRANSACTION_setOperationAuthenticateFails = 6;
        static final int TRANSACTION_setOperationAuthenticateLatency = 7;
        static final int TRANSACTION_setOperationAuthenticateDuration = 8;
        static final int TRANSACTION_setOperationAuthenticateError = 9;
        static final int TRANSACTION_setOperationAuthenticateAcquired = 10;
        static final int TRANSACTION_setOperationEnrollLatency = 11;
        static final int TRANSACTION_setOperationDetectInteractionLatency = 12;
        static final int TRANSACTION_setOperationDetectInteractionFails = 13;
        static final int TRANSACTION_setLockout = 14;
        static final int TRANSACTION_setLockoutEnable = 15;
        static final int TRANSACTION_setLockoutTimedEnable = 16;
        static final int TRANSACTION_setLockoutTimedThreshold = 17;
        static final int TRANSACTION_setLockoutTimedDuration = 18;
        static final int TRANSACTION_setLockoutPermanentThreshold = 19;
        static final int TRANSACTION_resetConfigurations = 20;
        static final int TRANSACTION_setType = 21;
        static final int TRANSACTION_setSensorStrength = 22;
        static final int TRANSACTION_getFaceHal = 23;
        public Stub() { super(); }
        public static android.hardware.biometrics.face.virtualhal.IVirtualHal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.face.virtualhal.IVirtualHal {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setEnrollments(int[] p0) throws android.os.RemoteException {}
            public void setEnrollmentHit(int p0) throws android.os.RemoteException {}
            public void setNextEnrollment(android.hardware.biometrics.face.virtualhal.NextEnrollment p0) throws android.os.RemoteException {}
            public void setAuthenticatorId(long p0) throws android.os.RemoteException {}
            public void setChallenge(long p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateFails(boolean p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateLatency(int[] p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateDuration(int p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateError(int p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateAcquired(android.hardware.biometrics.face.virtualhal.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException {}
            public void setOperationEnrollLatency(int[] p0) throws android.os.RemoteException {}
            public void setOperationDetectInteractionLatency(int[] p0) throws android.os.RemoteException {}
            public void setOperationDetectInteractionFails(boolean p0) throws android.os.RemoteException {}
            public void setLockout(boolean p0) throws android.os.RemoteException {}
            public void setLockoutEnable(boolean p0) throws android.os.RemoteException {}
            public void setLockoutTimedEnable(boolean p0) throws android.os.RemoteException {}
            public void setLockoutTimedThreshold(int p0) throws android.os.RemoteException {}
            public void setLockoutTimedDuration(int p0) throws android.os.RemoteException {}
            public void setLockoutPermanentThreshold(int p0) throws android.os.RemoteException {}
            public void resetConfigurations() throws android.os.RemoteException {}
            public void setType(byte p0) throws android.os.RemoteException {}
            public void setSensorStrength(byte p0) throws android.os.RemoteException {}
            public android.hardware.biometrics.face.IFace getFaceHal() throws android.os.RemoteException { return null; }
        }
    }
}

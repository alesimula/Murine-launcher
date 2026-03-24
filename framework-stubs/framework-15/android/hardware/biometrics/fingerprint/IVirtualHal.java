package android.hardware.biometrics.fingerprint;

public interface IVirtualHal extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "41a730a7a6b5aa9cebebce70ee5b5e509b0af6fb";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int STATUS_INVALID_PARAMETER = 1;
    public void setEnrollments(int[] p0) throws android.os.RemoteException;
    public void setEnrollmentHit(int p0) throws android.os.RemoteException;
    public void setNextEnrollment(android.hardware.biometrics.fingerprint.NextEnrollment p0) throws android.os.RemoteException;
    public void setAuthenticatorId(long p0) throws android.os.RemoteException;
    public void setChallenge(long p0) throws android.os.RemoteException;
    public void setOperationAuthenticateFails(boolean p0) throws android.os.RemoteException;
    public void setOperationAuthenticateLatency(int[] p0) throws android.os.RemoteException;
    public void setOperationAuthenticateDuration(int p0) throws android.os.RemoteException;
    public void setOperationAuthenticateError(int p0) throws android.os.RemoteException;
    public void setOperationAuthenticateAcquired(android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException;
    public void setOperationEnrollError(int p0) throws android.os.RemoteException;
    public void setOperationEnrollLatency(int[] p0) throws android.os.RemoteException;
    public void setOperationDetectInteractionLatency(int[] p0) throws android.os.RemoteException;
    public void setOperationDetectInteractionError(int p0) throws android.os.RemoteException;
    public void setOperationDetectInteractionDuration(int p0) throws android.os.RemoteException;
    public void setOperationDetectInteractionAcquired(android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException;
    public void setLockout(boolean p0) throws android.os.RemoteException;
    public void setLockoutEnable(boolean p0) throws android.os.RemoteException;
    public void setLockoutTimedThreshold(int p0) throws android.os.RemoteException;
    public void setLockoutTimedDuration(int p0) throws android.os.RemoteException;
    public void setLockoutPermanentThreshold(int p0) throws android.os.RemoteException;
    public void resetConfigurations() throws android.os.RemoteException;
    public void setType(byte p0) throws android.os.RemoteException;
    public void setSensorId(int p0) throws android.os.RemoteException;
    public void setSensorStrength(byte p0) throws android.os.RemoteException;
    public void setMaxEnrollmentPerUser(int p0) throws android.os.RemoteException;
    public void setSensorLocation(android.hardware.biometrics.fingerprint.SensorLocation p0) throws android.os.RemoteException;
    public void setNavigationGuesture(boolean p0) throws android.os.RemoteException;
    public void setDetectInteraction(boolean p0) throws android.os.RemoteException;
    public void setDisplayTouch(boolean p0) throws android.os.RemoteException;
    public void setControlIllumination(boolean p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.fingerprint.IVirtualHal {
        public Default() {}
        public void setEnrollments(int[] p0) throws android.os.RemoteException {}
        public void setEnrollmentHit(int p0) throws android.os.RemoteException {}
        public void setNextEnrollment(android.hardware.biometrics.fingerprint.NextEnrollment p0) throws android.os.RemoteException {}
        public void setAuthenticatorId(long p0) throws android.os.RemoteException {}
        public void setChallenge(long p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateFails(boolean p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateLatency(int[] p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateDuration(int p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateError(int p0) throws android.os.RemoteException {}
        public void setOperationAuthenticateAcquired(android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException {}
        public void setOperationEnrollError(int p0) throws android.os.RemoteException {}
        public void setOperationEnrollLatency(int[] p0) throws android.os.RemoteException {}
        public void setOperationDetectInteractionLatency(int[] p0) throws android.os.RemoteException {}
        public void setOperationDetectInteractionError(int p0) throws android.os.RemoteException {}
        public void setOperationDetectInteractionDuration(int p0) throws android.os.RemoteException {}
        public void setOperationDetectInteractionAcquired(android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException {}
        public void setLockout(boolean p0) throws android.os.RemoteException {}
        public void setLockoutEnable(boolean p0) throws android.os.RemoteException {}
        public void setLockoutTimedThreshold(int p0) throws android.os.RemoteException {}
        public void setLockoutTimedDuration(int p0) throws android.os.RemoteException {}
        public void setLockoutPermanentThreshold(int p0) throws android.os.RemoteException {}
        public void resetConfigurations() throws android.os.RemoteException {}
        public void setType(byte p0) throws android.os.RemoteException {}
        public void setSensorId(int p0) throws android.os.RemoteException {}
        public void setSensorStrength(byte p0) throws android.os.RemoteException {}
        public void setMaxEnrollmentPerUser(int p0) throws android.os.RemoteException {}
        public void setSensorLocation(android.hardware.biometrics.fingerprint.SensorLocation p0) throws android.os.RemoteException {}
        public void setNavigationGuesture(boolean p0) throws android.os.RemoteException {}
        public void setDetectInteraction(boolean p0) throws android.os.RemoteException {}
        public void setDisplayTouch(boolean p0) throws android.os.RemoteException {}
        public void setControlIllumination(boolean p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.IVirtualHal {
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
        static final int TRANSACTION_setOperationEnrollError = 11;
        static final int TRANSACTION_setOperationEnrollLatency = 12;
        static final int TRANSACTION_setOperationDetectInteractionLatency = 13;
        static final int TRANSACTION_setOperationDetectInteractionError = 14;
        static final int TRANSACTION_setOperationDetectInteractionDuration = 15;
        static final int TRANSACTION_setOperationDetectInteractionAcquired = 16;
        static final int TRANSACTION_setLockout = 17;
        static final int TRANSACTION_setLockoutEnable = 18;
        static final int TRANSACTION_setLockoutTimedThreshold = 19;
        static final int TRANSACTION_setLockoutTimedDuration = 20;
        static final int TRANSACTION_setLockoutPermanentThreshold = 21;
        static final int TRANSACTION_resetConfigurations = 22;
        static final int TRANSACTION_setType = 23;
        static final int TRANSACTION_setSensorId = 24;
        static final int TRANSACTION_setSensorStrength = 25;
        static final int TRANSACTION_setMaxEnrollmentPerUser = 26;
        static final int TRANSACTION_setSensorLocation = 27;
        static final int TRANSACTION_setNavigationGuesture = 28;
        static final int TRANSACTION_setDetectInteraction = 29;
        static final int TRANSACTION_setDisplayTouch = 30;
        static final int TRANSACTION_setControlIllumination = 31;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.biometrics.fingerprint.IVirtualHal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.fingerprint.IVirtualHal {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setEnrollments(int[] p0) throws android.os.RemoteException {}
            public void setEnrollmentHit(int p0) throws android.os.RemoteException {}
            public void setNextEnrollment(android.hardware.biometrics.fingerprint.NextEnrollment p0) throws android.os.RemoteException {}
            public void setAuthenticatorId(long p0) throws android.os.RemoteException {}
            public void setChallenge(long p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateFails(boolean p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateLatency(int[] p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateDuration(int p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateError(int p0) throws android.os.RemoteException {}
            public void setOperationAuthenticateAcquired(android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException {}
            public void setOperationEnrollError(int p0) throws android.os.RemoteException {}
            public void setOperationEnrollLatency(int[] p0) throws android.os.RemoteException {}
            public void setOperationDetectInteractionLatency(int[] p0) throws android.os.RemoteException {}
            public void setOperationDetectInteractionError(int p0) throws android.os.RemoteException {}
            public void setOperationDetectInteractionDuration(int p0) throws android.os.RemoteException {}
            public void setOperationDetectInteractionAcquired(android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode[] p0) throws android.os.RemoteException {}
            public void setLockout(boolean p0) throws android.os.RemoteException {}
            public void setLockoutEnable(boolean p0) throws android.os.RemoteException {}
            public void setLockoutTimedThreshold(int p0) throws android.os.RemoteException {}
            public void setLockoutTimedDuration(int p0) throws android.os.RemoteException {}
            public void setLockoutPermanentThreshold(int p0) throws android.os.RemoteException {}
            public void resetConfigurations() throws android.os.RemoteException {}
            public void setType(byte p0) throws android.os.RemoteException {}
            public void setSensorId(int p0) throws android.os.RemoteException {}
            public void setSensorStrength(byte p0) throws android.os.RemoteException {}
            public void setMaxEnrollmentPerUser(int p0) throws android.os.RemoteException {}
            public void setSensorLocation(android.hardware.biometrics.fingerprint.SensorLocation p0) throws android.os.RemoteException {}
            public void setNavigationGuesture(boolean p0) throws android.os.RemoteException {}
            public void setDetectInteraction(boolean p0) throws android.os.RemoteException {}
            public void setDisplayTouch(boolean p0) throws android.os.RemoteException {}
            public void setControlIllumination(boolean p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

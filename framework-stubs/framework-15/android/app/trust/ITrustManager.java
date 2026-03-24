package android.app.trust;

public interface ITrustManager extends android.os.IInterface {
    public void reportUnlockAttempt(boolean p0, int p1) throws android.os.RemoteException;
    public void reportUserRequestedUnlock(int p0, boolean p1) throws android.os.RemoteException;
    public void reportUserMayRequestUnlock(int p0) throws android.os.RemoteException;
    public void reportUnlockLockout(int p0, int p1) throws android.os.RemoteException;
    public void reportEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException;
    public void registerTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException;
    public void unregisterTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException;
    public void reportKeyguardShowingChanged() throws android.os.RemoteException;
    public void setDeviceLockedForUser(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isDeviceLocked(int p0, int p1) throws android.os.RemoteException;
    public boolean isDeviceSecure(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TRUST_LISTENER")
    public boolean isTrustUsuallyManaged(int p0) throws android.os.RemoteException;
    public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) throws android.os.RemoteException;
    public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0, int p1) throws android.os.RemoteException;
    public boolean isActiveUnlockRunning(int p0) throws android.os.RemoteException;
    public boolean isInSignificantPlace() throws android.os.RemoteException;

    public static class Default implements android.app.trust.ITrustManager {
        public Default() {}
        public void reportUnlockAttempt(boolean p0, int p1) throws android.os.RemoteException {}
        public void reportUserRequestedUnlock(int p0, boolean p1) throws android.os.RemoteException {}
        public void reportUserMayRequestUnlock(int p0) throws android.os.RemoteException {}
        public void reportUnlockLockout(int p0, int p1) throws android.os.RemoteException {}
        public void reportEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException {}
        public void registerTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
        public void unregisterTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
        public void reportKeyguardShowingChanged() throws android.os.RemoteException {}
        public void setDeviceLockedForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isDeviceLocked(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isDeviceSecure(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isTrustUsuallyManaged(int p0) throws android.os.RemoteException { return false; }
        public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) throws android.os.RemoteException {}
        public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0, int p1) throws android.os.RemoteException {}
        public boolean isActiveUnlockRunning(int p0) throws android.os.RemoteException { return false; }
        public boolean isInSignificantPlace() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.trust.ITrustManager {
        public static final java.lang.String DESCRIPTOR = "android.app.trust.ITrustManager";
        static final int TRANSACTION_reportUnlockAttempt = 1;
        static final int TRANSACTION_reportUserRequestedUnlock = 2;
        static final int TRANSACTION_reportUserMayRequestUnlock = 3;
        static final int TRANSACTION_reportUnlockLockout = 4;
        static final int TRANSACTION_reportEnabledTrustAgentsChanged = 5;
        static final int TRANSACTION_registerTrustListener = 6;
        static final int TRANSACTION_unregisterTrustListener = 7;
        static final int TRANSACTION_reportKeyguardShowingChanged = 8;
        static final int TRANSACTION_setDeviceLockedForUser = 9;
        static final int TRANSACTION_isDeviceLocked = 10;
        static final int TRANSACTION_isDeviceSecure = 11;
        static final int TRANSACTION_isTrustUsuallyManaged = 12;
        static final int TRANSACTION_unlockedByBiometricForUser = 13;
        static final int TRANSACTION_clearAllBiometricRecognized = 14;
        static final int TRANSACTION_isActiveUnlockRunning = 15;
        static final int TRANSACTION_isInSignificantPlace = 16;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.app.trust.ITrustManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void isTrustUsuallyManaged_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.trust.ITrustManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportUnlockAttempt(boolean p0, int p1) throws android.os.RemoteException {}
            public void reportUserRequestedUnlock(int p0, boolean p1) throws android.os.RemoteException {}
            public void reportUserMayRequestUnlock(int p0) throws android.os.RemoteException {}
            public void reportUnlockLockout(int p0, int p1) throws android.os.RemoteException {}
            public void reportEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException {}
            public void registerTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
            public void unregisterTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
            public void reportKeyguardShowingChanged() throws android.os.RemoteException {}
            public void setDeviceLockedForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isDeviceLocked(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isDeviceSecure(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isTrustUsuallyManaged(int p0) throws android.os.RemoteException { return false; }
            public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) throws android.os.RemoteException {}
            public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0, int p1) throws android.os.RemoteException {}
            public boolean isActiveUnlockRunning(int p0) throws android.os.RemoteException { return false; }
            public boolean isInSignificantPlace() throws android.os.RemoteException { return false; }
        }
    }
}

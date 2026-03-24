package android.app.trust;

public interface ITrustManager extends android.os.IInterface {
    public void reportUnlockAttempt(boolean p0, int p1) throws android.os.RemoteException;
    public void reportUnlockLockout(int p0, int p1) throws android.os.RemoteException;
    public void reportEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException;
    public void registerTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException;
    public void unregisterTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException;
    public void reportKeyguardShowingChanged() throws android.os.RemoteException;
    public void setDeviceLockedForUser(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isDeviceLocked(int p0) throws android.os.RemoteException;
    public boolean isDeviceSecure(int p0) throws android.os.RemoteException;
    public boolean isTrustUsuallyManaged(int p0) throws android.os.RemoteException;
    public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) throws android.os.RemoteException;
    public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.trust.ITrustManager {
        private static final java.lang.String DESCRIPTOR = "android.app.trust.ITrustManager";
        static final int TRANSACTION_reportUnlockAttempt = 1;
        static final int TRANSACTION_reportUnlockLockout = 2;
        static final int TRANSACTION_reportEnabledTrustAgentsChanged = 3;
        static final int TRANSACTION_registerTrustListener = 4;
        static final int TRANSACTION_unregisterTrustListener = 5;
        static final int TRANSACTION_reportKeyguardShowingChanged = 6;
        static final int TRANSACTION_setDeviceLockedForUser = 7;
        static final int TRANSACTION_isDeviceLocked = 8;
        static final int TRANSACTION_isDeviceSecure = 9;
        static final int TRANSACTION_isTrustUsuallyManaged = 10;
        static final int TRANSACTION_unlockedByBiometricForUser = 11;
        static final int TRANSACTION_clearAllBiometricRecognized = 12;
        public Stub() { super(); }
        public static android.app.trust.ITrustManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.trust.ITrustManager p0) { return false; }
        public static android.app.trust.ITrustManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.trust.ITrustManager {
            private android.os.IBinder mRemote;
            public static android.app.trust.ITrustManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportUnlockAttempt(boolean p0, int p1) throws android.os.RemoteException {}
            public void reportUnlockLockout(int p0, int p1) throws android.os.RemoteException {}
            public void reportEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException {}
            public void registerTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
            public void unregisterTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
            public void reportKeyguardShowingChanged() throws android.os.RemoteException {}
            public void setDeviceLockedForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isDeviceLocked(int p0) throws android.os.RemoteException { return false; }
            public boolean isDeviceSecure(int p0) throws android.os.RemoteException { return false; }
            public boolean isTrustUsuallyManaged(int p0) throws android.os.RemoteException { return false; }
            public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) throws android.os.RemoteException {}
            public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.trust.ITrustManager {
        public Default() {}
        public void reportUnlockAttempt(boolean p0, int p1) throws android.os.RemoteException {}
        public void reportUnlockLockout(int p0, int p1) throws android.os.RemoteException {}
        public void reportEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException {}
        public void registerTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
        public void unregisterTrustListener(android.app.trust.ITrustListener p0) throws android.os.RemoteException {}
        public void reportKeyguardShowingChanged() throws android.os.RemoteException {}
        public void setDeviceLockedForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isDeviceLocked(int p0) throws android.os.RemoteException { return false; }
        public boolean isDeviceSecure(int p0) throws android.os.RemoteException { return false; }
        public boolean isTrustUsuallyManaged(int p0) throws android.os.RemoteException { return false; }
        public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) throws android.os.RemoteException {}
        public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

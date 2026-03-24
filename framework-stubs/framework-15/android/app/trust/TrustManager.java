package android.app.trust;

public class TrustManager {
    public static final java.lang.String ACTION_BIND_SIGNIFICANT_PLACE_PROVIDER = "com.android.trust.provider.SignificantPlaceProvider.BIND";
    public TrustManager(android.os.IBinder p0) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_KEYGUARD_SECURE_STORAGE")
    public void setDeviceLockedForUser(int p0, boolean p1) {}
    public void reportUnlockAttempt(boolean p0, int p1) {}
    public void reportUserRequestedUnlock(int p0, boolean p1) {}
    public void reportUserMayRequestUnlock(int p0) {}
    public void reportUnlockLockout(int p0, int p1) {}
    public void reportEnabledTrustAgentsChanged(int p0) {}
    public void reportKeyguardShowingChanged() {}
    public boolean isActiveUnlockRunning(int p0) { return false; }
    public void registerTrustListener(android.app.trust.TrustManager.TrustListener p0) {}
    public void unregisterTrustListener(android.app.trust.TrustManager.TrustListener p0) {}
    @android.annotation.RequiresPermission("android.permission.TRUST_LISTENER")
    public boolean isTrustUsuallyManaged(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_KEYGUARD_SECURE_STORAGE")
    public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_KEYGUARD_SECURE_STORAGE")
    public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0, int p1) {}
    public boolean isInSignificantPlace() { return false; }

    public static interface TrustListener {
        public void onTrustChanged(boolean p0, boolean p1, int p2, int p3, java.util.List<java.lang.String> p4);
        public void onTrustManagedChanged(boolean p0, int p1);
        public void onTrustError(java.lang.CharSequence p0);
        public void onEnabledTrustAgentsChanged(int p0);
        public void onIsActiveUnlockRunningChanged(boolean p0, int p1);
    }
}

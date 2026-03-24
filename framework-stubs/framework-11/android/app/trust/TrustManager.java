package android.app.trust;

public class TrustManager {
    private static final int MSG_TRUST_CHANGED = 1;
    private static final int MSG_TRUST_MANAGED_CHANGED = 2;
    private static final int MSG_TRUST_ERROR = 3;
    private static final java.lang.String TAG = "TrustManager";
    private static final java.lang.String DATA_FLAGS = "initiatedByUser";
    private static final java.lang.String DATA_MESSAGE = "message";
    private final android.app.trust.ITrustManager mService = null;
    private final android.util.ArrayMap<android.app.trust.TrustManager.TrustListener, android.app.trust.ITrustListener> mTrustListeners = null;
    private final android.os.Handler mHandler = null;
    public TrustManager(android.os.IBinder p0) {}
    public void setDeviceLockedForUser(int p0, boolean p1) {}
    public void reportUnlockAttempt(boolean p0, int p1) {}
    public void reportUnlockLockout(int p0, int p1) {}
    public void reportEnabledTrustAgentsChanged(int p0) {}
    public void reportKeyguardShowingChanged() {}
    public void registerTrustListener(android.app.trust.TrustManager.TrustListener p0) {}
    public void unregisterTrustListener(android.app.trust.TrustManager.TrustListener p0) {}
    public boolean isTrustUsuallyManaged(int p0) { return false; }
    public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) {}
    public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0) {}

    public static interface TrustListener {
        public void onTrustChanged(boolean p0, int p1, int p2);
        public void onTrustManagedChanged(boolean p0, int p1);
        public void onTrustError(java.lang.CharSequence p0);
    }
}

package android.service.trust;

@android.annotation.SystemApi
public class TrustAgentService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.trust.TrustAgentService";
    public static final java.lang.String TRUST_AGENT_META_DATA = "android.service.trust.trustagent";
    public static final int FLAG_GRANT_TRUST_INITIATED_BY_USER = 1;
    public static final int FLAG_GRANT_TRUST_DISMISS_KEYGUARD = 2;
    public static final int FLAG_GRANT_TRUST_TEMPORARY_AND_RENEWABLE = 4;
    public static final int FLAG_GRANT_TRUST_DISPLAY_MESSAGE = 8;
    public static final int TOKEN_STATE_ACTIVE = 1;
    public static final int TOKEN_STATE_INACTIVE = 0;
    public TrustAgentService() { super(); }
    public void onCreate() {}
    public void onUnlockAttempt(boolean p0) {}
    public void onUserMayRequestUnlock() {}
    public void onUserRequestedUnlock(boolean p0) {}
    public void onTrustTimeout() {}
    public void onDeviceLocked() {}
    public void onDeviceUnlocked() {}
    public void onDeviceUnlockLockout(long p0) {}
    public void onEscrowTokenAdded(byte[] p0, long p1, android.os.UserHandle p2) {}
    public void onEscrowTokenStateReceived(long p0, int p1) {}
    public void onEscrowTokenRemoved(long p0, boolean p1) {}
    public boolean onConfigure(java.util.List<android.os.PersistableBundle> p0) { return false; }
    @java.lang.Deprecated
    public final void grantTrust(java.lang.CharSequence p0, long p1, boolean p2) {}
    @java.lang.Deprecated
    public final void grantTrust(java.lang.CharSequence p0, long p1, int p2) {}
    public final void grantTrust(java.lang.CharSequence p0, long p1, int p2, java.util.function.Consumer<android.service.trust.GrantTrustResult> p3) {}
    public final void revokeTrust() {}
    public final void setManagingTrust(boolean p0) {}
    public final void addEscrowToken(byte[] p0, android.os.UserHandle p1) {}
    public final void isEscrowTokenActive(long p0, android.os.UserHandle p1) {}
    public final void removeEscrowToken(long p0, android.os.UserHandle p1) {}
    public final void unlockUserWithToken(long p0, byte[] p1, android.os.UserHandle p2) {}
    public final void lockUser() {}
    public final void showKeyguardErrorMessage(java.lang.CharSequence p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private static final class ConfigurationData {
        final android.os.IBinder token = null;
        final java.util.List<android.os.PersistableBundle> options = null;
        ConfigurationData(java.util.List<android.os.PersistableBundle> p0, android.os.IBinder p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GrantTrustFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TokenState {
    }

    private final class TrustAgentServiceWrapper extends android.service.trust.ITrustAgentService.Stub {
        public void onUnlockAttempt(boolean p0) {}
        public void onUserRequestedUnlock(boolean p0) {}
        public void onUserMayRequestUnlock() {}
        public void onUnlockLockout(int p0) {}
        public void onTrustTimeout() {}
        public void onConfigure(java.util.List<android.os.PersistableBundle> p0, android.os.IBinder p1) {}
        public void onDeviceLocked() throws android.os.RemoteException {}
        public void onDeviceUnlocked() throws android.os.RemoteException {}
        public void setCallback(android.service.trust.ITrustAgentServiceCallback p0) {}
        public void onEscrowTokenAdded(byte[] p0, long p1, android.os.UserHandle p2) {}
        public void onTokenStateReceived(long p0, int p1) {}
        public void onEscrowTokenRemoved(long p0, boolean p1) {}
    }
}

package android.service.notification;

public final class FeatureFlagsImpl implements android.service.notification.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean callstyleCallbackApi() { return false; }
    public boolean rankingUpdateAshmem() { return false; }
    public boolean redactSensitiveNotificationsBigTextStyle() { return false; }
    public boolean redactSensitiveNotificationsFromUntrustedListeners() { return false; }
}

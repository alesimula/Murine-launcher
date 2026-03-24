package android.service.notification;

public class CustomFeatureFlags implements android.service.notification.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.service.notification.FeatureFlags>> p0) {}
    public boolean callstyleCallbackApi() { return false; }
    public boolean rankingUpdateAshmem() { return false; }
    public boolean redactSensitiveNotificationsBigTextStyle() { return false; }
    public boolean redactSensitiveNotificationsFromUntrustedListeners() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.notification.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

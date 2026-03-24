package com.android.internal.hidden_from_bootclasspath.android.service.notification;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.service.notification.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.service.notification.FeatureFlags>> p0) {}
    public boolean applyBrightnessClampingForModes() { return false; }
    public boolean callstyleCallbackApi() { return false; }
    public boolean nmClassificationNls() { return false; }
    public boolean notificationBitmapOffloading() { return false; }
    public boolean notificationClassification() { return false; }
    public boolean notificationConversationChannelManagement() { return false; }
    public boolean notificationForceGrouping() { return false; }
    public boolean notificationGetOriginalImportance() { return false; }
    public boolean notificationRegroupOnClassification() { return false; }
    public boolean notificationSilentFlag() { return false; }
    public boolean rankingUpdateAshmem() { return false; }
    public boolean redactSensitiveNotificationsBigTextStyle() { return false; }
    public boolean redactSensitiveNotificationsFromUntrustedListeners() { return false; }
    public boolean reportNlsStartAndEnd() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.service.notification.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

package android.view.contentprotection.flags;

public class CustomFeatureFlags implements android.view.contentprotection.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.view.contentprotection.flags.FeatureFlags>> p0) {}
    public boolean blocklistUpdateEnabled() { return false; }
    public boolean createAccessibilityOverlayAppOpEnabled() { return false; }
    public boolean manageDevicePolicyEnabled() { return false; }
    public boolean parseGroupsConfigEnabled() { return false; }
    public boolean rapidClearNotificationsByListenerAppOpEnabled() { return false; }
    public boolean settingUiEnabled() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.view.contentprotection.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

package android.app.supervision.flags;

public class CustomFeatureFlags implements android.app.supervision.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.supervision.flags.FeatureFlags>> p0) {}
    public boolean deprecateDpmSupervisionApis() { return false; }
    public boolean enableAppApproval() { return false; }
    public boolean enableLockTaskFeatureQuickSettings() { return false; }
    public boolean enableRemovePoliciesOnSupervisionDisable() { return false; }
    public boolean enableSupervisionAppService() { return false; }
    public boolean enableSupervisionPinRecoveryScreen() { return false; }
    public boolean enableSupervisionSettingsScreen() { return false; }
    public boolean enableSyncWithDpm() { return false; }
    public boolean enableWebContentFiltersScreen() { return false; }
    public boolean persistentSupervisionSettings() { return false; }
    public boolean supervisionApi() { return false; }
    public boolean supervisionApiOnWear() { return false; }
    public boolean supervisionManagerApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.supervision.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

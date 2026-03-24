package android.app.supervision.flags;

public final class FeatureFlagsImpl implements android.app.supervision.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
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
}

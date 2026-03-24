package com.android.internal.hidden_from_bootclasspath.android.app.supervision.flags;

public interface FeatureFlags {
    public boolean deprecateDpmSupervisionApis();
    public boolean enableAppApproval();
    public boolean enableLockTaskFeatureQuickSettings();
    public boolean enableRemovePoliciesOnSupervisionDisable();
    public boolean enableSupervisionAppService();
    public boolean enableSupervisionPinRecoveryScreen();
    public boolean enableSupervisionSettingsScreen();
    public boolean enableSyncWithDpm();
    public boolean enableWebContentFiltersScreen();
    public boolean persistentSupervisionSettings();
    public boolean supervisionApi();
    public boolean supervisionApiOnWear();
    public boolean supervisionManagerApis();
}

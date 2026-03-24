package com.android.internal.hidden_from_bootclasspath.android.credentials.flags;

public interface FeatureFlags {
    public boolean clearCredentialsFixEnabled();
    public boolean clearSessionEnabled();
    public boolean configurableSelectorUiEnabled();
    public boolean hybridFilterOptFixEnabled();
    public boolean isCredmanSettingsExpressiveDesign();
    public boolean metricBugfixesContinued();
    public boolean newFrameworkMetrics();
    public boolean newSettingsIntents();
    public boolean packageUpdateFixEnabled();
    public boolean propagateUserContextForIntentCreation();
    public boolean safeguardCandidateCredentialsApiCaller();
    public boolean settingsActivityEnabled();
    public boolean settingsWFixes();
    public boolean ttlFixEnabled();
    public boolean wearCredentialManagerEnabled();
}

package com.android.server.backup;

public final class FeatureFlagsImpl implements com.android.server.backup.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean enableClearPipeAfterRestoreFile() { return false; }
    public boolean enableIncreaseDatatypesForAgentLogging() { return false; }
    public boolean enableIncreasedBmmLoggingForRestoreAtInstall() { return false; }
    public boolean enableMaxSizeWritesToPipes() { return false; }
    public boolean enableMetricsSystemBackupAgents() { return false; }
    public boolean enableSkippingRestoreLaunchedApps() { return false; }
    public boolean enableVToURestoreForSystemComponentsInAllowlist() { return false; }
}

package com.android.server.backup;

public interface FeatureFlags {
    public boolean enableClearPipeAfterRestoreFile();
    public boolean enableCrossPlatformTransfer();
    public boolean enableIncreaseDatatypesForAgentLogging();
    public boolean enableIncreasedBmmLoggingForRestoreAtInstall();
    public boolean enableMaxSizeWritesToPipes();
    public boolean enableMetricsSettingsBackupAgents();
    public boolean enableMetricsSystemBackupAgents();
    public boolean enableReadAllExternalStorageFiles();
    public boolean enableRestrictedModeChanges();
    public boolean enableSkippingRestoreLaunchedApps();
    public boolean enableVToURestoreForSystemComponentsInAllowlist();
}

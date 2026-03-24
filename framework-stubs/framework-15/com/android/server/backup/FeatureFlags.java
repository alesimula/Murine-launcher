package com.android.server.backup;

public interface FeatureFlags {
    public boolean enableClearPipeAfterRestoreFile();
    public boolean enableIncreaseDatatypesForAgentLogging();
    public boolean enableIncreasedBmmLoggingForRestoreAtInstall();
    public boolean enableMaxSizeWritesToPipes();
    public boolean enableMetricsSystemBackupAgents();
    public boolean enableSkippingRestoreLaunchedApps();
    public boolean enableVToURestoreForSystemComponentsInAllowlist();
}

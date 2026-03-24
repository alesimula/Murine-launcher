package com.android.internal.hidden_from_bootclasspath.com.android.server.backup;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.server.backup.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.backup.FeatureFlags>> p0) {}
    public boolean enableClearPipeAfterRestoreFile() { return false; }
    public boolean enableCrossPlatformTransfer() { return false; }
    public boolean enableIncreaseDatatypesForAgentLogging() { return false; }
    public boolean enableIncreasedBmmLoggingForRestoreAtInstall() { return false; }
    public boolean enableMaxSizeWritesToPipes() { return false; }
    public boolean enableMetricsSettingsBackupAgents() { return false; }
    public boolean enableMetricsSystemBackupAgents() { return false; }
    public boolean enableReadAllExternalStorageFiles() { return false; }
    public boolean enableRestrictedModeChanges() { return false; }
    public boolean enableSkippingRestoreLaunchedApps() { return false; }
    public boolean enableVToURestoreForSystemComponentsInAllowlist() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.backup.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

package com.android.server.backup;

public final class Flags {
    public static final java.lang.String FLAG_ENABLE_CLEAR_PIPE_AFTER_RESTORE_FILE = "com.android.server.backup.enable_clear_pipe_after_restore_file";
    public static final java.lang.String FLAG_ENABLE_INCREASE_DATATYPES_FOR_AGENT_LOGGING = "com.android.server.backup.enable_increase_datatypes_for_agent_logging";
    public static final java.lang.String FLAG_ENABLE_INCREASED_BMM_LOGGING_FOR_RESTORE_AT_INSTALL = "com.android.server.backup.enable_increased_bmm_logging_for_restore_at_install";
    public static final java.lang.String FLAG_ENABLE_MAX_SIZE_WRITES_TO_PIPES = "com.android.server.backup.enable_max_size_writes_to_pipes";
    public static final java.lang.String FLAG_ENABLE_METRICS_SYSTEM_BACKUP_AGENTS = "com.android.server.backup.enable_metrics_system_backup_agents";
    public static final java.lang.String FLAG_ENABLE_SKIPPING_RESTORE_LAUNCHED_APPS = "com.android.server.backup.enable_skipping_restore_launched_apps";
    public static final java.lang.String FLAG_ENABLE_V_TO_U_RESTORE_FOR_SYSTEM_COMPONENTS_IN_ALLOWLIST = "com.android.server.backup.enable_v_to_u_restore_for_system_components_in_allowlist";
    public Flags() {}
    public static boolean enableClearPipeAfterRestoreFile() { return false; }
    public static boolean enableIncreaseDatatypesForAgentLogging() { return false; }
    public static boolean enableIncreasedBmmLoggingForRestoreAtInstall() { return false; }
    public static boolean enableMaxSizeWritesToPipes() { return false; }
    public static boolean enableMetricsSystemBackupAgents() { return false; }
    public static boolean enableSkippingRestoreLaunchedApps() { return false; }
    public static boolean enableVToURestoreForSystemComponentsInAllowlist() { return false; }
}

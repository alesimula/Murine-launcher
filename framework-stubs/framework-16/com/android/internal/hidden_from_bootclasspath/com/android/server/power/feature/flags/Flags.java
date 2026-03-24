package com.android.internal.hidden_from_bootclasspath.com.android.server.power.feature.flags;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_FROZEN_PROCESS_WAKELOCKS = "com.android.server.power.feature.flags.disable_frozen_process_wakelocks";
    public static final java.lang.String FLAG_ENABLE_APP_WAKELOCK_DATA_SOURCE = "com.android.server.power.feature.flags.enable_app_wakelock_data_source";
    public static final java.lang.String FLAG_ENABLE_EARLY_SCREEN_TIMEOUT_DETECTOR = "com.android.server.power.feature.flags.enable_early_screen_timeout_detector";
    public static final java.lang.String FLAG_ENABLE_SCREEN_TIMEOUT_POLICY_LISTENER_API = "com.android.server.power.feature.flags.enable_screen_timeout_policy_listener_api";
    public static final java.lang.String FLAG_FORCE_DISABLE_WAKELOCKS = "com.android.server.power.feature.flags.force_disable_wakelocks";
    public static final java.lang.String FLAG_IMPROVE_WAKELOCK_LATENCY = "com.android.server.power.feature.flags.improve_wakelock_latency";
    public static final java.lang.String FLAG_MOVE_WSC_LOGGING_TO_NOTIFIER = "com.android.server.power.feature.flags.move_wsc_logging_to_notifier";
    public static final java.lang.String FLAG_PER_DISPLAY_WAKE_BY_TOUCH = "com.android.server.power.feature.flags.per_display_wake_by_touch";
    public static final java.lang.String FLAG_POLICY_REASON_IN_DISPLAY_POWER_REQUEST = "com.android.server.power.feature.flags.policy_reason_in_display_power_request";
    public static final java.lang.String FLAG_WAKELOCK_ATTRIBUTION_VIA_WORKCHAIN = "com.android.server.power.feature.flags.wakelock_attribution_via_workchain";
    public Flags() {}
    public static boolean disableFrozenProcessWakelocks() { return false; }
    public static boolean enableAppWakelockDataSource() { return false; }
    public static boolean enableEarlyScreenTimeoutDetector() { return false; }
    public static boolean enableScreenTimeoutPolicyListenerApi() { return false; }
    public static boolean forceDisableWakelocks() { return false; }
    public static boolean improveWakelockLatency() { return false; }
    public static boolean moveWscLoggingToNotifier() { return false; }
    public static boolean perDisplayWakeByTouch() { return false; }
    public static boolean policyReasonInDisplayPowerRequest() { return false; }
    public static boolean wakelockAttributionViaWorkchain() { return false; }
}

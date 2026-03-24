package com.android.server.power.optimization;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_SYSTEM_SERVICE_POWER_ATTR = "com.android.server.power.optimization.disable_system_service_power_attr";
    public static final java.lang.String FLAG_ONEWAY_BATTERY_STATS_SERVICE = "com.android.server.power.optimization.oneway_battery_stats_service";
    public static final java.lang.String FLAG_POWER_MONITOR_API = "com.android.server.power.optimization.power_monitor_api";
    public static final java.lang.String FLAG_STREAMLINED_BATTERY_STATS = "com.android.server.power.optimization.streamlined_battery_stats";
    public static final java.lang.String FLAG_STREAMLINED_CONNECTIVITY_BATTERY_STATS = "com.android.server.power.optimization.streamlined_connectivity_battery_stats";
    public static final java.lang.String FLAG_STREAMLINED_MISC_BATTERY_STATS = "com.android.server.power.optimization.streamlined_misc_battery_stats";
    public Flags() {}
    public static boolean disableSystemServicePowerAttr() { return false; }
    public static boolean onewayBatteryStatsService() { return false; }
    public static boolean powerMonitorApi() { return false; }
    public static boolean streamlinedBatteryStats() { return false; }
    public static boolean streamlinedConnectivityBatteryStats() { return false; }
    public static boolean streamlinedMiscBatteryStats() { return false; }
}

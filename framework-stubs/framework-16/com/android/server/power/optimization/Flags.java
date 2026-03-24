package com.android.server.power.optimization;

public final class Flags {
    public static final java.lang.String FLAG_ADD_BATTERY_USAGE_STATS_SLICE_ATOM = "com.android.server.power.optimization.add_battery_usage_stats_slice_atom";
    public static final java.lang.String FLAG_BATTERY_STATS_SCREEN_STATE_EVENT = "com.android.server.power.optimization.battery_stats_screen_state_event";
    public static final java.lang.String FLAG_CHECKIN_HISTORY_START_TIME = "com.android.server.power.optimization.checkin_history_start_time";
    public static final java.lang.String FLAG_DISABLE_COMPOSITE_BATTERY_USAGE_STATS_ATOMS = "com.android.server.power.optimization.disable_composite_battery_usage_stats_atoms";
    public static final java.lang.String FLAG_POWER_MONITOR_API = "com.android.server.power.optimization.power_monitor_api";
    public static final java.lang.String FLAG_REAL_CHECKIN_HISTORY_START_TIME = "com.android.server.power.optimization.real_checkin_history_start_time";
    public static final java.lang.String FLAG_REPORT_OUT_OF_ORDER_BATTERY_HISTORY_EVENTS = "com.android.server.power.optimization.report_out_of_order_battery_history_events";
    public static final java.lang.String FLAG_STREAMLINED_CONNECTIVITY_BATTERY_STATS = "com.android.server.power.optimization.streamlined_connectivity_battery_stats";
    public Flags() {}
    public static boolean addBatteryUsageStatsSliceAtom() { return false; }
    public static boolean batteryStatsScreenStateEvent() { return false; }
    public static boolean checkinHistoryStartTime() { return false; }
    public static boolean disableCompositeBatteryUsageStatsAtoms() { return false; }
    public static boolean powerMonitorApi() { return false; }
    public static boolean realCheckinHistoryStartTime() { return false; }
    public static boolean reportOutOfOrderBatteryHistoryEvents() { return false; }
    public static boolean streamlinedConnectivityBatteryStats() { return false; }
}

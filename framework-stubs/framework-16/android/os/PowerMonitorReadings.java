package android.os;

@android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
public final class PowerMonitorReadings {
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public static final int ENERGY_UNAVAILABLE = -1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.fine_power_monitor_permission")
    public static final int GRANULARITY_UNSPECIFIED = 0;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.fine_power_monitor_permission")
    public static final int GRANULARITY_FINE = 1;
    public PowerMonitorReadings(android.os.PowerMonitor[] p0, long[] p1, long[] p2, int p3) {}
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public long getConsumedEnergy(android.os.PowerMonitor p0) { return 0L; }
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public long getTimestampMillis(android.os.PowerMonitor p0) { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.fine_power_monitor_permission")
    public int getGranularity() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerMonitorGranularity {
    }
}

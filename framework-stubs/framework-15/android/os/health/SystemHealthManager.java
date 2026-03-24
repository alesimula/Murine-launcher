package android.os.health;

public class SystemHealthManager {
    public SystemHealthManager() {}
    public SystemHealthManager(com.android.internal.app.IBatteryStats p0, android.os.IPowerStatsService p1) {}
    public static android.os.health.SystemHealthManager from(android.content.Context p0) { return null; }
    public android.os.health.HealthStats takeUidSnapshot(int p0) { return null; }
    public android.os.health.HealthStats takeMyUidSnapshot() { return null; }
    public android.os.health.HealthStats[] takeUidSnapshots(int[] p0) { return null; }
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public void getSupportedPowerMonitors(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.os.PowerMonitor>> p1) {}
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public void getPowerMonitorReadings(java.util.List<android.os.PowerMonitor> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.os.PowerMonitorReadings, java.lang.RuntimeException> p2) {}

    private static class PendingUidSnapshots {
        public int[] uids;
        public android.os.SynchronousResultReceiver resultReceiver;
    }
}

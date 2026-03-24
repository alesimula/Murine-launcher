package android.os.health;

public class SystemHealthManager {
    public SystemHealthManager() {}
    public SystemHealthManager(com.android.internal.app.IBatteryStats p0, android.os.IPowerStatsService p1, android.os.IHintManager p2) {}
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    public float getCpuHeadroom(android.os.CpuHeadroomParams p0) { return 0.0f; }
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    public int getMaxCpuHeadroomTidsSize() { return 0; }
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    public float getGpuHeadroom(android.os.GpuHeadroomParams p0) { return 0.0f; }
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    @android.annotation.NonNull
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getCpuHeadroomCalculationWindowRange() { return null; }
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    @android.annotation.NonNull
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getGpuHeadroomCalculationWindowRange() { return null; }
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    public long getCpuHeadroomMinIntervalMillis() { return 0L; }
    @android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
    public long getGpuHeadroomMinIntervalMillis() { return 0L; }
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

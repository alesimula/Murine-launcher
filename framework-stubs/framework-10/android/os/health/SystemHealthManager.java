package android.os.health;

public class SystemHealthManager {
    private final com.android.internal.app.IBatteryStats mBatteryStats = null;
    @android.annotation.UnsupportedAppUsage
    public SystemHealthManager() {}
    public SystemHealthManager(com.android.internal.app.IBatteryStats p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static android.os.health.SystemHealthManager from(android.content.Context p0) { return null; }
    public android.os.health.HealthStats takeUidSnapshot(int p0) { return null; }
    public android.os.health.HealthStats takeMyUidSnapshot() { return null; }
    public android.os.health.HealthStats[] takeUidSnapshots(int[] p0) { return null; }
}

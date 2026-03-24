package com.android.internal.os;

public class BatterySipper implements java.lang.Comparable<com.android.internal.os.BatterySipper> {
    @android.annotation.UnsupportedAppUsage
    public int userId;
    @android.annotation.UnsupportedAppUsage
    public android.os.BatteryStats.Uid uidObj;
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.os.BatterySipper.DrainType drainType;
    public double screenPowerMah;
    public double proportionalSmearMah;
    public double totalSmearedPowerMah;
    @android.annotation.UnsupportedAppUsage
    public double totalPowerMah;
    public boolean shouldHide;
    @android.annotation.UnsupportedAppUsage
    public long usageTimeMs;
    public double usagePowerMah;
    public long audioTimeMs;
    public long bluetoothRunningTimeMs;
    public long cameraTimeMs;
    @android.annotation.UnsupportedAppUsage
    public long cpuFgTimeMs;
    @android.annotation.UnsupportedAppUsage
    public long cpuTimeMs;
    public long flashlightTimeMs;
    @android.annotation.UnsupportedAppUsage
    public long gpsTimeMs;
    public long videoTimeMs;
    @android.annotation.UnsupportedAppUsage
    public long wakeLockTimeMs;
    @android.annotation.UnsupportedAppUsage
    public long wifiRunningTimeMs;
    public long mobileRxPackets;
    public long mobileTxPackets;
    public long mobileActive;
    public int mobileActiveCount;
    public double mobilemspp;
    public long wifiRxPackets;
    public long wifiTxPackets;
    public long mobileRxBytes;
    public long mobileTxBytes;
    public long wifiRxBytes;
    public long wifiTxBytes;
    public long btRxBytes;
    public long btTxBytes;
    public double percent;
    public double noCoveragePercent;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] mPackages;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String packageWithHighestDrain;
    public double audioPowerMah;
    public double bluetoothPowerMah;
    public double cameraPowerMah;
    @android.annotation.UnsupportedAppUsage
    public double cpuPowerMah;
    public double flashlightPowerMah;
    public double gpsPowerMah;
    public double mobileRadioPowerMah;
    public double sensorPowerMah;
    public double videoPowerMah;
    public double wakeLockPowerMah;
    public double wifiPowerMah;
    @android.annotation.UnsupportedAppUsage
    public BatterySipper(com.android.internal.os.BatterySipper.DrainType p0, android.os.BatteryStats.Uid p1, double p2) {}
    public void computeMobilemspp() {}
    public int compareTo(com.android.internal.os.BatterySipper p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getPackages() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getUid() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void add(com.android.internal.os.BatterySipper p0) {}
    public double sumPower() { return 0.0; }

    public static enum DrainType {
        AMBIENT_DISPLAY,
        APP,
        BLUETOOTH,
        CAMERA,
        CELL,
        FLASHLIGHT,
        IDLE,
        MEMORY,
        OVERCOUNTED,
        PHONE,
        SCREEN,
        UNACCOUNTED,
        USER,
        WIFI;
        private DrainType() {}
    }
}

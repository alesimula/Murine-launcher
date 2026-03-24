package com.android.internal.os;

public class BatterySipper implements java.lang.Comparable<com.android.internal.os.BatterySipper> {
    public int userId;
    public android.os.BatteryStats.Uid uidObj;
    public com.android.internal.os.BatterySipper.DrainType drainType;
    public double screenPowerMah;
    public double proportionalSmearMah;
    public double totalSmearedPowerMah;
    public double totalPowerMah;
    public boolean shouldHide;
    public long usageTimeMs;
    public double usagePowerMah;
    public long audioTimeMs;
    public long bluetoothRunningTimeMs;
    public long cameraTimeMs;
    public long cpuFgTimeMs;
    public long cpuTimeMs;
    public long flashlightTimeMs;
    public long gpsTimeMs;
    public long videoTimeMs;
    public long wakeLockTimeMs;
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
    public java.lang.String[] mPackages;
    public java.lang.String packageWithHighestDrain;
    public double audioPowerMah;
    public double bluetoothPowerMah;
    public double cameraPowerMah;
    public double cpuPowerMah;
    public double flashlightPowerMah;
    public double gpsPowerMah;
    public double mobileRadioPowerMah;
    public double sensorPowerMah;
    public double videoPowerMah;
    public double wakeLockPowerMah;
    public double wifiPowerMah;
    public BatterySipper(com.android.internal.os.BatterySipper.DrainType p0, android.os.BatteryStats.Uid p1, double p2) {}
    public void computeMobilemspp() {}
    public int compareTo(com.android.internal.os.BatterySipper p0) { return 0; }
    public java.lang.String[] getPackages() { return null; }
    public int getUid() { return 0; }
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

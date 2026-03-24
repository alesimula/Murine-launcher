package com.android.internal.os;

public class PowerProfile {
    public static final java.lang.String TAG = "PowerProfile";
    public static final java.lang.String POWER_CPU_SUSPEND = "cpu.suspend";
    public static final java.lang.String POWER_CPU_IDLE = "cpu.idle";
    public static final java.lang.String POWER_CPU_ACTIVE = "cpu.active";
    public static final java.lang.String POWER_WIFI_SCAN = "wifi.scan";
    public static final java.lang.String POWER_WIFI_ON = "wifi.on";
    public static final java.lang.String POWER_WIFI_ACTIVE = "wifi.active";
    public static final java.lang.String POWER_WIFI_CONTROLLER_IDLE = "wifi.controller.idle";
    public static final java.lang.String POWER_WIFI_CONTROLLER_RX = "wifi.controller.rx";
    public static final java.lang.String POWER_WIFI_CONTROLLER_TX = "wifi.controller.tx";
    public static final java.lang.String POWER_WIFI_CONTROLLER_TX_LEVELS = "wifi.controller.tx_levels";
    public static final java.lang.String POWER_WIFI_CONTROLLER_OPERATING_VOLTAGE = "wifi.controller.voltage";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_IDLE = "bluetooth.controller.idle";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_RX = "bluetooth.controller.rx";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_TX = "bluetooth.controller.tx";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_OPERATING_VOLTAGE = "bluetooth.controller.voltage";
    public static final java.lang.String POWER_MODEM_CONTROLLER_SLEEP = "modem.controller.sleep";
    public static final java.lang.String POWER_MODEM_CONTROLLER_IDLE = "modem.controller.idle";
    public static final java.lang.String POWER_MODEM_CONTROLLER_RX = "modem.controller.rx";
    public static final java.lang.String POWER_MODEM_CONTROLLER_TX = "modem.controller.tx";
    public static final java.lang.String POWER_MODEM_CONTROLLER_OPERATING_VOLTAGE = "modem.controller.voltage";
    public static final java.lang.String POWER_GPS_ON = "gps.on";
    public static final java.lang.String POWER_GPS_SIGNAL_QUALITY_BASED = "gps.signalqualitybased";
    public static final java.lang.String POWER_GPS_OPERATING_VOLTAGE = "gps.voltage";
    @java.lang.Deprecated
    public static final java.lang.String POWER_BLUETOOTH_ON = "bluetooth.on";
    @java.lang.Deprecated
    public static final java.lang.String POWER_BLUETOOTH_ACTIVE = "bluetooth.active";
    @java.lang.Deprecated
    public static final java.lang.String POWER_BLUETOOTH_AT_CMD = "bluetooth.at";
    @java.lang.Deprecated
    public static final java.lang.String POWER_AMBIENT_DISPLAY = "ambient.on";
    @java.lang.Deprecated
    public static final java.lang.String POWER_SCREEN_ON = "screen.on";
    public static final java.lang.String POWER_RADIO_ON = "radio.on";
    public static final java.lang.String POWER_RADIO_SCANNING = "radio.scanning";
    public static final java.lang.String POWER_RADIO_ACTIVE = "radio.active";
    @java.lang.Deprecated
    public static final java.lang.String POWER_SCREEN_FULL = "screen.full";
    public static final java.lang.String POWER_AUDIO = "audio";
    public static final java.lang.String POWER_VIDEO = "video";
    public static final java.lang.String POWER_FLASHLIGHT = "camera.flashlight";
    public static final java.lang.String POWER_MEMORY = "memory.bandwidths";
    public static final java.lang.String POWER_CAMERA = "camera.avg";
    public static final java.lang.String POWER_WIFI_BATCHED_SCAN = "wifi.batchedscan";
    public static final java.lang.String POWER_BATTERY_CAPACITY = "battery.capacity";
    public static final java.lang.String POWER_GROUP_DISPLAY_AMBIENT = "ambient.on.display";
    public static final java.lang.String POWER_GROUP_DISPLAY_SCREEN_ON = "screen.on.display";
    public static final java.lang.String POWER_GROUP_DISPLAY_SCREEN_FULL = "screen.full.display";
    public static final long SUBSYSTEM_NONE = 0L;
    public static final long SUBSYSTEM_MODEM = 4294967296L;
    public static final int POWER_BRACKETS_UNSPECIFIED = -1;
    static final java.util.HashMap<java.lang.String, java.lang.Double> sPowerItemMap = null;
    static final java.util.HashMap<java.lang.String, java.lang.Double[]> sPowerArrayMap = null;
    static final com.android.internal.power.ModemPowerProfile sModemPowerProfile = null;
    public PowerProfile() {}
    public PowerProfile(android.content.Context p0) {}
    public PowerProfile(android.content.Context p0, boolean p1) {}
    public void initForTesting(org.xmlpull.v1.XmlPullParser p0) {}
    public void initForTesting(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) {}
    public double getAveragePowerForCpuScalingPolicy(int p0) { return 0.0; }
    public double getAveragePowerForCpuScalingStep(int p0, int p1) { return 0.0; }
    @java.lang.Deprecated
    public int getNumCpuClusters() { return 0; }
    @java.lang.Deprecated
    public int getNumCoresInCpuCluster(int p0) { return 0; }
    @java.lang.Deprecated
    public int getNumSpeedStepsInCpuCluster(int p0) { return 0; }
    @java.lang.Deprecated
    public double getAveragePowerForCpuCluster(int p0) { return 0.0; }
    @java.lang.Deprecated
    public double getAveragePowerForCpuCore(int p0, int p1) { return 0.0; }
    public int getCpuPowerBracketCount() { return 0; }
    public int getCpuPowerBracketForScalingStep(int p0, int p1) { return 0; }
    public int getNumDisplays() { return 0; }
    public int getNumElements(java.lang.String p0) { return 0; }
    public double getAveragePowerOrDefault(java.lang.String p0, double p1) { return 0.0; }
    public double getAveragePower(java.lang.String p0) { return 0.0; }
    public double getAverageBatteryDrainOrDefaultMa(long p0, double p1) { return 0.0; }
    public double getAverageBatteryDrainMa(long p0) { return 0.0; }
    public double getAveragePower(java.lang.String p0, int p1) { return 0.0; }
    public double getAveragePowerForOrdinal(java.lang.String p0, int p1, double p2) { return 0.0; }
    public double getAveragePowerForOrdinal(java.lang.String p0, int p1) { return 0.0; }
    public double getBatteryCapacity() { return 0.0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    public void dump(java.io.PrintWriter p0) {}

    private static class CpuClusterKey {
        public final java.lang.String freqKey = null;
        public final java.lang.String clusterPowerKey = null;
        public final java.lang.String corePowerKey = null;
        public final int numCpus = 0;
    }

    private static class CpuScalingPolicyPower {
        public final double policyPower = 0.0;
        public final double[] stepPower = null;
        public int[] powerBrackets;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerGroup {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Subsystem {
    }
}

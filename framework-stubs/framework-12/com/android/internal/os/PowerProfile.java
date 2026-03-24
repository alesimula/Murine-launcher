package com.android.internal.os;

public class PowerProfile {
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
    public static final java.lang.String POWER_AMBIENT_DISPLAY = "ambient.on";
    public static final java.lang.String POWER_SCREEN_ON = "screen.on";
    public static final java.lang.String POWER_RADIO_ON = "radio.on";
    public static final java.lang.String POWER_RADIO_SCANNING = "radio.scanning";
    public static final java.lang.String POWER_RADIO_ACTIVE = "radio.active";
    public static final java.lang.String POWER_SCREEN_FULL = "screen.full";
    public static final java.lang.String POWER_AUDIO = "audio";
    public static final java.lang.String POWER_VIDEO = "video";
    public static final java.lang.String POWER_FLASHLIGHT = "camera.flashlight";
    public static final java.lang.String POWER_MEMORY = "memory.bandwidths";
    public static final java.lang.String POWER_CAMERA = "camera.avg";
    public static final java.lang.String POWER_WIFI_BATCHED_SCAN = "wifi.batchedscan";
    public static final java.lang.String POWER_BATTERY_CAPACITY = "battery.capacity";
    static final java.util.HashMap<java.lang.String, java.lang.Double> sPowerItemMap = null;
    static final java.util.HashMap<java.lang.String, java.lang.Double[]> sPowerArrayMap = null;
    private static final java.lang.String TAG_DEVICE = "device";
    private static final java.lang.String TAG_ITEM = "item";
    private static final java.lang.String TAG_ARRAY = "array";
    private static final java.lang.String TAG_ARRAYITEM = "value";
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.Object sLock = null;
    private com.android.internal.os.PowerProfile.CpuClusterKey[] mCpuClusters;
    private static final java.lang.String CPU_PER_CLUSTER_CORE_COUNT = "cpu.clusters.cores";
    private static final java.lang.String CPU_CLUSTER_POWER_COUNT = "cpu.cluster_power.cluster";
    private static final java.lang.String CPU_CORE_SPEED_PREFIX = "cpu.core_speeds.cluster";
    private static final java.lang.String CPU_CORE_POWER_PREFIX = "cpu.core_power.cluster";
    public PowerProfile(android.content.Context p0) {}
    public PowerProfile(android.content.Context p0, boolean p1) {}
    private void readPowerValuesFromXml(android.content.Context p0, boolean p1) {}
    private void initCpuClusters() {}
    public int getNumCpuClusters() { return 0; }
    public int getNumCoresInCpuCluster(int p0) { return 0; }
    public int getNumSpeedStepsInCpuCluster(int p0) { return 0; }
    public double getAveragePowerForCpuCluster(int p0) { return 0.0; }
    public double getAveragePowerForCpuCore(int p0, int p1) { return 0.0; }
    public int getNumElements(java.lang.String p0) { return 0; }
    public double getAveragePowerOrDefault(java.lang.String p0, double p1) { return 0.0; }
    public double getAveragePower(java.lang.String p0) { return 0.0; }
    public double getAveragePower(java.lang.String p0, int p1) { return 0.0; }
    public double getBatteryCapacity() { return 0.0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    private void writePowerConstantToProto(android.util.proto.ProtoOutputStream p0, java.lang.String p1, long p2) {}
    private void writePowerConstantArrayToProto(android.util.proto.ProtoOutputStream p0, java.lang.String p1, long p2) {}

    public static class CpuClusterKey {
        private final java.lang.String freqKey = null;
        private final java.lang.String clusterPowerKey = null;
        private final java.lang.String corePowerKey = null;
        private final int numCpus = 0;
        private CpuClusterKey(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
    }
}

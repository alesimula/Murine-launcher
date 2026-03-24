package android.os;

public abstract class BatteryStats implements android.os.Parcelable {
    private static final java.lang.String TAG = "BatteryStats";
    private static final boolean LOCAL_LOGV = false;
    protected static final boolean SCREEN_OFF_RPM_STATS_ENABLED = false;
    public static final java.lang.String SERVICE_NAME = "batterystats";
    public static final int WAKE_TYPE_PARTIAL = 0;
    public static final int WAKE_TYPE_FULL = 1;
    public static final int WAKE_TYPE_WINDOW = 2;
    public static final int SENSOR = 3;
    public static final int WIFI_RUNNING = 4;
    public static final int FULL_WIFI_LOCK = 5;
    public static final int WIFI_SCAN = 6;
    public static final int WIFI_MULTICAST_ENABLED = 7;
    public static final int VIDEO_TURNED_ON = 8;
    public static final int VIBRATOR_ON = 9;
    public static final int FOREGROUND_ACTIVITY = 10;
    public static final int WIFI_BATCHED_SCAN = 11;
    public static final int PROCESS_STATE = 12;
    public static final int SYNC = 13;
    public static final int JOB = 14;
    public static final int AUDIO_TURNED_ON = 15;
    public static final int FLASHLIGHT_TURNED_ON = 16;
    public static final int CAMERA_TURNED_ON = 17;
    public static final int WAKE_TYPE_DRAW = 18;
    public static final int BLUETOOTH_SCAN_ON = 19;
    public static final int AGGREGATED_WAKE_TYPE_PARTIAL = 20;
    public static final int BLUETOOTH_UNOPTIMIZED_SCAN_ON = 21;
    public static final int FOREGROUND_SERVICE = 22;
    public static final int WIFI_AGGREGATE_MULTICAST_ENABLED = 23;
    public static final int STATS_SINCE_CHARGED = 0;
    @java.lang.Deprecated
    public static final int STATS_CURRENT = 1;
    @java.lang.Deprecated
    public static final int STATS_SINCE_UNPLUGGED = 2;
    private static final java.lang.String[] STAT_NAMES = null;
    static final int CHECKIN_VERSION = 35;
    private static final int BATTERY_STATS_CHECKIN_VERSION = 9;
    private static final long BYTES_PER_KB = 1024L;
    private static final long BYTES_PER_MB = 1048576L;
    private static final long BYTES_PER_GB = 1073741824L;
    public static final double MILLISECONDS_IN_HOUR = 3600000.0;
    private static final java.lang.String VERSION_DATA = "vers";
    private static final java.lang.String UID_DATA = "uid";
    private static final java.lang.String WAKEUP_ALARM_DATA = "wua";
    private static final java.lang.String APK_DATA = "apk";
    private static final java.lang.String PROCESS_DATA = "pr";
    private static final java.lang.String CPU_DATA = "cpu";
    private static final java.lang.String GLOBAL_CPU_FREQ_DATA = "gcf";
    private static final java.lang.String CPU_TIMES_AT_FREQ_DATA = "ctf";
    private static final java.lang.String RESOURCE_POWER_MANAGER_DATA = "rpm";
    private static final java.lang.String SENSOR_DATA = "sr";
    private static final java.lang.String VIBRATOR_DATA = "vib";
    private static final java.lang.String FOREGROUND_ACTIVITY_DATA = "fg";
    private static final java.lang.String FOREGROUND_SERVICE_DATA = "fgs";
    private static final java.lang.String STATE_TIME_DATA = "st";
    private static final java.lang.String WAKELOCK_DATA = "wl";
    private static final java.lang.String AGGREGATED_WAKELOCK_DATA = "awl";
    private static final java.lang.String SYNC_DATA = "sy";
    private static final java.lang.String JOB_DATA = "jb";
    private static final java.lang.String JOB_COMPLETION_DATA = "jbc";
    private static final java.lang.String JOBS_DEFERRED_DATA = "jbd";
    private static final java.lang.String KERNEL_WAKELOCK_DATA = "kwl";
    private static final java.lang.String WAKEUP_REASON_DATA = "wr";
    private static final java.lang.String NETWORK_DATA = "nt";
    private static final java.lang.String USER_ACTIVITY_DATA = "ua";
    private static final java.lang.String BATTERY_DATA = "bt";
    private static final java.lang.String BATTERY_DISCHARGE_DATA = "dc";
    private static final java.lang.String BATTERY_LEVEL_DATA = "lv";
    private static final java.lang.String GLOBAL_WIFI_DATA = "gwfl";
    private static final java.lang.String WIFI_DATA = "wfl";
    private static final java.lang.String GLOBAL_WIFI_CONTROLLER_DATA = "gwfcd";
    private static final java.lang.String WIFI_CONTROLLER_DATA = "wfcd";
    private static final java.lang.String GLOBAL_BLUETOOTH_CONTROLLER_DATA = "gble";
    private static final java.lang.String BLUETOOTH_CONTROLLER_DATA = "ble";
    private static final java.lang.String BLUETOOTH_MISC_DATA = "blem";
    private static final java.lang.String MISC_DATA = "m";
    private static final java.lang.String GLOBAL_NETWORK_DATA = "gn";
    private static final java.lang.String GLOBAL_MODEM_CONTROLLER_DATA = "gmcd";
    private static final java.lang.String MODEM_CONTROLLER_DATA = "mcd";
    private static final java.lang.String HISTORY_STRING_POOL = "hsp";
    private static final java.lang.String HISTORY_DATA = "h";
    private static final java.lang.String SCREEN_BRIGHTNESS_DATA = "br";
    private static final java.lang.String SIGNAL_STRENGTH_TIME_DATA = "sgt";
    private static final java.lang.String SIGNAL_SCANNING_TIME_DATA = "sst";
    private static final java.lang.String SIGNAL_STRENGTH_COUNT_DATA = "sgc";
    private static final java.lang.String DATA_CONNECTION_TIME_DATA = "dct";
    private static final java.lang.String DATA_CONNECTION_COUNT_DATA = "dcc";
    private static final java.lang.String WIFI_STATE_TIME_DATA = "wst";
    private static final java.lang.String WIFI_STATE_COUNT_DATA = "wsc";
    private static final java.lang.String WIFI_SUPPL_STATE_TIME_DATA = "wsst";
    private static final java.lang.String WIFI_SUPPL_STATE_COUNT_DATA = "wssc";
    private static final java.lang.String WIFI_SIGNAL_STRENGTH_TIME_DATA = "wsgt";
    private static final java.lang.String WIFI_SIGNAL_STRENGTH_COUNT_DATA = "wsgc";
    private static final java.lang.String POWER_USE_SUMMARY_DATA = "pws";
    private static final java.lang.String POWER_USE_ITEM_DATA = "pwi";
    private static final java.lang.String DISCHARGE_STEP_DATA = "dsd";
    private static final java.lang.String CHARGE_STEP_DATA = "csd";
    private static final java.lang.String DISCHARGE_TIME_REMAIN_DATA = "dtr";
    private static final java.lang.String CHARGE_TIME_REMAIN_DATA = "ctr";
    private static final java.lang.String FLASHLIGHT_DATA = "fla";
    private static final java.lang.String CAMERA_DATA = "cam";
    private static final java.lang.String VIDEO_DATA = "vid";
    private static final java.lang.String AUDIO_DATA = "aud";
    private static final java.lang.String WIFI_MULTICAST_TOTAL_DATA = "wmct";
    private static final java.lang.String WIFI_MULTICAST_DATA = "wmc";
    public static final java.lang.String RESULT_RECEIVER_CONTROLLER_KEY = "controller_activity";
    private final java.lang.StringBuilder mFormatBuilder = null;
    private final java.util.Formatter mFormatter = null;
    private static final java.lang.String CELLULAR_CONTROLLER_NAME = "Cellular";
    private static final java.lang.String WIFI_CONTROLLER_NAME = "WiFi";
    public static final java.lang.String UID_TIMES_TYPE_ALL = "A";
    public static final long[] JOB_FRESHNESS_BUCKETS = null;
    public static final int SCREEN_BRIGHTNESS_DARK = 0;
    public static final int SCREEN_BRIGHTNESS_DIM = 1;
    public static final int SCREEN_BRIGHTNESS_MEDIUM = 2;
    public static final int SCREEN_BRIGHTNESS_LIGHT = 3;
    public static final int SCREEN_BRIGHTNESS_BRIGHT = 4;
    static final java.lang.String[] SCREEN_BRIGHTNESS_NAMES = null;
    static final java.lang.String[] SCREEN_BRIGHTNESS_SHORT_NAMES = null;
    public static final int NUM_SCREEN_BRIGHTNESS_BINS = 5;
    public static final int DEVICE_IDLE_MODE_OFF = 0;
    public static final int DEVICE_IDLE_MODE_LIGHT = 1;
    public static final int DEVICE_IDLE_MODE_DEEP = 2;
    public static final int DATA_CONNECTION_OUT_OF_SERVICE = 0;
    public static final int DATA_CONNECTION_EMERGENCY_SERVICE = Integer.valueOf(0);
    public static final int DATA_CONNECTION_OTHER = Integer.valueOf(0);
    static final java.lang.String[] DATA_CONNECTION_NAMES = null;
    public static final int NUM_DATA_CONNECTION_TYPES = Integer.valueOf(0);
    static final java.lang.String[] WIFI_SUPPL_STATE_NAMES = null;
    static final java.lang.String[] WIFI_SUPPL_STATE_SHORT_NAMES = null;
    public static final long POWER_DATA_UNAVAILABLE = -1L;
    public static final android.os.BatteryStats.BitDescription[] HISTORY_STATE_DESCRIPTIONS = null;
    public static final android.os.BatteryStats.BitDescription[] HISTORY_STATE2_DESCRIPTIONS = null;
    public static final java.lang.String[] HISTORY_EVENT_NAMES = null;
    public static final java.lang.String[] HISTORY_EVENT_CHECKIN_NAMES = null;
    private static final android.os.BatteryStats.IntToString sUidToString = null;
    private static final android.os.BatteryStats.IntToString sIntToString = null;
    public static final android.os.BatteryStats.IntToString[] HISTORY_EVENT_INT_FORMATTERS = null;
    static final java.lang.String[] WIFI_STATE_NAMES = null;
    public static final int NUM_WIFI_SIGNAL_STRENGTH_BINS = 5;
    public static final int NETWORK_MOBILE_RX_DATA = 0;
    public static final int NETWORK_MOBILE_TX_DATA = 1;
    public static final int NETWORK_WIFI_RX_DATA = 2;
    public static final int NETWORK_WIFI_TX_DATA = 3;
    public static final int NETWORK_BT_RX_DATA = 4;
    public static final int NETWORK_BT_TX_DATA = 5;
    public static final int NETWORK_MOBILE_BG_RX_DATA = 6;
    public static final int NETWORK_MOBILE_BG_TX_DATA = 7;
    public static final int NETWORK_WIFI_BG_RX_DATA = 8;
    public static final int NETWORK_WIFI_BG_TX_DATA = 9;
    public static final int NUM_NETWORK_ACTIVITY_TYPES = 10;
    public static final long STEP_LEVEL_TIME_MASK = 1099511627775L;
    public static final long STEP_LEVEL_LEVEL_MASK = 280375465082880L;
    public static final int STEP_LEVEL_LEVEL_SHIFT = 40;
    public static final long STEP_LEVEL_INITIAL_MODE_MASK = 71776119061217280L;
    public static final int STEP_LEVEL_INITIAL_MODE_SHIFT = 48;
    public static final long STEP_LEVEL_MODIFIED_MODE_MASK = -72057594037927936L;
    public static final int STEP_LEVEL_MODIFIED_MODE_SHIFT = 56;
    public static final int STEP_LEVEL_MODE_SCREEN_STATE = 3;
    public static final int MAX_TRACKED_SCREEN_STATE = 4;
    public static final int STEP_LEVEL_MODE_POWER_SAVE = 4;
    public static final int STEP_LEVEL_MODE_DEVICE_IDLE = 8;
    public static final int[] STEP_LEVEL_MODES_OF_INTEREST = null;
    public static final int[] STEP_LEVEL_MODE_VALUES = null;
    public static final java.lang.String[] STEP_LEVEL_MODE_LABELS = null;
    public static final int DUMP_CHARGED_ONLY = 2;
    public static final int DUMP_DAILY_ONLY = 4;
    public static final int DUMP_HISTORY_ONLY = 8;
    public static final int DUMP_INCLUDE_HISTORY = 16;
    public static final int DUMP_VERBOSE = 32;
    public static final int DUMP_DEVICE_WIFI_ONLY = 64;
    public BatteryStats() {}
    public static int mapToInternalProcessState(int p0) { return 0; }
    public abstract android.os.BatteryStats.DailyItem getDailyItemLocked(int p0);
    public abstract long getCurrentDailyStartTime();
    public abstract long getNextMinDailyDeadline();
    public abstract long getNextMaxDailyDeadline();
    public abstract long[] getCpuFreqs();
    public abstract void commitCurrentHistoryBatchLocked();
    public abstract int getHistoryTotalSize();
    public abstract int getHistoryUsedSize();
    public abstract boolean startIteratingHistoryLocked();
    public abstract int getHistoryStringPoolSize();
    public abstract int getHistoryStringPoolBytes();
    public abstract java.lang.String getHistoryTagPoolString(int p0);
    public abstract int getHistoryTagPoolUid(int p0);
    public abstract boolean getNextHistoryLocked(android.os.BatteryStats.HistoryItem p0);
    public abstract void finishIteratingHistoryLocked();
    public abstract long getHistoryBaseTime();
    public abstract int getStartCount();
    public abstract long getScreenOnTime(long p0, int p1);
    public abstract int getScreenOnCount(int p0);
    public abstract long getScreenDozeTime(long p0, int p1);
    public abstract int getScreenDozeCount(int p0);
    public abstract long getInteractiveTime(long p0, int p1);
    public abstract long getScreenBrightnessTime(int p0, long p1, int p2);
    public abstract android.os.BatteryStats.Timer getScreenBrightnessTimer(int p0);
    public abstract long getPowerSaveModeEnabledTime(long p0, int p1);
    public abstract int getPowerSaveModeEnabledCount(int p0);
    public abstract long getDeviceIdleModeTime(int p0, long p1, int p2);
    public abstract int getDeviceIdleModeCount(int p0, int p1);
    public abstract long getLongestDeviceIdleModeTime(int p0);
    public abstract long getDeviceIdlingTime(int p0, long p1, int p2);
    public abstract int getDeviceIdlingCount(int p0, int p1);
    public abstract int getNumConnectivityChange(int p0);
    public abstract long getGpsSignalQualityTime(int p0, long p1, int p2);
    public abstract long getGpsBatteryDrainMaMs();
    public abstract long getPhoneOnTime(long p0, int p1);
    public abstract int getPhoneOnCount(int p0);
    public abstract long getPhoneSignalStrengthTime(int p0, long p1, int p2);
    public abstract long getPhoneSignalScanningTime(long p0, int p1);
    public abstract android.os.BatteryStats.Timer getPhoneSignalScanningTimer();
    public abstract int getPhoneSignalStrengthCount(int p0, int p1);
    protected abstract android.os.BatteryStats.Timer getPhoneSignalStrengthTimer(int p0);
    public abstract long getMobileRadioActiveTime(long p0, int p1);
    public abstract int getMobileRadioActiveCount(int p0);
    public abstract long getMobileRadioActiveAdjustedTime(int p0);
    public abstract long getMobileRadioActiveUnknownTime(int p0);
    public abstract int getMobileRadioActiveUnknownCount(int p0);
    public abstract long getPhoneDataConnectionTime(int p0, long p1, int p2);
    public abstract int getPhoneDataConnectionCount(int p0, int p1);
    public abstract android.os.BatteryStats.Timer getPhoneDataConnectionTimer(int p0);
    public abstract long getBluetoothMeasuredBatteryConsumptionUC();
    public abstract long getCpuMeasuredBatteryConsumptionUC();
    public abstract long getGnssMeasuredBatteryConsumptionUC();
    public abstract long getMobileRadioMeasuredBatteryConsumptionUC();
    public abstract long getScreenOnMeasuredBatteryConsumptionUC();
    public abstract long getScreenDozeMeasuredBatteryConsumptionUC();
    public abstract long getWifiMeasuredBatteryConsumptionUC();
    public abstract long[] getCustomConsumerMeasuredBatteryConsumptionUC();
    public abstract java.lang.String[] getCustomEnergyConsumerNames();
    public abstract long getWifiMulticastWakelockTime(long p0, int p1);
    public abstract int getWifiMulticastWakelockCount(int p0);
    public abstract long getWifiOnTime(long p0, int p1);
    public abstract long getWifiActiveTime(long p0, int p1);
    public abstract long getGlobalWifiRunningTime(long p0, int p1);
    public abstract long getWifiStateTime(int p0, long p1, int p2);
    public abstract int getWifiStateCount(int p0, int p1);
    public abstract android.os.BatteryStats.Timer getWifiStateTimer(int p0);
    public abstract long getWifiSupplStateTime(int p0, long p1, int p2);
    public abstract int getWifiSupplStateCount(int p0, int p1);
    public abstract android.os.BatteryStats.Timer getWifiSupplStateTimer(int p0);
    public abstract long getWifiSignalStrengthTime(int p0, long p1, int p2);
    public abstract int getWifiSignalStrengthCount(int p0, int p1);
    public abstract android.os.BatteryStats.Timer getWifiSignalStrengthTimer(int p0);
    public abstract long getFlashlightOnTime(long p0, int p1);
    public abstract long getFlashlightOnCount(int p0);
    public abstract long getCameraOnTime(long p0, int p1);
    public abstract long getBluetoothScanTime(long p0, int p1);
    public abstract long getNetworkActivityBytes(int p0, int p1);
    public abstract long getNetworkActivityPackets(int p0, int p1);
    public abstract boolean hasWifiActivityReporting();
    public abstract android.os.BatteryStats.ControllerActivityCounter getWifiControllerActivity();
    public abstract boolean hasBluetoothActivityReporting();
    public abstract android.os.BatteryStats.ControllerActivityCounter getBluetoothControllerActivity();
    public abstract boolean hasModemActivityReporting();
    public abstract android.os.BatteryStats.ControllerActivityCounter getModemControllerActivity();
    public abstract long getStartClockTime();
    public abstract java.lang.String getStartPlatformVersion();
    public abstract java.lang.String getEndPlatformVersion();
    public abstract int getParcelVersion();
    public abstract boolean getIsOnBattery();
    public abstract long getStatsStartRealtime();
    public abstract android.util.SparseArray<? extends android.os.BatteryStats.Uid> getUidStats();
    public abstract long getBatteryUptime(long p0);
    public abstract long getBatteryRealtime(long p0);
    public abstract int getDischargeStartLevel();
    public abstract int getDischargeCurrentLevel();
    public abstract int getLowDischargeAmountSinceCharge();
    public abstract int getHighDischargeAmountSinceCharge();
    public abstract int getDischargeAmount(int p0);
    public abstract int getDischargeAmountScreenOn();
    public abstract int getDischargeAmountScreenOnSinceCharge();
    public abstract int getDischargeAmountScreenOff();
    public abstract int getDischargeAmountScreenOffSinceCharge();
    public abstract int getDischargeAmountScreenDoze();
    public abstract int getDischargeAmountScreenDozeSinceCharge();
    public abstract long[] getSystemServiceTimeAtCpuSpeeds();
    public abstract long computeBatteryUptime(long p0, int p1);
    public abstract long computeBatteryRealtime(long p0, int p1);
    public abstract long computeBatteryScreenOffUptime(long p0, int p1);
    public abstract long computeBatteryScreenOffRealtime(long p0, int p1);
    public abstract long computeUptime(long p0, int p1);
    public abstract long computeRealtime(long p0, int p1);
    public abstract long computeBatteryTimeRemaining(long p0);
    public abstract long getUahDischargeScreenOff(int p0);
    public abstract long getUahDischargeScreenDoze(int p0);
    public abstract long getUahDischarge(int p0);
    public abstract long getUahDischargeLightDoze(int p0);
    public abstract long getUahDischargeDeepDoze(int p0);
    public abstract int getEstimatedBatteryCapacity();
    public abstract int getMinLearnedBatteryCapacity();
    public abstract int getMaxLearnedBatteryCapacity();
    public abstract int getLearnedBatteryCapacity();
    public abstract android.os.BatteryStats.LevelStepTracker getDischargeLevelStepTracker();
    public abstract android.os.BatteryStats.LevelStepTracker getDailyDischargeLevelStepTracker();
    public abstract long computeChargeTimeRemaining(long p0);
    public abstract android.os.BatteryStats.LevelStepTracker getChargeLevelStepTracker();
    public abstract android.os.BatteryStats.LevelStepTracker getDailyChargeLevelStepTracker();
    public abstract java.util.ArrayList<android.os.BatteryStats.PackageChange> getDailyPackageChanges();
    public abstract java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Timer> getWakeupReasonStats();
    public abstract java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Timer> getKernelWakelockStats();
    public abstract java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Timer> getRpmStats();
    public abstract java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Timer> getScreenOffRpmStats();
    public abstract android.util.LongSparseArray<? extends android.os.BatteryStats.Timer> getKernelMemoryStats();
    public abstract void writeToParcelWithoutUids(android.os.Parcel p0, int p1);
    private static final void formatTimeRaw(java.lang.StringBuilder p0, long p1) {}
    public static final void formatTimeMs(java.lang.StringBuilder p0, long p1) {}
    public static final void formatTimeMsNoSpace(java.lang.StringBuilder p0, long p1) {}
    public final java.lang.String formatRatioLocked(long p0, long p1) { return null; }
    final java.lang.String formatBytesLocked(long p0) { return null; }
    private static long roundUsToMs(long p0) { return 0L; }
    private static long computeWakeLock(android.os.BatteryStats.Timer p0, long p1, int p2) { return 0L; }
    private static final java.lang.String printWakeLock(java.lang.StringBuilder p0, android.os.BatteryStats.Timer p1, long p2, java.lang.String p3, int p4, java.lang.String p5) { return null; }
    private static final boolean printTimer(java.io.PrintWriter p0, java.lang.StringBuilder p1, android.os.BatteryStats.Timer p2, long p3, int p4, java.lang.String p5, java.lang.String p6) { return false; }
    private static final java.lang.String printWakeLockCheckin(java.lang.StringBuilder p0, android.os.BatteryStats.Timer p1, long p2, java.lang.String p3, int p4, java.lang.String p5) { return null; }
    private static final void dumpLineHeader(java.io.PrintWriter p0, int p1, java.lang.String p2, java.lang.String p3) {}
    private static final void dumpLine(java.io.PrintWriter p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.Object... p4) {}
    private static final void dumpTimer(java.io.PrintWriter p0, int p1, java.lang.String p2, java.lang.String p3, android.os.BatteryStats.Timer p4, long p5, int p6) {}
    private static void dumpTimer(android.util.proto.ProtoOutputStream p0, long p1, android.os.BatteryStats.Timer p2, long p3, int p4) {}
    private static boolean controllerActivityHasData(android.os.BatteryStats.ControllerActivityCounter p0, int p1) { return false; }
    private static final void dumpControllerActivityLine(java.io.PrintWriter p0, int p1, java.lang.String p2, java.lang.String p3, android.os.BatteryStats.ControllerActivityCounter p4, int p5) {}
    private static void dumpControllerActivityProto(android.util.proto.ProtoOutputStream p0, long p1, android.os.BatteryStats.ControllerActivityCounter p2, int p3) {}
    private final void printControllerActivityIfInteresting(java.io.PrintWriter p0, java.lang.StringBuilder p1, java.lang.String p2, java.lang.String p3, android.os.BatteryStats.ControllerActivityCounter p4, int p5) {}
    private final void printControllerActivity(java.io.PrintWriter p0, java.lang.StringBuilder p1, java.lang.String p2, java.lang.String p3, android.os.BatteryStats.ControllerActivityCounter p4, int p5) {}
    public final void dumpCheckinLocked(android.content.Context p0, java.io.PrintWriter p1, int p2, int p3) {}
    public final void dumpCheckinLocked(android.content.Context p0, java.io.PrintWriter p1, int p2, int p3, boolean p4) {}
    private void printmAh(java.io.PrintWriter p0, double p1) {}
    private void printmAh(java.lang.StringBuilder p0, double p1) {}
    public final void dumpLocked(android.content.Context p0, java.io.PrintWriter p1, java.lang.String p2, int p3, int p4) {}
    public final void dumpLocked(android.content.Context p0, java.io.PrintWriter p1, java.lang.String p2, int p3, int p4, boolean p5) {}
    static void printBitDescriptions(java.lang.StringBuilder p0, int p1, int p2, android.os.BatteryStats.HistoryTag p3, android.os.BatteryStats.BitDescription[] p4, boolean p5) {}
    public void prepareForDumpLocked() {}
    private void printSizeValue(java.io.PrintWriter p0, long p1) {}
    private static boolean dumpTimeEstimate(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4) { return false; }
    private static boolean dumpDurationSteps(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, android.os.BatteryStats.LevelStepTracker p3, boolean p4) { return false; }
    private static void dumpDurationSteps(android.util.proto.ProtoOutputStream p0, long p1, android.os.BatteryStats.LevelStepTracker p2) {}
    private void dumpHistoryLocked(java.io.PrintWriter p0, int p1, long p2, boolean p3) {}
    private void dumpDailyLevelStepSummary(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, android.os.BatteryStats.LevelStepTracker p3, java.lang.StringBuilder p4, int[] p5) {}
    private void dumpDailyPackageChanges(java.io.PrintWriter p0, java.lang.String p1, java.util.ArrayList<android.os.BatteryStats.PackageChange> p2) {}
    public void dumpLocked(android.content.Context p0, java.io.PrintWriter p1, int p2, int p3, long p4) {}
    public void dumpCheckinLocked(android.content.Context p0, java.io.PrintWriter p1, java.util.List<android.content.pm.ApplicationInfo> p2, int p3, long p4) {}
    public void dumpProtoLocked(android.content.Context p0, java.io.FileDescriptor p1, java.util.List<android.content.pm.ApplicationInfo> p2, int p3, long p4) {}
    private void dumpProtoAppsLocked(android.util.proto.ProtoOutputStream p0, com.android.internal.os.BatteryStatsHelper p1, java.util.List<android.content.pm.ApplicationInfo> p2) {}
    private void dumpProtoHistoryLocked(android.util.proto.ProtoOutputStream p0, int p1, long p2) {}
    private void dumpProtoSystemLocked(android.util.proto.ProtoOutputStream p0, com.android.internal.os.BatteryStatsHelper p1) {}

    public static final class BitDescription {
        public final int mask = 0;
        public final int shift = 0;
        public final java.lang.String name = null;
        public final java.lang.String shortName = null;
        public final java.lang.String[] values = null;
        public final java.lang.String[] shortValues = null;
        public BitDescription(int p0, java.lang.String p1, java.lang.String p2) {}
        public BitDescription(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4, java.lang.String[] p5) {}
    }

    public static abstract class ControllerActivityCounter {
        public ControllerActivityCounter() {}
        public abstract android.os.BatteryStats.LongCounter getIdleTimeCounter();
        public abstract android.os.BatteryStats.LongCounter getScanTimeCounter();
        public abstract android.os.BatteryStats.LongCounter getSleepTimeCounter();
        public abstract android.os.BatteryStats.LongCounter getRxTimeCounter();
        public abstract android.os.BatteryStats.LongCounter[] getTxTimeCounters();
        public abstract android.os.BatteryStats.LongCounter getPowerCounter();
        public abstract android.os.BatteryStats.LongCounter getMonitoredRailChargeConsumedMaMs();
    }

    public static abstract class Counter {
        public Counter() {}
        public abstract int getCountLocked(int p0);
        public abstract void logState(android.util.Printer p0, java.lang.String p1);
    }

    public static final class DailyItem {
        public long mStartTime;
        public long mEndTime;
        public android.os.BatteryStats.LevelStepTracker mDischargeSteps;
        public android.os.BatteryStats.LevelStepTracker mChargeSteps;
        public java.util.ArrayList<android.os.BatteryStats.PackageChange> mPackageChanges;
        public DailyItem() {}
    }

    public static final class HistoryEventTracker {
        private final java.util.HashMap<java.lang.String, android.util.SparseIntArray>[] mActiveEvents = null;
        public HistoryEventTracker() {}
        public boolean updateState(int p0, java.lang.String p1, int p2, int p3) { return false; }
        public void removeEvents(int p0) {}
        public java.util.HashMap<java.lang.String, android.util.SparseIntArray> getStateForEvent(int p0) { return null; }
    }

    public static final class HistoryItem {
        public android.os.BatteryStats.HistoryItem next;
        public long time;
        public static final byte CMD_UPDATE = 0;
        public static final byte CMD_NULL = -1;
        public static final byte CMD_START = 4;
        public static final byte CMD_CURRENT_TIME = 5;
        public static final byte CMD_OVERFLOW = 6;
        public static final byte CMD_RESET = 7;
        public static final byte CMD_SHUTDOWN = 8;
        public byte cmd;
        public byte batteryLevel;
        public byte batteryStatus;
        public byte batteryHealth;
        public byte batteryPlugType;
        public short batteryTemperature;
        public char batteryVoltage;
        public int batteryChargeUah;
        public double modemRailChargeMah;
        public double wifiRailChargeMah;
        public static final int STATE_BRIGHTNESS_SHIFT = 0;
        public static final int STATE_BRIGHTNESS_MASK = 7;
        public static final int STATE_PHONE_SIGNAL_STRENGTH_SHIFT = 3;
        public static final int STATE_PHONE_SIGNAL_STRENGTH_MASK = 56;
        public static final int STATE_PHONE_STATE_SHIFT = 6;
        public static final int STATE_PHONE_STATE_MASK = 448;
        public static final int STATE_DATA_CONNECTION_SHIFT = 9;
        public static final int STATE_DATA_CONNECTION_MASK = 15872;
        public static final int STATE_CPU_RUNNING_FLAG = -2147483648;
        public static final int STATE_WAKE_LOCK_FLAG = 1073741824;
        public static final int STATE_GPS_ON_FLAG = 536870912;
        public static final int STATE_WIFI_FULL_LOCK_FLAG = 268435456;
        public static final int STATE_WIFI_SCAN_FLAG = 134217728;
        public static final int STATE_WIFI_RADIO_ACTIVE_FLAG = 67108864;
        public static final int STATE_MOBILE_RADIO_ACTIVE_FLAG = 33554432;
        private static final int STATE_RESERVED_0 = 16777216;
        public static final int STATE_SENSOR_ON_FLAG = 8388608;
        public static final int STATE_AUDIO_ON_FLAG = 4194304;
        public static final int STATE_PHONE_SCANNING_FLAG = 2097152;
        public static final int STATE_SCREEN_ON_FLAG = 1048576;
        public static final int STATE_BATTERY_PLUGGED_FLAG = 524288;
        public static final int STATE_SCREEN_DOZE_FLAG = 262144;
        public static final int STATE_WIFI_MULTICAST_ON_FLAG = 65536;
        public static final int MOST_INTERESTING_STATES = 1835008;
        public static final int SETTLE_TO_ZERO_STATES = -1900544;
        public int states;
        public static final int STATE2_WIFI_SUPPL_STATE_SHIFT = 0;
        public static final int STATE2_WIFI_SUPPL_STATE_MASK = 15;
        public static final int STATE2_WIFI_SIGNAL_STRENGTH_SHIFT = 4;
        public static final int STATE2_WIFI_SIGNAL_STRENGTH_MASK = 112;
        public static final int STATE2_GPS_SIGNAL_QUALITY_SHIFT = 7;
        public static final int STATE2_GPS_SIGNAL_QUALITY_MASK = 128;
        public static final int STATE2_POWER_SAVE_FLAG = -2147483648;
        public static final int STATE2_VIDEO_ON_FLAG = 1073741824;
        public static final int STATE2_WIFI_RUNNING_FLAG = 536870912;
        public static final int STATE2_WIFI_ON_FLAG = 268435456;
        public static final int STATE2_FLASHLIGHT_FLAG = 134217728;
        public static final int STATE2_DEVICE_IDLE_SHIFT = 25;
        public static final int STATE2_DEVICE_IDLE_MASK = 100663296;
        public static final int STATE2_CHARGING_FLAG = 16777216;
        public static final int STATE2_PHONE_IN_CALL_FLAG = 8388608;
        public static final int STATE2_BLUETOOTH_ON_FLAG = 4194304;
        public static final int STATE2_CAMERA_FLAG = 2097152;
        public static final int STATE2_BLUETOOTH_SCAN_FLAG = 1048576;
        public static final int STATE2_CELLULAR_HIGH_TX_POWER_FLAG = 524288;
        public static final int STATE2_USB_DATA_LINK_FLAG = 262144;
        public static final int MOST_INTERESTING_STATES2 = -1749024768;
        public static final int SETTLE_TO_ZERO_STATES2 = 1748959232;
        public int states2;
        public android.os.BatteryStats.HistoryTag wakelockTag;
        public android.os.BatteryStats.HistoryTag wakeReasonTag;
        public android.os.BatteryStats.HistoryStepDetails stepDetails;
        public static final int EVENT_FLAG_START = 32768;
        public static final int EVENT_FLAG_FINISH = 16384;
        public static final int EVENT_NONE = 0;
        public static final int EVENT_PROC = 1;
        public static final int EVENT_FOREGROUND = 2;
        public static final int EVENT_TOP = 3;
        public static final int EVENT_SYNC = 4;
        public static final int EVENT_WAKE_LOCK = 5;
        public static final int EVENT_JOB = 6;
        public static final int EVENT_USER_RUNNING = 7;
        public static final int EVENT_USER_FOREGROUND = 8;
        public static final int EVENT_CONNECTIVITY_CHANGED = 9;
        public static final int EVENT_ACTIVE = 10;
        public static final int EVENT_PACKAGE_INSTALLED = 11;
        public static final int EVENT_PACKAGE_UNINSTALLED = 12;
        public static final int EVENT_ALARM = 13;
        public static final int EVENT_COLLECT_EXTERNAL_STATS = 14;
        public static final int EVENT_PACKAGE_INACTIVE = 15;
        public static final int EVENT_PACKAGE_ACTIVE = 16;
        public static final int EVENT_TEMP_WHITELIST = 17;
        public static final int EVENT_SCREEN_WAKE_UP = 18;
        public static final int EVENT_WAKEUP_AP = 19;
        public static final int EVENT_LONG_WAKE_LOCK = 20;
        public static final int EVENT_COUNT = 22;
        public static final int EVENT_TYPE_MASK = -49153;
        public static final int EVENT_PROC_START = 32769;
        public static final int EVENT_PROC_FINISH = 16385;
        public static final int EVENT_FOREGROUND_START = 32770;
        public static final int EVENT_FOREGROUND_FINISH = 16386;
        public static final int EVENT_TOP_START = 32771;
        public static final int EVENT_TOP_FINISH = 16387;
        public static final int EVENT_SYNC_START = 32772;
        public static final int EVENT_SYNC_FINISH = 16388;
        public static final int EVENT_WAKE_LOCK_START = 32773;
        public static final int EVENT_WAKE_LOCK_FINISH = 16389;
        public static final int EVENT_JOB_START = 32774;
        public static final int EVENT_JOB_FINISH = 16390;
        public static final int EVENT_USER_RUNNING_START = 32775;
        public static final int EVENT_USER_RUNNING_FINISH = 16391;
        public static final int EVENT_USER_FOREGROUND_START = 32776;
        public static final int EVENT_USER_FOREGROUND_FINISH = 16392;
        public static final int EVENT_ALARM_START = 32781;
        public static final int EVENT_ALARM_FINISH = 16397;
        public static final int EVENT_TEMP_WHITELIST_START = 32785;
        public static final int EVENT_TEMP_WHITELIST_FINISH = 16401;
        public static final int EVENT_LONG_WAKE_LOCK_START = 32788;
        public static final int EVENT_LONG_WAKE_LOCK_FINISH = 16404;
        public int eventCode;
        public android.os.BatteryStats.HistoryTag eventTag;
        public long currentTime;
        public int numReadInts;
        public final android.os.BatteryStats.HistoryTag localWakelockTag = null;
        public final android.os.BatteryStats.HistoryTag localWakeReasonTag = null;
        public final android.os.BatteryStats.HistoryTag localEventTag = null;
        public boolean isDeltaData() { return false; }
        public HistoryItem() {}
        public HistoryItem(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public void clear() {}
        public void setTo(android.os.BatteryStats.HistoryItem p0) {}
        public void setTo(long p0, byte p1, android.os.BatteryStats.HistoryItem p2) {}
        private void setToCommon(android.os.BatteryStats.HistoryItem p0) {}
        public boolean sameNonEvent(android.os.BatteryStats.HistoryItem p0) { return false; }
        public boolean same(android.os.BatteryStats.HistoryItem p0) { return false; }
    }

    public static class HistoryPrinter {
        int oldState;
        int oldState2;
        int oldLevel;
        int oldStatus;
        int oldHealth;
        int oldPlug;
        int oldTemp;
        int oldVolt;
        int oldChargeMAh;
        double oldModemRailChargeMah;
        double oldWifiRailChargeMah;
        long lastTime;
        public HistoryPrinter() {}
        void reset() {}
        public void printNextItem(java.io.PrintWriter p0, android.os.BatteryStats.HistoryItem p1, long p2, boolean p3, boolean p4) {}
        public void printNextItem(android.util.proto.ProtoOutputStream p0, android.os.BatteryStats.HistoryItem p1, long p2, boolean p3) {}
        private java.lang.String printNextItem(android.os.BatteryStats.HistoryItem p0, long p1, boolean p2, boolean p3) { return null; }
        private void printStepCpuUidDetails(java.lang.StringBuilder p0, int p1, int p2, int p3) {}
        private void printStepCpuUidCheckinDetails(java.lang.StringBuilder p0, int p1, int p2, int p3) {}
    }

    public static final class HistoryStepDetails {
        public int userTime;
        public int systemTime;
        public int appCpuUid1;
        public int appCpuUTime1;
        public int appCpuSTime1;
        public int appCpuUid2;
        public int appCpuUTime2;
        public int appCpuSTime2;
        public int appCpuUid3;
        public int appCpuUTime3;
        public int appCpuSTime3;
        public int statUserTime;
        public int statSystemTime;
        public int statIOWaitTime;
        public int statIrqTime;
        public int statSoftIrqTime;
        public int statIdlTime;
        public java.lang.String statSubsystemPowerState;
        public HistoryStepDetails() {}
        public void clear() {}
        public void writeToParcel(android.os.Parcel p0) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }

    public static final class HistoryTag {
        public java.lang.String string;
        public int uid;
        public int poolIdx;
        public HistoryTag() {}
        public void setTo(android.os.BatteryStats.HistoryTag p0) {}
        public void setTo(java.lang.String p0, int p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.FunctionalInterface
    public static interface IntToString {
        public java.lang.String applyAsString(int p0);
    }

    public static final class LevelStepTracker {
        public long mLastStepTime;
        public int mNumStepDurations;
        public final long[] mStepDurations = null;
        public LevelStepTracker(int p0) {}
        public LevelStepTracker(int p0, long[] p1) {}
        public long getDurationAt(int p0) { return 0L; }
        public int getLevelAt(int p0) { return 0; }
        public int getInitModeAt(int p0) { return 0; }
        public int getModModeAt(int p0) { return 0; }
        private void appendHex(long p0, int p1, java.lang.StringBuilder p2) {}
        public void encodeEntryAt(int p0, java.lang.StringBuilder p1) {}
        public void decodeEntryAt(int p0, java.lang.String p1) {}
        public void init() {}
        public void clearTime() {}
        public long computeTimePerLevel() { return 0L; }
        public long computeTimeEstimate(long p0, long p1, int[] p2) { return 0L; }
        public void addLevelSteps(int p0, long p1, long p2) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0) {}
    }

    public static abstract class LongCounter {
        public LongCounter() {}
        public abstract long getCountLocked(int p0);
        public abstract void logState(android.util.Printer p0, java.lang.String p1);
    }

    public static abstract class LongCounterArray {
        public LongCounterArray() {}
        public abstract long[] getCountsLocked(int p0);
        public abstract void logState(android.util.Printer p0, java.lang.String p1);
    }

    public static final class PackageChange {
        public java.lang.String mPackageName;
        public boolean mUpdate;
        public long mVersionCode;
        public PackageChange() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatName {
    }

    public static abstract class Timer {
        public Timer() {}
        public abstract int getCountLocked(int p0);
        public abstract long getTotalTimeLocked(long p0, int p1);
        public abstract long getTimeSinceMarkLocked(long p0);
        public long getMaxDurationMsLocked(long p0) { return 0L; }
        public long getCurrentDurationMsLocked(long p0) { return 0L; }
        public long getTotalDurationMsLocked(long p0) { return 0L; }
        public android.os.BatteryStats.Timer getSubTimer() { return null; }
        public boolean isRunningLocked() { return false; }
        public abstract void logState(android.util.Printer p0, java.lang.String p1);
    }

    static final class TimerEntry {
        final java.lang.String mName = null;
        final int mId = 0;
        final android.os.BatteryStats.Timer mTimer = null;
        final long mTime = 0L;
        TimerEntry(java.lang.String p0, int p1, android.os.BatteryStats.Timer p2, long p3) {}
    }

    public static abstract class Uid {
        public static final int PROCESS_STATE_TOP = 0;
        public static final int PROCESS_STATE_FOREGROUND_SERVICE = 1;
        public static final int PROCESS_STATE_FOREGROUND = 2;
        public static final int PROCESS_STATE_BACKGROUND = 3;
        public static final int PROCESS_STATE_TOP_SLEEPING = 4;
        public static final int PROCESS_STATE_HEAVY_WEIGHT = 5;
        public static final int PROCESS_STATE_CACHED = 6;
        public static final int NUM_PROCESS_STATE = 7;
        static final java.lang.String[] PROCESS_STATE_NAMES = null;
        public static final java.lang.String[] UID_PROCESS_TYPES = null;
        public static final int[] CRITICAL_PROC_STATES = null;
        public static final int NUM_WIFI_BATCHED_SCAN_BINS = 5;
        static final java.lang.String[] USER_ACTIVITY_TYPES = null;
        public static final int NUM_USER_ACTIVITY_TYPES = Integer.valueOf(0);
        public Uid() {}
        public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Wakelock> getWakelockStats();
        public abstract android.os.BatteryStats.Timer getMulticastWakelockStats();
        public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Timer> getSyncStats();
        public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Timer> getJobStats();
        public abstract android.util.ArrayMap<java.lang.String, android.util.SparseIntArray> getJobCompletionStats();
        public abstract android.os.BatteryStats.Timer getAggregatedPartialWakelockTimer();
        public abstract android.util.SparseArray<? extends android.os.BatteryStats.Uid.Sensor> getSensorStats();
        public abstract android.util.SparseArray<? extends android.os.BatteryStats.Uid.Pid> getPidStats();
        public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Proc> getProcessStats();
        public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Pkg> getPackageStats();
        public abstract double getProportionalSystemServiceUsage();
        public abstract android.os.BatteryStats.ControllerActivityCounter getWifiControllerActivity();
        public abstract android.os.BatteryStats.ControllerActivityCounter getBluetoothControllerActivity();
        public abstract android.os.BatteryStats.ControllerActivityCounter getModemControllerActivity();
        public abstract int getUid();
        public abstract void noteWifiRunningLocked(long p0);
        public abstract void noteWifiStoppedLocked(long p0);
        public abstract void noteFullWifiLockAcquiredLocked(long p0);
        public abstract void noteFullWifiLockReleasedLocked(long p0);
        public abstract void noteWifiScanStartedLocked(long p0);
        public abstract void noteWifiScanStoppedLocked(long p0);
        public abstract void noteWifiBatchedScanStartedLocked(int p0, long p1);
        public abstract void noteWifiBatchedScanStoppedLocked(long p0);
        public abstract void noteWifiMulticastEnabledLocked(long p0);
        public abstract void noteWifiMulticastDisabledLocked(long p0);
        public abstract void noteActivityResumedLocked(long p0);
        public abstract void noteActivityPausedLocked(long p0);
        public abstract long getWifiRunningTime(long p0, int p1);
        public abstract long getFullWifiLockTime(long p0, int p1);
        public abstract long getWifiScanTime(long p0, int p1);
        public abstract int getWifiScanCount(int p0);
        public abstract android.os.BatteryStats.Timer getWifiScanTimer();
        public abstract int getWifiScanBackgroundCount(int p0);
        public abstract long getWifiScanActualTime(long p0);
        public abstract long getWifiScanBackgroundTime(long p0);
        public abstract android.os.BatteryStats.Timer getWifiScanBackgroundTimer();
        public abstract long getWifiBatchedScanTime(int p0, long p1, int p2);
        public abstract int getWifiBatchedScanCount(int p0, int p1);
        public abstract long getWifiMulticastTime(long p0, int p1);
        public abstract android.os.BatteryStats.Timer getAudioTurnedOnTimer();
        public abstract android.os.BatteryStats.Timer getVideoTurnedOnTimer();
        public abstract android.os.BatteryStats.Timer getFlashlightTurnedOnTimer();
        public abstract android.os.BatteryStats.Timer getCameraTurnedOnTimer();
        public abstract android.os.BatteryStats.Timer getForegroundActivityTimer();
        public abstract android.os.BatteryStats.Timer getForegroundServiceTimer();
        public abstract android.os.BatteryStats.Timer getBluetoothScanTimer();
        public abstract android.os.BatteryStats.Timer getBluetoothScanBackgroundTimer();
        public abstract android.os.BatteryStats.Timer getBluetoothUnoptimizedScanTimer();
        public abstract android.os.BatteryStats.Timer getBluetoothUnoptimizedScanBackgroundTimer();
        public abstract android.os.BatteryStats.Counter getBluetoothScanResultCounter();
        public abstract android.os.BatteryStats.Counter getBluetoothScanResultBgCounter();
        public abstract long[] getCpuFreqTimes(int p0);
        public abstract long[] getScreenOffCpuFreqTimes(int p0);
        public abstract long getCpuActiveTime();
        public abstract long[] getCpuClusterTimes();
        public abstract long[] getCpuFreqTimes(int p0, int p1);
        public abstract long[] getScreenOffCpuFreqTimes(int p0, int p1);
        public abstract long getProcessStateTime(int p0, long p1, int p2);
        public abstract android.os.BatteryStats.Timer getProcessStateTimer(int p0);
        public abstract android.os.BatteryStats.Timer getVibratorOnTimer();
        public abstract void noteUserActivityLocked(int p0);
        public abstract boolean hasUserActivity();
        public abstract int getUserActivityCount(int p0, int p1);
        public abstract boolean hasNetworkActivity();
        public abstract long getNetworkActivityBytes(int p0, int p1);
        public abstract long getNetworkActivityPackets(int p0, int p1);
        public abstract long getMobileRadioActiveTime(int p0);
        public abstract int getMobileRadioActiveCount(int p0);
        public abstract long getUserCpuTimeUs(int p0);
        public abstract long getSystemCpuTimeUs(int p0);
        public abstract long getTimeAtCpuSpeed(int p0, int p1, int p2);
        public abstract long getMobileRadioApWakeupCount(int p0);
        public abstract long getWifiRadioApWakeupCount(int p0);
        public abstract void getDeferredJobsCheckinLineLocked(java.lang.StringBuilder p0, int p1);
        public abstract void getDeferredJobsLineLocked(java.lang.StringBuilder p0, int p1);
        public abstract long getBluetoothMeasuredBatteryConsumptionUC();
        public abstract long getCpuMeasuredBatteryConsumptionUC();
        public abstract long getGnssMeasuredBatteryConsumptionUC();
        public abstract long getMobileRadioMeasuredBatteryConsumptionUC();
        public abstract long getScreenOnMeasuredBatteryConsumptionUC();
        public abstract long getWifiMeasuredBatteryConsumptionUC();
        public abstract long[] getCustomConsumerMeasuredBatteryConsumptionUC();

        public class Pid {
            public int mWakeNesting;
            public long mWakeSumMs;
            public long mWakeStartMs;
            public Pid(android.os.BatteryStats.Uid p0) {}
        }

        public static abstract class Pkg {
            public Pkg() {}
            public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Counter> getWakeupAlarmStats();
            public abstract android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Pkg.Serv> getServiceStats();

            public static abstract class Serv {
                public Serv() {}
                public abstract long getStartTime(long p0, int p1);
                public abstract int getStarts(int p0);
                public abstract int getLaunches(int p0);
            }
        }

        public static abstract class Proc {
            public Proc() {}
            public abstract boolean isActive();
            public abstract long getUserTime(int p0);
            public abstract long getSystemTime(int p0);
            public abstract int getStarts(int p0);
            public abstract int getNumCrashes(int p0);
            public abstract int getNumAnrs(int p0);
            public abstract long getForegroundTime(int p0);
            public abstract int countExcessivePowers();
            public abstract android.os.BatteryStats.Uid.Proc.ExcessivePower getExcessivePower(int p0);

            public static class ExcessivePower {
                public static final int TYPE_WAKE = 1;
                public static final int TYPE_CPU = 2;
                public int type;
                public long overTime;
                public long usedTime;
                public ExcessivePower() {}
            }
        }

        public static abstract class Sensor {
            public static final int GPS = -10000;
            public Sensor() {}
            public abstract int getHandle();
            public abstract android.os.BatteryStats.Timer getSensorTime();
            public abstract android.os.BatteryStats.Timer getSensorBackgroundTime();
        }

        public static abstract class Wakelock {
            public Wakelock() {}
            public abstract android.os.BatteryStats.Timer getWakeTime(int p0);
        }
    }
}

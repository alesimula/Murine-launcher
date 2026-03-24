package com.android.internal.os;

public class BatteryStatsHelper {
    static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private static android.os.BatteryStats sStatsXfer;
    private static android.content.Intent sBatteryBroadcastXfer;
    private static android.util.ArrayMap<java.io.File, android.os.BatteryStats> sFileXfer;
    private final android.content.Context mContext = null;
    private final boolean mCollectBatteryBroadcast = false;
    private final boolean mWifiOnly = false;
    private com.android.internal.app.IBatteryStats mBatteryInfo;
    private android.os.BatteryStats mStats;
    private android.content.Intent mBatteryBroadcast;
    private com.android.internal.os.PowerProfile mPowerProfile;
    private java.lang.String[] mSystemPackageArray;
    private java.lang.String[] mServicepackageArray;
    private android.content.pm.PackageManager mPackageManager;
    private final java.util.List<com.android.internal.os.BatterySipper> mUsageList = null;
    private final java.util.List<com.android.internal.os.BatterySipper> mWifiSippers = null;
    private final java.util.List<com.android.internal.os.BatterySipper> mBluetoothSippers = null;
    private final android.util.SparseArray<java.util.List<com.android.internal.os.BatterySipper>> mUserSippers = null;
    private final java.util.List<com.android.internal.os.BatterySipper> mMobilemsppList = null;
    private int mStatsType;
    long mRawRealtimeUs;
    long mRawUptimeUs;
    long mBatteryRealtimeUs;
    long mBatteryUptimeUs;
    long mTypeBatteryRealtimeUs;
    long mTypeBatteryUptimeUs;
    long mBatteryTimeRemainingUs;
    long mChargeTimeRemainingUs;
    private long mStatsPeriod;
    private double mMaxPower;
    private double mMaxRealPower;
    private double mComputedPower;
    private double mTotalPower;
    private double mMinDrainedPower;
    private double mMaxDrainedPower;
    com.android.internal.os.PowerCalculator mCpuPowerCalculator;
    com.android.internal.os.PowerCalculator mWakelockPowerCalculator;
    com.android.internal.os.MobileRadioPowerCalculator mMobileRadioPowerCalculator;
    com.android.internal.os.PowerCalculator mWifiPowerCalculator;
    com.android.internal.os.PowerCalculator mBluetoothPowerCalculator;
    com.android.internal.os.PowerCalculator mSensorPowerCalculator;
    com.android.internal.os.PowerCalculator mCameraPowerCalculator;
    com.android.internal.os.PowerCalculator mFlashlightPowerCalculator;
    com.android.internal.os.PowerCalculator mMemoryPowerCalculator;
    com.android.internal.os.PowerCalculator mMediaPowerCalculator;
    boolean mHasWifiPowerReporting;
    boolean mHasBluetoothPowerReporting;
    public static boolean checkWifiOnly(android.content.Context p0) { return false; }
    public static boolean checkHasWifiPowerReporting(android.os.BatteryStats p0, com.android.internal.os.PowerProfile p1) { return false; }
    public static boolean checkHasBluetoothPowerReporting(android.os.BatteryStats p0, com.android.internal.os.PowerProfile p1) { return false; }
    public BatteryStatsHelper(android.content.Context p0) {}
    public BatteryStatsHelper(android.content.Context p0, boolean p1) {}
    public BatteryStatsHelper(android.content.Context p0, boolean p1, boolean p2) {}
    public void storeStatsHistoryInFile(java.lang.String p0) {}
    public static android.os.BatteryStats statsFromFile(android.content.Context p0, java.lang.String p1) { return null; }
    public static void dropFile(android.content.Context p0, java.lang.String p1) {}
    private static java.io.File makeFilePath(android.content.Context p0, java.lang.String p1) { return null; }
    public void clearStats() {}
    public android.os.BatteryStats getStats() { return null; }
    public android.content.Intent getBatteryBroadcast() { return null; }
    public com.android.internal.os.PowerProfile getPowerProfile() { return null; }
    public void create(android.os.BatteryStats p0) {}
    public void create(android.os.Bundle p0) {}
    public void storeState() {}
    public static java.lang.String makemAh(double p0) { return null; }
    public void refreshStats(int p0, int p1) {}
    public void refreshStats(int p0, java.util.List<android.os.UserHandle> p1) {}
    public void refreshStats(int p0, android.util.SparseArray<android.os.UserHandle> p1) {}
    public void refreshStats(int p0, android.util.SparseArray<android.os.UserHandle> p1, long p2, long p3) {}
    private void processAppUsage(android.util.SparseArray<android.os.UserHandle> p0) {}
    private void addPhoneUsage() {}
    private void addScreenUsage() {}
    private void addAmbientDisplayUsage() {}
    private void addRadioUsage() {}
    private void aggregateSippers(com.android.internal.os.BatterySipper p0, java.util.List<com.android.internal.os.BatterySipper> p1, java.lang.String p2) {}
    private void addIdleUsage() {}
    private void addWiFiUsage() {}
    private void addBluetoothUsage() {}
    private void addUserUsage() {}
    private void addMemoryUsage() {}
    private void processMiscUsage() {}
    private com.android.internal.os.BatterySipper addEntry(com.android.internal.os.BatterySipper.DrainType p0, long p1, double p2) { return null; }
    public java.util.List<com.android.internal.os.BatterySipper> getUsageList() { return null; }
    public java.util.List<com.android.internal.os.BatterySipper> getMobilemsppList() { return null; }
    public long getStatsPeriod() { return 0L; }
    public int getStatsType() { return 0; }
    public double getMaxPower() { return 0.0; }
    public double getMaxRealPower() { return 0.0; }
    public double getTotalPower() { return 0.0; }
    public double getComputedPower() { return 0.0; }
    public double getMinDrainedPower() { return 0.0; }
    public double getMaxDrainedPower() { return 0.0; }
    public static byte[] readFully(java.io.FileInputStream p0) throws java.io.IOException { return null; }
    public static byte[] readFully(java.io.FileInputStream p0, int p1) throws java.io.IOException { return null; }
    public double removeHiddenBatterySippers(java.util.List<com.android.internal.os.BatterySipper> p0) { return 0.0; }
    public void smearScreenBatterySipper(java.util.List<com.android.internal.os.BatterySipper> p0, com.android.internal.os.BatterySipper p1) {}
    public boolean shouldHideSipper(com.android.internal.os.BatterySipper p0) { return false; }
    public boolean isTypeService(com.android.internal.os.BatterySipper p0) { return false; }
    public boolean isTypeSystem(com.android.internal.os.BatterySipper p0) { return false; }
    public long convertUsToMs(long p0) { return 0L; }
    public long convertMsToUs(long p0) { return 0L; }
    public long getForegroundActivityTotalTimeUs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }
    public long getProcessForegroundTimeMs(android.os.BatteryStats.Uid p0, int p1) { return 0L; }
    public void setPackageManager(android.content.pm.PackageManager p0) {}
    public void setSystemPackageArray(java.lang.String[] p0) {}
    public void setServicePackageArray(java.lang.String[] p0) {}
    private void load() {}
    private static com.android.internal.os.BatteryStatsImpl getStats(com.android.internal.app.IBatteryStats p0) { return null; }
}

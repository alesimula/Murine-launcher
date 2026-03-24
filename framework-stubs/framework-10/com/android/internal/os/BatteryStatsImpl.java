package com.android.internal.os;

public class BatteryStatsImpl extends android.os.BatteryStats {
    private static final java.lang.String TAG = "BatteryStatsImpl";
    private static final boolean DEBUG = false;
    public static final boolean DEBUG_ENERGY = false;
    private static final boolean DEBUG_ENERGY_CPU = false;
    private static final boolean DEBUG_MEMORY = false;
    private static final boolean DEBUG_HISTORY = false;
    private static final boolean USE_OLD_HISTORY = false;
    private static final int MAGIC = -1166707595;
    static final int VERSION = 186;
    private static final int MAX_WAKELOCKS_PER_UID = Integer.valueOf(0);
    private static final int NUM_WIFI_TX_LEVELS = 1;
    private static final int NUM_BT_TX_LEVELS = 1;
    public static final int WAKE_LOCK_WEIGHT = 50;
    protected com.android.internal.os.BatteryStatsImpl.Clocks mClocks;
    private final com.android.internal.os.AtomicFile mStatsFile = null;
    public final com.android.internal.os.AtomicFile mCheckinFile = null;
    public final com.android.internal.os.AtomicFile mDailyFile = null;
    static final int MSG_REPORT_CPU_UPDATE_NEEDED = 1;
    static final int MSG_REPORT_POWER_CHANGE = 2;
    static final int MSG_REPORT_CHARGING = 3;
    static final int MSG_REPORT_RESET_STATS = 4;
    static final long DELAY_UPDATE_WAKELOCKS = 5000L;
    private static final double MILLISECONDS_IN_HOUR = 3600000.0;
    private static final long MILLISECONDS_IN_YEAR = 31536000000L;
    private final com.android.internal.os.KernelWakelockReader mKernelWakelockReader = null;
    private final com.android.internal.os.KernelWakelockStats mTmpWakelockStats = null;
    protected com.android.internal.os.KernelCpuUidTimeReader.KernelCpuUidUserSysTimeReader mCpuUidUserSysTimeReader;
    protected com.android.internal.os.KernelCpuSpeedReader[] mKernelCpuSpeedReaders;
    protected com.android.internal.os.KernelCpuUidTimeReader.KernelCpuUidFreqTimeReader mCpuUidFreqTimeReader;
    protected com.android.internal.os.KernelCpuUidTimeReader.KernelCpuUidActiveTimeReader mCpuUidActiveTimeReader;
    protected com.android.internal.os.KernelCpuUidTimeReader.KernelCpuUidClusterTimeReader mCpuUidClusterTimeReader;
    protected com.android.internal.os.KernelSingleUidTimeReader mKernelSingleUidTimeReader;
    private final com.android.internal.os.KernelMemoryBandwidthStats mKernelMemoryBandwidthStats = null;
    private final android.util.LongSparseArray<com.android.internal.os.BatteryStatsImpl.SamplingTimer> mKernelMemoryStats = null;
    public boolean mPerProcStateCpuTimesAvailable;
    private boolean mIsPerProcessStateCpuDataStale;
    protected final android.util.SparseIntArray mPendingUids = null;
    private long mNumSingleUidCpuTimeReads;
    private long mNumBatchedSingleUidCpuTimeReads;
    private long mCpuTimeReadsTrackingStartTime;
    private int mNumUidsRemoved;
    private int mNumAllUidCpuTimeReads;
    private final com.android.internal.os.RpmStats mTmpRpmStats = null;
    private static final long RPM_STATS_UPDATE_FREQ_MS = 1000L;
    private long mLastRpmStatsUpdateTimeMs;
    private final com.android.internal.os.RailStats mTmpRailStats = null;
    protected java.util.Queue<com.android.internal.os.BatteryStatsImpl.UidToRemove> mPendingRemovedUids;
    private final com.android.internal.os.BatteryStatsImpl.PlatformIdleStateCallback mPlatformIdleStateCallback = null;
    private final java.lang.Runnable mDeferSetCharging = null;
    public final com.android.internal.os.BatteryStatsImpl.RailEnergyDataCallback mRailEnergyDataCallback = null;
    public android.os.Handler mHandler;
    private com.android.internal.os.BatteryStatsImpl.ExternalStatsSync mExternalSync;
    protected com.android.internal.os.BatteryStatsImpl.UserInfoProvider mUserInfoProvider;
    private com.android.internal.os.BatteryStatsImpl.BatteryCallback mCallback;
    final android.util.SparseIntArray mIsolatedUids = null;
    final android.util.SparseArray<com.android.internal.os.BatteryStatsImpl.Uid> mUidStats = null;
    @android.annotation.UnsupportedAppUsage
    protected java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mPartialTimers;
    @android.annotation.UnsupportedAppUsage
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mFullTimers = null;
    @android.annotation.UnsupportedAppUsage
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mWindowTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mDrawTimers = null;
    final android.util.SparseArray<java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer>> mSensorTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mWifiRunningTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mFullWifiLockTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mWifiMulticastTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mWifiScanTimers = null;
    final android.util.SparseArray<java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer>> mWifiBatchedScanTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mAudioTurnedOnTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mVideoTurnedOnTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mFlashlightTurnedOnTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mCameraTurnedOnTimers = null;
    final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mBluetoothScanOnTimers = null;
    protected java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mLastPartialTimers;
    protected final com.android.internal.os.BatteryStatsImpl.TimeBase mOnBatteryTimeBase = null;
    protected final com.android.internal.os.BatteryStatsImpl.TimeBase mOnBatteryScreenOffTimeBase = null;
    boolean mDistributeWakelockCpu;
    boolean mShuttingDown;
    final android.os.BatteryStats.HistoryEventTracker mActiveEvents = null;
    long mHistoryBaseTime;
    protected boolean mHaveBatteryLevel;
    protected boolean mRecordingHistory;
    int mNumHistoryItems;
    final android.os.Parcel mHistoryBuffer = null;
    final android.os.BatteryStats.HistoryItem mHistoryLastWritten = null;
    final android.os.BatteryStats.HistoryItem mHistoryLastLastWritten = null;
    final android.os.BatteryStats.HistoryItem mHistoryReadTmp = null;
    final android.os.BatteryStats.HistoryItem mHistoryAddTmp = null;
    final java.util.HashMap<android.os.BatteryStats.HistoryTag, java.lang.Integer> mHistoryTagPool = null;
    java.lang.String[] mReadHistoryStrings;
    int[] mReadHistoryUids;
    int mReadHistoryChars;
    int mNextHistoryTagIdx;
    int mNumHistoryTagChars;
    int mHistoryBufferLastPos;
    int mActiveHistoryStates;
    int mActiveHistoryStates2;
    long mLastHistoryElapsedRealtime;
    long mTrackRunningHistoryElapsedRealtime;
    long mTrackRunningHistoryUptime;
    final com.android.internal.os.BatteryStatsHistory mBatteryStatsHistory = null;
    final android.os.BatteryStats.HistoryItem mHistoryCur = null;
    android.os.BatteryStats.HistoryItem mHistory;
    android.os.BatteryStats.HistoryItem mHistoryEnd;
    android.os.BatteryStats.HistoryItem mHistoryLastEnd;
    android.os.BatteryStats.HistoryItem mHistoryCache;
    android.os.BatteryStats.HistoryStepDetails mLastHistoryStepDetails;
    byte mLastHistoryStepLevel;
    final android.os.BatteryStats.HistoryStepDetails mCurHistoryStepDetails = null;
    final android.os.BatteryStats.HistoryStepDetails mReadHistoryStepDetails = null;
    final android.os.BatteryStats.HistoryStepDetails mTmpHistoryStepDetails = null;
    long mLastStepCpuUserTime;
    long mCurStepCpuUserTime;
    long mLastStepCpuSystemTime;
    long mCurStepCpuSystemTime;
    long mLastStepStatUserTime;
    long mLastStepStatSystemTime;
    long mLastStepStatIOWaitTime;
    long mLastStepStatIrqTime;
    long mLastStepStatSoftIrqTime;
    long mLastStepStatIdleTime;
    long mCurStepStatUserTime;
    long mCurStepStatSystemTime;
    long mCurStepStatIOWaitTime;
    long mCurStepStatIrqTime;
    long mCurStepStatSoftIrqTime;
    long mCurStepStatIdleTime;
    private android.os.BatteryStats.HistoryItem mHistoryIterator;
    private boolean mReadOverflow;
    private boolean mIteratingHistory;
    int mStartCount;
    long mStartClockTime;
    java.lang.String mStartPlatformVersion;
    java.lang.String mEndPlatformVersion;
    long mUptime;
    long mUptimeStart;
    long mRealtime;
    long mRealtimeStart;
    int mWakeLockNesting;
    boolean mWakeLockImportant;
    public boolean mRecordAllHistory;
    boolean mNoAutoReset;
    protected int mScreenState;
    protected com.android.internal.os.BatteryStatsImpl.StopwatchTimer mScreenOnTimer;
    protected com.android.internal.os.BatteryStatsImpl.StopwatchTimer mScreenDozeTimer;
    int mScreenBrightnessBin;
    final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mScreenBrightnessTimer = null;
    boolean mPretendScreenOff;
    boolean mInteractive;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mInteractiveTimer;
    boolean mPowerSaveModeEnabled;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mPowerSaveModeEnabledTimer;
    boolean mDeviceIdling;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mDeviceIdlingTimer;
    boolean mDeviceLightIdling;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mDeviceLightIdlingTimer;
    int mDeviceIdleMode;
    long mLastIdleTimeStart;
    long mLongestLightIdleTime;
    long mLongestFullIdleTime;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mDeviceIdleModeLightTimer;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mDeviceIdleModeFullTimer;
    boolean mPhoneOn;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mPhoneOnTimer;
    int mAudioOnNesting;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mAudioOnTimer;
    int mVideoOnNesting;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mVideoOnTimer;
    int mFlashlightOnNesting;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mFlashlightOnTimer;
    int mCameraOnNesting;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mCameraOnTimer;
    private static final int USB_DATA_UNKNOWN = 0;
    private static final int USB_DATA_DISCONNECTED = 1;
    private static final int USB_DATA_CONNECTED = 2;
    int mUsbDataState;
    int mGpsSignalQualityBin;
    protected final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mGpsSignalQualityTimer = null;
    int mPhoneSignalStrengthBin;
    int mPhoneSignalStrengthBinRaw;
    final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mPhoneSignalStrengthsTimer = null;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mPhoneSignalScanningTimer;
    int mPhoneDataConnectionType;
    final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mPhoneDataConnectionsTimer = null;
    final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[] mNetworkByteActivityCounters = null;
    final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[] mNetworkPacketActivityCounters = null;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mWifiMulticastWakelockTimer;
    com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl mWifiActivity;
    com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl mBluetoothActivity;
    com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl mModemActivity;
    boolean mHasWifiReporting;
    boolean mHasBluetoothReporting;
    boolean mHasModemReporting;
    boolean mWifiOn;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mWifiOnTimer;
    boolean mGlobalWifiRunning;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mGlobalWifiRunningTimer;
    int mWifiState;
    final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mWifiStateTimer = null;
    int mWifiSupplState;
    final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mWifiSupplStateTimer = null;
    int mWifiSignalStrengthBin;
    final com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mWifiSignalStrengthsTimer = null;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mWifiActiveTimer;
    int mBluetoothScanNesting;
    protected com.android.internal.os.BatteryStatsImpl.StopwatchTimer mBluetoothScanTimer;
    boolean mIsCellularTxPowerHigh;
    int mMobileRadioPowerState;
    long mMobileRadioActiveStartTime;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mMobileRadioActiveTimer;
    com.android.internal.os.BatteryStatsImpl.StopwatchTimer mMobileRadioActivePerAppTimer;
    com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMobileRadioActiveAdjustedTime;
    com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMobileRadioActiveUnknownTime;
    com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMobileRadioActiveUnknownCount;
    int mWifiRadioPowerState;
    boolean mOnBattery;
    protected boolean mOnBatteryInternal;
    boolean mCharging;
    int mLastChargingStateLevel;
    int mDischargeStartLevel;
    int mDischargeUnplugLevel;
    int mDischargePlugLevel;
    int mDischargeCurrentLevel;
    int mCurrentBatteryLevel;
    int mLowDischargeAmountSinceCharge;
    int mHighDischargeAmountSinceCharge;
    int mDischargeScreenOnUnplugLevel;
    int mDischargeScreenOffUnplugLevel;
    int mDischargeScreenDozeUnplugLevel;
    int mDischargeAmountScreenOn;
    int mDischargeAmountScreenOnSinceCharge;
    int mDischargeAmountScreenOff;
    int mDischargeAmountScreenOffSinceCharge;
    int mDischargeAmountScreenDoze;
    int mDischargeAmountScreenDozeSinceCharge;
    private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mDischargeScreenOffCounter;
    private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mDischargeScreenDozeCounter;
    private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mDischargeCounter;
    private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mDischargeLightDozeCounter;
    private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mDischargeDeepDozeCounter;
    static final int MAX_LEVEL_STEPS = 200;
    int mInitStepMode;
    int mCurStepMode;
    int mModStepMode;
    int mLastDischargeStepLevel;
    int mMinDischargeStepLevel;
    final android.os.BatteryStats.LevelStepTracker mDischargeStepTracker = null;
    final android.os.BatteryStats.LevelStepTracker mDailyDischargeStepTracker = null;
    java.util.ArrayList<android.os.BatteryStats.PackageChange> mDailyPackageChanges;
    int mLastChargeStepLevel;
    int mMaxChargeStepLevel;
    final android.os.BatteryStats.LevelStepTracker mChargeStepTracker = null;
    final android.os.BatteryStats.LevelStepTracker mDailyChargeStepTracker = null;
    static final int MAX_DAILY_ITEMS = 10;
    long mDailyStartTime;
    long mNextMinDailyDeadline;
    long mNextMaxDailyDeadline;
    final java.util.ArrayList<android.os.BatteryStats.DailyItem> mDailyItems = null;
    long mLastWriteTime;
    private int mPhoneServiceState;
    private int mPhoneServiceStateRaw;
    private int mPhoneSimStateRaw;
    private int mNumConnectivityChange;
    private int mEstimatedBatteryCapacity;
    private int mMinLearnedBatteryCapacity;
    private int mMaxLearnedBatteryCapacity;
    private long[] mCpuFreqs;
    protected com.android.internal.os.PowerProfile mPowerProfile;
    final com.android.internal.os.BatteryStatsImpl.Constants mConstants = null;
    private final java.util.HashMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.SamplingTimer> mRpmStats = null;
    private final java.util.HashMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.SamplingTimer> mScreenOffRpmStats = null;
    private final java.util.HashMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.SamplingTimer> mKernelWakelockStats = null;
    java.lang.String mLastWakeupReason;
    long mLastWakeupUptimeMs;
    private final java.util.HashMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.SamplingTimer> mWakeupReasonStats = null;
    static final int DELTA_TIME_MASK = 524287;
    static final int DELTA_TIME_LONG = 524287;
    static final int DELTA_TIME_INT = 524286;
    static final int DELTA_TIME_ABS = 524285;
    static final int DELTA_BATTERY_LEVEL_FLAG = 524288;
    static final int DELTA_STATE_FLAG = 1048576;
    static final int DELTA_STATE2_FLAG = 2097152;
    static final int DELTA_WAKELOCK_FLAG = 4194304;
    static final int DELTA_EVENT_FLAG = 8388608;
    static final int DELTA_BATTERY_CHARGE_FLAG = 16777216;
    static final int DELTA_STATE_MASK = -33554432;
    static final int STATE_BATTERY_MASK = -16777216;
    static final int STATE_BATTERY_STATUS_MASK = 7;
    static final int STATE_BATTERY_STATUS_SHIFT = 29;
    static final int STATE_BATTERY_HEALTH_MASK = 7;
    static final int STATE_BATTERY_HEALTH_SHIFT = 26;
    static final int STATE_BATTERY_PLUG_MASK = 3;
    static final int STATE_BATTERY_PLUG_SHIFT = 24;
    static final int BATTERY_DELTA_LEVEL_FLAG = 1;
    int mChangedStates;
    int mChangedStates2;
    private java.lang.String mInitialAcquireWakeName;
    private int mInitialAcquireWakeUid;
    int mSensorNesting;
    int mGpsNesting;
    int mWifiFullLockNesting;
    int mWifiScanNesting;
    int mWifiMulticastNesting;
    private final android.util.Pools.Pool<android.net.NetworkStats> mNetworkStatsPool = null;
    private final java.lang.Object mWifiNetworkLock = null;
    private java.lang.String[] mWifiIfaces;
    private android.net.NetworkStats mLastWifiNetworkStats;
    private final java.lang.Object mModemNetworkLock = null;
    private java.lang.String[] mModemIfaces;
    private android.net.NetworkStats mLastModemNetworkStats;
    private android.telephony.ModemActivityInfo mLastModemActivityInfo;
    private final com.android.internal.os.BatteryStatsImpl.BluetoothActivityInfoCache mLastBluetoothActivityInfo = null;
    long mTempTotalCpuUserTimeUs;
    long mTempTotalCpuSystemTimeUs;
    long[][] mWakeLockAllocationsUs;
    public static final int BATTERY_PLUGGED_NONE = 0;
    final java.util.concurrent.locks.ReentrantLock mWriteLock = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<com.android.internal.os.BatteryStatsImpl> CREATOR = null;
    public android.util.LongSparseArray<com.android.internal.os.BatteryStatsImpl.SamplingTimer> getKernelMemoryStats() { return null; }
    public void postBatteryNeedsCpuUpdateMsg() {}
    public void updateProcStateCpuTimes(boolean p0, boolean p1) {}
    public void clearPendingRemovedUids() {}
    public void copyFromAllUidsCpuTimes() {}
    public void copyFromAllUidsCpuTimes(boolean p0, boolean p1) {}
    public long[] addCpuTimes(long[] p0, long[] p1) { return null; }
    private boolean initKernelSingleUidTimeReaderLocked() { return false; }
    public java.util.Map<java.lang.String, ? extends com.android.internal.os.BatteryStatsImpl.Timer> getRpmStats() { return null; }
    public java.util.Map<java.lang.String, ? extends com.android.internal.os.BatteryStatsImpl.Timer> getScreenOffRpmStats() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.Map<java.lang.String, ? extends com.android.internal.os.BatteryStatsImpl.Timer> getKernelWakelockStats() { return null; }
    public java.util.Map<java.lang.String, ? extends com.android.internal.os.BatteryStatsImpl.Timer> getWakeupReasonStats() { return null; }
    public long getUahDischarge(int p0) { return 0L; }
    public long getUahDischargeScreenOff(int p0) { return 0L; }
    public long getUahDischargeScreenDoze(int p0) { return 0L; }
    public long getUahDischargeLightDoze(int p0) { return 0L; }
    public long getUahDischargeDeepDoze(int p0) { return 0L; }
    public int getEstimatedBatteryCapacity() { return 0; }
    public int getMinLearnedBatteryCapacity() { return 0; }
    public int getMaxLearnedBatteryCapacity() { return 0; }
    public BatteryStatsImpl() { super(); }
    public BatteryStatsImpl(com.android.internal.os.BatteryStatsImpl.Clocks p0) { super(); }
    private void init(com.android.internal.os.BatteryStatsImpl.Clocks p0) {}
    public com.android.internal.os.BatteryStatsImpl.SamplingTimer getRpmTimerLocked(java.lang.String p0) { return null; }
    public com.android.internal.os.BatteryStatsImpl.SamplingTimer getScreenOffRpmTimerLocked(java.lang.String p0) { return null; }
    public com.android.internal.os.BatteryStatsImpl.SamplingTimer getWakeupReasonTimerLocked(java.lang.String p0) { return null; }
    public com.android.internal.os.BatteryStatsImpl.SamplingTimer getKernelWakelockTimerLocked(java.lang.String p0) { return null; }
    public com.android.internal.os.BatteryStatsImpl.SamplingTimer getKernelMemoryTimerLocked(long p0) { return null; }
    private int writeHistoryTag(android.os.BatteryStats.HistoryTag p0) { return 0; }
    private void readHistoryTag(int p0, android.os.BatteryStats.HistoryTag p1) {}
    public void writeHistoryDelta(android.os.Parcel p0, android.os.BatteryStats.HistoryItem p1, android.os.BatteryStats.HistoryItem p2) {}
    private int buildBatteryLevelInt(android.os.BatteryStats.HistoryItem p0) { return 0; }
    private void readBatteryLevelInt(int p0, android.os.BatteryStats.HistoryItem p1) {}
    private int buildStateInt(android.os.BatteryStats.HistoryItem p0) { return 0; }
    private void computeHistoryStepDetails(android.os.BatteryStats.HistoryStepDetails p0, android.os.BatteryStats.HistoryStepDetails p1) {}
    public void readHistoryDelta(android.os.Parcel p0, android.os.BatteryStats.HistoryItem p1) {}
    public void commitCurrentHistoryBatchLocked() {}
    public void createFakeHistoryEvents(long p0) {}
    void addHistoryBufferLocked(long p0, android.os.BatteryStats.HistoryItem p1) {}
    private void addHistoryBufferLocked(long p0, byte p1, android.os.BatteryStats.HistoryItem p2) {}
    void addHistoryRecordLocked(long p0, long p1) {}
    void addHistoryRecordInnerLocked(long p0, android.os.BatteryStats.HistoryItem p1) {}
    public void addHistoryEventLocked(long p0, long p1, int p2, java.lang.String p3, int p4) {}
    void addHistoryRecordLocked(long p0, long p1, byte p2, android.os.BatteryStats.HistoryItem p3) {}
    void addHistoryRecordLocked(android.os.BatteryStats.HistoryItem p0) {}
    void clearHistoryLocked() {}
    public void updateTimeBasesLocked(boolean p0, int p1, long p2, long p3) {}
    private void updateBatteryPropertiesLocked() {}
    public void addIsolatedUidLocked(int p0, int p1) {}
    public void scheduleRemoveIsolatedUidLocked(int p0, int p1) {}
    public void removeIsolatedUidLocked(int p0) {}
    public int mapUid(int p0) { return 0; }
    public void noteEventLocked(int p0, java.lang.String p1, int p2) {}
    public void noteCurrentTimeChangedLocked() {}
    public void noteProcessStartLocked(java.lang.String p0, int p1) {}
    public void noteProcessCrashLocked(java.lang.String p0, int p1) {}
    public void noteProcessAnrLocked(java.lang.String p0, int p1) {}
    public void noteUidProcessStateLocked(int p0, int p1) {}
    public void noteProcessFinishLocked(java.lang.String p0, int p1) {}
    public void noteSyncStartLocked(java.lang.String p0, int p1) {}
    public void noteSyncFinishLocked(java.lang.String p0, int p1) {}
    public void noteJobStartLocked(java.lang.String p0, int p1) {}
    public void noteJobFinishLocked(java.lang.String p0, int p1, int p2) {}
    public void noteJobsDeferredLocked(int p0, int p1, long p2) {}
    public void noteAlarmStartLocked(java.lang.String p0, android.os.WorkSource p1, int p2) {}
    public void noteAlarmFinishLocked(java.lang.String p0, android.os.WorkSource p1, int p2) {}
    private void noteAlarmStartOrFinishLocked(int p0, java.lang.String p1, android.os.WorkSource p2, int p3) {}
    public void noteWakupAlarmLocked(java.lang.String p0, int p1, android.os.WorkSource p2, java.lang.String p3) {}
    private void requestWakelockCpuUpdate() {}
    private void requestImmediateCpuUpdate() {}
    public void setRecordAllHistoryLocked(boolean p0) {}
    public void setNoAutoReset(boolean p0) {}
    public void setPretendScreenOff(boolean p0) {}
    public void noteStartWakeLocked(int p0, int p1, android.os.WorkSource.WorkChain p2, java.lang.String p3, java.lang.String p4, int p5, boolean p6, long p7, long p8) {}
    public void noteStopWakeLocked(int p0, int p1, android.os.WorkSource.WorkChain p2, java.lang.String p3, java.lang.String p4, int p5, long p6, long p7) {}
    private int getPowerManagerWakeLockLevel(int p0) { return 0; }
    public void noteStartWakeFromSourceLocked(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) {}
    public void noteChangeWakelockFromSourceLocked(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, android.os.WorkSource p5, int p6, java.lang.String p7, java.lang.String p8, int p9, boolean p10) {}
    public void noteStopWakeFromSourceLocked(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4) {}
    public void noteLongPartialWakelockStart(java.lang.String p0, java.lang.String p1, int p2) {}
    public void noteLongPartialWakelockStartFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) {}
    private void noteLongPartialWakeLockStartInternal(java.lang.String p0, java.lang.String p1, int p2) {}
    public void noteLongPartialWakelockFinish(java.lang.String p0, java.lang.String p1, int p2) {}
    public void noteLongPartialWakelockFinishFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) {}
    private void noteLongPartialWakeLockFinishInternal(java.lang.String p0, java.lang.String p1, int p2) {}
    void aggregateLastWakeupUptimeLocked(long p0) {}
    public void noteWakeupReasonLocked(java.lang.String p0) {}
    public boolean startAddingCpuLocked() { return false; }
    public void finishAddingCpuLocked(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void noteProcessDiedLocked(int p0, int p1) {}
    public long getProcessWakeTime(int p0, int p1, long p2) { return 0L; }
    public void reportExcessiveCpuLocked(int p0, java.lang.String p1, long p2, long p3) {}
    public void noteStartSensorLocked(int p0, int p1) {}
    public void noteStopSensorLocked(int p0, int p1) {}
    public void noteGpsChangedLocked(android.os.WorkSource p0, android.os.WorkSource p1) {}
    private void noteStartGpsLocked(int p0, android.os.WorkSource.WorkChain p1) {}
    private void noteStopGpsLocked(int p0, android.os.WorkSource.WorkChain p1) {}
    public void noteGpsSignalQualityLocked(int p0) {}
    public void noteScreenStateLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteScreenBrightnessLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteUserActivityLocked(int p0, int p1) {}
    public void noteWakeUpLocked(java.lang.String p0, int p1) {}
    public void noteInteractiveLocked(boolean p0) {}
    public void noteConnectivityChangedLocked(int p0, java.lang.String p1) {}
    private void noteMobileRadioApWakeupLocked(long p0, long p1, int p2) {}
    public boolean noteMobileRadioPowerStateLocked(int p0, long p1, int p2) { return false; }
    public void notePowerSaveModeLocked(boolean p0) {}
    public void noteDeviceIdleModeLocked(int p0, java.lang.String p1, int p2) {}
    public void notePackageInstalledLocked(java.lang.String p0, long p1) {}
    public void notePackageUninstalledLocked(java.lang.String p0) {}
    private void addPackageChange(android.os.BatteryStats.PackageChange p0) {}
    void stopAllGpsSignalQualityTimersLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void notePhoneOnLocked() {}
    @android.annotation.UnsupportedAppUsage
    public void notePhoneOffLocked() {}
    private void registerUsbStateReceiver(android.content.Context p0) {}
    private void noteUsbConnectionStateLocked(boolean p0) {}
    void stopAllPhoneSignalStrengthTimersLocked(int p0) {}
    private int fixPhoneServiceState(int p0, int p1) { return 0; }
    private void updateAllPhoneStateLocked(int p0, int p1, int p2) {}
    public void notePhoneStateLocked(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void notePhoneSignalStrengthLocked(android.telephony.SignalStrength p0) {}
    @android.annotation.UnsupportedAppUsage
    public void notePhoneDataConnectionStateLocked(int p0, boolean p1) {}
    public void noteWifiOnLocked() {}
    public void noteWifiOffLocked() {}
    @android.annotation.UnsupportedAppUsage
    public void noteAudioOnLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteAudioOffLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteVideoOnLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteVideoOffLocked(int p0) {}
    public void noteResetAudioLocked() {}
    public void noteResetVideoLocked() {}
    public void noteActivityResumedLocked(int p0) {}
    public void noteActivityPausedLocked(int p0) {}
    public void noteVibratorOnLocked(int p0, long p1) {}
    public void noteVibratorOffLocked(int p0) {}
    public void noteFlashlightOnLocked(int p0) {}
    public void noteFlashlightOffLocked(int p0) {}
    public void noteCameraOnLocked(int p0) {}
    public void noteCameraOffLocked(int p0) {}
    public void noteResetCameraLocked() {}
    public void noteResetFlashlightLocked() {}
    private void noteBluetoothScanStartedLocked(android.os.WorkSource.WorkChain p0, int p1, boolean p2) {}
    public void noteBluetoothScanStartedFromSourceLocked(android.os.WorkSource p0, boolean p1) {}
    private void noteBluetoothScanStoppedLocked(android.os.WorkSource.WorkChain p0, int p1, boolean p2) {}
    private int getAttributionUid(int p0, android.os.WorkSource.WorkChain p1) { return 0; }
    public void noteBluetoothScanStoppedFromSourceLocked(android.os.WorkSource p0, boolean p1) {}
    public void noteResetBluetoothScanLocked() {}
    public void noteBluetoothScanResultsFromSourceLocked(android.os.WorkSource p0, int p1) {}
    private void noteWifiRadioApWakeupLocked(long p0, long p1, int p2) {}
    public void noteWifiRadioPowerState(int p0, long p1, int p2) {}
    public void noteWifiRunningLocked(android.os.WorkSource p0) {}
    public void noteWifiRunningChangedLocked(android.os.WorkSource p0, android.os.WorkSource p1) {}
    public void noteWifiStoppedLocked(android.os.WorkSource p0) {}
    public void noteWifiStateLocked(int p0, java.lang.String p1) {}
    public void noteWifiSupplicantStateChangedLocked(int p0, boolean p1) {}
    void stopAllWifiSignalStrengthTimersLocked(int p0) {}
    public void noteWifiRssiChangedLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteFullWifiLockAcquiredLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteFullWifiLockReleasedLocked(int p0) {}
    public void noteWifiScanStartedLocked(int p0) {}
    public void noteWifiScanStoppedLocked(int p0) {}
    public void noteWifiBatchedScanStartedLocked(int p0, int p1) {}
    public void noteWifiBatchedScanStoppedLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteWifiMulticastEnabledLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void noteWifiMulticastDisabledLocked(int p0) {}
    public void noteFullWifiLockAcquiredFromSourceLocked(android.os.WorkSource p0) {}
    public void noteFullWifiLockReleasedFromSourceLocked(android.os.WorkSource p0) {}
    public void noteWifiScanStartedFromSourceLocked(android.os.WorkSource p0) {}
    public void noteWifiScanStoppedFromSourceLocked(android.os.WorkSource p0) {}
    public void noteWifiBatchedScanStartedFromSourceLocked(android.os.WorkSource p0, int p1) {}
    public void noteWifiBatchedScanStoppedFromSourceLocked(android.os.WorkSource p0) {}
    private static java.lang.String[] includeInStringArray(java.lang.String[] p0, java.lang.String p1) { return null; }
    private static java.lang.String[] excludeFromStringArray(java.lang.String[] p0, java.lang.String p1) { return null; }
    public void noteNetworkInterfaceTypeLocked(java.lang.String p0, int p1) {}
    public java.lang.String[] getWifiIfaces() { return null; }
    public java.lang.String[] getMobileIfaces() { return null; }
    @android.annotation.UnsupportedAppUsage
    public long getScreenOnTime(long p0, int p1) { return 0L; }
    public int getScreenOnCount(int p0) { return 0; }
    public long getScreenDozeTime(long p0, int p1) { return 0L; }
    public int getScreenDozeCount(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public long getScreenBrightnessTime(int p0, long p1, int p2) { return 0L; }
    public com.android.internal.os.BatteryStatsImpl.Timer getScreenBrightnessTimer(int p0) { return null; }
    public long getInteractiveTime(long p0, int p1) { return 0L; }
    public long getPowerSaveModeEnabledTime(long p0, int p1) { return 0L; }
    public int getPowerSaveModeEnabledCount(int p0) { return 0; }
    public long getDeviceIdleModeTime(int p0, long p1, int p2) { return 0L; }
    public int getDeviceIdleModeCount(int p0, int p1) { return 0; }
    public long getLongestDeviceIdleModeTime(int p0) { return 0L; }
    public long getDeviceIdlingTime(int p0, long p1, int p2) { return 0L; }
    public int getDeviceIdlingCount(int p0, int p1) { return 0; }
    public int getNumConnectivityChange(int p0) { return 0; }
    public long getGpsSignalQualityTime(int p0, long p1, int p2) { return 0L; }
    public long getGpsBatteryDrainMaMs() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getPhoneOnTime(long p0, int p1) { return 0L; }
    public int getPhoneOnCount(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public long getPhoneSignalStrengthTime(int p0, long p1, int p2) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getPhoneSignalScanningTime(long p0, int p1) { return 0L; }
    public com.android.internal.os.BatteryStatsImpl.Timer getPhoneSignalScanningTimer() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getPhoneSignalStrengthCount(int p0, int p1) { return 0; }
    public com.android.internal.os.BatteryStatsImpl.Timer getPhoneSignalStrengthTimer(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public long getPhoneDataConnectionTime(int p0, long p1, int p2) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public int getPhoneDataConnectionCount(int p0, int p1) { return 0; }
    public com.android.internal.os.BatteryStatsImpl.Timer getPhoneDataConnectionTimer(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public long getMobileRadioActiveTime(long p0, int p1) { return 0L; }
    public int getMobileRadioActiveCount(int p0) { return 0; }
    public long getMobileRadioActiveAdjustedTime(int p0) { return 0L; }
    public long getMobileRadioActiveUnknownTime(int p0) { return 0L; }
    public int getMobileRadioActiveUnknownCount(int p0) { return 0; }
    public long getWifiMulticastWakelockTime(long p0, int p1) { return 0L; }
    public int getWifiMulticastWakelockCount(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public long getWifiOnTime(long p0, int p1) { return 0L; }
    public long getWifiActiveTime(long p0, int p1) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getGlobalWifiRunningTime(long p0, int p1) { return 0L; }
    public long getWifiStateTime(int p0, long p1, int p2) { return 0L; }
    public int getWifiStateCount(int p0, int p1) { return 0; }
    public com.android.internal.os.BatteryStatsImpl.Timer getWifiStateTimer(int p0) { return null; }
    public long getWifiSupplStateTime(int p0, long p1, int p2) { return 0L; }
    public int getWifiSupplStateCount(int p0, int p1) { return 0; }
    public com.android.internal.os.BatteryStatsImpl.Timer getWifiSupplStateTimer(int p0) { return null; }
    public long getWifiSignalStrengthTime(int p0, long p1, int p2) { return 0L; }
    public int getWifiSignalStrengthCount(int p0, int p1) { return 0; }
    public com.android.internal.os.BatteryStatsImpl.Timer getWifiSignalStrengthTimer(int p0) { return null; }
    public android.os.BatteryStats.ControllerActivityCounter getBluetoothControllerActivity() { return null; }
    public android.os.BatteryStats.ControllerActivityCounter getWifiControllerActivity() { return null; }
    public android.os.BatteryStats.ControllerActivityCounter getModemControllerActivity() { return null; }
    public boolean hasBluetoothActivityReporting() { return false; }
    public boolean hasWifiActivityReporting() { return false; }
    public boolean hasModemActivityReporting() { return false; }
    public long getFlashlightOnTime(long p0, int p1) { return 0L; }
    public long getFlashlightOnCount(int p0) { return 0L; }
    public long getCameraOnTime(long p0, int p1) { return 0L; }
    public long getBluetoothScanTime(long p0, int p1) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getNetworkActivityBytes(int p0, int p1) { return 0L; }
    public long getNetworkActivityPackets(int p0, int p1) { return 0L; }
    public long getStartClockTime() { return 0L; }
    public java.lang.String getStartPlatformVersion() { return null; }
    public java.lang.String getEndPlatformVersion() { return null; }
    public int getParcelVersion() { return 0; }
    public boolean getIsOnBattery() { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.util.SparseArray<? extends android.os.BatteryStats.Uid> getUidStats() { return null; }
    private static <T extends com.android.internal.os.BatteryStatsImpl.TimeBaseObs> boolean resetIfNotNull(T p0, boolean p1) { return false; }
    private static <T extends com.android.internal.os.BatteryStatsImpl.TimeBaseObs> boolean resetIfNotNull(T[] p0, boolean p1) { return false; }
    private static <T extends com.android.internal.os.BatteryStatsImpl.TimeBaseObs> boolean resetIfNotNull(T[][] p0, boolean p1) { return false; }
    private static boolean resetIfNotNull(com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl p0, boolean p1) { return false; }
    private static <T extends com.android.internal.os.BatteryStatsImpl.TimeBaseObs> void detachIfNotNull(T p0) {}
    private static <T extends com.android.internal.os.BatteryStatsImpl.TimeBaseObs> void detachIfNotNull(T[] p0) {}
    private static <T extends com.android.internal.os.BatteryStatsImpl.TimeBaseObs> void detachIfNotNull(T[][] p0) {}
    private static void detachIfNotNull(com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl p0) {}
    public long[] getCpuFreqs() { return null; }
    public BatteryStatsImpl(java.io.File p0, android.os.Handler p1, com.android.internal.os.BatteryStatsImpl.PlatformIdleStateCallback p2, com.android.internal.os.BatteryStatsImpl.RailEnergyDataCallback p3, com.android.internal.os.BatteryStatsImpl.UserInfoProvider p4) { super(); }
    private BatteryStatsImpl(com.android.internal.os.BatteryStatsImpl.Clocks p0, java.io.File p1, android.os.Handler p2, com.android.internal.os.BatteryStatsImpl.PlatformIdleStateCallback p3, com.android.internal.os.BatteryStatsImpl.RailEnergyDataCallback p4, com.android.internal.os.BatteryStatsImpl.UserInfoProvider p5) { super(); }
    @android.annotation.UnsupportedAppUsage
    public BatteryStatsImpl(android.os.Parcel p0) { super(); }
    public BatteryStatsImpl(com.android.internal.os.BatteryStatsImpl.Clocks p0, android.os.Parcel p1) { super(); }
    public void setPowerProfileLocked(com.android.internal.os.PowerProfile p0) {}
    public void setCallback(com.android.internal.os.BatteryStatsImpl.BatteryCallback p0) {}
    public void setRadioScanningTimeoutLocked(long p0) {}
    public void setExternalStatsSyncLocked(com.android.internal.os.BatteryStatsImpl.ExternalStatsSync p0) {}
    public void updateDailyDeadlineLocked() {}
    public void recordDailyStatsIfNeededLocked(boolean p0) {}
    public void recordDailyStatsLocked() {}
    private void writeDailyItemsLocked(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    private void writeDailyLevelSteps(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, android.os.BatteryStats.LevelStepTracker p2, java.lang.StringBuilder p3) throws java.io.IOException {}
    public void readDailyStatsLocked() {}
    private void readDailyItemsLocked(org.xmlpull.v1.XmlPullParser p0) {}
    void readDailyItemTagLocked(org.xmlpull.v1.XmlPullParser p0) throws java.lang.NumberFormatException, org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    void readDailyItemTagDetailsLocked(org.xmlpull.v1.XmlPullParser p0, android.os.BatteryStats.DailyItem p1, boolean p2, java.lang.String p3) throws java.lang.NumberFormatException, org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.os.BatteryStats.DailyItem getDailyItemLocked(int p0) { return null; }
    public long getCurrentDailyStartTime() { return 0L; }
    public long getNextMinDailyDeadline() { return 0L; }
    public long getNextMaxDailyDeadline() { return 0L; }
    public boolean startIteratingOldHistoryLocked() { return false; }
    public boolean getNextOldHistoryLocked(android.os.BatteryStats.HistoryItem p0) { return false; }
    public void finishIteratingOldHistoryLocked() {}
    public int getHistoryTotalSize() { return 0; }
    public int getHistoryUsedSize() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean startIteratingHistoryLocked() { return false; }
    public int getHistoryStringPoolSize() { return 0; }
    public int getHistoryStringPoolBytes() { return 0; }
    public java.lang.String getHistoryTagPoolString(int p0) { return null; }
    public int getHistoryTagPoolUid(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean getNextHistoryLocked(android.os.BatteryStats.HistoryItem p0) { return false; }
    public void finishIteratingHistoryLocked() {}
    public long getHistoryBaseTime() { return 0L; }
    public int getStartCount() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean isOnBattery() { return false; }
    public boolean isCharging() { return false; }
    public boolean isScreenOn(int p0) { return false; }
    public boolean isScreenOff(int p0) { return false; }
    public boolean isScreenDoze(int p0) { return false; }
    void initTimes(long p0, long p1) {}
    void initDischarge() {}
    public void resetAllStatsCmdLocked() {}
    private void resetAllStatsLocked() {}
    private void initActiveHistoryEventsLocked(long p0, long p1) {}
    void updateDischargeScreenLevelsLocked(int p0, int p1) {}
    private void updateOldDischargeScreenLevelLocked(int p0) {}
    private void updateNewDischargeScreenLevelLocked(int p0) {}
    public void pullPendingStateUpdatesLocked() {}
    private android.net.NetworkStats readNetworkStatsLocked(java.lang.String[] p0) { return null; }
    public void updateWifiState(android.net.wifi.WifiActivityEnergyInfo p0) {}
    private android.telephony.ModemActivityInfo getDeltaModemActivityInfo(android.telephony.ModemActivityInfo p0) { return null; }
    public void updateMobileRadioState(android.telephony.ModemActivityInfo p0) {}
    private synchronized void addModemTxPowerToHistory(android.telephony.ModemActivityInfo p0) {}
    public void updateBluetoothStateLocked(android.bluetooth.BluetoothActivityEnergyInfo p0) {}
    public void updateRpmStatsLocked() {}
    public void updateRailStatsLocked() {}
    public void updateKernelWakelocksLocked() {}
    public void updateKernelMemoryBandwidthLocked() {}
    public boolean isOnBatteryLocked() { return false; }
    public boolean isOnBatteryScreenOffLocked() { return false; }
    public void updateCpuTimeLocked(boolean p0, boolean p1) {}
    public void markPartialTimersAsEligible() {}
    public void updateClusterSpeedTimes(android.util.SparseLongArray p0, boolean p1) {}
    public void readKernelUidCpuTimesLocked(java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p0, android.util.SparseLongArray p1, boolean p2) {}
    public void readKernelUidCpuFreqTimesLocked(java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p0, boolean p1, boolean p2) {}
    public void readKernelUidCpuActiveTimesLocked(boolean p0) {}
    public void readKernelUidCpuClusterTimesLocked(boolean p0) {}
    boolean setChargingLocked(boolean p0) { return false; }
    protected void setOnBatteryLocked(long p0, long p1, boolean p2, int p3, int p4, int p5) {}
    private void startRecordingHistory(long p0, long p1, boolean p2) {}
    private void recordCurrentTimeChangeLocked(long p0, long p1, long p2) {}
    private void recordShutdownLocked(long p0, long p1) {}
    private void scheduleSyncExternalStatsLocked(java.lang.String p0, int p1) {}
    public void setBatteryStateLocked(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public static boolean isOnBattery(int p0, int p1) { return false; }
    private void reportChangesToStatsLog(android.os.BatteryStats.HistoryItem p0, int p1, int p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    public long getAwakeTimeBattery() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getAwakeTimePlugged() { return 0L; }
    public long computeUptime(long p0, int p1) { return 0L; }
    public long computeRealtime(long p0, int p1) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long computeBatteryUptime(long p0, int p1) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long computeBatteryRealtime(long p0, int p1) { return 0L; }
    public long computeBatteryScreenOffUptime(long p0, int p1) { return 0L; }
    public long computeBatteryScreenOffRealtime(long p0, int p1) { return 0L; }
    private long computeTimePerLevel(long[] p0, int p1) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long computeBatteryTimeRemaining(long p0) { return 0L; }
    public android.os.BatteryStats.LevelStepTracker getDischargeLevelStepTracker() { return null; }
    public android.os.BatteryStats.LevelStepTracker getDailyDischargeLevelStepTracker() { return null; }
    public long computeChargeTimeRemaining(long p0) { return 0L; }
    public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() { return null; }
    public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() { return null; }
    public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() { return null; }
    public android.os.BatteryStats.LevelStepTracker getChargeLevelStepTracker() { return null; }
    public android.os.BatteryStats.LevelStepTracker getDailyChargeLevelStepTracker() { return null; }
    public java.util.ArrayList<android.os.BatteryStats.PackageChange> getDailyPackageChanges() { return null; }
    protected long getBatteryUptimeLocked() { return 0L; }
    public long getBatteryUptime(long p0) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getBatteryRealtime(long p0) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public int getDischargeStartLevel() { return 0; }
    public int getDischargeStartLevelLocked() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getDischargeCurrentLevel() { return 0; }
    public int getDischargeCurrentLevelLocked() { return 0; }
    public int getLowDischargeAmountSinceCharge() { return 0; }
    public int getHighDischargeAmountSinceCharge() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getDischargeAmount(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getDischargeAmountScreenOn() { return 0; }
    public int getDischargeAmountScreenOnSinceCharge() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getDischargeAmountScreenOff() { return 0; }
    public int getDischargeAmountScreenOffSinceCharge() { return 0; }
    public int getDischargeAmountScreenDoze() { return 0; }
    public int getDischargeAmountScreenDozeSinceCharge() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.os.BatteryStatsImpl.Uid getUidStatsLocked(int p0) { return null; }
    public com.android.internal.os.BatteryStatsImpl.Uid getAvailableUidStatsLocked(int p0) { return null; }
    public void onCleanupUserLocked(int p0) {}
    public void onUserRemovedLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void removeUidStatsLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.os.BatteryStatsImpl.Uid.Proc getProcessStatsLocked(int p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.os.BatteryStatsImpl.Uid.Pkg getPackageStatsLocked(int p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.os.BatteryStatsImpl.Uid.Pkg.Serv getServiceStatsLocked(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void shutdownLocked() {}
    public boolean trackPerProcStateCpuTimes() { return false; }
    public void systemServicesReady(android.content.Context p0) {}
    public long getExternalStatsCollectionRateLimitMs() { return 0L; }
    public void dumpConstantsLocked(java.io.PrintWriter p0) {}
    public void dumpCpuStatsLocked(java.io.PrintWriter p0) {}
    public void writeAsyncLocked() {}
    public void writeSyncLocked() {}
    void writeStatsLocked(boolean p0) {}
    void writeHistoryLocked(boolean p0) {}
    void writeParcelToFileLocked(android.os.Parcel p0, com.android.internal.os.AtomicFile p1, boolean p2) {}
    private void commitPendingDataToDisk(android.os.Parcel p0, com.android.internal.os.AtomicFile p1) {}
    @android.annotation.UnsupportedAppUsage
    public void readLocked() {}
    public int describeContents() { return 0; }
    void readHistoryBuffer(android.os.Parcel p0, boolean p1) throws android.os.ParcelFormatException {}
    void readOldHistory(android.os.Parcel p0) {}
    void writeHistoryBuffer(android.os.Parcel p0, boolean p1, boolean p2) {}
    void writeOldHistory(android.os.Parcel p0) {}
    public void readSummaryFromParcel(android.os.Parcel p0) throws android.os.ParcelFormatException {}
    public void writeSummaryToParcel(android.os.Parcel p0, boolean p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    void readFromParcelLocked(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelWithoutUids(android.os.Parcel p0, int p1) {}
    void writeToParcelLocked(android.os.Parcel p0, boolean p1, int p2) {}
    public void prepareForDumpLocked() {}
    public void dumpLocked(android.content.Context p0, java.io.PrintWriter p1, int p2, int p3, long p4) {}

    public static abstract class UserInfoProvider {
        private int[] userIds;
        public UserInfoProvider() {}
        protected abstract int[] getUserIds();
        public final void refreshUserIds() {}
        public boolean exists(int p0) { return false; }
    }

    public final class UidToRemove {
        int startUid;
        int endUid;
        long timeAddedInQueue;
        public UidToRemove(com.android.internal.os.BatteryStatsImpl p0, int p1, long p2) {}
        public UidToRemove(com.android.internal.os.BatteryStatsImpl p0, int p1, int p2, long p3) {}
        void remove() {}
    }

    public static class Uid extends android.os.BatteryStats.Uid {
        protected com.android.internal.os.BatteryStatsImpl mBsi;
        final int mUid = 0;
        public final com.android.internal.os.BatteryStatsImpl.TimeBase mOnBatteryBackgroundTimeBase = null;
        public final com.android.internal.os.BatteryStatsImpl.TimeBase mOnBatteryScreenOffBackgroundTimeBase = null;
        boolean mWifiRunning;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mWifiRunningTimer;
        boolean mFullWifiLockOut;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mFullWifiLockTimer;
        boolean mWifiScanStarted;
        com.android.internal.os.BatteryStatsImpl.DualTimer mWifiScanTimer;
        static final int NO_BATCHED_SCAN_STARTED = -1;
        int mWifiBatchedScanBinStarted;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mWifiBatchedScanTimer;
        int mWifiMulticastWakelockCount;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mWifiMulticastTimer;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mAudioTurnedOnTimer;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mVideoTurnedOnTimer;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mFlashlightTurnedOnTimer;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mCameraTurnedOnTimer;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mForegroundActivityTimer;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer mForegroundServiceTimer;
        com.android.internal.os.BatteryStatsImpl.DualTimer mAggregatedPartialWakelockTimer;
        com.android.internal.os.BatteryStatsImpl.DualTimer mBluetoothScanTimer;
        com.android.internal.os.BatteryStatsImpl.DualTimer mBluetoothUnoptimizedScanTimer;
        com.android.internal.os.BatteryStatsImpl.Counter mBluetoothScanResultCounter;
        com.android.internal.os.BatteryStatsImpl.Counter mBluetoothScanResultBgCounter;
        int mProcessState;
        com.android.internal.os.BatteryStatsImpl.StopwatchTimer[] mProcessStateTimer;
        boolean mInForegroundService;
        com.android.internal.os.BatteryStatsImpl.BatchTimer mVibratorOnTimer;
        com.android.internal.os.BatteryStatsImpl.Counter[] mUserActivityCounters;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[] mNetworkByteActivityCounters;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[] mNetworkPacketActivityCounters;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMobileRadioActiveTime;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMobileRadioActiveCount;
        private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMobileRadioApWakeupCount;
        private com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mWifiRadioApWakeupCount;
        private com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl mWifiControllerActivity;
        private com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl mBluetoothControllerActivity;
        private com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl mModemControllerActivity;
        long mLastStepUserTime;
        long mLastStepSystemTime;
        long mCurStepUserTime;
        long mCurStepSystemTime;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mUserCpuTime;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mSystemCpuTime;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[][] mCpuClusterSpeedTimesUs;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mCpuActiveTimeMs;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray mCpuFreqTimeMs;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray mScreenOffCpuFreqTimeMs;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray mCpuClusterTimesMs;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray[] mProcStateTimeMs;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray[] mProcStateScreenOffTimeMs;
        android.util.IntArray mChildUids;
        final com.android.internal.os.BatteryStatsImpl.OverflowArrayMap<com.android.internal.os.BatteryStatsImpl.Uid.Wakelock> mWakelockStats = null;
        final com.android.internal.os.BatteryStatsImpl.OverflowArrayMap<com.android.internal.os.BatteryStatsImpl.DualTimer> mSyncStats = null;
        final com.android.internal.os.BatteryStatsImpl.OverflowArrayMap<com.android.internal.os.BatteryStatsImpl.DualTimer> mJobStats = null;
        final android.util.ArrayMap<java.lang.String, android.util.SparseIntArray> mJobCompletions = null;
        com.android.internal.os.BatteryStatsImpl.Counter mJobsDeferredEventCount;
        com.android.internal.os.BatteryStatsImpl.Counter mJobsDeferredCount;
        com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mJobsFreshnessTimeMs;
        final com.android.internal.os.BatteryStatsImpl.Counter[] mJobsFreshnessBuckets = null;
        final android.util.SparseArray<com.android.internal.os.BatteryStatsImpl.Uid.Sensor> mSensorStats = null;
        final android.util.ArrayMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.Uid.Proc> mProcessStats = null;
        final android.util.ArrayMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.Uid.Pkg> mPackageStats = null;
        final android.util.SparseArray<android.os.BatteryStats.Uid.Pid> mPids = null;
        public Uid(com.android.internal.os.BatteryStatsImpl p0, int p1) { super(); }
        public void setProcessStateForTest(int p0) {}
        public long[] getCpuFreqTimes(int p0) { return null; }
        public long[] getScreenOffCpuFreqTimes(int p0) { return null; }
        public long getCpuActiveTime() { return 0L; }
        public long[] getCpuClusterTimes() { return null; }
        public long[] getCpuFreqTimes(int p0, int p1) { return null; }
        public long[] getScreenOffCpuFreqTimes(int p0, int p1) { return null; }
        public void addIsolatedUid(int p0) {}
        public void removeIsolatedUid(int p0) {}
        private long[] nullIfAllZeros(com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray p0, int p1) { return null; }
        private void addProcStateTimesMs(int p0, long[] p1, boolean p2) {}
        private void addProcStateScreenOffTimesMs(int p0, long[] p1, boolean p2) {}
        public com.android.internal.os.BatteryStatsImpl.Timer getAggregatedPartialWakelockTimer() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Wakelock> getWakelockStats() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getMulticastWakelockStats() { return null; }
        public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Timer> getSyncStats() { return null; }
        public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Timer> getJobStats() { return null; }
        public android.util.ArrayMap<java.lang.String, android.util.SparseIntArray> getJobCompletionStats() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.util.SparseArray<? extends android.os.BatteryStats.Uid.Sensor> getSensorStats() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Proc> getProcessStats() { return null; }
        public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Pkg> getPackageStats() { return null; }
        @android.annotation.UnsupportedAppUsage
        public int getUid() { return 0; }
        public void noteWifiRunningLocked(long p0) {}
        public void noteWifiStoppedLocked(long p0) {}
        public void noteFullWifiLockAcquiredLocked(long p0) {}
        public void noteFullWifiLockReleasedLocked(long p0) {}
        public void noteWifiScanStartedLocked(long p0) {}
        public void noteWifiScanStoppedLocked(long p0) {}
        public void noteWifiBatchedScanStartedLocked(int p0, long p1) {}
        public void noteWifiBatchedScanStoppedLocked(long p0) {}
        public void noteWifiMulticastEnabledLocked(long p0) {}
        public void noteWifiMulticastDisabledLocked(long p0) {}
        public android.os.BatteryStats.ControllerActivityCounter getWifiControllerActivity() { return null; }
        public android.os.BatteryStats.ControllerActivityCounter getBluetoothControllerActivity() { return null; }
        public android.os.BatteryStats.ControllerActivityCounter getModemControllerActivity() { return null; }
        public com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl getOrCreateWifiControllerActivityLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl getOrCreateBluetoothControllerActivityLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.ControllerActivityCounterImpl getOrCreateModemControllerActivityLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer createAudioTurnedOnTimerLocked() { return null; }
        public void noteAudioTurnedOnLocked(long p0) {}
        public void noteAudioTurnedOffLocked(long p0) {}
        public void noteResetAudioLocked(long p0) {}
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer createVideoTurnedOnTimerLocked() { return null; }
        public void noteVideoTurnedOnLocked(long p0) {}
        public void noteVideoTurnedOffLocked(long p0) {}
        public void noteResetVideoLocked(long p0) {}
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer createFlashlightTurnedOnTimerLocked() { return null; }
        public void noteFlashlightTurnedOnLocked(long p0) {}
        public void noteFlashlightTurnedOffLocked(long p0) {}
        public void noteResetFlashlightLocked(long p0) {}
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer createCameraTurnedOnTimerLocked() { return null; }
        public void noteCameraTurnedOnLocked(long p0) {}
        public void noteCameraTurnedOffLocked(long p0) {}
        public void noteResetCameraLocked(long p0) {}
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer createForegroundActivityTimerLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer createForegroundServiceTimerLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.DualTimer createAggregatedPartialWakelockTimerLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.DualTimer createBluetoothScanTimerLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.DualTimer createBluetoothUnoptimizedScanTimerLocked() { return null; }
        public void noteBluetoothScanStartedLocked(long p0, boolean p1) {}
        public void noteBluetoothScanStoppedLocked(long p0, boolean p1) {}
        public void noteResetBluetoothScanLocked(long p0) {}
        public com.android.internal.os.BatteryStatsImpl.Counter createBluetoothScanResultCounterLocked() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Counter createBluetoothScanResultBgCounterLocked() { return null; }
        public void noteBluetoothScanResultsLocked(int p0) {}
        public void noteActivityResumedLocked(long p0) {}
        public void noteActivityPausedLocked(long p0) {}
        public void noteForegroundServiceResumedLocked(long p0) {}
        public void noteForegroundServicePausedLocked(long p0) {}
        public com.android.internal.os.BatteryStatsImpl.BatchTimer createVibratorOnTimerLocked() { return null; }
        public void noteVibratorOnLocked(long p0) {}
        public void noteVibratorOffLocked() {}
        @android.annotation.UnsupportedAppUsage
        public long getWifiRunningTime(long p0, int p1) { return 0L; }
        public long getFullWifiLockTime(long p0, int p1) { return 0L; }
        @android.annotation.UnsupportedAppUsage
        public long getWifiScanTime(long p0, int p1) { return 0L; }
        public int getWifiScanCount(int p0) { return 0; }
        public com.android.internal.os.BatteryStatsImpl.Timer getWifiScanTimer() { return null; }
        public int getWifiScanBackgroundCount(int p0) { return 0; }
        public long getWifiScanActualTime(long p0) { return 0L; }
        public long getWifiScanBackgroundTime(long p0) { return 0L; }
        public com.android.internal.os.BatteryStatsImpl.Timer getWifiScanBackgroundTimer() { return null; }
        public long getWifiBatchedScanTime(int p0, long p1, int p2) { return 0L; }
        public int getWifiBatchedScanCount(int p0, int p1) { return 0; }
        public long getWifiMulticastTime(long p0, int p1) { return 0L; }
        public com.android.internal.os.BatteryStatsImpl.Timer getAudioTurnedOnTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getVideoTurnedOnTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getFlashlightTurnedOnTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getCameraTurnedOnTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getForegroundActivityTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getForegroundServiceTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getBluetoothScanTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getBluetoothScanBackgroundTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getBluetoothUnoptimizedScanTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getBluetoothUnoptimizedScanBackgroundTimer() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Counter getBluetoothScanResultCounter() { return null; }
        public com.android.internal.os.BatteryStatsImpl.Counter getBluetoothScanResultBgCounter() { return null; }
        void makeProcessState(int p0, android.os.Parcel p1) {}
        public long getProcessStateTime(int p0, long p1, int p2) { return 0L; }
        public com.android.internal.os.BatteryStatsImpl.Timer getProcessStateTimer(int p0) { return null; }
        public com.android.internal.os.BatteryStatsImpl.Timer getVibratorOnTimer() { return null; }
        public void noteUserActivityLocked(int p0) {}
        public boolean hasUserActivity() { return false; }
        public int getUserActivityCount(int p0, int p1) { return 0; }
        void makeWifiBatchedScanBin(int p0, android.os.Parcel p1) {}
        void initUserActivityLocked() {}
        void noteNetworkActivityLocked(int p0, long p1, long p2) {}
        void noteMobileRadioActiveTimeLocked(long p0) {}
        public boolean hasNetworkActivity() { return false; }
        public long getNetworkActivityBytes(int p0, int p1) { return 0L; }
        public long getNetworkActivityPackets(int p0, int p1) { return 0L; }
        public long getMobileRadioActiveTime(int p0) { return 0L; }
        public int getMobileRadioActiveCount(int p0) { return 0; }
        public long getUserCpuTimeUs(int p0) { return 0L; }
        public long getSystemCpuTimeUs(int p0) { return 0L; }
        public long getTimeAtCpuSpeed(int p0, int p1, int p2) { return 0L; }
        public void noteMobileRadioApWakeupLocked() {}
        public long getMobileRadioApWakeupCount(int p0) { return 0L; }
        public void noteWifiRadioApWakeupLocked() {}
        public long getWifiRadioApWakeupCount(int p0) { return 0L; }
        public void getDeferredJobsCheckinLineLocked(java.lang.StringBuilder p0, int p1) {}
        public void getDeferredJobsLineLocked(java.lang.StringBuilder p0, int p1) {}
        void initNetworkActivityLocked() {}
        public boolean reset(long p0, long p1) { return false; }
        void detachFromTimeBase() {}
        void writeJobCompletionsToParcelLocked(android.os.Parcel p0) {}
        void writeToParcelLocked(android.os.Parcel p0, long p1, long p2) {}
        void readJobCompletionsFromParcelLocked(android.os.Parcel p0) {}
        void readFromParcelLocked(com.android.internal.os.BatteryStatsImpl.TimeBase p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1, android.os.Parcel p2) {}
        public void noteJobsDeferredLocked(int p0, long p1) {}
        public com.android.internal.os.BatteryStatsImpl.Uid.Proc getProcessStatsLocked(java.lang.String p0) { return null; }
        public void updateUidProcessStateLocked(int p0) {}
        public boolean isInBackground() { return false; }
        public boolean updateOnBatteryBgTimeBase(long p0, long p1) { return false; }
        public boolean updateOnBatteryScreenOffBgTimeBase(long p0, long p1) { return false; }
        public android.util.SparseArray<? extends android.os.BatteryStats.Uid.Pid> getPidStats() { return null; }
        public android.os.BatteryStats.Uid.Pid getPidStatsLocked(int p0) { return null; }
        public com.android.internal.os.BatteryStatsImpl.Uid.Pkg getPackageStatsLocked(java.lang.String p0) { return null; }
        public com.android.internal.os.BatteryStatsImpl.Uid.Pkg.Serv getServiceStatsLocked(java.lang.String p0, java.lang.String p1) { return null; }
        public void readSyncSummaryFromParcelLocked(java.lang.String p0, android.os.Parcel p1) {}
        public void readJobSummaryFromParcelLocked(java.lang.String p0, android.os.Parcel p1) {}
        public void readWakeSummaryFromParcelLocked(java.lang.String p0, android.os.Parcel p1) {}
        public com.android.internal.os.BatteryStatsImpl.DualTimer getSensorTimerLocked(int p0, boolean p1) { return null; }
        public void noteStartSyncLocked(java.lang.String p0, long p1) {}
        public void noteStopSyncLocked(java.lang.String p0, long p1) {}
        public void noteStartJobLocked(java.lang.String p0, long p1) {}
        public void noteStopJobLocked(java.lang.String p0, long p1, int p2) {}
        public com.android.internal.os.BatteryStatsImpl.StopwatchTimer getWakelockTimerLocked(com.android.internal.os.BatteryStatsImpl.Uid.Wakelock p0, int p1) { return null; }
        public void noteStartWakeLocked(int p0, java.lang.String p1, int p2, long p3) {}
        public void noteStopWakeLocked(int p0, java.lang.String p1, int p2, long p3) {}
        public void reportExcessiveCpuLocked(java.lang.String p0, long p1, long p2) {}
        public void noteStartSensor(int p0, long p1) {}
        public void noteStopSensor(int p0, long p1) {}
        public void noteStartGps(long p0) {}
        public void noteStopGps(long p0) {}
        public com.android.internal.os.BatteryStatsImpl getBatteryStats() { return null; }

        public static class Wakelock extends android.os.BatteryStats.Uid.Wakelock {
            protected com.android.internal.os.BatteryStatsImpl mBsi;
            protected com.android.internal.os.BatteryStatsImpl.Uid mUid;
            com.android.internal.os.BatteryStatsImpl.DualTimer mTimerPartial;
            com.android.internal.os.BatteryStatsImpl.StopwatchTimer mTimerFull;
            com.android.internal.os.BatteryStatsImpl.StopwatchTimer mTimerWindow;
            com.android.internal.os.BatteryStatsImpl.StopwatchTimer mTimerDraw;
            public Wakelock(com.android.internal.os.BatteryStatsImpl p0, com.android.internal.os.BatteryStatsImpl.Uid p1) { super(); }
            private com.android.internal.os.BatteryStatsImpl.StopwatchTimer readStopwatchTimerFromParcel(int p0, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p1, com.android.internal.os.BatteryStatsImpl.TimeBase p2, android.os.Parcel p3) { return null; }
            private com.android.internal.os.BatteryStatsImpl.DualTimer readDualTimerFromParcel(int p0, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p1, com.android.internal.os.BatteryStatsImpl.TimeBase p2, com.android.internal.os.BatteryStatsImpl.TimeBase p3, android.os.Parcel p4) { return null; }
            boolean reset() { return false; }
            void readFromParcelLocked(com.android.internal.os.BatteryStatsImpl.TimeBase p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1, com.android.internal.os.BatteryStatsImpl.TimeBase p2, android.os.Parcel p3) {}
            void writeToParcelLocked(android.os.Parcel p0, long p1) {}
            @android.annotation.UnsupportedAppUsage
            public com.android.internal.os.BatteryStatsImpl.Timer getWakeTime(int p0) { return null; }
            public void detachFromTimeBase() {}
        }

        public static class Sensor extends android.os.BatteryStats.Uid.Sensor {
            protected com.android.internal.os.BatteryStatsImpl mBsi;
            protected com.android.internal.os.BatteryStatsImpl.Uid mUid;
            final int mHandle = 0;
            com.android.internal.os.BatteryStatsImpl.DualTimer mTimer;
            public Sensor(com.android.internal.os.BatteryStatsImpl p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2) { super(); }
            private com.android.internal.os.BatteryStatsImpl.DualTimer readTimersFromParcel(com.android.internal.os.BatteryStatsImpl.TimeBase p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1, android.os.Parcel p2) { return null; }
            boolean reset() { return false; }
            void readFromParcelLocked(com.android.internal.os.BatteryStatsImpl.TimeBase p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1, android.os.Parcel p2) {}
            void writeToParcelLocked(android.os.Parcel p0, long p1) {}
            @android.annotation.UnsupportedAppUsage
            public com.android.internal.os.BatteryStatsImpl.Timer getSensorTime() { return null; }
            public com.android.internal.os.BatteryStatsImpl.Timer getSensorBackgroundTime() { return null; }
            @android.annotation.UnsupportedAppUsage
            public int getHandle() { return 0; }
            public void detachFromTimeBase() {}
        }

        public static class Proc extends android.os.BatteryStats.Uid.Proc implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
            protected com.android.internal.os.BatteryStatsImpl mBsi;
            final java.lang.String mName = null;
            boolean mActive;
            long mUserTime;
            long mSystemTime;
            long mForegroundTime;
            int mStarts;
            int mNumCrashes;
            int mNumAnrs;
            java.util.ArrayList<android.os.BatteryStats.Uid.Proc.ExcessivePower> mExcessivePower;
            public Proc(com.android.internal.os.BatteryStatsImpl p0, java.lang.String p1) { super(); }
            public void onTimeStarted(long p0, long p1, long p2) {}
            public void onTimeStopped(long p0, long p1, long p2) {}
            public boolean reset(boolean p0) { return false; }
            public void detach() {}
            public int countExcessivePowers() { return 0; }
            public android.os.BatteryStats.Uid.Proc.ExcessivePower getExcessivePower(int p0) { return null; }
            public void addExcessiveCpu(long p0, long p1) {}
            void writeExcessivePowerToParcelLocked(android.os.Parcel p0) {}
            void readExcessivePowerFromParcelLocked(android.os.Parcel p0) {}
            void writeToParcelLocked(android.os.Parcel p0) {}
            void readFromParcelLocked(android.os.Parcel p0) {}
            @android.annotation.UnsupportedAppUsage
            public void addCpuTimeLocked(int p0, int p1) {}
            public void addCpuTimeLocked(int p0, int p1, boolean p2) {}
            @android.annotation.UnsupportedAppUsage
            public void addForegroundTimeLocked(long p0) {}
            @android.annotation.UnsupportedAppUsage
            public void incStartsLocked() {}
            public void incNumCrashesLocked() {}
            public void incNumAnrsLocked() {}
            public boolean isActive() { return false; }
            @android.annotation.UnsupportedAppUsage
            public long getUserTime(int p0) { return 0L; }
            @android.annotation.UnsupportedAppUsage
            public long getSystemTime(int p0) { return 0L; }
            @android.annotation.UnsupportedAppUsage
            public long getForegroundTime(int p0) { return 0L; }
            @android.annotation.UnsupportedAppUsage
            public int getStarts(int p0) { return 0; }
            public int getNumCrashes(int p0) { return 0; }
            public int getNumAnrs(int p0) { return 0; }
        }

        public static class Pkg extends android.os.BatteryStats.Uid.Pkg implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
            protected com.android.internal.os.BatteryStatsImpl mBsi;
            android.util.ArrayMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.Counter> mWakeupAlarms;
            final android.util.ArrayMap<java.lang.String, com.android.internal.os.BatteryStatsImpl.Uid.Pkg.Serv> mServiceStats = null;
            public Pkg(com.android.internal.os.BatteryStatsImpl p0) { super(); }
            public void onTimeStarted(long p0, long p1, long p2) {}
            public void onTimeStopped(long p0, long p1, long p2) {}
            public boolean reset(boolean p0) { return false; }
            public void detach() {}
            void readFromParcelLocked(android.os.Parcel p0) {}
            void writeToParcelLocked(android.os.Parcel p0) {}
            public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Counter> getWakeupAlarmStats() { return null; }
            public void noteWakeupAlarmLocked(java.lang.String p0) {}
            public android.util.ArrayMap<java.lang.String, ? extends android.os.BatteryStats.Uid.Pkg.Serv> getServiceStats() { return null; }
            final com.android.internal.os.BatteryStatsImpl.Uid.Pkg.Serv newServiceStatsLocked() { return null; }

            public static class Serv extends android.os.BatteryStats.Uid.Pkg.Serv implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
                protected com.android.internal.os.BatteryStatsImpl mBsi;
                protected com.android.internal.os.BatteryStatsImpl.Uid.Pkg mPkg;
                protected long mStartTime;
                protected long mRunningSince;
                protected boolean mRunning;
                protected int mStarts;
                protected long mLaunchedTime;
                protected long mLaunchedSince;
                protected boolean mLaunched;
                protected int mLaunches;
                public Serv(com.android.internal.os.BatteryStatsImpl p0) { super(); }
                public void onTimeStarted(long p0, long p1, long p2) {}
                public void onTimeStopped(long p0, long p1, long p2) {}
                public boolean reset(boolean p0) { return false; }
                public void detach() {}
                public void readFromParcelLocked(android.os.Parcel p0) {}
                public void writeToParcelLocked(android.os.Parcel p0) {}
                public long getLaunchTimeToNowLocked(long p0) { return 0L; }
                public long getStartTimeToNowLocked(long p0) { return 0L; }
                @android.annotation.UnsupportedAppUsage
                public void startLaunchedLocked() {}
                @android.annotation.UnsupportedAppUsage
                public void stopLaunchedLocked() {}
                @android.annotation.UnsupportedAppUsage
                public void startRunningLocked() {}
                @android.annotation.UnsupportedAppUsage
                public void stopRunningLocked() {}
                @android.annotation.UnsupportedAppUsage
                public com.android.internal.os.BatteryStatsImpl getBatteryStats() { return null; }
                public int getLaunches(int p0) { return 0; }
                public long getStartTime(long p0, int p1) { return 0L; }
                public int getStarts(int p0) { return 0; }
            }
        }
    }

    public static abstract class Timer extends android.os.BatteryStats.Timer implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
        protected final com.android.internal.os.BatteryStatsImpl.Clocks mClocks = null;
        protected final int mType = 0;
        protected final com.android.internal.os.BatteryStatsImpl.TimeBase mTimeBase = null;
        protected int mCount;
        protected long mTotalTime;
        protected long mTimeBeforeMark;
        public Timer(com.android.internal.os.BatteryStatsImpl.Clocks p0, int p1, com.android.internal.os.BatteryStatsImpl.TimeBase p2, android.os.Parcel p3) { super(); }
        public Timer(com.android.internal.os.BatteryStatsImpl.Clocks p0, int p1, com.android.internal.os.BatteryStatsImpl.TimeBase p2) { super(); }
        public void writeToParcel(android.os.Parcel p0, long p1) {}
        protected abstract long computeRunTimeLocked(long p0);
        protected abstract int computeCurrentCountLocked();
        public boolean reset(boolean p0) { return false; }
        public void detach() {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        @android.annotation.UnsupportedAppUsage
        public static void writeTimerToParcel(android.os.Parcel p0, com.android.internal.os.BatteryStatsImpl.Timer p1, long p2) {}
        @android.annotation.UnsupportedAppUsage
        public long getTotalTimeLocked(long p0, int p1) { return 0L; }
        @android.annotation.UnsupportedAppUsage
        public int getCountLocked(int p0) { return 0; }
        public long getTimeSinceMarkLocked(long p0) { return 0L; }
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        public void writeSummaryFromParcelLocked(android.os.Parcel p0, long p1) {}
        public void readSummaryFromParcelLocked(android.os.Parcel p0) {}
    }

    public static interface TimeBaseObs {
        public void onTimeStarted(long p0, long p1, long p2);
        public void onTimeStopped(long p0, long p1, long p2);
        public boolean reset(boolean p0);
        public void detach();
    }

    public static class TimeBase {
        protected final java.util.Collection<com.android.internal.os.BatteryStatsImpl.TimeBaseObs> mObservers = null;
        protected long mUptime;
        protected long mRealtime;
        protected boolean mRunning;
        protected long mPastUptime;
        protected long mUptimeStart;
        protected long mPastRealtime;
        protected long mRealtimeStart;
        protected long mUnpluggedUptime;
        protected long mUnpluggedRealtime;
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
        public TimeBase(boolean p0) {}
        public TimeBase() {}
        public void add(com.android.internal.os.BatteryStatsImpl.TimeBaseObs p0) {}
        public void remove(com.android.internal.os.BatteryStatsImpl.TimeBaseObs p0) {}
        public boolean hasObserver(com.android.internal.os.BatteryStatsImpl.TimeBaseObs p0) { return false; }
        public void init(long p0, long p1) {}
        public void reset(long p0, long p1) {}
        public long computeUptime(long p0, int p1) { return 0L; }
        public long computeRealtime(long p0, int p1) { return 0L; }
        public long getUptime(long p0) { return 0L; }
        public long getRealtime(long p0) { return 0L; }
        public long getUptimeStart() { return 0L; }
        public long getRealtimeStart() { return 0L; }
        public boolean isRunning() { return false; }
        public boolean setRunning(boolean p0, long p1, long p2) { return false; }
        public void readSummaryFromParcel(android.os.Parcel p0) {}
        public void writeSummaryToParcel(android.os.Parcel p0, long p1, long p2) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, long p1, long p2) {}
    }

    public static class SystemClocks implements com.android.internal.os.BatteryStatsImpl.Clocks {
        public SystemClocks() {}
        public long elapsedRealtime() { return 0L; }
        public long uptimeMillis() { return 0L; }
    }

    public static class StopwatchTimer extends com.android.internal.os.BatteryStatsImpl.Timer {
        final com.android.internal.os.BatteryStatsImpl.Uid mUid = null;
        final java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> mTimerPool = null;
        int mNesting;
        long mUpdateTime;
        long mAcquireTime;
        long mTimeout;
        public boolean mInList;
        public StopwatchTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p3, com.android.internal.os.BatteryStatsImpl.TimeBase p4, android.os.Parcel p5) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, 0, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public StopwatchTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p3, com.android.internal.os.BatteryStatsImpl.TimeBase p4) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, 0, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public void setTimeout(long p0) {}
        public void writeToParcel(android.os.Parcel p0, long p1) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        public void startRunningLocked(long p0) {}
        public boolean isRunningLocked() { return false; }
        public void stopRunningLocked(long p0) {}
        public void stopAllRunningLocked(long p0) {}
        private static long refreshTimersLocked(long p0, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p1, com.android.internal.os.BatteryStatsImpl.StopwatchTimer p2) { return 0L; }
        protected long computeRunTimeLocked(long p0) { return 0L; }
        protected int computeCurrentCountLocked() { return 0; }
        public boolean reset(boolean p0) { return false; }
        @android.annotation.UnsupportedAppUsage
        public void detach() {}
        public void readSummaryFromParcelLocked(android.os.Parcel p0) {}
        public void setMark(long p0) {}
    }

    public static class SamplingTimer extends com.android.internal.os.BatteryStatsImpl.Timer {
        int mCurrentReportedCount;
        int mUnpluggedReportedCount;
        long mCurrentReportedTotalTime;
        long mUnpluggedReportedTotalTime;
        boolean mTimeBaseRunning;
        boolean mTrackingReportedValues;
        int mUpdateVersion;
        public SamplingTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1, android.os.Parcel p2) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, 0, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public SamplingTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, 0, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public void endSample() {}
        public void setUpdateVersion(int p0) {}
        public int getUpdateVersion() { return 0; }
        public void update(long p0, int p1) {}
        public void add(long p0, int p1) {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        protected long computeRunTimeLocked(long p0) { return 0L; }
        protected int computeCurrentCountLocked() { return 0; }
        public void writeToParcel(android.os.Parcel p0, long p1) {}
        public boolean reset(boolean p0) { return false; }
    }

    public static interface RailEnergyDataCallback {
        public void fillRailDataStats(com.android.internal.os.RailStats p0);
    }

    public static interface PlatformIdleStateCallback {
        public void fillLowPowerStats(com.android.internal.os.RpmStats p0);
        public java.lang.String getPlatformLowPowerStats();
        public java.lang.String getSubsystemLowPowerStats();
    }

    public abstract class OverflowArrayMap<T extends java.lang.Object> {
        private static final java.lang.String OVERFLOW_NAME = "*overflow*";
        final int mUid = 0;
        final android.util.ArrayMap<java.lang.String, T> mMap = null;
        T mCurOverflow;
        android.util.ArrayMap<java.lang.String, android.util.MutableInt> mActiveOverflow;
        long mLastOverflowTime;
        long mLastOverflowFinishTime;
        long mLastClearTime;
        long mLastCleanupTime;
        public OverflowArrayMap(com.android.internal.os.BatteryStatsImpl p0, int p1) {}
        public android.util.ArrayMap<java.lang.String, T> getMap() { return null; }
        public void clear() {}
        public void add(java.lang.String p0, T p1) {}
        public void cleanup() {}
        public T startObject(java.lang.String p0) { return null; }
        public T stopObject(java.lang.String p0) { return null; }
        public abstract T instantiateObject();
    }

    final class MyHandler extends android.os.Handler {
        public MyHandler(com.android.internal.os.BatteryStatsImpl p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static class LongSamplingCounterArray extends android.os.BatteryStats.LongCounterArray implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
        final com.android.internal.os.BatteryStatsImpl.TimeBase mTimeBase = null;
        public long[] mCounts;
        private LongSamplingCounterArray(com.android.internal.os.BatteryStatsImpl.TimeBase p0, android.os.Parcel p1) { super(); }
        public LongSamplingCounterArray(com.android.internal.os.BatteryStatsImpl.TimeBase p0) { super(); }
        private void writeToParcel(android.os.Parcel p0) {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public long[] getCountsLocked(int p0) { return null; }
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        public void addCountLocked(long[] p0) {}
        public void addCountLocked(long[] p0, boolean p1) {}
        public int getSize() { return 0; }
        public boolean reset(boolean p0) { return false; }
        public void detach() {}
        private void writeSummaryToParcelLocked(android.os.Parcel p0) {}
        private void readSummaryFromParcelLocked(android.os.Parcel p0) {}
        public static void writeToParcel(android.os.Parcel p0, com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray p1) {}
        public static com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray readFromParcel(android.os.Parcel p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1) { return null; }
        public static void writeSummaryToParcelLocked(android.os.Parcel p0, com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray p1) {}
        public static com.android.internal.os.BatteryStatsImpl.LongSamplingCounterArray readSummaryFromParcelLocked(android.os.Parcel p0, com.android.internal.os.BatteryStatsImpl.TimeBase p1) { return null; }
    }

    public static class LongSamplingCounter extends android.os.BatteryStats.LongCounter implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
        final com.android.internal.os.BatteryStatsImpl.TimeBase mTimeBase = null;
        private long mCount;
        public LongSamplingCounter(com.android.internal.os.BatteryStatsImpl.TimeBase p0, android.os.Parcel p1) { super(); }
        public LongSamplingCounter(com.android.internal.os.BatteryStatsImpl.TimeBase p0) { super(); }
        public void writeToParcel(android.os.Parcel p0) {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public long getCountLocked(int p0) { return 0L; }
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        public void addCountLocked(long p0) {}
        public void addCountLocked(long p0, boolean p1) {}
        public boolean reset(boolean p0) { return false; }
        public void detach() {}
        public void writeSummaryFromParcelLocked(android.os.Parcel p0) {}
        public void readSummaryFromParcelLocked(android.os.Parcel p0) {}
    }

    public static interface ExternalStatsSync {
        public static final int UPDATE_CPU = 1;
        public static final int UPDATE_WIFI = 2;
        public static final int UPDATE_RADIO = 4;
        public static final int UPDATE_BT = 8;
        public static final int UPDATE_RPM = 16;
        public static final int UPDATE_ALL = 31;
        public java.util.concurrent.Future<?> scheduleSync(java.lang.String p0, int p1);
        public java.util.concurrent.Future<?> scheduleCpuSyncDueToRemovedUid(int p0);
        public java.util.concurrent.Future<?> scheduleReadProcStateCpuTimes(boolean p0, boolean p1, long p2);
        public java.util.concurrent.Future<?> scheduleCopyFromAllUidsCpuTimes(boolean p0, boolean p1);
        public java.util.concurrent.Future<?> scheduleCpuSyncDueToSettingChange();
        public java.util.concurrent.Future<?> scheduleCpuSyncDueToScreenStateChange(boolean p0, boolean p1);
        public java.util.concurrent.Future<?> scheduleCpuSyncDueToWakelockChange(long p0);
        public void cancelCpuSyncDueToWakelockChange();
        public java.util.concurrent.Future<?> scheduleSyncDueToBatteryLevelChange(long p0);
    }

    public static class DurationTimer extends com.android.internal.os.BatteryStatsImpl.StopwatchTimer {
        long mStartTimeMs;
        long mMaxDurationMs;
        long mCurrentDurationMs;
        long mTotalDurationMs;
        public DurationTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p3, com.android.internal.os.BatteryStatsImpl.TimeBase p4, android.os.Parcel p5) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, (com.android.internal.os.BatteryStatsImpl.Uid)null, 0, (java.util.ArrayList)null, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public DurationTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p3, com.android.internal.os.BatteryStatsImpl.TimeBase p4) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, (com.android.internal.os.BatteryStatsImpl.Uid)null, 0, (java.util.ArrayList)null, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public void writeToParcel(android.os.Parcel p0, long p1) {}
        public void writeSummaryFromParcelLocked(android.os.Parcel p0, long p1) {}
        public void readSummaryFromParcelLocked(android.os.Parcel p0) {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        public void startRunningLocked(long p0) {}
        public void stopRunningLocked(long p0) {}
        public boolean reset(boolean p0) { return false; }
        public long getMaxDurationMsLocked(long p0) { return 0L; }
        public long getCurrentDurationMsLocked(long p0) { return 0L; }
        public long getTotalDurationMsLocked(long p0) { return 0L; }
    }

    public static class DualTimer extends com.android.internal.os.BatteryStatsImpl.DurationTimer {
        private final com.android.internal.os.BatteryStatsImpl.DurationTimer mSubTimer = null;
        public DualTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p3, com.android.internal.os.BatteryStatsImpl.TimeBase p4, com.android.internal.os.BatteryStatsImpl.TimeBase p5, android.os.Parcel p6) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, (com.android.internal.os.BatteryStatsImpl.Uid)null, 0, (java.util.ArrayList)null, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public DualTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, java.util.ArrayList<com.android.internal.os.BatteryStatsImpl.StopwatchTimer> p3, com.android.internal.os.BatteryStatsImpl.TimeBase p4, com.android.internal.os.BatteryStatsImpl.TimeBase p5) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, (com.android.internal.os.BatteryStatsImpl.Uid)null, 0, (java.util.ArrayList)null, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public com.android.internal.os.BatteryStatsImpl.DurationTimer getSubTimer() { return null; }
        public void startRunningLocked(long p0) {}
        public void stopRunningLocked(long p0) {}
        public void stopAllRunningLocked(long p0) {}
        public boolean reset(boolean p0) { return false; }
        public void detach() {}
        public void writeToParcel(android.os.Parcel p0, long p1) {}
        public void writeSummaryFromParcelLocked(android.os.Parcel p0, long p1) {}
        public void readSummaryFromParcelLocked(android.os.Parcel p0) {}
    }

    public static class Counter extends android.os.BatteryStats.Counter implements com.android.internal.os.BatteryStatsImpl.TimeBaseObs {
        @android.annotation.UnsupportedAppUsage
        final java.util.concurrent.atomic.AtomicInteger mCount = null;
        final com.android.internal.os.BatteryStatsImpl.TimeBase mTimeBase = null;
        public Counter(com.android.internal.os.BatteryStatsImpl.TimeBase p0, android.os.Parcel p1) { super(); }
        public Counter(com.android.internal.os.BatteryStatsImpl.TimeBase p0) { super(); }
        public void writeToParcel(android.os.Parcel p0) {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public static void writeCounterToParcel(android.os.Parcel p0, com.android.internal.os.BatteryStatsImpl.Counter p1) {}
        public static com.android.internal.os.BatteryStatsImpl.Counter readCounterFromParcel(com.android.internal.os.BatteryStatsImpl.TimeBase p0, android.os.Parcel p1) { return null; }
        public int getCountLocked(int p0) { return 0; }
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        public void stepAtomic() {}
        void addAtomic(int p0) {}
        public boolean reset(boolean p0) { return false; }
        public void detach() {}
        public void writeSummaryFromParcelLocked(android.os.Parcel p0) {}
        public void readSummaryFromParcelLocked(android.os.Parcel p0) {}
    }

    public static class ControllerActivityCounterImpl extends android.os.BatteryStats.ControllerActivityCounter implements android.os.Parcelable {
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mIdleTimeMillis = null;
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mScanTimeMillis = null;
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mSleepTimeMillis = null;
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mRxTimeMillis = null;
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[] mTxTimeMillis = null;
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mPowerDrainMaMs = null;
        private final com.android.internal.os.BatteryStatsImpl.LongSamplingCounter mMonitoredRailChargeConsumedMaMs = null;
        public ControllerActivityCounterImpl(com.android.internal.os.BatteryStatsImpl.TimeBase p0, int p1) { super(); }
        public ControllerActivityCounterImpl(com.android.internal.os.BatteryStatsImpl.TimeBase p0, int p1, android.os.Parcel p2) { super(); }
        public void readSummaryFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeSummaryToParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void reset(boolean p0) {}
        public void detach() {}
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter getIdleTimeCounter() { return null; }
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter getScanTimeCounter() { return null; }
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter getSleepTimeCounter() { return null; }
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter getRxTimeCounter() { return null; }
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter[] getTxTimeCounters() { return null; }
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter getPowerCounter() { return null; }
        public com.android.internal.os.BatteryStatsImpl.LongSamplingCounter getMonitoredRailChargeConsumedMaMs() { return null; }
    }

    public final class Constants extends android.database.ContentObserver {
        public static final java.lang.String KEY_TRACK_CPU_TIMES_BY_PROC_STATE = "track_cpu_times_by_proc_state";
        public static final java.lang.String KEY_TRACK_CPU_ACTIVE_CLUSTER_TIME = "track_cpu_active_cluster_time";
        public static final java.lang.String KEY_PROC_STATE_CPU_TIMES_READ_DELAY_MS = "proc_state_cpu_times_read_delay_ms";
        public static final java.lang.String KEY_KERNEL_UID_READERS_THROTTLE_TIME = "kernel_uid_readers_throttle_time";
        public static final java.lang.String KEY_UID_REMOVE_DELAY_MS = "uid_remove_delay_ms";
        public static final java.lang.String KEY_EXTERNAL_STATS_COLLECTION_RATE_LIMIT_MS = "external_stats_collection_rate_limit_ms";
        public static final java.lang.String KEY_BATTERY_LEVEL_COLLECTION_DELAY_MS = "battery_level_collection_delay_ms";
        public static final java.lang.String KEY_MAX_HISTORY_FILES = "max_history_files";
        public static final java.lang.String KEY_MAX_HISTORY_BUFFER_KB = "max_history_buffer_kb";
        public static final java.lang.String KEY_BATTERY_CHARGED_DELAY_MS = "battery_charged_delay_ms";
        private static final boolean DEFAULT_TRACK_CPU_TIMES_BY_PROC_STATE = false;
        private static final boolean DEFAULT_TRACK_CPU_ACTIVE_CLUSTER_TIME = true;
        private static final long DEFAULT_PROC_STATE_CPU_TIMES_READ_DELAY_MS = 5000L;
        private static final long DEFAULT_KERNEL_UID_READERS_THROTTLE_TIME = 1000L;
        private static final long DEFAULT_UID_REMOVE_DELAY_MS = 300000L;
        private static final long DEFAULT_EXTERNAL_STATS_COLLECTION_RATE_LIMIT_MS = 600000L;
        private static final long DEFAULT_BATTERY_LEVEL_COLLECTION_DELAY_MS = 300000L;
        private static final int DEFAULT_MAX_HISTORY_FILES = 32;
        private static final int DEFAULT_MAX_HISTORY_BUFFER_KB = 128;
        private static final int DEFAULT_MAX_HISTORY_FILES_LOW_RAM_DEVICE = 64;
        private static final int DEFAULT_MAX_HISTORY_BUFFER_LOW_RAM_DEVICE_KB = 64;
        private static final int DEFAULT_BATTERY_CHARGED_DELAY_MS = 900000;
        public boolean TRACK_CPU_TIMES_BY_PROC_STATE;
        public boolean TRACK_CPU_ACTIVE_CLUSTER_TIME;
        public long PROC_STATE_CPU_TIMES_READ_DELAY_MS;
        public long KERNEL_UID_READERS_THROTTLE_TIME;
        public long UID_REMOVE_DELAY_MS;
        public long EXTERNAL_STATS_COLLECTION_RATE_LIMIT_MS;
        public long BATTERY_LEVEL_COLLECTION_DELAY_MS;
        public int MAX_HISTORY_FILES;
        public int MAX_HISTORY_BUFFER;
        public int BATTERY_CHARGED_DELAY_MS;
        private android.content.ContentResolver mResolver;
        private final android.util.KeyValueListParser mParser = null;
        public Constants(com.android.internal.os.BatteryStatsImpl p0, android.os.Handler p1) { super(null); }
        public void startObserving(android.content.ContentResolver p0) {}
        public void onChange(boolean p0, android.net.Uri p1) {}
        private void updateConstants() {}
        private void updateBatteryChargedDelayMsLocked() {}
        private void updateTrackCpuTimesByProcStateLocked(boolean p0, boolean p1) {}
        private void updateProcStateCpuTimesReadDelayMs(long p0, long p1) {}
        private void updateKernelUidReadersThrottleTime(long p0, long p1) {}
        private void updateUidRemoveDelay(long p0) {}
        public void dumpLocked(java.io.PrintWriter p0) {}
    }

    public static interface Clocks {
        public long elapsedRealtime();
        public long uptimeMillis();
    }

    private final class BluetoothActivityInfoCache {
        long idleTimeMs;
        long rxTimeMs;
        long txTimeMs;
        long energy;
        android.util.SparseLongArray uidRxBytes;
        android.util.SparseLongArray uidTxBytes;
        private BluetoothActivityInfoCache(com.android.internal.os.BatteryStatsImpl p0) {}
        void set(android.bluetooth.BluetoothActivityEnergyInfo p0) {}
    }

    public static interface BatteryCallback {
        public void batteryNeedsCpuUpdate();
        public void batteryPowerChanged(boolean p0);
        public void batterySendBroadcast(android.content.Intent p0);
        public void batteryStatsReset();
    }

    public static class BatchTimer extends com.android.internal.os.BatteryStatsImpl.Timer {
        final com.android.internal.os.BatteryStatsImpl.Uid mUid = null;
        long mLastAddedTime;
        long mLastAddedDuration;
        boolean mInDischarge;
        BatchTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, com.android.internal.os.BatteryStatsImpl.TimeBase p3, android.os.Parcel p4) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, 0, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        BatchTimer(com.android.internal.os.BatteryStatsImpl.Clocks p0, com.android.internal.os.BatteryStatsImpl.Uid p1, int p2, com.android.internal.os.BatteryStatsImpl.TimeBase p3) { super((com.android.internal.os.BatteryStatsImpl.Clocks)null, 0, (com.android.internal.os.BatteryStatsImpl.TimeBase)null); }
        public void writeToParcel(android.os.Parcel p0, long p1) {}
        public void onTimeStopped(long p0, long p1, long p2) {}
        public void onTimeStarted(long p0, long p1, long p2) {}
        public void logState(android.util.Printer p0, java.lang.String p1) {}
        private long computeOverage(long p0) { return 0L; }
        private void recomputeLastDuration(long p0, boolean p1) {}
        public void addDuration(com.android.internal.os.BatteryStatsImpl p0, long p1) {}
        public void abortLastDuration(com.android.internal.os.BatteryStatsImpl p0) {}
        protected int computeCurrentCountLocked() { return 0; }
        protected long computeRunTimeLocked(long p0) { return 0L; }
        public boolean reset(boolean p0) { return false; }
    }
}

package com.android.internal.os;

public class BatteryStatsHistoryIterator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "BatteryStatsHistoryItr";
    private final com.android.internal.os.BatteryStatsHistory mBatteryStatsHistory = null;
    private final android.os.BatteryStats.HistoryStepDetails mReadHistoryStepDetails = null;
    private final java.lang.String[] mReadHistoryStrings = null;
    private final int[] mReadHistoryUids = null;
    public BatteryStatsHistoryIterator(com.android.internal.os.BatteryStatsHistory p0, java.util.List<android.os.BatteryStats.HistoryTag> p1) {}
    public boolean next(android.os.BatteryStats.HistoryItem p0) { return false; }
    void readHistoryDelta(android.os.Parcel p0, android.os.BatteryStats.HistoryItem p1) {}
    int getHistoryStringPoolSize() { return 0; }
    int getHistoryStringPoolBytes() { return 0; }
    java.lang.String getHistoryTagPoolString(int p0) { return null; }
    int getHistoryTagPoolUid(int p0) { return 0; }
    private void readHistoryTag(int p0, android.os.BatteryStats.HistoryTag p1) {}
    private static void readBatteryLevelInt(int p0, android.os.BatteryStats.HistoryItem p1) {}
}

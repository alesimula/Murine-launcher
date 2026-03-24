package com.android.internal.os;

public class BatteryStatsHistory {
    public static final java.lang.String HISTORY_DIR = "battery-history";
    public static final java.lang.String FILE_SUFFIX = ".bin";
    public BatteryStatsHistory(com.android.internal.os.BatteryStatsImpl p0, java.io.File p1, android.os.Parcel p2) {}
    public BatteryStatsHistory(android.os.Parcel p0) {}
    public java.io.File getHistoryDirectory() { return null; }
    public void startNextFile() {}
    public void resetAllFiles() {}
    public boolean startIteratingHistory() { return false; }
    public void finishIteratingHistory() {}
    public android.os.Parcel getNextParcel(android.os.BatteryStats.HistoryItem p0) { return null; }
    public boolean readFileToParcel(android.os.Parcel p0, android.util.AtomicFile p1) { return false; }
    public void writeToParcel(android.os.Parcel p0) {}
    public void writeToBatteryUsageStatsParcel(android.os.Parcel p0) {}
    public static com.android.internal.os.BatteryStatsHistory createFromBatteryUsageStatsParcel(android.os.Parcel p0) { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public java.util.List<java.lang.Integer> getFilesNumbers() { return null; }
    public android.util.AtomicFile getActiveFile() { return null; }
    public int getHistoryUsedSize() { return 0; }
}

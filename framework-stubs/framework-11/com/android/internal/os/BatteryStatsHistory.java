package com.android.internal.os;

public class BatteryStatsHistory {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "BatteryStatsHistory";
    public static final java.lang.String HISTORY_DIR = "battery-history";
    public static final java.lang.String FILE_SUFFIX = ".bin";
    private static final int MIN_FREE_SPACE = 104857600;
    private final com.android.internal.os.BatteryStatsImpl mStats = null;
    private final android.os.Parcel mHistoryBuffer = null;
    private final java.io.File mHistoryDir = null;
    private android.util.AtomicFile mActiveFile;
    private final java.util.List<java.lang.Integer> mFileNumbers = null;
    private java.util.List<android.os.Parcel> mHistoryParcels;
    private int mCurrentFileIndex;
    private android.os.Parcel mCurrentParcel;
    private int mCurrentParcelEnd;
    private int mRecordCount;
    private int mParcelIndex;
    public BatteryStatsHistory(com.android.internal.os.BatteryStatsImpl p0, java.io.File p1, android.os.Parcel p2) {}
    public BatteryStatsHistory(com.android.internal.os.BatteryStatsImpl p0, android.os.Parcel p1) {}
    private void setActiveFile(int p0) {}
    private android.util.AtomicFile getFile(int p0) { return null; }
    public void startNextFile() {}
    public void resetAllFiles() {}
    public boolean startIteratingHistory() { return false; }
    public void finishIteratingHistory() {}
    public android.os.Parcel getNextParcel(android.os.BatteryStats.HistoryItem p0) { return null; }
    public boolean readFileToParcel(android.os.Parcel p0, android.util.AtomicFile p1) { return false; }
    private boolean skipHead(android.os.Parcel p0) { return false; }
    public void writeToParcel(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    private boolean hasFreeDiskSpace() { return false; }
    public java.util.List<java.lang.Integer> getFilesNumbers() { return null; }
    public android.util.AtomicFile getActiveFile() { return null; }
    public int getHistoryUsedSize() { return 0; }
}

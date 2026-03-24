package com.android.internal.os;

public class BatteryStatsHistory {
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
    static final int BATTERY_LEVEL_DETAILS_FLAG = 1;
    static final int TAG_FIRST_OCCURRENCE_FLAG = 32768;
    static final int EXTENSION_POWER_STATS_DESCRIPTOR_FLAG = 1;
    static final int EXTENSION_POWER_STATS_FLAG = 2;
    static final int EXTENSION_PROCESS_STATE_CHANGE_FLAG = 4;
    static final int STATE1_TRACE_MASK = 1073741823;
    static final int STATE2_TRACE_MASK = -1;
    static final int HISTORY_TAG_INDEX_LIMIT = 32766;
    public BatteryStatsHistory(android.os.Parcel p0, java.io.File p1, int p2, int p3, com.android.internal.os.BatteryStatsHistory.HistoryStepDetailsCalculator p4, com.android.internal.os.Clock p5, com.android.internal.os.MonotonicClock p6, com.android.internal.os.BatteryStatsHistory.TraceDelegate p7, com.android.internal.os.BatteryStatsHistory.EventLogger p8) {}
    public void setMaxHistoryFiles(int p0) {}
    public void setMaxHistoryBufferSize(int p0) {}
    public com.android.internal.os.BatteryStatsHistory copy() { return null; }
    public boolean isReadOnly() { return false; }
    public void startNextFile(long p0) {}
    public boolean isResetEnabled() { return false; }
    public void reset() {}
    public long getStartTime() { return 0L; }
    @android.annotation.NonNull
    public com.android.internal.os.BatteryStatsHistoryIterator iterate(long p0, long p1) { return null; }
    void iteratorFinished() {}
    @android.annotation.Nullable
    public android.os.Parcel getNextParcel(long p0, long p1) { return null; }
    public boolean readFileToParcel(android.os.Parcel p0, android.util.AtomicFile p1) { return false; }
    public long getHistoryBufferStartTime(android.os.Parcel p0) { return 0L; }
    public void writeSummaryToParcel(android.os.Parcel p0, boolean p1) {}
    public void readSummaryFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0) {}
    public void writeToBatteryUsageStatsParcel(android.os.Parcel p0) {}
    public static com.android.internal.os.BatteryStatsHistory createFromBatteryUsageStatsParcel(android.os.Parcel p0) { return null; }
    public boolean readSummary() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public java.util.List<java.lang.String> getFilesNames() { return null; }
    public android.util.AtomicFile getActiveFile() { return null; }
    public int getHistoryUsedSize() { return 0; }
    public void setHistoryRecordingEnabled(boolean p0) {}
    public boolean isRecordingHistory() { return false; }
    public void forceRecordAllHistory() {}
    public void startRecordingHistory(long p0, long p1, boolean p2) {}
    public void continueRecordingHistory() {}
    public void setBatteryState(boolean p0, int p1, int p2, int p3) {}
    public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    public void setPluggedInState(boolean p0) {}
    public void setChargingState(boolean p0) {}
    public void recordEvent(long p0, long p1, int p2, java.lang.String p3, int p4) {}
    public void recordCurrentTimeChange(long p0, long p1, long p2) {}
    public void recordShutdownEvent(long p0, long p1, long p2) {}
    public void recordBatteryState(long p0, long p1, int p2, boolean p3) {}
    public void recordPowerStats(long p0, long p1, com.android.internal.os.PowerStats p2) {}
    public void recordProcessStateChange(long p0, long p1, int p2, int p3) {}
    public void recordWifiConsumedCharge(long p0, long p1, double p2) {}
    public void recordWakelockStartEvent(long p0, long p1, java.lang.String p2, int p3) {}
    public boolean maybeUpdateWakelockTag(long p0, long p1, java.lang.String p2, int p3) { return false; }
    public void recordWakelockStopEvent(long p0, long p1, java.lang.String p2, int p3) {}
    public void recordStateStartEvent(long p0, long p1, int p2) {}
    public void recordStateStartEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordStateStopEvent(long p0, long p1, int p2) {}
    public void recordStateStopEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordStateChangeEvent(long p0, long p1, int p2, int p3) {}
    public void recordState2StartEvent(long p0, long p1, int p2) {}
    public void recordState2StartEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordState2StopEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordState2StopEvent(long p0, long p1, int p2) {}
    public void recordWakeupEvent(long p0, long p1, java.lang.String p2) {}
    public void recordScreenBrightnessEvent(long p0, long p1, int p2) {}
    public void recordGpsSignalQualityEvent(long p0, long p1, int p2) {}
    public void recordDeviceIdleEvent(long p0, long p1, int p2) {}
    public void recordPhoneStateChangeEvent(long p0, long p1, int p2, int p3, int p4, int p5) {}
    public void recordDataConnectionTypeChangeEvent(long p0, long p1, int p2) {}
    public void recordNrStateChangeEvent(long p0, long p1, int p2) {}
    public void recordWifiSupplicantStateChangeEvent(long p0, long p1, int p2) {}
    public void recordWifiSignalStrengthChangeEvent(long p0, long p1, int p2) {}
    public void writeHistoryItem(long p0, long p1) {}
    public void commitCurrentHistoryBatchLocked() {}
    public void writeHistory() {}
    public void readHistoryBuffer(android.os.Parcel p0) throws android.os.ParcelFormatException {}
    public int getHistoryStringPoolSize() { return 0; }
    public int getHistoryStringPoolBytes() { return 0; }
    public java.lang.String getHistoryTagPoolString(int p0) { return null; }
    public int getHistoryTagPoolUid(int p0) { return 0; }

    private static class BatteryHistoryDirectory {
        BatteryHistoryDirectory(java.io.File p0, com.android.internal.os.MonotonicClock p1, int p2) {}
        void setMaxHistoryFiles(int p0) {}
        void lock() {}
        boolean tryLock() { return false; }
        void unlock() {}
        boolean isLocked() { return false; }
        void load() {}
        java.util.List<java.lang.String> getFileNames() { return null; }
        @android.annotation.Nullable
        com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile getFirstFile() { return null; }
        @android.annotation.Nullable
        com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile getLastFile() { return null; }
        @android.annotation.Nullable
        com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile getNextFile(com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile p0, long p1, long p2) { return null; }
        com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile makeBatteryHistoryFile() { return null; }
        void writeToParcel(android.os.Parcel p0, boolean p1) {}
        int getFileCount() { return 0; }
        int getSize() { return 0; }
        void reset() {}
    }

    private static class BatteryHistoryFile implements java.lang.Comparable<com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile> {
        public final long monotonicTimeMs = 0L;
        public final android.util.AtomicFile atomicFile = null;
        public int compareTo(com.android.internal.os.BatteryStatsHistory.BatteryHistoryFile p0) { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class EventLogger {
        public EventLogger() {}
        public void writeCommitSysConfigFile(long p0) {}
    }

    public static interface HistoryStepDetailsCalculator {
        @android.annotation.Nullable
        public android.os.BatteryStats.HistoryStepDetails getHistoryStepDetails();
        public void clear();
    }

    public static class TraceDelegate {
        public TraceDelegate() {}
        public boolean tracingEnabled() { return false; }
        public void traceCounter(java.lang.String p0, int p1) {}
        public void traceInstantEvent(java.lang.String p0, java.lang.String p1) {}
    }

    public static final class VarintParceler {
        public VarintParceler() {}
        public void writeLongArray(android.os.Parcel p0, long[] p1) {}
        public void readLongArray(android.os.Parcel p0, long[] p1) {}
    }
}

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
    static final int EXTENSION_MEASURED_ENERGY_HEADER_FLAG = 1;
    static final int EXTENSION_MEASURED_ENERGY_FLAG = 2;
    static final int EXTENSION_CPU_USAGE_HEADER_FLAG = 4;
    static final int EXTENSION_CPU_USAGE_FLAG = 8;
    public BatteryStatsHistory(java.io.File p0, int p1, int p2, com.android.internal.os.BatteryStatsHistory.HistoryStepDetailsCalculator p3, com.android.internal.os.Clock p4) {}
    public BatteryStatsHistory(android.os.Parcel p0, java.io.File p1, int p2, int p3, com.android.internal.os.BatteryStatsHistory.HistoryStepDetailsCalculator p4, com.android.internal.os.Clock p5, com.android.internal.os.BatteryStatsHistory.TraceDelegate p6) {}
    public BatteryStatsHistory(int p0, int p1, com.android.internal.os.BatteryStatsHistory.HistoryStepDetailsCalculator p2, com.android.internal.os.Clock p3) {}
    public void setMaxHistoryFiles(int p0) {}
    public void setMaxHistoryBufferSize(int p0) {}
    public com.android.internal.os.BatteryStatsHistory copy() { return null; }
    public boolean isReadOnly() { return false; }
    public void startNextFile() {}
    public boolean isResetEnabled() { return false; }
    public void reset() {}
    public com.android.internal.os.BatteryStatsHistoryIterator iterate() { return null; }
    void iteratorFinished() {}
    public android.os.Parcel getNextParcel() { return null; }
    public boolean readFileToParcel(android.os.Parcel p0, android.util.AtomicFile p1) { return false; }
    public void writeSummaryToParcel(android.os.Parcel p0, boolean p1) {}
    public void readSummaryFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0) {}
    public void writeToBatteryUsageStatsParcel(android.os.Parcel p0) {}
    public static com.android.internal.os.BatteryStatsHistory createFromBatteryUsageStatsParcel(android.os.Parcel p0) { return null; }
    public boolean readSummary() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public java.util.List<java.lang.Integer> getFilesNumbers() { return null; }
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
    public void recordEnergyConsumerDetails(long p0, long p1, android.os.BatteryStats.EnergyConsumerDetails p2) {}
    public void recordWifiConsumedCharge(long p0, long p1, double p2) {}
    public void recordWakelockStartEvent(long p0, long p1, java.lang.String p2, int p3) {}
    public boolean maybeUpdateWakelockTag(long p0, long p1, java.lang.String p2, int p3) { return false; }
    public void recordWakelockStopEvent(long p0, long p1, java.lang.String p2, int p3) {}
    public void recordStateStartEvent(long p0, long p1, int p2) {}
    public void recordStateStopEvent(long p0, long p1, int p2) {}
    public void recordStateChangeEvent(long p0, long p1, int p2, int p3) {}
    public void recordState2StartEvent(long p0, long p1, int p2) {}
    public void recordState2StopEvent(long p0, long p1, int p2) {}
    public void recordWakeupEvent(long p0, long p1, java.lang.String p2) {}
    public void recordScreenBrightnessEvent(long p0, long p1, int p2) {}
    public void recordGpsSignalQualityEvent(long p0, long p1, int p2) {}
    public void recordDeviceIdleEvent(long p0, long p1, int p2) {}
    public void recordPhoneStateChangeEvent(long p0, long p1, int p2, int p3, int p4, int p5) {}
    public void recordDataConnectionTypeChangeEvent(long p0, long p1, int p2) {}
    public void recordWifiSupplicantStateChangeEvent(long p0, long p1, int p2) {}
    public void recordWifiSignalStrengthChangeEvent(long p0, long p1, int p2) {}
    public void recordCpuUsage(long p0, long p1, android.os.BatteryStats.CpuUsageDetails p2) {}
    public void writeHistoryItem(long p0, long p1) {}
    public void writeHistoryDelta(android.os.Parcel p0, android.os.BatteryStats.HistoryItem p1, android.os.BatteryStats.HistoryItem p2) {}
    public void commitCurrentHistoryBatchLocked() {}
    public void writeHistory() {}
    public void readHistoryBuffer(android.os.Parcel p0) throws android.os.ParcelFormatException {}
    public int getHistoryStringPoolSize() { return 0; }
    public int getHistoryStringPoolBytes() { return 0; }
    public java.lang.String getHistoryTagPoolString(int p0) { return null; }
    public int getHistoryTagPoolUid(int p0) { return 0; }

    public static interface HistoryStepDetailsCalculator {
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

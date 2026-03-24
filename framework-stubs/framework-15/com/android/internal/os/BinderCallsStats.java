package com.android.internal.os;

public class BinderCallsStats implements com.android.internal.os.BinderInternal.Observer {
    public static final boolean ENABLED_DEFAULT = true;
    public static final boolean DETAILED_TRACKING_DEFAULT = true;
    public static final int PERIODIC_SAMPLING_INTERVAL_DEFAULT = 1000;
    public static final boolean DEFAULT_TRACK_SCREEN_INTERACTIVE = false;
    public static final boolean DEFAULT_TRACK_DIRECT_CALLING_UID = true;
    public static final boolean DEFAULT_IGNORE_BATTERY_STATUS = false;
    public static final boolean DEFAULT_COLLECT_LATENCY_DATA = true;
    public static final int MAX_BINDER_CALL_STATS_COUNT_DEFAULT = 1500;
    public static final int SHARDING_MODULO_DEFAULT = 1;
    public BinderCallsStats(com.android.internal.os.BinderCallsStats.Injector p0) {}
    public BinderCallsStats(com.android.internal.os.BinderCallsStats.Injector p0, int p1) {}
    public void setDeviceState(com.android.internal.os.CachedDeviceState.Readonly p0) {}
    public void setCallStatsObserver(com.android.internal.os.BinderInternal.CallStatsObserver p0) {}
    @android.annotation.Nullable
    public com.android.internal.os.BinderInternal.CallSession callStarted(android.os.Binder p0, int p1, int p2) { return null; }
    public void callEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3) {}
    public void callThrewException(com.android.internal.os.BinderInternal.CallSession p0, java.lang.Exception p1) {}
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats() { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats(boolean p0) { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats(int p0) { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats(int p0, boolean p1) { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> getExportedExceptionStats() { return null; }
    public void dump(java.io.PrintWriter p0, com.android.internal.os.AppIdToPackageMap p1, int p2, boolean p3) {}
    protected long getThreadTimeMicro() { return 0L; }
    protected int getCallingUid() { return 0; }
    protected int getNativeTid() { return 0; }
    public int[] getNativeTids() { return null; }
    protected long getElapsedRealtimeMicro() { return 0L; }
    protected boolean shouldRecordDetailedData() { return false; }
    public void setDetailedTracking(boolean p0) {}
    public void setTrackScreenInteractive(boolean p0) {}
    public void setTrackDirectCallerUid(boolean p0) {}
    public void setIgnoreBatteryStatus(boolean p0) {}
    public void recordAllCallsForWorkSourceUid(int p0) {}
    public void setAddDebugEntries(boolean p0) {}
    public void setMaxBinderCallStats(int p0) {}
    public void setSamplingInterval(int p0) {}
    public void setShardingModulo(int p0) {}
    public void setCollectLatencyData(boolean p0) {}
    public boolean getCollectLatencyData() { return false; }
    public void reset() {}
    public android.util.SparseArray<com.android.internal.os.BinderCallsStats.UidEntry> getUidEntries() { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> getExceptionCounts() { return null; }
    public com.android.internal.os.BinderLatencyObserver getLatencyObserver() { return null; }
    public static <T extends java.lang.Object> java.util.List<T> getHighestValues(java.util.List<T> p0, java.util.function.ToDoubleFunction<T> p1, double p2) { return null; }
    public static void startForBluetooth(android.content.Context p0) {}

    public static class CallStat {
        public final int callingUid = 0;
        public final java.lang.Class<? extends android.os.Binder> binderClass = null;
        public final int transactionCode = 0;
        public final boolean screenInteractive = false;
        public long recordedCallCount;
        public long callCount;
        public long cpuTimeMicros;
        public long maxCpuTimeMicros;
        public long latencyMicros;
        public long maxLatencyMicros;
        public long maxRequestSizeBytes;
        public long maxReplySizeBytes;
        public long exceptionCount;
        public long incrementalCallCount;
        public CallStat(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3) {}
        public com.android.internal.os.BinderCallsStats.CallStat clone() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class CallStatKey {
        public int callingUid;
        public java.lang.Class<? extends android.os.Binder> binderClass;
        public int transactionCode;
        public CallStatKey() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class ExportedCallStat {
        public int callingUid;
        public int workSourceUid;
        public java.lang.String className;
        public java.lang.String methodName;
        public boolean screenInteractive;
        public long cpuTimeMicros;
        public long maxCpuTimeMicros;
        public long latencyMicros;
        public long maxLatencyMicros;
        public long callCount;
        public long recordedCallCount;
        public long maxRequestSizeBytes;
        public long maxReplySizeBytes;
        public long exceptionCount;
        java.lang.Class<? extends android.os.Binder> binderClass;
        int transactionCode;
        public ExportedCallStat() {}
    }

    public static class Injector {
        public Injector() {}
        public java.util.Random getRandomGenerator() { return null; }
        public android.os.Handler getHandler() { return null; }
        public com.android.internal.os.BinderLatencyObserver getLatencyObserver(int p0) { return null; }
    }

    private static class OverflowBinder extends android.os.Binder {
    }

    public static class SettingsObserver extends android.database.ContentObserver {
        public static final java.lang.String SETTINGS_ENABLED_KEY = "enabled";
        public static final java.lang.String SETTINGS_DETAILED_TRACKING_KEY = "detailed_tracking";
        public static final java.lang.String SETTINGS_UPLOAD_DATA_KEY = "upload_data";
        public static final java.lang.String SETTINGS_SAMPLING_INTERVAL_KEY = "sampling_interval";
        public static final java.lang.String SETTINGS_TRACK_SCREEN_INTERACTIVE_KEY = "track_screen_state";
        public static final java.lang.String SETTINGS_TRACK_DIRECT_CALLING_UID_KEY = "track_calling_uid";
        public static final java.lang.String SETTINGS_MAX_CALL_STATS_KEY = "max_call_stats_count";
        public static final java.lang.String SETTINGS_IGNORE_BATTERY_STATUS_KEY = "ignore_battery_status";
        public static final java.lang.String SETTINGS_SHARDING_MODULO_KEY = "sharding_modulo";
        public static final java.lang.String SETTINGS_COLLECT_LATENCY_DATA_KEY = "collect_latency_data";
        public static final java.lang.String SETTINGS_LATENCY_OBSERVER_SAMPLING_INTERVAL_KEY = "latency_observer_sampling_interval";
        public static final java.lang.String SETTINGS_LATENCY_OBSERVER_SHARDING_MODULO_KEY = "latency_observer_sharding_modulo";
        public static final java.lang.String SETTINGS_LATENCY_OBSERVER_PUSH_INTERVAL_MINUTES_KEY = "latency_observer_push_interval_minutes";
        public static final java.lang.String SETTINGS_LATENCY_HISTOGRAM_BUCKET_COUNT_KEY = "latency_histogram_bucket_count";
        public static final java.lang.String SETTINGS_LATENCY_HISTOGRAM_FIRST_BUCKET_SIZE_KEY = "latency_histogram_first_bucket_size";
        public static final java.lang.String SETTINGS_LATENCY_HISTOGRAM_BUCKET_SCALE_FACTOR_KEY = "latency_histogram_bucket_scale_factor";
        public SettingsObserver(android.content.Context p0, com.android.internal.os.BinderCallsStats p1) { super((android.os.Handler)null); }
        public void onChange(boolean p0, android.net.Uri p1, int p2) {}
        void onChange() {}
        public static void configureLatencyObserver(android.util.KeyValueListParser p0, com.android.internal.os.BinderLatencyObserver p1) {}
    }

    public static class UidEntry {
        public int workSourceUid;
        public long recordedCallCount;
        public long callCount;
        public long cpuTimeMicros;
        public long incrementalCallCount;
        public boolean recordAllTransactions;
        UidEntry(int p0) {}
        @android.annotation.Nullable
        com.android.internal.os.BinderCallsStats.CallStat get(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3) { return null; }
        com.android.internal.os.BinderCallsStats.CallStat getOrCreate(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3, boolean p4) { return null; }
        public java.util.Collection<com.android.internal.os.BinderCallsStats.CallStat> getCallStatsList() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}

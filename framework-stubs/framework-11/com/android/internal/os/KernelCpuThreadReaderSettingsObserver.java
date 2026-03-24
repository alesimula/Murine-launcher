package com.android.internal.os;

public class KernelCpuThreadReaderSettingsObserver extends android.database.ContentObserver {
    private static final java.lang.String TAG = "KernelCpuThreadReaderSettingsObserver";
    private static final java.lang.String NUM_BUCKETS_SETTINGS_KEY = "num_buckets";
    private static final int NUM_BUCKETS_DEFAULT = 8;
    private static final java.lang.String COLLECTED_UIDS_SETTINGS_KEY = "collected_uids";
    private static final java.lang.String COLLECTED_UIDS_DEFAULT = "0-0;1000-1000";
    private static final java.lang.String MINIMUM_TOTAL_CPU_USAGE_MILLIS_SETTINGS_KEY = "minimum_total_cpu_usage_millis";
    private static final int MINIMUM_TOTAL_CPU_USAGE_MILLIS_DEFAULT = 10000;
    private final android.content.Context mContext = null;
    private final com.android.internal.os.KernelCpuThreadReader mKernelCpuThreadReader = null;
    private final com.android.internal.os.KernelCpuThreadReaderDiff mKernelCpuThreadReaderDiff = null;
    public static com.android.internal.os.KernelCpuThreadReaderDiff getSettingsModifiedReader(android.content.Context p0) { return null; }
    private KernelCpuThreadReaderSettingsObserver(android.content.Context p0) { super(null); }
    public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}
    private void updateReader() {}

    public static class UidPredicate implements java.util.function.Predicate<java.lang.Integer> {
        private static final java.util.regex.Pattern UID_RANGE_PATTERN = null;
        private static final java.lang.String UID_SPECIFIER_DELIMITER = ";";
        private final java.util.List<android.util.Range<java.lang.Integer>> mAcceptedUidRanges = null;
        public static com.android.internal.os.KernelCpuThreadReaderSettingsObserver.UidPredicate fromString(java.lang.String p0) throws java.lang.NumberFormatException { return null; }
        private UidPredicate(java.util.List<android.util.Range<java.lang.Integer>> p0) {}
        public boolean test(java.lang.Integer p0) { return false; }
    }
}

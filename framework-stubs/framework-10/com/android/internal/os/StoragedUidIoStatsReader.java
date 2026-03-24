package com.android.internal.os;

public class StoragedUidIoStatsReader {
    private static final java.lang.String TAG = null;
    private static java.lang.String sUidIoFile;
    public StoragedUidIoStatsReader() {}
    public StoragedUidIoStatsReader(java.lang.String p0) {}
    public void readAbsolute(com.android.internal.os.StoragedUidIoStatsReader.Callback p0) {}

    public static interface Callback {
        public void onUidStorageStats(int p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10);
    }
}

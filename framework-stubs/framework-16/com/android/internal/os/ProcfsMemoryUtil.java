package com.android.internal.os;

public final class ProcfsMemoryUtil {
    @android.annotation.Nullable
    public static com.android.internal.os.ProcfsMemoryUtil.MemorySnapshot readMemorySnapshotFromProcfs(int p0) { return null; }
    @android.annotation.Nullable
    public static com.android.internal.os.ProcfsMemoryUtil.MemorySnapshot readMemorySnapshotFromProcfs() { return null; }
    public static java.lang.String readCmdlineFromProcfs(int p0) { return null; }
    public static java.lang.String readCmdlineFromProcfs() { return null; }
    public static int readOomScoreAdjFromProcfs(int p0) { return 0; }
    public static int readOomScoreAdjFromProcfs() { return 0; }
    public static android.util.SparseArray<java.lang.String> getProcessCmdlines() { return null; }
    @android.annotation.Nullable
    public static com.android.internal.os.ProcfsMemoryUtil.VmStat readVmStat() { return null; }

    public static final class MemorySnapshot {
        public int uid;
        public int rssHighWaterMarkInKilobytes;
        public int rssInKilobytes;
        public int anonRssInKilobytes;
        public int swapInKilobytes;
        public int rssShmemKilobytes;
        public MemorySnapshot() {}
    }

    public static final class VmStat {
        public int oomKillCount;
        public VmStat() {}
    }
}

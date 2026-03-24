package com.android.internal.app.procstats;

public abstract class ProcessStatsInternal {
    public ProcessStatsInternal() {}
    public abstract android.util.SparseArray<long[]> getUidProcStateStatsOverTime(long p0);
}

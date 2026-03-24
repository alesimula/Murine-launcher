package com.android.internal.util;

public class ProviderAccessStats {
    public ProviderAccessStats() {}
    public final void incrementInsertStats(int p0, boolean p1) {}
    public final void incrementUpdateStats(int p0, boolean p1) {}
    public final void incrementDeleteStats(int p0, boolean p1) {}
    public final void incrementQueryStats(int p0) {}
    public final void incrementBatchStats(int p0) {}
    public void finishOperation(int p0) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    private static class PerThreadData {
        public int nestCount;
        public long startUptimeMillis;
    }
}

package com.android.internal.app.procstats;

public class PssTable extends com.android.internal.app.procstats.SparseMappingTable.Table {
    public PssTable(com.android.internal.app.procstats.SparseMappingTable p0) { super(null); }
    public void mergeStats(com.android.internal.app.procstats.PssTable p0) {}
    public void mergeStats(int p0, int p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10) {}
    public static void mergeStats(long[] p0, int p1, long[] p2, int p3) {}
    public static void mergeStats(long[] p0, int p1, int p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11) {}
    public void writeStatsToProtoForKey(android.util.proto.ProtoOutputStream p0, int p1) {}
    public static void writeStatsToProto(android.util.proto.ProtoOutputStream p0, long[] p1, int p2) {}
    long[] getRssMeanAndMax(int p0) { return null; }
}

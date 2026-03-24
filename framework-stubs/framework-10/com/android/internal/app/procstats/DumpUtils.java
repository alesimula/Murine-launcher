package com.android.internal.app.procstats;

public final class DumpUtils {
    public static final java.lang.String[] STATE_NAMES = null;
    public static final java.lang.String[] STATE_LABELS = null;
    public static final java.lang.String STATE_LABEL_TOTAL = null;
    public static final java.lang.String STATE_LABEL_CACHED = null;
    public static final java.lang.String[] STATE_NAMES_CSV = null;
    static final java.lang.String[] STATE_TAGS = null;
    static final int[] STATE_PROTO_ENUMS = null;
    public static final java.lang.String[] ADJ_SCREEN_NAMES_CSV = null;
    public static final java.lang.String[] ADJ_MEM_NAMES_CSV = null;
    static final java.lang.String[] ADJ_SCREEN_TAGS = null;
    static final int[] ADJ_SCREEN_PROTO_ENUMS = null;
    static final java.lang.String[] ADJ_MEM_TAGS = null;
    static final int[] ADJ_MEM_PROTO_ENUMS = null;
    static final java.lang.String CSV_SEP = "\t";
    private DumpUtils() {}
    public static void printScreenLabel(java.io.PrintWriter p0, int p1) {}
    public static void printScreenLabelCsv(java.io.PrintWriter p0, int p1) {}
    public static void printMemLabel(java.io.PrintWriter p0, int p1, char p2) {}
    public static void printMemLabelCsv(java.io.PrintWriter p0, int p1) {}
    public static void printPercent(java.io.PrintWriter p0, double p1) {}
    public static void printProcStateTag(java.io.PrintWriter p0, int p1) {}
    public static void printProcStateTagProto(android.util.proto.ProtoOutputStream p0, long p1, long p2, long p3, int p4) {}
    public static void printAdjTag(java.io.PrintWriter p0, int p1) {}
    public static void printProcStateAdjTagProto(android.util.proto.ProtoOutputStream p0, long p1, long p2, int p3) {}
    public static void printProcStateDurationProto(android.util.proto.ProtoOutputStream p0, long p1, int p2, long p3) {}
    public static void printProcStateTagAndValue(java.io.PrintWriter p0, int p1, long p2) {}
    public static void printAdjTagAndValue(java.io.PrintWriter p0, int p1, long p2) {}
    public static long dumpSingleTime(java.io.PrintWriter p0, java.lang.String p1, long[] p2, int p3, long p4, long p5) { return 0L; }
    public static void dumpAdjTimesCheckin(java.io.PrintWriter p0, java.lang.String p1, long[] p2, int p3, long p4, long p5) {}
    private static void dumpStateHeadersCsv(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4) {}
    public static void dumpProcessSummaryLocked(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.util.ArrayList<com.android.internal.app.procstats.ProcessState> p3, int[] p4, int[] p5, int[] p6, long p7, long p8) {}
    public static void dumpProcessListCsv(java.io.PrintWriter p0, java.util.ArrayList<com.android.internal.app.procstats.ProcessState> p1, boolean p2, int[] p3, boolean p4, int[] p5, boolean p6, int[] p7, long p8) {}
    public static int printArrayEntry(java.io.PrintWriter p0, java.lang.String[] p1, int p2, int p3) { return 0; }
    public static int printProto(android.util.proto.ProtoOutputStream p0, long p1, int[] p2, int p3, int p4) { return 0; }
    public static java.lang.String collapseString(java.lang.String p0, java.lang.String p1) { return null; }
}

package android.util;

public final class StatsLog {
    public static final byte ANNOTATION_ID_DEFAULT_STATE = 6;
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = 4;
    public static final byte ANNOTATION_ID_IS_UID = 1;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = 3;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = 5;
    public static final byte ANNOTATION_ID_STATE_NESTED = 8;
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = 7;
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = 2;
    private StatsLog() {}
    public static boolean logStart(int p0) { return false; }
    public static boolean logStop(int p0) { return false; }
    public static boolean logEvent(int p0) { return false; }
    public static boolean logBinaryPushStateChanged(java.lang.String p0, long p1, int p2, int p3, long[] p4) { return false; }
    @java.lang.Deprecated
    public static void writeRaw(byte[] p0, int p1) {}
    public static void write(android.util.StatsEvent p0) {}
}

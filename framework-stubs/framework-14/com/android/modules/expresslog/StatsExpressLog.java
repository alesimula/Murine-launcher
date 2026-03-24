package com.android.modules.expresslog;

public final class StatsExpressLog {
    public static final int EXPRESS_EVENT_REPORTED = 528;
    public static final int EXPRESS_HISTOGRAM_SAMPLE_REPORTED = 593;
    public static final int EXPRESS_UID_EVENT_REPORTED = 644;
    public static final int EXPRESS_UID_HISTOGRAM_SAMPLE_REPORTED = 658;
    public static final byte ANNOTATION_ID_IS_UID = 1;
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = 2;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = 3;
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = 4;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = 5;
    public static final byte ANNOTATION_ID_DEFAULT_STATE = 6;
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = 7;
    public static final byte ANNOTATION_ID_STATE_NESTED = 8;
    public StatsExpressLog() {}
    public static void write(int p0, long p1, long p2) {}
    public static void write(int p0, long p1, long p2, int p3) {}
    public static void write(int p0, long p1, long p2, int p3, int p4) {}
}

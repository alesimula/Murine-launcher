package android.util;

public final class StatsLog {
    public static final byte ANNOTATION_ID_DEFAULT_STATE = 6;
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = 4;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_ACCESSIBILITY = 14;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_AMBIENT_SENSING = 17;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_APP_ACTIVITY = 12;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_APP_USAGE = 11;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_DEMOGRAPHIC_CLASSIFICATION = 18;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_HEALTH_CONNECT = 13;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_PERIPHERAL_DEVICE_INFO = 10;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_SYSTEM_SEARCH = 15;
    public static final byte ANNOTATION_ID_FIELD_RESTRICTION_USER_ENGAGEMENT = 16;
    public static final byte ANNOTATION_ID_IS_UID = 1;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = 3;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = 5;
    public static final byte ANNOTATION_ID_RESTRICTION_CATEGORY = 9;
    public static final byte ANNOTATION_ID_STATE_NESTED = 8;
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = 7;
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = 2;
    public static final int RESTRICTION_CATEGORY_AUTHENTICATION = 3;
    public static final int RESTRICTION_CATEGORY_DIAGNOSTIC = 1;
    public static final int RESTRICTION_CATEGORY_FRAUD_AND_ABUSE = 4;
    public static final int RESTRICTION_CATEGORY_SYSTEM_INTELLIGENCE = 2;
    StatsLog() {}
    public static boolean logBinaryPushStateChanged(java.lang.String p0, long p1, int p2, int p3, long[] p4) { return false; }
    public static boolean logEvent(int p0) { return false; }
    public static boolean logStart(int p0) { return false; }
    public static boolean logStop(int p0) { return false; }
    public static void write(android.util.StatsEvent p0) {}
    @java.lang.Deprecated
    public static void writeRaw(byte[] p0, int p1) {}
}

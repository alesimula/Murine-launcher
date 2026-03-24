package android.content;

public final class PermissionChecker {
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_HARD_DENIED = -1;
    public static final int PERMISSION_SOFT_DENIED = -2;
    public static final int PID_UNKNOWN = -1;
    private PermissionChecker() {}
    public static int checkPermissionForDataDelivery(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return 0; }
    public static int checkPermissionForPreflight(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4) { return 0; }
    public static int checkSelfPermissionForDataDelivery(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public static int checkSelfPermissionForPreflight(android.content.Context p0, java.lang.String p1) { return 0; }
    public static int checkCallingPermissionForDataDelivery(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public static int checkCallingPermissionForPreflight(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public static int checkCallingOrSelfPermissionForDataDelivery(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return 0; }
    public static int checkCallingOrSelfPermissionForPreflight(android.content.Context p0, java.lang.String p1) { return 0; }
    static int checkPermissionCommon(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, boolean p7) { return 0; }
    private static int checkAppOpPermission(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, boolean p7) { return 0; }
    private static int checkRuntimePermission(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, boolean p7) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionResult {
    }
}

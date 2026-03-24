package android.content;

public final class PermissionChecker {
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    private PermissionChecker() {}
    public static int checkPermission(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4) { return 0; }
    public static int checkSelfPermission(android.content.Context p0, java.lang.String p1) { return 0; }
    public static int checkCallingPermission(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public static int checkCallingOrSelfPermission(android.content.Context p0, java.lang.String p1) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionResult {
    }
}

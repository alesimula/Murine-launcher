package android.permission;

public class PermissionCheckerManager {
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_SOFT_DENIED = 1;
    public static final int PERMISSION_HARD_DENIED = 2;
    private final android.content.Context mContext = null;
    private final android.permission.IPermissionChecker mService = null;
    private final android.content.pm.PackageManager mPackageManager = null;
    public PermissionCheckerManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) { return 0; }
    public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) {}
    public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionResult {
    }
}

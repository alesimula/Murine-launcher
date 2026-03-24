package android.net;

@android.annotation.SystemApi
public class NetworkStack {
    @android.annotation.SystemApi
    public static final java.lang.String PERMISSION_MAINLINE_NETWORK_STACK = "android.permission.MAINLINE_NETWORK_STACK";
    private static volatile android.os.IBinder sMockService;
    @android.annotation.SystemApi
    public static android.os.IBinder getService() { return null; }
    public static void setServiceForTest(android.os.IBinder p0) {}
    private NetworkStack() {}
    public static void checkNetworkStackPermission(android.content.Context p0) {}
    public static void checkNetworkStackPermissionOr(android.content.Context p0, java.lang.String... p1) {}
    private static void enforceAnyPermissionOf(android.content.Context p0, java.lang.String... p1) {}
    private static boolean checkAnyPermissionOf(android.content.Context p0, java.lang.String... p1) { return false; }
}

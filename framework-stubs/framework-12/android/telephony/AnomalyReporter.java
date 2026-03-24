package android.telephony;

public final class AnomalyReporter {
    private static final java.lang.String TAG = "AnomalyReporter";
    private static android.content.Context sContext;
    private static java.util.Map<java.util.UUID, java.lang.Integer> sEvents;
    private static java.lang.String sDebugPackageName;
    private AnomalyReporter() {}
    public static void reportAnomaly(java.util.UUID p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public static void initialize(android.content.Context p0) {}
    public static void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}

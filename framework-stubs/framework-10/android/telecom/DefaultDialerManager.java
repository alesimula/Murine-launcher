package android.telecom;

public class DefaultDialerManager {
    private static final java.lang.String TAG = "DefaultDialerManager";
    public DefaultDialerManager() {}
    public static boolean setDefaultDialerApplication(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean setDefaultDialerApplication(android.content.Context p0, java.lang.String p1, int p2) { return false; }
    public static java.lang.String getDefaultDialerApplication(android.content.Context p0) { return null; }
    public static java.lang.String getDefaultDialerApplication(android.content.Context p0, int p1) { return null; }
    public static java.util.List<java.lang.String> getInstalledDialerApplications(android.content.Context p0, int p1) { return null; }
    public static java.util.List<java.lang.String> getInstalledDialerApplications(android.content.Context p0) { return null; }
    public static boolean isDefaultOrSystemDialer(android.content.Context p0, java.lang.String p1) { return false; }
    private static java.util.List<java.lang.String> filterByIntent(android.content.Context p0, java.util.List<java.lang.String> p1, android.content.Intent p2, int p3) { return null; }
    private static android.telecom.TelecomManager getTelecomManager(android.content.Context p0) { return null; }
}

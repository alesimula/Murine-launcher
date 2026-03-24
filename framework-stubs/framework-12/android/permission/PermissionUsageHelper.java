package android.permission;

public class PermissionUsageHelper implements android.app.AppOpsManager.OnOpActiveChangedListener, android.app.AppOpsManager.OnOpStartedListener {
    private static final java.lang.String PROPERTY_CAMERA_MIC_ICONS_ENABLED = "camera_mic_icons_enabled";
    private static final java.lang.String PROPERTY_LOCATION_INDICATORS_ENABLED = "location_indicators_enabled";
    private static final java.lang.String PROPERTY_PERMISSIONS_HUB_2_ENABLED = "permissions_hub_2_enabled";
    private static final java.lang.String RECENT_ACCESS_TIME_MS = "recent_access_time_ms";
    private static final java.lang.String RUNNING_ACCESS_TIME_MS = "running_access_time_ms";
    private static final java.lang.String SYSTEM_PKG = "android";
    private static final long DEFAULT_RUNNING_TIME_MS = 5000L;
    private static final long DEFAULT_RECENT_TIME_MS = 15000L;
    private static final java.util.List<java.lang.String> LOCATION_OPS = null;
    private static final java.util.List<java.lang.String> MIC_OPS = null;
    private static final java.util.List<java.lang.String> CAMERA_OPS = null;
    private android.content.Context mContext;
    private android.util.ArrayMap<android.os.UserHandle, android.content.Context> mUserContexts;
    private android.content.pm.PackageManager mPkgManager;
    private android.app.AppOpsManager mAppOpsManager;
    private android.util.ArrayMap<java.lang.Integer, java.util.ArrayList<android.permission.PermissionUsageHelper.AccessChainLink>> mAttributionChains;
    private static boolean shouldShowPermissionsHub() { return false; }
    private static boolean shouldShowIndicators() { return false; }
    private static boolean shouldShowLocationIndicator() { return false; }
    private static long getRecentThreshold(java.lang.Long p0) { return 0L; }
    private static long getRunningThreshold(java.lang.Long p0) { return 0L; }
    private static java.lang.String getGroupForOp(java.lang.String p0) { return null; }
    public PermissionUsageHelper(android.content.Context p0) {}
    private android.content.Context getUserContext(android.os.UserHandle p0) { return null; }
    public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, int p6) {}
    public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) {}
    public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8) {}
    private void addLinkToChainIfNotPresent(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5) {}
    public java.util.List<android.permission.PermGroupUsage> getOpUsageData(boolean p0) { return null; }
    private java.util.Map<java.lang.String, java.util.List<android.permission.PermissionUsageHelper.OpUsage>> getOpUsages(java.util.List<java.lang.String> p0) { return null; }
    private java.lang.CharSequence formatLabelList(java.util.List<java.lang.CharSequence> p0) { return null; }
    private android.util.ArrayMap<android.permission.PermissionUsageHelper.OpUsage, java.lang.CharSequence> getUniqueUsagesWithLabels(java.util.List<android.permission.PermissionUsageHelper.OpUsage> p0) { return null; }
    private boolean shouldShowPackage(java.lang.String p0) { return false; }

    private static class AccessChainLink {
        public final android.permission.PermissionUsageHelper.OpUsage usage = null;
        public final int flags = 0;
        AccessChainLink(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}
        public boolean isEnd() { return false; }
        public boolean isStart() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean packageAndOpEquals(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    }

    private static class OpUsage {
        public final java.lang.String packageName = null;
        public final java.lang.String attributionTag = null;
        public final java.lang.String op = null;
        public final int uid = 0;
        public final long lastAccessTime = 0L;
        public final android.permission.PermissionUsageHelper.OpUsage proxy = null;
        public final boolean isRunning = false;
        OpUsage(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, long p4, boolean p5, android.permission.PermissionUsageHelper.OpUsage p6) {}
        public android.os.UserHandle getUser() { return null; }
        public int getPackageIdHash() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}

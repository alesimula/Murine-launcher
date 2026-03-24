package android.permission;

public class PermissionUsageHelper implements android.app.AppOpsManager.OnOpActiveChangedListener, android.app.AppOpsManager.OnOpStartedListener {
    public PermissionUsageHelper(android.content.Context p0) {}
    public void tearDown() {}
    public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, int p6) {}
    public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) {}
    public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8) {}
    public java.util.List<android.permission.PermissionGroupUsage> getOpUsageData(boolean p0) { return null; }

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

package android.app.usage;

public class StorageStatsManager {
    private final android.content.Context mContext = null;
    private final android.app.usage.IStorageStatsManager mService = null;
    public StorageStatsManager(android.content.Context p0, android.app.usage.IStorageStatsManager p1) {}
    public boolean isQuotaSupported(java.util.UUID p0) { return false; }
    @java.lang.Deprecated
    public boolean isQuotaSupported(java.lang.String p0) { return false; }
    public boolean isReservedSupported(java.util.UUID p0) { return false; }
    public long getTotalBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @java.lang.Deprecated
    public long getTotalBytes(java.lang.String p0) throws java.io.IOException { return 0L; }
    public long getFreeBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @java.lang.Deprecated
    public long getFreeBytes(java.lang.String p0) throws java.io.IOException { return 0L; }
    public long getCacheBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @java.lang.Deprecated
    public long getCacheBytes(java.lang.String p0) throws java.io.IOException { return 0L; }
    public android.app.usage.StorageStats queryStatsForPackage(java.util.UUID p0, java.lang.String p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException { return null; }
    @java.lang.Deprecated
    public android.app.usage.StorageStats queryStatsForPackage(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException { return null; }
    public android.app.usage.StorageStats queryStatsForUid(java.util.UUID p0, int p1) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public android.app.usage.StorageStats queryStatsForUid(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public android.app.usage.StorageStats queryStatsForUser(java.util.UUID p0, android.os.UserHandle p1) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public android.app.usage.StorageStats queryStatsForUser(java.lang.String p0, android.os.UserHandle p1) throws java.io.IOException { return null; }
    public android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.util.UUID p0, android.os.UserHandle p1) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.lang.String p0, android.os.UserHandle p1) throws java.io.IOException { return null; }
    public long getCacheQuotaBytes(java.lang.String p0, int p1) { return 0L; }
    public java.util.Collection<android.os.storage.CrateInfo> queryCratesForUid(java.util.UUID p0, int p1) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.util.Collection<android.os.storage.CrateInfo> queryCratesForPackage(java.util.UUID p0, java.lang.String p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException { return null; }
    public java.util.Collection<android.os.storage.CrateInfo> queryCratesForUser(java.util.UUID p0, android.os.UserHandle p1) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException { return null; }
}

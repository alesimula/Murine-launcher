package android.app;

public class ResourcesManager {
    static final java.lang.String TAG = "ResourcesManager";
    public ResourcesManager() {}
    public static android.app.ResourcesManager getInstance() { return null; }
    public void invalidatePath(java.lang.String p0) {}
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.util.DisplayMetrics getDisplayMetrics() { return null; }
    protected android.util.DisplayMetrics getDisplayMetrics(int p0, android.view.DisplayAdjustments p1) { return null; }
    public boolean applyCompatConfiguration(int p0, android.content.res.Configuration p1) { return false; }
    public android.view.Display getAdjustedDisplay(int p0, android.content.res.Resources p1) { return null; }
    public void initializeApplicationPaths(java.lang.String p0, java.lang.String[] p1) {}
    protected android.content.res.AssetManager createAssetManager(android.content.res.ResourcesKey p0) { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public boolean isSameResourcesOverrideConfig(android.os.IBinder p0, android.content.res.Configuration p1) { return false; }
    public android.content.res.Resources createBaseTokenResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, java.lang.String[] p5, int p6, android.content.res.Configuration p7, android.content.res.CompatibilityInfo p8, java.lang.ClassLoader p9, java.util.List<android.content.res.loader.ResourcesLoader> p10) { return null; }
    public android.content.res.Resources getResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, java.lang.String[] p5, java.lang.Integer p6, android.content.res.Configuration p7, android.content.res.CompatibilityInfo p8, java.lang.ClassLoader p9, java.util.List<android.content.res.loader.ResourcesLoader> p10) { return null; }
    public void updateResourcesForActivity(android.os.IBinder p0, android.content.res.Configuration p1, int p2) {}
    public void appendPendingAppInfoUpdate(java.lang.String[] p0, android.content.pm.ApplicationInfo p1) {}
    public final void applyAllPendingAppInfoUpdates() {}
    public final boolean applyConfigurationToResources(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) { return false; }
    public void appendLibAssetForMainAssetPath(java.lang.String p0, java.lang.String p1) {}
    public void appendLibAssetsForMainAssetPath(java.lang.String p0, java.lang.String[] p1) {}

    private static class ActivityResource {
        public final android.content.res.Configuration overrideConfig = null;
        public java.lang.Integer overrideDisplayId;
        public java.lang.ref.WeakReference<android.content.res.Resources> resources;
    }

    private static class ActivityResources {
        public final android.content.res.Configuration overrideConfig = null;
        public int overrideDisplayId;
        public final java.util.ArrayList<android.app.ResourcesManager.ActivityResource> activityResources = null;
        public final java.lang.ref.ReferenceQueue<android.content.res.Resources> activityResourcesQueue = null;
        public int countLiveReferences() { return 0; }
    }

    private class ApkAssetsSupplier {
        final android.util.ArrayMap<android.app.ResourcesManager.ApkKey, android.content.res.ApkAssets> mLocalCache = null;
        android.content.res.ApkAssets load(android.app.ResourcesManager.ApkKey p0) throws java.io.IOException { return null; }
    }

    private static class ApkKey {
        public final java.lang.String path = null;
        public final boolean sharedLib = false;
        public final boolean overlay = false;
        ApkKey(java.lang.String p0, boolean p1, boolean p2) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private class UpdateHandler implements android.content.res.Resources.UpdateCallbacks {
        public void onLoadersChanged(android.content.res.Resources p0, java.util.List<android.content.res.loader.ResourcesLoader> p1) {}
        public void onLoaderUpdated(android.content.res.loader.ResourcesLoader p0) {}
    }
}

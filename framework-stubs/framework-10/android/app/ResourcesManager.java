package android.app;

public class ResourcesManager {
    static final java.lang.String TAG = "ResourcesManager";
    private static final boolean DEBUG = false;
    private static android.app.ResourcesManager sResourcesManager;
    private static final java.util.function.Predicate<java.lang.ref.WeakReference<android.content.res.Resources>> sEmptyReferencePredicate = null;
    private android.content.res.CompatibilityInfo mResCompatibilityInfo;
    @android.annotation.UnsupportedAppUsage
    private final android.content.res.Configuration mResConfiguration = null;
    @android.annotation.UnsupportedAppUsage
    private final android.util.ArrayMap<android.content.res.ResourcesKey, java.lang.ref.WeakReference<android.content.res.ResourcesImpl>> mResourceImpls = null;
    @android.annotation.UnsupportedAppUsage
    private final java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> mResourceReferences = null;
    private static final boolean ENABLE_APK_ASSETS_CACHE = false;
    private final android.util.LruCache<android.app.ResourcesManager.ApkKey, android.content.res.ApkAssets> mLoadedApkAssets = null;
    private final android.util.ArrayMap<android.app.ResourcesManager.ApkKey, java.lang.ref.WeakReference<android.content.res.ApkAssets>> mCachedApkAssets = null;
    @android.annotation.UnsupportedAppUsage
    private final java.util.WeakHashMap<android.os.IBinder, android.app.ResourcesManager.ActivityResources> mActivityResourceReferences = null;
    private final android.util.ArrayMap<android.util.Pair<java.lang.Integer, android.view.DisplayAdjustments>, java.lang.ref.WeakReference<android.view.Display>> mAdjustedDisplays = null;
    public ResourcesManager() {}
    @android.annotation.UnsupportedAppUsage
    public static android.app.ResourcesManager getInstance() { return null; }
    public void invalidatePath(java.lang.String p0) {}
    public android.content.res.Configuration getConfiguration() { return null; }
    android.util.DisplayMetrics getDisplayMetrics() { return null; }
    protected android.util.DisplayMetrics getDisplayMetrics(int p0, android.view.DisplayAdjustments p1) { return null; }
    private static void applyNonDefaultDisplayMetricsToConfiguration(android.util.DisplayMetrics p0, android.content.res.Configuration p1) {}
    public boolean applyCompatConfigurationLocked(int p0, android.content.res.Configuration p1) { return false; }
    private android.view.Display getAdjustedDisplay(int p0, android.view.DisplayAdjustments p1) { return null; }
    public android.view.Display getAdjustedDisplay(int p0, android.content.res.Resources p1) { return null; }
    private void cleanupResourceImpl(android.content.res.ResourcesKey p0) {}
    private static java.lang.String overlayPathToIdmapPath(java.lang.String p0) { return null; }
    private android.content.res.ApkAssets loadApkAssets(java.lang.String p0, boolean p1, boolean p2) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    protected android.content.res.AssetManager createAssetManager(android.content.res.ResourcesKey p0) { return null; }
    private static <T extends java.lang.Object> int countLiveReferences(java.util.Collection<java.lang.ref.WeakReference<T>> p0) { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    private android.content.res.Configuration generateConfig(android.content.res.ResourcesKey p0, android.util.DisplayMetrics p1) { return null; }
    private android.content.res.ResourcesImpl createResourcesImpl(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesImpl findResourcesImplForKeyLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesImpl findOrCreateResourcesImplForKeyLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesKey findKeyForResourceImplLocked(android.content.res.ResourcesImpl p0) { return null; }
    boolean isSameResourcesOverrideConfig(android.os.IBinder p0, android.content.res.Configuration p1) { return false; }
    private android.app.ResourcesManager.ActivityResources getOrCreateActivityResourcesStructLocked(android.os.IBinder p0) { return null; }
    private android.content.res.Resources getOrCreateResourcesForActivityLocked(android.os.IBinder p0, java.lang.ClassLoader p1, android.content.res.ResourcesImpl p2, android.content.res.CompatibilityInfo p3) { return null; }
    private android.content.res.Resources getOrCreateResourcesLocked(java.lang.ClassLoader p0, android.content.res.ResourcesImpl p1, android.content.res.CompatibilityInfo p2) { return null; }
    public android.content.res.Resources createBaseActivityResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, int p5, android.content.res.Configuration p6, android.content.res.CompatibilityInfo p7, java.lang.ClassLoader p8) { return null; }
    private android.content.res.Resources getOrCreateResources(android.os.IBinder p0, android.content.res.ResourcesKey p1, java.lang.ClassLoader p2) { return null; }
    public android.content.res.Resources getResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, int p5, android.content.res.Configuration p6, android.content.res.CompatibilityInfo p7, java.lang.ClassLoader p8) { return null; }
    public void updateResourcesForActivity(android.os.IBinder p0, android.content.res.Configuration p1, int p2, boolean p3) {}
    public final boolean applyConfigurationToResourcesLocked(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void appendLibAssetForMainAssetPath(java.lang.String p0, java.lang.String p1) {}
    public void appendLibAssetsForMainAssetPath(java.lang.String p0, java.lang.String[] p1) {}
    final void applyNewResourceDirsLocked(android.content.pm.ApplicationInfo p0, java.lang.String[] p1) {}
    private void redirectResourcesToNewImplLocked(android.util.ArrayMap<android.content.res.ResourcesImpl, android.content.res.ResourcesKey> p0) {}

    private static class ApkKey {
        public final java.lang.String path = null;
        public final boolean sharedLib = false;
        public final boolean overlay = false;
        ApkKey(java.lang.String p0, boolean p1, boolean p2) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static class ActivityResources {
        public final android.content.res.Configuration overrideConfig = null;
        public final java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> activityResources = null;
        private ActivityResources() {}
    }
}

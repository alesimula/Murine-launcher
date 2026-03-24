package android.app;

public class ResourcesManager {
    static final java.lang.String TAG = "ResourcesManager";
    private static final boolean DEBUG = false;
    private static android.app.ResourcesManager sResourcesManager;
    private android.content.res.CompatibilityInfo mResCompatibilityInfo;
    private final android.content.res.Configuration mResConfiguration = null;
    private final android.util.ArrayMap<android.content.res.ResourcesKey, java.lang.ref.WeakReference<android.content.res.ResourcesImpl>> mResourceImpls = null;
    private final java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> mResourceReferences = null;
    private final java.lang.ref.ReferenceQueue<android.content.res.Resources> mResourcesReferencesQueue = null;
    private final android.util.ArrayMap<android.app.ResourcesManager.ApkKey, java.lang.ref.WeakReference<android.content.res.ApkAssets>> mCachedApkAssets = null;
    private final java.util.WeakHashMap<android.os.IBinder, android.app.ResourcesManager.ActivityResources> mActivityResourceReferences = null;
    private final android.util.ArrayMap<android.util.Pair<java.lang.Integer, android.view.DisplayAdjustments>, java.lang.ref.WeakReference<android.view.Display>> mAdjustedDisplays = null;
    private final android.app.ResourcesManager.UpdateHandler mUpdateCallbacks = null;
    public ResourcesManager() {}
    public static android.app.ResourcesManager getInstance() { return null; }
    public void invalidatePath(java.lang.String p0) {}
    public android.content.res.Configuration getConfiguration() { return null; }
    android.util.DisplayMetrics getDisplayMetrics() { return null; }
    protected android.util.DisplayMetrics getDisplayMetrics(int p0, android.view.DisplayAdjustments p1) { return null; }
    private static void applyNonDefaultDisplayMetricsToConfiguration(android.util.DisplayMetrics p0, android.content.res.Configuration p1) {}
    public boolean applyCompatConfigurationLocked(int p0, android.content.res.Configuration p1) { return false; }
    private android.view.Display getAdjustedDisplay(int p0, android.view.DisplayAdjustments p1) { return null; }
    public android.view.Display getAdjustedDisplay(int p0, android.content.res.Resources p1) { return null; }
    private static java.lang.String overlayPathToIdmapPath(java.lang.String p0) { return null; }
    private android.content.res.ApkAssets loadApkAssets(android.app.ResourcesManager.ApkKey p0) throws java.io.IOException { return null; }
    private static java.util.ArrayList<android.app.ResourcesManager.ApkKey> extractApkKeys(android.content.res.ResourcesKey p0) { return null; }
    protected android.content.res.AssetManager createAssetManager(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.AssetManager createAssetManager(android.content.res.ResourcesKey p0, android.app.ResourcesManager.ApkAssetsSupplier p1) { return null; }
    private static <T extends java.lang.Object> int countLiveReferences(java.util.Collection<java.lang.ref.WeakReference<T>> p0) { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    private android.content.res.Configuration generateConfig(android.content.res.ResourcesKey p0, android.util.DisplayMetrics p1) { return null; }
    private android.content.res.ResourcesImpl createResourcesImpl(android.content.res.ResourcesKey p0, android.app.ResourcesManager.ApkAssetsSupplier p1) { return null; }
    private android.content.res.ResourcesImpl findResourcesImplForKeyLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesImpl findOrCreateResourcesImplForKeyLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesImpl findOrCreateResourcesImplForKeyLocked(android.content.res.ResourcesKey p0, android.app.ResourcesManager.ApkAssetsSupplier p1) { return null; }
    private android.content.res.ResourcesKey findKeyForResourceImplLocked(android.content.res.ResourcesImpl p0) { return null; }
    boolean isSameResourcesOverrideConfig(android.os.IBinder p0, android.content.res.Configuration p1) { return false; }
    private android.app.ResourcesManager.ActivityResources getOrCreateActivityResourcesStructLocked(android.os.IBinder p0) { return null; }
    private android.content.res.Resources findResourcesForActivityLocked(android.os.IBinder p0, android.content.res.ResourcesKey p1, java.lang.ClassLoader p2) { return null; }
    private android.content.res.Resources createResourcesForActivityLocked(android.os.IBinder p0, java.lang.ClassLoader p1, android.content.res.ResourcesImpl p2, android.content.res.CompatibilityInfo p3) { return null; }
    private android.content.res.Resources createResourcesLocked(java.lang.ClassLoader p0, android.content.res.ResourcesImpl p1, android.content.res.CompatibilityInfo p2) { return null; }
    public android.content.res.Resources createBaseTokenResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, int p5, android.content.res.Configuration p6, android.content.res.CompatibilityInfo p7, java.lang.ClassLoader p8, java.util.List<android.content.res.loader.ResourcesLoader> p9) { return null; }
    private void rebaseKeyForActivity(android.os.IBinder p0, android.content.res.ResourcesKey p1) {}
    private static <T extends java.lang.Object> void cleanupReferences(java.util.ArrayList<java.lang.ref.WeakReference<T>> p0, java.lang.ref.ReferenceQueue<T> p1) {}
    private android.app.ResourcesManager.ApkAssetsSupplier createApkAssetsSupplierNotLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.Resources createResources(android.os.IBinder p0, android.content.res.ResourcesKey p1, java.lang.ClassLoader p2, android.app.ResourcesManager.ApkAssetsSupplier p3) { return null; }
    public android.content.res.Resources getResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, int p5, android.content.res.Configuration p6, android.content.res.CompatibilityInfo p7, java.lang.ClassLoader p8, java.util.List<android.content.res.loader.ResourcesLoader> p9) { return null; }
    public void updateResourcesForActivity(android.os.IBinder p0, android.content.res.Configuration p1, int p2, boolean p3) {}
    private android.content.res.ResourcesKey rebaseActivityOverrideConfig(android.content.res.Resources p0, android.content.res.Configuration p1, android.content.res.Configuration p2, int p3) { return null; }
    public final boolean applyConfigurationToResources(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) { return false; }
    public final boolean applyConfigurationToResourcesLocked(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) { return false; }
    public final boolean applyConfigurationToResourcesLocked(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1, android.view.DisplayAdjustments p2) { return false; }
    private void applyConfigurationToResourcesLocked(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2, android.content.res.ResourcesKey p3, android.content.res.ResourcesImpl p4) {}
    public void appendLibAssetForMainAssetPath(java.lang.String p0, java.lang.String p1) {}
    public void appendLibAssetsForMainAssetPath(java.lang.String p0, java.lang.String[] p1) {}
    final void applyNewResourceDirsLocked(android.content.pm.ApplicationInfo p0, java.lang.String[] p1) {}
    private void redirectResourcesToNewImplLocked(android.util.ArrayMap<android.content.res.ResourcesImpl, android.content.res.ResourcesKey> p0) {}
    public boolean overrideTokenDisplayAdjustments(android.os.IBinder p0, java.util.function.Consumer<android.view.DisplayAdjustments> p1) { return false; }

    private static class ActivityResources {
        public final android.content.res.Configuration overrideConfig = null;
        public final java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> activityResources = null;
        final java.lang.ref.ReferenceQueue<android.content.res.Resources> activityResourcesQueue = null;
        private ActivityResources() {}
    }

    private class ApkAssetsSupplier {
        final android.util.ArrayMap<android.app.ResourcesManager.ApkKey, android.content.res.ApkAssets> mLocalCache = null;
        private ApkAssetsSupplier(android.app.ResourcesManager p0) {}
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
        private UpdateHandler(android.app.ResourcesManager p0) {}
        public void onLoadersChanged(android.content.res.Resources p0, java.util.List<android.content.res.loader.ResourcesLoader> p1) {}
        public void onLoaderUpdated(android.content.res.loader.ResourcesLoader p0) {}
    }
}

package android.content.res.loader;

public class ResourcesLoader {
    private final java.lang.Object mLock = null;
    private android.content.res.ApkAssets[] mApkAssets;
    private android.content.res.loader.ResourcesProvider[] mPreviousProviders;
    private android.content.res.loader.ResourcesProvider[] mProviders;
    private android.util.ArrayMap<java.lang.ref.WeakReference<java.lang.Object>, android.content.res.loader.ResourcesLoader.UpdateCallbacks> mChangeCallbacks;
    public ResourcesLoader() {}
    public java.util.List<android.content.res.loader.ResourcesProvider> getProviders() { return null; }
    public void addProvider(android.content.res.loader.ResourcesProvider p0) {}
    public void removeProvider(android.content.res.loader.ResourcesProvider p0) {}
    public void setProviders(java.util.List<android.content.res.loader.ResourcesProvider> p0) {}
    public void clearProviders() {}
    public java.util.List<android.content.res.ApkAssets> getApkAssets() { return null; }
    public void registerOnProvidersChangedCallback(java.lang.Object p0, android.content.res.loader.ResourcesLoader.UpdateCallbacks p1) {}
    public void unregisterOnProvidersChangedCallback(java.lang.Object p0) {}
    private static boolean arrayEquals(android.content.res.loader.ResourcesProvider[] p0, android.content.res.loader.ResourcesProvider[] p1) { return false; }
    private void notifyProvidersChangedLocked() {}

    public static interface UpdateCallbacks {
        public void onLoaderUpdated(android.content.res.loader.ResourcesLoader p0);
    }
}

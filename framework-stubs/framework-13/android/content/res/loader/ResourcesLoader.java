package android.content.res.loader;

public class ResourcesLoader {
    public ResourcesLoader() {}
    public java.util.List<android.content.res.loader.ResourcesProvider> getProviders() { return null; }
    public void addProvider(android.content.res.loader.ResourcesProvider p0) {}
    public void removeProvider(android.content.res.loader.ResourcesProvider p0) {}
    public void setProviders(java.util.List<android.content.res.loader.ResourcesProvider> p0) {}
    public void clearProviders() {}
    public java.util.List<android.content.res.ApkAssets> getApkAssets() { return null; }
    public void registerOnProvidersChangedCallback(java.lang.Object p0, android.content.res.loader.ResourcesLoader.UpdateCallbacks p1) {}
    public void unregisterOnProvidersChangedCallback(java.lang.Object p0) {}

    public static interface UpdateCallbacks {
        public void onLoaderUpdated(android.content.res.loader.ResourcesLoader p0);
    }
}

package android.content;

public class ComponentCallbacksController {
    private java.util.List<android.content.ComponentCallbacks> mComponentCallbacks;
    private final java.lang.Object mLock = null;
    public ComponentCallbacksController() {}
    public void registerCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterCallbacks(android.content.ComponentCallbacks p0) {}
    public void clearCallbacks() {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public void dispatchLowMemory() {}
    public void dispatchTrimMemory(int p0) {}
    private void forAllComponentCallbacks(java.util.function.Consumer<android.content.ComponentCallbacks> p0) {}
}

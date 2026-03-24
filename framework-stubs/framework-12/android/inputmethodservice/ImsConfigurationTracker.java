package android.inputmethodservice;

public final class ImsConfigurationTracker {
    private static final int CONFIG_CHANGED = -1;
    private android.content.res.Configuration mLastKnownConfig;
    private int mHandledConfigChanges;
    private boolean mInitialized;
    public ImsConfigurationTracker() {}
    public void onInitialize(int p0) {}
    public void onBindInput(android.content.res.Resources p0) {}
    public void setHandledConfigChanges(int p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0, java.lang.Runnable p1) {}
}

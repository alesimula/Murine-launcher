package android.view;

public class ContextThemeWrapper extends android.content.ContextWrapper {
    @android.annotation.UnsupportedAppUsage
    private int mThemeResource;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123768723L)
    private android.content.res.Resources.Theme mTheme;
    @android.annotation.UnsupportedAppUsage
    private android.view.LayoutInflater mInflater;
    private android.content.res.Configuration mOverrideConfiguration;
    @android.annotation.UnsupportedAppUsage
    private android.content.res.Resources mResources;
    public ContextThemeWrapper() { super(null); }
    public ContextThemeWrapper(android.content.Context p0, int p1) { super(null); }
    public ContextThemeWrapper(android.content.Context p0, android.content.res.Resources.Theme p1) { super(null); }
    protected void attachBaseContext(android.content.Context p0) {}
    public void applyOverrideConfiguration(android.content.res.Configuration p0) {}
    public android.content.res.Configuration getOverrideConfiguration() { return null; }
    public android.content.res.AssetManager getAssets() { return null; }
    public android.content.res.Resources getResources() { return null; }
    private android.content.res.Resources getResourcesInternal() { return null; }
    public void setTheme(int p0) {}
    public void setTheme(android.content.res.Resources.Theme p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getThemeResId() { return 0; }
    public android.content.res.Resources.Theme getTheme() { return null; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    protected void onApplyThemeResource(android.content.res.Resources.Theme p0, int p1, boolean p2) {}
    @android.annotation.UnsupportedAppUsage
    private void initializeTheme() {}
}

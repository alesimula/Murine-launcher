package android.app;

interface ActivityThreadInternal {
    public android.app.ContextImpl getSystemContext();
    public android.app.ContextImpl getSystemUiContext();
    public boolean isInDensityCompatMode();
    public boolean hasImeComponent();
    public boolean isCachedProcessState();
    public android.app.Application getApplication();
    public java.util.ArrayList<android.content.ComponentCallbacks2> collectComponentCallbacks(boolean p0);
}

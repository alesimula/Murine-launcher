package android.window;

public class SystemUiContext extends android.content.ContextWrapper implements android.window.ConfigurationDispatcher {
    public SystemUiContext(android.content.Context p0) { super(null); }
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean shouldReportPrivateChanges() { return false; }
    protected void finalize() throws java.lang.Throwable {}
}

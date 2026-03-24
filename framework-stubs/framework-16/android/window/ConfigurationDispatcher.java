package android.window;

public interface ConfigurationDispatcher {
    public void dispatchConfigurationChanged(android.content.res.Configuration p0);
    default public boolean shouldReportPrivateChanges() { return false; }
}

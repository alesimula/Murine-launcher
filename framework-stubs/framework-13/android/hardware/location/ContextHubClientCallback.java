package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubClientCallback {
    public ContextHubClientCallback() {}
    public void onMessageFromNanoApp(android.hardware.location.ContextHubClient p0, android.hardware.location.NanoAppMessage p1) {}
    public void onHubReset(android.hardware.location.ContextHubClient p0) {}
    public void onNanoAppAborted(android.hardware.location.ContextHubClient p0, long p1, int p2) {}
    public void onNanoAppLoaded(android.hardware.location.ContextHubClient p0, long p1) {}
    public void onNanoAppUnloaded(android.hardware.location.ContextHubClient p0, long p1) {}
    public void onNanoAppEnabled(android.hardware.location.ContextHubClient p0, long p1) {}
    public void onNanoAppDisabled(android.hardware.location.ContextHubClient p0, long p1) {}
    public void onClientAuthorizationChanged(android.hardware.location.ContextHubClient p0, long p1, int p2) {}
}

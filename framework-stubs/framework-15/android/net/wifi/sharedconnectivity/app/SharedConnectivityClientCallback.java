package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public interface SharedConnectivityClientCallback {
    public void onHotspotNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0);
    public void onKnownNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0);
    public void onSharedConnectivitySettingsChanged(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0);
    public void onHotspotNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0);
    public void onKnownNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0);
    public void onServiceConnected();
    public void onServiceDisconnected();
    public void onRegisterCallbackFailed(java.lang.Exception p0);
}

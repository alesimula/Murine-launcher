package android.net.wifi.sharedconnectivity.service;

@android.annotation.SystemApi
public abstract class SharedConnectivityService extends android.app.Service {
    public SharedConnectivityService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onBind() {}
    public final void setCountdownLatch(java.util.concurrent.CountDownLatch p0) {}
    public final void setHotspotNetworks(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) {}
    public final void setKnownNetworks(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) {}
    public final void setSettingsState(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) {}
    public final void updateHotspotNetworkConnectionStatus(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) {}
    public final void updateKnownNetworkConnectionStatus(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) {}
    public static boolean areHotspotNetworksEnabledForService(android.content.Context p0) { return false; }
    public static boolean areKnownNetworksEnabledForService(android.content.Context p0) { return false; }
    public abstract void onConnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0);
    public abstract void onDisconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0);
    public abstract void onConnectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0);
    public abstract void onForgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0);
}

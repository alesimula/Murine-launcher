package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public class SharedConnectivityManager {
    @android.annotation.Nullable
    public static android.net.wifi.sharedconnectivity.app.SharedConnectivityManager create(android.content.Context p0) { return null; }
    @android.annotation.SuppressLint("ManagerLookup")
    @android.annotation.Nullable
    public static android.net.wifi.sharedconnectivity.app.SharedConnectivityManager create(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.NonNull
    @android.annotation.SuppressLint("UnflaggedApi")
    public android.content.BroadcastReceiver getBroadcastReceiver() { return null; }
    public void setService(android.os.IInterface p0) {}
    @android.annotation.Nullable
    public android.content.ServiceConnection getServiceConnection() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    public void registerCallback(java.util.concurrent.Executor p0, android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    public boolean unregisterCallback(android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    public boolean connectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    public boolean disconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    public boolean connectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    public boolean forgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    @android.annotation.Nullable
    public java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> getHotspotNetworks() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    @android.annotation.Nullable
    public java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> getKnownNetworks() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    @android.annotation.Nullable
    public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState getSettingsState() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    @android.annotation.Nullable
    public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus getHotspotNetworkConnectionStatus() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.NETWORK_SETUP_WIZARD"})
    @android.annotation.Nullable
    public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus getKnownNetworkConnectionStatus() { return null; }

    private static final class SharedConnectivityCallbackProxy extends android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback.Stub {
        SharedConnectivityCallbackProxy(java.util.concurrent.Executor p0, android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p1) { super(); }
        public void onServiceConnected() {}
        public void onServiceDisconnected() {}
        public void onHotspotNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) {}
        public void onKnownNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) {}
        public void onSharedConnectivitySettingsChanged(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) {}
        public void onHotspotNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) {}
        public void onKnownNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) {}
    }
}

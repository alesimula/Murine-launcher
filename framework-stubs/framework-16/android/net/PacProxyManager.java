package android.net;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class PacProxyManager {
    public PacProxyManager(android.content.Context p0, android.net.IPacProxyManager p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_STACK", "android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_SETTINGS"})
    public void addPacProxyInstalledListener(java.util.concurrent.Executor p0, android.net.PacProxyManager.PacProxyInstalledListener p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_STACK", "android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_SETTINGS"})
    public void removePacProxyInstalledListener(android.net.PacProxyManager.PacProxyInstalledListener p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_STACK", "android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_SETTINGS"})
    public void setCurrentProxyScriptUrl(android.net.ProxyInfo p0) {}

    public static interface PacProxyInstalledListener {
        public void onPacProxyInstalled(android.net.Network p0, android.net.ProxyInfo p1);
    }

    public class PacProxyInstalledListenerProxy extends android.net.IPacProxyInstalledListener.Stub {
        PacProxyInstalledListenerProxy(android.net.PacProxyManager p0, java.util.concurrent.Executor p1, android.net.PacProxyManager.PacProxyInstalledListener p2) { super(); }
        public void onPacProxyInstalled(android.net.Network p0, android.net.ProxyInfo p1) {}
    }
}

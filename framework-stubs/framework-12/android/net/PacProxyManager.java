package android.net;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class PacProxyManager {
    private final android.content.Context mContext = null;
    private final android.net.IPacProxyManager mService = null;
    private final java.util.HashMap<android.net.PacProxyManager.PacProxyInstalledListener, android.net.PacProxyManager.PacProxyInstalledListenerProxy> mListenerMap = null;
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
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.net.PacProxyManager.PacProxyInstalledListener mListener = null;
        PacProxyInstalledListenerProxy(android.net.PacProxyManager p0, java.util.concurrent.Executor p1, android.net.PacProxyManager.PacProxyInstalledListener p2) { super(); }
        public void onPacProxyInstalled(android.net.Network p0, android.net.ProxyInfo p1) {}
    }
}

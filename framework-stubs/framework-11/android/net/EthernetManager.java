package android.net;

@android.annotation.SystemApi
public class EthernetManager {
    private static final java.lang.String TAG = "EthernetManager";
    private static final int MSG_AVAILABILITY_CHANGED = 1000;
    private final android.content.Context mContext = null;
    private final android.net.IEthernetManager mService = null;
    private final android.os.Handler mHandler = null;
    private final java.util.ArrayList<android.net.EthernetManager.Listener> mListeners = null;
    private final android.net.IEthernetServiceListener.Stub mServiceListener = null;
    public EthernetManager(android.content.Context p0, android.net.IEthernetManager p1) {}
    public android.net.IpConfiguration getConfiguration(java.lang.String p0) { return null; }
    public void setConfiguration(java.lang.String p0, android.net.IpConfiguration p1) {}
    public boolean isAvailable() { return false; }
    public boolean isAvailable(java.lang.String p0) { return false; }
    public void addListener(android.net.EthernetManager.Listener p0) {}
    public java.lang.String[] getAvailableInterfaces() { return null; }
    public void removeListener(android.net.EthernetManager.Listener p0) {}
    public void setIncludeTestInterfaces(boolean p0) {}
    public android.net.EthernetManager.TetheredInterfaceRequest requestTetheredInterface(java.util.concurrent.Executor p0, android.net.EthernetManager.TetheredInterfaceCallback p1) { return null; }

    public static interface Listener {
        public void onAvailabilityChanged(java.lang.String p0, boolean p1);
    }

    public static interface TetheredInterfaceCallback {
        public void onAvailable(java.lang.String p0);
        public void onUnavailable();
    }

    public static class TetheredInterfaceRequest {
        private final android.net.IEthernetManager mService = null;
        private final android.net.ITetheredInterfaceCallback mCb = null;
        private TetheredInterfaceRequest(android.net.IEthernetManager p0, android.net.ITetheredInterfaceCallback p1) {}
        public void release() {}
    }
}

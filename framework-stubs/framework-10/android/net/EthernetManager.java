package android.net;

public class EthernetManager {
    private static final java.lang.String TAG = "EthernetManager";
    private static final int MSG_AVAILABILITY_CHANGED = 1000;
    private final android.content.Context mContext = null;
    private final android.net.IEthernetManager mService = null;
    private final android.os.Handler mHandler = null;
    private final java.util.ArrayList<android.net.EthernetManager.Listener> mListeners = null;
    private final android.net.IEthernetServiceListener.Stub mServiceListener = null;
    public EthernetManager(android.content.Context p0, android.net.IEthernetManager p1) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.IpConfiguration getConfiguration(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setConfiguration(java.lang.String p0, android.net.IpConfiguration p1) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isAvailable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isAvailable(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void addListener(android.net.EthernetManager.Listener p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getAvailableInterfaces() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void removeListener(android.net.EthernetManager.Listener p0) {}

    public static interface Listener {
        @android.annotation.UnsupportedAppUsage
        public void onAvailabilityChanged(java.lang.String p0, boolean p1);
    }
}

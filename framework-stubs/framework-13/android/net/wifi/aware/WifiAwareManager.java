package android.net.wifi.aware;

public class WifiAwareManager {
    public static final java.lang.String ACTION_WIFI_AWARE_RESOURCE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_RESOURCE_CHANGED";
    public static final java.lang.String ACTION_WIFI_AWARE_STATE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED";
    public static final java.lang.String EXTRA_AWARE_RESOURCES = "android.net.wifi.aware.extra.AWARE_RESOURCES";
    public static final int WIFI_AWARE_DATA_PATH_ROLE_INITIATOR = 0;
    public static final int WIFI_AWARE_DATA_PATH_ROLE_RESPONDER = 1;
    public static final int WIFI_AWARE_DISCOVERY_LOST_REASON_PEER_NOT_VISIBLE = 1;
    public static final int WIFI_AWARE_DISCOVERY_LOST_REASON_UNKNOWN = 0;
    WifiAwareManager() {}
    public boolean isAvailable() { return false; }
    public boolean isDeviceAttached() { return false; }
    public boolean isSetChannelOnDataPathSupported() { return false; }
    public void enableInstantCommunicationMode(boolean p0) {}
    public boolean isInstantCommunicationModeEnabled() { return false; }
    @android.annotation.Nullable
    public android.net.wifi.aware.Characteristics getCharacteristics() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.aware.AwareResources getAvailableAwareResources() { return null; }
    public void attach(android.net.wifi.aware.AttachCallback p0, android.os.Handler p1) {}
    public void attach(android.net.wifi.aware.AttachCallback p0, android.net.wifi.aware.IdentityChangedListener p1, android.os.Handler p2) {}
    public void setAwareParams(android.net.wifi.aware.AwareParams p0) {}
}

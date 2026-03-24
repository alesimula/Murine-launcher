package android.net.wifi.aware;

public class WifiAwareManager {
    public static final java.lang.String ACTION_WIFI_AWARE_STATE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED";
    public static final int WIFI_AWARE_DATA_PATH_ROLE_INITIATOR = 0;
    public static final int WIFI_AWARE_DATA_PATH_ROLE_RESPONDER = 1;
    WifiAwareManager() {}
    public boolean isAvailable() { return false; }
    public android.net.wifi.aware.Characteristics getCharacteristics() { return null; }
    public void attach(android.net.wifi.aware.AttachCallback p0, android.os.Handler p1) {}
    public void attach(android.net.wifi.aware.AttachCallback p0, android.net.wifi.aware.IdentityChangedListener p1, android.os.Handler p2) {}
}

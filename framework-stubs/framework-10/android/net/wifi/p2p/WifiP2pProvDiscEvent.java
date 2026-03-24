package android.net.wifi.p2p;

public class WifiP2pProvDiscEvent {
    private static final java.lang.String TAG = "WifiP2pProvDiscEvent";
    public static final int PBC_REQ = 1;
    public static final int PBC_RSP = 2;
    public static final int ENTER_PIN = 3;
    public static final int SHOW_PIN = 4;
    @android.annotation.UnsupportedAppUsage
    public int event;
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.p2p.WifiP2pDevice device;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String pin;
    @android.annotation.UnsupportedAppUsage
    public WifiP2pProvDiscEvent() {}
    public WifiP2pProvDiscEvent(java.lang.String p0) throws java.lang.IllegalArgumentException {}
    public java.lang.String toString() { return null; }
}

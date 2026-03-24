package android.net.wifi.p2p;

public class WifiP2pDevice implements android.os.Parcelable {
    private static final java.lang.String TAG = "WifiP2pDevice";
    public java.lang.String deviceName;
    public java.lang.String deviceAddress;
    public java.lang.String primaryDeviceType;
    public java.lang.String secondaryDeviceType;
    private static final int WPS_CONFIG_DISPLAY = 8;
    private static final int WPS_CONFIG_PUSHBUTTON = 128;
    private static final int WPS_CONFIG_KEYPAD = 256;
    private static final int DEVICE_CAPAB_SERVICE_DISCOVERY = 1;
    private static final int DEVICE_CAPAB_CLIENT_DISCOVERABILITY = 2;
    private static final int DEVICE_CAPAB_CONCURRENT_OPER = 4;
    private static final int DEVICE_CAPAB_INFRA_MANAGED = 8;
    private static final int DEVICE_CAPAB_DEVICE_LIMIT = 16;
    private static final int DEVICE_CAPAB_INVITATION_PROCEDURE = 32;
    private static final int GROUP_CAPAB_GROUP_OWNER = 1;
    private static final int GROUP_CAPAB_PERSISTENT_GROUP = 2;
    private static final int GROUP_CAPAB_GROUP_LIMIT = 4;
    private static final int GROUP_CAPAB_INTRA_BSS_DIST = 8;
    private static final int GROUP_CAPAB_CROSS_CONN = 16;
    private static final int GROUP_CAPAB_PERSISTENT_RECONN = 32;
    private static final int GROUP_CAPAB_GROUP_FORMATION = 64;
    @android.annotation.UnsupportedAppUsage
    public int wpsConfigMethodsSupported;
    @android.annotation.UnsupportedAppUsage
    public int deviceCapability;
    @android.annotation.UnsupportedAppUsage
    public int groupCapability;
    public static final int CONNECTED = 0;
    public static final int INVITED = 1;
    public static final int FAILED = 2;
    public static final int AVAILABLE = 3;
    public static final int UNAVAILABLE = 4;
    public int status;
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.p2p.WifiP2pWfdInfo wfdInfo;
    private static final java.util.regex.Pattern detailedDevicePattern = null;
    private static final java.util.regex.Pattern twoTokenPattern = null;
    private static final java.util.regex.Pattern threeTokenPattern = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pDevice> CREATOR = null;
    public WifiP2pDevice() {}
    @android.annotation.UnsupportedAppUsage
    public WifiP2pDevice(java.lang.String p0) throws java.lang.IllegalArgumentException {}
    public boolean wpsPbcSupported() { return false; }
    public boolean wpsKeypadSupported() { return false; }
    public boolean wpsDisplaySupported() { return false; }
    public boolean isServiceDiscoveryCapable() { return false; }
    public boolean isInvitationCapable() { return false; }
    public boolean isDeviceLimit() { return false; }
    public boolean isGroupOwner() { return false; }
    public boolean isGroupLimit() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void update(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public void updateSupplicantDetails(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public WifiP2pDevice(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private int parseHex(java.lang.String p0) { return 0; }
}

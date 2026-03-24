package android.stats.connectivity;

public final class TetheringProto {
    public static final int EC_NO_ERROR = 0;
    public static final int EC_UNKNOWN_IFACE = 1;
    public static final int EC_SERVICE_UNAVAIL = 2;
    public static final int EC_UNSUPPORTED = 3;
    public static final int EC_UNAVAIL_IFACE = 4;
    public static final int EC_INTERNAL_ERROR = 5;
    public static final int EC_TETHER_IFACE_ERROR = 6;
    public static final int EC_UNTETHER_IFACE_ERROR = 7;
    public static final int EC_ENABLE_FORWARDING_ERROR = 8;
    public static final int EC_DISABLE_FORWARDING_ERROR = 9;
    public static final int EC_IFACE_CFG_ERROR = 10;
    public static final int EC_PROVISIONING_FAILED = 11;
    public static final int EC_DHCPSERVER_ERROR = 12;
    public static final int EC_ENTITLEMENT_UNKNOWN = 13;
    public static final int EC_NO_CHANGE_TETHERING_PERMISSION = 14;
    public static final int EC_NO_ACCESS_TETHERING_PERMISSION = 15;
    public static final int EC_UNKNOWN_TYPE = 16;
    public static final int DS_UNSPECIFIED = 0;
    public static final int DS_TETHERING_WIFI = 1;
    public static final int DS_TETHERING_USB = 2;
    public static final int DS_TETHERING_BLUETOOTH = 3;
    public static final int DS_TETHERING_WIFI_P2P = 4;
    public static final int DS_TETHERING_NCM = 5;
    public static final int DS_TETHERING_ETHERNET = 6;
    public static final int UT_UNKNOWN = 0;
    public static final int UT_CELLULAR = 1;
    public static final int UT_WIFI = 2;
    public static final int UT_BLUETOOTH = 3;
    public static final int UT_ETHERNET = 4;
    public static final int UT_WIFI_AWARE = 5;
    public static final int UT_LOWPAN = 6;
    public static final int UT_CELLULAR_VPN = 7;
    public static final int UT_WIFI_VPN = 8;
    public static final int UT_BLUETOOTH_VPN = 9;
    public static final int UT_ETHERNET_VPN = 10;
    public static final int UT_WIFI_CELLULAR_VPN = 11;
    public static final int UT_TEST = 12;
    public static final int UT_DUN_CELLULAR = 13;
    public static final int UT_LOCAL_ONLY = 14;
    public static final int UT_NO_NETWORK = 15;
    public static final int USER_UNKNOWN = 0;
    public static final int USER_SETTINGS = 1;
    public static final int USER_SYSTEMUI = 2;
    public static final int USER_GMS = 3;
    public TetheringProto() {}
}

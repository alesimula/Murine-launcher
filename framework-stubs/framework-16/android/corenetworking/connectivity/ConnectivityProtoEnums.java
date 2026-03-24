package android.corenetworking.connectivity;

public final class ConnectivityProtoEnums {
    public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;
    public static final int SIGNAL_STRENGTH_POOR = 1;
    public static final int SIGNAL_STRENGTH_MODERATE = 2;
    public static final int SIGNAL_STRENGTH_GOOD = 3;
    public static final int SIGNAL_STRENGTH_GREAT = 4;
    public static final int RT_UNKNOWN = 0;
    public static final int RT_WIFI = 1;
    public static final int RT_2G = 2;
    public static final int RT_3G = 3;
    public static final int RT_4G = 4;
    public static final int RT_5G = 5;
    public static final int NETWORK_REQUEST_STATE_UNKNOWN = 0;
    public static final int NETWORK_REQUEST_STATE_RECEIVED = 1;
    public static final int NETWORK_REQUEST_STATE_REMOVED = 2;
    public static final int PREFIX_UNKNOWN = 0;
    public static final int PREFIX_XT = 1;
    public static final int PREFIX_UID = 2;
    public static final int PREFIX_UIDTAG = 3;
    public static final int ROT_UNKNOWN = 0;
    public static final int ROT_READ = 1;
    public static final int ROT_WRITE = 2;
    public static final int FDIS_UNKNOWN = 0;
    public static final int FDIS_ENABLED = 1;
    public static final int FDIS_DISABLED = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_MESSAGE_QUEUED_BEFORE_CONNECT = 1;
    public static final int TYPE_DISALLOW_BYPASS_VPN_FOR_DELEGATE_UID_ENOENT = 2;
    public static final int TYPE_LEGACY_TETHER_WITH_TYPE_WIFI = 3;
    public static final int TYPE_LEGACY_TETHER_WITH_TYPE_WIFI_P2P = 4;
    public static final int TYPE_LEGACY_TETHER_WITH_TYPE_WIFI_SUCCESS = 5;
    public static final int TYPE_LEGACY_TETHER_WITH_TYPE_WIFI_P2P_SUCCESS = 6;
    public static final int TYPE_ENTITLEMENT_CREATE_CONTEXT_AS_USER_THROWS = 7;
    public static final int TYPE_TETHER_WITH_PLACEHOLDER_REQUEST = 8;
    public static final int TYPE_DISALLOW_BYPASS_PRIVATE_DNS_FOR_DELEGATE_UID_ENOENT = 9;
    public static final int TYPE_ALLOW_BYPASS_VPN_FOR_DELEGATE_UID_ERROR = 10;
    public static final int TYPE_ALLOW_BYPASS_PRIVATE_DNS_FOR_DELEGATE_UID_ERROR = 11;
    public static final int TYPE_TETHER_WIFI_TYPE_MISMATCH = 12;
    public static final int TYPE_TETHER_WIFIP2P_TYPE_MISMATCH = 13;
    public static final int CRITICAL_BYTES_EVENT_TYPE_UNKNOWN = 0;
    public static final int CRITICAL_BYTES_EVENT_TYPE_SATELLITE_COARSE_TX_USAGE = 1;
    public static final int CRITICAL_BYTES_EVENT_TYPE_SATELLITE_COARSE_RX_USAGE = 2;
    public ConnectivityProtoEnums() {}
}

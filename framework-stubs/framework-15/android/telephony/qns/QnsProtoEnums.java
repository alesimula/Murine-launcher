package android.telephony.qns;

public final class QnsProtoEnums {
    public static final int NET_CAPABILITY_MMS = 0;
    public static final int NET_CAPABILITY_IMS = 4;
    public static final int NET_CAPABILITY_CBS = 5;
    public static final int NET_CAPABILITY_XCAP = 9;
    public static final int NET_CAPABILITY_EIMS = 10;
    public static final int EMPTY = -1;
    public static final int UNKNOWN = 0;
    public static final int GERAN = 1;
    public static final int UTRAN = 2;
    public static final int EUTRAN = 3;
    public static final int CDMA2000 = 4;
    public static final int IWLAN = 5;
    public static final int NGRAN = 6;
    public static final int TRANSPORT_TYPE_INVALID = -1;
    public static final int TRANSPORT_TYPE_WWAN = 1;
    public static final int TRANSPORT_TYPE_WLAN = 2;
    public static final int IWLAN_NETWORK_TYPE_NONE = -1;
    public static final int IWLAN_NETWORK_TYPE_WIFI = 1;
    public static final int IWLAN_NETWORK_TYPE_CST = 2;
    public static final int WFC_MODE_UNKNOWN = 0;
    public static final int WIFI_ONLY = 1;
    public static final int CELLULAR_PREFERRED = 2;
    public static final int WIFI_PREFERRED = 3;
    public static final int RESTRICT_TYPE_NONE = 0;
    public static final int RESTRICT_TYPE_GUARDING = 1;
    public static final int RESTRICT_TYPE_THROTTLING = 2;
    public static final int RESTRICT_TYPE_HO_NOT_ALLOWED = 4;
    public static final int RESTRICT_TYPE_NON_PREFERRED_TRANSPORT = 8;
    public static final int RESTRICT_TYPE_RTP_LOW_QUALITY = 16;
    public static final int RESTRICT_TYPE_RESTRICT_IWLAN_IN_CALL = 32;
    public static final int RESTRICT_TYPE_RESTRICT_IWLAN_CS_CALL = 64;
    public static final int RESTRICT_TYPE_FALLBACK_TO_WWAN_IMS_REGI_FAIL = 128;
    public static final int RESTRICT_TYPE_FALLBACK_ON_DATA_CONNECTION_FAIL = 256;
    public static final int RESTRICT_TYPE_FALLBACK_TO_WWAN_RTT_BACKHAUL_FAIL = 512;
    public QnsProtoEnums() {}
}

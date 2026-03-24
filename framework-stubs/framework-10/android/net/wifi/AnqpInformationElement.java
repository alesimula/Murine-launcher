package android.net.wifi;

public class AnqpInformationElement {
    public static final int HOTSPOT20_VENDOR_ID = 5271450;
    public static final int ANQP_QUERY_LIST = 256;
    public static final int ANQP_CAPABILITY_LIST = 257;
    public static final int ANQP_VENUE_NAME = 258;
    public static final int ANQP_EMERGENCY_NUMBER = 259;
    public static final int ANQP_NWK_AUTH_TYPE = 260;
    public static final int ANQP_ROAMING_CONSORTIUM = 261;
    public static final int ANQP_IP_ADDR_AVAILABILITY = 262;
    public static final int ANQP_NAI_REALM = 263;
    public static final int ANQP_3GPP_NETWORK = 264;
    public static final int ANQP_GEO_LOC = 265;
    public static final int ANQP_CIVIC_LOC = 266;
    public static final int ANQP_LOC_URI = 267;
    public static final int ANQP_DOM_NAME = 268;
    public static final int ANQP_EMERGENCY_ALERT = 269;
    public static final int ANQP_TDLS_CAP = 270;
    public static final int ANQP_EMERGENCY_NAI = 271;
    public static final int ANQP_NEIGHBOR_REPORT = 272;
    public static final int ANQP_VENDOR_SPEC = 56797;
    public static final int HS_QUERY_LIST = 1;
    public static final int HS_CAPABILITY_LIST = 2;
    public static final int HS_FRIENDLY_NAME = 3;
    public static final int HS_WAN_METRICS = 4;
    public static final int HS_CONN_CAPABILITY = 5;
    public static final int HS_NAI_HOME_REALM_QUERY = 6;
    public static final int HS_OPERATING_CLASS = 7;
    public static final int HS_OSU_PROVIDERS = 8;
    public static final int HS_ICON_REQUEST = 10;
    public static final int HS_ICON_FILE = 11;
    private final int mVendorId = 0;
    private final int mElementId = 0;
    private final byte[] mPayload = null;
    public AnqpInformationElement(int p0, int p1, byte[] p2) {}
    public int getVendorId() { return 0; }
    public int getElementId() { return 0; }
    public byte[] getPayload() { return null; }
}

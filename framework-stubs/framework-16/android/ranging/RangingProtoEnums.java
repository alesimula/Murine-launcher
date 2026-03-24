package android.ranging;

public final class RangingProtoEnums {
    public static final int TECHNOLOGY_UNKNOWN = 0;
    public static final int TECHNOLOGY_UWB = 1;
    public static final int TECHNOLOGY_BLE_CS = 2;
    public static final int TECHNOLOGY_WIFI_NAN_RTT = 3;
    public static final int TECHNOLOGY_BLE_RSSI = 4;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_OOB = 1;
    public static final int STATE_STARTING = 2;
    public static final int STATE_RANGING = 3;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_RAW = 1;
    public static final int TYPE_OOB = 2;
    public static final int ROLE_UNKNOWN = 0;
    public static final int ROLE_RESPONDER = 1;
    public static final int ROLE_INITIATOR = 2;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_LOCAL_REQUEST = 1;
    public static final int REASON_REMOTE_REQUEST = 2;
    public static final int REASON_UNSUPPORTED = 3;
    public static final int REASON_SYSTEM_POLICY = 4;
    public static final int REASON_NO_PEERS_FOUND = 5;
    public static final int REASON_INTERNAL_ERROR = 6;
    public static final int REASON_BACKGROUND_RANGING_POLICY = 7;
    public static final int REASON_PEER_CAPABILITIES_MISMATCH = 8;
    public RangingProtoEnums() {}
}

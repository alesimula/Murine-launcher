package android.bluetooth.le;

public final class BluetoothLEProtoEnums {
    public static final int LE_ACL_UNSPECIFIED = 0;
    public static final int LE_ACL_SUCCESS = 1;
    public static final int LE_ACL_FAILED = 2;
    public static final int LE_ACL_ALREADY_PRESENT = 3;
    public static final int ORIGIN_UNSPECIFIED = 0;
    public static final int ORIGIN_NATIVE = 1;
    public static final int ORIGIN_JAVA = 2;
    public static final int CONNECTION_TYPE_UNSPECIFIED = 0;
    public static final int CONNECTION_TYPE_LE_ACL = 1;
    public static final int CONNECTION_TYPE_GATT = 2;
    public static final int CONNECTION_TYPE_L2CAP_FIXED_CHNL_SMP = 3;
    public static final int CONNECTION_TYPE_L2CAP_FIXED_CHNL_ATT = 4;
    public static final int CONNECTION_TYPE_L2CAP_FIXED_CHNL_LE_SIGNALLING = 5;
    public static final int CONNECTION_TYPE_L2CAP_FIXED_CHNL_AMP = 6;
    public static final int CONNECTION_TYPE_L2CAP_FIXED_CHNL_SMP_BR_EDR = 7;
    public static final int STATE_UNSPECIFIED = 0;
    public static final int STATE_LE_ACL_START = 1;
    public static final int STATE_LE_ACL_END = 2;
    public static final int STATE_LE_ACL_CANCEL = 3;
    public static final int STATE_LE_ACL_TIMEOUT = 4;
    public static final int STATE_GATT_APP_USE_LINK_FLAG = 5;
    public static final int STATE_GATT_CREATE_DIRECT_CONN = 6;
    public static final int STATE_GATT_HOLD_LINK_EMPTY = 7;
    public static final int STATE_GATT_CONNECT_NATIVE = 8;
    public static final int STATE_GATT_APP_CREATE_LE_ACL = 9;
    public static final int STATE_GATT_CONN_STATE_CHANGE_CLIENT = 10;
    public static final int STATE_GATT_CONN_STATE_CHANGE_SERVER = 11;
    public static final int STATE_L2CAP_FIXED_CHNL_START_CREATE_CONN = 12;
    public static final int STATE_L2CAP_FIXED_CHNL_START_LE_ACL = 13;
    public static final int STATE_L2CAP_FIXED_CHNL_LE_ACL_FINISH = 14;
    public BluetoothLEProtoEnums() {}
}

package com.android.cellbroadcastservice;

public final class CellBroadcastStatsLog {
    public static final int CB_MESSAGE_REPORTED = 249;
    public static final int CB_MESSAGE_ERROR = 250;
    public static final int CB_MESSAGE_FILTERED = 278;
    public static final int CB_CONFIG_UPDATED = 479;
    public static final int CB_MODULE_ERROR_REPORTED = 480;
    public static final int CB_SERVICE_FEATURE_CHANGED = 481;
    public static final int CB_RECEIVER_FEATURE_CHANGED = 482;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__TYPE__UNKNOWN_TYPE = 0;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__TYPE__GSM = 1;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__TYPE__CDMA = 2;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__TYPE__CDMA_SPC = 3;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__SOURCE__UNKNOWN_SOURCE = 0;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__SOURCE__FRAMEWORK = 1;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__SOURCE__CB_SERVICE = 2;
    public static final int CELL_BROADCAST_MESSAGE_REPORTED__SOURCE__CB_RECEIVER_APP = 3;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__UNKNOWN_TYPE = 0;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__CDMA_DECODING_ERROR = 1;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__CDMA_SCP_EMPTY = 2;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__CDMA_SCP_HANDLING_ERROR = 3;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__GSM_INVALID_HEADER_LENGTH = 4;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__GSM_UNSUPPORTED_HEADER_MESSAGE_TYPE = 5;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__GSM_UNSUPPORTED_HEADER_DATA_CODING_SCHEME = 6;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__GSM_INVALID_PDU = 7;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__GSM_INVALID_GEO_FENCING_DATA = 8;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__GSM_UMTS_INVALID_WAC = 9;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__FAILED_TO_INSERT_TO_DB = 10;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__UNEXPECTED_GEOMETRY_FROM_FWK = 11;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__UNEXPECTED_GSM_MESSAGE_TYPE_FROM_FWK = 12;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__UNEXPECTED_CDMA_MESSAGE_TYPE_FROM_FWK = 13;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__UNEXPECTED_CDMA_SCP_MESSAGE_TYPE_FROM_FWK = 14;
    public static final int CELL_BROADCAST_MESSAGE_ERROR__TYPE__NO_CONNECTION_TO_CB_SERVICE = 15;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__TYPE__UNKNOWN_TYPE = 0;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__TYPE__GSM = 1;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__TYPE__CDMA = 2;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__TYPE__CDMA_SPC = 3;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOT_FILTERED = 0;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__DUPLICATE_MESSAGE = 1;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__GEOFENCED_MESSAGE = 2;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__AREA_INFO_MESSAGE = 3;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__DISABLED_BY_OEM = 4;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_ECBM = 5;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_USER_PREF = 6;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_EMPTY_BODY = 7;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_MISMATCH_PREF_SECOND_LANG = 8;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_PREF_SECONDLANG_OFF = 9;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_MISMATCH_DEVICE_LANG_SETTING = 10;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_MESSAGE_FOR_TESTMODE = 11;
    public static final int CELL_BROADCAST_MESSAGE_FILTERED__FILTER__NOTSHOW_FILTER_STRING = 12;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__SOURCE__UNKNOWN_SOURCE = 0;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__SOURCE__FRAMEWORK = 1;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__SOURCE__CB_SERVICE = 2;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__SOURCE__CB_RECEIVER_APP = 3;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_UNKNOWN = 0;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_BAD_CONFIG = 1;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_DB_MIGRATION = 2;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_DEFAULT_RES = 3;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_ENABLE_CHANNEL = 4;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_GET_LOCATION = 5;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_MISSING_RES = 6;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_PLAY_FLASH = 7;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_PLAY_SOUND = 8;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_PLAY_TTS = 9;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_PREF_MIGRATION = 10;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_PROVIDER_INIT = 11;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_RESET_CHANNEL_R = 12;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_STATUS_BAR = 13;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_REMINDER_INTERVAL = 14;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_ICON_RESOURCE = 15;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_CHANNEL_RANGE_PARSE = 16;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_DB_INIT = 17;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_NOT_FOUND_DEFAULT_CBR_PKGS = 18;
    public static final int CELL_BROADCAST_MODULE_ERROR_REPORTED__TYPE__ERROR_FOUND_MULTIPLE_CBR_PKGS = 19;
    public static final byte ANNOTATION_ID_IS_UID = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_DEFAULT_STATE = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_STATE_NESTED = Byte.valueOf((byte)0);
    public CellBroadcastStatsLog() {}
    public static void write(int p0, boolean p1, byte[] p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7) {}
    public static void write(int p0, boolean p1, boolean p2, boolean p3) {}
    public static void write(int p0, int p1, int p2) {}
    public static void write(int p0, int p1, int p2, int p3, int p4) {}
    public static void write(int p0, int p1, java.lang.String p2) {}
    public static void write(int p0, java.lang.String p1, byte[] p2) {}
}

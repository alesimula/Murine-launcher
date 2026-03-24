package android.hardware.radio.network;

public @interface RegistrationFailCause {
    public static final int NONE = 0;
    public static final int IMSI_UNKNOWN_IN_HLR = 2;
    public static final int ILLEGAL_MS = 3;
    public static final int IMSI_UNKNOWN_IN_VLR = 4;
    public static final int IMEI_NOT_ACCEPTED = 5;
    public static final int ILLEGAL_ME = 6;
    public static final int GPRS_SERVICES_NOT_ALLOWED = 7;
    public static final int GPRS_AND_NON_GPRS_SERVICES_NOT_ALLOWED = 8;
    public static final int MS_IDENTITY_CANNOT_BE_DERIVED_BY_NETWORK = 9;
    public static final int IMPLICITLY_DETACHED = 10;
    public static final int PLMN_NOT_ALLOWED = 11;
    public static final int LOCATION_AREA_NOT_ALLOWED = 12;
    public static final int ROAMING_NOT_ALLOWED = 13;
    public static final int GPRS_SERVICES_NOT_ALLOWED_IN_PLMN = 14;
    public static final int NO_SUITABLE_CELLS = 15;
    @java.lang.Deprecated
    public static final int MSC_TEMPORARILY_NOT_REACHABLE = 15;
    public static final int MSC_TEMP_NOT_REACHABLE = 16;
    public static final int NETWORK_FAILURE = 17;
    public static final int MAC_FAILURE = 20;
    public static final int SYNC_FAILURE = 21;
    public static final int CONGESTION = 22;
    public static final int GSM_AUTHENTICATION_UNACCEPTABLE = 23;
    public static final int NOT_AUTHORIZED_FOR_THIS_CSG = 25;
    public static final int SMS_PROVIDED_BY_GPRS_IN_ROUTING_AREA = 26;
    public static final int SERVICE_OPTION_NOT_SUPPORTED = 32;
    public static final int SERVICE_OPTION_NOT_SUBSCRIBED = 33;
    public static final int SERVICE_OPTION_TEMPORARILY_OUT_OF_ORDER = 34;
    public static final int CALL_CANNOT_BE_IDENTIFIED = 38;
    public static final int NO_PDP_CONTEXT_ACTIVATED = 40;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_1 = 48;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_2 = 49;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_3 = 50;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_4 = 51;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_5 = 52;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_6 = 53;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_7 = 54;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_8 = 55;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_9 = 56;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_10 = 57;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_11 = 58;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_12 = 59;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_13 = 60;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_14 = 61;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_15 = 62;
    public static final int RETRY_UPON_ENTRY_INTO_NEW_CELL_16 = 63;
    public static final int SEMANTICALLY_INCORRECT_MESSAGE = 95;
    public static final int INVALID_MANDATORY_INFORMATION = 96;
    public static final int MESSAGE_TYPE_NON_EXISTENT_OR_NOT_IMPLEMENTED = 97;
    public static final int MESSAGE_TYPE_NOT_COMPATIBLE_WITH_PROTOCOL_STATE = 98;
    public static final int INFORMATION_ELEMENT_NON_EXISTENT_OR_NOT_IMPLEMENTED = 99;
    public static final int CONDITIONAL_IE_ERROR = 100;
    public static final int MESSAGE_NOT_COMPATIBLE_WITH_PROTOCOL_STATE = 101;
    public static final int PROTOCOL_ERROR_UNSPECIFIED = 111;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}

package com.android.internal.telephony;

public class PhoneConstants {
    public static final java.lang.String STATE_KEY = "state";
    public static final int PHONE_TYPE_NONE = 0;
    public static final int PHONE_TYPE_GSM = 1;
    public static final int PHONE_TYPE_CDMA = 2;
    public static final int PHONE_TYPE_SIP = 3;
    public static final int PHONE_TYPE_THIRD_PARTY = 4;
    public static final int PHONE_TYPE_IMS = 5;
    public static final int PHONE_TYPE_CDMA_LTE = 6;
    public static final int LTE_ON_CDMA_UNKNOWN = -1;
    public static final int LTE_ON_CDMA_FALSE = 0;
    public static final int LTE_ON_CDMA_TRUE = 1;
    public static final int PRESENTATION_ALLOWED = 1;
    public static final int PRESENTATION_RESTRICTED = 2;
    public static final int PRESENTATION_UNKNOWN = 3;
    public static final int PRESENTATION_PAYPHONE = 4;
    public static final int PRESENTATION_UNAVAILABLE = 5;
    public static final java.lang.String PHONE_NAME_KEY = "phoneName";
    public static final java.lang.String DATA_NETWORK_TYPE_KEY = "networkType";
    public static final java.lang.String DATA_APN_TYPE_KEY = "apnType";
    public static final java.lang.String DATA_APN_KEY = "apn";
    public static final int PIN_RESULT_SUCCESS = 0;
    public static final int PIN_PASSWORD_INCORRECT = 1;
    public static final int PIN_GENERAL_FAILURE = 2;
    public static final int PIN_OPERATION_ABORTED = 3;
    public static final int APN_ALREADY_ACTIVE = 0;
    public static final int APN_REQUEST_STARTED = 1;
    public static final int APN_TYPE_NOT_AVAILABLE = 2;
    public static final int APN_REQUEST_FAILED = 3;
    public static final int APN_ALREADY_INACTIVE = 4;
    public static final java.lang.String APN_TYPE_ALL = "*";
    public static final java.lang.String APN_TYPE_DEFAULT = "default";
    public static final java.lang.String APN_TYPE_MMS = "mms";
    public static final java.lang.String APN_TYPE_SUPL = "supl";
    public static final java.lang.String APN_TYPE_DUN = "dun";
    public static final java.lang.String APN_TYPE_HIPRI = "hipri";
    public static final java.lang.String APN_TYPE_FOTA = "fota";
    public static final java.lang.String APN_TYPE_IMS = "ims";
    public static final java.lang.String APN_TYPE_CBS = "cbs";
    public static final java.lang.String APN_TYPE_IA = "ia";
    public static final java.lang.String APN_TYPE_EMERGENCY = "emergency";
    public static final java.lang.String APN_TYPE_MCX = "mcx";
    public static final java.lang.String APN_TYPE_XCAP = "xcap";
    public static final int RIL_CARD_MAX_APPS = 8;
    public static final int DEFAULT_SLOT_INDEX = 0;
    public static final int MAX_PHONE_COUNT_SINGLE_SIM = 1;
    public static final int MAX_PHONE_COUNT_DUAL_SIM = 2;
    public static final int MAX_PHONE_COUNT_TRI_SIM = 3;
    public static final java.lang.String PHONE_KEY = "phone";
    public static final java.lang.String SLOT_KEY = "slot";
    public static final java.lang.String PORT_KEY = "port";
    public static final java.lang.String SUBSCRIPTION_KEY = "subscription";
    public static final java.lang.String SUB_SETTING = "subSettings";
    public static final int SUB1 = 0;
    public static final int SUB2 = 1;
    public static final int SUB3 = 2;
    public static final int SIM_ID_1 = 0;
    public static final int SIM_ID_2 = 1;
    public static final int SIM_ID_3 = 2;
    public static final int SIM_ID_4 = 3;
    public static final int APPTYPE_UNKNOWN = 0;
    public static final int APPTYPE_SIM = 1;
    public static final int APPTYPE_USIM = 2;
    public static final int APPTYPE_RUIM = 3;
    public static final int APPTYPE_CSIM = 4;
    public static final int APPTYPE_ISIM = 5;
    public static final int UNSET_MTU = 0;
    public static final int CAPABILITY_3G = 1;
    public static final int AUDIO_OUTPUT_ENABLE_SPEAKER = 0;
    public static final int AUDIO_OUTPUT_DISABLE_SPEAKER = 1;
    public static final int AUDIO_OUTPUT_DEFAULT = 0;
    public static final int AUTH_CONTEXT_EAP_SIM = 128;
    public static final int AUTH_CONTEXT_EAP_AKA = 129;
    public static final int AUTH_CONTEXT_GBA_BOOTSTRAP = 132;
    public static final int AUTHTYPE_GBA_NAF_KEY_EXTERNAL = 133;
    public static final int AUTH_CONTEXT_UNDEFINED = -1;
    public static final int CELL_OFF_FLAG = 0;
    public static final int CELL_ON_FLAG = 1;
    public static final int CELL_OFF_DUE_TO_AIRPLANE_MODE_FLAG = 2;
    public static final java.lang.String EXTRA_DIAL_DOMAIN = "dial_domain";
    public static final int DOMAIN_NON_3GPP_PS = 4;
    public static final java.lang.String EXTRA_COMPARE_DOMAIN = "compare_domain";
    public static final java.lang.String EXTRA_EMERGENCY_SERVICE_CATEGORY = "emergency_service_category";
    public PhoneConstants() {}

    public static enum CardUnavailableReason {
        REASON_CARD_REMOVED,
        REASON_RADIO_UNAVAILABLE,
        REASON_SIM_REFRESH_RESET;
    }

    public static enum DataState {
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        SUSPENDED,
        DISCONNECTING;
    }

    public static enum State {
        IDLE,
        RINGING,
        OFFHOOK;
    }
}

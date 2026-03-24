package android.telephony;

public class TelephonyManager {
    public static final java.lang.String MODEM_ACTIVITY_RESULT_KEY = "controller_activity";
    public static final java.lang.String EXCEPTION_RESULT_KEY = "exception";
    public static final java.lang.String PHONE_PROCESS_NAME = "com.android.phone";
    public static final int NETWORK_SELECTION_MODE_UNKNOWN = 0;
    public static final int NETWORK_SELECTION_MODE_AUTO = 1;
    public static final int NETWORK_SELECTION_MODE_MANUAL = 2;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_REASON_USER = 0;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_REASON_THERMAL = 1;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_REASON_CARRIER = 2;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_REASON_NEARBY_DEVICE = 3;
    public static final int OTASP_UNINITIALIZED = 0;
    public static final int OTASP_UNKNOWN = 1;
    public static final int OTASP_NEEDED = 2;
    public static final int OTASP_NOT_NEEDED = 3;
    public static final int OTASP_SIM_UNPROVISIONED = 5;
    @android.annotation.SystemApi
    public static final int KEY_TYPE_EPDG = 1;
    @android.annotation.SystemApi
    public static final int KEY_TYPE_WLAN = 2;
    @android.annotation.SystemApi
    public static final int SRVCC_STATE_HANDOVER_NONE = -1;
    @android.annotation.SystemApi
    public static final int SRVCC_STATE_HANDOVER_STARTED = 0;
    @android.annotation.SystemApi
    public static final int SRVCC_STATE_HANDOVER_COMPLETED = 1;
    @android.annotation.SystemApi
    public static final int SRVCC_STATE_HANDOVER_FAILED = 2;
    @android.annotation.SystemApi
    public static final int SRVCC_STATE_HANDOVER_CANCELED = 3;
    public static final int UNSUPPORTED_CARD_ID = -1;
    public static final int UNINITIALIZED_CARD_ID = -2;
    public static final int DEFAULT_PORT_INDEX = 0;
    public static final int INVALID_PORT_INDEX = -1;
    public static final java.lang.String PROPERTY_ENABLE_NULL_CIPHER_TOGGLE = "enable_null_cipher_toggle";
    public static final java.lang.String CACHE_KEY_PHONE_ACCOUNT_TO_SUBID = "cache_key.telephony.phone_account_to_subid";
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final java.lang.String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
    public static final java.lang.String ACTION_RESPOND_VIA_MESSAGE = "android.intent.action.RESPOND_VIA_MESSAGE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_EMERGENCY_ASSISTANCE = "android.telephony.action.EMERGENCY_ASSISTANCE";
    public static final java.lang.String METADATA_HIDE_VOICEMAIL_SETTINGS_MENU = "android.telephony.HIDE_VOICEMAIL_SETTINGS_MENU";
    public static final java.lang.String ACTION_CONFIGURE_VOICEMAIL = "android.telephony.action.CONFIGURE_VOICEMAIL";
    public static final java.lang.String EXTRA_HIDE_PUBLIC_SETTINGS = "android.telephony.extra.HIDE_PUBLIC_SETTINGS";
    public static final boolean EMERGENCY_ASSISTANCE_ENABLED = true;
    public static final java.lang.String EXTRA_STATE = "state";
    public static final java.lang.String EXTRA_STATE_IDLE = null;
    public static final java.lang.String EXTRA_STATE_RINGING = null;
    public static final java.lang.String EXTRA_STATE_OFFHOOK = null;
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_INCOMING_NUMBER = "incoming_number";
    public static final java.lang.String ACTION_CALL_DISCONNECT_CAUSE_CHANGED = "android.intent.action.CALL_DISCONNECT_CAUSE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DISCONNECT_CAUSE = "disconnect_cause";
    public static final java.lang.String EXTRA_PRECISE_DISCONNECT_CAUSE = "precise_disconnect_cause";
    public static final java.lang.String ACTION_SHOW_VOICEMAIL_NOTIFICATION = "android.telephony.action.SHOW_VOICEMAIL_NOTIFICATION";
    public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telephony.extra.PHONE_ACCOUNT_HANDLE";
    public static final java.lang.String EXTRA_NOTIFICATION_COUNT = "android.telephony.extra.NOTIFICATION_COUNT";
    public static final java.lang.String EXTRA_VOICEMAIL_NUMBER = "android.telephony.extra.VOICEMAIL_NUMBER";
    public static final java.lang.String EXTRA_CALL_VOICEMAIL_INTENT = "android.telephony.extra.CALL_VOICEMAIL_INTENT";
    public static final java.lang.String EXTRA_LAUNCH_VOICEMAIL_SETTINGS_INTENT = "android.telephony.extra.LAUNCH_VOICEMAIL_SETTINGS_INTENT";
    public static final java.lang.String EXTRA_IS_REFRESH = "android.telephony.extra.IS_REFRESH";
    public static final java.lang.String EVENT_HANDOVER_VIDEO_FROM_WIFI_TO_LTE = "android.telephony.event.EVENT_HANDOVER_VIDEO_FROM_WIFI_TO_LTE";
    public static final java.lang.String EVENT_HANDOVER_VIDEO_FROM_LTE_TO_WIFI = "android.telephony.event.EVENT_HANDOVER_VIDEO_FROM_LTE_TO_WIFI";
    public static final java.lang.String EVENT_HANDOVER_TO_WIFI_FAILED = "android.telephony.event.EVENT_HANDOVER_TO_WIFI_FAILED";
    public static final java.lang.String EVENT_DOWNGRADE_DATA_LIMIT_REACHED = "android.telephony.event.EVENT_DOWNGRADE_DATA_LIMIT_REACHED";
    public static final java.lang.String EVENT_DOWNGRADE_DATA_DISABLED = "android.telephony.event.EVENT_DOWNGRADE_DATA_DISABLED";
    public static final java.lang.String EVENT_NOTIFY_INTERNATIONAL_CALL_ON_WFC = "android.telephony.event.EVENT_NOTIFY_INTERNATIONAL_CALL_ON_WFC";
    public static final java.lang.String EVENT_CALL_FORWARDED = "android.telephony.event.EVENT_CALL_FORWARDED";
    public static final java.lang.String EVENT_SUPPLEMENTARY_SERVICE_NOTIFICATION = "android.telephony.event.EVENT_SUPPLEMENTARY_SERVICE_NOTIFICATION";
    public static final java.lang.String EXTRA_NOTIFICATION_TYPE = "android.telephony.extra.NOTIFICATION_TYPE";
    public static final java.lang.String EXTRA_NOTIFICATION_CODE = "android.telephony.extra.NOTIFICATION_CODE";
    public static final java.lang.String EXTRA_NOTIFICATION_MESSAGE = "android.telephony.extra.NOTIFICATION_MESSAGE";
    public static final java.lang.String VVM_TYPE_OMTP = "vvm_type_omtp";
    public static final java.lang.String VVM_TYPE_CVVM = "vvm_type_cvvm";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VISUAL_VOICEMAIL_ENABLED_BY_USER_BOOL = "android.telephony.extra.VISUAL_VOICEMAIL_ENABLED_BY_USER_BOOL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VOICEMAIL_SCRAMBLED_PIN_STRING = "android.telephony.extra.VOICEMAIL_SCRAMBLED_PIN_STRING";
    public static final java.lang.String ACTION_MULTI_SIM_CONFIG_CHANGED = "android.telephony.action.MULTI_SIM_CONFIG_CHANGED";
    public static final java.lang.String EXTRA_ACTIVE_SIM_SUPPORTED_COUNT = "android.telephony.extra.ACTIVE_SIM_SUPPORTED_COUNT";
    public static final java.lang.String USSD_RESPONSE = "USSD_RESPONSE";
    public static final int USSD_RETURN_SUCCESS = 100;
    public static final int USSD_RETURN_FAILURE = -1;
    public static final int USSD_ERROR_SERVICE_UNAVAIL = -2;
    public static final int CDMA_ROAMING_MODE_RADIO_DEFAULT = -1;
    public static final int CDMA_ROAMING_MODE_HOME = 0;
    public static final int CDMA_ROAMING_MODE_AFFILIATED = 1;
    public static final int CDMA_ROAMING_MODE_ANY = 2;
    public static final int UNKNOWN_CARRIER_ID = -1;
    public static final int UNKNOWN_CARRIER_ID_LIST_VERSION = -1;
    public static final java.lang.String ACTION_SUBSCRIPTION_CARRIER_IDENTITY_CHANGED = "android.telephony.action.SUBSCRIPTION_CARRIER_IDENTITY_CHANGED";
    public static final java.lang.String EXTRA_CARRIER_ID = "android.telephony.extra.CARRIER_ID";
    public static final java.lang.String EXTRA_CARRIER_NAME = "android.telephony.extra.CARRIER_NAME";
    public static final java.lang.String ACTION_SUBSCRIPTION_SPECIFIC_CARRIER_IDENTITY_CHANGED = "android.telephony.action.SUBSCRIPTION_SPECIFIC_CARRIER_IDENTITY_CHANGED";
    public static final java.lang.String EXTRA_SPECIFIC_CARRIER_ID = "android.telephony.extra.SPECIFIC_CARRIER_ID";
    public static final java.lang.String EXTRA_SPECIFIC_CARRIER_NAME = "android.telephony.extra.SPECIFIC_CARRIER_NAME";
    public static final java.lang.String EXTRA_SUBSCRIPTION_ID = "android.telephony.extra.SUBSCRIPTION_ID";
    public static final java.lang.String ACTION_SERVICE_PROVIDERS_UPDATED = "android.telephony.action.SERVICE_PROVIDERS_UPDATED";
    public static final java.lang.String EXTRA_SHOW_PLMN = "android.telephony.extra.SHOW_PLMN";
    public static final java.lang.String EXTRA_PLMN = "android.telephony.extra.PLMN";
    public static final java.lang.String EXTRA_SHOW_SPN = "android.telephony.extra.SHOW_SPN";
    public static final java.lang.String EXTRA_SPN = "android.telephony.extra.SPN";
    public static final java.lang.String EXTRA_DATA_SPN = "android.telephony.extra.DATA_SPN";
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final java.lang.String ACTION_DATA_STALL_DETECTED = "android.intent.action.DATA_STALL_DETECTED";
    public static final java.lang.String ACTION_CARRIER_MESSAGING_CLIENT_SERVICE = "android.telephony.action.CARRIER_MESSAGING_CLIENT_SERVICE";
    public static final java.lang.String EXTRA_RECOVERY_ACTION = "recoveryAction";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final java.lang.String ACTION_ANOMALY_REPORTED = "android.telephony.action.ANOMALY_REPORTED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ANOMALY_ID = "android.telephony.extra.ANOMALY_ID";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ANOMALY_DESCRIPTION = "android.telephony.extra.ANOMALY_DESCRIPTION";
    public static final java.lang.String ACTION_PRIMARY_SUBSCRIPTION_LIST_CHANGED = "android.telephony.action.PRIMARY_SUBSCRIPTION_LIST_CHANGED";
    public static final java.lang.String EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE = "android.telephony.extra.DEFAULT_SUBSCRIPTION_SELECT_TYPE";
    public static final int EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE_NONE = 0;
    public static final int EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE_DATA = 1;
    public static final int EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE_VOICE = 2;
    public static final int EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE_SMS = 3;
    public static final int EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE_ALL = 4;
    public static final int EXTRA_DEFAULT_SUBSCRIPTION_SELECT_TYPE_DISMISS = 5;
    public static final java.lang.String EXTRA_SIM_COMBINATION_WARNING_TYPE = "android.telephony.extra.SIM_COMBINATION_WARNING_TYPE";
    public static final int EXTRA_SIM_COMBINATION_WARNING_TYPE_NONE = 0;
    public static final int EXTRA_SIM_COMBINATION_WARNING_TYPE_DUAL_CDMA = 1;
    public static final java.lang.String EXTRA_SIM_COMBINATION_NAMES = "android.telephony.extra.SIM_COMBINATION_NAMES";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_EMERGENCY_CALLBACK_MODE_CHANGED = "android.intent.action.EMERGENCY_CALLBACK_MODE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PHONE_IN_ECM_STATE = "android.telephony.extra.PHONE_IN_ECM_STATE";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_REDIRECTED = "android.telephony.action.CARRIER_SIGNAL_REDIRECTED";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_REQUEST_NETWORK_FAILED = "android.telephony.action.CARRIER_SIGNAL_REQUEST_NETWORK_FAILED";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_PCO_VALUE = "android.telephony.action.CARRIER_SIGNAL_PCO_VALUE";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE = "android.telephony.action.CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_RESET = "android.telephony.action.CARRIER_SIGNAL_RESET";
    public static final java.lang.String EXTRA_REDIRECTION_URL = "android.telephony.extra.REDIRECTION_URL";
    public static final java.lang.String EXTRA_DATA_FAIL_CAUSE = "android.telephony.extra.DATA_FAIL_CAUSE";
    public static final java.lang.String EXTRA_APN_TYPE = "android.telephony.extra.APN_TYPE";
    public static final java.lang.String EXTRA_APN_PROTOCOL = "android.telephony.extra.APN_PROTOCOL";
    public static final java.lang.String EXTRA_PCO_ID = "android.telephony.extra.PCO_ID";
    public static final java.lang.String EXTRA_PCO_VALUE = "android.telephony.extra.PCO_VALUE";
    public static final java.lang.String EXTRA_DEFAULT_NETWORK_AVAILABLE = "android.telephony.extra.DEFAULT_NETWORK_AVAILABLE";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_EMERGENCY_CALL_STATE_CHANGED = "android.intent.action.EMERGENCY_CALL_STATE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PHONE_IN_EMERGENCY_CALL = "android.telephony.extra.PHONE_IN_EMERGENCY_CALL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SHOW_NOTICE_ECM_BLOCK_OTHERS = "android.telephony.action.SHOW_NOTICE_ECM_BLOCK_OTHERS";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_REQUEST_OMADM_CONFIGURATION_UPDATE = "com.android.omadm.service.CONFIGURATION_UPDATE";
    public static final int PHONE_TYPE_NONE = 0;
    public static final int PHONE_TYPE_GSM = 1;
    public static final int PHONE_TYPE_CDMA = 2;
    public static final int PHONE_TYPE_SIP = 3;
    public static final int PHONE_TYPE_IMS = 5;
    public static final int PHONE_TYPE_THIRD_PARTY = 4;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_GPRS = 1;
    public static final int NETWORK_TYPE_EDGE = 2;
    public static final int NETWORK_TYPE_UMTS = 3;
    public static final int NETWORK_TYPE_CDMA = 4;
    public static final int NETWORK_TYPE_EVDO_0 = 5;
    public static final int NETWORK_TYPE_EVDO_A = 6;
    public static final int NETWORK_TYPE_1xRTT = 7;
    public static final int NETWORK_TYPE_HSDPA = 8;
    public static final int NETWORK_TYPE_HSUPA = 9;
    public static final int NETWORK_TYPE_HSPA = 10;
    @java.lang.Deprecated
    public static final int NETWORK_TYPE_IDEN = 11;
    public static final int NETWORK_TYPE_EVDO_B = 12;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_GSM = 16;
    public static final int NETWORK_TYPE_TD_SCDMA = 17;
    public static final int NETWORK_TYPE_IWLAN = 18;
    public static final int NETWORK_TYPE_LTE_CA = 19;
    public static final int NETWORK_TYPE_NR = 20;
    public static final int SIM_STATE_UNKNOWN = 0;
    public static final int SIM_STATE_ABSENT = 1;
    public static final int SIM_STATE_PIN_REQUIRED = 2;
    public static final int SIM_STATE_PUK_REQUIRED = 3;
    public static final int SIM_STATE_NETWORK_LOCKED = 4;
    public static final int SIM_STATE_READY = 5;
    public static final int SIM_STATE_NOT_READY = 6;
    public static final int SIM_STATE_PERM_DISABLED = 7;
    public static final int SIM_STATE_CARD_IO_ERROR = 8;
    public static final int SIM_STATE_CARD_RESTRICTED = 9;
    @android.annotation.SystemApi
    public static final int SIM_STATE_LOADED = 10;
    @android.annotation.SystemApi
    public static final int SIM_STATE_PRESENT = 11;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SIM_STATE = "android.telephony.extra.SIM_STATE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SIM_CARD_STATE_CHANGED = "android.telephony.action.SIM_CARD_STATE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SIM_APPLICATION_STATE_CHANGED = "android.telephony.action.SIM_APPLICATION_STATE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SIM_SLOT_STATUS_CHANGED = "android.telephony.action.SIM_SLOT_STATUS_CHANGED";
    public static final java.lang.String ACTION_SECRET_CODE = "android.telephony.action.SECRET_CODE";
    public static final java.lang.String KEY_CALL_COMPOSER_PICTURE_HANDLE = "call_composer_picture_handle";
    @android.annotation.SystemApi
    public static final int SIM_ACTIVATION_STATE_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int SIM_ACTIVATION_STATE_ACTIVATING = 1;
    @android.annotation.SystemApi
    public static final int SIM_ACTIVATION_STATE_ACTIVATED = 2;
    @android.annotation.SystemApi
    public static final int SIM_ACTIVATION_STATE_DEACTIVATED = 3;
    @android.annotation.SystemApi
    public static final int SIM_ACTIVATION_STATE_RESTRICTED = 4;
    public static final int CALL_STATE_IDLE = 0;
    public static final int CALL_STATE_RINGING = 1;
    public static final int CALL_STATE_OFFHOOK = 2;
    public static final int DATA_ACTIVITY_NONE = 0;
    public static final int DATA_ACTIVITY_IN = 1;
    public static final int DATA_ACTIVITY_OUT = 2;
    public static final int DATA_ACTIVITY_INOUT = 3;
    public static final int DATA_ACTIVITY_DORMANT = 4;
    public static final int DATA_UNKNOWN = -1;
    public static final int DATA_DISCONNECTED = 0;
    public static final int DATA_CONNECTING = 1;
    public static final int DATA_CONNECTED = 2;
    public static final int DATA_SUSPENDED = 3;
    public static final int DATA_DISCONNECTING = 4;
    public static final int DATA_HANDOVER_IN_PROGRESS = 5;
    public static final int ERI_ON = 0;
    public static final int ERI_OFF = 1;
    public static final int ERI_FLASH = 2;
    public static final int ERI_ICON_MODE_NORMAL = 0;
    public static final int ERI_ICON_MODE_FLASH = 1;
    public static final int APPTYPE_UNKNOWN = 0;
    public static final int APPTYPE_SIM = 1;
    public static final int APPTYPE_USIM = 2;
    public static final int APPTYPE_RUIM = 3;
    public static final int APPTYPE_CSIM = 4;
    public static final int APPTYPE_ISIM = 5;
    public static final int AUTHTYPE_EAP_SIM = 128;
    public static final int AUTHTYPE_EAP_AKA = 129;
    public static final int AUTHTYPE_GBA_BOOTSTRAP = 132;
    public static final int AUTHTYPE_GBA_NAF_KEY_EXTERNAL = 133;
    public static final int NETWORK_MODE_WCDMA_PREF = 0;
    public static final int NETWORK_MODE_GSM_ONLY = 1;
    public static final int NETWORK_MODE_WCDMA_ONLY = 2;
    public static final int NETWORK_MODE_GSM_UMTS = 3;
    public static final int NETWORK_MODE_CDMA_EVDO = 4;
    public static final int NETWORK_MODE_CDMA_NO_EVDO = 5;
    public static final int NETWORK_MODE_EVDO_NO_CDMA = 6;
    public static final int NETWORK_MODE_GLOBAL = 7;
    public static final int NETWORK_MODE_LTE_CDMA_EVDO = 8;
    public static final int NETWORK_MODE_LTE_GSM_WCDMA = 9;
    public static final int NETWORK_MODE_LTE_CDMA_EVDO_GSM_WCDMA = 10;
    public static final int NETWORK_MODE_LTE_ONLY = 11;
    public static final int NETWORK_MODE_LTE_WCDMA = 12;
    public static final int NETWORK_MODE_TDSCDMA_ONLY = 13;
    public static final int NETWORK_MODE_TDSCDMA_WCDMA = 14;
    public static final int NETWORK_MODE_LTE_TDSCDMA = 15;
    public static final int NETWORK_MODE_TDSCDMA_GSM = 16;
    public static final int NETWORK_MODE_LTE_TDSCDMA_GSM = 17;
    public static final int NETWORK_MODE_TDSCDMA_GSM_WCDMA = 18;
    public static final int NETWORK_MODE_LTE_TDSCDMA_WCDMA = 19;
    public static final int NETWORK_MODE_LTE_TDSCDMA_GSM_WCDMA = 20;
    public static final int NETWORK_MODE_TDSCDMA_CDMA_EVDO_GSM_WCDMA = 21;
    public static final int NETWORK_MODE_LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA = 22;
    public static final int NETWORK_MODE_NR_ONLY = 23;
    public static final int NETWORK_MODE_NR_LTE = 24;
    public static final int NETWORK_MODE_NR_LTE_CDMA_EVDO = 25;
    public static final int NETWORK_MODE_NR_LTE_GSM_WCDMA = 26;
    public static final int NETWORK_MODE_NR_LTE_CDMA_EVDO_GSM_WCDMA = 27;
    public static final int NETWORK_MODE_NR_LTE_WCDMA = 28;
    public static final int NETWORK_MODE_NR_LTE_TDSCDMA = 29;
    public static final int NETWORK_MODE_NR_LTE_TDSCDMA_GSM = 30;
    public static final int NETWORK_MODE_NR_LTE_TDSCDMA_WCDMA = 31;
    public static final int NETWORK_MODE_NR_LTE_TDSCDMA_GSM_WCDMA = 32;
    public static final int NETWORK_MODE_NR_LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA = 33;
    public static final int DEFAULT_PREFERRED_NETWORK_MODE = Integer.valueOf(0);
    public static final int ALLOWED_NETWORK_TYPES_REASON_USER = 0;
    @android.annotation.SystemApi
    public static final int ALLOWED_NETWORK_TYPES_REASON_POWER = 1;
    public static final int ALLOWED_NETWORK_TYPES_REASON_CARRIER = 2;
    @android.annotation.SystemApi
    public static final int ALLOWED_NETWORK_TYPES_REASON_ENABLE_2G = 3;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_HAS_ACCESS = 1;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_NO_ACCESS = 0;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_RULES_NOT_LOADED = -1;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_ERROR_LOADING_RULES = -2;
    public static final int CALL_COMPOSER_STATUS_OFF = 0;
    public static final int CALL_COMPOSER_STATUS_ON = 1;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_OFF = 0;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_ON = 1;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_UNAVAILABLE = 2;
    @android.annotation.SystemApi
    public static final int CDMA_SUBSCRIPTION_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int CDMA_SUBSCRIPTION_RUIM_SIM = 0;
    @android.annotation.SystemApi
    public static final int CDMA_SUBSCRIPTION_NV = 1;
    public static final int CARD_POWER_DOWN = 0;
    public static final int CARD_POWER_UP = 1;
    public static final int CARD_POWER_UP_PASS_THROUGH = 2;
    @android.annotation.SystemApi
    public static final int SET_CARRIER_RESTRICTION_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int SET_CARRIER_RESTRICTION_NOT_SUPPORTED = 1;
    @android.annotation.SystemApi
    public static final int SET_CARRIER_RESTRICTION_ERROR = 2;
    @android.annotation.SystemApi
    public static final int SET_SIM_POWER_STATE_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int SET_SIM_POWER_STATE_ALREADY_IN_STATE = 1;
    @android.annotation.SystemApi
    public static final int SET_SIM_POWER_STATE_MODEM_ERROR = 2;
    @android.annotation.SystemApi
    public static final int SET_SIM_POWER_STATE_SIM_ERROR = 3;
    @android.annotation.SystemApi
    public static final int SET_SIM_POWER_STATE_NOT_SUPPORTED = 4;
    public static final int CARRIER_RESTRICTION_STATUS_UNKNOWN = 0;
    public static final int CARRIER_RESTRICTION_STATUS_NOT_RESTRICTED = 1;
    public static final int CARRIER_RESTRICTION_STATUS_RESTRICTED = 2;
    public static final int CARRIER_RESTRICTION_STATUS_RESTRICTED_TO_CALLER = 3;
    public static final int ENABLE_VONR_SUCCESS = 0;
    public static final int ENABLE_VONR_RADIO_NOT_AVAILABLE = 2;
    public static final int ENABLE_VONR_RADIO_ERROR = 3;
    public static final int ENABLE_VONR_RADIO_INVALID_STATE = 4;
    public static final int ENABLE_VONR_REQUEST_NOT_SUPPORTED = 5;
    public static final int DATA_ENABLED_REASON_UNKNOWN = -1;
    public static final int DATA_ENABLED_REASON_USER = 0;
    public static final int DATA_ENABLED_REASON_POLICY = 1;
    public static final int DATA_ENABLED_REASON_CARRIER = 2;
    public static final int DATA_ENABLED_REASON_THERMAL = 3;
    public static final int DATA_ENABLED_REASON_OVERRIDE = 4;
    public static final int INDICATION_FILTER_SIGNAL_STRENGTH = 1;
    public static final int INDICATION_FILTER_FULL_NETWORK_STATE = 2;
    public static final int INDICATION_FILTER_DATA_CALL_DORMANCY_CHANGED = 4;
    public static final int INDICATION_FILTER_LINK_CAPACITY_ESTIMATE = 8;
    public static final int INDICATION_FILTER_PHYSICAL_CHANNEL_CONFIG = 16;
    public static final long NETWORK_TYPE_BITMASK_UNKNOWN = 0L;
    public static final long NETWORK_TYPE_BITMASK_GSM = 32768L;
    public static final long NETWORK_TYPE_BITMASK_GPRS = 1L;
    public static final long NETWORK_TYPE_BITMASK_EDGE = 2L;
    public static final long NETWORK_TYPE_BITMASK_CDMA = 8L;
    @android.annotation.SuppressLint("AllUpper")
    public static final long NETWORK_TYPE_BITMASK_1xRTT = 64L;
    public static final long NETWORK_TYPE_BITMASK_EVDO_0 = 16L;
    public static final long NETWORK_TYPE_BITMASK_EVDO_A = 32L;
    public static final long NETWORK_TYPE_BITMASK_EVDO_B = 2048L;
    public static final long NETWORK_TYPE_BITMASK_EHRPD = 8192L;
    public static final long NETWORK_TYPE_BITMASK_HSUPA = 256L;
    public static final long NETWORK_TYPE_BITMASK_HSDPA = 128L;
    public static final long NETWORK_TYPE_BITMASK_HSPA = 512L;
    public static final long NETWORK_TYPE_BITMASK_IDEN = 1024L;
    public static final long NETWORK_TYPE_BITMASK_HSPAP = 16384L;
    public static final long NETWORK_TYPE_BITMASK_UMTS = 4L;
    public static final long NETWORK_TYPE_BITMASK_TD_SCDMA = 65536L;
    public static final long NETWORK_TYPE_BITMASK_LTE = 4096L;
    @java.lang.Deprecated
    public static final long NETWORK_TYPE_BITMASK_LTE_CA = 262144L;
    public static final long NETWORK_TYPE_BITMASK_NR = 524288L;
    public static final long NETWORK_TYPE_BITMASK_IWLAN = 131072L;
    public static final long NETWORK_CLASS_BITMASK_2G = 32843L;
    public static final long NETWORK_CLASS_BITMASK_3G = 93108L;
    public static final long NETWORK_CLASS_BITMASK_4G = 397312L;
    public static final long NETWORK_CLASS_BITMASK_5G = 524288L;
    public static final long NETWORK_STANDARDS_FAMILY_BITMASK_3GPP = 906119L;
    public static final long NETWORK_STANDARDS_FAMILY_BITMASK_3GPP2 = 10360L;
    @android.annotation.SystemApi
    public static final int INVALID_EMERGENCY_NUMBER_DB_VERSION = -1;
    public static final int SET_OPPORTUNISTIC_SUB_SUCCESS = 0;
    public static final int SET_OPPORTUNISTIC_SUB_VALIDATION_FAILED = 1;
    public static final int SET_OPPORTUNISTIC_SUB_INACTIVE_SUBSCRIPTION = 2;
    public static final int SET_OPPORTUNISTIC_SUB_NO_OPPORTUNISTIC_SUB_AVAILABLE = 3;
    public static final int SET_OPPORTUNISTIC_SUB_REMOTE_SERVICE_EXCEPTION = 4;
    public static final int UPDATE_AVAILABLE_NETWORKS_SUCCESS = 0;
    public static final int UPDATE_AVAILABLE_NETWORKS_UNKNOWN_FAILURE = 1;
    public static final int UPDATE_AVAILABLE_NETWORKS_ABORTED = 2;
    public static final int UPDATE_AVAILABLE_NETWORKS_INVALID_ARGUMENTS = 3;
    public static final int UPDATE_AVAILABLE_NETWORKS_NO_CARRIER_PRIVILEGE = 4;
    public static final int UPDATE_AVAILABLE_NETWORKS_DISABLE_MODEM_FAIL = 5;
    public static final int UPDATE_AVAILABLE_NETWORKS_ENABLE_MODEM_FAIL = 6;
    public static final int UPDATE_AVAILABLE_NETWORKS_MULTIPLE_NETWORKS_NOT_SUPPORTED = 7;
    public static final int UPDATE_AVAILABLE_NETWORKS_NO_OPPORTUNISTIC_SUB_AVAILABLE = 8;
    public static final int UPDATE_AVAILABLE_NETWORKS_REMOTE_SERVICE_EXCEPTION = 9;
    public static final int UPDATE_AVAILABLE_NETWORKS_SERVICE_IS_DISABLED = 10;
    public static final int UPDATE_AVAILABLE_NETWORKS_SIM_PORT_NOT_AVAILABLE = 11;
    public static final java.lang.String ACTION_NETWORK_COUNTRY_CHANGED = "android.telephony.action.NETWORK_COUNTRY_CHANGED";
    public static final java.lang.String EXTRA_NETWORK_COUNTRY = "android.telephony.extra.NETWORK_COUNTRY";
    public static final java.lang.String EXTRA_LAST_KNOWN_NETWORK_COUNTRY = "android.telephony.extra.LAST_KNOWN_NETWORK_COUNTRY";
    public static final int MULTISIM_ALLOWED = 0;
    public static final int MULTISIM_NOT_SUPPORTED_BY_HARDWARE = 1;
    public static final int MULTISIM_NOT_SUPPORTED_BY_CARRIER = 2;
    public static final int HAL_SERVICE_RADIO = 0;
    public static final int HAL_SERVICE_DATA = 1;
    public static final int HAL_SERVICE_MESSAGING = 2;
    public static final int HAL_SERVICE_MODEM = 3;
    public static final int HAL_SERVICE_NETWORK = 4;
    public static final int HAL_SERVICE_SIM = 5;
    public static final int HAL_SERVICE_VOICE = 6;
    public static final int HAL_SERVICE_IMS = 7;
    public static final android.util.Pair HAL_VERSION_UNKNOWN = null;
    public static final android.util.Pair HAL_VERSION_UNSUPPORTED = null;
    @android.annotation.SystemApi
    public static final int CALL_WAITING_STATUS_ENABLED = 1;
    @android.annotation.SystemApi
    public static final int CALL_WAITING_STATUS_DISABLED = 2;
    @android.annotation.SystemApi
    public static final int CALL_WAITING_STATUS_UNKNOWN_ERROR = 3;
    @android.annotation.SystemApi
    public static final int CALL_WAITING_STATUS_NOT_SUPPORTED = 4;
    @android.annotation.SystemApi
    public static final int CALL_WAITING_STATUS_FDN_CHECK_FAILURE = 5;
    @android.annotation.SystemApi
    public static final int MOBILE_DATA_POLICY_DATA_ON_NON_DEFAULT_DURING_VOICE_CALL = 1;
    @android.annotation.SystemApi
    public static final int MOBILE_DATA_POLICY_MMS_ALWAYS_ALLOWED = 2;
    @android.annotation.SystemApi
    public static final int MOBILE_DATA_POLICY_AUTO_DATA_SWITCH = 3;
    public static final int CHANGE_ICC_LOCK_SUCCESS = 2147483647;
    @android.annotation.SystemApi
    public static final int ENABLE_NR_DUAL_CONNECTIVITY_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int ENABLE_NR_DUAL_CONNECTIVITY_NOT_SUPPORTED = 1;
    @android.annotation.SystemApi
    public static final int ENABLE_NR_DUAL_CONNECTIVITY_RADIO_NOT_AVAILABLE = 2;
    @android.annotation.SystemApi
    public static final int ENABLE_NR_DUAL_CONNECTIVITY_RADIO_ERROR = 3;
    @android.annotation.SystemApi
    public static final int ENABLE_NR_DUAL_CONNECTIVITY_INVALID_STATE = 4;
    @android.annotation.SystemApi
    public static final int NR_DUAL_CONNECTIVITY_ENABLE = 1;
    @android.annotation.SystemApi
    public static final int NR_DUAL_CONNECTIVITY_DISABLE = 2;
    @android.annotation.SystemApi
    public static final int NR_DUAL_CONNECTIVITY_DISABLE_IMMEDIATE = 3;
    @android.annotation.SystemApi
    public static final java.lang.String CAPABILITY_SECONDARY_LINK_BANDWIDTH_VISIBLE = "CAPABILITY_SECONDARY_LINK_BANDWIDTH_VISIBLE";
    @android.annotation.SystemApi
    public static final java.lang.String CAPABILITY_USES_ALLOWED_NETWORK_TYPES_BITMASK = "CAPABILITY_USES_ALLOWED_NETWORK_TYPES_BITMASK";
    @android.annotation.SystemApi
    public static final java.lang.String CAPABILITY_NR_DUAL_CONNECTIVITY_CONFIGURATION_AVAILABLE = "CAPABILITY_NR_DUAL_CONNECTIVITY_CONFIGURATION_AVAILABLE";
    @android.annotation.SystemApi
    public static final java.lang.String CAPABILITY_THERMAL_MITIGATION_DATA_THROTTLING = "CAPABILITY_THERMAL_MITIGATION_DATA_THROTTLING";
    public static final java.lang.String CAPABILITY_SLICING_CONFIG_SUPPORTED = "CAPABILITY_SLICING_CONFIG_SUPPORTED";
    public static final java.lang.String CAPABILITY_PHYSICAL_CHANNEL_CONFIG_1_6_SUPPORTED = "CAPABILITY_PHYSICAL_CHANNEL_CONFIG_1_6_SUPPORTED";
    public static final java.lang.String CAPABILITY_SIM_PHONEBOOK_IN_MODEM = "CAPABILITY_SIM_PHONEBOOK_IN_MODEM";
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_RESULT_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_RESULT_MODEM_ERROR = 1;
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_RESULT_MODEM_NOT_AVAILABLE = 2;
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_RESULT_INVALID_STATE = 3;
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_RESULT_UNKNOWN_ERROR = 4;
    public static final int INCLUDE_LOCATION_DATA_NONE = 0;
    public static final int INCLUDE_LOCATION_DATA_COARSE = 1;
    public static final int INCLUDE_LOCATION_DATA_FINE = 2;
    @android.annotation.SystemApi
    public static final int GBA_FAILURE_REASON_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int GBA_FAILURE_REASON_FEATURE_NOT_SUPPORTED = 1;
    @android.annotation.SystemApi
    public static final int GBA_FAILURE_REASON_FEATURE_NOT_READY = 2;
    @android.annotation.SystemApi
    public static final int GBA_FAILURE_REASON_NETWORK_FAILURE = 3;
    @android.annotation.SystemApi
    public static final int GBA_FAILURE_REASON_INCORRECT_NAF_ID = 4;
    @android.annotation.SystemApi
    public static final int GBA_FAILURE_REASON_SECURITY_PROTOCOL_NOT_SUPPORTED = 5;
    @android.annotation.SystemApi
    public static final int PREPARE_UNATTENDED_REBOOT_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int PREPARE_UNATTENDED_REBOOT_PIN_REQUIRED = 1;
    @android.annotation.SystemApi
    public static final int PREPARE_UNATTENDED_REBOOT_ERROR = 2;
    public static final java.lang.String KEY_SLICING_CONFIG_HANDLE = "slicing_config_handle";
    public static final int PREMIUM_CAPABILITY_PRIORITIZE_LATENCY = 34;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_SUCCESS = 1;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_THROTTLED = 2;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_ALREADY_PURCHASED = 3;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_ALREADY_IN_PROGRESS = 4;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_NOT_FOREGROUND = 5;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_USER_CANCELED = 6;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_CARRIER_DISABLED = 7;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_CARRIER_ERROR = 8;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_TIMEOUT = 9;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_FEATURE_NOT_SUPPORTED = 10;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_REQUEST_FAILED = 11;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_NETWORK_NOT_AVAILABLE = 12;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_ENTITLEMENT_CHECK_FAILED = 13;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_NOT_DEFAULT_DATA_SUBSCRIPTION = 14;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_PENDING_NETWORK_SETUP = 15;
    @android.annotation.SystemApi
    public static final int CELL_BROADCAST_RESULT_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int CELL_BROADCAST_RESULT_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int CELL_BROADCAST_RESULT_UNSUPPORTED = 1;
    @android.annotation.SystemApi
    public static final int CELL_BROADCAST_RESULT_FAIL_CONFIG = 2;
    @android.annotation.SystemApi
    public static final int CELL_BROADCAST_RESULT_FAIL_ACTIVATION = 3;
    public static final int EMERGENCY_CALLBACK_MODE_CALL = 1;
    public static final int EMERGENCY_CALLBACK_MODE_SMS = 2;
    public static final int STOP_REASON_UNKNOWN = 0;
    public static final int STOP_REASON_OUTGOING_NORMAL_CALL_INITIATED = 1;
    public static final int STOP_REASON_NORMAL_SMS_SENT = 2;
    public static final int STOP_REASON_OUTGOING_EMERGENCY_CALL_INITIATED = 3;
    public static final int STOP_REASON_EMERGENCY_SMS_SENT = 4;
    public static final int STOP_REASON_TIMER_EXPIRED = 5;
    public static final int STOP_REASON_USER_ACTION = 6;
    public static java.lang.String srvccStateToString(int p0) { return null; }
    public TelephonyManager(android.content.Context p0) {}
    public TelephonyManager(android.content.Context p0, int p1) {}
    @java.lang.Deprecated
    public static android.telephony.TelephonyManager getDefault() { return null; }
    public android.telephony.TelephonyManager.MultiSimVariants getMultiSimConfiguration() { return null; }
    @java.lang.Deprecated
    public int getPhoneCount() { return 0; }
    public int getActiveModemCount() { return 0; }
    public int getSupportedModemCount() { return 0; }
    @android.annotation.SystemApi
    public int getMaxNumberOfSimultaneouslyActiveSims() { return 0; }
    public static android.telephony.TelephonyManager from(android.content.Context p0) { return null; }
    public android.telephony.TelephonyManager createForSubscriptionId(int p0) { return null; }
    public android.telephony.TelephonyManager createForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
    public boolean isMultiSimEnabled() { return false; }
    public static long getMaximumCallComposerPictureSize() { return 0L; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public java.lang.String getDeviceSoftwareVersion() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getDeviceSoftwareVersion(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getDeviceId() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getDeviceId(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getImei() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getImei(int p0) { return null; }
    public java.lang.String getTypeAllocationCode() { return null; }
    public java.lang.String getTypeAllocationCode(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getMeid() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getMeid(int p0) { return null; }
    public java.lang.String getManufacturerCode() { return null; }
    public java.lang.String getManufacturerCode(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getNai() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public android.telephony.CellLocation getCellLocation() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_COARSE_LOCATION")
    public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo() { return null; }
    @android.annotation.SystemApi
    public int getCurrentPhoneType() { return 0; }
    @android.annotation.SystemApi
    public int getCurrentPhoneType(int p0) { return 0; }
    public int getCurrentPhoneTypeForSlot(int p0) { return 0; }
    public int getPhoneType() { return 0; }
    public static int getPhoneType(int p0) { return 0; }
    @android.annotation.SystemApi
    public static long getMaxNumberVerificationTimeoutMillis() { return 0L; }
    public java.lang.String getNetworkOperatorName() { return null; }
    public java.lang.String getNetworkOperatorName(int p0) { return null; }
    public java.lang.String getNetworkOperator() { return null; }
    public java.lang.String getNetworkOperator(int p0) { return null; }
    public java.lang.String getNetworkOperatorForPhone(int p0) { return null; }
    public java.lang.String getNetworkSpecifier() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.os.PersistableBundle getCarrierConfig() { return null; }
    public boolean isNetworkRoaming() { return false; }
    public boolean isNetworkRoaming(int p0) { return false; }
    public java.lang.String getNetworkCountryIso() { return null; }
    public java.lang.String getNetworkCountryIso(int p0) { return null; }
    @java.lang.Deprecated
    public java.lang.String getNetworkCountryIsoForPhone(int p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static int[] getAllNetworkTypes() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getNetworkType() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getNetworkType(int p0) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public int getDataNetworkType() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getDataNetworkType(int p0) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public int getVoiceNetworkType() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getVoiceNetworkType(int p0) { return 0; }
    public java.lang.String getNetworkTypeName() { return null; }
    public static java.lang.String getNetworkTypeName(int p0) { return null; }
    public static long getBitMaskForNetworkType(int p0) { return 0L; }
    public boolean hasIccCard() { return false; }
    public boolean hasIccCard(int p0) { return false; }
    @android.telephony.TelephonyManager.SimState
    public int getSimState() { return 0; }
    @android.annotation.SystemApi
    @android.telephony.TelephonyManager.SimState
    public int getSimCardState() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    @android.telephony.TelephonyManager.SimState
    public int getSimCardState(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    @android.telephony.TelephonyManager.SimState
    public int getSimCardState(int p0, int p1) { return 0; }
    @android.annotation.SystemApi
    @android.telephony.TelephonyManager.SimState
    public int getSimApplicationState() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    @android.telephony.TelephonyManager.SimState
    public int getSimApplicationState(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    @android.telephony.TelephonyManager.SimState
    public int getSimApplicationState(int p0, int p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isApplicationOnUicc(int p0) { return false; }
    @android.telephony.TelephonyManager.SimState
    public int getSimState(int p0) { return 0; }
    public java.lang.String getSimOperator() { return null; }
    public java.lang.String getSimOperator(int p0) { return null; }
    public java.lang.String getSimOperatorNumeric() { return null; }
    public java.lang.String getSimOperatorNumeric(int p0) { return null; }
    public java.lang.String getSimOperatorNumericForPhone(int p0) { return null; }
    public java.lang.String getSimOperatorName() { return null; }
    public java.lang.String getSimOperatorName(int p0) { return null; }
    public java.lang.String getSimOperatorNameForPhone(int p0) { return null; }
    public java.lang.String getSimCountryIso() { return null; }
    public static java.lang.String getSimCountryIso(int p0) { return null; }
    public static java.lang.String getSimCountryIsoForPhone(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSimSerialNumber() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSimSerialNumber(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isLteCdmaEvdoGsmWcdmaEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getLteOnCdmaMode(int p0) { return 0; }
    public int getCardIdForDefaultEuicc() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void refreshUiccProfile() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean switchSlots(int[] p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSimSlotMapping(java.util.Collection<android.telephony.UiccSlotMapping> p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.Map<java.lang.Integer, java.lang.Integer> getLogicalToPhysicalSlotMapping() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.Collection<android.telephony.UiccSlotMapping> getSimSlotMapping() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSubscriberId() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSubscriberId(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void resetCarrierKeysForImsiEncryption() {}
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0) {}
    public void uploadCallComposerPicture(java.nio.file.Path p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.os.ParcelUuid, android.telephony.TelephonyManager.CallComposerException> p3) {}
    public void uploadCallComposerPicture(java.io.InputStream p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.os.ParcelUuid, android.telephony.TelephonyManager.CallComposerException> p3) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getGroupIdLevel1() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getGroupIdLevel1(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_PHONE_NUMBERS"})
    public java.lang.String getLine1Number() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_PHONE_NUMBERS"})
    public java.lang.String getLine1Number(int p0) { return null; }
    @java.lang.Deprecated
    public boolean setLine1NumberForDisplay(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean setLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getLine1AlphaTag() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getLine1AlphaTag(int p0) { return null; }
    @java.lang.Deprecated
    public java.lang.String[] getMergedSubscriberIds() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String[] getMergedImsisFromGroup() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_PHONE_NUMBERS"})
    public java.lang.String getMsisdn() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_PHONE_NUMBERS"})
    public java.lang.String getMsisdn(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getVoiceMailNumber() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getVoiceMailNumber(int p0) { return null; }
    public boolean setVoiceMailNumber(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.SuppressLint("RequiresPermission")
    public void setVisualVoicemailEnabled(android.telecom.PhoneAccountHandle p0, boolean p1) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint("RequiresPermission")
    public boolean isVisualVoicemailEnabled(android.telecom.PhoneAccountHandle p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public android.os.Bundle getVisualVoicemailSettings() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getVisualVoicemailPackageName() { return null; }
    public void setVisualVoicemailSmsFilterSettings(android.telephony.VisualVoicemailSmsFilterSettings p0) {}
    public void sendVisualVoicemailSms(java.lang.String p0, int p1, java.lang.String p2, android.app.PendingIntent p3) {}
    public void enableVisualVoicemailSmsFilter(int p0, android.telephony.VisualVoicemailSmsFilterSettings p1) {}
    public void disableVisualVoicemailSmsFilter(int p0) {}
    public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(int p0) { return null; }
    public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SEND_SMS")
    public void sendVisualVoicemailSmsForSubscriber(int p0, java.lang.String p1, int p2, java.lang.String p3, android.app.PendingIntent p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoiceActivationState(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setVoiceActivationState(int p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDataActivationState(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDataActivationState(int p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getVoiceActivationState() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getVoiceActivationState(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getDataActivationState() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getDataActivationState(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getVoiceMessageCount() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getVoiceMessageCount(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getVoiceMailAlphaTag() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getVoiceMailAlphaTag(int p0) { return null; }
    public void sendDialerSpecialCode(java.lang.String p0) {}
    public java.lang.String getIsimImpi() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_ICC_AUTH_WITH_DEVICE_IDENTIFIER")
    public java.lang.String getImsPrivateUserIdentity() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getIsimDomain() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String[] getIsimImpu() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_NUMBERS", "android.permission.READ_PRIVILEGED_PHONE_STATE"})
    public java.util.List<android.net.Uri> getImsPublicUserIdentities() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(value="android.permission.READ_PHONE_STATE", conditional=true)
    public int getCallState() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getCallStateForSubscription() { return 0; }
    @android.annotation.RequiresPermission(value="android.permission.READ_PHONE_STATE", conditional=true)
    public int getCallState(int p0) { return 0; }
    public int getDataActivity() { return 0; }
    public int getDataState() { return 0; }
    @java.lang.Deprecated
    public void listen(android.telephony.PhoneStateListener p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCdmaEnhancedRoamingIndicatorDisplayNumber() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCdmaEriIconIndex(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCdmaEriIconMode(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getCdmaEriText() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getCdmaEriText(int p0) { return null; }
    public boolean isVoiceCapable() { return false; }
    public boolean isSmsCapable() { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public java.util.List<android.telephony.CellInfo> getAllCellInfo() { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public void requestCellInfoUpdate(java.util.concurrent.Executor p0, android.telephony.TelephonyManager.CellInfoCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.MODIFY_PHONE_STATE"})
    public void requestCellInfoUpdate(android.os.WorkSource p0, java.util.concurrent.Executor p1, android.telephony.TelephonyManager.CellInfoCallback p2) {}
    public void setCellInfoListRate(int p0, int p1) {}
    public java.lang.String getMmsUserAgent() { return null; }
    public java.lang.String getMmsUAProfUrl() { return null; }
    @java.lang.Deprecated
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelBySlot(int p0, java.lang.String p1, int p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelByPort(int p0, int p1, java.lang.String p2, int p3) { return null; }
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String p0, int p1) { return null; }
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean iccCloseLogicalChannelBySlot(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void iccCloseLogicalChannelByPort(int p0, int p1, int p2) {}
    public boolean iccCloseLogicalChannel(int p0) { return false; }
    public boolean iccCloseLogicalChannel(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String iccTransmitApduLogicalChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) { return null; }
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String iccTransmitApduBasicChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) { return null; }
    public java.lang.String iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) { return null; }
    public java.lang.String iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) { return null; }
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public java.lang.String sendEnvelopeWithStatus(java.lang.String p0) { return null; }
    public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) { return null; }
    public java.lang.String nvReadItem(int p0) { return null; }
    public boolean nvWriteItem(int p0, java.lang.String p1) { return false; }
    public boolean nvWriteCdmaPrl(byte[] p0) { return false; }
    public boolean nvResetConfig(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean resetRadioConfig() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean rebootRadio() { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void rebootModem() {}
    public int getSubscriptionId() { return 0; }
    public int getSlotIndex() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, java.util.concurrent.Executor p2, android.telephony.NumberVerificationCallback p3) {}
    public static int getIntAtIndex(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0; }
    public static boolean putIntAtIndex(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return false; }
    public static java.lang.String getTelephonyProperty(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static java.lang.String getTelephonyProperty(java.lang.String p0, java.lang.String p1) { return null; }
    public int getSimCount() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getIsimIst() { return null; }
    public java.lang.String[] getIsimPcscf() { return null; }
    public java.lang.String getIccAuthentication(int p0, int p1, java.lang.String p2) { return null; }
    public java.lang.String getIccAuthentication(int p0, int p1, int p2, java.lang.String p3) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String[] getForbiddenPlmns() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String[] getForbiddenPlmns(int p0, int p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setForbiddenPlmns(java.util.List<java.lang.String> p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSimServiceTable(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void resetIms(int p0) {}
    public void enableIms(int p0) {}
    public void disableIms(int p0) {}
    public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) { return null; }
    public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) { return null; }
    public void setImsRegistrationState(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getPreferredNetworkType(int p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public long getPreferredNetworkTypeBitmask() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public long getAllowedNetworkTypesBitmask() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public long getAllowedNetworkTypes() { return 0L; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setNetworkSelectionModeAutomatic() {}
    @android.annotation.RequiresPermission(allOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public com.android.internal.telephony.CellNetworkScanResult getAvailableNetworks() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public android.telephony.NetworkScan requestNetworkScan(android.telephony.NetworkScanRequest p0, java.util.concurrent.Executor p1, android.telephony.TelephonyScanManager.NetworkScanCallback p2) { return null; }
    @android.annotation.RequiresPermission(allOf="android.permission.MODIFY_PHONE_STATE")
    public android.telephony.NetworkScan requestNetworkScan(int p0, android.telephony.NetworkScanRequest p1, java.util.concurrent.Executor p2, android.telephony.TelephonyScanManager.NetworkScanCallback p3) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public android.telephony.NetworkScan requestNetworkScan(android.telephony.NetworkScanRequest p0, android.telephony.TelephonyScanManager.NetworkScanCallback p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setNetworkSelectionModeManual(java.lang.String p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setNetworkSelectionModeManual(java.lang.String p0, boolean p1, int p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setNetworkSelectionModeManual(com.android.internal.telephony.OperatorInfo p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PRECISE_PHONE_STATE"})
    public int getNetworkSelectionMode() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public java.lang.String getManualNetworkSelectionPlmn() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isInEmergencySmsMode() { return false; }
    @java.lang.Deprecated
    public boolean setPreferredNetworkType(int p0, int p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setPreferredNetworkTypeBitmask(long p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setAllowedNetworkTypes(long p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setAllowedNetworkTypesForReason(int p0, long p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public long getAllowedNetworkTypesForReason(int p0) { return 0L; }
    public static boolean isValidAllowedNetworkTypesReason(int p0) { return false; }
    public static long getAllNetworkTypesBitmask() { return 0L; }
    public static java.lang.String convertNetworkTypeBitmaskToString(long p0) { return null; }
    public boolean setPreferredNetworkTypeToGlobal() { return false; }
    public boolean setPreferredNetworkTypeToGlobal(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean isTetheringApnRequired() { return false; }
    public boolean isTetheringApnRequired(int p0) { return false; }
    public boolean hasCarrierPrivileges() { return false; }
    public boolean hasCarrierPrivileges(int p0) { return false; }
    public boolean setOperatorBrandOverride(java.lang.String p0) { return false; }
    public boolean setOperatorBrandOverride(int p0, java.lang.String p1) { return false; }
    public boolean setRoamingOverride(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3) { return false; }
    public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String getCdmaMdn() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String getCdmaMdn(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String getCdmaMin() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.lang.String getCdmaMin(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int checkCarrierPrivilegesForPackage(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntent(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getCarrierServicePackageName() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<java.lang.String> getCarrierPrivilegedPackagesForAllActiveSubscriptions() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCallComposerStatus(int p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    @android.telephony.TelephonyManager.CallComposerStatus
    public int getCallComposerStatus() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public void dial(java.lang.String p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CALL_PHONE")
    public void call(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CALL_PHONE")
    public boolean endCall() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void answerRingingCall() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public void silenceRinger() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isOffhook() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isRinging() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isIdle() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isRadioOn() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean supplyPin(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean supplyPuk(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int[] supplyPinReportResult(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int[] supplyPukReportResult(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.telephony.PinResult supplyIccLockPin(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.telephony.PinResult supplyIccLockPuk(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.CALL_PHONE")
    public void sendUssdRequest(java.lang.String p0, android.telephony.TelephonyManager.UssdResponseCallback p1, android.os.Handler p2) {}
    public boolean isConcurrentVoiceAndDataSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean handlePinMmi(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void toggleRadioOnOff() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setRadio(boolean p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setRadioPower(boolean p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void requestRadioPowerOffForReason(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void clearRadioPowerOffForReason(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.Set<java.lang.Integer> getRadioPowerOffReasons() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void shutdownAllRadios() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isAnyRadioPoweredOn() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public int getRadioPowerState() { return 0; }
    @android.annotation.SystemApi
    public void updateServiceLocation() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean enableDataConnectivity() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean disableDataConnectivity() { return false; }
    @android.annotation.SystemApi
    public boolean isDataConnectivityPossible() { return false; }
    @android.annotation.SystemApi
    public boolean needsOtaServiceProvisioning() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getMobileProvisioningUrl() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDataEnabled(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDataEnabled(int p0, boolean p1) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean getDataEnabled() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_NETWORK_STATE", "android.permission.MODIFY_PHONE_STATE", "android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public boolean isDataEnabled() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_NETWORK_STATE", "android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public boolean isDataRoamingEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCdmaRoamingMode() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCdmaRoamingMode(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCdmaSubscriptionMode() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCdmaSubscriptionMode(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDataRoamingEnabled(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean getDataEnabled(int p0) { return false; }
    @java.lang.Deprecated
    public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void enableVideoCalling(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isVideoCallingEnabled() { return false; }
    public boolean canChangeDtmfToneLength() { return false; }
    public boolean isWorldPhone() { return false; }
    @java.lang.Deprecated
    public boolean isTtyModeSupported() { return false; }
    public boolean isRttSupported() { return false; }
    public boolean isHearingAidCompatibilitySupported() { return false; }
    public boolean isImsRegistered(int p0) { return false; }
    public boolean isImsRegistered() { return false; }
    public boolean isVolteAvailable() { return false; }
    public boolean isVideoTelephonyAvailable() { return false; }
    public boolean isWifiCallingAvailable() { return false; }
    public int getImsRegTechnologyForMmTel() { return 0; }
    public void setSimOperatorNumeric(java.lang.String p0) {}
    public void setSimOperatorNumericForPhone(int p0, java.lang.String p1) {}
    public void setSimOperatorName(java.lang.String p0) {}
    public void setSimOperatorNameForPhone(int p0, java.lang.String p1) {}
    public void setSimCountryIso(java.lang.String p0) {}
    public void setSimCountryIsoForPhone(int p0, java.lang.String p1) {}
    public void setSimState(java.lang.String p0) {}
    public void setSimStateForPhone(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSimPowerState(int p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSimPowerStateForSlot(int p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSimPowerState(int p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSimPowerStateForSlot(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public void setBasebandVersion(java.lang.String p0) {}
    public void setBasebandVersionForPhone(int p0, java.lang.String p1) {}
    public java.lang.String getBasebandVersion() { return null; }
    public java.lang.String getBasebandVersionForPhone(int p0) { return null; }
    public void setPhoneType(int p0) {}
    public void setPhoneType(int p0, int p1) {}
    public java.lang.String getOtaSpNumberSchema(java.lang.String p0) { return null; }
    public java.lang.String getOtaSpNumberSchemaForPhone(int p0, java.lang.String p1) { return null; }
    public boolean getSmsReceiveCapable(boolean p0) { return false; }
    public boolean getSmsReceiveCapableForPhone(int p0, boolean p1) { return false; }
    public boolean getSmsSendCapable(boolean p0) { return false; }
    public boolean getSmsSendCapableForPhone(int p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public android.content.ComponentName getAndUpdateDefaultRespondViaMessageApplication() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public android.content.ComponentName getDefaultRespondViaMessageApplication() { return null; }
    public void setNetworkOperatorName(java.lang.String p0) {}
    public void setNetworkOperatorNameForPhone(int p0, java.lang.String p1) {}
    public void setNetworkOperatorNumeric(java.lang.String p0) {}
    public void setNetworkOperatorNumericForPhone(int p0, java.lang.String p1) {}
    public void setNetworkRoaming(boolean p0) {}
    public void setNetworkRoamingForPhone(int p0, boolean p1) {}
    public void setDataNetworkType(int p0) {}
    public void setDataNetworkTypeForPhone(int p0, int p1) {}
    public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telecom.PhoneAccountHandle getPhoneAccountHandle() { return null; }
    public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getSubscriptionId(android.telecom.PhoneAccountHandle p0) { return 0; }
    public void factoryReset(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONNECTIVITY_INTERNAL")
    public void resetSettings() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.Locale getSimLocale() { return null; }
    public java.lang.String getLocaleFromDefaultSim() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void requestModemActivityInfo(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.ModemActivityInfo, android.telephony.TelephonyManager.ModemActivityInfoException> p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public android.telephony.ServiceState getServiceState() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public android.telephony.ServiceState getServiceState(int p0) { return null; }
    public android.telephony.ServiceState getServiceStateForSubscriber(int p0) { return null; }
    public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) { return null; }
    @java.lang.Deprecated
    public void setVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0, android.net.Uri p1) {}
    public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) { return false; }
    @java.lang.Deprecated
    public void setVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0, boolean p1) {}
    public int getSimCarrierId() { return 0; }
    public java.lang.CharSequence getSimCarrierIdName() { return null; }
    public int getSimSpecificCarrierId() { return 0; }
    public java.lang.CharSequence getSimSpecificCarrierIdName() { return null; }
    public int getCarrierIdFromSimMccMnc() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCarrierIdFromMccMnc(java.lang.String p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getAidForAppType(int p0) { return null; }
    public java.lang.String getAidForAppType(int p0, int p1) { return null; }
    public java.lang.String getEsn() { return null; }
    public java.lang.String getEsn(int p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCdmaPrlVersion() { return null; }
    public java.lang.String getCdmaPrlVersion(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setAllowedCarriers(int p0, java.util.List<android.service.carrier.CarrierIdentifier> p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setCarrierRestrictionRules(android.telephony.CarrierRestrictionRules p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<android.service.carrier.CarrierIdentifier> getAllowedCarriers(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telephony.CarrierRestrictionRules getCarrierRestrictionRules() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void getCarrierRestrictionStatus(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCarrierDataEnabled(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setRadioEnabled(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setVoNrEnabled(boolean p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isVoNrEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void reportDefaultNetworkStatus(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void resetAllCarrierActions() {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setPolicyDataEnabled(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDataEnabledForReason(int p0, boolean p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_NETWORK_STATE", "android.permission.READ_PHONE_STATE", "android.permission.MODIFY_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public boolean isDataEnabledForReason(int p0) { return false; }
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean getEmergencyCallbackMode() { return false; }
    public boolean getEmergencyCallbackMode(int p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE"})
    public boolean isManualNetworkSelectionAllowed() { return false; }
    public android.telephony.SignalStrength getSignalStrength() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_NETWORK_STATE", "android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"})
    public boolean isDataConnectionAllowed() { return false; }
    public boolean isDataCapable() { return false; }
    @java.lang.Deprecated
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {}
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) {}
    public int getCarrierIdListVersion() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getNumberOfModemsWithSimultaneousDataConnections() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setOpportunisticNetworkState(boolean p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isOpportunisticNetworkEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public long getSupportedRadioAccessFamily() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void notifyOtaEmergencyNumberDbInstalled() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public void resetOtaEmergencyNumberDbFilePath() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isEmergencyAssistanceEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> getEmergencyNumberList() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> getEmergencyNumberList(int p0) { return null; }
    public java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> filterEmergencyNumbersByCategories(java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> p0, int p1) { return null; }
    public boolean isEmergencyNumber(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isPotentialEmergencyNumber(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getEmergencyNumberDbVersion() { return 0; }
    public void setPreferredOpportunisticDataSubscription(int p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public int getPreferredOpportunisticDataSubscription() { return 0; }
    public void updateAvailableNetworks(java.util.List<android.telephony.AvailableNetworkInfo> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean enableModemForSlot(int p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE"})
    public boolean isModemEnabledForSlot(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setMultiSimCarrierRestriction(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int isMultiSimSupported() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void switchMultiSimConfig(int p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean doesSwitchMultiSimConfigTriggerReboot() { return false; }
    @java.lang.Deprecated
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getRadioHalVersion() { return null; }
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getHalVersion(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCarrierPrivilegeStatus(int p0) { return 0; }
    public java.util.List<android.telephony.data.ApnSetting> getDevicePolicyOverrideApns(android.content.Context p0) { return null; }
    public int addDevicePolicyOverrideApn(android.content.Context p0, android.telephony.data.ApnSetting p1) { return 0; }
    public boolean modifyDevicePolicyOverrideApn(android.content.Context p0, int p1, android.telephony.data.ApnSetting p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isDataEnabledForApn(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isApnMetered(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean matchesCurrentSimOperator(java.lang.String p0, int p1, java.lang.String p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getCallForwarding(int p0, java.util.concurrent.Executor p1, android.telephony.TelephonyManager.CallForwardingInfoCallback p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCallForwarding(android.telephony.CallForwardingInfo p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getCallWaitingStatus(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setCallWaitingEnabled(boolean p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setMobileDataPolicyEnabled(int p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isMobileDataPolicyEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isIccLockEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.telephony.PinResult setIccLockEnabled(boolean p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.telephony.PinResult changeIccLockPin(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void notifyUserActivity() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setNrDualConnectivityState(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isNrDualConnectivityEnabled() { return false; }
    static com.android.internal.telephony.IPhoneSubInfo getSubscriberInfoService() { return null; }
    static com.android.internal.telephony.ISub getSubscriptionService() { return null; }
    static com.android.internal.telephony.ISms getSmsService() { return null; }
    public static void disableServiceHandleCaching() {}
    public static void enableServiceHandleCaching() {}
    public static void setupITelephonyForTest(com.android.internal.telephony.ITelephony p0) {}
    public static void setupIPhoneSubInfoForTest(com.android.internal.telephony.IPhoneSubInfo p0) {}
    public static void setupISubForTest(com.android.internal.telephony.ISub p0) {}
    public boolean canConnectTo5GInDsdsMode() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.List<java.lang.String> getEquivalentHomePlmns() { return null; }
    public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int sendThermalMitigationRequest(android.telephony.ThermalMitigationRequest p0) { return 0; }
    public void registerTelephonyCallback(java.util.concurrent.Executor p0, android.telephony.TelephonyCallback p1) {}
    public void registerTelephonyCallback(int p0, java.util.concurrent.Executor p1, android.telephony.TelephonyCallback p2) {}
    public void unregisterTelephonyCallback(android.telephony.TelephonyCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.PERFORM_IMS_SINGLE_REGISTRATION"})
    public void bootstrapAuthenticationRequest(int p0, android.net.Uri p1, android.telephony.gba.UaSecurityProtocolIdentifier p2, boolean p3, java.util.concurrent.Executor p4, android.telephony.TelephonyManager.BootstrapAuthenticationCallback p5) {}
    public static boolean isNetworkTypeValid(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSignalStrengthUpdateRequest(android.telephony.SignalStrengthUpdateRequest p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void clearSignalStrengthUpdateRequest(android.telephony.SignalStrengthUpdateRequest p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telephony.PhoneCapability getPhoneCapability() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REBOOT")
    public int prepareForUnattendedReboot() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void getNetworkSlicingConfiguration(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.data.NetworkSlicingConfig, android.telephony.TelephonyManager.NetworkSlicingException> p1) {}
    public static java.lang.String convertPremiumCapabilityToString(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_BASIC_PHONE_STATE")
    public boolean isPremiumCapabilityAvailableForPurchase(int p0) { return false; }
    public static java.lang.String convertPurchaseResultToString(int p0) { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BASIC_PHONE_STATE", "android.permission.INTERNET"})
    public void purchasePremiumCapability(int p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.ACCESS_FINE_LOCATION", "com.android.phone.permission.ACCESS_LAST_KNOWN_CELL_ID"})
    public android.telephony.CellIdentity getLastKnownCellIdentity() { return null; }
    @android.annotation.RequiresPermission("android.permission.BIND_TELECOM_CONNECTION_SERVICE")
    public void setVoiceServiceStateOverride(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void registerCarrierPrivilegesCallback(int p0, java.util.concurrent.Executor p1, android.telephony.TelephonyManager.CarrierPrivilegesCallback p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void unregisterCarrierPrivilegesCallback(android.telephony.TelephonyManager.CarrierPrivilegesCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setRemovableEsimAsDefaultEuicc(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isRemovableEsimDefaultEuicc() { return false; }
    @android.telephony.TelephonyManager.SimState
    public static int getSimStateForSlotIndex(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void persistEmergencyCallDiagnosticData(java.lang.String p0, android.telephony.TelephonyManager.EmergencyCallDiagnosticParams p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setNullCipherAndIntegrityEnabled(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean isNullCipherAndIntegrityPreferenceEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_CELL_BROADCASTS")
    public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_CELL_BROADCASTS")
    public void setCellBroadcastIdRanges(java.util.List<android.telephony.CellBroadcastIdRange> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isDomainSelectionSupported() { return false; }
    public java.lang.String getPrimaryImei() { return null; }
    public static java.lang.String simStateToString(int p0) { return null; }

    public static class NetworkSlicingException extends java.lang.Exception {
        public static final int SUCCESS = 0;
        public static final int ERROR_TIMEOUT = 1;
        public static final int ERROR_MODEM_ERROR = 2;
        public NetworkSlicingException(int p0) { super(); }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface NetworkSlicingError {
        }
    }

    public static abstract class UssdResponseCallback {
        public UssdResponseCallback() {}
        public void onReceiveUssdResponse(android.telephony.TelephonyManager p0, java.lang.String p1, java.lang.CharSequence p2) {}
        public void onReceiveUssdResponseFailed(android.telephony.TelephonyManager p0, java.lang.String p1, int p2) {}
    }

    public class ModemErrorException extends android.telephony.TelephonyManager.NetworkSlicingException {
        public ModemErrorException(android.telephony.TelephonyManager p0, int p1) { super(0); }
    }

    public static class CallComposerException extends java.lang.Exception {
        public static final int SUCCESS = -1;
        public static final int ERROR_UNKNOWN = 0;
        public static final int ERROR_REMOTE_END_CLOSED = 1;
        public static final int ERROR_FILE_TOO_LARGE = 2;
        public static final int ERROR_AUTHENTICATION_FAILED = 3;
        public static final int ERROR_INPUT_CLOSED = 4;
        public static final int ERROR_IO_EXCEPTION = 5;
        public static final int ERROR_NETWORK_UNAVAILABLE = 6;
        public CallComposerException(int p0, java.io.IOException p1) { super(); }
        public int getErrorCode() { return 0; }
        @android.annotation.SuppressLint("AcronymName")
        public java.io.IOException getIOException() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallComposerError {
        }
    }

    public static abstract class CellInfoCallback {
        public static final int ERROR_TIMEOUT = 1;
        public static final int ERROR_MODEM_ERROR = 2;
        public CellInfoCallback() {}
        public abstract void onCellInfo(java.util.List<android.telephony.CellInfo> p0);
        public void onError(int p0, java.lang.Throwable p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CellInfoCallbackError {
        }
    }

    public class TimeoutException extends android.telephony.TelephonyManager.NetworkSlicingException {
        public TimeoutException(android.telephony.TelephonyManager p0, int p1) { super(0); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AllowedNetworkTypesReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthenticationFailureReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthType {
    }

    @android.annotation.SystemApi
    public static class BootstrapAuthenticationCallback {
        public BootstrapAuthenticationCallback() {}
        public void onKeysAvailable(byte[] p0, java.lang.String p1) {}
        public void onAuthenticationFailure(int p0) {}
    }

    public static @interface CallComposerStatus {
    }

    @android.annotation.SystemApi
    public static interface CallForwardingInfoCallback {
        public static final int RESULT_SUCCESS = 0;
        public static final int RESULT_ERROR_UNKNOWN = 1;
        public static final int RESULT_ERROR_FDN_CHECK_FAILURE = 2;
        public static final int RESULT_ERROR_NOT_SUPPORTED = 3;
        public void onCallForwardingInfoAvailable(android.telephony.CallForwardingInfo p0);
        public void onError(int p0);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallForwardingError {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallWaitingStatus {
    }

    @android.annotation.SystemApi
    public static interface CarrierPrivilegesCallback {
        public void onCarrierPrivilegesChanged(java.util.Set<java.lang.String> p0, java.util.Set<java.lang.Integer> p1);
        default public void onCarrierServiceChanged(java.lang.String p0, int p1) {}
    }

    public static @interface CarrierRestrictionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CdmaRoamingMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CdmaSubscription {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CellBroadcastResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataEnabledChangedReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataEnabledReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataState {
    }

    private static class DeathRecipient implements android.os.IBinder.DeathRecipient {
        public void binderDied() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DefaultSubscriptionSelectType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyCallbackModeStopReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyCallbackModeType {
    }

    public static class EmergencyCallDiagnosticParams {
        public EmergencyCallDiagnosticParams() {}
        public boolean isTelecomDumpSysCollectionEnabled() { return false; }
        public void setTelecomDumpSysCollection(boolean p0) {}
        public boolean isTelephonyDumpSysCollectionEnabled() { return false; }
        public void setTelephonyDumpSysCollection(boolean p0) {}
        public boolean isLogcatCollectionEnabled() { return false; }
        public long getLogcatStartTime() { return 0L; }
        public void setLogcatCollection(boolean p0, long p1) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableNrDualConnectivityResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableVoNrResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EriIconIndex {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EriIconMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HalService {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IncludeLocationData {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IsMultiSimSupportedResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MobileDataPolicy {
    }

    @android.annotation.SystemApi
    public static class ModemActivityInfoException extends java.lang.Exception {
        public static final int ERROR_UNKNOWN = 0;
        public static final int ERROR_PHONE_NOT_AVAILABLE = 1;
        public static final int ERROR_INVALID_INFO_RECEIVED = 2;
        public static final int ERROR_MODEM_RESPONSE_ERROR = 3;
        public ModemActivityInfoException(int p0) { super(); }
        public int getErrorCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ModemActivityInfoError {
        }
    }

    public static enum MultiSimVariants {
        DSDS,
        DSDA,
        TSTS,
        UNKNOWN;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkSelectionMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkTypeBitMask {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NrDualConnectivityState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrefNetworkMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PremiumCapability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrepareUnattendedRebootResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PurchasePremiumCapabilityResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadioInterfaceCapability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadioPowerReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetCarrierRestrictionResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetOpportunisticSubscriptionResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetSimPowerStateResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SimCombinationWarningType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SimPowerState {
    }

    public static @interface SimState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UpdateAvailableNetworksResult {
    }

    public static interface WifiCallingChoices {
        public static final int ALWAYS_USE = 0;
        public static final int ASK_EVERY_TIME = 1;
        public static final int NEVER_USE = 2;
    }
}

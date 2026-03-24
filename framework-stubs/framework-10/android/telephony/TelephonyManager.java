package android.telephony;

public class TelephonyManager {
    private static final java.lang.String TAG = "TelephonyManager";
    public static final java.lang.String MODEM_ACTIVITY_RESULT_KEY = "controller_activity";
    public static final java.lang.String PHONE_PROCESS_NAME = "com.android.phone";
    public static final int NETWORK_SELECTION_MODE_UNKNOWN = 0;
    public static final int NETWORK_SELECTION_MODE_AUTO = 1;
    public static final int NETWORK_SELECTION_MODE_MANUAL = 2;
    public static final int OTASP_UNINITIALIZED = 0;
    public static final int OTASP_UNKNOWN = 1;
    public static final int OTASP_NEEDED = 2;
    public static final int OTASP_NOT_NEEDED = 3;
    public static final int OTASP_SIM_UNPROVISIONED = 5;
    public static final int KEY_TYPE_EPDG = 1;
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
    private final android.content.Context mContext = null;
    private final int mSubId = 0;
    @android.annotation.UnsupportedAppUsage
    private android.telephony.SubscriptionManager mSubscriptionManager;
    private android.telephony.TelephonyScanManager mTelephonyScanManager;
    private static java.lang.String multiSimConfig;
    private static android.telephony.TelephonyManager sInstance;
    public static final java.lang.String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
    public static final java.lang.String ACTION_RESPOND_VIA_MESSAGE = "android.intent.action.RESPOND_VIA_MESSAGE";
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
    public static final java.lang.String ACTION_PRECISE_CALL_STATE_CHANGED = "android.intent.action.PRECISE_CALL_STATE";
    public static final java.lang.String ACTION_CALL_DISCONNECT_CAUSE_CHANGED = "android.intent.action.CALL_DISCONNECT_CAUSE";
    public static final java.lang.String EXTRA_RINGING_CALL_STATE = "ringing_state";
    public static final java.lang.String EXTRA_FOREGROUND_CALL_STATE = "foreground_state";
    public static final java.lang.String EXTRA_BACKGROUND_CALL_STATE = "background_state";
    public static final java.lang.String EXTRA_DISCONNECT_CAUSE = "disconnect_cause";
    public static final java.lang.String EXTRA_PRECISE_DISCONNECT_CAUSE = "precise_disconnect_cause";
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String ACTION_PRECISE_DATA_CONNECTION_STATE_CHANGED = "android.intent.action.PRECISE_DATA_CONNECTION_STATE_CHANGED";
    public static final java.lang.String EXTRA_DATA_STATE = "state";
    public static final java.lang.String EXTRA_DATA_NETWORK_TYPE = "networkType";
    public static final java.lang.String EXTRA_DATA_APN_TYPE = "apnType";
    public static final java.lang.String EXTRA_DATA_APN = "apn";
    public static final java.lang.String EXTRA_DATA_LINK_PROPERTIES_KEY = "linkProperties";
    public static final java.lang.String EXTRA_DATA_FAILURE_CAUSE = "failCause";
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
    public static final java.lang.String ACTION_DATA_STALL_DETECTED = "android.intent.action.DATA_STALL_DETECTED";
    public static final java.lang.String ACTION_CARRIER_MESSAGING_CLIENT_SERVICE = "android.telephony.action.CARRIER_MESSAGING_CLIENT_SERVICE";
    public static final java.lang.String EXTRA_RECOVERY_ACTION = "recoveryAction";
    private static final long MAX_NUMBER_VERIFICATION_TIMEOUT_MILLIS = 60000L;
    @android.annotation.SystemApi
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
    public static final java.lang.String EXTRA_SIM_COMBINATION_WARNING_TYPE = "android.telephony.extra.SIM_COMBINATION_WARNING_TYPE";
    public static final int EXTRA_SIM_COMBINATION_WARNING_TYPE_NONE = 0;
    public static final int EXTRA_SIM_COMBINATION_WARNING_TYPE_DUAL_CDMA = 1;
    public static final java.lang.String EXTRA_SIM_COMBINATION_NAMES = "android.telephony.extra.SIM_COMBINATION_NAMES";
    public static final int PHONE_TYPE_NONE = 0;
    public static final int PHONE_TYPE_GSM = 1;
    public static final int PHONE_TYPE_CDMA = 2;
    public static final int PHONE_TYPE_SIP = 3;
    private static final java.lang.String sKernelCmdLine = null;
    private static final java.util.regex.Pattern sProductTypePattern = null;
    private static final java.lang.String sLteOnCdmaProductType = null;
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
    public static final int NETWORK_TYPE_IDEN = 11;
    public static final int NETWORK_TYPE_EVDO_B = 12;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_GSM = 16;
    public static final int NETWORK_TYPE_TD_SCDMA = 17;
    public static final int NETWORK_TYPE_IWLAN = 18;
    @android.annotation.UnsupportedAppUsage
    public static final int NETWORK_TYPE_LTE_CA = 19;
    public static final int NETWORK_TYPE_NR = 20;
    public static final int MAX_NETWORK_TYPE = 20;
    public static final int NETWORK_CLASS_UNKNOWN = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int NETWORK_CLASS_2_G = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int NETWORK_CLASS_3_G = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int NETWORK_CLASS_4_G = 3;
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
    public static final int APPTYPE_SIM = 1;
    public static final int APPTYPE_USIM = 2;
    public static final int APPTYPE_RUIM = 3;
    public static final int APPTYPE_CSIM = 4;
    public static final int APPTYPE_ISIM = 5;
    public static final int AUTHTYPE_EAP_SIM = 128;
    public static final int AUTHTYPE_EAP_AKA = 129;
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
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_HAS_ACCESS = 1;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_NO_ACCESS = 0;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_RULES_NOT_LOADED = -1;
    @android.annotation.SystemApi
    public static final int CARRIER_PRIVILEGE_STATUS_ERROR_LOADING_RULES = -2;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_OFF = 0;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_ON = 1;
    @android.annotation.SystemApi
    public static final int RADIO_POWER_UNAVAILABLE = 2;
    public static final int CARD_POWER_DOWN = 0;
    public static final int CARD_POWER_UP = 1;
    public static final int CARD_POWER_UP_PASS_THROUGH = 2;
    @android.annotation.SystemApi
    public static final int SET_CARRIER_RESTRICTION_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int SET_CARRIER_RESTRICTION_NOT_SUPPORTED = 1;
    @android.annotation.SystemApi
    public static final int SET_CARRIER_RESTRICTION_ERROR = 2;
    public static final int INDICATION_UPDATE_MODE_NORMAL = 1;
    public static final int INDICATION_UPDATE_MODE_IGNORE_SCREEN_OFF = 2;
    public static final int INDICATION_FILTER_SIGNAL_STRENGTH = 1;
    public static final int INDICATION_FILTER_FULL_NETWORK_STATE = 2;
    public static final int INDICATION_FILTER_DATA_CALL_DORMANCY_CHANGED = 4;
    public static final int INDICATION_FILTER_LINK_CAPACITY_ESTIMATE = 8;
    public static final int INDICATION_FILTER_PHYSICAL_CHANNEL_CONFIG = 16;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_UNKNOWN = 0L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_GSM = 32768L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_GPRS = 1L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_EDGE = 2L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_CDMA = 8L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_1xRTT = 64L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_EVDO_0 = 16L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_EVDO_A = 32L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_EVDO_B = 2048L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_EHRPD = 8192L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_HSUPA = 256L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_HSDPA = 128L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_HSPA = 512L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_HSPAP = 16384L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_UMTS = 4L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_TD_SCDMA = 65536L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_LTE = 4096L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_LTE_CA = 262144L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_NR = 524288L;
    @android.annotation.SystemApi
    public static final long NETWORK_TYPE_BITMASK_IWLAN = 131072L;
    public static final int SET_OPPORTUNISTIC_SUB_SUCCESS = 0;
    public static final int SET_OPPORTUNISTIC_SUB_VALIDATION_FAILED = 1;
    public static final int SET_OPPORTUNISTIC_SUB_INACTIVE_SUBSCRIPTION = 2;
    public static final int UPDATE_AVAILABLE_NETWORKS_SUCCESS = 0;
    public static final int UPDATE_AVAILABLE_NETWORKS_UNKNOWN_FAILURE = 1;
    public static final int UPDATE_AVAILABLE_NETWORKS_ABORTED = 2;
    public static final int UPDATE_AVAILABLE_NETWORKS_INVALID_ARGUMENTS = 3;
    public static final int UPDATE_AVAILABLE_NETWORKS_NO_CARRIER_PRIVILEGE = 4;
    public static final java.lang.String ACTION_NETWORK_COUNTRY_CHANGED = "android.telephony.action.NETWORK_COUNTRY_CHANGED";
    public static final java.lang.String EXTRA_NETWORK_COUNTRY = "android.telephony.extra.NETWORK_COUNTRY";
    public static final int MULTISIM_ALLOWED = 0;
    public static final int MULTISIM_NOT_SUPPORTED_BY_HARDWARE = 1;
    public static final int MULTISIM_NOT_SUPPORTED_BY_CARRIER = 2;
    @android.annotation.UnsupportedAppUsage
    public TelephonyManager(android.content.Context p0) {}
    @android.annotation.UnsupportedAppUsage
    public TelephonyManager(android.content.Context p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    private TelephonyManager() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static android.telephony.TelephonyManager getDefault() { return null; }
    private java.lang.String getOpPackageName() { return null; }
    private boolean isSystemProcess() { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.telephony.TelephonyManager.MultiSimVariants getMultiSimConfiguration() { return null; }
    public int getPhoneCount() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static android.telephony.TelephonyManager from(android.content.Context p0) { return null; }
    public android.telephony.TelephonyManager createForSubscriptionId(int p0) { return null; }
    public android.telephony.TelephonyManager createForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean isMultiSimEnabled() { return false; }
    public java.lang.String getDeviceSoftwareVersion() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDeviceSoftwareVersion(int p0) { return null; }
    @java.lang.Deprecated
    public java.lang.String getDeviceId() { return null; }
    @java.lang.Deprecated
    public java.lang.String getDeviceId(int p0) { return null; }
    public java.lang.String getImei() { return null; }
    public java.lang.String getImei(int p0) { return null; }
    public java.lang.String getTypeAllocationCode() { return null; }
    public java.lang.String getTypeAllocationCode(int p0) { return null; }
    public java.lang.String getMeid() { return null; }
    public java.lang.String getMeid(int p0) { return null; }
    public java.lang.String getManufacturerCode() { return null; }
    public java.lang.String getManufacturerCode(int p0) { return null; }
    public java.lang.String getNai() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNai(int p0) { return null; }
    private java.lang.String getNaiBySubscriberId(int p0) { return null; }
    @java.lang.Deprecated
    public android.telephony.CellLocation getCellLocation() { return null; }
    public void enableLocationUpdates() {}
    public void enableLocationUpdates(int p0) {}
    public void disableLocationUpdates() {}
    public void disableLocationUpdates(int p0) {}
    @java.lang.Deprecated
    public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo() { return null; }
    @android.annotation.SystemApi
    public int getCurrentPhoneType() { return 0; }
    @android.annotation.SystemApi
    public int getCurrentPhoneType(int p0) { return 0; }
    public int getCurrentPhoneTypeForSlot(int p0) { return 0; }
    public int getPhoneType() { return 0; }
    private int getPhoneTypeFromProperty() { return 0; }
    @android.annotation.UnsupportedAppUsage
    private int getPhoneTypeFromProperty(int p0) { return 0; }
    private int getPhoneTypeFromNetworkType() { return 0; }
    private int getPhoneTypeFromNetworkType(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int getPhoneType(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    private static java.lang.String getProcCmdLine() { return null; }
    @android.annotation.SystemApi
    public static long getMaxNumberVerificationTimeoutMillis() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public static int getLteOnCdmaModeStatic() { return 0; }
    public java.lang.String getNetworkOperatorName() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getNetworkOperatorName(int p0) { return null; }
    public java.lang.String getNetworkOperator() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getNetworkOperator(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNetworkOperatorForPhone(int p0) { return null; }
    public java.lang.String getNetworkSpecifier() { return null; }
    public android.os.PersistableBundle getCarrierConfig() { return null; }
    public boolean isNetworkRoaming() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isNetworkRoaming(int p0) { return false; }
    public java.lang.String getNetworkCountryIso() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNetworkCountryIso(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNetworkCountryIsoForPhone(int p0) { return null; }
    public int getNetworkType() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getNetworkType(int p0) { return 0; }
    public int getDataNetworkType() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getDataNetworkType(int p0) { return 0; }
    public int getVoiceNetworkType() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getVoiceNetworkType(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int getNetworkClass(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getNetworkTypeName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getNetworkTypeName(int p0) { return null; }
    public boolean hasIccCard() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasIccCard(int p0) { return false; }
    public int getSimState() { return 0; }
    private int getSimStateIncludingLoaded() { return 0; }
    @android.annotation.SystemApi
    public int getSimCardState() { return 0; }
    @android.annotation.SystemApi
    public int getSimApplicationState() { return 0; }
    public int getSimState(int p0) { return 0; }
    public java.lang.String getSimOperator() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSimOperator(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSimOperatorNumeric() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSimOperatorNumeric(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSimOperatorNumericForPhone(int p0) { return null; }
    public java.lang.String getSimOperatorName() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSimOperatorName(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getSimOperatorNameForPhone(int p0) { return null; }
    public java.lang.String getSimCountryIso() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSimCountryIso(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getSimCountryIsoForPhone(int p0) { return null; }
    public java.lang.String getSimSerialNumber() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getSimSerialNumber(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getLteOnCdmaMode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getLteOnCdmaMode(int p0) { return 0; }
    public int getCardIdForDefaultEuicc() { return 0; }
    public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo() { return null; }
    @android.annotation.SystemApi
    public android.telephony.UiccSlotInfo[] getUiccSlotsInfo() { return null; }
    public void refreshUiccProfile() {}
    @android.annotation.SystemApi
    public boolean switchSlots(int[] p0) { return false; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.Integer, java.lang.Integer> getLogicalToPhysicalSlotMapping() { return null; }
    public java.lang.String getSubscriberId() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getSubscriberId(int p0) { return null; }
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0) { return null; }
    public void resetCarrierKeysForImsiEncryption() {}
    private static boolean isKeyEnabled(int p0, int p1) { return false; }
    private boolean isImsiEncryptionRequired(int p0, int p1) { return false; }
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0) {}
    public java.lang.String getGroupIdLevel1() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getGroupIdLevel1(int p0) { return null; }
    public java.lang.String getLine1Number() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getLine1Number(int p0) { return null; }
    public boolean setLine1NumberForDisplay(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean setLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    public java.lang.String getLine1AlphaTag() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getLine1AlphaTag(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getMergedSubscriberIds() { return null; }
    public java.lang.String[] getMergedSubscriberIdsFromGroup() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getMsisdn() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getMsisdn(int p0) { return null; }
    public java.lang.String getVoiceMailNumber() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getVoiceMailNumber(int p0) { return null; }
    public boolean setVoiceMailNumber(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void setVisualVoicemailEnabled(android.telecom.PhoneAccountHandle p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public boolean isVisualVoicemailEnabled(android.telecom.PhoneAccountHandle p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public android.os.Bundle getVisualVoicemailSettings() { return null; }
    public java.lang.String getVisualVoicemailPackageName() { return null; }
    public void setVisualVoicemailSmsFilterSettings(android.telephony.VisualVoicemailSmsFilterSettings p0) {}
    public void sendVisualVoicemailSms(java.lang.String p0, int p1, java.lang.String p2, android.app.PendingIntent p3) {}
    public void enableVisualVoicemailSmsFilter(int p0, android.telephony.VisualVoicemailSmsFilterSettings p1) {}
    public void disableVisualVoicemailSmsFilter(int p0) {}
    public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(int p0) { return null; }
    public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) { return null; }
    public void sendVisualVoicemailSmsForSubscriber(int p0, java.lang.String p1, int p2, java.lang.String p3, android.app.PendingIntent p4) {}
    @android.annotation.SystemApi
    public void setVoiceActivationState(int p0) {}
    public void setVoiceActivationState(int p0, int p1) {}
    @android.annotation.SystemApi
    public void setDataActivationState(int p0) {}
    public void setDataActivationState(int p0, int p1) {}
    @android.annotation.SystemApi
    public int getVoiceActivationState() { return 0; }
    public int getVoiceActivationState(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getDataActivationState() { return 0; }
    public int getDataActivationState(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getVoiceMessageCount() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getVoiceMessageCount(int p0) { return 0; }
    public java.lang.String getVoiceMailAlphaTag() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getVoiceMailAlphaTag(int p0) { return null; }
    public void sendDialerSpecialCode(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getIsimImpi() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getIsimDomain() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getIsimImpu() { return null; }
    @android.annotation.UnsupportedAppUsage
    private com.android.internal.telephony.IPhoneSubInfo getSubscriberInfo() { return null; }
    public int getCallState() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getCallState(int p0) { return 0; }
    public int getCallStateForSlot(int p0) { return 0; }
    public int getDataActivity() { return 0; }
    public int getDataState() { return 0; }
    public static java.lang.String dataStateToString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private com.android.internal.telephony.ITelephony getITelephony() { return null; }
    private com.android.internal.telecom.ITelecomService getTelecomService() { return null; }
    private com.android.internal.telephony.ITelephonyRegistry getTelephonyRegistry() { return null; }
    private com.android.internal.telephony.IOns getIOns() { return null; }
    public void listen(android.telephony.PhoneStateListener p0, int p1) {}
    public int getCdmaEriIconIndex() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getCdmaEriIconIndex(int p0) { return 0; }
    public int getCdmaEriIconMode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getCdmaEriIconMode(int p0) { return 0; }
    public java.lang.String getCdmaEriText() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getCdmaEriText(int p0) { return null; }
    public boolean isVoiceCapable() { return false; }
    public boolean isSmsCapable() { return false; }
    public java.util.List<android.telephony.CellInfo> getAllCellInfo() { return null; }
    public void requestCellInfoUpdate(java.util.concurrent.Executor p0, android.telephony.TelephonyManager.CellInfoCallback p1) {}
    @android.annotation.SystemApi
    public void requestCellInfoUpdate(android.os.WorkSource p0, java.util.concurrent.Executor p1, android.telephony.TelephonyManager.CellInfoCallback p2) {}
    public void setCellInfoListRate(int p0) {}
    public java.lang.String getMmsUserAgent() { return null; }
    public java.lang.String getMmsUAProfUrl() { return null; }
    @java.lang.Deprecated
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannelBySlot(int p0, java.lang.String p1, int p2) { return null; }
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String p0, int p1) { return null; }
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) { return null; }
    @android.annotation.SystemApi
    public boolean iccCloseLogicalChannelBySlot(int p0, int p1) { return false; }
    public boolean iccCloseLogicalChannel(int p0) { return false; }
    public boolean iccCloseLogicalChannel(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public java.lang.String iccTransmitApduLogicalChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) { return null; }
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) { return null; }
    @android.annotation.SystemApi
    public java.lang.String iccTransmitApduBasicChannelBySlot(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public java.lang.String iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) { return null; }
    public java.lang.String iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) { return null; }
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public java.lang.String sendEnvelopeWithStatus(java.lang.String p0) { return null; }
    public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String nvReadItem(int p0) { return null; }
    public boolean nvWriteItem(int p0, java.lang.String p1) { return false; }
    public boolean nvWriteCdmaPrl(byte[] p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean nvResetConfig(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean resetRadioConfig() { return false; }
    @android.annotation.SystemApi
    public boolean rebootRadio() { return false; }
    private int getSubId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    private int getSubId(int p0) { return 0; }
    private int getPhoneId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    private int getPhoneId(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getSlotIndex() { return 0; }
    @android.annotation.SystemApi
    public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, java.util.concurrent.Executor p2, android.telephony.NumberVerificationCallback p3) {}
    @android.annotation.UnsupportedAppUsage
    public static void setTelephonyProperty(int p0, java.lang.String p1, java.lang.String p2) {}
    public static void setTelephonyProperty(java.lang.String p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public static int getIntAtIndex(android.content.ContentResolver p0, java.lang.String p1, int p2) throws android.provider.Settings.SettingNotFoundException { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static boolean putIntAtIndex(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getTelephonyProperty(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getTelephonyProperty(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getSimCount() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getIsimIst() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getIsimPcscf() { return null; }
    public java.lang.String getIccAuthentication(int p0, int p1, java.lang.String p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getIccAuthentication(int p0, int p1, int p2, java.lang.String p3) { return null; }
    public java.lang.String[] getForbiddenPlmns() { return null; }
    public java.lang.String[] getForbiddenPlmns(int p0, int p1) { return null; }
    public java.lang.String[] getPcscfAddress(java.lang.String p0) { return null; }
    public void enableIms(int p0) {}
    public void disableIms(int p0) {}
    public android.telephony.ims.aidl.IImsMmTelFeature getImsMmTelFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) { return null; }
    public android.telephony.ims.aidl.IImsRcsFeature getImsRcsFeatureAndListen(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setImsRegistrationState(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getPreferredNetworkType(int p0) { return 0; }
    @android.annotation.SystemApi
    public long getPreferredNetworkTypeBitmask() { return 0L; }
    public void setNetworkSelectionModeAutomatic() {}
    public com.android.internal.telephony.CellNetworkScanResult getAvailableNetworks() { return null; }
    public android.telephony.NetworkScan requestNetworkScan(android.telephony.NetworkScanRequest p0, java.util.concurrent.Executor p1, android.telephony.TelephonyScanManager.NetworkScanCallback p2) { return null; }
    @java.lang.Deprecated
    public android.telephony.NetworkScan requestNetworkScan(android.telephony.NetworkScanRequest p0, android.telephony.TelephonyScanManager.NetworkScanCallback p1) { return null; }
    public boolean setNetworkSelectionModeManual(java.lang.String p0, boolean p1) { return false; }
    public boolean setNetworkSelectionModeManual(com.android.internal.telephony.OperatorInfo p0, boolean p1) { return false; }
    public int getNetworkSelectionMode() { return 0; }
    public boolean isInEmergencySmsMode() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean setPreferredNetworkType(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setPreferredNetworkTypeBitmask(long p0) { return false; }
    public boolean setPreferredNetworkTypeToGlobal() { return false; }
    public boolean setPreferredNetworkTypeToGlobal(int p0) { return false; }
    public boolean getTetherApnRequired() { return false; }
    public boolean getTetherApnRequired(int p0) { return false; }
    public boolean hasCarrierPrivileges() { return false; }
    public boolean hasCarrierPrivileges(int p0) { return false; }
    public boolean setOperatorBrandOverride(java.lang.String p0) { return false; }
    public boolean setOperatorBrandOverride(int p0, java.lang.String p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean setRoamingOverride(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3) { return false; }
    public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) { return false; }
    @android.annotation.SystemApi
    public java.lang.String getCdmaMdn() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCdmaMdn(int p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCdmaMin() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCdmaMin(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public int checkCarrierPrivilegesForPackage(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntent(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) { return null; }
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges() { return null; }
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void dial(java.lang.String p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void call(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean endCall() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void answerRingingCall() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void silenceRinger() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isOffhook() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isRinging() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isIdle() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isRadioOn() { return false; }
    @android.annotation.SystemApi
    public boolean supplyPin(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean supplyPuk(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public int[] supplyPinReportResult(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public int[] supplyPukReportResult(java.lang.String p0, java.lang.String p1) { return null; }
    public void sendUssdRequest(java.lang.String p0, android.telephony.TelephonyManager.UssdResponseCallback p1, android.os.Handler p2) {}
    public boolean isConcurrentVoiceAndDataSupported() { return false; }
    @android.annotation.SystemApi
    public boolean handlePinMmi(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public void toggleRadioOnOff() {}
    @android.annotation.SystemApi
    public boolean setRadio(boolean p0) { return false; }
    @android.annotation.SystemApi
    public boolean setRadioPower(boolean p0) { return false; }
    @android.annotation.SystemApi
    public int getRadioPowerState() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void updateServiceLocation() {}
    @android.annotation.SystemApi
    public boolean enableDataConnectivity() { return false; }
    @android.annotation.SystemApi
    public boolean disableDataConnectivity() { return false; }
    @android.annotation.SystemApi
    public boolean isDataConnectivityPossible() { return false; }
    @android.annotation.SystemApi
    public boolean needsOtaServiceProvisioning() { return false; }
    public void setDataEnabled(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setDataEnabled(int p0, boolean p1) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean getDataEnabled() { return false; }
    public boolean isDataEnabled() { return false; }
    public boolean isDataRoamingEnabled() { return false; }
    public int getCdmaRoamingMode() { return 0; }
    public boolean setCdmaRoamingMode(int p0) { return false; }
    public boolean setCdmaSubscriptionMode(int p0) { return false; }
    @android.annotation.SystemApi
    public void setDataRoamingEnabled(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean getDataEnabled(int p0) { return false; }
    @java.lang.Deprecated
    public int invokeOemRilRequestRaw(byte[] p0, byte[] p1) { return 0; }
    @android.annotation.SystemApi
    public void enableVideoCalling(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isVideoCallingEnabled() { return false; }
    public boolean canChangeDtmfToneLength() { return false; }
    public boolean isWorldPhone() { return false; }
    @java.lang.Deprecated
    public boolean isTtyModeSupported() { return false; }
    public boolean isRttSupported() { return false; }
    public boolean isHearingAidCompatibilitySupported() { return false; }
    public boolean isImsRegistered(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean isImsRegistered() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isVolteAvailable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isVideoTelephonyAvailable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isWifiCallingAvailable() { return false; }
    public int getImsRegTechnologyForMmTel() { return 0; }
    public void setSimOperatorNumeric(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setSimOperatorNumericForPhone(int p0, java.lang.String p1) {}
    public void setSimOperatorName(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setSimOperatorNameForPhone(int p0, java.lang.String p1) {}
    public void setSimCountryIso(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setSimCountryIsoForPhone(int p0, java.lang.String p1) {}
    public void setSimState(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setSimStateForPhone(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public void setSimPowerState(int p0) {}
    @android.annotation.SystemApi
    public void setSimPowerStateForSlot(int p0, int p1) {}
    public void setBasebandVersion(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setBasebandVersionForPhone(int p0, java.lang.String p1) {}
    public java.lang.String getBasebandVersion() { return null; }
    private java.lang.String getBasebandVersionLegacy(int p0) { return null; }
    public java.lang.String getBasebandVersionForPhone(int p0) { return null; }
    public void setPhoneType(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setPhoneType(int p0, int p1) {}
    public java.lang.String getOtaSpNumberSchema(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.lang.String getOtaSpNumberSchemaForPhone(int p0, java.lang.String p1) { return null; }
    public boolean getSmsReceiveCapable(boolean p0) { return false; }
    public boolean getSmsReceiveCapableForPhone(int p0, boolean p1) { return false; }
    public boolean getSmsSendCapable(boolean p0) { return false; }
    public boolean getSmsSendCapableForPhone(int p0, boolean p1) { return false; }
    public void setNetworkOperatorName(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setNetworkOperatorNameForPhone(int p0, java.lang.String p1) {}
    public void setNetworkOperatorNumeric(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setNetworkOperatorNumericForPhone(int p0, java.lang.String p1) {}
    public void setNetworkRoaming(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setNetworkRoamingForPhone(int p0, boolean p1) {}
    public void setDataNetworkType(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setDataNetworkTypeForPhone(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getSubIdForPhoneAccount(android.telecom.PhoneAccount p0) { return 0; }
    public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) { return null; }
    private int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0) { return 0; }
    public void factoryReset(int p0) {}
    @android.annotation.SystemApi
    public java.util.Locale getSimLocale() { return null; }
    public java.lang.String getLocaleFromDefaultSim() { return null; }
    public void requestModemActivityInfo(android.os.ResultReceiver p0) {}
    public android.telephony.ServiceState getServiceState() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public android.telephony.ServiceState getServiceStateForSubscriber(int p0) { return null; }
    public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) { return null; }
    public void setVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0, android.net.Uri p1) {}
    public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) { return false; }
    public void setVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0, boolean p1) {}
    public int getSimCarrierId() { return 0; }
    public java.lang.CharSequence getSimCarrierIdName() { return null; }
    public int getSimSpecificCarrierId() { return 0; }
    public java.lang.CharSequence getSimSpecificCarrierIdName() { return null; }
    public int getCarrierIdFromSimMccMnc() { return 0; }
    public int getCarrierIdFromMccMnc(java.lang.String p0) { return 0; }
    public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getAidForAppType(int p0) { return null; }
    public java.lang.String getAidForAppType(int p0, int p1) { return null; }
    public java.lang.String getEsn() { return null; }
    public java.lang.String getEsn(int p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCdmaPrlVersion() { return null; }
    public java.lang.String getCdmaPrlVersion(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() { return null; }
    @android.annotation.SystemApi
    public int setAllowedCarriers(int p0, java.util.List<android.service.carrier.CarrierIdentifier> p1) { return 0; }
    @android.annotation.SystemApi
    public int setCarrierRestrictionRules(android.telephony.CarrierRestrictionRules p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public java.util.List<android.service.carrier.CarrierIdentifier> getAllowedCarriers(int p0) { return null; }
    @android.annotation.SystemApi
    public android.telephony.CarrierRestrictionRules getCarrierRestrictionRules() { return null; }
    @android.annotation.SystemApi
    public void setCarrierDataEnabled(boolean p0) {}
    public void carrierActionSetRadioEnabled(int p0, boolean p1) {}
    public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) {}
    public void carrierActionResetAll(int p0) {}
    public android.net.NetworkStats getVtDataUsage(int p0) { return null; }
    public void setPolicyDataEnabled(boolean p0, int p1) {}
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(int p0) { return null; }
    @android.annotation.SystemApi
    public boolean getEmergencyCallbackMode() { return false; }
    public boolean getEmergencyCallbackMode(int p0) { return false; }
    public boolean isManualNetworkSelectionAllowed() { return false; }
    public android.telephony.SignalStrength getSignalStrength() { return null; }
    public boolean isDataCapable() { return false; }
    public void setRadioIndicationUpdateMode(int p0, int p1) {}
    @java.lang.Deprecated
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {}
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) {}
    public int getCarrierIdListVersion() { return 0; }
    public int getNumberOfModemsWithSimultaneousDataConnections() { return 0; }
    public boolean setOpportunisticNetworkState(boolean p0) { return false; }
    public boolean isOpportunisticNetworkEnabled() { return false; }
    @android.annotation.SystemApi
    public long getSupportedRadioAccessFamily() { return 0L; }
    @android.annotation.SystemApi
    public boolean isEmergencyAssistanceEnabled() { return false; }
    public java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> getEmergencyNumberList() { return null; }
    public java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> getEmergencyNumberList(int p0) { return null; }
    public boolean isEmergencyNumber(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean isPotentialEmergencyNumber(java.lang.String p0) { return false; }
    public void setPreferredOpportunisticDataSubscription(int p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public int getPreferredOpportunisticDataSubscription() { return 0; }
    public void updateAvailableNetworks(java.util.List<android.telephony.AvailableNetworkInfo> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    public boolean enableModemForSlot(int p0, boolean p1) { return false; }
    public boolean isModemEnabledForSlot(int p0) { return false; }
    @android.annotation.SystemApi
    public void setMultiSimCarrierRestriction(boolean p0) {}
    public int isMultiSimSupported() { return 0; }
    public void switchMultiSimConfig(int p0) {}
    public boolean doesSwitchMultiSimConfigTriggerReboot() { return false; }
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getRadioHalVersion() { return null; }
    public boolean isDataEnabledForApn(int p0) { return false; }
    public boolean isApnMetered(int p0) { return false; }
    public boolean setDataAllowedDuringVoiceCall(boolean p0) { return false; }
    public boolean isDataAllowedInVoiceCall() { return false; }

    public static interface WifiCallingChoices {
        public static final int ALWAYS_USE = 0;
        public static final int ASK_EVERY_TIME = 1;
        public static final int NEVER_USE = 2;
    }

    public static abstract class UssdResponseCallback {
        public UssdResponseCallback() {}
        public void onReceiveUssdResponse(android.telephony.TelephonyManager p0, java.lang.String p1, java.lang.CharSequence p2) {}
        public void onReceiveUssdResponseFailed(android.telephony.TelephonyManager p0, java.lang.String p1, int p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UpdateAvailableNetworksResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UiccAppType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SrvccState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SimCombinationWarningType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SimActivationState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetOpportunisticSubscriptionResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetCarrierRestrictionResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadioPowerState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrefNetworkMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkTypeBitMask {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkSelectionMode {
    }

    public static enum MultiSimVariants {
        DSDS,
        DSDA,
        TSTS,
        UNKNOWN;
        private MultiSimVariants() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IsMultiSimSupportedResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IndicationUpdateMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IndicationFilters {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DefaultSubscriptionSelectType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataState {
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallState {
    }
}

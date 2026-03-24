package com.android.internal.telephony;

public class TelephonyIntents {
    public static final java.lang.String ACTION_SERVICE_STATE_CHANGED = "android.intent.action.SERVICE_STATE";
    public static final java.lang.String ACTION_RADIO_TECHNOLOGY_CHANGED = "android.intent.action.RADIO_TECHNOLOGY";
    public static final java.lang.String ACTION_EMERGENCY_CALLBACK_MODE_CHANGED = "android.intent.action.EMERGENCY_CALLBACK_MODE_CHANGED";
    public static final java.lang.String ACTION_EMERGENCY_CALL_STATE_CHANGED = "android.intent.action.EMERGENCY_CALL_STATE_CHANGED";
    public static final java.lang.String ACTION_SIGNAL_STRENGTH_CHANGED = "android.intent.action.SIG_STR";
    public static final java.lang.String ACTION_ANY_DATA_CONNECTION_STATE_CHANGED = "android.intent.action.ANY_DATA_STATE";
    public static final java.lang.String ACTION_DATA_CONNECTION_FAILED = "android.intent.action.DATA_CONNECTION_FAILED";
    public static final java.lang.String ACTION_SIM_STATE_CHANGED = "android.intent.action.SIM_STATE_CHANGED";
    public static final java.lang.String EXTRA_REBROADCAST_ON_UNLOCK = "rebroadcastOnUnlock";
    public static final java.lang.String ACTION_NETWORK_SET_TIME = "android.intent.action.NETWORK_SET_TIME";
    public static final java.lang.String ACTION_NETWORK_SET_TIMEZONE = "android.intent.action.NETWORK_SET_TIMEZONE";
    public static final java.lang.String ACTION_SHOW_NOTICE_ECM_BLOCK_OTHERS = "com.android.internal.intent.action.ACTION_SHOW_NOTICE_ECM_BLOCK_OTHERS";
    public static final java.lang.String ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION = "com.android.internal.intent.action.ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION";
    public static final java.lang.String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";
    public static final java.lang.String SPN_STRINGS_UPDATED_ACTION = "android.provider.Telephony.SPN_STRINGS_UPDATED";
    public static final java.lang.String EXTRA_SHOW_PLMN = "showPlmn";
    public static final java.lang.String EXTRA_PLMN = "plmn";
    public static final java.lang.String EXTRA_SHOW_SPN = "showSpn";
    public static final java.lang.String EXTRA_SPN = "spn";
    public static final java.lang.String EXTRA_DATA_SPN = "spnData";
    public static final java.lang.String ACTION_SUBINFO_CONTENT_CHANGE = "android.intent.action.ACTION_SUBINFO_CONTENT_CHANGE";
    public static final java.lang.String ACTION_SUBINFO_RECORD_UPDATED = "android.intent.action.ACTION_SUBINFO_RECORD_UPDATED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_SET_RADIO_CAPABILITY_DONE = "android.intent.action.ACTION_SET_RADIO_CAPABILITY_DONE";
    public static final java.lang.String EXTRA_RADIO_ACCESS_FAMILY = "rafs";
    public static final java.lang.String ACTION_SET_RADIO_CAPABILITY_FAILED = "android.intent.action.ACTION_SET_RADIO_CAPABILITY_FAILED";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_REDIRECTED = "com.android.internal.telephony.CARRIER_SIGNAL_REDIRECTED";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_REQUEST_NETWORK_FAILED = "com.android.internal.telephony.CARRIER_SIGNAL_REQUEST_NETWORK_FAILED";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_PCO_VALUE = "com.android.internal.telephony.CARRIER_SIGNAL_PCO_VALUE";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE = "com.android.internal.telephony.CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE";
    public static final java.lang.String ACTION_CARRIER_SIGNAL_RESET = "com.android.internal.telephony.CARRIER_SIGNAL_RESET";
    public static final java.lang.String EXTRA_REDIRECTION_URL_KEY = "redirectionUrl";
    public static final java.lang.String EXTRA_ERROR_CODE_KEY = "errorCode";
    public static final java.lang.String EXTRA_APN_TYPE_KEY = "apnType";
    public static final java.lang.String EXTRA_APN_PROTO_KEY = "apnProto";
    public static final java.lang.String EXTRA_PCO_ID_KEY = "pcoId";
    public static final java.lang.String EXTRA_PCO_VALUE_KEY = "pcoValue";
    public static final java.lang.String EXTRA_DEFAULT_NETWORK_AVAILABLE_KEY = "defaultNetworkAvailable";
    public static final java.lang.String ACTION_REQUEST_OMADM_CONFIGURATION_UPDATE = "com.android.omadm.service.CONFIGURATION_UPDATE";
    public static final java.lang.String ACTION_CARRIER_CERTIFICATE_DOWNLOAD = "com.android.internal.telephony.ACTION_CARRIER_CERTIFICATE_DOWNLOAD";
    public static final java.lang.String ACTION_LINE1_NUMBER_ERROR_DETECTED = "com.android.internal.telephony.ACTION_LINE1_NUMBER_ERROR_DETECTED";
    public static final java.lang.String ACTION_REPORT_RADIO_BUG = "com.android.internal.telephony.ACTION_REPORT_RADIO_BUG";
    public static final java.lang.String EXTRA_SLOT_ID = "slotId";
    public static final java.lang.String EXTRA_RADIO_BUG_TYPE = "radioBugType";
    public TelephonyIntents() {}
}

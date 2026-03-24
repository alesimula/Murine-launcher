package com.android.ims;

@java.lang.Deprecated
public class ImsConfig {
    public static final java.lang.String ACTION_IMS_FEATURE_CHANGED = "com.android.intent.action.IMS_FEATURE_CHANGED";
    public static final java.lang.String ACTION_IMS_CONFIG_CHANGED = "com.android.intent.action.IMS_CONFIG_CHANGED";
    public static final java.lang.String EXTRA_CHANGED_ITEM = "item";
    public static final java.lang.String EXTRA_NEW_VALUE = "value";
    public ImsConfig(android.telephony.ims.aidl.IImsConfig p0) {}
    public int getProvisionedValue(int p0) throws com.android.ims.ImsException { return 0; }
    public int getConfigInt(int p0) throws com.android.ims.ImsException { return 0; }
    public java.lang.String getProvisionedStringValue(int p0) throws com.android.ims.ImsException { return null; }
    public java.lang.String getConfigString(int p0) throws com.android.ims.ImsException { return null; }
    public int setProvisionedValue(int p0, int p1) throws com.android.ims.ImsException { return 0; }
    public int setProvisionedStringValue(int p0, java.lang.String p1) throws com.android.ims.ImsException { return 0; }
    public int setConfig(int p0, int p1) throws com.android.ims.ImsException { return 0; }
    public int setConfig(int p0, java.lang.String p1) throws com.android.ims.ImsException { return 0; }
    public void addConfigCallback(android.telephony.ims.ProvisioningManager.Callback p0) throws com.android.ims.ImsException {}
    public void addConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws com.android.ims.ImsException {}
    public void removeConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws com.android.ims.ImsException {}
    public boolean isBinderAlive() { return false; }

    public static class ConfigConstants {
        public static final int CONFIG_START = 0;
        public static final int PROVISIONED_CONFIG_START = 0;
        @java.lang.Deprecated
        public static final int VOCODER_AMRMODESET = 0;
        @java.lang.Deprecated
        public static final int VOCODER_AMRWBMODESET = 1;
        @java.lang.Deprecated
        public static final int SIP_SESSION_TIMER = 2;
        @java.lang.Deprecated
        public static final int MIN_SE = 3;
        @java.lang.Deprecated
        public static final int CANCELLATION_TIMER = 4;
        @java.lang.Deprecated
        public static final int TDELAY = 5;
        @java.lang.Deprecated
        public static final int SILENT_REDIAL_ENABLE = 6;
        @java.lang.Deprecated
        public static final int SIP_T1_TIMER = 7;
        @java.lang.Deprecated
        public static final int SIP_T2_TIMER = 8;
        @java.lang.Deprecated
        public static final int SIP_TF_TIMER = 9;
        @java.lang.Deprecated
        public static final int VLT_SETTING_ENABLED = 10;
        @java.lang.Deprecated
        public static final int LVC_SETTING_ENABLED = 11;
        @java.lang.Deprecated
        public static final int DOMAIN_NAME = 12;
        @java.lang.Deprecated
        public static final int SMS_FORMAT = 13;
        @java.lang.Deprecated
        public static final int SMS_OVER_IP = 14;
        @java.lang.Deprecated
        public static final int PUBLISH_TIMER = 15;
        @java.lang.Deprecated
        public static final int PUBLISH_TIMER_EXTENDED = 16;
        @java.lang.Deprecated
        public static final int CAPABILITY_DISCOVERY_ENABLED = 17;
        @java.lang.Deprecated
        public static final int CAPABILITIES_CACHE_EXPIRATION = 18;
        @java.lang.Deprecated
        public static final int AVAILABILITY_CACHE_EXPIRATION = 19;
        @java.lang.Deprecated
        public static final int CAPABILITIES_POLL_INTERVAL = 20;
        @java.lang.Deprecated
        public static final int SOURCE_THROTTLE_PUBLISH = 21;
        @java.lang.Deprecated
        public static final int MAX_NUMENTRIES_IN_RCL = 22;
        @java.lang.Deprecated
        public static final int CAPAB_POLL_LIST_SUB_EXP = 23;
        @java.lang.Deprecated
        public static final int GZIP_FLAG = 24;
        @java.lang.Deprecated
        public static final int EAB_SETTING_ENABLED = 25;
        @java.lang.Deprecated
        public static final int VOICE_OVER_WIFI_ROAMING = 26;
        @java.lang.Deprecated
        public static final int VOICE_OVER_WIFI_MODE = 27;
        @java.lang.Deprecated
        public static final int VOICE_OVER_WIFI_SETTING_ENABLED = 28;
        @java.lang.Deprecated
        public static final int MOBILE_DATA_ENABLED = 29;
        @java.lang.Deprecated
        public static final int VOLTE_USER_OPT_IN_STATUS = 30;
        @java.lang.Deprecated
        public static final int LBO_PCSCF_ADDRESS = 31;
        @java.lang.Deprecated
        public static final int KEEP_ALIVE_ENABLED = 32;
        @java.lang.Deprecated
        public static final int REGISTRATION_RETRY_BASE_TIME_SEC = 33;
        @java.lang.Deprecated
        public static final int REGISTRATION_RETRY_MAX_TIME_SEC = 34;
        @java.lang.Deprecated
        public static final int SPEECH_START_PORT = 35;
        @java.lang.Deprecated
        public static final int SPEECH_END_PORT = 36;
        @java.lang.Deprecated
        public static final int SIP_INVITE_REQ_RETX_INTERVAL_MSEC = 37;
        @java.lang.Deprecated
        public static final int SIP_INVITE_RSP_WAIT_TIME_MSEC = 38;
        @java.lang.Deprecated
        public static final int SIP_INVITE_RSP_RETX_WAIT_TIME_MSEC = 39;
        @java.lang.Deprecated
        public static final int SIP_NON_INVITE_REQ_RETX_INTERVAL_MSEC = 40;
        @java.lang.Deprecated
        public static final int SIP_NON_INVITE_TXN_TIMEOUT_TIMER_MSEC = 41;
        @java.lang.Deprecated
        public static final int SIP_INVITE_RSP_RETX_INTERVAL_MSEC = 42;
        @java.lang.Deprecated
        public static final int SIP_ACK_RECEIPT_WAIT_TIME_MSEC = 43;
        @java.lang.Deprecated
        public static final int SIP_ACK_RETX_WAIT_TIME_MSEC = 44;
        @java.lang.Deprecated
        public static final int SIP_NON_INVITE_REQ_RETX_WAIT_TIME_MSEC = 45;
        @java.lang.Deprecated
        public static final int SIP_NON_INVITE_RSP_RETX_WAIT_TIME_MSEC = 46;
        @java.lang.Deprecated
        public static final int AMR_WB_OCTET_ALIGNED_PT = 47;
        @java.lang.Deprecated
        public static final int AMR_WB_BANDWIDTH_EFFICIENT_PT = 48;
        @java.lang.Deprecated
        public static final int AMR_OCTET_ALIGNED_PT = 49;
        @java.lang.Deprecated
        public static final int AMR_BANDWIDTH_EFFICIENT_PT = 50;
        @java.lang.Deprecated
        public static final int DTMF_WB_PT = 51;
        @java.lang.Deprecated
        public static final int DTMF_NB_PT = 52;
        @java.lang.Deprecated
        public static final int AMR_DEFAULT_MODE = 53;
        @java.lang.Deprecated
        public static final int SMS_PSI = 54;
        @java.lang.Deprecated
        public static final int VIDEO_QUALITY = 55;
        @java.lang.Deprecated
        public static final int TH_LTE1 = 56;
        @java.lang.Deprecated
        public static final int TH_LTE2 = 57;
        @java.lang.Deprecated
        public static final int TH_LTE3 = 58;
        @java.lang.Deprecated
        public static final int TH_1x = 59;
        @java.lang.Deprecated
        public static final int VOWT_A = 60;
        @java.lang.Deprecated
        public static final int VOWT_B = 61;
        @java.lang.Deprecated
        public static final int T_EPDG_LTE = 62;
        @java.lang.Deprecated
        public static final int T_EPDG_WIFI = 63;
        @java.lang.Deprecated
        public static final int T_EPDG_1X = 64;
        @java.lang.Deprecated
        public static final int VICE_SETTING_ENABLED = 65;
        @java.lang.Deprecated
        public static final int RTT_SETTING_ENABLED = 66;
        public static final int PROVISIONED_CONFIG_END = 67;
        public ConfigConstants() {}
    }

    public static class FeatureConstants {
        public static final int FEATURE_TYPE_UNKNOWN = -1;
        public static final int FEATURE_TYPE_VOICE_OVER_LTE = 0;
        public static final int FEATURE_TYPE_VIDEO_OVER_LTE = 1;
        public static final int FEATURE_TYPE_VOICE_OVER_WIFI = 2;
        public static final int FEATURE_TYPE_VIDEO_OVER_WIFI = 3;
        public static final int FEATURE_TYPE_UT_OVER_LTE = 4;
        public static final int FEATURE_TYPE_UT_OVER_WIFI = 5;
        public FeatureConstants() {}
    }

    public static class FeatureValueConstants {
        public static final int ERROR = -1;
        public static final int OFF = 0;
        public static final int ON = 1;
        public FeatureValueConstants() {}
    }

    public static class OperationStatusConstants {
        public static final int UNKNOWN = -1;
        public static final int SUCCESS = 0;
        public static final int FAILED = 1;
        public static final int UNSUPPORTED_CAUSE_NONE = 2;
        public static final int UNSUPPORTED_CAUSE_RAT = 3;
        public static final int UNSUPPORTED_CAUSE_DISABLED = 4;
        public OperationStatusConstants() {}
    }

    public static class OperationValuesConstants {
        public static final int VIDEO_QUALITY_UNKNOWN = -1;
        public static final int VIDEO_QUALITY_LOW = 0;
        public static final int VIDEO_QUALITY_HIGH = 1;
        public OperationValuesConstants() {}
    }

    public static class VideoQualityFeatureValuesConstants {
        public static final int LOW = 0;
        public static final int HIGH = 1;
        public VideoQualityFeatureValuesConstants() {}
    }

    public static class WfcModeFeatureValueConstants {
        public static final int WIFI_ONLY = 0;
        public static final int CELLULAR_PREFERRED = 1;
        public static final int WIFI_PREFERRED = 2;
        public WfcModeFeatureValueConstants() {}
    }
}

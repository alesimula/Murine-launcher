package android.telephony.ims;

@android.annotation.SystemApi
public class ProvisioningManager {
    public static final java.lang.String STRING_QUERY_RESULT_ERROR_GENERIC = "STRING_QUERY_RESULT_ERROR_GENERIC";
    public static final java.lang.String STRING_QUERY_RESULT_ERROR_NOT_READY = "STRING_QUERY_RESULT_ERROR_NOT_READY";
    public static final int PROVISIONING_RESULT_UNKNOWN = -1;
    public static final int PROVISIONING_VALUE_DISABLED = 0;
    public static final int PROVISIONING_VALUE_ENABLED = 1;
    public static final int KEY_AMR_CODEC_MODE_SET_VALUES = 0;
    public static final int KEY_AMR_WB_CODEC_MODE_SET_VALUES = 1;
    public static final int KEY_SIP_SESSION_TIMER_SEC = 2;
    public static final int KEY_MINIMUM_SIP_SESSION_EXPIRATION_TIMER_SEC = 3;
    public static final int KEY_SIP_INVITE_CANCELLATION_TIMER_MS = 4;
    public static final int KEY_TRANSITION_TO_LTE_DELAY_MS = 5;
    public static final int KEY_ENABLE_SILENT_REDIAL = 6;
    public static final int KEY_T1_TIMER_VALUE_MS = 7;
    public static final int KEY_T2_TIMER_VALUE_MS = 8;
    public static final int KEY_TF_TIMER_VALUE_MS = 9;
    public static final int KEY_VOLTE_PROVISIONING_STATUS = 10;
    public static final int KEY_VT_PROVISIONING_STATUS = 11;
    public static final int KEY_REGISTRATION_DOMAIN_NAME = 12;
    public static final int KEY_SMS_FORMAT = 13;
    public static final int SMS_FORMAT_3GPP2 = 0;
    public static final int SMS_FORMAT_3GPP = 1;
    public static final int KEY_SMS_OVER_IP_ENABLED = 14;
    public static final int KEY_RCS_PUBLISH_TIMER_SEC = 15;
    public static final int KEY_RCS_PUBLISH_OFFLINE_AVAILABILITY_TIMER_SEC = 16;
    public static final int KEY_RCS_CAPABILITY_DISCOVERY_ENABLED = 17;
    public static final int KEY_RCS_CAPABILITIES_CACHE_EXPIRATION_SEC = 18;
    public static final int KEY_RCS_AVAILABILITY_CACHE_EXPIRATION_SEC = 19;
    public static final int KEY_RCS_CAPABILITIES_POLL_INTERVAL_SEC = 20;
    public static final int KEY_RCS_PUBLISH_SOURCE_THROTTLE_MS = 21;
    public static final int KEY_RCS_MAX_NUM_ENTRIES_IN_RCL = 22;
    public static final int KEY_RCS_CAPABILITY_POLL_LIST_SUB_EXP_SEC = 23;
    public static final int KEY_USE_GZIP_FOR_LIST_SUBSCRIPTION = 24;
    public static final int KEY_EAB_PROVISIONING_STATUS = 25;
    public static final int KEY_VOICE_OVER_WIFI_ROAMING_ENABLED_OVERRIDE = 26;
    public static final int KEY_VOICE_OVER_WIFI_MODE_OVERRIDE = 27;
    public static final int KEY_VOICE_OVER_WIFI_ENABLED_OVERRIDE = 28;
    public static final int KEY_MOBILE_DATA_ENABLED = 29;
    public static final int KEY_VOLTE_USER_OPT_IN_STATUS = 30;
    public static final int KEY_LOCAL_BREAKOUT_PCSCF_ADDRESS = 31;
    public static final int KEY_SIP_KEEP_ALIVE_ENABLED = 32;
    public static final int KEY_REGISTRATION_RETRY_BASE_TIME_SEC = 33;
    public static final int KEY_REGISTRATION_RETRY_MAX_TIME_SEC = 34;
    public static final int KEY_RTP_SPEECH_START_PORT = 35;
    public static final int KEY_RTP_SPEECH_END_PORT = 36;
    public static final int KEY_SIP_INVITE_REQUEST_TRANSMIT_INTERVAL_MS = 37;
    public static final int KEY_SIP_INVITE_ACK_WAIT_TIME_MS = 38;
    public static final int KEY_SIP_INVITE_RESPONSE_RETRANSMIT_WAIT_TIME_MS = 39;
    public static final int KEY_SIP_NON_INVITE_REQUEST_RETRANSMIT_INTERVAL_MS = 40;
    public static final int KEY_SIP_NON_INVITE_TRANSACTION_TIMEOUT_TIMER_MS = 41;
    public static final int KEY_SIP_INVITE_RESPONSE_RETRANSMIT_INTERVAL_MS = 42;
    public static final int KEY_SIP_ACK_RECEIPT_WAIT_TIME_MS = 43;
    public static final int KEY_SIP_ACK_RETRANSMIT_WAIT_TIME_MS = 44;
    public static final int KEY_SIP_NON_INVITE_REQUEST_RETRANSMISSION_WAIT_TIME_MS = 45;
    public static final int KEY_SIP_NON_INVITE_RESPONSE_RETRANSMISSION_WAIT_TIME_MS = 46;
    public static final int KEY_AMR_WB_OCTET_ALIGNED_PAYLOAD_TYPE = 47;
    public static final int KEY_AMR_WB_BANDWIDTH_EFFICIENT_PAYLOAD_TYPE = 48;
    public static final int KEY_AMR_OCTET_ALIGNED_PAYLOAD_TYPE = 49;
    public static final int KEY_AMR_BANDWIDTH_EFFICIENT_PAYLOAD_TYPE = 50;
    public static final int KEY_DTMF_WB_PAYLOAD_TYPE = 51;
    public static final int KEY_DTMF_NB_PAYLOAD_TYPE = 52;
    public static final int KEY_AMR_DEFAULT_ENCODING_MODE = 53;
    public static final int KEY_SMS_PUBLIC_SERVICE_IDENTITY = 54;
    public static final int KEY_VIDEO_QUALITY = 55;
    public static final int VIDEO_QUALITY_LOW = 0;
    public static final int VIDEO_QUALITY_HIGH = 1;
    public static final int KEY_LTE_THRESHOLD_1 = 56;
    public static final int KEY_LTE_THRESHOLD_2 = 57;
    public static final int KEY_LTE_THRESHOLD_3 = 58;
    public static final int KEY_1X_THRESHOLD = 59;
    public static final int KEY_WIFI_THRESHOLD_A = 60;
    public static final int KEY_WIFI_THRESHOLD_B = 61;
    public static final int KEY_LTE_EPDG_TIMER_SEC = 62;
    public static final int KEY_WIFI_EPDG_TIMER_SEC = 63;
    public static final int KEY_1X_EPDG_TIMER_SEC = 64;
    public static final int KEY_MULTIENDPOINT_ENABLED = 65;
    public static final int KEY_RTT_ENABLED = 66;
    public static final int KEY_VOICE_OVER_WIFI_ENTITLEMENT_ID = 67;
    public static final int KEY_VOIMS_OPT_IN_STATUS = 68;
    private int mSubId;
    @android.annotation.RequiresPermission("android.permission.PERFORM_IMS_SINGLE_REGISTRATION")
    public static final java.lang.String ACTION_RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE = "android.telephony.ims.action.RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE";
    public static final java.lang.String EXTRA_SUBSCRIPTION_ID = "android.telephony.ims.extra.SUBSCRIPTION_ID";
    public static final java.lang.String EXTRA_STATUS = "android.telephony.ims.extra.STATUS";
    public static final int STATUS_CAPABLE = 0;
    public static final int STATUS_DEVICE_NOT_CAPABLE = 1;
    public static final int STATUS_CARRIER_NOT_CAPABLE = 2;
    public static android.telephony.ims.ProvisioningManager createForSubscriptionId(int p0) { return null; }
    private ProvisioningManager(int p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void registerProvisioningChangedCallback(java.util.concurrent.Executor p0, android.telephony.ims.ProvisioningManager.Callback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void unregisterProvisioningChangedCallback(android.telephony.ims.ProvisioningManager.Callback p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getProvisioningIntValue(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getProvisioningStringValue(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setProvisioningIntValue(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setProvisioningStringValue(int p0, java.lang.String p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setProvisioningStatusForCapability(int p0, int p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean getProvisioningStatusForCapability(int p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean getRcsProvisioningStatusForCapability(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setRcsProvisioningStatusForCapability(int p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.PERFORM_IMS_SINGLE_REGISTRATION")
    public void setRcsClientConfiguration(android.telephony.ims.RcsClientConfiguration p0) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.PERFORM_IMS_SINGLE_REGISTRATION"})
    public boolean isRcsVolteSingleRegistrationCapable() throws android.telephony.ims.ImsException { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.PERFORM_IMS_SINGLE_REGISTRATION"})
    public void registerRcsProvisioningCallback(java.util.concurrent.Executor p0, android.telephony.ims.ProvisioningManager.RcsProvisioningCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.PERFORM_IMS_SINGLE_REGISTRATION"})
    public void unregisterRcsProvisioningCallback(android.telephony.ims.ProvisioningManager.RcsProvisioningCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.PERFORM_IMS_SINGLE_REGISTRATION")
    public void triggerRcsReconfiguration() {}
    private static com.android.internal.telephony.ITelephony getITelephony() { return null; }

    public static class Callback {
        private final android.telephony.ims.ProvisioningManager.Callback.CallbackBinder mBinder = null;
        public Callback() {}
        public void onProvisioningIntChanged(int p0, int p1) {}
        public void onProvisioningStringChanged(int p0, java.lang.String p1) {}
        public final android.telephony.ims.aidl.IImsConfigCallback getBinder() { return null; }
        public void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CallbackBinder extends android.telephony.ims.aidl.IImsConfigCallback.Stub {
            private final android.telephony.ims.ProvisioningManager.Callback mLocalConfigurationCallback = null;
            private java.util.concurrent.Executor mExecutor;
            private CallbackBinder(android.telephony.ims.ProvisioningManager.Callback p0) { super(); }
            public final void onIntConfigChanged(int p0, int p1) {}
            public final void onStringConfigChanged(int p0, java.lang.String p1) {}
            private void setExecutor(java.util.concurrent.Executor p0) {}
        }
    }

    public static class RcsProvisioningCallback {
        private final android.telephony.ims.ProvisioningManager.RcsProvisioningCallback.CallbackBinder mBinder = null;
        public RcsProvisioningCallback() {}
        public void onConfigurationChanged(byte[] p0) {}
        public void onAutoConfigurationErrorReceived(int p0, java.lang.String p1) {}
        public void onConfigurationReset() {}
        public void onRemoved() {}
        public void onPreProvisioningReceived(byte[] p0) {}
        public final android.telephony.ims.aidl.IRcsConfigCallback getBinder() { return null; }
        public void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CallbackBinder extends android.telephony.ims.aidl.IRcsConfigCallback.Stub {
            private final android.telephony.ims.ProvisioningManager.RcsProvisioningCallback mLocalCallback = null;
            private java.util.concurrent.Executor mExecutor;
            private CallbackBinder(android.telephony.ims.ProvisioningManager.RcsProvisioningCallback p0) { super(); }
            public void onConfigurationChanged(byte[] p0) {}
            public void onAutoConfigurationErrorReceived(int p0, java.lang.String p1) {}
            public void onConfigurationReset() {}
            public void onRemoved() {}
            public void onPreProvisioningReceived(byte[] p0) {}
            private void setExecutor(java.util.concurrent.Executor p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringResultError {
    }
}

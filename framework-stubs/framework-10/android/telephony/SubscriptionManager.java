package android.telephony;

public class SubscriptionManager {
    private static final java.lang.String LOG_TAG = "SubscriptionManager";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    public static final int INVALID_SUBSCRIPTION_ID = -1;
    public static final int DUMMY_SUBSCRIPTION_ID_BASE = -2;
    public static final int INVALID_PHONE_INDEX = -1;
    public static final int INVALID_SIM_SLOT_INDEX = -1;
    public static final int DEFAULT_SUBSCRIPTION_ID = 2147483647;
    public static final int DEFAULT_PHONE_INDEX = 2147483647;
    public static final int DEFAULT_SIM_SLOT_INDEX = 2147483647;
    public static final int MIN_SUBSCRIPTION_ID_VALUE = 0;
    public static final int MAX_SUBSCRIPTION_ID_VALUE = 2147483646;
    @android.annotation.UnsupportedAppUsage
    public static final android.net.Uri CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri WFC_ENABLED_CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri ADVANCED_CALLING_ENABLED_CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri WFC_MODE_CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri WFC_ROAMING_MODE_CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri VT_ENABLED_CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri WFC_ROAMING_ENABLED_CONTENT_URI = null;
    public static final java.lang.String UNIQUE_KEY_SUBSCRIPTION_ID = "_id";
    public static final java.lang.String ICC_ID = "icc_id";
    public static final java.lang.String SIM_SLOT_INDEX = "sim_id";
    public static final int SIM_NOT_INSERTED = -1;
    public static final int SLOT_INDEX_FOR_REMOTE_SIM_SUB = -1;
    public static final java.lang.String SUBSCRIPTION_TYPE = "subscription_type";
    @java.lang.Deprecated
    public static final java.lang.String WHITE_LISTED_APN_DATA = "white_listed_apn_data";
    public static final java.lang.String DATA_ENABLED_OVERRIDE_RULES = "data_enabled_override_rules";
    public static final int SUBSCRIPTION_TYPE_LOCAL_SIM = 0;
    public static final int SUBSCRIPTION_TYPE_REMOTE_SIM = 1;
    public static final java.lang.String DISPLAY_NAME = "display_name";
    public static final java.lang.String CARRIER_NAME = "carrier_name";
    public static final int DEFAULT_NAME_RES = 17039374;
    public static final java.lang.String NAME_SOURCE = "name_source";
    public static final int NAME_SOURCE_DEFAULT_SOURCE = 0;
    public static final int NAME_SOURCE_SIM_SOURCE = 1;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final int NAME_SOURCE_USER_INPUT = 2;
    public static final int NAME_SOURCE_CARRIER = 3;
    public static final java.lang.String COLOR = "color";
    public static final int COLOR_1 = 0;
    public static final int COLOR_2 = 1;
    public static final int COLOR_3 = 2;
    public static final int COLOR_4 = 3;
    public static final int COLOR_DEFAULT = 0;
    public static final java.lang.String NUMBER = "number";
    public static final java.lang.String DISPLAY_NUMBER_FORMAT = "display_number_format";
    public static final int DISPLAY_NUMBER_NONE = 0;
    public static final int DISPLAY_NUMBER_FIRST = 1;
    public static final int DISPLAY_NUMBER_LAST = 2;
    public static final int DISPLAY_NUMBER_DEFAULT = 1;
    public static final java.lang.String DATA_ROAMING = "data_roaming";
    public static final int DATA_ROAMING_ENABLE = 1;
    public static final int DATA_ROAMING_DISABLE = 0;
    public static final int DATA_ROAMING_DEFAULT = 0;
    public static final int SIM_PROVISIONED = 0;
    public static final java.lang.String CARRIER_ID = "carrier_id";
    public static final java.lang.String EHPLMNS = "ehplmns";
    public static final java.lang.String HPLMNS = "hplmns";
    public static final java.lang.String MCC_STRING = "mcc_string";
    public static final java.lang.String MNC_STRING = "mnc_string";
    public static final java.lang.String MCC = "mcc";
    public static final java.lang.String MNC = "mnc";
    public static final java.lang.String ISO_COUNTRY_CODE = "iso_country_code";
    public static final java.lang.String SIM_PROVISIONING_STATUS = "sim_provisioning_status";
    public static final java.lang.String IS_EMBEDDED = "is_embedded";
    public static final java.lang.String CARD_ID = "card_id";
    public static final java.lang.String ACCESS_RULES = "access_rules";
    public static final java.lang.String IS_REMOVABLE = "is_removable";
    public static final java.lang.String CB_EXTREME_THREAT_ALERT = "enable_cmas_extreme_threat_alerts";
    public static final java.lang.String CB_SEVERE_THREAT_ALERT = "enable_cmas_severe_threat_alerts";
    public static final java.lang.String CB_AMBER_ALERT = "enable_cmas_amber_alerts";
    public static final java.lang.String CB_EMERGENCY_ALERT = "enable_emergency_alerts";
    public static final java.lang.String CB_ALERT_SOUND_DURATION = "alert_sound_duration";
    public static final java.lang.String CB_ALERT_REMINDER_INTERVAL = "alert_reminder_interval";
    public static final java.lang.String CB_ALERT_VIBRATE = "enable_alert_vibrate";
    public static final java.lang.String CB_ALERT_SPEECH = "enable_alert_speech";
    public static final java.lang.String CB_ETWS_TEST_ALERT = "enable_etws_test_alerts";
    public static final java.lang.String CB_CHANNEL_50_ALERT = "enable_channel_50_alerts";
    public static final java.lang.String CB_CMAS_TEST_ALERT = "enable_cmas_test_alerts";
    public static final java.lang.String CB_OPT_OUT_DIALOG = "show_cmas_opt_out_dialog";
    public static final java.lang.String ENHANCED_4G_MODE_ENABLED = "volte_vt_enabled";
    public static final java.lang.String VT_IMS_ENABLED = "vt_ims_enabled";
    public static final java.lang.String WFC_IMS_ENABLED = "wfc_ims_enabled";
    public static final java.lang.String WFC_IMS_MODE = "wfc_ims_mode";
    public static final java.lang.String WFC_IMS_ROAMING_MODE = "wfc_ims_roaming_mode";
    public static final java.lang.String WFC_IMS_ROAMING_ENABLED = "wfc_ims_roaming_enabled";
    public static final java.lang.String IS_OPPORTUNISTIC = "is_opportunistic";
    public static final java.lang.String GROUP_UUID = "group_uuid";
    public static final java.lang.String GROUP_OWNER = "group_owner";
    public static final java.lang.String IS_METERED = "is_metered";
    public static final java.lang.String PROFILE_CLASS = "profile_class";
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_TESTING = 0;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_PROVISIONING = 1;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_OPERATIONAL = 2;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_UNSET = -1;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_DEFAULT = -1;
    public static final java.lang.String IMSI = "imsi";
    public static final java.lang.String SUB_DEFAULT_CHANGED_ACTION = "android.intent.action.SUB_DEFAULT_CHANGED";
    public static final java.lang.String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_MANAGE_SUBSCRIPTION_PLANS = "android.telephony.action.MANAGE_SUBSCRIPTION_PLANS";
    public static final java.lang.String ACTION_REFRESH_SUBSCRIPTION_PLANS = "android.telephony.action.REFRESH_SUBSCRIPTION_PLANS";
    public static final java.lang.String ACTION_SUBSCRIPTION_PLANS_CHANGED = "android.telephony.action.SUBSCRIPTION_PLANS_CHANGED";
    public static final java.lang.String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
    private final android.content.Context mContext = null;
    private volatile android.net.INetworkPolicyManager mNetworkPolicy;
    public static android.net.Uri getUriForSubscriptionId(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public SubscriptionManager(android.content.Context p0) {}
    @java.lang.Deprecated
    public static android.telephony.SubscriptionManager from(android.content.Context p0) { return null; }
    private final android.net.INetworkPolicyManager getNetworkPolicy() { return null; }
    public void addOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) {}
    public void removeOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) {}
    public void addOnOpportunisticSubscriptionsChangedListener(java.util.concurrent.Executor p0, android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p1) {}
    public void removeOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p0) {}
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0) { return null; }
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccIndex(java.lang.String p0) { return null; }
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.telephony.SubscriptionInfo> getAllSubscriptionInfoList() { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList() { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(boolean p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList() { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList() { return null; }
    @android.annotation.SystemApi
    public void requestEmbeddedSubscriptionInfoListRefresh() {}
    @android.annotation.SystemApi
    public void requestEmbeddedSubscriptionInfoListRefresh(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getAllSubscriptionInfoCount() { return 0; }
    public int getActiveSubscriptionInfoCount() { return 0; }
    public int getActiveSubscriptionInfoCountMax() { return 0; }
    public android.net.Uri addSubscriptionInfoRecord(java.lang.String p0, int p1) { return null; }
    public void addSubscriptionInfoRecord(java.lang.String p0, java.lang.String p1, int p2, int p3) {}
    public void removeSubscriptionInfoRecord(java.lang.String p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public int setIconTint(int p0, int p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int setDisplayName(java.lang.String p0, int p1, int p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int setDisplayNumber(java.lang.String p0, int p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int setDataRoaming(int p0, int p1) { return 0; }
    public static int getSlotIndex(int p0) { return 0; }
    public int[] getSubscriptionIds(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int[] getSubId(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static int getPhoneId(int p0) { return 0; }
    private static void logd(java.lang.String p0) {}
    private static void loge(java.lang.String p0) {}
    public static int getDefaultSubscriptionId() { return 0; }
    public static int getDefaultVoiceSubscriptionId() { return 0; }
    public void setDefaultVoiceSubId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.telephony.SubscriptionInfo getDefaultVoiceSubscriptionInfo() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int getDefaultVoicePhoneId() { return 0; }
    public static int getDefaultSmsSubscriptionId() { return 0; }
    @android.annotation.SystemApi
    public void setDefaultSmsSubId(int p0) {}
    public android.telephony.SubscriptionInfo getDefaultSmsSubscriptionInfo() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getDefaultSmsPhoneId() { return 0; }
    public static int getDefaultDataSubscriptionId() { return 0; }
    @android.annotation.SystemApi
    public void setDefaultDataSubId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.telephony.SubscriptionInfo getDefaultDataSubscriptionInfo() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getDefaultDataPhoneId() { return 0; }
    public void clearSubscriptionInfo() {}
    public boolean allDefaultsSelected() { return false; }
    public static boolean isValidSubscriptionId(int p0) { return false; }
    public static boolean isUsableSubscriptionId(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static boolean isUsableSubIdValue(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static boolean isValidSlotIndex(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isValidPhoneId(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static void putPhoneIdAndSubIdExtra(android.content.Intent p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public static void putPhoneIdAndSubIdExtra(android.content.Intent p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public int[] getActiveSubscriptionIdList() { return null; }
    public int[] getActiveSubscriptionIdList(boolean p0) { return null; }
    public boolean isNetworkRoaming(int p0) { return false; }
    public static int getSimStateForSlotIndex(int p0) { return 0; }
    public static void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) {}
    private static java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, android.content.Context p2) { return null; }
    public static boolean getBooleanSubscriptionProperty(int p0, java.lang.String p1, boolean p2, android.content.Context p3) { return false; }
    public static int getIntegerSubscriptionProperty(int p0, java.lang.String p1, int p2, android.content.Context p3) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static android.content.res.Resources getResourcesForSubId(android.content.Context p0, int p1) { return null; }
    public static android.content.res.Resources getResourcesForSubId(android.content.Context p0, int p1, boolean p2) { return null; }
    public boolean isActiveSubscriptionId(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isActiveSubId(int p0) { return false; }
    public java.util.List<android.telephony.SubscriptionPlan> getSubscriptionPlans(int p0) { return null; }
    public void setSubscriptionPlans(int p0, java.util.List<android.telephony.SubscriptionPlan> p1) {}
    private java.lang.String getSubscriptionPlansOwner(int p0) { return null; }
    public void setSubscriptionOverrideUnmetered(int p0, boolean p1, long p2) {}
    public void setSubscriptionOverrideCongested(int p0, boolean p1, long p2) {}
    public android.content.Intent createManageSubscriptionIntent(int p0) { return null; }
    private android.content.Intent createRefreshSubscriptionIntent(int p0) { return null; }
    public boolean isSubscriptionPlansRefreshSupported(int p0) { return false; }
    public void requestSubscriptionPlansRefresh(int p0) {}
    public boolean canManageSubscription(android.telephony.SubscriptionInfo p0) { return false; }
    public boolean canManageSubscription(android.telephony.SubscriptionInfo p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public void setPreferredDataSubscriptionId(int p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    public int getPreferredDataSubscriptionId() { return 0; }
    public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions() { return null; }
    public void switchToSubscription(int p0, android.app.PendingIntent p1) {}
    public boolean setOpportunistic(boolean p0, int p1) { return false; }
    public android.os.ParcelUuid createSubscriptionGroup(java.util.List<java.lang.Integer> p0) { return null; }
    public void addSubscriptionsIntoGroup(java.util.List<java.lang.Integer> p0, android.os.ParcelUuid p1) {}
    private boolean isSystemProcess() { return false; }
    public void removeSubscriptionsFromGroup(java.util.List<java.lang.Integer> p0, android.os.ParcelUuid p1) {}
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0) { return null; }
    public boolean isSubscriptionVisible(android.telephony.SubscriptionInfo p0) { return false; }
    public java.util.List<android.telephony.SubscriptionInfo> getSelectableSubscriptionInfoList() { return null; }
    @android.annotation.SystemApi
    public boolean setSubscriptionEnabled(int p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    public boolean isSubscriptionEnabled(int p0) { return false; }
    @android.annotation.SystemApi
    public int getEnabledSubscriptionId(int p0) { return 0; }
    public boolean setAlwaysAllowMmsData(int p0, boolean p1) { return false; }
    private int setSubscriptionPropertyHelper(int p0, java.lang.String p1, android.telephony.SubscriptionManager.CallISubMethodHelper p2) { return 0; }
    public static int getActiveDataSubscriptionId() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriptionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileClass {
    }

    public static class OnSubscriptionsChangedListener {
        private final android.os.Handler mHandler = null;
        com.android.internal.telephony.IOnSubscriptionsChangedListener callback;
        public OnSubscriptionsChangedListener() {}
        public OnSubscriptionsChangedListener(android.os.Looper p0) {}
        public void onSubscriptionsChanged() {}
        private void log(java.lang.String p0) {}

        private class OnSubscriptionsChangedListenerHandler extends android.os.Handler {
            OnSubscriptionsChangedListenerHandler(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) { super(); }
            OnSubscriptionsChangedListenerHandler(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }

    public static class OnOpportunisticSubscriptionsChangedListener {
        private java.util.concurrent.Executor mExecutor;
        com.android.internal.telephony.IOnSubscriptionsChangedListener callback;
        public OnOpportunisticSubscriptionsChangedListener() {}
        public void onOpportunisticSubscriptionsChanged() {}
        private void setExecutor(java.util.concurrent.Executor p0) {}
        private void log(java.lang.String p0) {}
    }

    private static interface CallISubMethodHelper {
        public int callMethod(com.android.internal.telephony.ISub p0) throws android.os.RemoteException;
    }
}

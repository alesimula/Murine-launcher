package android.telephony;

public class SubscriptionManager {
    public static final int INVALID_SUBSCRIPTION_ID = -1;
    public static final int PLACEHOLDER_SUBSCRIPTION_ID_BASE = -2;
    public static final int INVALID_PHONE_INDEX = -1;
    public static final int INVALID_SIM_SLOT_INDEX = -1;
    public static final int DEFAULT_SUBSCRIPTION_ID = 2147483647;
    public static final int DEFAULT_PHONE_INDEX = 2147483647;
    public static final int DEFAULT_SIM_SLOT_INDEX = 2147483647;
    public static final int MIN_SUBSCRIPTION_ID_VALUE = 0;
    public static final int MAX_SUBSCRIPTION_ID_VALUE = 2147483646;
    public static final android.net.Uri CONTENT_URI = null;
    public static final java.lang.String GET_SIM_SPECIFIC_SETTINGS_METHOD_NAME = "getSimSpecificSettings";
    public static final java.lang.String RESTORE_SIM_SPECIFIC_SETTINGS_METHOD_NAME = "restoreSimSpecificSettings";
    public static final java.lang.String KEY_SIM_SPECIFIC_SETTINGS_DATA = "KEY_SIM_SPECIFIC_SETTINGS_DATA";
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
    public static final android.net.Uri SIM_INFO_BACKUP_AND_RESTORE_CONTENT_URI = null;
    public static final android.net.Uri SIM_INFO_SUW_RESTORE_CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final android.net.Uri CROSS_SIM_ENABLED_CONTENT_URI = null;
    public static final java.lang.String UNIQUE_KEY_SUBSCRIPTION_ID = "_id";
    public static final java.lang.String ICC_ID = "icc_id";
    public static final java.lang.String SIM_SLOT_INDEX = "sim_id";
    public static final int SIM_NOT_INSERTED = -1;
    public static final int SLOT_INDEX_FOR_REMOTE_SIM_SUB = -1;
    public static final java.lang.String SUBSCRIPTION_TYPE = "subscription_type";
    public static final java.lang.String TP_MESSAGE_REF = "tp_message_ref";
    public static final java.lang.String ENABLED_MOBILE_DATA_POLICIES = "enabled_mobile_data_policies";
    public static final int SUBSCRIPTION_TYPE_LOCAL_SIM = 0;
    public static final int SUBSCRIPTION_TYPE_REMOTE_SIM = 1;
    public static final java.lang.String DISPLAY_NAME = "display_name";
    public static final java.lang.String CARRIER_NAME = "carrier_name";
    public static final int DEFAULT_NAME_RES = 17039374;
    public static final java.lang.String NAME_SOURCE = "name_source";
    public static final int NAME_SOURCE_UNKNOWN = -1;
    public static final int NAME_SOURCE_CARRIER_ID = 0;
    public static final int NAME_SOURCE_SIM_SPN = 1;
    public static final int NAME_SOURCE_USER_INPUT = 2;
    public static final int NAME_SOURCE_CARRIER = 3;
    public static final int NAME_SOURCE_SIM_PNN = 4;
    public static final int D2D_SHARING_DISABLED = 0;
    public static final int D2D_SHARING_ALL_CONTACTS = 1;
    public static final int D2D_SHARING_SELECTED_CONTACTS = 2;
    public static final int D2D_SHARING_ALL = 3;
    public static final java.lang.String D2D_STATUS_SHARING = "d2d_sharing_status";
    public static final java.lang.String D2D_STATUS_SHARING_SELECTED_CONTACTS = "d2d_sharing_contacts";
    public static final java.lang.String HUE = "color";
    public static final java.lang.String NUMBER = "number";
    public static final java.lang.String DATA_ROAMING = "data_roaming";
    public static final int DATA_ROAMING_ENABLE = 1;
    public static final int DATA_ROAMING_DISABLE = 0;
    public static final java.lang.String CARRIER_ID = "carrier_id";
    public static final java.lang.String EHPLMNS = "ehplmns";
    public static final java.lang.String HPLMNS = "hplmns";
    public static final java.lang.String MCC_STRING = "mcc_string";
    public static final java.lang.String MNC_STRING = "mnc_string";
    public static final java.lang.String MCC = "mcc";
    public static final java.lang.String MNC = "mnc";
    public static final java.lang.String ISO_COUNTRY_CODE = "iso_country_code";
    public static final java.lang.String IS_EMBEDDED = "is_embedded";
    public static final java.lang.String CARD_ID = "card_id";
    public static final java.lang.String ACCESS_RULES = "access_rules";
    public static final java.lang.String ACCESS_RULES_FROM_CARRIER_CONFIGS = "access_rules_from_carrier_configs";
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
    public static final java.lang.String IMS_RCS_UCE_ENABLED = "ims_rcs_uce_enabled";
    public static final java.lang.String CROSS_SIM_CALLING_ENABLED = "cross_sim_calling_enabled";
    public static final java.lang.String IS_OPPORTUNISTIC = "is_opportunistic";
    public static final java.lang.String GROUP_UUID = "group_uuid";
    public static final java.lang.String GROUP_OWNER = "group_owner";
    public static final java.lang.String PROFILE_CLASS = "profile_class";
    public static final java.lang.String PORT_INDEX = "port_index";
    public static final java.lang.String VOIMS_OPT_IN_STATUS = "voims_opt_in_status";
    public static final java.lang.String NR_ADVANCED_CALLING_ENABLED = "nr_advanced_calling_enabled";
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_TESTING = 0;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_PROVISIONING = 1;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_OPERATIONAL = 2;
    @android.annotation.SystemApi
    public static final int PROFILE_CLASS_UNSET = -1;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int PROFILE_CLASS_DEFAULT = -1;
    public static final java.lang.String IMSI = "imsi";
    public static final java.lang.String UICC_APPLICATIONS_ENABLED = "uicc_applications_enabled";
    public static final java.lang.String ALLOWED_NETWORK_TYPES = "allowed_network_types_for_reasons";
    public static final java.lang.String USER_HANDLE = "user_handle";
    public static final java.lang.String SATELLITE_ENABLED = "satellite_enabled";
    public static final int USAGE_SETTING_UNKNOWN = -1;
    public static final int USAGE_SETTING_DEFAULT = 0;
    public static final int USAGE_SETTING_VOICE_CENTRIC = 1;
    public static final int USAGE_SETTING_DATA_CENTRIC = 2;
    public static final java.lang.String USAGE_SETTING = "usage_setting";
    public static final java.lang.String SUB_DEFAULT_CHANGED_ACTION = "android.intent.action.SUB_DEFAULT_CHANGED";
    public static final java.lang.String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED";
    public static final java.lang.String ACTION_MANAGE_SUBSCRIPTION_PLANS = "android.telephony.action.MANAGE_SUBSCRIPTION_PLANS";
    public static final java.lang.String ACTION_REFRESH_SUBSCRIPTION_PLANS = "android.telephony.action.REFRESH_SUBSCRIPTION_PLANS";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_PLANS")
    public static final java.lang.String ACTION_SUBSCRIPTION_PLANS_CHANGED = "android.telephony.action.SUBSCRIPTION_PLANS_CHANGED";
    public static final java.lang.String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
    public static final java.lang.String EXTRA_SLOT_INDEX = "android.telephony.extra.SLOT_INDEX";
    public static final int PHONE_NUMBER_SOURCE_UICC = 1;
    public static final int PHONE_NUMBER_SOURCE_CARRIER = 2;
    public static final int PHONE_NUMBER_SOURCE_IMS = 3;
    public static android.net.Uri getUriForSubscriptionId(int p0) { return null; }
    public SubscriptionManager(android.content.Context p0) {}
    @java.lang.Deprecated
    public static android.telephony.SubscriptionManager from(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public void addOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) {}
    public void addOnSubscriptionsChangedListener(java.util.concurrent.Executor p0, android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p1) {}
    public void removeOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) {}
    public void addOnOpportunisticSubscriptionsChangedListener(java.util.concurrent.Executor p0, android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p1) {}
    public void removeOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIcc(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "carrier privileges"})
    public java.util.List<android.telephony.SubscriptionInfo> getAllSubscriptionInfoList() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList() { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getCompleteActiveSubscriptionInfoList() { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(boolean p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList() { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList() { return null; }
    @android.annotation.SystemApi
    public void requestEmbeddedSubscriptionInfoListRefresh() {}
    @android.annotation.SystemApi
    public void requestEmbeddedSubscriptionInfoListRefresh(int p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int getActiveSubscriptionInfoCount() { return 0; }
    public int getActiveSubscriptionInfoCountMax() { return 0; }
    public android.net.Uri addSubscriptionInfoRecord(java.lang.String p0, int p1) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void addSubscriptionInfoRecord(java.lang.String p0, java.lang.String p1, int p2, int p3) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void removeSubscriptionInfoRecord(java.lang.String p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setIconTint(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setDisplayName(java.lang.String p0, int p1, int p2) { return 0; }
    public int setDisplayNumber(java.lang.String p0, int p1) { return 0; }
    public int setDataRoaming(int p0, int p1) { return 0; }
    public static int getSlotIndex(int p0) { return 0; }
    @java.lang.Deprecated
    public int[] getSubscriptionIds(int p0) { return null; }
    public static int[] getSubId(int p0) { return null; }
    public static int getSubscriptionId(int p0) { return 0; }
    public static int getPhoneId(int p0) { return 0; }
    public static int getDefaultSubscriptionId() { return 0; }
    public static int getDefaultVoiceSubscriptionId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDefaultVoiceSubscriptionId(int p0) {}
    public void setDefaultVoiceSubId(int p0) {}
    public android.telephony.SubscriptionInfo getDefaultVoiceSubscriptionInfo() { return null; }
    public static int getDefaultVoicePhoneId() { return 0; }
    public static int getDefaultSmsSubscriptionId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDefaultSmsSubId(int p0) {}
    public static int getDefaultDataSubscriptionId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDefaultDataSubId(int p0) {}
    public android.telephony.SubscriptionInfo getDefaultDataSubscriptionInfo() { return null; }
    public static boolean isValidSubscriptionId(int p0) { return false; }
    public static boolean isUsableSubscriptionId(int p0) { return false; }
    public static boolean isUsableSubIdValue(int p0) { return false; }
    public static boolean isValidSlotIndex(int p0) { return false; }
    public static boolean isValidPhoneId(int p0) { return false; }
    public static void putPhoneIdAndSubIdExtra(android.content.Intent p0, int p1) {}
    public static void putPhoneIdAndSubIdExtra(android.content.Intent p0, int p1, int p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int[] getActiveSubscriptionIdList() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int[] getCompleteActiveSubscriptionIdList() { return null; }
    public int[] getActiveSubscriptionIdList(boolean p0) { return null; }
    public boolean isNetworkRoaming(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public static void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) {}
    public static java.lang.String serializeUriLists(java.util.List<android.net.Uri> p0) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public static boolean getBooleanSubscriptionProperty(int p0, java.lang.String p1, boolean p2, android.content.Context p3) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public static int getIntegerSubscriptionProperty(int p0, java.lang.String p1, int p2, android.content.Context p3) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public static long getLongSubscriptionProperty(int p0, java.lang.String p1, long p2, android.content.Context p3) { return 0L; }
    @android.annotation.SystemApi
    public static android.content.res.Resources getResourcesForSubId(android.content.Context p0, int p1) { return null; }
    public static android.content.res.Resources getResourcesForSubId(android.content.Context p0, int p1, boolean p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean isActiveSubscriptionId(int p0) { return false; }
    public boolean isActiveSubId(int p0) { return false; }
    public java.util.List<android.telephony.SubscriptionPlan> getSubscriptionPlans(int p0) { return null; }
    @java.lang.Deprecated
    public void setSubscriptionPlans(int p0, java.util.List<android.telephony.SubscriptionPlan> p1) {}
    public void setSubscriptionPlans(int p0, java.util.List<android.telephony.SubscriptionPlan> p1, long p2) {}
    public void setSubscriptionOverrideUnmetered(int p0, boolean p1, long p2) {}
    public void setSubscriptionOverrideUnmetered(int p0, boolean p1, int[] p2, long p3) {}
    public void setSubscriptionOverrideCongested(int p0, boolean p1, long p2) {}
    public void setSubscriptionOverrideCongested(int p0, boolean p1, int[] p2, long p3) {}
    public boolean canManageSubscription(android.telephony.SubscriptionInfo p0) { return false; }
    @android.annotation.SystemApi
    public boolean canManageSubscription(android.telephony.SubscriptionInfo p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setPreferredDataSubscriptionId(int p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getPreferredDataSubscriptionId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.WRITE_EMBEDDED_SUBSCRIPTIONS")
    public void switchToSubscription(int p0, android.app.PendingIntent p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setOpportunistic(boolean p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.os.ParcelUuid createSubscriptionGroup(java.util.List<java.lang.Integer> p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void addSubscriptionsIntoGroup(java.util.List<java.lang.Integer> p0, android.os.ParcelUuid p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void removeSubscriptionsFromGroup(java.util.List<java.lang.Integer> p0, android.os.ParcelUuid p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0) { return null; }
    public boolean isSubscriptionVisible(android.telephony.SubscriptionInfo p0) { return false; }
    public java.util.List<android.telephony.SubscriptionInfo> getSelectableSubscriptionInfoList() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setSubscriptionEnabled(int p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setUiccApplicationsEnabled(int p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean canDisablePhysicalSubscription() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isSubscriptionEnabled(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDeviceToDeviceStatusSharingPreference(int p0, int p1) {}
    public int getDeviceToDeviceStatusSharingPreference(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDeviceToDeviceStatusSharingContacts(int p0, java.util.List<android.net.Uri> p1) {}
    public java.util.List<android.net.Uri> getDeviceToDeviceStatusSharingContacts(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getEnabledSubscriptionId(int p0) { return 0; }
    public static int getActiveDataSubscriptionId() { return 0; }
    public static void putSubscriptionIdExtra(android.content.Intent p0, int p1) {}
    public static void invalidateSubscriptionManagerServiceCaches() {}
    public static void disableCaching() {}
    public static void clearCaches() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public byte[] getAllSimSpecificSettingsForBackup() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void restoreAllSimSpecificSettingsFromBackup(byte[] p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_NUMBERS", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.lang.String getPhoneNumber(int p0, int p1) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_NUMBERS", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.lang.String getPhoneNumber(int p0) { return null; }
    @android.annotation.RequiresPermission("carrier privileges")
    public void setCarrierPhoneNumber(int p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    void setUsageSetting(int p0, int p1) {}
    public static java.lang.String phoneNumberSourceToString(int p0) { return null; }
    public static java.lang.String displayNameSourceToString(int p0) { return null; }
    public static java.lang.String subscriptionTypeToString(int p0) { return null; }
    public static java.lang.String usageSettingToString(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_USER_ASSOCIATION")
    public void setSubscriptionUserHandle(int p0, android.os.UserHandle p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_USER_ASSOCIATION")
    public android.os.UserHandle getSubscriptionUserHandle(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_USER_ASSOCIATION")
    public boolean isSubscriptionAssociatedWithUser(int p0, android.os.UserHandle p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_USER_ASSOCIATION")
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionInfoListAssociatedWithUser(android.os.UserHandle p0) { return null; }

    public static class OnOpportunisticSubscriptionsChangedListener {
        public OnOpportunisticSubscriptionsChangedListener() {}
        public void onOpportunisticSubscriptionsChanged() {}
    }

    public static class OnSubscriptionsChangedListener {
        public com.android.internal.telephony.util.HandlerExecutor getHandlerExecutor() { return null; }
        public OnSubscriptionsChangedListener() {}
        public OnSubscriptionsChangedListener(android.os.Looper p0) {}
        public void onSubscriptionsChanged() {}
        public void onAddListenerFailed() {}

        private class OnSubscriptionsChangedListenerHandler extends android.os.Handler {
            OnSubscriptionsChangedListenerHandler(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) { super(); }
            OnSubscriptionsChangedListenerHandler(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0, android.os.Looper p1) { super(); }
        }
    }

    private static interface CallISubMethodHelper {
        public int callMethod(com.android.internal.telephony.ISub p0) throws android.os.RemoteException;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataRoamingMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceToDeviceStatusSharingPreference {
    }

    private static class IntegerPropertyInvalidatedCache<T extends java.lang.Object> extends android.app.PropertyInvalidatedCache<java.lang.Integer, T> {
        IntegerPropertyInvalidatedCache(com.android.internal.util.FunctionalUtils.ThrowingBiFunction<com.android.internal.telephony.ISub, java.lang.Integer, T> p0, java.lang.String p1, T p2) { super(0, (java.lang.String)null); }
        public T recompute(java.lang.Integer p0) { return null; }
        public T query(java.lang.Integer p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PhoneNumberSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileClass {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SimDisplayNameSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriptionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsageSetting {
    }

    private static class VoidPropertyInvalidatedCache<T extends java.lang.Object> extends android.app.PropertyInvalidatedCache<java.lang.Void, T> {
        VoidPropertyInvalidatedCache(com.android.internal.util.FunctionalUtils.ThrowingFunction<com.android.internal.telephony.ISub, T> p0, java.lang.String p1, T p2) { super(0, (java.lang.String)null); }
        public T recompute(java.lang.Void p0) { return null; }
        public T query(java.lang.Void p0) { return null; }
    }
}

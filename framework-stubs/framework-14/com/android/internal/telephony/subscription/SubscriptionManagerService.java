package com.android.internal.telephony.subscription;

public class SubscriptionManagerService extends com.android.internal.telephony.ISub.Stub {
    public static final long REQUIRE_DEVICE_IDENTIFIERS_FOR_GROUP_UUID = 213902861L;
    public SubscriptionManagerService(android.content.Context p0, android.os.Looper p1) { super(); }
    public static com.android.internal.telephony.subscription.SubscriptionManagerService getInstance() { return null; }
    public void syncGroupedSetting(int p0) {}
    public void setCarrierId(int p0, int p1) {}
    public void setMccMnc(int p0, java.lang.String p1) {}
    public void setCountryIso(int p0, java.lang.String p1) {}
    public void setCarrierName(int p0, java.lang.String p1) {}
    public void setLastUsedTPMessageReference(int p0, int p1) {}
    public void setEnabledMobileDataPolicies(int p0, java.lang.String p1) {}
    public void setNumberFromIms(int p0, java.lang.String p1) {}
    public void markSubscriptionsInactive(int p0) {}
    public void updateEmbeddedSubscriptions(java.util.List<java.lang.Integer> p0, java.lang.Runnable p1) {}
    public boolean areUiccAppsEnabledOnCard(int p0) { return false; }
    public int calculateUsageSetting(int p0, int p1) { return 0; }
    public void updateSubscriptionByCarrierConfig(int p0, java.lang.String p1, android.os.PersistableBundle p2, java.lang.Runnable p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public int getActiveSubInfoCount(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getActiveSubInfoCountMax() { return 0; }
    public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) { return null; }
    public void requestEmbeddedSubscriptionInfoListRefresh(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean removeSubInfo(java.lang.String p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setIconTint(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setDisplayNumber(java.lang.String p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setDataRoaming(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_PHONE_STATE", "carrier privileges"})
    public int setOpportunistic(boolean p0, int p1, java.lang.String p2) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_PHONE_STATE", "carrier privileges"})
    public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getPreferredDataSubscriptionId() { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_PHONE_STATE", "carrier privileges"})
    public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1, java.lang.String p2) { return null; }
    public int getSlotIndex(int p0) { return 0; }
    public int getSubId(int p0) { return 0; }
    public int getDefaultSubId() { return 0; }
    public int getPhoneId(int p0) { return 0; }
    public int getDefaultDataSubId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDefaultDataSubId(int p0) {}
    public int getDefaultVoiceSubId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDefaultVoiceSubId(int p0) {}
    public int getDefaultSmsSubId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setDefaultSmsSubId(int p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int[] getActiveSubIdList(boolean p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isSubscriptionEnabled(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getEnabledSubscriptionId(int p0) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public boolean isActiveSubId(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    public int getActiveDataSubscriptionId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean canDisablePhysicalSubscription() { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setUiccApplicationsEnabled(boolean p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setDeviceToDeviceStatusSharing(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int setDeviceToDeviceStatusSharingContacts(java.lang.String p0, int p1) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_NUMBERS", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.lang.String getPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_NUMBERS", "android.permission.READ_PRIVILEGED_PHONE_STATE", "carrier privileges"})
    public java.lang.String getPhoneNumberFromFirstAvailableSource(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.RequiresPermission("carrier privileges")
    public void setPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_PHONE_STATE", "carrier privileges"})
    public int setUsageSetting(int p0, int p1, java.lang.String p2) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_USER_ASSOCIATION")
    public int setSubscriptionUserHandle(android.os.UserHandle p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_SUBSCRIPTION_USER_ASSOCIATION")
    public android.os.UserHandle getSubscriptionUserHandle(int p0) { return null; }
    public boolean isSubscriptionAssociatedWithUser(int p0, android.os.UserHandle p1) { return false; }
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionInfoListAssociatedWithUser(android.os.UserHandle p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void restoreAllSimSpecificSettingsFromBackup(byte[] p0) {}
    public void registerCallback(com.android.internal.telephony.subscription.SubscriptionManagerService.SubscriptionManagerServiceCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.subscription.SubscriptionManagerService.SubscriptionManagerServiceCallback p0) {}
    public com.android.internal.telephony.subscription.SubscriptionInfoInternal getSubscriptionInfoInternal(int p0) { return null; }
    public android.telephony.SubscriptionInfo getSubscriptionInfo(int p0) { return null; }
    public void updateSimStateForInactivePort(int p0, java.lang.String p1) {}
    public void updateSimState(int p0, int p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) {}
    public void updateGroupDisabled() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class SubscriptionManagerServiceCallback {
        public SubscriptionManagerServiceCallback(java.util.concurrent.Executor p0) {}
        public java.util.concurrent.Executor getExecutor() { return null; }
        public void invokeFromExecutor(java.lang.Runnable p0) {}
        public void onSubscriptionChanged(int p0) {}
        public void onUiccApplicationsEnabledChanged(int p0) {}
    }

    public static class SubscriptionMap<K extends java.lang.Object, V extends java.lang.Object> extends java.util.concurrent.ConcurrentHashMap<K, V> {
        public SubscriptionMap() { super(); }
        public void clear() {}
        public V put(K p0, V p1) { return null; }
        public V remove(java.lang.Object p0) { return null; }
    }

    public static class WatchedInt {
        protected int mValue;
        public WatchedInt(int p0) {}
        public int get() { return 0; }
        public boolean set(int p0) { return false; }
    }
}

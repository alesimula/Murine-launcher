package com.android.internal.telephony;

public interface ISub extends android.os.IInterface {
    public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public int getActiveSubInfoCount(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public int getActiveSubInfoCountMax() throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException;
    public void requestEmbeddedSubscriptionInfoListRefresh(int p0) throws android.os.RemoteException;
    public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean removeSubInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int setIconTint(int p0, int p1) throws android.os.RemoteException;
    public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int setDisplayNumber(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int setDataRoaming(int p0, int p1) throws android.os.RemoteException;
    public int setOpportunistic(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) throws android.os.RemoteException;
    public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) throws android.os.RemoteException;
    public int getPreferredDataSubscriptionId() throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException;
    public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getSlotIndex(int p0) throws android.os.RemoteException;
    public int getSubId(int p0) throws android.os.RemoteException;
    public int getDefaultSubId() throws android.os.RemoteException;
    public int getDefaultSubIdAsUser(int p0) throws android.os.RemoteException;
    public int getPhoneId(int p0) throws android.os.RemoteException;
    public int getDefaultDataSubId() throws android.os.RemoteException;
    public void setDefaultDataSubId(int p0) throws android.os.RemoteException;
    public int getDefaultVoiceSubId() throws android.os.RemoteException;
    public int getDefaultVoiceSubIdAsUser(int p0) throws android.os.RemoteException;
    public void setDefaultVoiceSubId(int p0) throws android.os.RemoteException;
    public int getDefaultSmsSubId() throws android.os.RemoteException;
    public int getDefaultSmsSubIdAsUser(int p0) throws android.os.RemoteException;
    public void setDefaultSmsSubId(int p0) throws android.os.RemoteException;
    public int[] getActiveSubIdList(boolean p0) throws android.os.RemoteException;
    public void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isSubscriptionEnabled(int p0) throws android.os.RemoteException;
    public int getEnabledSubscriptionId(int p0) throws android.os.RemoteException;
    public boolean isActiveSubId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getActiveDataSubscriptionId() throws android.os.RemoteException;
    public boolean canDisablePhysicalSubscription() throws android.os.RemoteException;
    public void setUiccApplicationsEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public int setDeviceToDeviceStatusSharing(int p0, int p1) throws android.os.RemoteException;
    public int setDeviceToDeviceStatusSharingContacts(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public java.lang.String getPhoneNumberFromFirstAvailableSource(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public int setUsageSetting(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setGroupOwner(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int setSubscriptionUserHandle(android.os.UserHandle p0, int p1) throws android.os.RemoteException;
    public android.os.UserHandle getSubscriptionUserHandle(int p0) throws android.os.RemoteException;
    public boolean isSubscriptionAssociatedWithCallingUser(int p0) throws android.os.RemoteException;
    public boolean isSubscriptionAssociatedWithUser(int p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionInfoListAssociatedWithUser(android.os.UserHandle p0) throws android.os.RemoteException;
    public void restoreAllSimSpecificSettingsFromBackup(byte[] p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_EMBEDDED_SUBSCRIPTIONS")
    public void setTransferStatus(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ISub {
        public Default() {}
        public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public int getActiveSubInfoCount(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getActiveSubInfoCountMax() throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void requestEmbeddedSubscriptionInfoListRefresh(int p0) throws android.os.RemoteException {}
        public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public boolean removeSubInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public int setIconTint(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int setDisplayNumber(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int setDataRoaming(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setOpportunistic(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) throws android.os.RemoteException {}
        public int getPreferredDataSubscriptionId() throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
        public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int getSlotIndex(int p0) throws android.os.RemoteException { return 0; }
        public int getSubId(int p0) throws android.os.RemoteException { return 0; }
        public int getDefaultSubId() throws android.os.RemoteException { return 0; }
        public int getDefaultSubIdAsUser(int p0) throws android.os.RemoteException { return 0; }
        public int getPhoneId(int p0) throws android.os.RemoteException { return 0; }
        public int getDefaultDataSubId() throws android.os.RemoteException { return 0; }
        public void setDefaultDataSubId(int p0) throws android.os.RemoteException {}
        public int getDefaultVoiceSubId() throws android.os.RemoteException { return 0; }
        public int getDefaultVoiceSubIdAsUser(int p0) throws android.os.RemoteException { return 0; }
        public void setDefaultVoiceSubId(int p0) throws android.os.RemoteException {}
        public int getDefaultSmsSubId() throws android.os.RemoteException { return 0; }
        public int getDefaultSmsSubIdAsUser(int p0) throws android.os.RemoteException { return 0; }
        public void setDefaultSmsSubId(int p0) throws android.os.RemoteException {}
        public int[] getActiveSubIdList(boolean p0) throws android.os.RemoteException { return null; }
        public void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public boolean isSubscriptionEnabled(int p0) throws android.os.RemoteException { return false; }
        public int getEnabledSubscriptionId(int p0) throws android.os.RemoteException { return 0; }
        public boolean isActiveSubId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int getActiveDataSubscriptionId() throws android.os.RemoteException { return 0; }
        public boolean canDisablePhysicalSubscription() throws android.os.RemoteException { return false; }
        public void setUiccApplicationsEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public int setDeviceToDeviceStatusSharing(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setDeviceToDeviceStatusSharingContacts(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public java.lang.String getPhoneNumberFromFirstAvailableSource(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public int setUsageSetting(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void setGroupOwner(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int setSubscriptionUserHandle(android.os.UserHandle p0, int p1) throws android.os.RemoteException { return 0; }
        public android.os.UserHandle getSubscriptionUserHandle(int p0) throws android.os.RemoteException { return null; }
        public boolean isSubscriptionAssociatedWithCallingUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isSubscriptionAssociatedWithUser(int p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionInfoListAssociatedWithUser(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public void restoreAllSimSpecificSettingsFromBackup(byte[] p0) throws android.os.RemoteException {}
        public void setTransferStatus(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISub {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISub";
        static final int TRANSACTION_getAllSubInfoList = 1;
        static final int TRANSACTION_getActiveSubscriptionInfo = 2;
        static final int TRANSACTION_getActiveSubscriptionInfoForIccId = 3;
        static final int TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex = 4;
        static final int TRANSACTION_getActiveSubscriptionInfoList = 5;
        static final int TRANSACTION_getActiveSubInfoCount = 6;
        static final int TRANSACTION_getActiveSubInfoCountMax = 7;
        static final int TRANSACTION_getAvailableSubscriptionInfoList = 8;
        static final int TRANSACTION_getAccessibleSubscriptionInfoList = 9;
        static final int TRANSACTION_requestEmbeddedSubscriptionInfoListRefresh = 10;
        static final int TRANSACTION_addSubInfo = 11;
        static final int TRANSACTION_removeSubInfo = 12;
        static final int TRANSACTION_setIconTint = 13;
        static final int TRANSACTION_setDisplayNameUsingSrc = 14;
        static final int TRANSACTION_setDisplayNumber = 15;
        static final int TRANSACTION_setDataRoaming = 16;
        static final int TRANSACTION_setOpportunistic = 17;
        static final int TRANSACTION_createSubscriptionGroup = 18;
        static final int TRANSACTION_setPreferredDataSubscriptionId = 19;
        static final int TRANSACTION_getPreferredDataSubscriptionId = 20;
        static final int TRANSACTION_getOpportunisticSubscriptions = 21;
        static final int TRANSACTION_removeSubscriptionsFromGroup = 22;
        static final int TRANSACTION_addSubscriptionsIntoGroup = 23;
        static final int TRANSACTION_getSubscriptionsInGroup = 24;
        static final int TRANSACTION_getSlotIndex = 25;
        static final int TRANSACTION_getSubId = 26;
        static final int TRANSACTION_getDefaultSubId = 27;
        static final int TRANSACTION_getDefaultSubIdAsUser = 28;
        static final int TRANSACTION_getPhoneId = 29;
        static final int TRANSACTION_getDefaultDataSubId = 30;
        static final int TRANSACTION_setDefaultDataSubId = 31;
        static final int TRANSACTION_getDefaultVoiceSubId = 32;
        static final int TRANSACTION_getDefaultVoiceSubIdAsUser = 33;
        static final int TRANSACTION_setDefaultVoiceSubId = 34;
        static final int TRANSACTION_getDefaultSmsSubId = 35;
        static final int TRANSACTION_getDefaultSmsSubIdAsUser = 36;
        static final int TRANSACTION_setDefaultSmsSubId = 37;
        static final int TRANSACTION_getActiveSubIdList = 38;
        static final int TRANSACTION_setSubscriptionProperty = 39;
        static final int TRANSACTION_getSubscriptionProperty = 40;
        static final int TRANSACTION_isSubscriptionEnabled = 41;
        static final int TRANSACTION_getEnabledSubscriptionId = 42;
        static final int TRANSACTION_isActiveSubId = 43;
        static final int TRANSACTION_getActiveDataSubscriptionId = 44;
        static final int TRANSACTION_canDisablePhysicalSubscription = 45;
        static final int TRANSACTION_setUiccApplicationsEnabled = 46;
        static final int TRANSACTION_setDeviceToDeviceStatusSharing = 47;
        static final int TRANSACTION_setDeviceToDeviceStatusSharingContacts = 48;
        static final int TRANSACTION_getPhoneNumber = 49;
        static final int TRANSACTION_getPhoneNumberFromFirstAvailableSource = 50;
        static final int TRANSACTION_setPhoneNumber = 51;
        static final int TRANSACTION_setUsageSetting = 52;
        static final int TRANSACTION_setGroupOwner = 53;
        static final int TRANSACTION_setSubscriptionUserHandle = 54;
        static final int TRANSACTION_getSubscriptionUserHandle = 55;
        static final int TRANSACTION_isSubscriptionAssociatedWithCallingUser = 56;
        static final int TRANSACTION_isSubscriptionAssociatedWithUser = 57;
        static final int TRANSACTION_getSubscriptionInfoListAssociatedWithUser = 58;
        static final int TRANSACTION_restoreAllSimSpecificSettingsFromBackup = 59;
        static final int TRANSACTION_setTransferStatus = 60;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static com.android.internal.telephony.ISub asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setTransferStatus_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.ISub {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public int getActiveSubInfoCount(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getActiveSubInfoCountMax() throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void requestEmbeddedSubscriptionInfoListRefresh(int p0) throws android.os.RemoteException {}
            public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public boolean removeSubInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public int setIconTint(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int setDisplayNumber(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int setDataRoaming(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setOpportunistic(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) throws android.os.RemoteException {}
            public int getPreferredDataSubscriptionId() throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
            public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int getSlotIndex(int p0) throws android.os.RemoteException { return 0; }
            public int getSubId(int p0) throws android.os.RemoteException { return 0; }
            public int getDefaultSubId() throws android.os.RemoteException { return 0; }
            public int getDefaultSubIdAsUser(int p0) throws android.os.RemoteException { return 0; }
            public int getPhoneId(int p0) throws android.os.RemoteException { return 0; }
            public int getDefaultDataSubId() throws android.os.RemoteException { return 0; }
            public void setDefaultDataSubId(int p0) throws android.os.RemoteException {}
            public int getDefaultVoiceSubId() throws android.os.RemoteException { return 0; }
            public int getDefaultVoiceSubIdAsUser(int p0) throws android.os.RemoteException { return 0; }
            public void setDefaultVoiceSubId(int p0) throws android.os.RemoteException {}
            public int getDefaultSmsSubId() throws android.os.RemoteException { return 0; }
            public int getDefaultSmsSubIdAsUser(int p0) throws android.os.RemoteException { return 0; }
            public void setDefaultSmsSubId(int p0) throws android.os.RemoteException {}
            public int[] getActiveSubIdList(boolean p0) throws android.os.RemoteException { return null; }
            public void setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public boolean isSubscriptionEnabled(int p0) throws android.os.RemoteException { return false; }
            public int getEnabledSubscriptionId(int p0) throws android.os.RemoteException { return 0; }
            public boolean isActiveSubId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int getActiveDataSubscriptionId() throws android.os.RemoteException { return 0; }
            public boolean canDisablePhysicalSubscription() throws android.os.RemoteException { return false; }
            public void setUiccApplicationsEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public int setDeviceToDeviceStatusSharing(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setDeviceToDeviceStatusSharingContacts(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public java.lang.String getPhoneNumberFromFirstAvailableSource(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setPhoneNumber(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public int setUsageSetting(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void setGroupOwner(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public int setSubscriptionUserHandle(android.os.UserHandle p0, int p1) throws android.os.RemoteException { return 0; }
            public android.os.UserHandle getSubscriptionUserHandle(int p0) throws android.os.RemoteException { return null; }
            public boolean isSubscriptionAssociatedWithCallingUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isSubscriptionAssociatedWithUser(int p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionInfoListAssociatedWithUser(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public void restoreAllSimSpecificSettingsFromBackup(byte[] p0) throws android.os.RemoteException {}
            public void setTransferStatus(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}

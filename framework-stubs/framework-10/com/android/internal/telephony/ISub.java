package com.android.internal.telephony;

public interface ISub extends android.os.IInterface {
    public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0) throws android.os.RemoteException;
    public int getAllSubInfoCount(java.lang.String p0) throws android.os.RemoteException;
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException;
    public int getActiveSubInfoCount(java.lang.String p0) throws android.os.RemoteException;
    public int getActiveSubInfoCountMax() throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException;
    public void requestEmbeddedSubscriptionInfoListRefresh(int p0) throws android.os.RemoteException;
    public int addSubInfoRecord(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public int removeSubInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int setIconTint(int p0, int p1) throws android.os.RemoteException;
    public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int setDisplayNumber(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int setDataRoaming(int p0, int p1) throws android.os.RemoteException;
    public int setOpportunistic(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) throws android.os.RemoteException;
    public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) throws android.os.RemoteException;
    public int getPreferredDataSubscriptionId() throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0) throws android.os.RemoteException;
    public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException;
    public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1) throws android.os.RemoteException;
    public int getSlotIndex(int p0) throws android.os.RemoteException;
    public int[] getSubId(int p0) throws android.os.RemoteException;
    public int getDefaultSubId() throws android.os.RemoteException;
    public int clearSubInfo() throws android.os.RemoteException;
    public int getPhoneId(int p0) throws android.os.RemoteException;
    public int getDefaultDataSubId() throws android.os.RemoteException;
    public void setDefaultDataSubId(int p0) throws android.os.RemoteException;
    public int getDefaultVoiceSubId() throws android.os.RemoteException;
    public void setDefaultVoiceSubId(int p0) throws android.os.RemoteException;
    public int getDefaultSmsSubId() throws android.os.RemoteException;
    public void setDefaultSmsSubId(int p0) throws android.os.RemoteException;
    public int[] getActiveSubIdList(boolean p0) throws android.os.RemoteException;
    public int setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setSubscriptionEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isSubscriptionEnabled(int p0) throws android.os.RemoteException;
    public int getEnabledSubscriptionId(int p0) throws android.os.RemoteException;
    public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException;
    public boolean isActiveSubId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setAlwaysAllowMmsData(int p0, boolean p1) throws android.os.RemoteException;
    public int getActiveDataSubscriptionId() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISub {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISub";
        static final int TRANSACTION_getAllSubInfoList = 1;
        static final int TRANSACTION_getAllSubInfoCount = 2;
        static final int TRANSACTION_getActiveSubscriptionInfo = 3;
        static final int TRANSACTION_getActiveSubscriptionInfoForIccId = 4;
        static final int TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex = 5;
        static final int TRANSACTION_getActiveSubscriptionInfoList = 6;
        static final int TRANSACTION_getActiveSubInfoCount = 7;
        static final int TRANSACTION_getActiveSubInfoCountMax = 8;
        static final int TRANSACTION_getAvailableSubscriptionInfoList = 9;
        static final int TRANSACTION_getAccessibleSubscriptionInfoList = 10;
        static final int TRANSACTION_requestEmbeddedSubscriptionInfoListRefresh = 11;
        static final int TRANSACTION_addSubInfoRecord = 12;
        static final int TRANSACTION_addSubInfo = 13;
        static final int TRANSACTION_removeSubInfo = 14;
        static final int TRANSACTION_setIconTint = 15;
        static final int TRANSACTION_setDisplayNameUsingSrc = 16;
        static final int TRANSACTION_setDisplayNumber = 17;
        static final int TRANSACTION_setDataRoaming = 18;
        static final int TRANSACTION_setOpportunistic = 19;
        static final int TRANSACTION_createSubscriptionGroup = 20;
        static final int TRANSACTION_setPreferredDataSubscriptionId = 21;
        static final int TRANSACTION_getPreferredDataSubscriptionId = 22;
        static final int TRANSACTION_getOpportunisticSubscriptions = 23;
        static final int TRANSACTION_removeSubscriptionsFromGroup = 24;
        static final int TRANSACTION_addSubscriptionsIntoGroup = 25;
        static final int TRANSACTION_getSubscriptionsInGroup = 26;
        static final int TRANSACTION_getSlotIndex = 27;
        static final int TRANSACTION_getSubId = 28;
        static final int TRANSACTION_getDefaultSubId = 29;
        static final int TRANSACTION_clearSubInfo = 30;
        static final int TRANSACTION_getPhoneId = 31;
        static final int TRANSACTION_getDefaultDataSubId = 32;
        static final int TRANSACTION_setDefaultDataSubId = 33;
        static final int TRANSACTION_getDefaultVoiceSubId = 34;
        static final int TRANSACTION_setDefaultVoiceSubId = 35;
        static final int TRANSACTION_getDefaultSmsSubId = 36;
        static final int TRANSACTION_setDefaultSmsSubId = 37;
        static final int TRANSACTION_getActiveSubIdList = 38;
        static final int TRANSACTION_setSubscriptionProperty = 39;
        static final int TRANSACTION_getSubscriptionProperty = 40;
        static final int TRANSACTION_setSubscriptionEnabled = 41;
        static final int TRANSACTION_isSubscriptionEnabled = 42;
        static final int TRANSACTION_getEnabledSubscriptionId = 43;
        static final int TRANSACTION_getSimStateForSlotIndex = 44;
        static final int TRANSACTION_isActiveSubId = 45;
        static final int TRANSACTION_setAlwaysAllowMmsData = 46;
        static final int TRANSACTION_getActiveDataSubscriptionId = 47;
        public Stub() { super(); }
        public static com.android.internal.telephony.ISub asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telephony.ISub p0) { return false; }
        public static com.android.internal.telephony.ISub getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telephony.ISub {
            private android.os.IBinder mRemote;
            public static com.android.internal.telephony.ISub sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getAllSubInfoCount(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getActiveSubInfoCount(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getActiveSubInfoCountMax() throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void requestEmbeddedSubscriptionInfoListRefresh(int p0) throws android.os.RemoteException {}
            public int addSubInfoRecord(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public int removeSubInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int setIconTint(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int setDisplayNumber(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int setDataRoaming(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setOpportunistic(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) throws android.os.RemoteException {}
            public int getPreferredDataSubscriptionId() throws android.os.RemoteException { return 0; }
            public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
            public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getSlotIndex(int p0) throws android.os.RemoteException { return 0; }
            public int[] getSubId(int p0) throws android.os.RemoteException { return null; }
            public int getDefaultSubId() throws android.os.RemoteException { return 0; }
            public int clearSubInfo() throws android.os.RemoteException { return 0; }
            public int getPhoneId(int p0) throws android.os.RemoteException { return 0; }
            public int getDefaultDataSubId() throws android.os.RemoteException { return 0; }
            public void setDefaultDataSubId(int p0) throws android.os.RemoteException {}
            public int getDefaultVoiceSubId() throws android.os.RemoteException { return 0; }
            public void setDefaultVoiceSubId(int p0) throws android.os.RemoteException {}
            public int getDefaultSmsSubId() throws android.os.RemoteException { return 0; }
            public void setDefaultSmsSubId(int p0) throws android.os.RemoteException {}
            public int[] getActiveSubIdList(boolean p0) throws android.os.RemoteException { return null; }
            public int setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean setSubscriptionEnabled(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isSubscriptionEnabled(int p0) throws android.os.RemoteException { return false; }
            public int getEnabledSubscriptionId(int p0) throws android.os.RemoteException { return 0; }
            public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException { return 0; }
            public boolean isActiveSubId(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setAlwaysAllowMmsData(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public int getActiveDataSubscriptionId() throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements com.android.internal.telephony.ISub {
        public Default() {}
        public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getAllSubInfoCount(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getActiveSubInfoCount(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getActiveSubInfoCountMax() throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void requestEmbeddedSubscriptionInfoListRefresh(int p0) throws android.os.RemoteException {}
        public int addSubInfoRecord(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int addSubInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public int removeSubInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int setIconTint(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setDisplayNameUsingSrc(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int setDisplayNumber(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int setDataRoaming(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setOpportunistic(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.os.ParcelUuid createSubscriptionGroup(int[] p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) throws android.os.RemoteException {}
        public int getPreferredDataSubscriptionId() throws android.os.RemoteException { return 0; }
        public java.util.List<android.telephony.SubscriptionInfo> getOpportunisticSubscriptions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void removeSubscriptionsFromGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
        public void addSubscriptionsIntoGroup(int[] p0, android.os.ParcelUuid p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<android.telephony.SubscriptionInfo> getSubscriptionsInGroup(android.os.ParcelUuid p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getSlotIndex(int p0) throws android.os.RemoteException { return 0; }
        public int[] getSubId(int p0) throws android.os.RemoteException { return null; }
        public int getDefaultSubId() throws android.os.RemoteException { return 0; }
        public int clearSubInfo() throws android.os.RemoteException { return 0; }
        public int getPhoneId(int p0) throws android.os.RemoteException { return 0; }
        public int getDefaultDataSubId() throws android.os.RemoteException { return 0; }
        public void setDefaultDataSubId(int p0) throws android.os.RemoteException {}
        public int getDefaultVoiceSubId() throws android.os.RemoteException { return 0; }
        public void setDefaultVoiceSubId(int p0) throws android.os.RemoteException {}
        public int getDefaultSmsSubId() throws android.os.RemoteException { return 0; }
        public void setDefaultSmsSubId(int p0) throws android.os.RemoteException {}
        public int[] getActiveSubIdList(boolean p0) throws android.os.RemoteException { return null; }
        public int setSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.lang.String getSubscriptionProperty(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean setSubscriptionEnabled(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isSubscriptionEnabled(int p0) throws android.os.RemoteException { return false; }
        public int getEnabledSubscriptionId(int p0) throws android.os.RemoteException { return 0; }
        public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException { return 0; }
        public boolean isActiveSubId(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setAlwaysAllowMmsData(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public int getActiveDataSubscriptionId() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}

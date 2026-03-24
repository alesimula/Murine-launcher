package com.android.internal.telephony.uicc;

public abstract class IccRecords extends android.os.Handler implements com.android.internal.telephony.uicc.IccConstants {
    protected static final boolean DBG = true;
    protected static final boolean VDBG = Boolean.valueOf(false);
    public static final int PLMN_MIN_LENGTH = 5;
    public static final int PLMN_MAX_LENGTH = 6;
    protected java.util.concurrent.atomic.AtomicBoolean mDestroyed;
    protected java.util.concurrent.atomic.AtomicBoolean mLoaded;
    protected android.content.Context mContext;
    protected com.android.internal.telephony.CommandsInterface mCi;
    protected com.android.internal.telephony.uicc.IccFileHandler mFh;
    protected com.android.internal.telephony.uicc.UiccCardApplication mParentApp;
    protected android.telephony.TelephonyManager mTelephonyManager;
    protected com.android.internal.telephony.RegistrantList mRecordsLoadedRegistrants;
    protected com.android.internal.telephony.RegistrantList mLockedRecordsLoadedRegistrants;
    protected com.android.internal.telephony.RegistrantList mNetworkLockedRecordsLoadedRegistrants;
    protected com.android.internal.telephony.RegistrantList mImsiReadyRegistrants;
    protected com.android.internal.telephony.RegistrantList mRecordsEventsRegistrants;
    protected com.android.internal.telephony.RegistrantList mNewSmsRegistrants;
    protected com.android.internal.telephony.RegistrantList mNetworkSelectionModeAutomaticRegistrants;
    protected com.android.internal.telephony.RegistrantList mSpnUpdatedRegistrants;
    protected com.android.internal.telephony.RegistrantList mRecordsOverrideRegistrants;
    protected int mRecordsToLoad;
    protected com.android.internal.telephony.uicc.AdnRecordCache mAdnCache;
    protected static final int LOCKED_RECORDS_REQ_REASON_NONE = 0;
    protected static final int LOCKED_RECORDS_REQ_REASON_LOCKED = 1;
    protected static final int LOCKED_RECORDS_REQ_REASON_NETWORK_LOCKED = 2;
    protected boolean mRecordsRequested;
    protected int mLockedRecordsReqReason;
    protected static final int SMSS_INVALID_TPMR = -1;
    public java.lang.String mIccId;
    protected java.lang.String mFullIccId;
    protected java.lang.String mMsisdn;
    protected java.lang.String mMsisdnTag;
    protected java.lang.String mNewMsisdn;
    protected java.lang.String mNewMsisdnTag;
    protected java.lang.String mVoiceMailNum;
    protected java.lang.String mVoiceMailTag;
    protected java.lang.String mNewVoiceMailNum;
    protected java.lang.String mNewVoiceMailTag;
    protected boolean mIsVoiceMailFixed;
    protected java.lang.String mImsi;
    protected int mMncLength;
    protected int mMailboxIndex;
    protected int mSmsCountOnIcc;
    protected java.lang.String mGid1;
    protected java.lang.String mGid2;
    protected java.lang.String mPnnHomeName;
    protected java.lang.String mPrefLang;
    protected com.android.internal.telephony.uicc.PlmnActRecord[] mHplmnActRecords;
    protected com.android.internal.telephony.uicc.PlmnActRecord[] mOplmnActRecords;
    protected com.android.internal.telephony.uicc.PlmnActRecord[] mPlmnActRecords;
    protected java.lang.String[] mSpdi;
    protected com.android.internal.telephony.uicc.IccRecords.PlmnNetworkName[] mPnns;
    protected com.android.internal.telephony.uicc.IccRecords.OperatorPlmnInfo[] mOpl;
    protected int mCarrierNameDisplayCondition;
    protected java.lang.String[] mEhplmns;
    protected java.lang.String[] mFplmns;
    protected java.lang.String mPsiSmsc;
    protected byte[] mSmssValues;
    com.android.internal.telephony.uicc.CarrierTestOverride mCarrierTestOverride;
    protected static final int HANDLER_ACTION_BASE = 1238272;
    protected static final int HANDLER_ACTION_NONE = 1238272;
    protected static final int HANDLER_ACTION_SEND_RESPONSE = 1238273;
    protected static java.util.concurrent.atomic.AtomicInteger sNextRequestId;
    protected final java.util.HashMap<java.lang.Integer, android.util.Pair<android.os.Message, java.lang.Object>> mPendingTransactions = null;
    protected static final int UNINITIALIZED = -1;
    protected static final int UNKNOWN = 0;
    public static final int CARRIER_NAME_DISPLAY_CONDITION_BITMASK_PLMN = 1;
    public static final int CARRIER_NAME_DISPLAY_CONDITION_BITMASK_SPN = 2;
    public static final int INVALID_CARRIER_NAME_DISPLAY_CONDITION_BITMASK = -1;
    public static final int DEFAULT_CARRIER_NAME_DISPLAY_CONDITION = 0;
    public static final int EVENT_MWI = 0;
    public static final int EVENT_CFI = 1;
    public static final int EVENT_SPN = 2;
    public static final int EVENT_GET_ICC_RECORD_DONE = 100;
    public static final int EVENT_REFRESH = 31;
    protected static final int EVENT_GET_SMS_RECORD_SIZE_DONE = 28;
    protected static final int SYSTEM_EVENT_BASE = 256;
    protected static final int EVENT_APP_READY = 257;
    protected static final int EVENT_APP_LOCKED = 258;
    protected static final int EVENT_APP_NETWORK_LOCKED = 259;
    protected static final int EVENT_APP_DETECTED = 260;
    public static final int CALL_FORWARDING_STATUS_DISABLED = 0;
    public static final int CALL_FORWARDING_STATUS_ENABLED = 1;
    public static final int CALL_FORWARDING_STATUS_UNKNOWN = -1;
    public static final int DEFAULT_VOICE_MESSAGE_COUNT = -2;
    public static final int UNKNOWN_VOICE_MESSAGE_COUNT = -1;
    public static final int EVENT_SET_SMSS_RECORD_DONE = 201;
    public java.lang.String toString() { return null; }
    public IccRecords(com.android.internal.telephony.uicc.UiccCardApplication p0, android.content.Context p1, com.android.internal.telephony.CommandsInterface p2) { super(); }
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {}
    public void dispose() {}
    protected abstract void onReady();
    protected void onDetected() {}
    protected void onLocked() {}
    public com.android.internal.telephony.uicc.AdnRecordCache getAdnCache() { return null; }
    public int storePendingTransaction(android.os.Message p0) { return 0; }
    public int storePendingTransaction(android.os.Message p0, java.lang.Object p1) { return 0; }
    public android.util.Pair<android.os.Message, java.lang.Object> retrievePendingTransaction(java.lang.Integer p0) { return null; }
    public java.lang.String getIccId() { return null; }
    public java.lang.String getFullIccId() { return null; }
    public void registerForRecordsLoaded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRecordsLoaded(android.os.Handler p0) {}
    public void unregisterForRecordsOverride(android.os.Handler p0) {}
    public void registerForRecordsOverride(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void registerForLockedRecordsLoaded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForLockedRecordsLoaded(android.os.Handler p0) {}
    public void registerForNetworkLockedRecordsLoaded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkLockedRecordsLoaded(android.os.Handler p0) {}
    public void registerForImsiReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForImsiReady(android.os.Handler p0) {}
    public void registerForSpnUpdate(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSpnUpdate(android.os.Handler p0) {}
    public void registerForRecordsEvents(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRecordsEvents(android.os.Handler p0) {}
    public void registerForNewSms(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNewSms(android.os.Handler p0) {}
    public void registerForNetworkSelectionModeAutomatic(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkSelectionModeAutomatic(android.os.Handler p0) {}
    public java.lang.String getIMSI() { return null; }
    public void setImsi(java.lang.String p0) {}
    protected void updateOperatorPlmn() {}
    public java.lang.String getNAI() { return null; }
    public java.lang.String getMsisdnNumber() { return null; }
    public java.lang.String getGid1() { return null; }
    public java.lang.String getGid2() { return null; }
    public java.lang.String getPnnHomeName() { return null; }
    public com.android.internal.telephony.uicc.IccRecords.PlmnNetworkName[] getPnns() { return null; }
    public com.android.internal.telephony.uicc.IccRecords.OperatorPlmnInfo[] getOpl() { return null; }
    public void setMsisdnNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public java.lang.String getMsisdnAlphaTag() { return null; }
    public java.lang.String getVoiceMailNumber() { return null; }
    public java.lang.String getServiceProviderName() { return null; }
    public java.lang.String getServiceProviderNameWithBrandOverride() { return null; }
    protected void setServiceProviderName(java.lang.String p0) {}
    public abstract void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public java.lang.String getVoiceMailAlphaTag() { return null; }
    public abstract void setVoiceMessageWaiting(int p0, int p1);
    public abstract int getVoiceMessageCount();
    public abstract void onRefresh(boolean p0, int[] p1);
    public boolean getRecordsLoaded() { return false; }
    protected boolean getLockedRecordsLoaded() { return false; }
    protected boolean getNetworkLockedRecordsLoaded() { return false; }
    public void handleMessage(android.os.Message p0) {}
    public java.lang.String getSimLanguage() { return null; }
    protected void setSimLanguage(byte[] p0, byte[] p1) {}
    protected static java.lang.String findBestLanguage(byte[] p0, java.lang.String[] p1) throws java.io.UnsupportedEncodingException { return null; }
    protected abstract void handleFileUpdate(int p0);
    protected void handleRefresh(com.android.internal.telephony.uicc.IccRefreshResponse p0) {}
    protected abstract void onRecordLoaded();
    protected abstract void onAllRecordsLoaded();
    public int getCarrierNameDisplayCondition() { return 0; }
    public java.lang.String[] getServiceProviderDisplayInformation() { return null; }
    public java.lang.String[] getHomePlmns() { return null; }
    public boolean isCspPlmnEnabled() { return false; }
    public java.lang.String getOperatorNumeric() { return null; }
    public int getVoiceCallForwardingFlag() { return 0; }
    public void setVoiceCallForwardingFlag(int p0, boolean p1, java.lang.String p2) {}
    public boolean isLoaded() { return false; }
    public boolean isProvisioned() { return false; }
    protected abstract void log(java.lang.String p0);
    protected abstract void loge(java.lang.String p0);
    public java.lang.String[] getEhplmns() { return null; }
    public java.lang.String[] getPlmnsFromHplmnActRecord() { return null; }
    public com.android.internal.telephony.uicc.IsimRecords getIsimRecords() { return null; }
    public com.android.internal.telephony.uicc.UsimServiceTable getUsimServiceTable() { return null; }
    public java.lang.String getIccSimChallengeResponse(int p0, java.lang.String p1) { return null; }
    public static int convertSpnDisplayConditionToBitmask(int p0) { return 0; }
    public int getSmsCapacityOnIcc() { return 0; }
    protected java.lang.String parseEfPsiSmsc(byte[] p0) { return null; }
    public java.lang.String getSmscIdentity() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public static java.lang.String getNetworkNameForPlmnFromPnnOpl(com.android.internal.telephony.uicc.IccRecords.PlmnNetworkName[] p0, com.android.internal.telephony.uicc.IccRecords.OperatorPlmnInfo[] p1, java.lang.String p2, int p3) { return null; }
    public void setSmssTpmrValue(int p0, android.os.Message p1) {}
    public int getSmssTpmrValue() { return 0; }
    public com.android.internal.telephony.uicc.IccRecords.SmssRecord createSmssRecord(android.os.Message p0, byte[] p1) { return null; }
    public void loadFdnRecords() {}

    private static class AuthAsyncResponse {
        public com.android.internal.telephony.uicc.IccIoResult authRsp;
        public java.lang.Throwable exception;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CarrierNameDisplayConditionBitmask {
    }

    public static interface IccRecordLoaded {
        public java.lang.String getEfName();
        public void onRecordLoaded(android.os.AsyncResult p0);
    }

    public static final class OperatorPlmnInfo {
        public final java.lang.String plmnNumericPattern = null;
        public final int lacTacStart = 0;
        public final int lacTacEnd = 0;
        public final int pnnRecordId = 0;
        public OperatorPlmnInfo(java.lang.String p0, int p1, int p2, int p3) {}
        public int getPnnIdx(java.lang.String p0, int p1) { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static final class PlmnNetworkName {
        public final java.lang.String fullName = null;
        public final java.lang.String shortName = null;
        public PlmnNetworkName(java.lang.String p0, java.lang.String p1) {}
        public java.lang.String getName() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    static class SmssRecord {
        SmssRecord(android.os.Message p0, byte[] p1) {}
    }
}

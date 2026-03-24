package com.android.internal.telephony.uicc;

public class SIMRecords extends com.android.internal.telephony.uicc.IccRecords {
    protected static final java.lang.String LOG_TAG = "SIMRecords";
    com.android.internal.telephony.uicc.VoiceMailConstants mVmConfig;
    boolean mCspPlmnEnabled;
    byte[] mEfMWIS;
    byte[] mEfCPHS_MWI;
    byte[] mEfCff;
    byte[] mEfCfis;
    byte[] mEfLi;
    byte[] mEfPl;
    com.android.internal.telephony.uicc.UsimServiceTable mUsimServiceTable;
    static final int TAG_SPDI = 163;
    static final int TAG_SPDI_PLMN_LIST = 128;
    static final int TAG_FULL_NETWORK_NAME = 67;
    static final int TAG_SHORT_NETWORK_NAME = 69;
    static final int TAG_PLMN_ADDITIONAL_INFORMATION = 128;
    static final int CFF_UNCONDITIONAL_ACTIVE = 10;
    static final int CFF_UNCONDITIONAL_DEACTIVE = 5;
    static final int CFF_LINE1_MASK = 15;
    static final int CFF_LINE1_RESET = 240;
    protected static final int EVENT_GET_PNN_DONE = 15;
    protected static final int EVENT_GET_OPL_DONE = 16;
    protected static final int EVENT_GET_SST_DONE = 17;
    protected static final int EVENT_GET_SMSS_RECORD_DONE = 46;
    protected static final int EVENT_GET_PSISMSC_DONE = 47;
    public java.lang.String toString() { return null; }
    public SIMRecords(com.android.internal.telephony.uicc.UiccCardApplication p0, android.content.Context p1, com.android.internal.telephony.CommandsInterface p2) { super(null, null, null); }
    public void dispose() {}
    protected void finalize() {}
    protected void resetRecords() {}
    public java.lang.String getMsisdnNumber() { return null; }
    public com.android.internal.telephony.uicc.UsimServiceTable getUsimServiceTable() { return null; }
    public java.lang.String getSimServiceTable() { return null; }
    public void setMsisdnNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public java.lang.String getMsisdnAlphaTag() { return null; }
    public java.lang.String getVoiceMailNumber() { return null; }
    public void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public java.lang.String getVoiceMailAlphaTag() { return null; }
    public void setVoiceMessageWaiting(int p0, int p1) {}
    public int getVoiceMessageCount() { return 0; }
    public int getVoiceCallForwardingFlag() { return 0; }
    public void setVoiceCallForwardingFlag(int p0, boolean p1, java.lang.String p2) {}
    public void onRefresh(boolean p0, int[] p1) {}
    public java.lang.String getOperatorNumeric() { return null; }
    public void handleMessage(android.os.Message p0) {}
    protected void handleFileUpdate(int p0) {}
    protected void onRecordLoaded() {}
    protected void onAllRecordsLoaded() {}
    public void getForbiddenPlmns(android.os.Message p0) {}
    public void setForbiddenPlmns(android.os.Message p0, java.util.List<java.lang.String> p1) {}
    public void onReady() {}
    protected void onLocked() {}
    protected void fetchSimRecords() {}
    public int getCarrierNameDisplayCondition() { return 0; }
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void logw(java.lang.String p0, java.lang.Throwable p1) {}
    protected void logv(java.lang.String p0) {}
    public boolean isCspPlmnEnabled() { return false; }
    public void setMailboxIndex(int p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class EfPlLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfUsimLiLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private static enum GetSpnFsmState {
        IDLE,
        INIT,
        READ_SPN_3GPP,
        READ_SPN_CPHS,
        READ_SPN_SHORT_CPHS;
    }
}

package com.android.internal.telephony.uicc;

public class SimPhonebookRecordCache extends android.os.Handler {
    static final boolean ENABLE_INFLATE_WITH_EMPTY_RECORDS = true;
    java.util.ArrayList<android.os.Message> mAdnLoadingWaiters;
    boolean mIsUpdateDone;
    public SimPhonebookRecordCache(android.content.Context p0, int p1, com.android.internal.telephony.CommandsInterface p2) { super(); }
    public boolean isEnabled() { return false; }
    public void dispose() {}
    public com.android.internal.telephony.uicc.AdnCapacity getAdnCapacity() { return null; }
    public void requestLoadAllPbRecords(android.os.Message p0) {}
    public boolean isLoading() { return false; }
    public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecords() { return null; }
    public void clear() {}
    public void updateSimPbAdnByRecordId(int p0, com.android.internal.telephony.uicc.AdnRecord p1, android.os.Message p2) {}
    public void updateSimPbAdnBySearch(com.android.internal.telephony.uicc.AdnRecord p0, com.android.internal.telephony.uicc.AdnRecord p1, android.os.Message p2) {}
    public void handleMessage(android.os.Message p0) {}

    private static final class UpdateRequest {
        UpdateRequest(int p0, com.android.internal.telephony.uicc.AdnRecord p1, com.android.internal.telephony.uicc.SimPhonebookRecord p2, android.os.Message p3) {}
        void responseResult(java.lang.Exception p0) {}
    }
}

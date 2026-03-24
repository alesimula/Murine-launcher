package com.android.internal.telephony;

public class IccPhoneBookInterfaceManager {
    static final java.lang.String LOG_TAG = "IccPhoneBookIM";
    protected static final boolean DBG = true;
    protected com.android.internal.telephony.Phone mPhone;
    protected com.android.internal.telephony.uicc.AdnRecordCache mAdnCache;
    protected com.android.internal.telephony.uicc.SimPhonebookRecordCache mSimPbRecordCache;
    protected static final int EVENT_GET_SIZE_DONE = 1;
    protected static final int EVENT_LOAD_DONE = 2;
    protected static final int EVENT_UPDATE_DONE = 3;
    protected android.os.Handler mBaseHandler;
    public IccPhoneBookInterfaceManager(com.android.internal.telephony.Phone p0) {}
    public void dispose() {}
    public void updateIccRecords(com.android.internal.telephony.uicc.IccRecords p0) {}
    protected void logd(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    public boolean updateAdnRecordsInEfBySearchForSubscriber(int p0, android.content.ContentValues p1, java.lang.String p2) { return false; }
    public boolean updateAdnRecordsInEfByIndex(int p0, android.content.ContentValues p1, int p2, java.lang.String p3) { return false; }
    public int[] getAdnRecordsSize(int p0) { return null; }
    public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEf(int p0) { return null; }
    protected void checkThread() {}
    protected void waitForResult(com.android.internal.telephony.IccPhoneBookInterfaceManager.Request p0) {}
    public com.android.internal.telephony.uicc.AdnCapacity getAdnRecordsCapacity() { return null; }

    private static final class Request {
        java.util.concurrent.atomic.AtomicBoolean mStatus;
        java.lang.Object mResult;
    }
}

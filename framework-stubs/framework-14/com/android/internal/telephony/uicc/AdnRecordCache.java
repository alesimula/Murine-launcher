package com.android.internal.telephony.uicc;

public class AdnRecordCache extends android.os.Handler implements com.android.internal.telephony.uicc.IccConstants {
    android.util.SparseArray<java.util.ArrayList<com.android.internal.telephony.uicc.AdnRecord>> mAdnLikeFiles;
    android.util.SparseArray<java.util.ArrayList<android.os.Message>> mAdnLikeWaiters;
    android.util.SparseArray<android.os.Message> mUserWriteResponse;
    static final int EVENT_LOAD_ALL_ADN_LIKE_DONE = 1;
    static final int EVENT_UPDATE_ADN_DONE = 2;
    AdnRecordCache(com.android.internal.telephony.uicc.IccFileHandler p0) { super(); }
    public AdnRecordCache(com.android.internal.telephony.uicc.IccFileHandler p0, com.android.internal.telephony.gsm.UsimPhoneBookManager p1) { super(); }
    public void reset() {}
    public java.util.ArrayList<com.android.internal.telephony.uicc.AdnRecord> getRecordsIfLoaded(int p0) { return null; }
    public int extensionEfForEf(int p0) { return 0; }
    public void updateAdnByIndex(int p0, com.android.internal.telephony.uicc.AdnRecord p1, int p2, java.lang.String p3, android.os.Message p4) {}
    public void updateAdnBySearch(int p0, com.android.internal.telephony.uicc.AdnRecord p1, com.android.internal.telephony.uicc.AdnRecord p2, java.lang.String p3, android.os.Message p4) {}
    public void requestLoadAllAdnLike(int p0, int p1, android.os.Message p2) {}
    public void handleMessage(android.os.Message p0) {}
    protected void setAdnLikeWriters(int p0, java.util.ArrayList<android.os.Message> p1) {}
    protected void setAdnLikeFiles(int p0, java.util.ArrayList<com.android.internal.telephony.uicc.AdnRecord> p1) {}
    protected void setUserWriteResponse(int p0, android.os.Message p1) {}
    protected com.android.internal.telephony.gsm.UsimPhoneBookManager getUsimPhoneBookManager() { return null; }
}

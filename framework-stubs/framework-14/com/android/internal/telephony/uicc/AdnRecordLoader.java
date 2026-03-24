package com.android.internal.telephony.uicc;

public class AdnRecordLoader extends android.os.Handler {
    static final java.lang.String LOG_TAG = "AdnRecordLoader";
    static final boolean VDBG = false;
    int mEf;
    int mExtensionEF;
    int mPendingExtLoads;
    android.os.Message mUserResponse;
    java.lang.String mPin2;
    int mRecordNumber;
    java.util.ArrayList<com.android.internal.telephony.uicc.AdnRecord> mAdns;
    java.lang.Object mResult;
    static final int EVENT_ADN_LOAD_DONE = 1;
    static final int EVENT_EXT_RECORD_LOAD_DONE = 2;
    static final int EVENT_ADN_LOAD_ALL_DONE = 3;
    static final int EVENT_EF_LINEAR_RECORD_SIZE_DONE = 4;
    static final int EVENT_UPDATE_RECORD_DONE = 5;
    static final int VOICEMAIL_ALPHATAG_ARG = 1;
    AdnRecordLoader(com.android.internal.telephony.uicc.IccFileHandler p0) { super(); }
    public void loadFromEF(int p0, int p1, int p2, android.os.Message p3) {}
    public void loadAllFromEF(int p0, int p1, android.os.Message p2) {}
    public void updateEF(com.android.internal.telephony.uicc.AdnRecord p0, int p1, int p2, int p3, java.lang.String p4, android.os.Message p5) {}
    public void handleMessage(android.os.Message p0) {}
}

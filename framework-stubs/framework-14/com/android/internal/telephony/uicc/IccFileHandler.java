package com.android.internal.telephony.uicc;

public abstract class IccFileHandler extends android.os.Handler implements com.android.internal.telephony.uicc.IccConstants {
    protected static final int COMMAND_READ_BINARY = 176;
    protected static final int COMMAND_UPDATE_BINARY = 214;
    protected static final int COMMAND_READ_RECORD = 178;
    protected static final int COMMAND_UPDATE_RECORD = 220;
    protected static final int COMMAND_SEEK = 162;
    protected static final int COMMAND_GET_RESPONSE = 192;
    protected static final int READ_RECORD_MODE_ABSOLUTE = 4;
    protected static final int EF_TYPE_TRANSPARENT = 0;
    protected static final int EF_TYPE_LINEAR_FIXED = 1;
    protected static final int EF_TYPE_CYCLIC = 3;
    protected static final int TYPE_RFU = 0;
    protected static final int TYPE_MF = 1;
    protected static final int TYPE_DF = 2;
    protected static final int TYPE_EF = 4;
    protected static final int GET_RESPONSE_EF_SIZE_BYTES = 15;
    protected static final int GET_RESPONSE_EF_IMG_SIZE_BYTES = 10;
    protected static final int RESPONSE_DATA_RFU_1 = 0;
    protected static final int RESPONSE_DATA_RFU_2 = 1;
    protected static final int RESPONSE_DATA_FILE_SIZE_1 = 2;
    protected static final int RESPONSE_DATA_FILE_SIZE_2 = 3;
    protected static final int RESPONSE_DATA_FILE_ID_1 = 4;
    protected static final int RESPONSE_DATA_FILE_ID_2 = 5;
    protected static final int RESPONSE_DATA_FILE_TYPE = 6;
    protected static final int RESPONSE_DATA_RFU_3 = 7;
    protected static final int RESPONSE_DATA_ACCESS_CONDITION_1 = 8;
    protected static final int RESPONSE_DATA_ACCESS_CONDITION_2 = 9;
    protected static final int RESPONSE_DATA_ACCESS_CONDITION_3 = 10;
    protected static final int RESPONSE_DATA_FILE_STATUS = 11;
    protected static final int RESPONSE_DATA_LENGTH = 12;
    protected static final int RESPONSE_DATA_STRUCTURE = 13;
    protected static final int RESPONSE_DATA_RECORD_LENGTH = 14;
    protected static final int EVENT_GET_BINARY_SIZE_DONE = 4;
    protected static final int EVENT_READ_BINARY_DONE = 5;
    protected static final int EVENT_GET_RECORD_SIZE_DONE = 6;
    protected static final int EVENT_READ_RECORD_DONE = 7;
    protected static final int EVENT_GET_EF_LINEAR_RECORD_SIZE_DONE = 8;
    protected static final int EVENT_READ_IMG_DONE = 9;
    protected static final int EVENT_READ_ICON_DONE = 10;
    protected static final int EVENT_GET_RECORD_SIZE_IMG_DONE = 11;
    protected static final int EVENT_GET_EF_TRANSPARENT_SIZE_DONE = 12;
    protected final com.android.internal.telephony.CommandsInterface mCi = null;
    protected final com.android.internal.telephony.uicc.UiccCardApplication mParentApp = null;
    protected final java.lang.String mAid = null;
    public int getEfid(com.android.internal.telephony.uicc.IccFileHandler.LoadLinearFixedContext p0) { return 0; }
    protected IccFileHandler(com.android.internal.telephony.uicc.UiccCardApplication p0, java.lang.String p1, com.android.internal.telephony.CommandsInterface p2) { super(); }
    public IccFileHandler(com.android.internal.telephony.CommandsInterface p0) { super(); }
    public void dispose() {}
    public void loadEFLinearFixed(int p0, java.lang.String p1, int p2, android.os.Message p3) {}
    public void loadEFLinearFixed(int p0, int p1, android.os.Message p2) {}
    public void loadEFImgLinearFixed(int p0, android.os.Message p1) {}
    public void getEFLinearRecordSize(int p0, java.lang.String p1, android.os.Message p2) {}
    public void getEFLinearRecordSize(int p0, android.os.Message p1) {}
    public void getEFTransparentRecordSize(int p0, android.os.Message p1) {}
    public void loadEFLinearFixedAll(int p0, java.lang.String p1, android.os.Message p2) {}
    public void loadEFLinearFixedAll(int p0, android.os.Message p1) {}
    public void loadEFTransparent(int p0, android.os.Message p1) {}
    public void loadEFTransparent(int p0, int p1, android.os.Message p2) {}
    public void loadEFImgTransparent(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public void updateEFLinearFixed(int p0, java.lang.String p1, int p2, byte[] p3, java.lang.String p4, android.os.Message p5) {}
    public void updateEFLinearFixed(int p0, int p1, byte[] p2, java.lang.String p3, android.os.Message p4) {}
    public void updateEFTransparent(int p0, byte[] p1, android.os.Message p2) {}
    public void handleMessage(android.os.Message p0) {}
    protected java.lang.String getCommonIccEFPath(int p0) { return null; }
    protected abstract java.lang.String getEFPath(int p0);
    protected abstract void logd(java.lang.String p0);
    protected abstract void loge(java.lang.String p0);

    public static class LoadLinearFixedContext {
        int mEfid;
        int mRecordNum;
        int mRecordSize;
        int mCountRecords;
        boolean mLoadAll;
        java.lang.String mPath;
        android.os.Message mOnLoaded;
        java.util.ArrayList<byte[]> results;
        LoadLinearFixedContext(int p0, int p1, android.os.Message p2) {}
        LoadLinearFixedContext(int p0, int p1, java.lang.String p2, android.os.Message p3) {}
        LoadLinearFixedContext(int p0, java.lang.String p1, android.os.Message p2) {}
    }
}

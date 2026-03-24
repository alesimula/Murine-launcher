package com.android.internal.telephony.uicc;

public class RuimRecords extends com.android.internal.telephony.uicc.IccRecords {
    static final java.lang.String LOG_TAG = "RuimRecords";
    boolean mCsimSpnDisplayCondition;
    public java.lang.String toString() { return null; }
    public RuimRecords(com.android.internal.telephony.uicc.UiccCardApplication p0, android.content.Context p1, com.android.internal.telephony.CommandsInterface p2) { super(null, null, null); }
    public void dispose() {}
    protected void finalize() {}
    protected void resetRecords() {}
    public java.lang.String getMdnNumber() { return null; }
    public java.lang.String getCdmaMin() { return null; }
    public java.lang.String getPrlVersion() { return null; }
    public java.lang.String getNAI() { return null; }
    public void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void onRefresh(boolean p0, int[] p1) {}
    public java.lang.String getRUIMOperatorNumeric() { return null; }
    public void handleMessage(android.os.Message p0) {}
    protected void onRecordLoaded() {}
    protected void onAllRecordsLoaded() {}
    public void onReady() {}
    protected void onLocked() {}
    public boolean isProvisioned() { return false; }
    public void setVoiceMessageWaiting(int p0, int p1) {}
    public int getVoiceMessageCount() { return 0; }
    protected void handleFileUpdate(int p0) {}
    public java.lang.String getMdn() { return null; }
    public java.lang.String getMin() { return null; }
    public java.lang.String getSid() { return null; }
    public java.lang.String getNid() { return null; }
    public boolean getCsimSpnDisplayCondition() { return false; }
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class EfCsimCdmaHomeLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfCsimEprlLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    public class EfCsimImsimLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public EfCsimImsimLoaded(com.android.internal.telephony.uicc.RuimRecords p0) {}
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
        public java.lang.String decodeImsi(byte[] p0) { return null; }
    }

    private class EfCsimLiLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfCsimMdnLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfCsimMipUppLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        boolean checkLengthLegal(int p0, int p1) { return false; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfCsimSpnLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfPlLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }
}

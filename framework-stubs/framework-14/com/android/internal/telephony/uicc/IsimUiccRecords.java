package com.android.internal.telephony.uicc;

public class IsimUiccRecords extends com.android.internal.telephony.uicc.IccRecords implements com.android.internal.telephony.uicc.IsimRecords {
    protected static final java.lang.String LOG_TAG = "IsimUiccRecords";
    public static final java.lang.String INTENT_ISIM_REFRESH = "com.android.intent.isim_refresh";
    public java.lang.String toString() { return null; }
    public IsimUiccRecords(com.android.internal.telephony.uicc.UiccCardApplication p0, android.content.Context p1, com.android.internal.telephony.CommandsInterface p2) { super(null, null, null); }
    public void dispose() {}
    public void handleMessage(android.os.Message p0) {}
    protected void fetchIsimRecords() {}
    protected void resetRecords() {}
    public com.android.internal.telephony.uicc.IsimUiccRecords.EfIsimIstLoaded getIsimIstObject() { return null; }
    public com.android.internal.telephony.uicc.IsimUiccRecords.EfIsimPsiSmscLoaded getPsiSmscObject() { return null; }
    protected void onRecordLoaded() {}
    protected void onAllRecordsLoaded() {}
    protected void handleFileUpdate(int p0) {}
    public java.lang.String getIsimImpi() { return null; }
    public java.lang.String getIsimDomain() { return null; }
    public java.lang.String[] getIsimImpu() { return null; }
    public java.lang.String getIsimIst() { return null; }
    public java.lang.String[] getIsimPcscf() { return null; }
    public void onReady() {}
    public void onRefresh(boolean p0, int[] p1) {}
    public void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void setVoiceMessageWaiting(int p0, int p1) {}
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public int getVoiceMessageCount() { return 0; }

    private class EfIsimDomainLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfIsimImpiLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfIsimImpuLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfIsimIstLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfIsimPcscfLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfIsimPsiSmscLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }

    private class EfIsimSmssLoaded implements com.android.internal.telephony.uicc.IccRecords.IccRecordLoaded {
        public java.lang.String getEfName() { return null; }
        public void onRecordLoaded(android.os.AsyncResult p0) {}
    }
}

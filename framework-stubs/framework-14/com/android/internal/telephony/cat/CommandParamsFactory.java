package com.android.internal.telephony.cat;

public class CommandParamsFactory extends android.os.Handler {
    static final int MSG_ID_LOAD_ICON_DONE = 1;
    static final int LOAD_NO_ICON = 0;
    static final int LOAD_SINGLE_ICON = 1;
    static final int LOAD_MULTI_ICONS = 2;
    static final int DTTZ_SETTING = 3;
    static final int LANGUAGE_SETTING = 4;
    static final int NON_SPECIFIC_LANGUAGE = 0;
    static final int SPECIFIC_LANGUAGE = 1;
    public static synchronized com.android.internal.telephony.cat.CommandParamsFactory getInstance(com.android.internal.telephony.cat.RilMessageDecoder p0, com.android.internal.telephony.uicc.IccFileHandler p1, android.content.Context p2) { return null; }
    void make(com.android.internal.telephony.cat.BerTlv p0) {}
    public void handleMessage(android.os.Message p0) {}
    public boolean processSMSEventNotify(com.android.internal.telephony.cat.CommandDetails p0, java.util.List<com.android.internal.telephony.cat.ComprehensionTlv> p1) throws com.android.internal.telephony.cat.ResultException { return false; }
    public void dispose() {}
}

package com.android.internal.telephony.gsm;

public final class GsmSMSDispatcher extends com.android.internal.telephony.SMSDispatcher {
    protected com.android.internal.telephony.uicc.UiccController mUiccController;
    public GsmSMSDispatcher(com.android.internal.telephony.Phone p0, com.android.internal.telephony.SmsDispatchersController p1, com.android.internal.telephony.gsm.GsmInboundSmsHandler p2) { super(null, null); }
    public void dispose() {}
    protected java.lang.String getFormat() { return null; }
    public void handleMessage(android.os.Message p0) {}
    protected boolean shouldBlockSmsForEcbm() { return false; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5, int p6) { return null; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4) { return null; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5, int p6, int p7) { return null; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4, int p5) { return null; }
    protected com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calculateLength(java.lang.CharSequence p0, boolean p1) { return null; }
    protected void handleStatusReport(java.lang.Object p0) {}
    protected void sendSms(com.android.internal.telephony.SMSDispatcher.SmsTracker p0) {}
    protected com.android.internal.telephony.uicc.UiccCardApplication getUiccCardApplication() { return null; }
}

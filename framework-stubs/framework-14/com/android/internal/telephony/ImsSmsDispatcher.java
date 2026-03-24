package com.android.internal.telephony;

public class ImsSmsDispatcher extends com.android.internal.telephony.SMSDispatcher {
    public static final int MAX_SEND_RETRIES_OVER_IMS = 3;
    public java.util.List<java.lang.Integer> mMemoryAvailableNotifierList;
    public java.util.Map<java.lang.Integer, com.android.internal.telephony.SMSDispatcher.SmsTracker> mTrackers;
    public java.util.concurrent.atomic.AtomicInteger mNextToken;
    public void handleMessage(android.os.Message p0) {}
    public ImsSmsDispatcher(com.android.internal.telephony.Phone p0, com.android.internal.telephony.SmsDispatchersController p1, com.android.internal.telephony.ImsSmsDispatcher.FeatureConnectorFactory p2) { super(null, null); }
    public boolean isEmergencySmsSupport(java.lang.String p0) { return false; }
    public boolean isAvailable() { return false; }
    protected java.lang.String getFormat() { return null; }
    public int getMaxSmsRetryCount() { return 0; }
    public int getMaxRetryCountOverIms() { return 0; }
    public int getSmsRetryDelayValue() { return 0; }
    protected boolean shouldBlockSmsForEcbm() { return false; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5, int p6) { return null; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4) { return null; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5, int p6, int p7) { return null; }
    protected com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4, int p5) { return null; }
    protected com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calculateLength(java.lang.CharSequence p0, boolean p1) { return null; }
    public void onMemoryAvailable() {}
    public void sendSms(com.android.internal.telephony.SMSDispatcher.SmsTracker p0) {}
    public void fallbackToPstn(com.android.internal.telephony.SMSDispatcher.SmsTracker p0) {}
    protected boolean isCdmaMo() { return false; }
    public android.telephony.ims.aidl.IImsSmsListener getSmsListener() { return null; }

    public static interface FeatureConnectorFactory {
        public com.android.ims.FeatureConnector<com.android.ims.ImsManager> create(android.content.Context p0, int p1, java.lang.String p2, com.android.ims.FeatureConnector.Listener<com.android.ims.ImsManager> p3, java.util.concurrent.Executor p4);
    }
}

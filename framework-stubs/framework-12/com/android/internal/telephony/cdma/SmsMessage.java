package com.android.internal.telephony.cdma;

public class SmsMessage extends com.android.internal.telephony.SmsMessageBase {
    static final java.lang.String LOG_TAG = "SmsMessage";
    private static final java.lang.String LOGGABLE_TAG = "CDMA:SMS";
    private static final boolean VDBG = false;
    private static final byte TELESERVICE_IDENTIFIER = 0;
    private static final byte SERVICE_CATEGORY = 1;
    private static final byte ORIGINATING_ADDRESS = 2;
    private static final byte ORIGINATING_SUB_ADDRESS = 3;
    private static final byte DESTINATION_ADDRESS = 4;
    private static final byte DESTINATION_SUB_ADDRESS = 5;
    private static final byte BEARER_REPLY_OPTION = 6;
    private static final byte CAUSE_CODES = 7;
    private static final byte BEARER_DATA = 8;
    private int status;
    private static final int RETURN_NO_ACK = 0;
    private static final int RETURN_ACK = 1;
    private static final int PRIORITY_NORMAL = 0;
    private static final int PRIORITY_INTERACTIVE = 1;
    private static final int PRIORITY_URGENT = 2;
    private static final int PRIORITY_EMERGENCY = 3;
    private com.android.internal.telephony.cdma.sms.SmsEnvelope mEnvelope;
    private com.android.internal.telephony.cdma.sms.BearerData mBearerData;
    public SmsMessage(com.android.internal.telephony.SmsAddress p0, com.android.internal.telephony.cdma.sms.SmsEnvelope p1) { super(); }
    public SmsMessage() { super(); }
    public static com.android.internal.telephony.cdma.SmsMessage createFromPdu(byte[] p0) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage createFromEfRecord(int p0, byte[] p1) { return null; }
    public static int getTPLayerLengthForPDU(java.lang.String p0) { return 0; }
    public static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, com.android.internal.telephony.cdma.sms.UserData p1, boolean p2) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, com.android.internal.telephony.cdma.sms.UserData p1, boolean p2, int p3) { return null; }
    public int getProtocolIdentifier() { return 0; }
    public boolean isReplace() { return false; }
    public boolean isCphsMwiMessage() { return false; }
    public boolean isMWIClearMessage() { return false; }
    public boolean isMWISetMessage() { return false; }
    public boolean isMwiDontStore() { return false; }
    public int getStatus() { return 0; }
    public boolean isStatusReportMessage() { return false; }
    public boolean isReplyPathPresent() { return false; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calculateLength(java.lang.CharSequence p0, boolean p1, boolean p2) { return null; }
    public int getTeleService() { return 0; }
    public int getMessageType() { return 0; }
    private void parsePdu(byte[] p0) {}
    private void parsePduFromEfRecord(byte[] p0) {}
    public boolean preprocessCdmaFdeaWap() { return false; }
    public void parseSms() {}
    private void decodeSmsDisplayAddress(com.android.internal.telephony.SmsAddress p0) {}
    public android.telephony.SmsCbMessage parseBroadcastSms(java.lang.String p0, int p1, int p2) { return null; }
    public byte[] getEnvelopeBearerData() { return null; }
    public int getEnvelopeServiceCategory() { return 0; }
    public com.android.internal.telephony.SmsConstants.MessageClass getMessageClass() { return null; }
    public static synchronized int getNextMessageId() { return 0; }
    private static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu privateGetSubmitPdu(java.lang.String p0, boolean p1, com.android.internal.telephony.cdma.sms.UserData p2) { return null; }
    private static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu privateGetSubmitPdu(java.lang.String p0, boolean p1, com.android.internal.telephony.cdma.sms.UserData p2, int p3) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage.SubmitPdu getDeliverPdu(java.lang.String p0, java.lang.String p1, long p2) { return null; }
    public void createPdu() {}
    public static byte convertDtmfToAscii(byte p0) { return 0; }
    public int getNumOfVoicemails() { return 0; }
    public byte[] getIncomingSmsFingerprint() { return null; }
    public java.util.ArrayList<android.telephony.cdma.CdmaSmsCbProgramData> getSmsCbProgramData() { return null; }

    public static class SubmitPdu extends com.android.internal.telephony.SmsMessageBase.SubmitPduBase {
        public SubmitPdu() { super(); }
    }
}

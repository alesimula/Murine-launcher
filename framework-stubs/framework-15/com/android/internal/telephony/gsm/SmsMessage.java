package com.android.internal.telephony.gsm;

public class SmsMessage extends com.android.internal.telephony.SmsMessageBase {
    static final java.lang.String LOG_TAG = "SmsMessage";
    public SmsMessage() { super(); }
    public static com.android.internal.telephony.gsm.SmsMessage createFromPdu(byte[] p0) { return null; }
    public boolean isTypeZero() { return false; }
    public static com.android.internal.telephony.gsm.SmsMessage createFromEfRecord(int p0, byte[] p1) { return null; }
    public static int getTPLayerLengthForPDU(java.lang.String p0) { return 0; }
    public static int getRelativeValidityPeriod(int p0) { return 0; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, byte[] p4) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, byte[] p4, int p5, int p6, int p7) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, byte[] p4, int p5, int p6, int p7, int p8) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, byte[] p4, int p5, int p6, int p7, int p8, int p9) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, int p4) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4, int p5) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4) { return null; }
    public static com.android.internal.telephony.gsm.SmsMessage.SubmitPdu getDeliverPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3) { return null; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calculateLength(java.lang.CharSequence p0, boolean p1) { return null; }
    public int getProtocolIdentifier() { return 0; }
    int getDataCodingScheme() { return 0; }
    public boolean isReplace() { return false; }
    public boolean isCphsMwiMessage() { return false; }
    public boolean isMWIClearMessage() { return false; }
    public boolean isMWISetMessage() { return false; }
    public boolean isMwiDontStore() { return false; }
    public int getStatus() { return 0; }
    public boolean isStatusReportMessage() { return false; }
    public boolean isReplyPathPresent() { return false; }
    public com.android.internal.telephony.SmsConstants.MessageClass getMessageClass() { return null; }
    boolean isUsimDataDownload() { return false; }
    public int getNumOfVoicemails() { return 0; }

    private static class PduParser {
        byte[] mPdu;
        int mCur;
        com.android.internal.telephony.SmsHeader mUserDataHeader;
        byte[] mUserData;
        int mUserDataSeptetPadding;
        PduParser(byte[] p0) {}
        java.lang.String getSCAddress() { return null; }
        int getByte() { return 0; }
        com.android.internal.telephony.gsm.GsmSmsAddress getAddress() { return null; }
        long getSCTimestampMillis() { return 0L; }
        int constructUserData(boolean p0, boolean p1) { return 0; }
        byte[] getUserData() { return null; }
        com.android.internal.telephony.SmsHeader getUserDataHeader() { return null; }
        java.lang.String getUserDataGSM7Bit(int p0, int p1, int p2) { return null; }
        java.lang.String getUserDataGSM8bit(int p0) { return null; }
        java.lang.String getUserDataUCS2(int p0) { return null; }
        java.lang.String getUserDataKSC5601(int p0) { return null; }
        boolean moreDataPresent() { return false; }
    }

    public static class SubmitPdu extends com.android.internal.telephony.SmsMessageBase.SubmitPduBase {
        public SubmitPdu() { super(); }
    }
}

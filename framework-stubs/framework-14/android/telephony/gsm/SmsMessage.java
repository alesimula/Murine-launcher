package android.telephony.gsm;

@java.lang.Deprecated
public class SmsMessage {
    @java.lang.Deprecated
    public static final int ENCODING_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int ENCODING_7BIT = 1;
    @java.lang.Deprecated
    public static final int ENCODING_8BIT = 2;
    @java.lang.Deprecated
    public static final int ENCODING_16BIT = 3;
    @java.lang.Deprecated
    public static final int MAX_USER_DATA_BYTES = 140;
    @java.lang.Deprecated
    public static final int MAX_USER_DATA_BYTES_WITH_HEADER = 134;
    @java.lang.Deprecated
    public static final int MAX_USER_DATA_SEPTETS = 160;
    @java.lang.Deprecated
    public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
    @java.lang.Deprecated
    public com.android.internal.telephony.SmsMessageBase mWrappedSmsMessage;
    @java.lang.Deprecated
    public SmsMessage() {}
    @java.lang.Deprecated
    public static android.telephony.gsm.SmsMessage createFromPdu(byte[] p0) { return null; }
    @java.lang.Deprecated
    public static int getTPLayerLengthForPDU(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public static int[] calculateLength(java.lang.CharSequence p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public static int[] calculateLength(java.lang.String p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public static android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, byte[] p4) { return null; }
    @java.lang.Deprecated
    public static android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return null; }
    @java.lang.Deprecated
    public static android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, short p2, byte[] p3, boolean p4) { return null; }
    @java.lang.Deprecated
    public java.lang.String getServiceCenterAddress() { return null; }
    @java.lang.Deprecated
    public java.lang.String getOriginatingAddress() { return null; }
    @java.lang.Deprecated
    public java.lang.String getDisplayOriginatingAddress() { return null; }
    @java.lang.Deprecated
    public java.lang.String getMessageBody() { return null; }
    @java.lang.Deprecated
    public android.telephony.gsm.SmsMessage.MessageClass getMessageClass() { return null; }
    @java.lang.Deprecated
    public java.lang.String getDisplayMessageBody() { return null; }
    @java.lang.Deprecated
    public java.lang.String getPseudoSubject() { return null; }
    @java.lang.Deprecated
    public long getTimestampMillis() { return 0L; }
    @java.lang.Deprecated
    public boolean isEmail() { return false; }
    @java.lang.Deprecated
    public java.lang.String getEmailBody() { return null; }
    @java.lang.Deprecated
    public java.lang.String getEmailFrom() { return null; }
    @java.lang.Deprecated
    public int getProtocolIdentifier() { return 0; }
    @java.lang.Deprecated
    public boolean isReplace() { return false; }
    @java.lang.Deprecated
    public boolean isCphsMwiMessage() { return false; }
    @java.lang.Deprecated
    public boolean isMWIClearMessage() { return false; }
    @java.lang.Deprecated
    public boolean isMWISetMessage() { return false; }
    @java.lang.Deprecated
    public boolean isMwiDontStore() { return false; }
    @java.lang.Deprecated
    public byte[] getUserData() { return null; }
    @java.lang.Deprecated
    public byte[] getPdu() { return null; }
    @java.lang.Deprecated
    public int getStatusOnSim() { return 0; }
    @java.lang.Deprecated
    public int getStatusOnIcc() { return 0; }
    @java.lang.Deprecated
    public int getIndexOnSim() { return 0; }
    @java.lang.Deprecated
    public int getIndexOnIcc() { return 0; }
    @java.lang.Deprecated
    public int getStatus() { return 0; }
    @java.lang.Deprecated
    public boolean isStatusReportMessage() { return false; }
    @java.lang.Deprecated
    public boolean isReplyPathPresent() { return false; }

    @java.lang.Deprecated
    public static class SubmitPdu {
        @java.lang.Deprecated
        public byte[] encodedScAddress;
        @java.lang.Deprecated
        public byte[] encodedMessage;
        @java.lang.Deprecated
        public SubmitPdu() {}
        @java.lang.Deprecated
        protected SubmitPdu(com.android.internal.telephony.SmsMessageBase.SubmitPduBase p0) {}
        @java.lang.Deprecated
        public java.lang.String toString() { return null; }
    }

    @java.lang.Deprecated
    public static enum MessageClass {
        UNKNOWN,
        CLASS_0,
        CLASS_1,
        CLASS_2,
        CLASS_3;
    }
}

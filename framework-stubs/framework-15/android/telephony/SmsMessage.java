package android.telephony;

public class SmsMessage {
    public static final int ENCODING_UNKNOWN = 0;
    public static final int ENCODING_7BIT = 1;
    public static final int ENCODING_8BIT = 2;
    public static final int ENCODING_16BIT = 3;
    public static final int ENCODING_KSC5601 = 4;
    public static final int MAX_USER_DATA_BYTES = 140;
    public static final int MAX_USER_DATA_BYTES_WITH_HEADER = 134;
    public static final int MAX_USER_DATA_SEPTETS = 160;
    public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
    public static final java.lang.String FORMAT_3GPP = "3gpp";
    public static final java.lang.String FORMAT_3GPP2 = "3gpp2";
    public com.android.internal.telephony.SmsMessageBase mWrappedSmsMessage;
    public void setSubId(int p0) {}
    public int getSubId() { return 0; }
    public SmsMessage(com.android.internal.telephony.SmsMessageBase p0) {}
    @java.lang.Deprecated
    public static android.telephony.SmsMessage createFromPdu(byte[] p0) { return null; }
    public static android.telephony.SmsMessage createFromPdu(byte[] p0, java.lang.String p1) { return null; }
    public static android.telephony.SmsMessage createFromEfRecord(int p0, byte[] p1) { return null; }
    public static android.telephony.SmsMessage createFromEfRecord(int p0, byte[] p1, int p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public static android.telephony.SmsMessage createFromNativeSmsSubmitPdu(byte[] p0, boolean p1) { return null; }
    public static int getTPLayerLengthForPDU(java.lang.String p0) { return 0; }
    public static int[] calculateLength(java.lang.CharSequence p0, boolean p1) { return null; }
    public static int[] calculateLength(java.lang.CharSequence p0, boolean p1, int p2) { return null; }
    public static java.util.ArrayList<java.lang.String> fragmentText(java.lang.String p0) { return null; }
    public static java.util.ArrayList<java.lang.String> fragmentText(java.lang.String p0, int p1) { return null; }
    public static int[] calculateLength(java.lang.String p0, boolean p1) { return null; }
    public static int[] calculateLength(java.lang.String p0, boolean p1, int p2) { return null; }
    public static android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return null; }
    public static android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, int p4) { return null; }
    public static android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String p0, java.lang.String p1, short p2, byte[] p3, boolean p4) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public static android.telephony.SmsMessage.SubmitPdu getSmsPdu(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, long p5) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_PRIVILEGED")
    @android.annotation.NonNull
    public static byte[] getSubmitPduEncodedMessage(boolean p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, int p8) { return null; }
    public java.lang.String getServiceCenterAddress() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOriginatingAddress() { return null; }
    public java.lang.String getDisplayOriginatingAddress() { return null; }
    public java.lang.String getMessageBody() { return null; }
    public android.telephony.SmsMessage.MessageClass getMessageClass() { return null; }
    public java.lang.String getDisplayMessageBody() { return null; }
    public java.lang.String getPseudoSubject() { return null; }
    public long getTimestampMillis() { return 0L; }
    public boolean isEmail() { return false; }
    public java.lang.String getEmailBody() { return null; }
    public java.lang.String getEmailFrom() { return null; }
    public int getProtocolIdentifier() { return 0; }
    public boolean isReplace() { return false; }
    public boolean isCphsMwiMessage() { return false; }
    public boolean isMWIClearMessage() { return false; }
    public boolean isMWISetMessage() { return false; }
    public boolean isMwiDontStore() { return false; }
    public byte[] getUserData() { return null; }
    public byte[] getPdu() { return null; }
    @java.lang.Deprecated
    public int getStatusOnSim() { return 0; }
    public int getStatusOnIcc() { return 0; }
    @java.lang.Deprecated
    public int getIndexOnSim() { return 0; }
    public int getIndexOnIcc() { return 0; }
    public int getStatus() { return 0; }
    public boolean isStatusReportMessage() { return false; }
    public boolean isReplyPathPresent() { return false; }
    public int getReceivedEncodingType() { return 0; }
    public boolean is3gpp() { return false; }
    public static boolean hasEmsSupport() { return false; }
    public static boolean shouldAppendPageNumberAsPrefix() { return false; }
    @android.annotation.Nullable
    public java.lang.String getRecipientAddress() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncodingSize {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }

    public static enum MessageClass {
        UNKNOWN,
        CLASS_0,
        CLASS_1,
        CLASS_2,
        CLASS_3;
    }

    private static class NoEmsSupportConfig {
        java.lang.String mOperatorNumber;
        java.lang.String mGid1;
        boolean mIsPrefix;
        public NoEmsSupportConfig(java.lang.String[] p0) {}
        public java.lang.String toString() { return null; }
    }

    public static class SubmitPdu {
        public byte[] encodedScAddress;
        public byte[] encodedMessage;
        public java.lang.String toString() { return null; }
        protected SubmitPdu(com.android.internal.telephony.SmsMessageBase.SubmitPduBase p0) {}
    }
}

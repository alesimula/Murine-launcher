package com.android.internal.telephony;

public abstract class SmsMessageBase {
    public static final java.util.regex.Pattern NAME_ADDR_EMAIL_PATTERN = null;
    protected java.lang.String mScAddress;
    protected com.android.internal.telephony.SmsAddress mOriginatingAddress;
    protected com.android.internal.telephony.SmsAddress mRecipientAddress;
    protected java.lang.String mMessageBody;
    protected java.lang.String mPseudoSubject;
    protected java.lang.String mEmailFrom;
    protected java.lang.String mEmailBody;
    protected boolean mIsEmail;
    protected long mScTimeMillis;
    protected byte[] mPdu;
    protected byte[] mUserData;
    protected com.android.internal.telephony.SmsHeader mUserDataHeader;
    protected boolean mIsMwi;
    protected boolean mMwiSense;
    protected boolean mMwiDontStore;
    protected int mReceivedEncodingType;
    protected int mStatusOnIcc;
    protected int mIndexOnIcc;
    public int mMessageRef;
    public SmsMessageBase() {}
    public java.lang.String getServiceCenterAddress() { return null; }
    public java.lang.String getOriginatingAddress() { return null; }
    public java.lang.String getDisplayOriginatingAddress() { return null; }
    public java.lang.String getMessageBody() { return null; }
    public abstract com.android.internal.telephony.SmsConstants.MessageClass getMessageClass();
    public java.lang.String getDisplayMessageBody() { return null; }
    public java.lang.String getPseudoSubject() { return null; }
    public long getTimestampMillis() { return 0L; }
    public boolean isEmail() { return false; }
    public java.lang.String getEmailBody() { return null; }
    public java.lang.String getEmailFrom() { return null; }
    public abstract int getProtocolIdentifier();
    public abstract boolean isReplace();
    public abstract boolean isCphsMwiMessage();
    public abstract boolean isMWIClearMessage();
    public abstract boolean isMWISetMessage();
    public abstract boolean isMwiDontStore();
    public byte[] getUserData() { return null; }
    public com.android.internal.telephony.SmsHeader getUserDataHeader() { return null; }
    public byte[] getPdu() { return null; }
    public abstract int getStatus();
    public abstract boolean isStatusReportMessage();
    public abstract boolean isReplyPathPresent();
    public int getStatusOnIcc() { return 0; }
    public int getIndexOnIcc() { return 0; }
    protected void parseMessageBody() {}
    public static boolean isEmailAddress(java.lang.String p0) { return false; }
    protected void extractEmailAddressFromMessageBody() {}
    public static int findNextUnicodePosition(int p0, int p1, java.lang.CharSequence p2) { return 0; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calcUnicodeEncodingDetails(java.lang.CharSequence p0) { return null; }
    public java.lang.String getRecipientAddress() { return null; }
    public int getReceivedEncodingType() { return 0; }

    public static abstract class SubmitPduBase {
        public byte[] encodedScAddress;
        public byte[] encodedMessage;
        public SubmitPduBase() {}
        public java.lang.String toString() { return null; }
    }
}

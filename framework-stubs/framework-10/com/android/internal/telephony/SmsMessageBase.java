package com.android.internal.telephony;

public abstract class SmsMessageBase {
    @android.annotation.UnsupportedAppUsage
    protected java.lang.String mScAddress;
    @android.annotation.UnsupportedAppUsage
    protected com.android.internal.telephony.SmsAddress mOriginatingAddress;
    protected com.android.internal.telephony.SmsAddress mRecipientAddress;
    @android.annotation.UnsupportedAppUsage
    protected java.lang.String mMessageBody;
    protected java.lang.String mPseudoSubject;
    protected java.lang.String mEmailFrom;
    protected java.lang.String mEmailBody;
    protected boolean mIsEmail;
    protected long mScTimeMillis;
    @android.annotation.UnsupportedAppUsage
    protected byte[] mPdu;
    protected byte[] mUserData;
    @android.annotation.UnsupportedAppUsage
    protected com.android.internal.telephony.SmsHeader mUserDataHeader;
    @android.annotation.UnsupportedAppUsage
    protected boolean mIsMwi;
    @android.annotation.UnsupportedAppUsage
    protected boolean mMwiSense;
    @android.annotation.UnsupportedAppUsage
    protected boolean mMwiDontStore;
    protected int mStatusOnIcc;
    protected int mIndexOnIcc;
    @android.annotation.UnsupportedAppUsage
    public int mMessageRef;
    public SmsMessageBase() {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.lang.String getServiceCenterAddress() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getOriginatingAddress() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDisplayOriginatingAddress() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getMessageBody() { return null; }
    public abstract com.android.internal.telephony.SmsConstants.MessageClass getMessageClass();
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDisplayMessageBody() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getPseudoSubject() { return null; }
    @android.annotation.UnsupportedAppUsage
    public long getTimestampMillis() { return 0L; }
    public boolean isEmail() { return false; }
    public java.lang.String getEmailBody() { return null; }
    public java.lang.String getEmailFrom() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public abstract int getProtocolIdentifier();
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public abstract boolean isReplace();
    public abstract boolean isCphsMwiMessage();
    public abstract boolean isMWIClearMessage();
    public abstract boolean isMWISetMessage();
    public abstract boolean isMwiDontStore();
    @android.annotation.UnsupportedAppUsage
    public byte[] getUserData() { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.telephony.SmsHeader getUserDataHeader() { return null; }
    public byte[] getPdu() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public abstract int getStatus();
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isStatusReportMessage();
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public abstract boolean isReplyPathPresent();
    public int getStatusOnIcc() { return 0; }
    public int getIndexOnIcc() { return 0; }
    protected void parseMessageBody() {}
    protected void extractEmailAddressFromMessageBody() {}
    public static int findNextUnicodePosition(int p0, int p1, java.lang.CharSequence p2) { return 0; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calcUnicodeEncodingDetails(java.lang.CharSequence p0) { return null; }
    public java.lang.String getRecipientAddress() { return null; }

    public static abstract class SubmitPduBase {
        @android.annotation.UnsupportedAppUsage
        public byte[] encodedScAddress;
        @android.annotation.UnsupportedAppUsage
        public byte[] encodedMessage;
        public SubmitPduBase() {}
        public java.lang.String toString() { return null; }
    }
}

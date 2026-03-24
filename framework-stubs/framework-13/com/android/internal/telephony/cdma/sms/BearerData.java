package com.android.internal.telephony.cdma.sms;

public final class BearerData {
    public static final int MESSAGE_TYPE_DELIVER = 1;
    public static final int MESSAGE_TYPE_SUBMIT = 2;
    public static final int MESSAGE_TYPE_CANCELLATION = 3;
    public static final int MESSAGE_TYPE_DELIVERY_ACK = 4;
    public static final int MESSAGE_TYPE_USER_ACK = 5;
    public static final int MESSAGE_TYPE_READ_ACK = 6;
    public static final int MESSAGE_TYPE_DELIVER_REPORT = 7;
    public static final int MESSAGE_TYPE_SUBMIT_REPORT = 8;
    public int messageType;
    public int messageId;
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_INTERACTIVE = 1;
    public static final int PRIORITY_URGENT = 2;
    public static final int PRIORITY_EMERGENCY = 3;
    public boolean priorityIndicatorSet;
    public int priority;
    public static final int PRIVACY_NOT_RESTRICTED = 0;
    public static final int PRIVACY_RESTRICTED = 1;
    public static final int PRIVACY_CONFIDENTIAL = 2;
    public static final int PRIVACY_SECRET = 3;
    public boolean privacyIndicatorSet;
    public int privacy;
    public static final int ALERT_DEFAULT = 0;
    public static final int ALERT_LOW_PRIO = 1;
    public static final int ALERT_MEDIUM_PRIO = 2;
    public static final int ALERT_HIGH_PRIO = 3;
    public boolean alertIndicatorSet;
    public int alert;
    public static final int DISPLAY_MODE_IMMEDIATE = 0;
    public static final int DISPLAY_MODE_DEFAULT = 1;
    public static final int DISPLAY_MODE_USER = 2;
    public boolean displayModeSet;
    public int displayMode;
    public static final int LANGUAGE_UNKNOWN = 0;
    public static final int LANGUAGE_ENGLISH = 1;
    public static final int LANGUAGE_FRENCH = 2;
    public static final int LANGUAGE_SPANISH = 3;
    public static final int LANGUAGE_JAPANESE = 4;
    public static final int LANGUAGE_KOREAN = 5;
    public static final int LANGUAGE_CHINESE = 6;
    public static final int LANGUAGE_HEBREW = 7;
    public boolean languageIndicatorSet;
    public int language;
    public static final int ERROR_NONE = 0;
    public static final int STATUS_ACCEPTED = 0;
    public static final int STATUS_DEPOSITED_TO_INTERNET = 1;
    public static final int STATUS_DELIVERED = 2;
    public static final int STATUS_CANCELLED = 3;
    public static final int ERROR_TEMPORARY = 2;
    public static final int STATUS_NETWORK_CONGESTION = 4;
    public static final int STATUS_NETWORK_ERROR = 5;
    public static final int STATUS_UNKNOWN_ERROR = 31;
    public static final int ERROR_PERMANENT = 3;
    public static final int STATUS_CANCEL_FAILED = 6;
    public static final int STATUS_BLOCKED_DESTINATION = 7;
    public static final int STATUS_TEXT_TOO_LONG = 8;
    public static final int STATUS_DUPLICATE_MESSAGE = 9;
    public static final int STATUS_INVALID_DESTINATION = 10;
    public static final int STATUS_MESSAGE_EXPIRED = 13;
    public static final int ERROR_UNDEFINED = 255;
    public static final int STATUS_UNDEFINED = 255;
    public boolean messageStatusSet;
    public int errorClass;
    public int messageStatus;
    public boolean hasUserDataHeader;
    public com.android.internal.telephony.cdma.sms.UserData userData;
    public boolean userResponseCodeSet;
    public int userResponseCode;
    public com.android.internal.telephony.cdma.sms.BearerData.TimeStamp msgCenterTimeStamp;
    public com.android.internal.telephony.cdma.sms.BearerData.TimeStamp validityPeriodAbsolute;
    public com.android.internal.telephony.cdma.sms.BearerData.TimeStamp deferredDeliveryTimeAbsolute;
    public static final int RELATIVE_TIME_MINS_LIMIT = 143;
    public static final int RELATIVE_TIME_HOURS_LIMIT = 167;
    public static final int RELATIVE_TIME_DAYS_LIMIT = 196;
    public static final int RELATIVE_TIME_WEEKS_LIMIT = 244;
    public static final int RELATIVE_TIME_INDEFINITE = 245;
    public static final int RELATIVE_TIME_NOW = 246;
    public static final int RELATIVE_TIME_MOBILE_INACTIVE = 247;
    public static final int RELATIVE_TIME_RESERVED = 248;
    public boolean validityPeriodRelativeSet;
    public int validityPeriodRelative;
    public boolean deferredDeliveryTimeRelativeSet;
    public int deferredDeliveryTimeRelative;
    public boolean userAckReq;
    public boolean deliveryAckReq;
    public boolean readAckReq;
    public boolean reportReq;
    public int numberOfMessages;
    public int depositIndex;
    public com.android.internal.telephony.cdma.sms.CdmaSmsAddress callbackNumber;
    public android.telephony.SmsCbCmasInfo cmasWarningInfo;
    public java.util.ArrayList<android.telephony.cdma.CdmaSmsCbProgramData> serviceCategoryProgramData;
    public java.util.ArrayList<android.telephony.cdma.CdmaSmsCbProgramResults> serviceCategoryProgramResults;
    public BearerData() {}
    public java.lang.String getLanguage() { return null; }
    public java.lang.String toString() { return null; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calcTextEncodingDetails(java.lang.CharSequence p0, boolean p1, boolean p2) { return null; }
    public static byte[] encode(com.android.internal.telephony.cdma.sms.BearerData p0) { return null; }
    public static com.android.internal.telephony.cdma.sms.BearerData decode(byte[] p0) { return null; }
    public static com.android.internal.telephony.cdma.sms.BearerData decode(byte[] p0, int p1) { return null; }

    private static class CodingException extends java.lang.Exception {
        public CodingException(java.lang.String p0) { super(); }
    }

    private static class Gsm7bitCodingResult {
        int septets;
        byte[] data;
    }

    public static class TimeStamp {
        public int second;
        public int minute;
        public int hour;
        public int monthDay;
        public int monthOrdinal;
        public int year;
        public TimeStamp() {}
        public static com.android.internal.telephony.cdma.sms.BearerData.TimeStamp fromByteArray(byte[] p0) { return null; }
        public static com.android.internal.telephony.cdma.sms.BearerData.TimeStamp fromMillis(long p0) { return null; }
        public byte[] toByteArray() { return null; }
        public long toMillis() { return 0L; }
        public java.lang.String toString() { return null; }
    }
}

package com.android.internal.telephony.cdma.sms;

public final class BearerData {
    private static final java.lang.String LOG_TAG = "BearerData";
    private static final byte SUBPARAM_MESSAGE_IDENTIFIER = 0;
    private static final byte SUBPARAM_USER_DATA = 1;
    private static final byte SUBPARAM_USER_RESPONSE_CODE = 2;
    private static final byte SUBPARAM_MESSAGE_CENTER_TIME_STAMP = 3;
    private static final byte SUBPARAM_VALIDITY_PERIOD_ABSOLUTE = 4;
    private static final byte SUBPARAM_VALIDITY_PERIOD_RELATIVE = 5;
    private static final byte SUBPARAM_DEFERRED_DELIVERY_TIME_ABSOLUTE = 6;
    private static final byte SUBPARAM_DEFERRED_DELIVERY_TIME_RELATIVE = 7;
    private static final byte SUBPARAM_PRIORITY_INDICATOR = 8;
    private static final byte SUBPARAM_PRIVACY_INDICATOR = 9;
    private static final byte SUBPARAM_REPLY_OPTION = 10;
    private static final byte SUBPARAM_NUMBER_OF_MESSAGES = 11;
    private static final byte SUBPARAM_ALERT_ON_MESSAGE_DELIVERY = 12;
    private static final byte SUBPARAM_LANGUAGE_INDICATOR = 13;
    private static final byte SUBPARAM_CALLBACK_NUMBER = 14;
    private static final byte SUBPARAM_MESSAGE_DISPLAY_MODE = 15;
    private static final byte SUBPARAM_MESSAGE_DEPOSIT_INDEX = 17;
    private static final byte SUBPARAM_SERVICE_CATEGORY_PROGRAM_DATA = 18;
    private static final byte SUBPARAM_SERVICE_CATEGORY_PROGRAM_RESULTS = 19;
    private static final byte SUBPARAM_MESSAGE_STATUS = 20;
    private static final byte SUBPARAM_ID_LAST_DEFINED = 23;
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
    private static java.lang.String getLanguageCodeForValue(int p0) { return null; }
    public java.lang.String toString() { return null; }
    private static void encodeMessageId(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static int countAsciiSeptets(java.lang.CharSequence p0, boolean p1) { return 0; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calcTextEncodingDetails(java.lang.CharSequence p0, boolean p1, boolean p2) { return null; }
    private static byte[] encode7bitAscii(java.lang.String p0, boolean p1) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static byte[] encodeUtf16(java.lang.String p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static com.android.internal.telephony.cdma.sms.BearerData.Gsm7bitCodingResult encode7bitGsm(java.lang.String p0, int p1, boolean p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static void encode7bitEms(com.android.internal.telephony.cdma.sms.UserData p0, byte[] p1, boolean p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encode16bitEms(com.android.internal.telephony.cdma.sms.UserData p0, byte[] p1) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encode7bitAsciiEms(com.android.internal.telephony.cdma.sms.UserData p0, byte[] p1, boolean p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encodeEmsUserDataPayload(com.android.internal.telephony.cdma.sms.UserData p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static byte[] encodeShiftJis(java.lang.String p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static void encodeUserDataPayload(com.android.internal.telephony.cdma.sms.UserData p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encodeUserData(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encodeReplyOption(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static byte[] encodeDtmfSmsAddress(java.lang.String p0) { return null; }
    private static void encodeCdmaSmsAddress(com.android.internal.telephony.cdma.sms.CdmaSmsAddress p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encodeCallbackNumber(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void encodeMsgStatus(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodeMsgCount(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodeValidityPeriodRel(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodePrivacyIndicator(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodeLanguageIndicator(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodeDisplayMode(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodePriorityIndicator(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodeMsgDeliveryAlert(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    private static void encodeScpResults(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseOutputStream p1) throws com.android.internal.util.BitwiseOutputStream.AccessException {}
    public static byte[] encode(com.android.internal.telephony.cdma.sms.BearerData p0) { return null; }
    private static boolean decodeMessageId(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeReserved(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1, int p2) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException { return false; }
    private static boolean decodeUserData(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static java.lang.String decodeUtf8(byte[] p0, int p1, int p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decodeUtf16(byte[] p0, int p1, int p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decodeCharset(byte[] p0, int p1, int p2, int p3, java.lang.String p4) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decode7bitAscii(byte[] p0, int p1, int p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decode7bitGsm(byte[] p0, int p1, int p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decodeLatin(byte[] p0, int p1, int p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decodeShiftJis(byte[] p0, int p1, int p2) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static java.lang.String decodeGsmDcs(byte[] p0, int p1, int p2, int p3) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static void decodeUserDataPayload(com.android.internal.telephony.cdma.sms.UserData p0, boolean p1) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void decodeIs91VoicemailStatus(com.android.internal.telephony.cdma.sms.BearerData p0) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void decodeIs91ShortMessage(com.android.internal.telephony.cdma.sms.BearerData p0) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void decodeIs91Cli(com.android.internal.telephony.cdma.sms.BearerData p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static void decodeIs91(com.android.internal.telephony.cdma.sms.BearerData p0) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static boolean decodeReplyOption(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeMsgCount(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeDepositIndex(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static java.lang.String decodeDtmfSmsAddress(byte[] p0, int p1) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return null; }
    private static void decodeSmsAddress(com.android.internal.telephony.cdma.sms.CdmaSmsAddress p0) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    private static boolean decodeCallbackNumber(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException { return false; }
    private static boolean decodeMsgStatus(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeMsgCenterTimeStamp(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeValidityAbs(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeDeferredDeliveryAbs(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeValidityRel(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeDeferredDeliveryRel(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodePrivacyIndicator(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeLanguageIndicator(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeDisplayMode(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodePriorityIndicator(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeMsgDeliveryAlert(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeUserResponseCode(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException { return false; }
    private static boolean decodeServiceCategoryProgramData(com.android.internal.telephony.cdma.sms.BearerData p0, com.android.internal.util.BitwiseInputStream p1) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException { return false; }
    private static int serviceCategoryToCmasMessageClass(int p0) { return 0; }
    private static int getBitsForNumFields(int p0, int p1) throws com.android.internal.telephony.cdma.sms.BearerData.CodingException { return 0; }
    private static void decodeCmasUserData(com.android.internal.telephony.cdma.sms.BearerData p0, int p1) throws com.android.internal.util.BitwiseInputStream.AccessException, com.android.internal.telephony.cdma.sms.BearerData.CodingException {}
    public static com.android.internal.telephony.cdma.sms.BearerData decode(byte[] p0) { return null; }
    private static boolean isCmasAlertCategory(int p0) { return false; }
    public static com.android.internal.telephony.cdma.sms.BearerData decode(byte[] p0, int p1) { return null; }

    public static class TimeStamp extends android.text.format.Time {
        public TimeStamp() { super(); }
        public static com.android.internal.telephony.cdma.sms.BearerData.TimeStamp fromByteArray(byte[] p0) { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class Gsm7bitCodingResult {
        int septets;
        byte[] data;
        private Gsm7bitCodingResult() {}
    }

    private static class CodingException extends java.lang.Exception {
        public CodingException(java.lang.String p0) { super(); }
    }
}

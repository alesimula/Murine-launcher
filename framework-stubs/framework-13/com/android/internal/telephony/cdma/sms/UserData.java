package com.android.internal.telephony.cdma.sms;

public class UserData {
    public static final int ENCODING_OCTET = 0;
    public static final int ENCODING_IS91_EXTENDED_PROTOCOL = 1;
    public static final int ENCODING_7BIT_ASCII = 2;
    public static final int ENCODING_IA5 = 3;
    public static final int ENCODING_UNICODE_16 = 4;
    public static final int ENCODING_SHIFT_JIS = 5;
    public static final int ENCODING_KOREAN = 6;
    public static final int ENCODING_LATIN_HEBREW = 7;
    public static final int ENCODING_LATIN = 8;
    public static final int ENCODING_GSM_7BIT_ALPHABET = 9;
    public static final int ENCODING_GSM_DCS = 10;
    public static final int ENCODING_GSM_DCS_7BIT = 0;
    public static final int ENCODING_GSM_DCS_8BIT = 1;
    public static final int ENCODING_GSM_DCS_16BIT = 2;
    public static final int IS91_MSG_TYPE_VOICEMAIL_STATUS = 130;
    public static final int IS91_MSG_TYPE_SHORT_MESSAGE_FULL = 131;
    public static final int IS91_MSG_TYPE_CLI = 132;
    public static final int IS91_MSG_TYPE_SHORT_MESSAGE = 133;
    public static final char[] ASCII_MAP = null;
    static final byte UNENCODABLE_7_BIT_CHAR = 32;
    public static final int PRINTABLE_ASCII_MIN_INDEX = 32;
    public static final int ASCII_NL_INDEX = 10;
    public static final int ASCII_CR_INDEX = 13;
    public static final android.util.SparseIntArray charToAscii = null;
    public static final int ASCII_MAP_BASE_INDEX = 32;
    public static final int ASCII_MAP_MAX_INDEX = Integer.valueOf(0);
    public com.android.internal.telephony.SmsHeader userDataHeader;
    public int msgEncoding;
    public boolean msgEncodingSet;
    public int msgType;
    public int paddingBits;
    public int numFields;
    public byte[] payload;
    public java.lang.String payloadStr;
    public UserData() {}
    public static byte[] stringToAscii(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
}

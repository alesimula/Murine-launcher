package com.android.internal.telephony.cdma.sms;

public class CdmaSmsAddress extends com.android.internal.telephony.SmsAddress {
    public static final int DIGIT_MODE_4BIT_DTMF = 0;
    public static final int DIGIT_MODE_8BIT_CHAR = 1;
    public int digitMode;
    public static final int NUMBER_MODE_NOT_DATA_NETWORK = 0;
    public static final int NUMBER_MODE_DATA_NETWORK = 1;
    public int numberMode;
    public static final int TON_UNKNOWN = 0;
    public static final int TON_INTERNATIONAL_OR_IP = 1;
    public static final int TON_NATIONAL_OR_EMAIL = 2;
    public static final int TON_NETWORK = 3;
    public static final int TON_SUBSCRIBER = 4;
    public static final int TON_ALPHANUMERIC = 5;
    public static final int TON_ABBREVIATED = 6;
    public static final int TON_RESERVED = 7;
    public static final int SMS_ADDRESS_MAX = 36;
    public static final int SMS_SUBADDRESS_MAX = 36;
    public int numberOfDigits;
    public static final int NUMBERING_PLAN_UNKNOWN = 0;
    public static final int NUMBERING_PLAN_ISDN_TELEPHONY = 1;
    public int numberPlan;
    public CdmaSmsAddress() { super(); }
    public java.lang.String toString() { return null; }
    public static byte[] parseToDtmf(java.lang.String p0) { return null; }
    public static com.android.internal.telephony.cdma.sms.CdmaSmsAddress parse(java.lang.String p0) { return null; }
}

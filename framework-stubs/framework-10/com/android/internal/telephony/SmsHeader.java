package com.android.internal.telephony;

public class SmsHeader {
    public static final int ELT_ID_CONCATENATED_8_BIT_REFERENCE = 0;
    public static final int ELT_ID_SPECIAL_SMS_MESSAGE_INDICATION = 1;
    public static final int ELT_ID_APPLICATION_PORT_ADDRESSING_8_BIT = 4;
    public static final int ELT_ID_APPLICATION_PORT_ADDRESSING_16_BIT = 5;
    public static final int ELT_ID_SMSC_CONTROL_PARAMS = 6;
    public static final int ELT_ID_UDH_SOURCE_INDICATION = 7;
    public static final int ELT_ID_CONCATENATED_16_BIT_REFERENCE = 8;
    public static final int ELT_ID_WIRELESS_CTRL_MSG_PROTOCOL = 9;
    public static final int ELT_ID_TEXT_FORMATTING = 10;
    public static final int ELT_ID_PREDEFINED_SOUND = 11;
    public static final int ELT_ID_USER_DEFINED_SOUND = 12;
    public static final int ELT_ID_PREDEFINED_ANIMATION = 13;
    public static final int ELT_ID_LARGE_ANIMATION = 14;
    public static final int ELT_ID_SMALL_ANIMATION = 15;
    public static final int ELT_ID_LARGE_PICTURE = 16;
    public static final int ELT_ID_SMALL_PICTURE = 17;
    public static final int ELT_ID_VARIABLE_PICTURE = 18;
    public static final int ELT_ID_USER_PROMPT_INDICATOR = 19;
    public static final int ELT_ID_EXTENDED_OBJECT = 20;
    public static final int ELT_ID_REUSED_EXTENDED_OBJECT = 21;
    public static final int ELT_ID_COMPRESSION_CONTROL = 22;
    public static final int ELT_ID_OBJECT_DISTR_INDICATOR = 23;
    public static final int ELT_ID_STANDARD_WVG_OBJECT = 24;
    public static final int ELT_ID_CHARACTER_SIZE_WVG_OBJECT = 25;
    public static final int ELT_ID_EXTENDED_OBJECT_DATA_REQUEST_CMD = 26;
    public static final int ELT_ID_RFC_822_EMAIL_HEADER = 32;
    public static final int ELT_ID_HYPERLINK_FORMAT_ELEMENT = 33;
    public static final int ELT_ID_REPLY_ADDRESS_ELEMENT = 34;
    public static final int ELT_ID_ENHANCED_VOICE_MAIL_INFORMATION = 35;
    public static final int ELT_ID_NATIONAL_LANGUAGE_SINGLE_SHIFT = 36;
    public static final int ELT_ID_NATIONAL_LANGUAGE_LOCKING_SHIFT = 37;
    public static final int PORT_WAP_PUSH = 2948;
    public static final int PORT_WAP_WSP = 9200;
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.telephony.SmsHeader.PortAddrs portAddrs;
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.telephony.SmsHeader.ConcatRef concatRef;
    public java.util.ArrayList<com.android.internal.telephony.SmsHeader.SpecialSmsMsg> specialSmsMsgList;
    public java.util.ArrayList<com.android.internal.telephony.SmsHeader.MiscElt> miscEltList;
    @android.annotation.UnsupportedAppUsage
    public int languageTable;
    @android.annotation.UnsupportedAppUsage
    public int languageShiftTable;
    @android.annotation.UnsupportedAppUsage
    public SmsHeader() {}
    @android.annotation.UnsupportedAppUsage
    public static com.android.internal.telephony.SmsHeader fromByteArray(byte[] p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static byte[] toByteArray(com.android.internal.telephony.SmsHeader p0) { return null; }
    public java.lang.String toString() { return null; }

    public static class SpecialSmsMsg {
        public int msgIndType;
        public int msgCount;
        public SpecialSmsMsg() {}
    }

    public static class PortAddrs {
        @android.annotation.UnsupportedAppUsage
        public int destPort;
        @android.annotation.UnsupportedAppUsage
        public int origPort;
        public boolean areEightBits;
        public PortAddrs() {}
    }

    public static class MiscElt {
        public int id;
        public byte[] data;
        public MiscElt() {}
    }

    public static class ConcatRef {
        @android.annotation.UnsupportedAppUsage
        public int refNumber;
        @android.annotation.UnsupportedAppUsage
        public int seqNumber;
        @android.annotation.UnsupportedAppUsage
        public int msgCount;
        public boolean isEightBits;
        public ConcatRef() {}
    }
}

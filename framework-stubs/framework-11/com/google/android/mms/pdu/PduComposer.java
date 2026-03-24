package com.google.android.mms.pdu;

public class PduComposer {
    private static final int PDU_PHONE_NUMBER_ADDRESS_TYPE = 1;
    private static final int PDU_EMAIL_ADDRESS_TYPE = 2;
    private static final int PDU_IPV4_ADDRESS_TYPE = 3;
    private static final int PDU_IPV6_ADDRESS_TYPE = 4;
    private static final int PDU_UNKNOWN_ADDRESS_TYPE = 5;
    static final java.lang.String REGEXP_PHONE_NUMBER_ADDRESS_TYPE = "\\+?[0-9|\\.|\\-]+";
    static final java.lang.String REGEXP_EMAIL_ADDRESS_TYPE = "[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}";
    static final java.lang.String REGEXP_IPV6_ADDRESS_TYPE = "[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}";
    static final java.lang.String REGEXP_IPV4_ADDRESS_TYPE = "[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}";
    static final java.lang.String STRING_PHONE_NUMBER_ADDRESS_TYPE = "/TYPE=PLMN";
    static final java.lang.String STRING_IPV4_ADDRESS_TYPE = "/TYPE=IPV4";
    static final java.lang.String STRING_IPV6_ADDRESS_TYPE = "/TYPE=IPV6";
    private static final int PDU_COMPOSE_SUCCESS = 0;
    private static final int PDU_COMPOSE_CONTENT_ERROR = 1;
    private static final int PDU_COMPOSE_FIELD_NOT_SET = 2;
    private static final int PDU_COMPOSE_FIELD_NOT_SUPPORTED = 3;
    private static final int QUOTED_STRING_FLAG = 34;
    private static final int END_STRING_FLAG = 0;
    private static final int LENGTH_QUOTE = 31;
    private static final int TEXT_MAX = 127;
    private static final int SHORT_INTEGER_MAX = 127;
    private static final int LONG_INTEGER_LENGTH_MAX = 8;
    private static final int PDU_COMPOSER_BLOCK_SIZE = 1024;
    protected java.io.ByteArrayOutputStream mMessage;
    private com.google.android.mms.pdu.GenericPdu mPdu;
    protected int mPosition;
    private com.google.android.mms.pdu.PduComposer.BufferStack mStack;
    private final android.content.ContentResolver mResolver = null;
    private com.google.android.mms.pdu.PduHeaders mPduHeader;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> mContentTypeMap;
    public PduComposer(android.content.Context p0, com.google.android.mms.pdu.GenericPdu p1) {}
    public byte[] make() { return null; }
    protected void arraycopy(byte[] p0, int p1, int p2) {}
    protected void append(int p0) {}
    protected void appendShortInteger(int p0) {}
    protected void appendOctet(int p0) {}
    protected void appendShortLength(int p0) {}
    protected void appendLongInteger(long p0) {}
    protected void appendTextString(byte[] p0) {}
    protected void appendTextString(java.lang.String p0) {}
    protected void appendEncodedString(com.google.android.mms.pdu.EncodedStringValue p0) {}
    protected void appendUintvarInteger(long p0) {}
    protected void appendDateValue(long p0) {}
    protected void appendValueLength(long p0) {}
    protected void appendQuotedString(byte[] p0) {}
    protected void appendQuotedString(java.lang.String p0) {}
    private com.google.android.mms.pdu.EncodedStringValue appendAddressType(com.google.android.mms.pdu.EncodedStringValue p0) { return null; }
    private int appendHeader(int p0) { return 0; }
    private int makeReadRecInd() { return 0; }
    private int makeNotifyResp() { return 0; }
    private int makeAckInd() { return 0; }
    private int makeSendRetrievePdu(int p0) { return 0; }
    private int makeMessageBody(int p0) { return 0; }
    protected static int checkAddressType(java.lang.String p0) { return 0; }

    private class BufferStack {
        private com.google.android.mms.pdu.PduComposer.LengthRecordNode stack;
        private com.google.android.mms.pdu.PduComposer.LengthRecordNode toCopy;
        int stackSize;
        private BufferStack(com.google.android.mms.pdu.PduComposer p0) {}
        void newbuf() {}
        void pop() {}
        void copy() {}
        com.google.android.mms.pdu.PduComposer.PositionMarker mark() { return null; }
    }

    private static class LengthRecordNode {
        java.io.ByteArrayOutputStream currentMessage;
        public int currentPosition;
        public com.google.android.mms.pdu.PduComposer.LengthRecordNode next;
        private LengthRecordNode() {}
    }

    private class PositionMarker {
        private int c_pos;
        private int currentStackSize;
        private PositionMarker(com.google.android.mms.pdu.PduComposer p0) {}
        int getLength() { return 0; }
    }
}

package com.google.android.mms.pdu;

public class PduComposer {
    static final java.lang.String REGEXP_PHONE_NUMBER_ADDRESS_TYPE = "\\+?[0-9|\\.|\\-]+";
    static final java.lang.String REGEXP_EMAIL_ADDRESS_TYPE = "[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}";
    static final java.lang.String REGEXP_IPV6_ADDRESS_TYPE = "[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}";
    static final java.lang.String REGEXP_IPV4_ADDRESS_TYPE = "[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}";
    static final java.lang.String STRING_PHONE_NUMBER_ADDRESS_TYPE = "/TYPE=PLMN";
    static final java.lang.String STRING_IPV4_ADDRESS_TYPE = "/TYPE=IPV4";
    static final java.lang.String STRING_IPV6_ADDRESS_TYPE = "/TYPE=IPV6";
    protected java.io.ByteArrayOutputStream mMessage;
    protected int mPosition;
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
    protected static int checkAddressType(java.lang.String p0) { return 0; }

    private class BufferStack {
        int stackSize;
        void newbuf() {}
        void pop() {}
        void copy() {}
        com.google.android.mms.pdu.PduComposer.PositionMarker mark() { return null; }
    }

    private static class LengthRecordNode {
        java.io.ByteArrayOutputStream currentMessage;
        public int currentPosition;
        public com.google.android.mms.pdu.PduComposer.LengthRecordNode next;
    }

    private class PositionMarker {
        int getLength() { return 0; }
    }
}

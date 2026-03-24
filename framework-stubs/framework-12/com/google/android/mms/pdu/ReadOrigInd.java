package com.google.android.mms.pdu;

public class ReadOrigInd extends com.google.android.mms.pdu.GenericPdu {
    public ReadOrigInd() throws com.google.android.mms.InvalidHeaderValueException { super(); }
    ReadOrigInd(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public long getDate() { return 0L; }
    public void setDate(long p0) {}
    public com.google.android.mms.pdu.EncodedStringValue getFrom() { return null; }
    public void setFrom(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public byte[] getMessageId() { return null; }
    public void setMessageId(byte[] p0) {}
    public int getReadStatus() { return 0; }
    public void setReadStatus(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public com.google.android.mms.pdu.EncodedStringValue[] getTo() { return null; }
    public void setTo(com.google.android.mms.pdu.EncodedStringValue[] p0) {}
}

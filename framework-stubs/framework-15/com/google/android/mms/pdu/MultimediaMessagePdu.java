package com.google.android.mms.pdu;

public class MultimediaMessagePdu extends com.google.android.mms.pdu.GenericPdu {
    public MultimediaMessagePdu() { super(); }
    public MultimediaMessagePdu(com.google.android.mms.pdu.PduHeaders p0, com.google.android.mms.pdu.PduBody p1) { super(); }
    MultimediaMessagePdu(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public com.google.android.mms.pdu.PduBody getBody() { return null; }
    public void setBody(com.google.android.mms.pdu.PduBody p0) {}
    public com.google.android.mms.pdu.EncodedStringValue getSubject() { return null; }
    public void setSubject(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public com.google.android.mms.pdu.EncodedStringValue[] getTo() { return null; }
    public void addTo(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public int getPriority() { return 0; }
    public void setPriority(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public long getDate() { return 0L; }
    public void setDate(long p0) {}
}

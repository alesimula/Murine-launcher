package com.google.android.mms.pdu;

public class SendReq extends com.google.android.mms.pdu.MultimediaMessagePdu {
    public SendReq() { super(); }
    public SendReq(byte[] p0, com.google.android.mms.pdu.EncodedStringValue p1, int p2, byte[] p3) throws com.google.android.mms.InvalidHeaderValueException { super(); }
    SendReq(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    SendReq(com.google.android.mms.pdu.PduHeaders p0, com.google.android.mms.pdu.PduBody p1) { super(); }
    public com.google.android.mms.pdu.EncodedStringValue[] getBcc() { return null; }
    public void addBcc(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setBcc(com.google.android.mms.pdu.EncodedStringValue[] p0) {}
    public com.google.android.mms.pdu.EncodedStringValue[] getCc() { return null; }
    public void addCc(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setCc(com.google.android.mms.pdu.EncodedStringValue[] p0) {}
    public byte[] getContentType() { return null; }
    public void setContentType(byte[] p0) {}
    public int getDeliveryReport() { return 0; }
    public void setDeliveryReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public long getExpiry() { return 0L; }
    public void setExpiry(long p0) {}
    public long getMessageSize() { return 0L; }
    public void setMessageSize(long p0) {}
    public byte[] getMessageClass() { return null; }
    public void setMessageClass(byte[] p0) {}
    public int getReadReport() { return 0; }
    public void setReadReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setTo(com.google.android.mms.pdu.EncodedStringValue[] p0) {}
    public byte[] getTransactionId() { return null; }
    public void setTransactionId(byte[] p0) {}
}

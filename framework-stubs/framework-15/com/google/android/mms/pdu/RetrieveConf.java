package com.google.android.mms.pdu;

public class RetrieveConf extends com.google.android.mms.pdu.MultimediaMessagePdu {
    public RetrieveConf() throws com.google.android.mms.InvalidHeaderValueException { super(); }
    RetrieveConf(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    RetrieveConf(com.google.android.mms.pdu.PduHeaders p0, com.google.android.mms.pdu.PduBody p1) { super(); }
    public com.google.android.mms.pdu.EncodedStringValue[] getCc() { return null; }
    public void addCc(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public byte[] getContentType() { return null; }
    public void setContentType(byte[] p0) {}
    public int getDeliveryReport() { return 0; }
    public void setDeliveryReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public com.google.android.mms.pdu.EncodedStringValue getFrom() { return null; }
    public void setFrom(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public byte[] getMessageClass() { return null; }
    public void setMessageClass(byte[] p0) {}
    public byte[] getMessageId() { return null; }
    public void setMessageId(byte[] p0) {}
    public int getReadReport() { return 0; }
    public void setReadReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public int getRetrieveStatus() { return 0; }
    public void setRetrieveStatus(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public com.google.android.mms.pdu.EncodedStringValue getRetrieveText() { return null; }
    public void setRetrieveText(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public byte[] getTransactionId() { return null; }
    public void setTransactionId(byte[] p0) {}
}

package com.google.android.mms.pdu;

public class SendConf extends com.google.android.mms.pdu.GenericPdu {
    public SendConf() throws com.google.android.mms.InvalidHeaderValueException { super(); }
    SendConf(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public byte[] getMessageId() { return null; }
    public void setMessageId(byte[] p0) {}
    public int getResponseStatus() { return 0; }
    public void setResponseStatus(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public byte[] getTransactionId() { return null; }
    public void setTransactionId(byte[] p0) {}
}

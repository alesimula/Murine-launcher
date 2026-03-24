package com.google.android.mms.pdu;

public class AcknowledgeInd extends com.google.android.mms.pdu.GenericPdu {
    public AcknowledgeInd(int p0, byte[] p1) throws com.google.android.mms.InvalidHeaderValueException { super(); }
    AcknowledgeInd(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public int getReportAllowed() { return 0; }
    public void setReportAllowed(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public byte[] getTransactionId() { return null; }
    public void setTransactionId(byte[] p0) {}
}

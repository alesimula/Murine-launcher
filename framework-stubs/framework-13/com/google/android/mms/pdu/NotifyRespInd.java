package com.google.android.mms.pdu;

public class NotifyRespInd extends com.google.android.mms.pdu.GenericPdu {
    public NotifyRespInd(int p0, byte[] p1, int p2) throws com.google.android.mms.InvalidHeaderValueException { super(); }
    NotifyRespInd(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public int getReportAllowed() { return 0; }
    public void setReportAllowed(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setStatus(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public int getStatus() { return 0; }
    public byte[] getTransactionId() { return null; }
    public void setTransactionId(byte[] p0) {}
}

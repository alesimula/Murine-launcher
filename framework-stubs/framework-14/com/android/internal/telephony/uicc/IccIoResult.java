package com.android.internal.telephony.uicc;

public class IccIoResult {
    public int sw1;
    public int sw2;
    public byte[] payload;
    public IccIoResult(int p0, int p1, byte[] p2) {}
    public IccIoResult(int p0, int p1, java.lang.String p2) {}
    public java.lang.String toString() { return null; }
    public boolean success() { return false; }
    public com.android.internal.telephony.uicc.IccException getException() { return null; }
}

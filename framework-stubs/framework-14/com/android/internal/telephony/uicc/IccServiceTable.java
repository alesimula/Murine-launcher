package com.android.internal.telephony.uicc;

public abstract class IccServiceTable {
    protected final byte[] mServiceTable = null;
    protected IccServiceTable(byte[] p0) {}
    protected abstract java.lang.String getTag();
    protected abstract java.lang.Object[] getValues();
    protected boolean isAvailable(int p0) { return false; }
    public java.lang.String toString() { return null; }
}

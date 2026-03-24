package com.android.internal.telephony.gsm;

public class SimTlv {
    byte[] mRecord;
    int mTlvOffset;
    int mTlvLength;
    int mCurOffset;
    int mCurDataOffset;
    int mCurDataLength;
    boolean mHasValidTlvObject;
    public SimTlv(byte[] p0, int p1, int p2) {}
    public boolean nextObject() { return false; }
    public boolean isValidObject() { return false; }
    public int getTag() { return 0; }
    public byte[] getData() { return null; }
}

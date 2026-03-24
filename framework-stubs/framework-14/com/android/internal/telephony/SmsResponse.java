package com.android.internal.telephony;

public class SmsResponse {
    public static final int NO_ERROR_CODE = -1;
    int mMessageRef;
    java.lang.String mAckPdu;
    public int mErrorCode;
    public long mMessageId;
    public SmsResponse(int p0, java.lang.String p1, int p2) {}
    public SmsResponse(int p0, java.lang.String p1, int p2, long p3) {}
    public java.lang.String toString() { return null; }
}

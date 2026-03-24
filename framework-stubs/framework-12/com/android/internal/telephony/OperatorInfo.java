package com.android.internal.telephony;

public class OperatorInfo implements android.os.Parcelable {
    private java.lang.String mOperatorAlphaLong;
    private java.lang.String mOperatorAlphaShort;
    private java.lang.String mOperatorNumeric;
    private com.android.internal.telephony.OperatorInfo.State mState;
    private int mRan;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.OperatorInfo> CREATOR = null;
    public java.lang.String getOperatorAlphaLong() { return null; }
    public java.lang.String getOperatorAlphaShort() { return null; }
    public java.lang.String getOperatorNumeric() { return null; }
    public com.android.internal.telephony.OperatorInfo.State getState() { return null; }
    public int getRan() { return 0; }
    OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.OperatorInfo.State p3) {}
    OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.OperatorInfo.State p3, int p4) {}
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    private static com.android.internal.telephony.OperatorInfo.State rilStateToState(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum State {
        UNKNOWN,
        AVAILABLE,
        CURRENT,
        FORBIDDEN;
        private State() {}
    }
}

package com.android.internal.telephony;

public class OperatorInfo implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mOperatorAlphaLong;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mOperatorAlphaShort;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mOperatorNumeric;
    @android.annotation.UnsupportedAppUsage
    private com.android.internal.telephony.OperatorInfo.State mState;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.OperatorInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getOperatorAlphaLong() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getOperatorAlphaShort() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getOperatorNumeric() { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.telephony.OperatorInfo.State getState() { return null; }
    @android.annotation.UnsupportedAppUsage
    OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.OperatorInfo.State p3) {}
    @android.annotation.UnsupportedAppUsage
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
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

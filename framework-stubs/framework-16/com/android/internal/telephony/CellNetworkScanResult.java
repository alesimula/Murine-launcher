package com.android.internal.telephony;

public class CellNetworkScanResult implements android.os.Parcelable {
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_RADIO_NOT_AVAILABLE = 2;
    public static final int STATUS_RADIO_GENERIC_FAILURE = 3;
    public static final int STATUS_UNKNOWN_ERROR = 4;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.CellNetworkScanResult> CREATOR = null;
    public CellNetworkScanResult(int p0, java.util.List<com.android.internal.telephony.OperatorInfo> p1) {}
    public int getStatus() { return 0; }
    public java.util.List<com.android.internal.telephony.OperatorInfo> getOperators() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}

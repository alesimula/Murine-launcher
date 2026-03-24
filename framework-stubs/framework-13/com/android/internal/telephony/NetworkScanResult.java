package com.android.internal.telephony;

public final class NetworkScanResult implements android.os.Parcelable {
    public static final int SCAN_STATUS_PARTIAL = 1;
    public static final int SCAN_STATUS_COMPLETE = 2;
    public int scanStatus;
    public int scanError;
    public java.util.List<android.telephony.CellInfo> networkInfos;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.NetworkScanResult> CREATOR = null;
    public NetworkScanResult(int p0, int p1, java.util.List<android.telephony.CellInfo> p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
}

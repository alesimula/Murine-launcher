package android.telephony;

@java.lang.Deprecated
public class NeighboringCellInfo implements android.os.Parcelable {
    public static final int UNKNOWN_RSSI = 99;
    public static final int UNKNOWN_CID = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.NeighboringCellInfo> CREATOR = null;
    @java.lang.Deprecated
    public NeighboringCellInfo() {}
    @java.lang.Deprecated
    public NeighboringCellInfo(int p0, int p1) {}
    public NeighboringCellInfo(android.telephony.CellInfoGsm p0) {}
    public NeighboringCellInfo(android.telephony.CellInfoWcdma p0) {}
    public NeighboringCellInfo(int p0, java.lang.String p1, int p2) {}
    public NeighboringCellInfo(android.os.Parcel p0) {}
    public int getRssi() { return 0; }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getPsc() { return 0; }
    public int getNetworkType() { return 0; }
    @java.lang.Deprecated
    public void setCid(int p0) {}
    @java.lang.Deprecated
    public void setRssi(int p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

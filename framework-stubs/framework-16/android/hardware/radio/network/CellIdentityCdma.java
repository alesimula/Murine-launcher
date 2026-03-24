package android.hardware.radio.network;

public class CellIdentityCdma implements android.os.Parcelable {
    @java.lang.Deprecated
    public int networkId;
    @java.lang.Deprecated
    public int systemId;
    @java.lang.Deprecated
    public int baseStationId;
    @java.lang.Deprecated
    public int longitude;
    @java.lang.Deprecated
    public int latitude;
    @java.lang.Deprecated
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityCdma> CREATOR = null;
    public CellIdentityCdma() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}

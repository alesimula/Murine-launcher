package android.hardware.radio.network;

public class CellIdentityCdma implements android.os.Parcelable {
    public int networkId;
    public int systemId;
    public int baseStationId;
    public int longitude;
    public int latitude;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityCdma> CREATOR = null;
    public CellIdentityCdma() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}

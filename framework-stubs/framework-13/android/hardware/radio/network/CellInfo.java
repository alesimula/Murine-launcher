package android.hardware.radio.network;

public class CellInfo implements android.os.Parcelable {
    public boolean registered;
    public int connectionStatus;
    public android.hardware.radio.network.CellInfoRatSpecificInfo ratSpecificInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellInfo> CREATOR = null;
    public CellInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}

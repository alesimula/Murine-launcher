package android.telephony.satellite.stub;

public class SatelliteInfo implements android.os.Parcelable {
    public android.telephony.satellite.stub.UUID id;
    public android.telephony.satellite.stub.SatellitePosition position;
    public int[] bands;
    public android.telephony.satellite.stub.EarfcnRange[] earfcnRanges;
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SatelliteInfo> CREATOR = null;
    public SatelliteInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

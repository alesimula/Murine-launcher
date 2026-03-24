package android.telephony.satellite.stub;

public class SatelliteCapabilities implements android.os.Parcelable {
    public int[] supportedRadioTechnologies;
    public boolean isPointingRequired;
    public int maxBytesPerOutgoingDatagram;
    public int[] antennaPositionKeys;
    public android.telephony.satellite.AntennaPosition[] antennaPositionValues;
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SatelliteCapabilities> CREATOR = null;
    public SatelliteCapabilities() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public final class SatelliteInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteInfo> CREATOR = null;
    protected SatelliteInfo(android.os.Parcel p0) {}
    public SatelliteInfo(java.util.UUID p0, android.telephony.satellite.SatellitePosition p1, java.util.List<java.lang.Integer> p2, java.util.List<android.telephony.satellite.EarfcnRange> p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.util.UUID getSatelliteId() { return null; }
    public android.telephony.satellite.SatellitePosition getSatellitePosition() { return null; }
    public java.util.List<java.lang.Integer> getBands() { return null; }
    public java.util.List<android.telephony.satellite.EarfcnRange> getEarfcnRanges() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

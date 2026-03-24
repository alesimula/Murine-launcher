package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public final class SatelliteAccessConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteAccessConfiguration> CREATOR = null;
    public SatelliteAccessConfiguration(java.util.List<android.telephony.satellite.SatelliteInfo> p0, java.util.List<java.lang.Integer> p1) {}
    public SatelliteAccessConfiguration(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.util.List<android.telephony.satellite.SatelliteInfo> getSatelliteInfos() { return null; }
    public java.util.List<java.lang.Integer> getTagIds() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteCapabilities> CREATOR = null;
    public SatelliteCapabilities(java.util.Set<java.lang.Integer> p0, boolean p1, int p2, java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSupportedRadioTechnologies() { return null; }
    public boolean isPointingRequired() { return false; }
    public int getMaxBytesPerOutgoingDatagram() { return 0; }
    public void setMaxBytesPerOutgoingDatagram(int p0) {}
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> getAntennaPositionMap() { return null; }
}

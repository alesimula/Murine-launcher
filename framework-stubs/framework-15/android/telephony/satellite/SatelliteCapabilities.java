package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public final class SatelliteCapabilities implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteCapabilities> CREATOR = null;
    public SatelliteCapabilities(java.util.Set<java.lang.Integer> p0, boolean p1, int p2, java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> p3) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSupportedRadioTechnologies() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public boolean isPointingRequired() { return false; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int getMaxBytesPerOutgoingDatagram() { return 0; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> getAntennaPositionMap() { return null; }
}

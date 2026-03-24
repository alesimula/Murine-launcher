package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public final class PointingInfo implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.PointingInfo> CREATOR = null;
    public PointingInfo(float p0, float p1) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public float getSatelliteAzimuthDegrees() { return 0.0f; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public float getSatelliteElevationDegrees() { return 0.0f; }
}

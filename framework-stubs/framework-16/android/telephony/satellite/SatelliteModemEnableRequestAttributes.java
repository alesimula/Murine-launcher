package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public final class SatelliteModemEnableRequestAttributes implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteModemEnableRequestAttributes> CREATOR = null;
    public SatelliteModemEnableRequestAttributes(boolean p0, boolean p1, boolean p2, android.telephony.satellite.SatelliteSubscriptionInfo p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isForDemoMode() { return false; }
    public boolean isForEmergencyMode() { return false; }
    @android.annotation.NonNull
    public android.telephony.satellite.SatelliteSubscriptionInfo getSatelliteSubscriptionInfo() { return null; }
}

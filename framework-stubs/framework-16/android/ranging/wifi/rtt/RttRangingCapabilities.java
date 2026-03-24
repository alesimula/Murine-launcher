package android.ranging.wifi.rtt;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
public final class RttRangingCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.wifi.rtt.RttRangingCapabilities> CREATOR = null;
    RttRangingCapabilities() {}
    public int describeContents() { return 0; }
    public boolean hasPeriodicRangingHardwareFeature() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

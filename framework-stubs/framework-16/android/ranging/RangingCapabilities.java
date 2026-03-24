package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.RangingCapabilities> CREATOR = null;
    public static final int DISABLED_REGULATORY = 2;
    public static final int DISABLED_USER = 1;
    public static final int DISABLED_USER_RESTRICTIONS = 4;
    public static final int ENABLED = 3;
    public static final int NOT_SUPPORTED = 0;
    RangingCapabilities() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.ranging.ble.cs.BleCsRangingCapabilities getCsCapabilities() { return null; }
    @android.annotation.Nullable
    public android.ranging.wifi.rtt.RttRangingCapabilities getRttRangingCapabilities() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, java.lang.Integer> getTechnologyAvailability() { return null; }
    @android.annotation.Nullable
    public android.ranging.uwb.UwbRangingCapabilities getUwbCapabilities() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

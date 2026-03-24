package android.ranging.ble.cs;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_cs_enabled")
public final class BleCsRangingCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.ble.cs.BleCsRangingCapabilities> CREATOR = null;
    public static final int CS_SECURITY_LEVEL_FOUR = 4;
    public static final int CS_SECURITY_LEVEL_ONE = 1;
    BleCsRangingCapabilities() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSupportedSecurityLevels() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

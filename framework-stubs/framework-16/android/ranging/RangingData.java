package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.RangingData> CREATOR = null;
    RangingData() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.ranging.RangingMeasurement getAzimuth() { return null; }
    @android.annotation.Nullable
    public android.ranging.RangingMeasurement getDistance() { return null; }
    @android.annotation.Nullable
    public android.ranging.RangingMeasurement getElevation() { return null; }
    public int getRangingTechnology() { return 0; }
    public int getRssi() { return 0; }
    public long getTimestampMillis() { return 0L; }
    public boolean hasRssi() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

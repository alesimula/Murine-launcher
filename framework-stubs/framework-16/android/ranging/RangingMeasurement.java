package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingMeasurement implements android.os.Parcelable {
    public static final int CONFIDENCE_HIGH = 2;
    public static final int CONFIDENCE_LOW = 0;
    public static final int CONFIDENCE_MEDIUM = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.RangingMeasurement> CREATOR = null;
    RangingMeasurement() {}
    public int describeContents() { return 0; }
    public int getConfidence() { return 0; }
    public double getMeasurement() { return 0.0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

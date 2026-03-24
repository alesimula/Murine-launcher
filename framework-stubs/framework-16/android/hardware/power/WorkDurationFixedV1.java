package android.hardware.power;

public class WorkDurationFixedV1 implements android.os.Parcelable {
    public long durationNanos;
    public long workPeriodStartTimestampNanos;
    public long cpuDurationNanos;
    public long gpuDurationNanos;
    public static final android.os.Parcelable.Creator<android.hardware.power.WorkDurationFixedV1> CREATOR = null;
    public WorkDurationFixedV1() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

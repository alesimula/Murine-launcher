package android.hardware.power;

public class WorkDuration implements android.os.Parcelable {
    public long timeStampNanos;
    public long durationNanos;
    public long workPeriodStartTimestampNanos;
    public long cpuDurationNanos;
    public long gpuDurationNanos;
    public long intendedPresentTimestampNanos;
    public static final android.os.Parcelable.Creator<android.hardware.power.WorkDuration> CREATOR = null;
    public WorkDuration() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

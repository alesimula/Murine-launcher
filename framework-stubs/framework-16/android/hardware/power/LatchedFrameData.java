package android.hardware.power;

public class LatchedFrameData implements android.os.Parcelable {
    public long frameStartTimestampNanos;
    public long intendedPresentTimestampNanos;
    public long bufferSubmissionTimestampNanos;
    public long gpuSignalTimestampNanos;
    public boolean usedGpu;
    public android.os.ParcelFileDescriptor gpuAcquireFence;
    public static final android.os.Parcelable.Creator<android.hardware.power.LatchedFrameData> CREATOR = null;
    public LatchedFrameData() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

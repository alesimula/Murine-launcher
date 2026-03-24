package android.hardware.power;

public class FrameProducer implements android.os.Parcelable {
    public long producerId;
    public int uid;
    public double fps;
    public android.hardware.power.LatchedFrameData currentlyLatchedFrame;
    public boolean cpuDeadlineMissed;
    public boolean gpuDeadlineMissed;
    public static final android.os.Parcelable.Creator<android.hardware.power.FrameProducer> CREATOR = null;
    public FrameProducer() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

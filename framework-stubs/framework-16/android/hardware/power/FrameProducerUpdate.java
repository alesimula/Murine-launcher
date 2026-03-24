package android.hardware.power;

public class FrameProducerUpdate implements android.os.Parcelable {
    public long producerId;
    public boolean isDead;
    public int[] sessions;
    public static final android.os.Parcelable.Creator<android.hardware.power.FrameProducerUpdate> CREATOR = null;
    public FrameProducerUpdate() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

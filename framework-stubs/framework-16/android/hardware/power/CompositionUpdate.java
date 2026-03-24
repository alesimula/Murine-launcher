package android.hardware.power;

public class CompositionUpdate implements android.os.Parcelable {
    public long timestampNanos;
    public android.hardware.power.FrameProducerUpdate[] producerUpdates;
    public long[] deadOutputIds;
    public static final android.os.Parcelable.Creator<android.hardware.power.CompositionUpdate> CREATOR = null;
    public CompositionUpdate() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

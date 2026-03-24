package android.hardware.power;

public class CompositionData implements android.os.Parcelable {
    public long timestampNanos;
    public long[] scheduledPresentTimestampsNanos;
    public long latchTimestampNanos;
    public android.hardware.power.FrameProducer[] producers;
    public android.hardware.power.CompositionUpdate updateData;
    public long[] outputIds;
    public static final android.os.Parcelable.Creator<android.hardware.power.CompositionData> CREATOR = null;
    public CompositionData() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

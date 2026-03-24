package android.hardware.radio.network;

public class LceDataInfo implements android.os.Parcelable {
    public int lastHopCapacityKbps;
    public byte confidenceLevel;
    public boolean lceSuspended;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.LceDataInfo> CREATOR = null;
    public LceDataInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}

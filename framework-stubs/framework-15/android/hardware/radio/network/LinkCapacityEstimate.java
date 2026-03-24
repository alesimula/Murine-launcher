package android.hardware.radio.network;

public class LinkCapacityEstimate implements android.os.Parcelable {
    public int downlinkCapacityKbps;
    public int uplinkCapacityKbps;
    public int secondaryDownlinkCapacityKbps;
    public int secondaryUplinkCapacityKbps;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.LinkCapacityEstimate> CREATOR = null;
    public LinkCapacityEstimate() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}

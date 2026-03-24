package android.hardware.contexthub;

public class EndpointId implements android.os.Parcelable {
    public long id;
    public long hubId;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.EndpointId> CREATOR = null;
    public static final long ENDPOINT_ID_INVALID = 0L;
    public static final long ENDPOINT_ID_RESERVED = -1L;
    public EndpointId() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

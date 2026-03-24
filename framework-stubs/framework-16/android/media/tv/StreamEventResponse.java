package android.media.tv;

public final class StreamEventResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.StreamEventResponse> CREATOR = null;
    static android.media.tv.StreamEventResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public StreamEventResponse(int p0, int p1, int p2, int p3, long p4, byte[] p5) { super(0, (android.os.Parcel)null); }
    public int getEventId() { return 0; }
    public long getNptMillis() { return 0L; }
    @android.annotation.Nullable
    public byte[] getData() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

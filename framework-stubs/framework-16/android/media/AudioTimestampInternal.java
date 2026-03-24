package android.media;

public class AudioTimestampInternal implements android.os.Parcelable {
    public long position;
    public long sec;
    public int nsec;
    public static final android.os.Parcelable.Creator<android.media.AudioTimestampInternal> CREATOR = null;
    public AudioTimestampInternal() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

package android.media;

public class MediaResourceParcel implements android.os.Parcelable {
    public int type;
    public int subType;
    public byte[] id;
    public long value;
    public static final android.os.Parcelable.Creator<android.media.MediaResourceParcel> CREATOR = null;
    public MediaResourceParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

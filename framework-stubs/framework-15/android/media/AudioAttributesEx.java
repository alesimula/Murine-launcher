package android.media;

public class AudioAttributesEx implements android.os.Parcelable {
    public android.media.audio.common.AudioAttributes attributes;
    public int streamType;
    public int groupId;
    public static final android.os.Parcelable.Creator<android.media.AudioAttributesEx> CREATOR = null;
    public AudioAttributesEx() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

package android.media;

public class AudioVolumeGroup implements android.os.Parcelable {
    public int groupId;
    public java.lang.String name;
    public android.media.audio.common.AudioAttributes[] audioAttributes;
    public int[] streams;
    public static final android.os.Parcelable.Creator<android.media.AudioVolumeGroup> CREATOR = null;
    public AudioVolumeGroup() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

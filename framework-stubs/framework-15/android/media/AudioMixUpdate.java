package android.media;

public class AudioMixUpdate implements android.os.Parcelable {
    public android.media.AudioMix audioMix;
    public android.media.AudioMixMatchCriterion[] newCriteria;
    public static final android.os.Parcelable.Creator<android.media.AudioMixUpdate> CREATOR = null;
    public AudioMixUpdate() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

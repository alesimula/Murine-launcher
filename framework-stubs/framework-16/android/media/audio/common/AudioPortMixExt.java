package android.media.audio.common;

public class AudioPortMixExt implements android.os.Parcelable {
    public int handle;
    public android.media.audio.common.AudioPortMixExtUseCase usecase;
    public int maxOpenStreamCount;
    public int maxActiveStreamCount;
    public int recommendedMuteDurationMs;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPortMixExt> CREATOR = null;
    public AudioPortMixExt() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}

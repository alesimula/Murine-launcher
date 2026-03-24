package android.media;

public class AudioPolicyConfig implements android.os.Parcelable {
    public android.media.AudioHwModule[] modules;
    public int[] supportedModes;
    public android.media.SurroundSoundConfig surroundSoundConfig;
    public android.media.audio.common.AudioHalEngineConfig engineConfig;
    public static final android.os.Parcelable.Creator<android.media.AudioPolicyConfig> CREATOR = null;
    public AudioPolicyConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

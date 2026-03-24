package android.media;

public class SurroundSoundConfig implements android.os.Parcelable {
    public android.media.SurroundSoundConfig.SurroundFormatFamily[] formatFamilies;
    public static final android.os.Parcelable.Creator<android.media.SurroundSoundConfig> CREATOR = null;
    public SurroundSoundConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class SurroundFormatFamily implements android.os.Parcelable {
        public android.media.audio.common.AudioFormatDescription primaryFormat;
        public android.media.audio.common.AudioFormatDescription[] subFormats;
        public static final android.os.Parcelable.Creator<android.media.SurroundSoundConfig.SurroundFormatFamily> CREATOR = null;
        public SurroundFormatFamily() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}

package android.media;

public class AudioProfile implements android.os.Parcelable {
    public static final int AUDIO_ENCAPSULATION_TYPE_NONE = 0;
    public static final int AUDIO_ENCAPSULATION_TYPE_IEC61937 = 1;
    public static final int AUDIO_ENCAPSULATION_TYPE_PCM = 2;
    public static final android.os.Parcelable.Creator<android.media.AudioProfile> CREATOR = null;
    @android.annotation.SystemApi
    public AudioProfile(int p0, int[] p1, int[] p2, int[] p3, int p4) {}
    public int getFormat() { return 0; }
    public int[] getChannelMasks() { return null; }
    public int[] getChannelIndexMasks() { return null; }
    public int[] getSampleRates() { return null; }
    public int getEncapsulationType() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncapsulationType {
    }
}

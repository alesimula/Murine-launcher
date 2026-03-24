package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class AmbientBacklightSettings implements android.os.Parcelable {
    public static final int SOURCE_NONE = 0;
    public static final int SOURCE_AUDIO = 1;
    public static final int SOURCE_VIDEO = 2;
    public static final int SOURCE_AUDIO_VIDEO = 3;
    public static final android.os.Parcelable.Creator<android.media.quality.AmbientBacklightSettings> CREATOR = null;
    public AmbientBacklightSettings(int p0, int p1, int p2, int p3, int p4, boolean p5, int p6) {}
    public int getSource() { return 0; }
    public int getMaxFps() { return 0; }
    public int getColorFormat() { return 0; }
    public int getHorizontalZonesCount() { return 0; }
    public int getVerticalZonesCount() { return 0; }
    public boolean isLetterboxOmitted() { return false; }
    public int getThreshold() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }
}

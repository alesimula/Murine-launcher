package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class AmbientBacklightMetadata implements android.os.Parcelable {
    public static final int ALGORITHM_NONE = 0;
    public static final int ALGORITHM_RLE = 1;
    public static final android.os.Parcelable.Creator<android.media.quality.AmbientBacklightMetadata> CREATOR = null;
    public AmbientBacklightMetadata(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int[] p6) {}
    public java.lang.String getPackageName() { return null; }
    public int getCompressionAlgorithm() { return 0; }
    public int getSource() { return 0; }
    public int getColorFormat() { return 0; }
    public int getHorizontalZonesCount() { return 0; }
    public int getVerticalZonesCount() { return 0; }
    public int[] getZoneColors() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CompressionAlgorithm {
    }
}

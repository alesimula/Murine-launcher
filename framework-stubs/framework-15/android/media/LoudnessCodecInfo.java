package android.media;

public class LoudnessCodecInfo implements android.os.Parcelable {
    public int metadataType;
    public boolean isDownmixing;
    public static final android.os.Parcelable.Creator<android.media.LoudnessCodecInfo> CREATOR = null;
    public LoudnessCodecInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface CodecMetadataType {
        public static final int CODEC_METADATA_TYPE_INVALID = 0;
        public static final int CODEC_METADATA_TYPE_MPEG_4 = 1;
        public static final int CODEC_METADATA_TYPE_MPEG_D = 2;
        public static final int CODEC_METADATA_TYPE_AC_3 = 3;
        public static final int CODEC_METADATA_TYPE_AC_4 = 4;
        public static final int CODEC_METADATA_TYPE_DTS_HD = 5;
        public static final int CODEC_METADATA_TYPE_DTS_UHD = 6;
    }
}

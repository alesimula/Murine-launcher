package android.media.audio.common;

public class AudioHalVolumeCurve implements android.os.Parcelable {
    public byte deviceCategory;
    public android.media.audio.common.AudioHalVolumeCurve.CurvePoint[] curvePoints;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalVolumeCurve> CREATOR = null;
    public AudioHalVolumeCurve() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static class CurvePoint implements android.os.Parcelable {
        public byte index;
        public int attenuationMb;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalVolumeCurve.CurvePoint> CREATOR = null;
        public static final byte MIN_INDEX = 0;
        public static final byte MAX_INDEX = 100;
        public CurvePoint() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface DeviceCategory {
        public static final byte HEADSET = 0;
        public static final byte SPEAKER = 1;
        public static final byte EARPIECE = 2;
        public static final byte EXT_MEDIA = 3;
        public static final byte HEARING_AID = 4;
    }
}

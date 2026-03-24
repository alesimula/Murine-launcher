package android.media.audio.common;

public class Spatialization implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.Spatialization> CREATOR = null;
    public Spatialization() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface Level {
        public static final byte NONE = 0;
        public static final byte MULTICHANNEL = 1;
        public static final byte BED_PLUS_OBJECTS = 2;
    }

    public static @interface Mode {
        public static final byte BINAURAL = 0;
        public static final byte TRANSAURAL = 1;
    }
}

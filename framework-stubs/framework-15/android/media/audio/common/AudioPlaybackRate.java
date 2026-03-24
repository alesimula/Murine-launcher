package android.media.audio.common;

public class AudioPlaybackRate implements android.os.Parcelable {
    public float speed;
    public float pitch;
    public int timestretchMode;
    public int fallbackMode;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPlaybackRate> CREATOR = null;
    public AudioPlaybackRate() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface TimestretchFallbackMode {
        public static final int SYS_RESERVED_CUT_REPEAT = -1;
        public static final int SYS_RESERVED_DEFAULT = 0;
        public static final int MUTE = 1;
        public static final int FAIL = 2;
    }

    public static @interface TimestretchMode {
        public static final int DEFAULT = 0;
        public static final int VOICE = 1;
    }
}

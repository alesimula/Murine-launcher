package android.media.audio.common;

public final class AudioPortExt implements android.os.Parcelable {
    public static final int unspecified = 0;
    public static final int device = 1;
    public static final int mix = 2;
    public static final int session = 3;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPortExt> CREATOR = null;
    public AudioPortExt() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioPortExt unspecified(boolean p0) { return null; }
    public boolean getUnspecified() { return false; }
    public void setUnspecified(boolean p0) {}
    public static android.media.audio.common.AudioPortExt device(android.media.audio.common.AudioPortDeviceExt p0) { return null; }
    public android.media.audio.common.AudioPortDeviceExt getDevice() { return null; }
    public void setDevice(android.media.audio.common.AudioPortDeviceExt p0) {}
    public static android.media.audio.common.AudioPortExt mix(android.media.audio.common.AudioPortMixExt p0) { return null; }
    public android.media.audio.common.AudioPortMixExt getMix() { return null; }
    public void setMix(android.media.audio.common.AudioPortMixExt p0) {}
    public static android.media.audio.common.AudioPortExt session(int p0) { return null; }
    public int getSession() { return 0; }
    public void setSession(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static @interface Tag {
        public static final int unspecified = 0;
        public static final int device = 1;
        public static final int mix = 2;
        public static final int session = 3;
    }
}

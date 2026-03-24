package android.media.audio.common;

public final class AudioPortMixExtUseCase implements android.os.Parcelable {
    public static final int unspecified = 0;
    public static final int stream = 1;
    public static final int source = 2;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPortMixExtUseCase> CREATOR = null;
    public AudioPortMixExtUseCase() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioPortMixExtUseCase unspecified(boolean p0) { return null; }
    public boolean getUnspecified() { return false; }
    public void setUnspecified(boolean p0) {}
    public static android.media.audio.common.AudioPortMixExtUseCase stream(int p0) { return null; }
    public int getStream() { return 0; }
    public void setStream(int p0) {}
    public static android.media.audio.common.AudioPortMixExtUseCase source(int p0) { return null; }
    public int getSource() { return 0; }
    public void setSource(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static @interface Tag {
        public static final int unspecified = 0;
        public static final int stream = 1;
        public static final int source = 2;
    }
}

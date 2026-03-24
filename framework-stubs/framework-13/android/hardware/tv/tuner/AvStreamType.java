package android.hardware.tv.tuner;

public final class AvStreamType implements android.os.Parcelable {
    public static final int video = 0;
    public static final int audio = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.AvStreamType> CREATOR = null;
    public AvStreamType() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.AvStreamType video(int p0) { return null; }
    public int getVideo() { return 0; }
    public void setVideo(int p0) {}
    public static android.hardware.tv.tuner.AvStreamType audio(int p0) { return null; }
    public int getAudio() { return 0; }
    public void setAudio(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int video = 0;
        public static final int audio = 1;
    }
}

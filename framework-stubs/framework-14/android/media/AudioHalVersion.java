package android.media;

public class AudioHalVersion implements android.os.Parcelable {
    public int type;
    public int major;
    public int minor;
    public static final android.os.Parcelable.Creator<android.media.AudioHalVersion> CREATOR = null;
    public AudioHalVersion() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Type {
        public static final int HIDL = 0;
        public static final int AIDL = 1;
    }
}

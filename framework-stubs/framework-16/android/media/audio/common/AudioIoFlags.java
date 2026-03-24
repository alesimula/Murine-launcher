package android.media.audio.common;

public final class AudioIoFlags implements android.os.Parcelable {
    public static final int input = 0;
    public static final int output = 1;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioIoFlags> CREATOR = null;
    public AudioIoFlags() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioIoFlags input(int p0) { return null; }
    public int getInput() { return 0; }
    public void setInput(int p0) {}
    public static android.media.audio.common.AudioIoFlags output(int p0) { return null; }
    public int getOutput() { return 0; }
    public void setOutput(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static @interface Tag {
        public static final int input = 0;
        public static final int output = 1;
    }
}

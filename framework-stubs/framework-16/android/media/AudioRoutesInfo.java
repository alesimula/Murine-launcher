package android.media;

public class AudioRoutesInfo implements android.os.Parcelable {
    public static final int MAIN_SPEAKER = 0;
    public static final int MAIN_HEADSET = 1;
    public static final int MAIN_HEADPHONES = 2;
    public static final int MAIN_DOCK_SPEAKERS = 4;
    public static final int MAIN_HDMI = 8;
    public static final int MAIN_USB = 16;
    public java.lang.CharSequence bluetoothName;
    public int mainType;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioRoutesInfo> CREATOR = null;
    public AudioRoutesInfo() {}
    public AudioRoutesInfo(android.media.AudioRoutesInfo p0) {}
    AudioRoutesInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.media;

public class SoundTriggerSession implements android.os.Parcelable {
    public int session;
    public int ioHandle;
    public android.media.audio.common.AudioDeviceDescription device;
    public static final android.os.Parcelable.Creator<android.media.SoundTriggerSession> CREATOR = null;
    public SoundTriggerSession() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

package android.media;

public class AudioMix implements android.os.Parcelable {
    public android.media.AudioMixMatchCriterion[] criteria;
    public int mixType;
    public android.media.audio.common.AudioConfig format;
    public int routeFlags;
    public android.media.audio.common.AudioDevice device;
    public int cbFlags;
    public boolean allowPrivilegedMediaPlaybackCapture;
    public boolean voiceCommunicationCaptureAllowed;
    public android.os.IBinder mToken;
    public int mVirtualDeviceId;
    public static final android.os.Parcelable.Creator<android.media.AudioMix> CREATOR = null;
    public AudioMix() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

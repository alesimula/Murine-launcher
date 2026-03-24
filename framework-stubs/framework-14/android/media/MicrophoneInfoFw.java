package android.media;

public class MicrophoneInfoFw implements android.os.Parcelable {
    public android.media.audio.common.MicrophoneInfo info;
    public android.media.audio.common.MicrophoneDynamicInfo dynamic;
    public int portId;
    public static final android.os.Parcelable.Creator<android.media.MicrophoneInfoFw> CREATOR = null;
    public MicrophoneInfoFw() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

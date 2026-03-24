package android.hardware.tv.tuner;

public class AudioExtraMetaData implements android.os.Parcelable {
    public byte adFade;
    public byte adPan;
    public char versionTextTag;
    public byte adGainCenter;
    public byte adGainFront;
    public byte adGainSurround;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.AudioExtraMetaData> CREATOR = null;
    public AudioExtraMetaData() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

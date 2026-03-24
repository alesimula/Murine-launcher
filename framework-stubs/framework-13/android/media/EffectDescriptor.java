package android.media;

public class EffectDescriptor implements android.os.Parcelable {
    public android.media.audio.common.AudioUuid type;
    public android.media.audio.common.AudioUuid uuid;
    public int apiVersion;
    public int flags;
    public int cpuLoad;
    public int memoryUsage;
    public java.lang.String name;
    public java.lang.String implementor;
    public static final android.os.Parcelable.Creator<android.media.EffectDescriptor> CREATOR = null;
    public EffectDescriptor() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

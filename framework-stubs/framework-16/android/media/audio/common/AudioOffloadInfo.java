package android.media.audio.common;

public class AudioOffloadInfo implements android.os.Parcelable {
    public android.media.audio.common.AudioConfigBase base;
    public int streamType;
    public int bitRatePerSecond;
    public long durationUs;
    public boolean hasVideo;
    public boolean isStreaming;
    public int bitWidth;
    public int offloadBufferSize;
    public int usage;
    public byte encapsulationMode;
    public int contentId;
    public int syncId;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioOffloadInfo> CREATOR = null;
    public AudioOffloadInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}

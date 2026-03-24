package android.hardware.tv.tuner;

public final class DemuxFilterMediaEventExtraMetaData implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int audio = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData> CREATOR = null;
    public DemuxFilterMediaEventExtraMetaData() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData audio(android.hardware.tv.tuner.AudioExtraMetaData p0) { return null; }
    public android.hardware.tv.tuner.AudioExtraMetaData getAudio() { return null; }
    public void setAudio(android.hardware.tv.tuner.AudioExtraMetaData p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int audio = 1;
    }
}

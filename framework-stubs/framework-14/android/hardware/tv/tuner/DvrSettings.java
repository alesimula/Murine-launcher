package android.hardware.tv.tuner;

public final class DvrSettings implements android.os.Parcelable {
    public static final int record = 0;
    public static final int playback = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DvrSettings> CREATOR = null;
    public DvrSettings() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DvrSettings record(android.hardware.tv.tuner.RecordSettings p0) { return null; }
    public android.hardware.tv.tuner.RecordSettings getRecord() { return null; }
    public void setRecord(android.hardware.tv.tuner.RecordSettings p0) {}
    public static android.hardware.tv.tuner.DvrSettings playback(android.hardware.tv.tuner.PlaybackSettings p0) { return null; }
    public android.hardware.tv.tuner.PlaybackSettings getPlayback() { return null; }
    public void setPlayback(android.hardware.tv.tuner.PlaybackSettings p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int record = 0;
        public static final int playback = 1;
    }
}

package android.media.soundtrigger;

public class RecognitionEvent implements android.os.Parcelable {
    public int status;
    public int type;
    public boolean captureAvailable;
    public int captureDelayMs;
    public int capturePreambleMs;
    public boolean triggerInData;
    public android.media.audio.common.AudioConfig audioConfig;
    public byte[] data;
    public boolean recognitionStillActive;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.RecognitionEvent> CREATOR = null;
    public RecognitionEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}

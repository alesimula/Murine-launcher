package android.media.soundtrigger_middleware;

public class RecognitionEvent implements android.os.Parcelable {
    public int status;
    public int type;
    public boolean captureAvailable;
    public int captureSession;
    public int captureDelayMs;
    public int capturePreambleMs;
    public boolean triggerInData;
    public android.media.audio.common.AudioConfig audioConfig;
    public byte[] data;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.RecognitionEvent> CREATOR = null;
    public RecognitionEvent() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}

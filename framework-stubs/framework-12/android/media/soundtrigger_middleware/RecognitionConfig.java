package android.media.soundtrigger_middleware;

public class RecognitionConfig implements android.os.Parcelable {
    public boolean captureRequested;
    public android.media.soundtrigger_middleware.PhraseRecognitionExtra[] phraseRecognitionExtras;
    public int audioCapabilities;
    public byte[] data;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.RecognitionConfig> CREATOR = null;
    public RecognitionConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}

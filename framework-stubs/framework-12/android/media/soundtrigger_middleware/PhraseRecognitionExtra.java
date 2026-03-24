package android.media.soundtrigger_middleware;

public class PhraseRecognitionExtra implements android.os.Parcelable {
    public int id;
    public int recognitionModes;
    public int confidenceLevel;
    public android.media.soundtrigger_middleware.ConfidenceLevel[] levels;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.PhraseRecognitionExtra> CREATOR = null;
    public PhraseRecognitionExtra() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}

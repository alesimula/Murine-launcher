package android.media.soundtrigger;

public class RecognitionConfig implements android.os.Parcelable {
    public boolean captureRequested;
    public android.media.soundtrigger.PhraseRecognitionExtra[] phraseRecognitionExtras;
    public int audioCapabilities;
    public byte[] data;
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.RecognitionConfig> CREATOR = null;
    public RecognitionConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}

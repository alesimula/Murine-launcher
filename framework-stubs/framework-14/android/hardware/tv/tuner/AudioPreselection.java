package android.hardware.tv.tuner;

public class AudioPreselection implements android.os.Parcelable {
    public int preselectionId;
    public android.hardware.tv.tuner.AudioPreselectionLabel[] labels;
    public java.lang.String language;
    public int renderingIndication;
    public boolean hasAudioDescription;
    public boolean hasSpokenSubtitles;
    public boolean hasDialogueEnhancement;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.AudioPreselection> CREATOR = null;
    public AudioPreselection() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

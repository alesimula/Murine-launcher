package android.hardware.soundtrigger;

public final class KeyphraseMetadata implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.KeyphraseMetadata> CREATOR = null;
    public KeyphraseMetadata(int p0, java.lang.String p1, java.util.Set<java.util.Locale> p2, int p3) {}
    public int getId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getKeyphrase() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.util.Locale> getSupportedLocales() { return null; }
    public int getRecognitionModeFlags() { return 0; }
    public boolean supportsPhrase(java.lang.String p0) { return false; }
    public boolean supportsLocale(java.util.Locale p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    KeyphraseMetadata(android.os.Parcel p0) {}
}

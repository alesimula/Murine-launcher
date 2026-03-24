package android.media;

public final class AudioPresentation implements android.os.Parcelable {
    public static final int CONTENT_UNKNOWN = -1;
    public static final int CONTENT_MAIN = 0;
    public static final int CONTENT_MUSIC_AND_EFFECTS = 1;
    public static final int CONTENT_VISUALLY_IMPAIRED = 2;
    public static final int CONTENT_HEARING_IMPAIRED = 3;
    public static final int CONTENT_DIALOG = 4;
    public static final int CONTENT_COMMENTARY = 5;
    public static final int CONTENT_EMERGENCY = 6;
    public static final int CONTENT_VOICEOVER = 7;
    public static final int MASTERING_NOT_INDICATED = 0;
    public static final int MASTERED_FOR_STEREO = 1;
    public static final int MASTERED_FOR_SURROUND = 2;
    public static final int MASTERED_FOR_3D = 3;
    public static final int MASTERED_FOR_HEADPHONE = 4;
    public static final int PRESENTATION_ID_UNKNOWN = -1;
    public static final int PROGRAM_ID_UNKNOWN = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioPresentation> CREATOR = null;
    public int getPresentationId() { return 0; }
    public int getProgramId() { return 0; }
    public java.util.Map<java.util.Locale, java.lang.String> getLabels() { return null; }
    public java.util.Locale getLocale() { return null; }
    public int getMasteringIndication() { return 0; }
    public boolean hasAudioDescription() { return false; }
    public boolean hasSpokenSubtitles() { return false; }
    public boolean hasDialogueEnhancement() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setProgramId(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setLocale(android.icu.util.ULocale p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setMasteringIndication(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setLabels(java.util.Map<android.icu.util.ULocale, java.lang.CharSequence> p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setHasAudioDescription(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setHasSpokenSubtitles(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation.Builder setHasDialogueEnhancement(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPresentation build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentClassifier {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MasteringIndicationType {
    }
}

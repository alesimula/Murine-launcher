package android.media;

public final class AudioPresentation {
    private final int mPresentationId = 0;
    private final int mProgramId = 0;
    public static final int CONTENT_UNKNOWN = -1;
    public static final int CONTENT_MAIN = 0;
    public static final int CONTENT_MUSIC_AND_EFFECTS = 1;
    public static final int CONTENT_VISUALLY_IMPAIRED = 2;
    public static final int CONTENT_HEARING_IMPAIRED = 3;
    public static final int CONTENT_DIALOG = 4;
    public static final int CONTENT_COMMENTARY = 5;
    public static final int CONTENT_EMERGENCY = 6;
    public static final int CONTENT_VOICEOVER = 7;
    private final int mMasteringIndication = 0;
    private final boolean mAudioDescriptionAvailable = false;
    private final boolean mSpokenSubtitlesAvailable = false;
    private final boolean mDialogueEnhancementAvailable = false;
    private final java.util.Map<android.icu.util.ULocale, java.lang.CharSequence> mLabels = null;
    public static final int MASTERING_NOT_INDICATED = 0;
    public static final int MASTERED_FOR_STEREO = 1;
    public static final int MASTERED_FOR_SURROUND = 2;
    public static final int MASTERED_FOR_3D = 3;
    public static final int MASTERED_FOR_HEADPHONE = 4;
    private static final int UNKNOWN_ID = -1;
    private AudioPresentation(int p0, int p1, android.icu.util.ULocale p2, int p3, boolean p4, boolean p5, boolean p6, java.util.Map<android.icu.util.ULocale, java.lang.CharSequence> p7) {}
    public int getPresentationId() { return 0; }
    public int getProgramId() { return 0; }
    public java.util.Map<java.util.Locale, java.lang.String> getLabels() { return null; }
    private java.util.Map<android.icu.util.ULocale, java.lang.CharSequence> getULabels() { return null; }
    public java.util.Locale getLocale() { return null; }
    private android.icu.util.ULocale getULocale() { return null; }
    public int getMasteringIndication() { return 0; }
    public boolean hasAudioDescription() { return false; }
    public boolean hasSpokenSubtitles() { return false; }
    public boolean hasDialogueEnhancement() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final int mPresentationId = 0;
        private int mProgramId;
        private int mMasteringIndication;
        private boolean mAudioDescriptionAvailable;
        private boolean mSpokenSubtitlesAvailable;
        private boolean mDialogueEnhancementAvailable;
        private java.util.Map<android.icu.util.ULocale, java.lang.CharSequence> mLabels;
        public Builder(int p0) {}
        public android.media.AudioPresentation.Builder setProgramId(int p0) { return null; }
        public android.media.AudioPresentation.Builder setLocale(android.icu.util.ULocale p0) { return null; }
        public android.media.AudioPresentation.Builder setMasteringIndication(int p0) { return null; }
        public android.media.AudioPresentation.Builder setLabels(java.util.Map<android.icu.util.ULocale, java.lang.CharSequence> p0) { return null; }
        public android.media.AudioPresentation.Builder setHasAudioDescription(boolean p0) { return null; }
        public android.media.AudioPresentation.Builder setHasSpokenSubtitles(boolean p0) { return null; }
        public android.media.AudioPresentation.Builder setHasDialogueEnhancement(boolean p0) { return null; }
        public android.media.AudioPresentation build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentClassifier {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MasteringIndicationType {
    }
}

package android.hardware.soundtrigger;

public class KeyphraseEnrollmentInfo {
    public static final java.lang.String ACTION_MANAGE_VOICE_KEYPHRASES = "com.android.intent.action.MANAGE_VOICE_KEYPHRASES";
    public static final java.lang.String EXTRA_VOICE_KEYPHRASE_ACTION = "com.android.intent.extra.VOICE_KEYPHRASE_ACTION";
    public static final java.lang.String EXTRA_VOICE_KEYPHRASE_HINT_TEXT = "com.android.intent.extra.VOICE_KEYPHRASE_HINT_TEXT";
    public static final java.lang.String EXTRA_VOICE_KEYPHRASE_LOCALE = "com.android.intent.extra.VOICE_KEYPHRASE_LOCALE";
    public static final int MANAGE_ACTION_ENROLL = 0;
    public static final int MANAGE_ACTION_RE_ENROLL = 1;
    public static final int MANAGE_ACTION_UN_ENROLL = 2;
    public KeyphraseEnrollmentInfo(android.content.pm.PackageManager p0) {}
    public java.lang.String getParseError() { return null; }
    public java.util.Collection<android.hardware.soundtrigger.KeyphraseMetadata> listKeyphraseMetadata() { return null; }
    public android.content.Intent getManageKeyphraseIntent(int p0, java.lang.String p1, java.util.Locale p2) { return null; }
    public android.hardware.soundtrigger.KeyphraseMetadata getKeyphraseMetadata(java.lang.String p0, java.util.Locale p1) { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ManageActions {
    }
}

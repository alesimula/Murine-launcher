package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioMixingRule {
    public static final int RULE_MATCH_ATTRIBUTE_USAGE = 1;
    public static final int RULE_MATCH_ATTRIBUTE_CAPTURE_PRESET = 2;
    public static final int RULE_MATCH_UID = 4;
    public static final int RULE_MATCH_USERID = 8;
    public static final int RULE_EXCLUDE_ATTRIBUTE_USAGE = 32769;
    public static final int RULE_EXCLUDE_ATTRIBUTE_CAPTURE_PRESET = 32770;
    public static final int RULE_EXCLUDE_UID = 32772;
    public static final int RULE_EXCLUDE_USERID = 32776;
    public static final int MIX_ROLE_PLAYERS = 0;
    public static final int MIX_ROLE_INJECTOR = 1;
    boolean isAffectingUsage(int p0) { return false; }
    boolean containsMatchAttributeRuleForUsage(int p0) { return false; }
    int getTargetMixType() { return 0; }
    public int getTargetMixRole() { return 0; }
    public java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> getCriteria() { return null; }
    public boolean allowPrivilegedMediaPlaybackCapture() { return false; }
    public boolean voiceCommunicationCaptureAllowed() { return false; }
    public void setVoiceCommunicationCaptureAllowed(boolean p0) {}
    public boolean isForCallRedirection() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class AudioMixMatchCriterion {
        final android.media.AudioAttributes mAttr = null;
        final int mIntProp = 0;
        final int mRule = 0;
        AudioMixMatchCriterion(android.media.AudioAttributes p0, int p1) {}
        AudioMixMatchCriterion(java.lang.Integer p0, int p1) {}
        public int hashCode() { return 0; }
        void writeToParcel(android.os.Parcel p0) {}
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        public int getIntProp() { return 0; }
        public int getRule() { return 0; }
    }

    public static class Builder {
        public Builder() {}
        public android.media.audiopolicy.AudioMixingRule.Builder addRule(android.media.AudioAttributes p0, int p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder excludeRule(android.media.AudioAttributes p0, int p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder addMixRule(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder excludeMixRule(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder allowPrivilegedPlaybackCapture(boolean p0) { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder voiceCommunicationCaptureAllowed(boolean p0) { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder setTargetMixRole(int p0) { return null; }
        android.media.audiopolicy.AudioMixingRule.Builder addRuleFromParcel(android.os.Parcel p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MixRole {
    }
}

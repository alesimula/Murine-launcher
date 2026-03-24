package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioMixingRule {
    public static final int RULE_MATCH_ATTRIBUTE_USAGE = 1;
    public static final int RULE_MATCH_ATTRIBUTE_CAPTURE_PRESET = 2;
    public static final int RULE_MATCH_UID = 4;
    public static final int RULE_MATCH_USERID = 8;
    private static final int RULE_EXCLUSION_MASK = 32768;
    public static final int RULE_EXCLUDE_ATTRIBUTE_USAGE = 32769;
    public static final int RULE_EXCLUDE_ATTRIBUTE_CAPTURE_PRESET = 32770;
    public static final int RULE_EXCLUDE_UID = 32772;
    public static final int RULE_EXCLUDE_USERID = 32776;
    private final int mTargetMixType = 0;
    private final java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> mCriteria = null;
    private boolean mAllowPrivilegedPlaybackCapture;
    private boolean mVoiceCommunicationCaptureAllowed;
    private AudioMixingRule(int p0, java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> p1, boolean p2, boolean p3) {}
    boolean isAffectingUsage(int p0) { return false; }
    boolean containsMatchAttributeRuleForUsage(int p0) { return false; }
    private static boolean areCriteriaEquivalent(java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> p0, java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> p1) { return false; }
    int getTargetMixType() { return 0; }
    public java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> getCriteria() { return null; }
    public boolean allowPrivilegedPlaybackCapture() { return false; }
    public boolean voiceCommunicationCaptureAllowed() { return false; }
    public void setVoiceCommunicationCaptureAllowed(boolean p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private static boolean isValidSystemApiRule(int p0) { return false; }
    private static boolean isValidAttributesSystemApiRule(int p0) { return false; }
    private static boolean isValidRule(int p0) { return false; }
    private static boolean isPlayerRule(int p0) { return false; }
    private static boolean isAudioAttributeRule(int p0) { return false; }

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
        private java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> mCriteria;
        private int mTargetMixType;
        private boolean mAllowPrivilegedPlaybackCapture;
        private boolean mVoiceCommunicationCaptureAllowed;
        public Builder() {}
        public android.media.audiopolicy.AudioMixingRule.Builder addRule(android.media.AudioAttributes p0, int p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder excludeRule(android.media.AudioAttributes p0, int p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder addMixRule(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder excludeMixRule(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder allowPrivilegedPlaybackCapture(boolean p0) { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder voiceCommunicationCaptureAllowed(boolean p0) { return null; }
        private android.media.audiopolicy.AudioMixingRule.Builder checkAddRuleObjInternal(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        private android.media.audiopolicy.AudioMixingRule.Builder addRuleInternal(android.media.AudioAttributes p0, java.lang.Integer p1, int p2) throws java.lang.IllegalArgumentException { return null; }
        android.media.audiopolicy.AudioMixingRule.Builder addRuleFromParcel(android.os.Parcel p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule build() { return null; }
    }
}

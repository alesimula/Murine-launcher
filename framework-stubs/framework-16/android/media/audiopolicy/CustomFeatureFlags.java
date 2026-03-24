package android.media.audiopolicy;

public class CustomFeatureFlags implements android.media.audiopolicy.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.audiopolicy.FeatureFlags>> p0) {}
    public boolean audioMixPolicyOrdering() { return false; }
    public boolean audioMixTestApi() { return false; }
    public boolean audioPolicyUpdateMixingRulesApi() { return false; }
    public boolean enableFadeManagerConfiguration() { return false; }
    public boolean multiZoneAudio() { return false; }
    public boolean recordAudioDeviceAwarePermission() { return false; }
    public boolean volumeGroupManagementUpdate() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.audiopolicy.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

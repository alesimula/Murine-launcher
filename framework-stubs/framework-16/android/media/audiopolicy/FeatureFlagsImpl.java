package android.media.audiopolicy;

public final class FeatureFlagsImpl implements android.media.audiopolicy.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean audioMixPolicyOrdering() { return false; }
    public boolean audioMixTestApi() { return false; }
    public boolean audioPolicyUpdateMixingRulesApi() { return false; }
    public boolean enableFadeManagerConfiguration() { return false; }
    public boolean multiZoneAudio() { return false; }
    public boolean recordAudioDeviceAwarePermission() { return false; }
    public boolean volumeGroupManagementUpdate() { return false; }
}

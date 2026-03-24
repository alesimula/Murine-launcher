package android.media.audiopolicy;

public interface FeatureFlags {
    public boolean audioMixOwnership();
    public boolean audioMixPolicyOrdering();
    public boolean audioMixTestApi();
    public boolean audioPolicyUpdateMixingRulesApi();
    public boolean enableFadeManagerConfiguration();
    public boolean multiZoneAudio();
    public boolean recordAudioDeviceAwarePermission();
}

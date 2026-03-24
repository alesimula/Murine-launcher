package android.media.audiopolicy;

public final class Flags {
    public static final java.lang.String FLAG_AUDIO_MIX_OWNERSHIP = "android.media.audiopolicy.audio_mix_ownership";
    public static final java.lang.String FLAG_AUDIO_MIX_POLICY_ORDERING = "android.media.audiopolicy.audio_mix_policy_ordering";
    public static final java.lang.String FLAG_AUDIO_MIX_TEST_API = "android.media.audiopolicy.audio_mix_test_api";
    public static final java.lang.String FLAG_AUDIO_POLICY_UPDATE_MIXING_RULES_API = "android.media.audiopolicy.audio_policy_update_mixing_rules_api";
    public static final java.lang.String FLAG_ENABLE_FADE_MANAGER_CONFIGURATION = "android.media.audiopolicy.enable_fade_manager_configuration";
    public static final java.lang.String FLAG_MULTI_ZONE_AUDIO = "android.media.audiopolicy.multi_zone_audio";
    public static final java.lang.String FLAG_RECORD_AUDIO_DEVICE_AWARE_PERMISSION = "android.media.audiopolicy.record_audio_device_aware_permission";
    public Flags() {}
    public static boolean audioMixOwnership() { return false; }
    public static boolean audioMixPolicyOrdering() { return false; }
    public static boolean audioMixTestApi() { return false; }
    public static boolean audioPolicyUpdateMixingRulesApi() { return false; }
    public static boolean enableFadeManagerConfiguration() { return false; }
    public static boolean multiZoneAudio() { return false; }
    public static boolean recordAudioDeviceAwarePermission() { return false; }
}

package android.media.audio;

public class CustomFeatureFlags implements android.media.audio.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.audio.FeatureFlags>> p0) {}
    public boolean assistantVolumeControl() { return false; }
    public boolean audioFocusDesktop() { return false; }
    public boolean autoPublicVolumeApiHardening() { return false; }
    public boolean cacheGetStreamMinMaxVolume() { return false; }
    public boolean cacheGetStreamVolume() { return false; }
    public boolean concurrentAudioRecordBypassPermission() { return false; }
    public boolean dapInjectionStarveManagement() { return false; }
    public boolean deprecateStreamBtSco() { return false; }
    public boolean deviceVolumeApis() { return false; }
    public boolean dolbyAc4Level4EncodingApi() { return false; }
    public boolean enableMultichannelGroupDevice() { return false; }
    public boolean enablePlatformPcType() { return false; }
    public boolean enableRingtoneHapticsCustomization() { return false; }
    public boolean featureSpatialAudioHeadtrackingLowLatency() { return false; }
    public boolean focusExclusiveWithRecording() { return false; }
    public boolean focusFreezeTestApi() { return false; }
    public boolean foregroundAudioControl() { return false; }
    public boolean hardeningPermissionApi() { return false; }
    public boolean hardeningPermissionSpa() { return false; }
    public boolean iamfDefinitionsApi() { return false; }
    public boolean leaudioSwOffload() { return false; }
    public boolean loudnessConfiguratorApi() { return false; }
    public boolean muteBackgroundAudio() { return false; }
    public boolean mutedByPortVolumeApi() { return false; }
    public boolean registerVolumeCallbackApiHardening() { return false; }
    public boolean ringtoneUserUriCheck() { return false; }
    public boolean roForegroundAudioControl() { return false; }
    public boolean roVolumeRingerApiHardening() { return false; }
    public boolean routedDeviceIds() { return false; }
    public boolean scoManagedByAudio() { return false; }
    public boolean sony360raMpegh3dFormat() { return false; }
    public boolean spatialAudioSettingsVersioning() { return false; }
    public boolean spatializerCapabilities() { return false; }
    public boolean speakerCleanupUsage() { return false; }
    public boolean speakerLayoutApi() { return false; }
    public boolean supportedDeviceTypesApi() { return false; }
    public boolean unifyAbsoluteVolumeManagement() { return false; }
    public boolean volumeRingerApiHardening() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.audio.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

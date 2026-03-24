package android.media.audio;

public class CustomFeatureFlags implements android.media.audio.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.audio.FeatureFlags>> p0) {}
    public boolean autoPublicVolumeApiHardening() { return false; }
    public boolean automaticBtDeviceType() { return false; }
    public boolean featureSpatialAudioHeadtrackingLowLatency() { return false; }
    public boolean focusExclusiveWithRecording() { return false; }
    public boolean focusFreezeTestApi() { return false; }
    public boolean foregroundAudioControl() { return false; }
    public boolean loudnessConfiguratorApi() { return false; }
    public boolean muteBackgroundAudio() { return false; }
    public boolean roForegroundAudioControl() { return false; }
    public boolean roVolumeRingerApiHardening() { return false; }
    public boolean scoManagedByAudio() { return false; }
    public boolean supportedDeviceTypesApi() { return false; }
    public boolean volumeRingerApiHardening() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.audio.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

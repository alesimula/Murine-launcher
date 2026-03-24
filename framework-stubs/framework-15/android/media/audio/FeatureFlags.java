package android.media.audio;

public interface FeatureFlags {
    public boolean autoPublicVolumeApiHardening();
    public boolean automaticBtDeviceType();
    public boolean featureSpatialAudioHeadtrackingLowLatency();
    public boolean focusExclusiveWithRecording();
    public boolean focusFreezeTestApi();
    public boolean foregroundAudioControl();
    public boolean loudnessConfiguratorApi();
    public boolean muteBackgroundAudio();
    public boolean roForegroundAudioControl();
    public boolean roVolumeRingerApiHardening();
    public boolean scoManagedByAudio();
    public boolean supportedDeviceTypesApi();
    public boolean volumeRingerApiHardening();
}

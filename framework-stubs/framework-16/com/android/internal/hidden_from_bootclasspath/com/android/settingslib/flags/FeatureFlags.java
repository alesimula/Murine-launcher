package com.android.internal.hidden_from_bootclasspath.com.android.settingslib.flags;

public interface FeatureFlags {
    public boolean adoptPrimaryGroupManagementApi();
    public boolean adoptPrimaryGroupManagementApiV2();
    public boolean ashaProfileAccessProfileEnabledTrue();
    public boolean audioSharingDeveloperOption();
    public boolean audioSharingHysteresisModeFix();
    public boolean audioSharingQsDialogImprovement();
    public boolean audioStreamMediaServiceByReceiveState();
    public boolean audioStreamPlayPauseByModifySource();
    public boolean audioStreamScanWithFilter();
    public boolean bluetoothQsTileDialogAutoOnToggle();
    public boolean disableAudioSharingAutoPickFallbackInUi();
    public boolean enableDeterminingAdvancedDetailsHeaderWithMetadata();
    public boolean enableDeterminingSpatialAudioAttributesByProfile();
    public boolean enableLeAudioQrCodePrivateBroadcastSharing();
    public boolean enableLeAudioSharing();
    public boolean enableTemporaryBondDevicesUi();
    public boolean extremePowerLowStateVulnerability();
    public boolean fixBatteryLevelInConnectionSummary();
    public boolean hearingDeviceSetConnectionStatusReport();
    public boolean hearingDevicesAmbientVolumeControl();
    public boolean hearingDevicesInputRoutingControl();
    public boolean ignoreA2dpDisconnectionForAndroidAuto();
    public boolean legacyLeAudioSharing();
    public boolean memberDeviceLeaActiveStateSyncFix();
    public boolean newStatusBarIcons();
    public boolean promoteAudioSharingForSecondAutoConnectedLeaDevice();
    public boolean refactorBatteryLevelDisplay();
    public boolean settingsCatalyst();
    public boolean settingsPreferenceWriteConsentEnabled();
    public boolean volumeDialogAudioSharingFix();
    public boolean writeSystemPreferencePermissionEnabled();
}

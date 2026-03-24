package android.multiuser;

public final class FeatureFlagsImpl implements android.multiuser.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean addUiForSoundsFromBackgroundUsers() { return false; }
    public boolean allowMainUserToAccessBlockedNumberProvider() { return false; }
    public boolean allowResolverSheetForPrivateSpace() { return false; }
    public boolean avatarSync() { return false; }
    public boolean bindWallpaperServiceOnItsOwnThreadDuringAUserSwitch() { return false; }
    public boolean blockPrivateSpaceCreation() { return false; }
    public boolean deletePrivateSpaceFromReset() { return false; }
    public boolean disablePrivateSpaceItemsOnHome() { return false; }
    public boolean enableBiometricsToUnlockPrivateSpace() { return false; }
    public boolean enableHidingProfiles() { return false; }
    public boolean enableLauncherAppsHiddenProfileChecks() { return false; }
    public boolean enablePermissionToAccessHiddenProfiles() { return false; }
    public boolean enablePrivateSpaceAutolockOnRestarts() { return false; }
    public boolean enablePrivateSpaceFeatures() { return false; }
    public boolean enablePrivateSpaceIntentRedirection() { return false; }
    public boolean enablePsSensitiveNotificationsToggle() { return false; }
    public boolean enableSystemUserOnlyForServicesAndProviders() { return false; }
    public boolean fixAvatarConcurrentFileWrite() { return false; }
    public boolean fixAvatarPickerReadBackOrder() { return false; }
    public boolean fixAvatarPickerSelectedReadBack() { return false; }
    public boolean handleInterleavedSettingsForPrivateSpace() { return false; }
    public boolean moveQuietModeOperationsToSeparateThread() { return false; }
    public boolean newMultiuserSettingsUx() { return false; }
    public boolean reorderWallpaperDuringUserSwitch() { return false; }
    public boolean restrictQuietModeCredentialBugFixToManagedProfiles() { return false; }
    public boolean saveGlobalAndGuestRestrictionsOnSystemUserXml() { return false; }
    public boolean saveGlobalAndGuestRestrictionsOnSystemUserXmlReadOnly() { return false; }
    public boolean scheduleStopOfBackgroundUser() { return false; }
    public boolean setPowerModeDuringUserSwitch() { return false; }
    public boolean showSetScreenLockDialog() { return false; }
    public boolean startUserBeforeScheduledAlarms() { return false; }
    public boolean supportAutolockForPrivateSpace() { return false; }
    public boolean supportCommunalProfile() { return false; }
    public boolean supportCommunalProfileNextgen() { return false; }
    public boolean useAllCpusDuringUserSwitch() { return false; }
    public boolean usePrivateSpaceIconInBiometricPrompt() { return false; }
}

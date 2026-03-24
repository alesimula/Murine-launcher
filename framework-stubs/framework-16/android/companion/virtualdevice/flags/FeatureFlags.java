package android.companion.virtualdevice.flags;

public interface FeatureFlags {
    public boolean activityControlApi();
    public boolean cameraMultipleInputStreams();
    public boolean cameraTimestampFromSurface();
    public boolean computerControlAccess();
    public boolean correctVirtualDisplayPowerState();
    public boolean defaultDeviceCameraAccessPolicy();
    public boolean deviceAwareDisplayPower();
    public boolean deviceAwareSettingsOverride();
    public boolean displayPowerManagerApis();
    public boolean enableLimitedVdmRole();
    public boolean enforceRemoteDeviceOptOutOnAllVirtualDisplays();
    public boolean externalVirtualCameras();
    public boolean fixVdmOptOutOnMirrorDisplays();
    public boolean gwpcAwareWindowingMode();
    public boolean highResolutionScroll();
    public boolean itemizedVdmPermissions();
    public boolean migrateViewconfigurationConstantsToResources();
    public boolean notificationsForDeviceStreaming();
    public boolean statusBarAndInsets();
    public boolean vdmSettings();
    public boolean viewconfigurationApis();
    public boolean virtualCameraMetadata();
    public boolean virtualCameraNoFrameDuplication();
    public boolean virtualCameraOnOpen();
    public boolean virtualDisplayInsets();
    public boolean virtualDisplayRotationApi();
    public boolean virtualPowerGroupSleepNoDoze();
    public boolean virtualRotary();
    public boolean virtualSensorAdditionalInfo();
}

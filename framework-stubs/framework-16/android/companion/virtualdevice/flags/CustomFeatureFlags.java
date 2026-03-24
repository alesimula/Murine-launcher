package android.companion.virtualdevice.flags;

public class CustomFeatureFlags implements android.companion.virtualdevice.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.companion.virtualdevice.flags.FeatureFlags>> p0) {}
    public boolean activityControlApi() { return false; }
    public boolean cameraMultipleInputStreams() { return false; }
    public boolean cameraTimestampFromSurface() { return false; }
    public boolean computerControlAccess() { return false; }
    public boolean correctVirtualDisplayPowerState() { return false; }
    public boolean defaultDeviceCameraAccessPolicy() { return false; }
    public boolean deviceAwareDisplayPower() { return false; }
    public boolean deviceAwareSettingsOverride() { return false; }
    public boolean displayPowerManagerApis() { return false; }
    public boolean enableLimitedVdmRole() { return false; }
    public boolean enforceRemoteDeviceOptOutOnAllVirtualDisplays() { return false; }
    public boolean externalVirtualCameras() { return false; }
    public boolean fixVdmOptOutOnMirrorDisplays() { return false; }
    public boolean gwpcAwareWindowingMode() { return false; }
    public boolean highResolutionScroll() { return false; }
    public boolean itemizedVdmPermissions() { return false; }
    public boolean migrateViewconfigurationConstantsToResources() { return false; }
    public boolean notificationsForDeviceStreaming() { return false; }
    public boolean statusBarAndInsets() { return false; }
    public boolean vdmSettings() { return false; }
    public boolean viewconfigurationApis() { return false; }
    public boolean virtualCameraMetadata() { return false; }
    public boolean virtualCameraNoFrameDuplication() { return false; }
    public boolean virtualCameraOnOpen() { return false; }
    public boolean virtualDisplayInsets() { return false; }
    public boolean virtualDisplayRotationApi() { return false; }
    public boolean virtualPowerGroupSleepNoDoze() { return false; }
    public boolean virtualRotary() { return false; }
    public boolean virtualSensorAdditionalInfo() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.companion.virtualdevice.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

package android.companion.virtualdevice.flags;

public final class Flags {
    public static final java.lang.String FLAG_CAMERA_DEVICE_AWARENESS = "android.companion.virtualdevice.flags.camera_device_awareness";
    public static final java.lang.String FLAG_DEVICE_AWARE_DRM = "android.companion.virtualdevice.flags.device_aware_drm";
    public static final java.lang.String FLAG_DEVICE_AWARE_RECORD_AUDIO_PERMISSION = "android.companion.virtualdevice.flags.device_aware_record_audio_permission";
    public static final java.lang.String FLAG_INTENT_INTERCEPTION_ACTION_MATCHING_FIX = "android.companion.virtualdevice.flags.intent_interception_action_matching_fix";
    public static final java.lang.String FLAG_METRICS_COLLECTION = "android.companion.virtualdevice.flags.metrics_collection";
    public static final java.lang.String FLAG_VIRTUAL_CAMERA_SERVICE_DISCOVERY = "android.companion.virtualdevice.flags.virtual_camera_service_discovery";
    public static final java.lang.String FLAG_VIRTUAL_DISPLAY_MULTI_WINDOW_MODE_SUPPORT = "android.companion.virtualdevice.flags.virtual_display_multi_window_mode_support";
    public Flags() {}
    public static boolean cameraDeviceAwareness() { return false; }
    public static boolean deviceAwareDrm() { return false; }
    public static boolean deviceAwareRecordAudioPermission() { return false; }
    public static boolean intentInterceptionActionMatchingFix() { return false; }
    public static boolean metricsCollection() { return false; }
    public static boolean virtualCameraServiceDiscovery() { return false; }
    public static boolean virtualDisplayMultiWindowModeSupport() { return false; }
}

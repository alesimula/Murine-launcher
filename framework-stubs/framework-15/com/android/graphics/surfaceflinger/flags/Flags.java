package com.android.graphics.surfaceflinger.flags;

public final class Flags {
    public static final java.lang.String FLAG_ADD_SF_SKIPPED_FRAMES_TO_TRACE = "com.android.graphics.surfaceflinger.flags.add_sf_skipped_frames_to_trace";
    public static final java.lang.String FLAG_ADPF_GPU_SF = "com.android.graphics.surfaceflinger.flags.adpf_gpu_sf";
    public static final java.lang.String FLAG_ALLOW_N_VSYNCS_IN_TARGETER = "com.android.graphics.surfaceflinger.flags.allow_n_vsyncs_in_targeter";
    public static final java.lang.String FLAG_CACHE_WHEN_SOURCE_CROP_LAYER_ONLY_MOVED = "com.android.graphics.surfaceflinger.flags.cache_when_source_crop_layer_only_moved";
    public static final java.lang.String FLAG_CE_FENCE_PROMISE = "com.android.graphics.surfaceflinger.flags.ce_fence_promise";
    public static final java.lang.String FLAG_COMMIT_NOT_COMPOSITED = "com.android.graphics.surfaceflinger.flags.commit_not_composited";
    public static final java.lang.String FLAG_CONNECTED_DISPLAY = "com.android.graphics.surfaceflinger.flags.connected_display";
    public static final java.lang.String FLAG_DEPRECATE_VSYNC_SF = "com.android.graphics.surfaceflinger.flags.deprecate_vsync_sf";
    public static final java.lang.String FLAG_DETACHED_MIRROR = "com.android.graphics.surfaceflinger.flags.detached_mirror";
    public static final java.lang.String FLAG_DISPLAY_PROTECTED = "com.android.graphics.surfaceflinger.flags.display_protected";
    public static final java.lang.String FLAG_DONT_SKIP_ON_EARLY_RO = "com.android.graphics.surfaceflinger.flags.dont_skip_on_early_ro";
    public static final java.lang.String FLAG_ENABLE_FRO_DEPENDENT_FEATURES = "com.android.graphics.surfaceflinger.flags.enable_fro_dependent_features";
    public static final java.lang.String FLAG_ENABLE_LAYER_COMMAND_BATCHING = "com.android.graphics.surfaceflinger.flags.enable_layer_command_batching";
    public static final java.lang.String FLAG_ENABLE_SMALL_AREA_DETECTION = "com.android.graphics.surfaceflinger.flags.enable_small_area_detection";
    public static final java.lang.String FLAG_FLUSH_BUFFER_SLOTS_TO_UNCACHE = "com.android.graphics.surfaceflinger.flags.flush_buffer_slots_to_uncache";
    public static final java.lang.String FLAG_FORCE_COMPILE_GRAPHITE_RENDERENGINE = "com.android.graphics.surfaceflinger.flags.force_compile_graphite_renderengine";
    public static final java.lang.String FLAG_FP16_CLIENT_TARGET = "com.android.graphics.surfaceflinger.flags.fp16_client_target";
    public static final java.lang.String FLAG_FRAME_RATE_CATEGORY_MRR = "com.android.graphics.surfaceflinger.flags.frame_rate_category_mrr";
    public static final java.lang.String FLAG_GAME_DEFAULT_FRAME_RATE = "com.android.graphics.surfaceflinger.flags.game_default_frame_rate";
    public static final java.lang.String FLAG_GRAPHITE_RENDERENGINE = "com.android.graphics.surfaceflinger.flags.graphite_renderengine";
    public static final java.lang.String FLAG_HDCP_LEVEL_HAL = "com.android.graphics.surfaceflinger.flags.hdcp_level_hal";
    public static final java.lang.String FLAG_HOTPLUG2 = "com.android.graphics.surfaceflinger.flags.hotplug2";
    public static final java.lang.String FLAG_LATCH_UNSIGNALED_WITH_AUTO_REFRESH_CHANGED = "com.android.graphics.surfaceflinger.flags.latch_unsignaled_with_auto_refresh_changed";
    public static final java.lang.String FLAG_LOCAL_TONEMAP_SCREENSHOTS = "com.android.graphics.surfaceflinger.flags.local_tonemap_screenshots";
    public static final java.lang.String FLAG_MISC1 = "com.android.graphics.surfaceflinger.flags.misc1";
    public static final java.lang.String FLAG_MULTITHREADED_PRESENT = "com.android.graphics.surfaceflinger.flags.multithreaded_present";
    public static final java.lang.String FLAG_OVERRIDE_TRUSTED_OVERLAY = "com.android.graphics.surfaceflinger.flags.override_trusted_overlay";
    public static final java.lang.String FLAG_PROTECTED_IF_CLIENT = "com.android.graphics.surfaceflinger.flags.protected_if_client";
    public static final java.lang.String FLAG_REFRESH_RATE_OVERLAY_ON_EXTERNAL_DISPLAY = "com.android.graphics.surfaceflinger.flags.refresh_rate_overlay_on_external_display";
    public static final java.lang.String FLAG_RENDERABLE_BUFFER_USAGE = "com.android.graphics.surfaceflinger.flags.renderable_buffer_usage";
    public static final java.lang.String FLAG_RESTORE_BLUR_STEP = "com.android.graphics.surfaceflinger.flags.restore_blur_step";
    public static final java.lang.String FLAG_SCREENSHOT_FENCE_PRESERVATION = "com.android.graphics.surfaceflinger.flags.screenshot_fence_preservation";
    public static final java.lang.String FLAG_SINGLE_HOP_SCREENSHOT = "com.android.graphics.surfaceflinger.flags.single_hop_screenshot";
    public static final java.lang.String FLAG_USE_KNOWN_REFRESH_RATE_FOR_FPS_CONSISTENCY = "com.android.graphics.surfaceflinger.flags.use_known_refresh_rate_for_fps_consistency";
    public static final java.lang.String FLAG_VRR_BUGFIX_24Q4 = "com.android.graphics.surfaceflinger.flags.vrr_bugfix_24q4";
    public static final java.lang.String FLAG_VRR_CONFIG = "com.android.graphics.surfaceflinger.flags.vrr_config";
    public static final java.lang.String FLAG_VULKAN_RENDERENGINE = "com.android.graphics.surfaceflinger.flags.vulkan_renderengine";
    public Flags() {}
    public static boolean addSfSkippedFramesToTrace() { return false; }
    public static boolean adpfGpuSf() { return false; }
    public static boolean allowNVsyncsInTargeter() { return false; }
    public static boolean cacheWhenSourceCropLayerOnlyMoved() { return false; }
    public static boolean ceFencePromise() { return false; }
    public static boolean commitNotComposited() { return false; }
    public static boolean connectedDisplay() { return false; }
    public static boolean deprecateVsyncSf() { return false; }
    public static boolean detachedMirror() { return false; }
    public static boolean displayProtected() { return false; }
    public static boolean dontSkipOnEarlyRo() { return false; }
    public static boolean enableFroDependentFeatures() { return false; }
    public static boolean enableLayerCommandBatching() { return false; }
    public static boolean enableSmallAreaDetection() { return false; }
    public static boolean flushBufferSlotsToUncache() { return false; }
    public static boolean forceCompileGraphiteRenderengine() { return false; }
    public static boolean fp16ClientTarget() { return false; }
    public static boolean frameRateCategoryMrr() { return false; }
    public static boolean gameDefaultFrameRate() { return false; }
    public static boolean graphiteRenderengine() { return false; }
    public static boolean hdcpLevelHal() { return false; }
    public static boolean hotplug2() { return false; }
    public static boolean latchUnsignaledWithAutoRefreshChanged() { return false; }
    public static boolean localTonemapScreenshots() { return false; }
    public static boolean misc1() { return false; }
    public static boolean multithreadedPresent() { return false; }
    public static boolean overrideTrustedOverlay() { return false; }
    public static boolean protectedIfClient() { return false; }
    public static boolean refreshRateOverlayOnExternalDisplay() { return false; }
    public static boolean renderableBufferUsage() { return false; }
    public static boolean restoreBlurStep() { return false; }
    public static boolean screenshotFencePreservation() { return false; }
    public static boolean singleHopScreenshot() { return false; }
    public static boolean useKnownRefreshRateForFpsConsistency() { return false; }
    public static boolean vrrBugfix24q4() { return false; }
    public static boolean vrrConfig() { return false; }
    public static boolean vulkanRenderengine() { return false; }
}

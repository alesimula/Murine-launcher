package com.android.graphics.surfaceflinger.flags;

public class CustomFeatureFlags implements com.android.graphics.surfaceflinger.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.graphics.surfaceflinger.flags.FeatureFlags>> p0) {}
    public boolean addSfSkippedFramesToTrace() { return false; }
    public boolean adpfGpuSf() { return false; }
    public boolean allowNVsyncsInTargeter() { return false; }
    public boolean cacheWhenSourceCropLayerOnlyMoved() { return false; }
    public boolean ceFencePromise() { return false; }
    public boolean commitNotComposited() { return false; }
    public boolean connectedDisplay() { return false; }
    public boolean deprecateVsyncSf() { return false; }
    public boolean detachedMirror() { return false; }
    public boolean displayProtected() { return false; }
    public boolean dontSkipOnEarlyRo() { return false; }
    public boolean enableFroDependentFeatures() { return false; }
    public boolean enableLayerCommandBatching() { return false; }
    public boolean enableSmallAreaDetection() { return false; }
    public boolean flushBufferSlotsToUncache() { return false; }
    public boolean forceCompileGraphiteRenderengine() { return false; }
    public boolean fp16ClientTarget() { return false; }
    public boolean frameRateCategoryMrr() { return false; }
    public boolean gameDefaultFrameRate() { return false; }
    public boolean graphiteRenderengine() { return false; }
    public boolean hdcpLevelHal() { return false; }
    public boolean hotplug2() { return false; }
    public boolean latchUnsignaledWithAutoRefreshChanged() { return false; }
    public boolean localTonemapScreenshots() { return false; }
    public boolean misc1() { return false; }
    public boolean multithreadedPresent() { return false; }
    public boolean overrideTrustedOverlay() { return false; }
    public boolean protectedIfClient() { return false; }
    public boolean refreshRateOverlayOnExternalDisplay() { return false; }
    public boolean renderableBufferUsage() { return false; }
    public boolean restoreBlurStep() { return false; }
    public boolean screenshotFencePreservation() { return false; }
    public boolean singleHopScreenshot() { return false; }
    public boolean useKnownRefreshRateForFpsConsistency() { return false; }
    public boolean vrrBugfix24q4() { return false; }
    public boolean vrrConfig() { return false; }
    public boolean vulkanRenderengine() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.graphics.surfaceflinger.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

package com.android.graphics.libgui.flags;

public class CustomFeatureFlags implements com.android.graphics.libgui.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.graphics.libgui.flags.FeatureFlags>> p0) {}
    public boolean applyPictureProfiles() { return false; }
    public boolean bqConsumerAttachCallback() { return false; }
    public boolean bqExtendedallocate() { return false; }
    public boolean bqGlFenceCleanup() { return false; }
    public boolean bqProducerThrottlesOnlyAsyncMode() { return false; }
    public boolean bufferReleaseChannel() { return false; }
    public boolean cursorPlaneCompatibility() { return false; }
    public boolean frametimestampsPreviousrelease() { return false; }
    public boolean wbConsumerBaseOwnsBq() { return false; }
    public boolean wbLibcameraservice() { return false; }
    public boolean wbMediaMigration() { return false; }
    public boolean wbPlatformApiImprovements() { return false; }
    public boolean wbRingBuffer() { return false; }
    public boolean wbStreamSplitter() { return false; }
    public boolean wbUnlimitedSlots() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.graphics.libgui.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

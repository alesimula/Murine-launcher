package com.android.graphics.hwui.flags;

public class CustomFeatureFlags implements com.android.graphics.hwui.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.graphics.hwui.flags.FeatureFlags>> p0) {}
    public boolean animateHdrTransitions() { return false; }
    public boolean clipShader() { return false; }
    public boolean clipSurfaceviews() { return false; }
    public boolean drawRegion() { return false; }
    public boolean gainmapAnimations() { return false; }
    public boolean gainmapConstructorWithMetadata() { return false; }
    public boolean hdr10bitPlus() { return false; }
    public boolean highContrastTextLuminance() { return false; }
    public boolean highContrastTextSmallTextRect() { return false; }
    public boolean initializeGlAlways() { return false; }
    public boolean limitedHdr() { return false; }
    public boolean matrix44() { return false; }
    public boolean requestedFormatsV() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.graphics.hwui.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

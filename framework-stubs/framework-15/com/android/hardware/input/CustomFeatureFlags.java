package com.android.hardware.input;

public class CustomFeatureFlags implements com.android.hardware.input.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.hardware.input.FeatureFlags>> p0) {}
    public boolean emojiAndScreenshotKeycodesAvailable() { return false; }
    public boolean keyboardA11yBounceKeysFlag() { return false; }
    public boolean keyboardA11ySlowKeysFlag() { return false; }
    public boolean keyboardA11yStickyKeysFlag() { return false; }
    public boolean keyboardLayoutPreviewFlag() { return false; }
    public boolean pointerCoordsIsResampledApi() { return false; }
    public boolean touchpadTapDragging() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.hardware.input.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

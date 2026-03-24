package com.android.hardware.input;

public final class FeatureFlagsImpl implements com.android.hardware.input.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean emojiAndScreenshotKeycodesAvailable() { return false; }
    public boolean keyboardA11yBounceKeysFlag() { return false; }
    public boolean keyboardA11ySlowKeysFlag() { return false; }
    public boolean keyboardA11yStickyKeysFlag() { return false; }
    public boolean keyboardLayoutPreviewFlag() { return false; }
    public boolean pointerCoordsIsResampledApi() { return false; }
    public boolean touchpadTapDragging() { return false; }
}

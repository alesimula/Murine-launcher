package com.android.hardware.input;

public interface FeatureFlags {
    public boolean emojiAndScreenshotKeycodesAvailable();
    public boolean keyboardA11yBounceKeysFlag();
    public boolean keyboardA11ySlowKeysFlag();
    public boolean keyboardA11yStickyKeysFlag();
    public boolean keyboardLayoutPreviewFlag();
    public boolean pointerCoordsIsResampledApi();
    public boolean touchpadTapDragging();
}

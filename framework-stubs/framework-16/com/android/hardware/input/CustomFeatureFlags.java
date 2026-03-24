package com.android.hardware.input;

public class CustomFeatureFlags implements com.android.hardware.input.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.hardware.input.FeatureFlags>> p0) {}
    public boolean abortSlowMultiPress() { return false; }
    public boolean canWindowOverridePowerGestureApi() { return false; }
    public boolean createVirtualKeyboardApi() { return false; }
    public boolean enableBackupAndRestoreForInputGestures() { return false; }
    public boolean enableCustomizableInputGestures() { return false; }
    public boolean enableDisplayColorInversionKeyGestures() { return false; }
    public boolean enableNew25q2Keycodes() { return false; }
    public boolean enableTalkbackAndMagnifierKeyGestures() { return false; }
    public boolean enableVoiceAccessKeyGestures() { return false; }
    public boolean fixKeyboardInterceptorPolicyCall() { return false; }
    public boolean fixSearchModifierFallbacks() { return false; }
    public boolean hidBluetoothWakeup() { return false; }
    public boolean keyEventActivityDetection() { return false; }
    public boolean keyboardA11yMouseKeys() { return false; }
    public boolean keyboardA11yShortcutControl() { return false; }
    public boolean keyboardGlyphMap() { return false; }
    public boolean keyboardRepeatKeys() { return false; }
    public boolean manageKeyGestures() { return false; }
    public boolean mouseReverseVerticalScrolling() { return false; }
    public boolean mouseScrollingAcceleration() { return false; }
    public boolean mouseSwapPrimaryButton() { return false; }
    public boolean mouseToTouchPerAppCompat() { return false; }
    public boolean overridePowerKeyBehaviorInFocusedWindow() { return false; }
    public boolean pointerAcceleration() { return false; }
    public boolean removeFallbackModifiers() { return false; }
    public boolean requestKeyCaptureApi() { return false; }
    public boolean touchpadSystemGestureDisable() { return false; }
    public boolean touchpadThreeFingerTapShortcut() { return false; }
    public boolean touchpadVisualizer() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.hardware.input.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

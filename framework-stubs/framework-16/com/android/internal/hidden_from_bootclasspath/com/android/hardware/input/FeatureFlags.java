package com.android.internal.hidden_from_bootclasspath.com.android.hardware.input;

public interface FeatureFlags {
    public boolean abortSlowMultiPress();
    public boolean canWindowOverridePowerGestureApi();
    public boolean createVirtualKeyboardApi();
    public boolean enableBackupAndRestoreForInputGestures();
    public boolean enableCustomizableInputGestures();
    public boolean enableDisplayColorInversionKeyGestures();
    public boolean enableNew25q2Keycodes();
    public boolean enableTalkbackAndMagnifierKeyGestures();
    public boolean enableVoiceAccessKeyGestures();
    public boolean fixKeyboardInterceptorPolicyCall();
    public boolean fixSearchModifierFallbacks();
    public boolean hidBluetoothWakeup();
    public boolean keyEventActivityDetection();
    public boolean keyboardA11yMouseKeys();
    public boolean keyboardA11yShortcutControl();
    public boolean keyboardGlyphMap();
    public boolean keyboardRepeatKeys();
    public boolean manageKeyGestures();
    public boolean mouseReverseVerticalScrolling();
    public boolean mouseScrollingAcceleration();
    public boolean mouseSwapPrimaryButton();
    public boolean mouseToTouchPerAppCompat();
    public boolean overridePowerKeyBehaviorInFocusedWindow();
    public boolean pointerAcceleration();
    public boolean removeFallbackModifiers();
    public boolean requestKeyCaptureApi();
    public boolean touchpadSystemGestureDisable();
    public boolean touchpadThreeFingerTapShortcut();
    public boolean touchpadVisualizer();
}

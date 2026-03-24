package android.view;

public class ViewConfiguration {
    public static final int DEFAULT_LONG_PRESS_TIMEOUT = 400;
    public static final int NO_HAPTIC_SCROLL_TICK_INTERVAL = 2147483647;
    public static final int DEFAULT_TEXT_CURSOR_BLINK_INTERVAL_MS = 500;
    public static final int MIN_TEXT_CURSOR_BLINK_INTERVAL_MS = 333;
    public static final int NO_BLINK_TEXT_CURSOR_BLINK_INTERVAL_MS = 0;
    static final android.util.LongSparseArray<android.view.ViewConfiguration> sConfigurations = null;
    @java.lang.Deprecated
    public ViewConfiguration() {}
    public static android.view.ViewConfiguration get(android.content.Context p0) { return null; }
    public static void resetCacheForTesting() {}
    public static void setInstanceForTesting(android.content.Context p0, android.view.ViewConfiguration p1) {}
    @java.lang.Deprecated
    public static int getScrollBarSize() { return 0; }
    public int getScaledScrollBarSize() { return 0; }
    public int getScaledMinScrollbarTouchTarget() { return 0; }
    public static int getScrollBarFadeDuration() { return 0; }
    public static int getScrollDefaultDelay() { return 0; }
    @java.lang.Deprecated
    public static int getFadingEdgeLength() { return 0; }
    public int getScaledFadingEdgeLength() { return 0; }
    public static int getPressedStateDuration() { return 0; }
    public static int getLongPressTimeout() { return 0; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public int getLongPressTimeoutMillis() { return 0; }
    public static int getMultiPressTimeout() { return 0; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public int getMultiPressTimeoutMillis() { return 0; }
    public static int getKeyRepeatTimeout() { return 0; }
    public static int getKeyRepeatDelay() { return 0; }
    @android.annotation.FlaggedApi("android.view.accessibility.text_cursor_blink_interval")
    public int getTextCursorBlinkIntervalMillis() { return 0; }
    public static int getTapTimeout() { return 0; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public int getTapTimeoutMillis() { return 0; }
    public static int getJumpTapTimeout() { return 0; }
    public static int getDoubleTapTimeout() { return 0; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public int getDoubleTapTimeoutMillis() { return 0; }
    public static int getDoubleTapMinTime() { return 0; }
    public int getDoubleTapMinTimeMillis() { return 0; }
    public static int getHoverTapSlop() { return 0; }
    @java.lang.Deprecated
    public static int getEdgeSlop() { return 0; }
    public int getScaledEdgeSlop() { return 0; }
    @java.lang.Deprecated
    public static int getTouchSlop() { return 0; }
    public int getScaledTouchSlop() { return 0; }
    public int getScaledHandwritingSlop() { return 0; }
    public int getScaledHoverSlop() { return 0; }
    public int getScaledDoubleTapTouchSlop() { return 0; }
    public int getScaledPagingTouchSlop() { return 0; }
    @java.lang.Deprecated
    public static int getDoubleTapSlop() { return 0; }
    public int getScaledDoubleTapSlop() { return 0; }
    public int getScaledHandwritingGestureLineMargin() { return 0; }
    public static long getSendRecurringAccessibilityEventsInterval() { return 0L; }
    @java.lang.Deprecated
    public static int getWindowTouchSlop() { return 0; }
    public int getScaledWindowTouchSlop() { return 0; }
    @java.lang.Deprecated
    public static int getMinimumFlingVelocity() { return 0; }
    public int getScaledMinimumFlingVelocity() { return 0; }
    @java.lang.Deprecated
    public static int getMaximumFlingVelocity() { return 0; }
    public int getScaledMaximumFlingVelocity() { return 0; }
    public int getScaledScrollFactor() { return 0; }
    public float getScaledHorizontalScrollFactor() { return 0.0f; }
    public float getScaledVerticalScrollFactor() { return 0.0f; }
    @java.lang.Deprecated
    public static int getMaximumDrawingCacheSize() { return 0; }
    public int getScaledMaximumDrawingCacheSize() { return 0; }
    public int getScaledOverscrollDistance() { return 0; }
    public int getScaledOverflingDistance() { return 0; }
    public static long getZoomControlsTimeout() { return 0L; }
    @java.lang.Deprecated
    public static long getGlobalActionKeyTimeout() { return 0L; }
    public long getDeviceGlobalActionKeyTimeout() { return 0L; }
    public long getScreenshotChordKeyTimeout() { return 0L; }
    public long getAccessibilityShortcutKeyTimeout() { return 0L; }
    public long getAccessibilityShortcutKeyTimeoutAfterConfirmation() { return 0L; }
    public static float getScrollFriction() { return 0.0f; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public float getScrollFrictionAmount() { return 0.0f; }
    public static long getDefaultActionModeHideDuration() { return 0L; }
    @java.lang.Deprecated
    public static float getAmbiguousGestureMultiplier() { return 0.0f; }
    public float getScaledAmbiguousGestureMultiplier() { return 0.0f; }
    public boolean hasPermanentMenuKey() { return false; }
    public int getScaledMinimumFlingVelocity(int p0, int p1, int p2) { return 0; }
    public int getScaledMaximumFlingVelocity(int p0, int p1, int p2) { return 0; }
    public boolean isHapticScrollFeedbackEnabled(int p0, int p1, int p2) { return false; }
    public int getHapticScrollFeedbackTickInterval(int p0, int p1, int p2) { return 0; }
    public boolean isViewBasedRotaryEncoderHapticScrollFeedbackEnabled() { return false; }
    public boolean shouldShowMenuShortcutsWhenKeyboardPresent() { return false; }
    public int getScaledMinimumScalingSpan() { return 0; }
    public boolean isFadingMarqueeEnabled() { return false; }
    public int getSmartSelectionInitializedTimeout() { return 0; }
    public int getSmartSelectionInitializingTimeout() { return 0; }
    public boolean isPreferKeepClearForFocusEnabled() { return false; }
    public static int getLongPressTooltipHideTimeout() { return 0; }
    public static int getHoverTooltipShowTimeout() { return 0; }
    public static int getHoverTooltipHideTimeout() { return 0; }
    public static int getHoverTooltipHideShortTimeout() { return 0; }

    private static final class ResourceCache {
        public int getPressedStateDuration() { return 0; }
        public int getTapTimeout() { return 0; }
        public int getJumpTapTimeout() { return 0; }
        public int getDoubleTapTimeout() { return 0; }
        public int getDoubleTapMinTime() { return 0; }
        public int getHoverTapSlop() { return 0; }
        public long getZoomControlsTimeout() { return 0L; }
        public float getScrollFriction() { return 0.0f; }
        public long getDefaultActionModeHideDuration() { return 0L; }
        public int getDefaultTextCursorBlinkInterval() { return 0; }
        public int getNoBlinkTextCursorBlinkInterval() { return 0; }
        public int getMinTextCursorBlinkInterval() { return 0; }
    }
}

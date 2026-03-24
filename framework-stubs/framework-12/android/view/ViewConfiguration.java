package android.view;

public class ViewConfiguration {
    private static final java.lang.String TAG = "ViewConfiguration";
    private static final int SCROLL_BAR_SIZE = 4;
    private static final int SCROLL_BAR_FADE_DURATION = 250;
    private static final int SCROLL_BAR_DEFAULT_DELAY = 300;
    private static final int FADING_EDGE_LENGTH = 12;
    private static final int PRESSED_STATE_DURATION = 64;
    public static final int DEFAULT_LONG_PRESS_TIMEOUT = 400;
    private static final int DEFAULT_MULTI_PRESS_TIMEOUT = 300;
    private static final int KEY_REPEAT_DELAY = 50;
    private static final int GLOBAL_ACTIONS_KEY_TIMEOUT = 500;
    private static final int SCREENSHOT_CHORD_KEY_TIMEOUT = 0;
    private static final int A11Y_SHORTCUT_KEY_TIMEOUT = 3000;
    private static final int A11Y_SHORTCUT_KEY_TIMEOUT_AFTER_CONFIRMATION = 1000;
    private static final int TAP_TIMEOUT = 100;
    private static final int JUMP_TAP_TIMEOUT = 500;
    private static final int DOUBLE_TAP_TIMEOUT = 300;
    private static final int DOUBLE_TAP_MIN_TIME = 40;
    private static final int HOVER_TAP_TIMEOUT = 150;
    private static final int HOVER_TAP_SLOP = 20;
    private static final int ZOOM_CONTROLS_TIMEOUT = 3000;
    private static final int EDGE_SLOP = 12;
    private static final int TOUCH_SLOP = 8;
    private static final int MIN_SCROLLBAR_TOUCH_TARGET = 48;
    private static final int DOUBLE_TAP_TOUCH_SLOP = 8;
    private static final int PAGING_TOUCH_SLOP = 16;
    private static final int DOUBLE_TAP_SLOP = 100;
    private static final int WINDOW_TOUCH_SLOP = 16;
    private static final int MINIMUM_FLING_VELOCITY = 50;
    private static final int MAXIMUM_FLING_VELOCITY = 8000;
    private static final long SEND_RECURRING_ACCESSIBILITY_EVENTS_INTERVAL_MILLIS = 100L;
    @java.lang.Deprecated
    private static final int MAXIMUM_DRAWING_CACHE_SIZE = 1536000;
    private static final float SCROLL_FRICTION = 0.014999999664723873f;
    private static final int OVERSCROLL_DISTANCE = 0;
    private static final int OVERFLING_DISTANCE = 6;
    private static final float HORIZONTAL_SCROLL_FACTOR = 64.0f;
    private static final float VERTICAL_SCROLL_FACTOR = 64.0f;
    private static final long ACTION_MODE_HIDE_DURATION_DEFAULT = 2000L;
    private static final int LONG_PRESS_TOOLTIP_HIDE_TIMEOUT = 1500;
    private static final int HOVER_TOOLTIP_SHOW_TIMEOUT = 500;
    private static final int HOVER_TOOLTIP_HIDE_TIMEOUT = 15000;
    private static final int HOVER_TOOLTIP_HIDE_SHORT_TIMEOUT = 3000;
    private static final int HAS_PERMANENT_MENU_KEY_AUTODETECT = 0;
    private static final int HAS_PERMANENT_MENU_KEY_TRUE = 1;
    private static final int HAS_PERMANENT_MENU_KEY_FALSE = 2;
    private static final float AMBIGUOUS_GESTURE_MULTIPLIER = 2.0f;
    private static final int SMART_SELECTION_INITIALIZED_TIMEOUT_IN_MILLISECOND = 200;
    private static final int SMART_SELECTION_INITIALIZING_TIMEOUT_IN_MILLISECOND = 500;
    private final boolean mConstructedWithContext = false;
    private final int mEdgeSlop = 0;
    private final int mFadingEdgeLength = 0;
    private final int mMinimumFlingVelocity = 0;
    private final int mMaximumFlingVelocity = 0;
    private final int mScrollbarSize = 0;
    private final int mTouchSlop = 0;
    private final int mMinScalingSpan = 0;
    private final int mHoverSlop = 0;
    private final int mMinScrollbarTouchTarget = 0;
    private final int mDoubleTapTouchSlop = 0;
    private final int mPagingTouchSlop = 0;
    private final int mDoubleTapSlop = 0;
    private final int mWindowTouchSlop = 0;
    private final float mAmbiguousGestureMultiplier = 0.0f;
    private final int mMaximumDrawingCacheSize = 0;
    private final int mOverscrollDistance = 0;
    private final int mOverflingDistance = 0;
    private final boolean mFadingMarqueeEnabled = false;
    private final long mGlobalActionsKeyTimeout = 0L;
    private final float mVerticalScrollFactor = 0.0f;
    private final float mHorizontalScrollFactor = 0.0f;
    private final boolean mShowMenuShortcutsWhenKeyboardPresent = false;
    private final long mScreenshotChordKeyTimeout = 0L;
    private final int mSmartSelectionInitializedTimeout = 0;
    private final int mSmartSelectionInitializingTimeout = 0;
    private boolean sHasPermanentMenuKey;
    private boolean sHasPermanentMenuKeySet;
    static final android.util.SparseArray<android.view.ViewConfiguration> sConfigurations = null;
    @java.lang.Deprecated
    public ViewConfiguration() {}
    private ViewConfiguration(android.content.Context p0) {}
    public static android.view.ViewConfiguration get(android.content.Context p0) { return null; }
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
    public static int getMultiPressTimeout() { return 0; }
    public static int getKeyRepeatTimeout() { return 0; }
    public static int getKeyRepeatDelay() { return 0; }
    public static int getTapTimeout() { return 0; }
    public static int getJumpTapTimeout() { return 0; }
    public static int getDoubleTapTimeout() { return 0; }
    public static int getDoubleTapMinTime() { return 0; }
    public static int getHoverTapTimeout() { return 0; }
    public static int getHoverTapSlop() { return 0; }
    @java.lang.Deprecated
    public static int getEdgeSlop() { return 0; }
    public int getScaledEdgeSlop() { return 0; }
    @java.lang.Deprecated
    public static int getTouchSlop() { return 0; }
    public int getScaledTouchSlop() { return 0; }
    public int getScaledHoverSlop() { return 0; }
    public int getScaledDoubleTapTouchSlop() { return 0; }
    public int getScaledPagingTouchSlop() { return 0; }
    @java.lang.Deprecated
    public static int getDoubleTapSlop() { return 0; }
    public int getScaledDoubleTapSlop() { return 0; }
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
    public static long getDefaultActionModeHideDuration() { return 0L; }
    @java.lang.Deprecated
    public static float getAmbiguousGestureMultiplier() { return 0.0f; }
    public float getScaledAmbiguousGestureMultiplier() { return 0.0f; }
    public boolean hasPermanentMenuKey() { return false; }
    public boolean shouldShowMenuShortcutsWhenKeyboardPresent() { return false; }
    public int getScaledMinimumScalingSpan() { return 0; }
    public boolean isFadingMarqueeEnabled() { return false; }
    public int getSmartSelectionInitializedTimeout() { return 0; }
    public int getSmartSelectionInitializingTimeout() { return 0; }
    public static int getLongPressTooltipHideTimeout() { return 0; }
    public static int getHoverTooltipShowTimeout() { return 0; }
    public static int getHoverTooltipHideTimeout() { return 0; }
    public static int getHoverTooltipHideShortTimeout() { return 0; }
}

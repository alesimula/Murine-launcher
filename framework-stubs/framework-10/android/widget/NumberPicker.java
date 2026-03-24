package android.widget;

public class NumberPicker extends android.widget.LinearLayout {
    @android.annotation.UnsupportedAppUsage
    private static final int SELECTOR_WHEEL_ITEM_COUNT = 3;
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300L;
    @android.annotation.UnsupportedAppUsage
    private static final int SELECTOR_MIDDLE_ITEM_INDEX = 1;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 8;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    private static final int SNAP_SCROLL_DURATION = 300;
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.8999999761581421f;
    private static final int UNSCALED_DEFAULT_SELECTION_DIVIDER_HEIGHT = 2;
    private static final int UNSCALED_DEFAULT_SELECTION_DIVIDERS_DISTANCE = 48;
    private static final int DEFAULT_LAYOUT_RESOURCE_ID = 17367216;
    private static final int SIZE_UNSPECIFIED = -1;
    private boolean mWrapSelectorWheelPreferred;
    private static final android.widget.NumberPicker.TwoDigitFormatter sTwoDigitFormatter = null;
    private final android.widget.ImageButton mIncrementButton = null;
    private final android.widget.ImageButton mDecrementButton = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.EditText mInputText = null;
    private final int mSelectionDividersDistance = 0;
    @android.annotation.UnsupportedAppUsage
    private final int mMinHeight = 0;
    private final int mMaxHeight = 0;
    @android.annotation.UnsupportedAppUsage
    private final int mMinWidth = 0;
    private int mMaxWidth;
    private final boolean mComputeMaxWidth = false;
    @android.annotation.UnsupportedAppUsage
    private final int mTextSize = 0;
    private int mSelectorTextGapHeight;
    private java.lang.String[] mDisplayedValues;
    private int mMinValue;
    @android.annotation.UnsupportedAppUsage
    private int mMaxValue;
    private int mValue;
    @android.annotation.UnsupportedAppUsage
    private android.widget.NumberPicker.OnValueChangeListener mOnValueChangeListener;
    private android.widget.NumberPicker.OnScrollListener mOnScrollListener;
    private android.widget.NumberPicker.Formatter mFormatter;
    private long mLongPressUpdateInterval;
    private final android.util.SparseArray<java.lang.String> mSelectorIndexToStringCache = null;
    @android.annotation.UnsupportedAppUsage
    private final int[] mSelectorIndices = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private final android.graphics.Paint mSelectorWheelPaint = null;
    private final android.graphics.drawable.Drawable mVirtualButtonPressedDrawable = null;
    private int mSelectorElementHeight;
    private int mInitialScrollOffset;
    private int mCurrentScrollOffset;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.Scroller mFlingScroller = null;
    private final android.widget.Scroller mAdjustScroller = null;
    private int mPreviousScrollerY;
    private android.widget.NumberPicker.SetSelectionCommand mSetSelectionCommand;
    private android.widget.NumberPicker.ChangeCurrentByOneFromLongPressCommand mChangeCurrentByOneFromLongPressCommand;
    private android.widget.NumberPicker.BeginSoftInputOnLongPressCommand mBeginSoftInputOnLongPressCommand;
    private float mLastDownEventY;
    private long mLastDownEventTime;
    private float mLastDownOrMoveEventY;
    private android.view.VelocityTracker mVelocityTracker;
    private int mTouchSlop;
    private int mMinimumFlingVelocity;
    @android.annotation.UnsupportedAppUsage
    private int mMaximumFlingVelocity;
    private boolean mWrapSelectorWheel;
    private final int mSolidColor = 0;
    private final boolean mHasSelectorWheel = false;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private final android.graphics.drawable.Drawable mSelectionDivider = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mSelectionDividerHeight;
    private int mScrollState;
    private boolean mIgnoreMoveEvents;
    private boolean mPerformClickOnTap;
    private int mTopSelectionDividerTop;
    private int mBottomSelectionDividerBottom;
    private int mLastHoveredChildVirtualViewId;
    private boolean mIncrementVirtualButtonPressed;
    private boolean mDecrementVirtualButtonPressed;
    private android.widget.NumberPicker.AccessibilityNodeProviderImpl mAccessibilityNodeProvider;
    private final android.widget.NumberPicker.PressedStateHelper mPressedStateHelper = null;
    private int mLastHandledDownDpadKeyCode;
    private boolean mHideWheelUntilFocused;
    private static final char[] DIGIT_CHARACTERS = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.widget.NumberPicker.Formatter getTwoDigitFormatter() { return null; }
    public NumberPicker(android.content.Context p0) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    private boolean moveToFinalScrollerPosition(android.widget.Scroller p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public void computeScroll() {}
    public void setEnabled(boolean p0) {}
    public void scrollBy(int p0, int p1) {}
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    protected int computeVerticalScrollExtent() { return 0; }
    public int getSolidColor() { return 0; }
    public void setOnValueChangedListener(android.widget.NumberPicker.OnValueChangeListener p0) {}
    public void setOnScrollListener(android.widget.NumberPicker.OnScrollListener p0) {}
    public void setFormatter(android.widget.NumberPicker.Formatter p0) {}
    public void setValue(int p0) {}
    public boolean performClick() { return false; }
    public boolean performLongClick() { return false; }
    private void showSoftInput() {}
    private void hideSoftInput() {}
    private void tryComputeMaxWidth() {}
    public boolean getWrapSelectorWheel() { return false; }
    public void setWrapSelectorWheel(boolean p0) {}
    private void updateWrapSelectorWheel() {}
    public void setOnLongPressUpdateInterval(long p0) {}
    public int getValue() { return 0; }
    public int getMinValue() { return 0; }
    public void setMinValue(int p0) {}
    public int getMaxValue() { return 0; }
    public void setMaxValue(int p0) {}
    public java.lang.String[] getDisplayedValues() { return null; }
    public void setDisplayedValues(java.lang.String[] p0) {}
    public java.lang.CharSequence getDisplayedValueForCurrentSelection() { return null; }
    public void setSelectionDividerHeight(int p0) {}
    public int getSelectionDividerHeight() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    protected void onDetachedFromWindow() {}
    protected void drawableStateChanged() {}
    public void jumpDrawablesToCurrentState() {}
    public void onResolveDrawables(int p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { return null; }
    public void setTextColor(int p0) {}
    public int getTextColor() { return 0; }
    public void setTextSize(float p0) {}
    public float getTextSize() { return 0.0f; }
    private int makeMeasureSpec(int p0, int p1) { return 0; }
    private int resolveSizeAndStateRespectingMinSize(int p0, int p1, int p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    private void initializeSelectorWheelIndices() {}
    private void setValueInternal(int p0, boolean p1) {}
    @android.annotation.UnsupportedAppUsage
    private void changeValueByOne(boolean p0) {}
    private void initializeSelectorWheel() {}
    private void initializeFadingEdges() {}
    private void onScrollerFinished(android.widget.Scroller p0) {}
    private void onScrollStateChange(int p0) {}
    private void fling(int p0) {}
    private int getWrappedSelectorIndex(int p0) { return 0; }
    private void incrementSelectorIndices(int[] p0) {}
    private void decrementSelectorIndices(int[] p0) {}
    private void ensureCachedScrollSelectorValue(int p0) {}
    private java.lang.String formatNumber(int p0) { return null; }
    private void validateInputTextView(android.view.View p0) {}
    private boolean updateInputTextView() { return false; }
    private void notifyChange(int p0, int p1) {}
    private void postChangeCurrentByOneFromLongPress(boolean p0, long p1) {}
    private void removeChangeCurrentByOneFromLongPress() {}
    private void postBeginSoftInputOnLongPressCommand() {}
    private void removeBeginSoftInputCommand() {}
    private void removeAllCallbacks() {}
    private int getSelectedPos(java.lang.String p0) { return 0; }
    private void postSetSelectionCommand(int p0, int p1) {}
    private boolean ensureScrollWheelAdjusted() { return false; }
    private static java.lang.String formatNumberWithLocale(int p0) { return null; }

    private static class TwoDigitFormatter implements android.widget.NumberPicker.Formatter {
        final java.lang.StringBuilder mBuilder = null;
        char mZeroDigit;
        java.util.Formatter mFmt;
        final java.lang.Object[] mArgs = null;
        TwoDigitFormatter() {}
        private void init(java.util.Locale p0) {}
        public java.lang.String format(int p0) { return null; }
        private static char getZeroDigit(java.util.Locale p0) { return 0; }
        private java.util.Formatter createFormatter(java.util.Locale p0) { return null; }
    }

    private static class SetSelectionCommand implements java.lang.Runnable {
        private final android.widget.EditText mInputText = null;
        private int mSelectionStart;
        private int mSelectionEnd;
        private boolean mPosted;
        public SetSelectionCommand(android.widget.EditText p0) {}
        public void post(int p0, int p1) {}
        public void cancel() {}
        public void run() {}
    }

    class PressedStateHelper implements java.lang.Runnable {
        public static final int BUTTON_INCREMENT = 1;
        public static final int BUTTON_DECREMENT = 2;
        private final int MODE_PRESS = 0;
        private final int MODE_TAPPED = 0;
        private int mManagedButton;
        private int mMode;
        PressedStateHelper(android.widget.NumberPicker p0) {}
        public void cancel() {}
        public void buttonPressDelayed(int p0) {}
        public void buttonTapped(int p0) {}
        public void run() {}
    }

    public static interface OnValueChangeListener {
        public void onValueChange(android.widget.NumberPicker p0, int p1, int p2);
    }

    public static interface OnScrollListener {
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        public static final int SCROLL_STATE_FLING = 2;
        public void onScrollStateChange(android.widget.NumberPicker p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ScrollState {
        }
    }

    class InputTextFilter extends android.text.method.NumberKeyListener {
        InputTextFilter(android.widget.NumberPicker p0) { super(); }
        public int getInputType() { return 0; }
        protected char[] getAcceptedChars() { return null; }
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
    }

    public static interface Formatter {
        public java.lang.String format(int p0);
    }

    public static class CustomEditText extends android.widget.EditText {
        public CustomEditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public void onEditorAction(int p0) {}
    }

    class ChangeCurrentByOneFromLongPressCommand implements java.lang.Runnable {
        private boolean mIncrement;
        ChangeCurrentByOneFromLongPressCommand(android.widget.NumberPicker p0) {}
        private void setStep(boolean p0) {}
        public void run() {}
    }

    class BeginSoftInputOnLongPressCommand implements java.lang.Runnable {
        BeginSoftInputOnLongPressCommand(android.widget.NumberPicker p0) {}
        public void run() {}
    }

    class AccessibilityNodeProviderImpl extends android.view.accessibility.AccessibilityNodeProvider {
        private static final int UNDEFINED = -2147483648;
        private static final int VIRTUAL_VIEW_ID_INCREMENT = 1;
        private static final int VIRTUAL_VIEW_ID_INPUT = 2;
        private static final int VIRTUAL_VIEW_ID_DECREMENT = 3;
        private final android.graphics.Rect mTempRect = null;
        private final int[] mTempArray = null;
        private int mAccessibilityFocusedView;
        AccessibilityNodeProviderImpl(android.widget.NumberPicker p0) { super(); }
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0, int p1) { return null; }
        public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
        public void sendAccessibilityEventForVirtualView(int p0, int p1) {}
        private void sendAccessibilityEventForVirtualText(int p0) {}
        private void sendAccessibilityEventForVirtualButton(int p0, int p1, java.lang.String p2) {}
        private void findAccessibilityNodeInfosByTextInChild(java.lang.String p0, int p1, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p2) {}
        private android.view.accessibility.AccessibilityNodeInfo createAccessibiltyNodeInfoForInputText(int p0, int p1, int p2, int p3) { return null; }
        private android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfoForVirtualButton(int p0, java.lang.String p1, int p2, int p3, int p4, int p5) { return null; }
        private android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfoForNumberPicker(int p0, int p1, int p2, int p3) { return null; }
        private boolean hasVirtualDecrementButton() { return false; }
        private boolean hasVirtualIncrementButton() { return false; }
        private java.lang.String getVirtualDecrementButtonText() { return null; }
        private java.lang.String getVirtualIncrementButtonText() { return null; }
    }
}

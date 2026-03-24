package android.widget;

public class RadialTimePickerView extends android.view.View {
    private static final java.lang.String TAG = "RadialTimePickerView";
    public static final int HOURS = 0;
    public static final int MINUTES = 1;
    private static final int HOURS_INNER = 2;
    private static final int SELECTOR_CIRCLE = 0;
    private static final int SELECTOR_DOT = 1;
    private static final int SELECTOR_LINE = 2;
    private static final int AM = 0;
    private static final int PM = 1;
    private static final int HOURS_IN_CIRCLE = 12;
    private static final int MINUTES_IN_CIRCLE = 60;
    private static final int DEGREES_FOR_ONE_HOUR = 30;
    private static final int DEGREES_FOR_ONE_MINUTE = 6;
    private static final int[] HOURS_NUMBERS = null;
    private static final int[] HOURS_NUMBERS_24 = null;
    private static final int[] MINUTES_NUMBERS = null;
    private static final int ANIM_DURATION_NORMAL = 500;
    private static final int ANIM_DURATION_TOUCH = 60;
    private static final int[] SNAP_PREFER_30S_MAP = null;
    private static final int NUM_POSITIONS = 12;
    private static final float[] COS_30 = null;
    private static final float[] SIN_30 = null;
    private static final int MISSING_COLOR = -65281;
    private final android.util.FloatProperty<android.widget.RadialTimePickerView> HOURS_TO_MINUTES = null;
    private final java.lang.String[] mHours12Texts = null;
    private final java.lang.String[] mOuterHours24Texts = null;
    private final java.lang.String[] mInnerHours24Texts = null;
    private final java.lang.String[] mMinutesTexts = null;
    private final android.graphics.Paint[] mPaint = null;
    private final android.graphics.Paint mPaintCenter = null;
    private final android.graphics.Paint[] mPaintSelector = null;
    private final android.graphics.Paint mPaintBackground = null;
    private final android.graphics.Typeface mTypeface = null;
    private final android.content.res.ColorStateList[] mTextColor = null;
    private final int[] mTextSize = null;
    private final int[] mTextInset = null;
    private final float[][] mOuterTextX = null;
    private final float[][] mOuterTextY = null;
    private final float[] mInnerTextX = null;
    private final float[] mInnerTextY = null;
    private final int[] mSelectionDegrees = null;
    private final android.widget.RadialTimePickerView.RadialPickerTouchHelper mTouchHelper = null;
    private final android.graphics.Path mSelectorPath = null;
    private boolean mIs24HourMode;
    private boolean mShowHours;
    private android.animation.ObjectAnimator mHoursToMinutesAnimator;
    private float mHoursToMinutes;
    private boolean mIsOnInnerCircle;
    private int mSelectorRadius;
    private int mSelectorStroke;
    private int mSelectorDotRadius;
    private int mCenterDotRadius;
    private int mSelectorColor;
    private int mSelectorDotColor;
    private int mXCenter;
    private int mYCenter;
    private int mCircleRadius;
    private int mMinDistForInnerNumber;
    private int mMaxDistForOuterNumber;
    private int mHalfwayDist;
    private java.lang.String[] mOuterTextHours;
    private java.lang.String[] mInnerTextHours;
    private java.lang.String[] mMinutesText;
    private int mAmOrPm;
    private float mDisabledAlpha;
    private android.widget.RadialTimePickerView.OnValueSelectedListener mListener;
    private boolean mInputEnabled;
    boolean mChangedDuringTouch;
    private static void preparePrefer30sMap() {}
    private static int snapPrefer30s(int p0) { return 0; }
    private static int snapOnly30s(int p0, int p1) { return 0; }
    public RadialTimePickerView(android.content.Context p0) { super((android.content.Context)null); }
    public RadialTimePickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RadialTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RadialTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void applyAttributes(android.util.AttributeSet p0, int p1, int p2) {}
    public void initialize(int p0, int p1, boolean p2) {}
    public void setCurrentItemShowing(int p0, boolean p1) {}
    public int getCurrentItemShowing() { return 0; }
    public void setOnValueSelectedListener(android.widget.RadialTimePickerView.OnValueSelectedListener p0) {}
    public void setCurrentHour(int p0) {}
    private void setCurrentHourInternal(int p0, boolean p1, boolean p2) {}
    public int getCurrentHour() { return 0; }
    private int getHourForDegrees(int p0, boolean p1) { return 0; }
    private int getDegreesForHour(int p0) { return 0; }
    private boolean getInnerCircleForHour(int p0) { return false; }
    public void setCurrentMinute(int p0) {}
    private void setCurrentMinuteInternal(int p0, boolean p1) {}
    public int getCurrentMinute() { return 0; }
    private int getMinuteForDegrees(int p0) { return 0; }
    private int getDegreesForMinute(int p0) { return 0; }
    public boolean setAmOrPm(int p0) { return false; }
    public int getAmOrPm() { return 0; }
    public void showHours(boolean p0) {}
    public void showMinutes(boolean p0) {}
    private void initHoursAndMinutesText() {}
    private void initData() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onDraw(android.graphics.Canvas p0) {}
    private void showPicker(boolean p0, boolean p1) {}
    private void animatePicker(boolean p0, long p1) {}
    private void drawCircleBackground(android.graphics.Canvas p0) {}
    private void drawHours(android.graphics.Canvas p0, android.graphics.Path p1, float p2) {}
    private void drawHoursClipped(android.graphics.Canvas p0, int p1, boolean p2) {}
    private void drawMinutes(android.graphics.Canvas p0, android.graphics.Path p1, float p2) {}
    private void drawMinutesClipped(android.graphics.Canvas p0, int p1, boolean p2) {}
    private void drawCenter(android.graphics.Canvas p0, float p1) {}
    private int getMultipliedAlpha(int p0, int p1) { return 0; }
    private void drawSelector(android.graphics.Canvas p0, android.graphics.Path p1) {}
    private void calculatePositionsHours() {}
    private void calculatePositionsMinutes() {}
    private static void calculatePositions(android.graphics.Paint p0, float p1, float p2, float p3, float p4, float[] p5, float[] p6) {}
    private void drawTextElements(android.graphics.Canvas p0, float p1, android.graphics.Typeface p2, android.content.res.ColorStateList p3, java.lang.String[] p4, float[] p5, float[] p6, android.graphics.Paint p7, int p8, boolean p9, int p10, boolean p11) {}
    private int getDegreesFromXY(float p0, float p1, boolean p2) { return 0; }
    private boolean getInnerCircleFromXY(float p0, float p1) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean handleTouchInput(float p0, float p1, boolean p2, boolean p3) { return false; }
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public void setInputEnabled(boolean p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }

    private class RadialPickerTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        private final android.graphics.Rect mTempRect = null;
        private final int TYPE_HOUR = 0;
        private final int TYPE_MINUTE = 0;
        private final int SHIFT_TYPE = 0;
        private final int MASK_TYPE = 0;
        private final int SHIFT_VALUE = 0;
        private final int MASK_VALUE = 0;
        private final int MINUTE_INCREMENT = 0;
        public RadialPickerTouchHelper(android.widget.RadialTimePickerView p0) { super(null); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
        private void adjustPicker(int p0) {}
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        private int getCircularDiff(int p0, int p1, int p2) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        private int getVirtualViewIdAfter(int p0, int p1) { return 0; }
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
        private int hour12To24(int p0, int p1) { return 0; }
        private int hour24To12(int p0) { return 0; }
        private void getBoundsForVirtualView(int p0, android.graphics.Rect p1) {}
        private java.lang.CharSequence getVirtualViewDescription(int p0, int p1) { return null; }
        private boolean isVirtualViewSelected(int p0, int p1) { return false; }
        private int makeId(int p0, int p1) { return 0; }
        private int getTypeFromId(int p0) { return 0; }
        private int getValueFromId(int p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PickerType {
    }

    static interface OnValueSelectedListener {
        public void onValueSelected(int p0, int p1, boolean p2);
    }
}

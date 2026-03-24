package android.widget;

class SimpleMonthView extends android.view.View {
    private static final int DAYS_IN_WEEK = 7;
    private static final int MAX_WEEKS_IN_MONTH = 6;
    private static final int DEFAULT_SELECTED_DAY = -1;
    private static final int DEFAULT_WEEK_START = 1;
    private static final java.lang.String MONTH_YEAR_FORMAT = "MMMMy";
    private static final int SELECTED_HIGHLIGHT_ALPHA = 176;
    private final android.text.TextPaint mMonthPaint = null;
    private final android.text.TextPaint mDayOfWeekPaint = null;
    private final android.text.TextPaint mDayPaint = null;
    private final android.graphics.Paint mDaySelectorPaint = null;
    private final android.graphics.Paint mDayHighlightPaint = null;
    private final android.graphics.Paint mDayHighlightSelectorPaint = null;
    private final java.lang.String[] mDayOfWeekLabels = null;
    private final java.util.Locale mLocale = null;
    private final android.widget.SimpleMonthView.MonthViewTouchHelper mTouchHelper = null;
    private final java.text.NumberFormat mDayFormatter = null;
    private final int mDesiredMonthHeight = 0;
    private final int mDesiredDayOfWeekHeight = 0;
    private final int mDesiredDayHeight = 0;
    private final int mDesiredCellWidth = 0;
    private final int mDesiredDaySelectorRadius = 0;
    private java.lang.String mMonthYearLabel;
    private int mMonth;
    private int mYear;
    private int mMonthHeight;
    private int mDayOfWeekHeight;
    private int mDayHeight;
    private int mCellWidth;
    private int mDaySelectorRadius;
    private int mPaddedWidth;
    private int mPaddedHeight;
    private int mActivatedDay;
    private int mToday;
    private int mWeekStart;
    private int mDaysInMonth;
    private int mDayOfWeekStart;
    private int mEnabledDayStart;
    private int mEnabledDayEnd;
    private android.widget.SimpleMonthView.OnDayClickListener mOnDayClickListener;
    private android.content.res.ColorStateList mDayTextColor;
    private int mHighlightedDay;
    private int mPreviouslyHighlightedDay;
    private boolean mIsTouchHighlighted;
    public SimpleMonthView(android.content.Context p0) { super((android.content.Context)null); }
    public SimpleMonthView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SimpleMonthView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SimpleMonthView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void updateMonthYearLabel() {}
    private void updateDayOfWeekLabels() {}
    private android.content.res.ColorStateList applyTextAppearance(android.graphics.Paint p0, int p1) { return null; }
    public int getMonthHeight() { return 0; }
    public int getCellWidth() { return 0; }
    public void setMonthTextAppearance(int p0) {}
    public void setDayOfWeekTextAppearance(int p0) {}
    public void setDayTextAppearance(int p0) {}
    private void initPaints(android.content.res.Resources p0) {}
    void setMonthTextColor(android.content.res.ColorStateList p0) {}
    void setDayOfWeekTextColor(android.content.res.ColorStateList p0) {}
    void setDayTextColor(android.content.res.ColorStateList p0) {}
    void setDaySelectorColor(android.content.res.ColorStateList p0) {}
    void setDayHighlightColor(android.content.res.ColorStateList p0) {}
    public void setOnDayClickListener(android.widget.SimpleMonthView.OnDayClickListener p0) {}
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    private boolean moveOneDay(boolean p0) { return false; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    private int findClosestRow(android.graphics.Rect p0) { return 0; }
    private int findClosestColumn(android.graphics.Rect p0) { return 0; }
    public void getFocusedRect(android.graphics.Rect p0) {}
    protected void onFocusLost() {}
    private void ensureFocusedDay() {}
    private boolean isFirstDayOfWeek(int p0) { return false; }
    private boolean isLastDayOfWeek(int p0) { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    private void drawMonth(android.graphics.Canvas p0) {}
    public java.lang.String getMonthYearLabel() { return null; }
    private void drawDaysOfWeek(android.graphics.Canvas p0) {}
    private void drawDays(android.graphics.Canvas p0) {}
    private boolean isDayEnabled(int p0) { return false; }
    private boolean isValidDayOfMonth(int p0) { return false; }
    private static boolean isValidDayOfWeek(int p0) { return false; }
    private static boolean isValidMonth(int p0) { return false; }
    public void setSelectedDay(int p0) {}
    public void setFirstDayOfWeek(int p0) {}
    void setMonthParams(int p0, int p1, int p2, int p3, int p4, int p5) {}
    private static int getDaysInMonth(int p0, int p1) { return 0; }
    private boolean sameDay(int p0, android.icu.util.Calendar p1) { return false; }
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    private int findDayOffset() { return 0; }
    private int getDayAtLocation(int p0, int p1) { return 0; }
    public boolean getBoundsForDay(int p0, android.graphics.Rect p1) { return false; }
    private boolean onDayClicked(int p0) { return false; }
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }

    public static interface OnDayClickListener {
        public void onDayClick(android.widget.SimpleMonthView p0, android.icu.util.Calendar p1);
    }

    private class MonthViewTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        private static final java.lang.String DATE_FORMAT = "dd MMMM yyyy";
        private final android.graphics.Rect mTempRect = null;
        public MonthViewTouchHelper(android.widget.SimpleMonthView p0, android.view.View p1) { super(null); }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
        private java.lang.CharSequence getDayDescription(int p0) { return null; }
        private java.lang.CharSequence getDayText(int p0) { return null; }
    }
}

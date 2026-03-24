package android.widget;

class CalendarViewLegacyDelegate extends android.widget.CalendarView.AbstractCalendarViewDelegate {
    private static final boolean DEFAULT_SHOW_WEEK_NUMBER = true;
    private static final long MILLIS_IN_DAY = 86400000L;
    private static final int DAYS_PER_WEEK = 7;
    private static final long MILLIS_IN_WEEK = 604800000L;
    private static final int SCROLL_HYST_WEEKS = 2;
    private static final int GOTO_SCROLL_DURATION = 1000;
    private static final int ADJUSTMENT_SCROLL_DURATION = 500;
    private static final int SCROLL_CHANGE_DELAY = 40;
    private static final int DEFAULT_SHOWN_WEEK_COUNT = 6;
    private static final int DEFAULT_DATE_TEXT_SIZE = 14;
    private static final int UNSCALED_SELECTED_DATE_VERTICAL_BAR_WIDTH = 6;
    private static final int UNSCALED_WEEK_MIN_VISIBLE_HEIGHT = 12;
    private static final int UNSCALED_LIST_SCROLL_TOP_OFFSET = 2;
    private static final int UNSCALED_BOTTOM_BUFFER = 20;
    private static final int UNSCALED_WEEK_SEPARATOR_LINE_WIDTH = 1;
    private static final int DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID = -1;
    private final int mWeekSeparatorLineWidth = 0;
    private int mDateTextSize;
    private android.graphics.drawable.Drawable mSelectedDateVerticalBar;
    private final int mSelectedDateVerticalBarWidth = 0;
    private int mSelectedWeekBackgroundColor;
    private int mFocusedMonthDateColor;
    private int mUnfocusedMonthDateColor;
    private int mWeekSeparatorLineColor;
    private int mWeekNumberColor;
    private int mWeekDayTextAppearanceResId;
    private int mDateTextAppearanceResId;
    private int mListScrollTopOffset;
    private int mWeekMinVisibleHeight;
    private int mBottomBuffer;
    private int mShownWeekCount;
    private boolean mShowWeekNumber;
    private int mDaysPerWeek;
    private float mFriction;
    private float mVelocityScale;
    private android.widget.CalendarViewLegacyDelegate.WeeksAdapter mAdapter;
    private android.widget.ListView mListView;
    private android.widget.TextView mMonthName;
    private android.view.ViewGroup mDayNamesHeader;
    private java.lang.String[] mDayNamesShort;
    private java.lang.String[] mDayNamesLong;
    private int mFirstDayOfWeek;
    private int mCurrentMonthDisplayed;
    private long mPreviousScrollPosition;
    private boolean mIsScrollingUp;
    private int mPreviousScrollState;
    private int mCurrentScrollState;
    private android.widget.CalendarView.OnDateChangeListener mOnDateChangeListener;
    private android.widget.CalendarViewLegacyDelegate.ScrollStateRunnable mScrollStateChangedRunnable;
    CalendarViewLegacyDelegate(android.widget.CalendarView p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    public void setShownWeekCount(int p0) {}
    public int getShownWeekCount() { return 0; }
    public void setSelectedWeekBackgroundColor(int p0) {}
    public int getSelectedWeekBackgroundColor() { return 0; }
    public void setFocusedMonthDateColor(int p0) {}
    public int getFocusedMonthDateColor() { return 0; }
    public void setUnfocusedMonthDateColor(int p0) {}
    public int getUnfocusedMonthDateColor() { return 0; }
    public void setWeekNumberColor(int p0) {}
    public int getWeekNumberColor() { return 0; }
    public void setWeekSeparatorLineColor(int p0) {}
    public int getWeekSeparatorLineColor() { return 0; }
    public void setSelectedDateVerticalBar(int p0) {}
    public void setSelectedDateVerticalBar(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getSelectedDateVerticalBar() { return null; }
    public void setWeekDayTextAppearance(int p0) {}
    public int getWeekDayTextAppearance() { return 0; }
    public void setDateTextAppearance(int p0) {}
    public int getDateTextAppearance() { return 0; }
    public void setMinDate(long p0) {}
    public long getMinDate() { return 0L; }
    public void setMaxDate(long p0) {}
    public long getMaxDate() { return 0L; }
    public void setShowWeekNumber(boolean p0) {}
    public boolean getShowWeekNumber() { return false; }
    public void setFirstDayOfWeek(int p0) {}
    public int getFirstDayOfWeek() { return 0; }
    public void setDate(long p0) {}
    public void setDate(long p0, boolean p1, boolean p2) {}
    public long getDate() { return 0L; }
    public void setOnDateChangeListener(android.widget.CalendarView.OnDateChangeListener p0) {}
    public boolean getBoundsForDate(long p0, android.graphics.Rect p1) { return false; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void setCurrentLocale(java.util.Locale p0) {}
    private void updateDateTextSize() {}
    private void invalidateAllWeekViews() {}
    private static android.icu.util.Calendar getCalendarForLocale(android.icu.util.Calendar p0, java.util.Locale p1) { return null; }
    private static boolean isSameDate(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return false; }
    private void setUpAdapter() {}
    private void setUpHeader() {}
    private void setUpListView() {}
    private void goTo(android.icu.util.Calendar p0, boolean p1, boolean p2, boolean p3) {}
    private void onScrollStateChanged(android.widget.AbsListView p0, int p1) {}
    private void onScroll(android.widget.AbsListView p0, int p1, int p2, int p3) {}
    private void setMonthDisplayed(android.icu.util.Calendar p0) {}
    private int getWeeksSinceMinDate(android.icu.util.Calendar p0) { return 0; }

    private class ScrollStateRunnable implements java.lang.Runnable {
        private android.widget.AbsListView mView;
        private int mNewState;
        private ScrollStateRunnable(android.widget.CalendarViewLegacyDelegate p0) {}
        public void doScrollStateChange(android.widget.AbsListView p0, int p1) {}
        public void run() {}
    }

    private class WeekView extends android.view.View {
        private final android.graphics.Rect mTempRect = null;
        private final android.graphics.Paint mDrawPaint = null;
        private final android.graphics.Paint mMonthNumDrawPaint = null;
        private java.lang.String[] mDayNumbers;
        private boolean[] mFocusDay;
        private boolean mHasFocusedDay;
        private boolean mHasUnfocusedDay;
        private int mMonthOfFirstWeekDay;
        private int mLastWeekDayMonth;
        private int mWeek;
        private int mWidth;
        private int mHeight;
        private boolean mHasSelectedDay;
        private int mSelectedDay;
        private int mNumCells;
        private int mSelectedLeft;
        private int mSelectedRight;
        public WeekView(android.widget.CalendarViewLegacyDelegate p0, android.content.Context p1) { super((android.content.Context)null); }
        public void init(int p0, int p1, int p2) {}
        private void initializePaints() {}
        public int getMonthOfFirstWeekDay() { return 0; }
        public int getMonthOfLastWeekDay() { return 0; }
        public android.icu.util.Calendar getFirstDay() { return null; }
        public boolean getDayFromLocation(float p0, android.icu.util.Calendar p1) { return false; }
        public boolean getBoundsForDate(android.icu.util.Calendar p0, android.graphics.Rect p1) { return false; }
        protected void onDraw(android.graphics.Canvas p0) {}
        private void drawBackground(android.graphics.Canvas p0) {}
        private void drawWeekNumbersAndDates(android.graphics.Canvas p0) {}
        private void drawWeekSeparators(android.graphics.Canvas p0) {}
        private void drawSelectedDateVerticalBars(android.graphics.Canvas p0) {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
        private void updateSelectionPositions() {}
        protected void onMeasure(int p0, int p1) {}
    }

    private class WeeksAdapter extends android.widget.BaseAdapter implements android.view.View.OnTouchListener {
        private int mSelectedWeek;
        private android.view.GestureDetector mGestureDetector;
        private int mFocusedMonth;
        private int mTotalWeekCount;
        public WeeksAdapter(android.widget.CalendarViewLegacyDelegate p0, android.content.Context p1) { super(); }
        private void init() {}
        public void setSelectedDay(android.icu.util.Calendar p0) {}
        public android.icu.util.Calendar getSelectedDay() { return null; }
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public void setFocusMonth(int p0) {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
        private void onDateTapped(android.icu.util.Calendar p0) {}

        class CalendarGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
            CalendarGestureListener(android.widget.CalendarViewLegacyDelegate.WeeksAdapter p0) { super(); }
            public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
        }
    }
}

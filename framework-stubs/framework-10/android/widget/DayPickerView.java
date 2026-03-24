package android.widget;

class DayPickerView extends android.view.ViewGroup {
    private static final int DEFAULT_LAYOUT = 17367136;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int[] ATTRS_TEXT_COLOR = null;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private final com.android.internal.widget.ViewPager mViewPager = null;
    private final android.widget.ImageButton mPrevButton = null;
    private final android.widget.ImageButton mNextButton = null;
    private final android.widget.DayPickerPagerAdapter mAdapter = null;
    private android.widget.DayPickerView.OnDaySelectedListener mOnDaySelectedListener;
    private final com.android.internal.widget.ViewPager.OnPageChangeListener mOnPageChangedListener = null;
    private final android.view.View.OnClickListener mOnClickListener = null;
    public DayPickerView(android.content.Context p0) { super((android.content.Context)null); }
    public DayPickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public DayPickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public DayPickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void updateButtonVisibility(int p0) {}
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void setDayOfWeekTextAppearance(int p0) {}
    public int getDayOfWeekTextAppearance() { return 0; }
    public void setDayTextAppearance(int p0) {}
    public int getDayTextAppearance() { return 0; }
    public void setDate(long p0) {}
    public void setDate(long p0, boolean p1) {}
    private void setDate(long p0, boolean p1, boolean p2) {}
    public long getDate() { return 0L; }
    public boolean getBoundsForDate(long p0, android.graphics.Rect p1) { return false; }
    public void setFirstDayOfWeek(int p0) {}
    public int getFirstDayOfWeek() { return 0; }
    public void setMinDate(long p0) {}
    public long getMinDate() { return 0L; }
    public void setMaxDate(long p0) {}
    public long getMaxDate() { return 0L; }
    public void onRangeChanged() {}
    public void setOnDaySelectedListener(android.widget.DayPickerView.OnDaySelectedListener p0) {}
    private int getDiffMonths(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return 0; }
    private int getPositionFromDay(long p0) { return 0; }
    private android.icu.util.Calendar getTempCalendarForTime(long p0) { return null; }
    public int getMostVisiblePosition() { return 0; }
    public void setPosition(int p0) {}

    public static interface OnDaySelectedListener {
        public void onDaySelected(android.widget.DayPickerView p0, android.icu.util.Calendar p1);
    }
}

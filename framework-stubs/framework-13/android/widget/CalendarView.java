package android.widget;

public class CalendarView extends android.widget.FrameLayout {
    public CalendarView(android.content.Context p0) { super((android.content.Context)null); }
    public CalendarView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CalendarView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CalendarView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @java.lang.Deprecated
    public void setShownWeekCount(int p0) {}
    @java.lang.Deprecated
    public int getShownWeekCount() { return 0; }
    @java.lang.Deprecated
    public void setSelectedWeekBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public int getSelectedWeekBackgroundColor() { return 0; }
    @java.lang.Deprecated
    public void setFocusedMonthDateColor(int p0) {}
    @java.lang.Deprecated
    public int getFocusedMonthDateColor() { return 0; }
    @java.lang.Deprecated
    public void setUnfocusedMonthDateColor(int p0) {}
    @java.lang.Deprecated
    public int getUnfocusedMonthDateColor() { return 0; }
    @java.lang.Deprecated
    public void setWeekNumberColor(int p0) {}
    @java.lang.Deprecated
    public int getWeekNumberColor() { return 0; }
    @java.lang.Deprecated
    public void setWeekSeparatorLineColor(int p0) {}
    @java.lang.Deprecated
    public int getWeekSeparatorLineColor() { return 0; }
    @java.lang.Deprecated
    public void setSelectedDateVerticalBar(int p0) {}
    @java.lang.Deprecated
    public void setSelectedDateVerticalBar(android.graphics.drawable.Drawable p0) {}
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getSelectedDateVerticalBar() { return null; }
    public void setWeekDayTextAppearance(int p0) {}
    public int getWeekDayTextAppearance() { return 0; }
    public void setDateTextAppearance(int p0) {}
    public int getDateTextAppearance() { return 0; }
    public long getMinDate() { return 0L; }
    public void setMinDate(long p0) {}
    public long getMaxDate() { return 0L; }
    public void setMaxDate(long p0) {}
    @java.lang.Deprecated
    public void setShowWeekNumber(boolean p0) {}
    @java.lang.Deprecated
    public boolean getShowWeekNumber() { return false; }
    public int getFirstDayOfWeek() { return 0; }
    public void setFirstDayOfWeek(int p0) {}
    public void setOnDateChangeListener(android.widget.CalendarView.OnDateChangeListener p0) {}
    public long getDate() { return 0L; }
    public void setDate(long p0) {}
    public void setDate(long p0, boolean p1, boolean p2) {}
    public boolean getBoundsForDate(long p0, android.graphics.Rect p1) { return false; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public static boolean parseDate(java.lang.String p0, android.icu.util.Calendar p1) { return false; }

    static abstract class AbstractCalendarViewDelegate implements android.widget.CalendarView.CalendarViewDelegate {
        protected static final java.lang.String DEFAULT_MIN_DATE = "01/01/1900";
        protected static final java.lang.String DEFAULT_MAX_DATE = "01/01/2100";
        protected android.widget.CalendarView mDelegator;
        protected android.content.Context mContext;
        protected java.util.Locale mCurrentLocale;
        AbstractCalendarViewDelegate(android.widget.CalendarView p0, android.content.Context p1) {}
        protected void setCurrentLocale(java.util.Locale p0) {}
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
        public void setShowWeekNumber(boolean p0) {}
        public boolean getShowWeekNumber() { return false; }
        public void onConfigurationChanged(android.content.res.Configuration p0) {}
    }

    private static interface CalendarViewDelegate {
        public void setShownWeekCount(int p0);
        public int getShownWeekCount();
        public void setSelectedWeekBackgroundColor(int p0);
        public int getSelectedWeekBackgroundColor();
        public void setFocusedMonthDateColor(int p0);
        public int getFocusedMonthDateColor();
        public void setUnfocusedMonthDateColor(int p0);
        public int getUnfocusedMonthDateColor();
        public void setWeekNumberColor(int p0);
        public int getWeekNumberColor();
        public void setWeekSeparatorLineColor(int p0);
        public int getWeekSeparatorLineColor();
        public void setSelectedDateVerticalBar(int p0);
        public void setSelectedDateVerticalBar(android.graphics.drawable.Drawable p0);
        public android.graphics.drawable.Drawable getSelectedDateVerticalBar();
        public void setWeekDayTextAppearance(int p0);
        public int getWeekDayTextAppearance();
        public void setDateTextAppearance(int p0);
        public int getDateTextAppearance();
        public void setMinDate(long p0);
        public long getMinDate();
        public void setMaxDate(long p0);
        public long getMaxDate();
        public void setShowWeekNumber(boolean p0);
        public boolean getShowWeekNumber();
        public void setFirstDayOfWeek(int p0);
        public int getFirstDayOfWeek();
        public void setDate(long p0);
        public void setDate(long p0, boolean p1, boolean p2);
        public long getDate();
        public boolean getBoundsForDate(long p0, android.graphics.Rect p1);
        public void setOnDateChangeListener(android.widget.CalendarView.OnDateChangeListener p0);
        public void onConfigurationChanged(android.content.res.Configuration p0);
    }

    public static interface OnDateChangeListener {
        public void onSelectedDayChange(android.widget.CalendarView p0, int p1, int p2, int p3);
    }
}

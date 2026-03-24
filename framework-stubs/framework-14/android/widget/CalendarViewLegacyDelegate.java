package android.widget;

class CalendarViewLegacyDelegate extends android.widget.CalendarView.AbstractCalendarViewDelegate {
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

    private class ScrollStateRunnable implements java.lang.Runnable {
        public void doScrollStateChange(android.widget.AbsListView p0, int p1) {}
        public void run() {}
    }

    private class WeeksAdapter extends android.widget.BaseAdapter implements android.view.View.OnTouchListener {
        public WeeksAdapter(android.widget.CalendarViewLegacyDelegate p0, android.content.Context p1) { super(); }
        public void setSelectedDay(android.icu.util.Calendar p0) {}
        public android.icu.util.Calendar getSelectedDay() { return null; }
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public void setFocusMonth(int p0) {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }

        class CalendarGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
            CalendarGestureListener(android.widget.CalendarViewLegacyDelegate.WeeksAdapter p0) { super(); }
            public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
        }
    }

    private class WeekView extends android.view.View {
        public WeekView(android.widget.CalendarViewLegacyDelegate p0, android.content.Context p1) { super((android.content.Context)null); }
        public void init(int p0, int p1, int p2) {}
        public int getMonthOfFirstWeekDay() { return 0; }
        public int getMonthOfLastWeekDay() { return 0; }
        public android.icu.util.Calendar getFirstDay() { return null; }
        public boolean getDayFromLocation(float p0, android.icu.util.Calendar p1) { return false; }
        public boolean getBoundsForDate(android.icu.util.Calendar p0, android.graphics.Rect p1) { return false; }
        protected void onDraw(android.graphics.Canvas p0) {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
        protected void onMeasure(int p0, int p1) {}
    }
}

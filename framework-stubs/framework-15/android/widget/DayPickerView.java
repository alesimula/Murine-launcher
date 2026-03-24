package android.widget;

class DayPickerView extends android.view.ViewGroup {
    public DayPickerView(android.content.Context p0) { super((android.content.Context)null); }
    public DayPickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public DayPickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public DayPickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void setDayOfWeekTextAppearance(int p0) {}
    public int getDayOfWeekTextAppearance() { return 0; }
    public void setDayTextAppearance(int p0) {}
    public int getDayTextAppearance() { return 0; }
    public void setDate(long p0) {}
    public void setDate(long p0, boolean p1) {}
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
    public int getMostVisiblePosition() { return 0; }
    public void setPosition(int p0) {}

    public static interface OnDaySelectedListener {
        public void onDaySelected(android.widget.DayPickerView p0, android.icu.util.Calendar p1);
    }
}

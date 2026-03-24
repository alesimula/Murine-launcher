package android.widget;

class DayPickerPagerAdapter extends com.android.internal.widget.PagerAdapter {
    public DayPickerPagerAdapter(android.content.Context p0, int p1, int p2) { super(); }
    public void setRange(android.icu.util.Calendar p0, android.icu.util.Calendar p1) {}
    public void setFirstDayOfWeek(int p0) {}
    public int getFirstDayOfWeek() { return 0; }
    public boolean getBoundsForDate(android.icu.util.Calendar p0, android.graphics.Rect p1) { return false; }
    public void setSelectedDay(android.icu.util.Calendar p0) {}
    public void setOnDaySelectedListener(android.widget.DayPickerPagerAdapter.OnDaySelectedListener p0) {}
    void setCalendarTextColor(android.content.res.ColorStateList p0) {}
    void setDaySelectorColor(android.content.res.ColorStateList p0) {}
    void setMonthTextAppearance(int p0) {}
    void setDayOfWeekTextAppearance(int p0) {}
    int getDayOfWeekTextAppearance() { return 0; }
    void setDayTextAppearance(int p0) {}
    int getDayTextAppearance() { return 0; }
    public int getCount() { return 0; }
    public boolean isViewFromObject(android.view.View p0, java.lang.Object p1) { return false; }
    public java.lang.Object instantiateItem(android.view.ViewGroup p0, int p1) { return null; }
    public void destroyItem(android.view.ViewGroup p0, int p1, java.lang.Object p2) {}
    public int getItemPosition(java.lang.Object p0) { return 0; }
    public java.lang.CharSequence getPageTitle(int p0) { return null; }
    android.widget.SimpleMonthView getView(java.lang.Object p0) { return null; }

    public static interface OnDaySelectedListener {
        public void onDaySelected(android.widget.DayPickerPagerAdapter p0, android.icu.util.Calendar p1);
    }

    private static class ViewHolder {
        public final int position = 0;
        public final android.view.View container = null;
        public final android.widget.SimpleMonthView calendar = null;
        public ViewHolder(int p0, android.view.View p1, android.widget.SimpleMonthView p2) {}
    }
}

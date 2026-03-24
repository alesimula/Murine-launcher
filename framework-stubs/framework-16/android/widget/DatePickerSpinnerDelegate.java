package android.widget;

class DatePickerSpinnerDelegate extends android.widget.DatePicker.AbstractDatePickerDelegate {
    DatePickerSpinnerDelegate(android.widget.DatePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    public void init(int p0, int p1, int p2, android.widget.DatePicker.OnDateChangedListener p3) {}
    public void updateDate(int p0, int p1, int p2) {}
    public int getYear() { return 0; }
    public int getMonth() { return 0; }
    public int getDayOfMonth() { return 0; }
    public void setFirstDayOfWeek(int p0) {}
    public int getFirstDayOfWeek() { return 0; }
    public void setMinDate(long p0) {}
    public android.icu.util.Calendar getMinDate() { return null; }
    public void setMaxDate(long p0) {}
    public android.icu.util.Calendar getMaxDate() { return null; }
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public android.widget.CalendarView getCalendarView() { return null; }
    public void setCalendarViewShown(boolean p0) {}
    public boolean getCalendarViewShown() { return false; }
    public void setSpinnersShown(boolean p0) {}
    public boolean getSpinnersShown() { return false; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0) { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    protected void setCurrentLocale(java.util.Locale p0) {}
}

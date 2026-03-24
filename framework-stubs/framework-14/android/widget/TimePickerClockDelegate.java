package android.widget;

class TimePickerClockDelegate extends android.widget.TimePicker.AbstractTimePickerDelegate {
    public TimePickerClockDelegate(android.widget.TimePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    public boolean validateInput() { return false; }
    static final java.lang.CharSequence obtainVerbatim(java.lang.String p0) { return null; }
    public void setDate(int p0, int p1) {}
    public void setHour(int p0) {}
    public int getHour() { return 0; }
    public void setMinute(int p0) {}
    public int getMinute() { return 0; }
    public void setIs24Hour(boolean p0) {}
    public boolean is24Hour() { return false; }
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public int getBaseline() { return 0; }
    public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0) { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public android.view.View getHourView() { return null; }
    public android.view.View getMinuteView() { return null; }
    public android.view.View getAmView() { return null; }
    public android.view.View getPmView() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ChangeSource {
    }

    private static class ClickActionDelegate extends android.view.View.AccessibilityDelegate {
        public ClickActionDelegate(android.content.Context p0, int p1) { super(); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    }

    private static class NearestTouchDelegate implements android.view.View.OnTouchListener {
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    }
}

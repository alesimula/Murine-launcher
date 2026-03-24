package android.widget;

class TimePickerSpinnerDelegate extends android.widget.TimePicker.AbstractTimePickerDelegate {
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int HOURS_IN_HALF_DAY = 12;
    private final android.widget.NumberPicker mHourSpinner = null;
    private final android.widget.NumberPicker mMinuteSpinner = null;
    private final android.widget.NumberPicker mAmPmSpinner = null;
    private final android.widget.EditText mHourSpinnerInput = null;
    private final android.widget.EditText mMinuteSpinnerInput = null;
    private final android.widget.EditText mAmPmSpinnerInput = null;
    private final android.widget.TextView mDivider = null;
    private final android.widget.Button mAmPmButton = null;
    private final java.lang.String[] mAmPmStrings = null;
    private final java.util.Calendar mTempCalendar = null;
    private boolean mIsEnabled;
    private boolean mHourWithTwoDigit;
    private char mHourFormat;
    private boolean mIs24HourView;
    private boolean mIsAm;
    public TimePickerSpinnerDelegate(android.widget.TimePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    public boolean validateInput() { return false; }
    private void getHourFormatData() {}
    private boolean isAmPmAtStart() { return false; }
    private void setDividerText() {}
    public void setDate(int p0, int p1) {}
    public void setHour(int p0) {}
    private void setCurrentHour(int p0, boolean p1) {}
    public int getHour() { return 0; }
    public void setMinute(int p0) {}
    private void setCurrentMinute(int p0, boolean p1) {}
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
    private void updateInputState() {}
    private void updateAmPmControl() {}
    private void onTimeChanged() {}
    private void updateHourControl() {}
    private void updateMinuteControl() {}
    private void setContentDescriptions() {}
    private void trySetContentDescription(android.view.View p0, int p1, int p2) {}
}

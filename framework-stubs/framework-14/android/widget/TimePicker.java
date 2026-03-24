package android.widget;

public class TimePicker extends android.widget.FrameLayout {
    public static final int MODE_SPINNER = 1;
    public static final int MODE_CLOCK = 2;
    public TimePicker(android.content.Context p0) { super((android.content.Context)null); }
    public TimePicker(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TimePicker(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TimePicker(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getMode() { return 0; }
    public void setHour(int p0) {}
    public int getHour() { return 0; }
    public void setMinute(int p0) {}
    public int getMinute() { return 0; }
    @java.lang.Deprecated
    public void setCurrentHour(java.lang.Integer p0) {}
    @java.lang.Deprecated
    public java.lang.Integer getCurrentHour() { return null; }
    @java.lang.Deprecated
    public void setCurrentMinute(java.lang.Integer p0) {}
    @java.lang.Deprecated
    public java.lang.Integer getCurrentMinute() { return null; }
    public void setIs24HourView(java.lang.Boolean p0) {}
    public boolean is24HourView() { return false; }
    public void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener p0) {}
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public int getBaseline() { return 0; }
    public boolean validateInput() { return false; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public android.view.View getHourView() { return null; }
    public android.view.View getMinuteView() { return null; }
    public android.view.View getAmView() { return null; }
    public android.view.View getPmView() { return null; }
    static java.lang.String[] getAmPmStrings(android.content.Context p0) { return null; }
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }

    public static interface OnTimeChangedListener {
        public void onTimeChanged(android.widget.TimePicker p0, int p1, int p2);
    }

    static abstract class AbstractTimePickerDelegate implements android.widget.TimePicker.TimePickerDelegate {
        protected final android.widget.TimePicker mDelegator = null;
        protected final android.content.Context mContext = null;
        protected final java.util.Locale mLocale = null;
        protected android.widget.TimePicker.OnTimeChangedListener mOnTimeChangedListener;
        protected android.widget.TimePicker.OnTimeChangedListener mAutoFillChangeListener;
        public AbstractTimePickerDelegate(android.widget.TimePicker p0, android.content.Context p1) {}
        public void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener p0) {}
        public void setAutoFillChangeListener(android.widget.TimePicker.OnTimeChangedListener p0) {}
        public final void autofill(android.view.autofill.AutofillValue p0) {}
        public final android.view.autofill.AutofillValue getAutofillValue() { return null; }
        protected void resetAutofilledValue() {}

        protected static class SavedState extends android.view.View.BaseSavedState {
            public static final android.os.Parcelable.Creator<android.widget.TimePicker.AbstractTimePickerDelegate.SavedState> CREATOR = null;
            public SavedState(android.os.Parcelable p0, int p1, int p2, boolean p3) { super((android.os.Parcel)null); }
            public SavedState(android.os.Parcelable p0, int p1, int p2, boolean p3, int p4) { super((android.os.Parcel)null); }
            public int getHour() { return 0; }
            public int getMinute() { return 0; }
            public boolean is24HourMode() { return false; }
            public int getCurrentItemShowing() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    static interface TimePickerDelegate {
        public void setHour(int p0);
        public int getHour();
        public void setMinute(int p0);
        public int getMinute();
        public void setDate(int p0, int p1);
        public void autofill(android.view.autofill.AutofillValue p0);
        public android.view.autofill.AutofillValue getAutofillValue();
        public void setIs24Hour(boolean p0);
        public boolean is24Hour();
        public boolean validateInput();
        public void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener p0);
        public void setAutoFillChangeListener(android.widget.TimePicker.OnTimeChangedListener p0);
        public void setEnabled(boolean p0);
        public boolean isEnabled();
        public int getBaseline();
        public android.os.Parcelable onSaveInstanceState(android.os.Parcelable p0);
        public void onRestoreInstanceState(android.os.Parcelable p0);
        public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public android.view.View getHourView();
        public android.view.View getMinuteView();
        public android.view.View getAmView();
        public android.view.View getPmView();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimePickerMode {
    }
}

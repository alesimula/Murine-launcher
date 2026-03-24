package android.widget;

class TimePickerClockDelegate extends android.widget.TimePicker.AbstractTimePickerDelegate {
    private static final long DELAY_COMMIT_MILLIS = 2000L;
    private static final int FROM_EXTERNAL_API = 0;
    private static final int FROM_RADIAL_PICKER = 1;
    private static final int FROM_INPUT_PICKER = 2;
    private static final int HOUR_INDEX = 0;
    private static final int MINUTE_INDEX = 1;
    private static final int[] ATTRS_TEXT_COLOR = null;
    private static final int[] ATTRS_DISABLED_ALPHA = null;
    private static final int AM = 0;
    private static final int PM = 1;
    private static final int HOURS_IN_HALF_DAY = 12;
    private final com.android.internal.widget.NumericTextView mHourView = null;
    private final com.android.internal.widget.NumericTextView mMinuteView = null;
    private final android.view.View mAmPmLayout = null;
    private final android.widget.RadioButton mAmLabel = null;
    private final android.widget.RadioButton mPmLabel = null;
    private final android.widget.RadialTimePickerView mRadialTimePickerView = null;
    private final android.widget.TextView mSeparatorView = null;
    private boolean mRadialPickerModeEnabled;
    private final android.widget.ImageButton mRadialTimePickerModeButton = null;
    private final java.lang.String mRadialTimePickerModeEnabledDescription = null;
    private final java.lang.String mTextInputPickerModeEnabledDescription = null;
    private final android.view.View mRadialTimePickerHeader = null;
    private final android.view.View mTextInputPickerHeader = null;
    private final android.widget.TextInputTimePickerView mTextInputPickerView = null;
    private final java.util.Calendar mTempCalendar = null;
    private final java.lang.String mSelectHours = null;
    private final java.lang.String mSelectMinutes = null;
    private boolean mIsEnabled;
    private boolean mAllowAutoAdvance;
    private int mCurrentHour;
    private int mCurrentMinute;
    private boolean mIs24Hour;
    private boolean mIsAmPmAtLeft;
    private boolean mIsAmPmAtTop;
    private boolean mHourFormatShowLeadingZero;
    private boolean mHourFormatStartsAtZero;
    private java.lang.CharSequence mLastAnnouncedText;
    private boolean mLastAnnouncedIsHour;
    private final android.widget.RadialTimePickerView.OnValueSelectedListener mOnValueSelectedListener = null;
    private final android.widget.TextInputTimePickerView.OnValueTypedListener mOnValueTypedListener = null;
    private final com.android.internal.widget.NumericTextView.OnValueChangedListener mDigitEnteredListener = null;
    private final java.lang.Runnable mCommitHour = null;
    private final java.lang.Runnable mCommitMinute = null;
    private final android.view.View.OnFocusChangeListener mFocusListener = null;
    private final android.view.View.OnClickListener mClickListener = null;
    public TimePickerClockDelegate(android.widget.TimePicker p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super(null, null); }
    private void toggleRadialPickerMode() {}
    public boolean validateInput() { return false; }
    private static void ensureMinimumTextWidth(android.widget.TextView p0) {}
    private void updateHourFormat() {}
    static final java.lang.CharSequence obtainVerbatim(java.lang.String p0) { return null; }
    private android.content.res.ColorStateList applyLegacyColorFixes(android.content.res.ColorStateList p0) { return null; }
    private int multiplyAlphaComponent(int p0, float p1) { return 0; }
    private void initialize(int p0, int p1, boolean p2, int p3) {}
    private void updateUI(int p0) {}
    private void updateTextInputPicker() {}
    private void updateRadialPicker(int p0) {}
    private void updateHeaderAmPm() {}
    private void setAmPmStart(boolean p0) {}
    public void setDate(int p0, int p1) {}
    public void setHour(int p0) {}
    private void setHourInternal(int p0, int p1, boolean p2, boolean p3) {}
    public int getHour() { return 0; }
    public void setMinute(int p0) {}
    private void setMinuteInternal(int p0, int p1, boolean p2) {}
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
    private int getCurrentItemShowing() { return 0; }
    private void onTimeChanged() {}
    private void tryVibrate() {}
    private void updateAmPmLabelStates(int p0) {}
    private int getLocalizedHour(int p0) { return 0; }
    private void updateHeaderHour(int p0, boolean p1) {}
    private void updateHeaderMinute(int p0, boolean p1) {}
    private void updateHeaderSeparator() {}
    private static java.lang.String getHourMinSeparatorFromPattern(java.lang.String p0) { return null; }
    private static int lastIndexOfAny(java.lang.String p0, char[] p1) { return 0; }
    private void tryAnnounceForAccessibility(java.lang.CharSequence p0, boolean p1) {}
    private void setCurrentItemShowing(int p0, boolean p1, boolean p2) {}
    private void setAmOrPm(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ChangeSource {
    }

    private static class ClickActionDelegate extends android.view.View.AccessibilityDelegate {
        private final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction mClickAction = null;
        public ClickActionDelegate(android.content.Context p0, int p1) { super(); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    }

    private static class NearestTouchDelegate implements android.view.View.OnTouchListener {
        private android.view.View mInitialTouchTarget;
        private NearestTouchDelegate() {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
        private android.view.View findNearestChild(android.view.ViewGroup p0, int p1, int p2) { return null; }
    }
}

package android.widget;

public class TextInputTimePickerView extends android.widget.RelativeLayout {
    public static final int HOURS = 0;
    public static final int MINUTES = 1;
    public static final int AMPM = 2;
    private static final int AM = 0;
    private static final int PM = 1;
    private final android.widget.EditText mHourEditText = null;
    private final android.widget.EditText mMinuteEditText = null;
    private final android.widget.TextView mInputSeparatorView = null;
    private final android.widget.Spinner mAmPmSpinner = null;
    private final android.widget.TextView mErrorLabel = null;
    private final android.widget.TextView mHourLabel = null;
    private final android.widget.TextView mMinuteLabel = null;
    private boolean mIs24Hour;
    private boolean mHourFormatStartsAtZero;
    private android.widget.TextInputTimePickerView.OnValueTypedListener mListener;
    private boolean mErrorShowing;
    private boolean mTimeSet;
    public TextInputTimePickerView(android.content.Context p0) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void setListener(android.widget.TextInputTimePickerView.OnValueTypedListener p0) {}
    void setHourFormat(int p0) {}
    boolean validateInput() { return false; }
    void updateSeparator(java.lang.String p0) {}
    private void setError(boolean p0) {}
    private void setTimeSet(boolean p0) {}
    private boolean isTimeSet() { return false; }
    void updateTextInputValues(int p0, int p1, int p2, boolean p3, boolean p4) {}
    private boolean parseAndSetHourInternal(java.lang.String p0) { return false; }
    private boolean parseAndSetMinuteInternal(java.lang.String p0) { return false; }
    private boolean isValidLocalizedHour(int p0) { return false; }
    private int getHourOfDayFromLocalizedHour(int p0) { return 0; }

    static interface OnValueTypedListener {
        public void onValueChanged(int p0, int p1);
    }
}

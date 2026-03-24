package android.widget;

public class TextInputTimePickerView extends android.widget.RelativeLayout {
    public static final int HOURS = 0;
    public static final int MINUTES = 1;
    public static final int AMPM = 2;
    public TextInputTimePickerView(android.content.Context p0) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextInputTimePickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void setListener(android.widget.TextInputTimePickerView.OnValueTypedListener p0) {}
    void setHourFormat(int p0) {}
    boolean validateInput() { return false; }
    void updateSeparator(java.lang.String p0) {}
    void updateTextInputValues(int p0, int p1, int p2, boolean p3, boolean p4) {}

    static interface OnValueTypedListener {
        public void onValueChanged(int p0, int p1);
    }
}

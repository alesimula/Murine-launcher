package android.widget;

@java.lang.Deprecated
public class DigitalClock extends android.widget.TextView {
    java.util.Calendar mCalendar;
    java.lang.String mFormat;
    public DigitalClock(android.content.Context p0) { super((android.content.Context)null); }
    public DigitalClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    private class FormatChangeObserver extends android.database.ContentObserver {
        public FormatChangeObserver(android.widget.DigitalClock p0) { super((android.os.Handler)null); }
        public void onChange(boolean p0) {}
    }
}

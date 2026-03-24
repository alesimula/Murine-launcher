package android.widget;

@java.lang.Deprecated
public class DigitalClock extends android.widget.TextView {
    java.util.Calendar mCalendar;
    private android.widget.DigitalClock.FormatChangeObserver mFormatChangeObserver;
    private java.lang.Runnable mTicker;
    private android.os.Handler mHandler;
    private boolean mTickerStopped;
    java.lang.String mFormat;
    public DigitalClock(android.content.Context p0) { super((android.content.Context)null); }
    public DigitalClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void initClock() {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    private void setFormat() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    private class FormatChangeObserver extends android.database.ContentObserver {
        public FormatChangeObserver(android.widget.DigitalClock p0) { super(null); }
        public void onChange(boolean p0) {}
    }
}

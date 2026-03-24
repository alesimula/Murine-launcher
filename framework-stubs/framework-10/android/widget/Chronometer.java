package android.widget;

@android.widget.RemoteViews.RemoteView
public class Chronometer extends android.widget.TextView {
    private static final java.lang.String TAG = "Chronometer";
    private long mBase;
    private long mNow;
    private boolean mVisible;
    private boolean mStarted;
    private boolean mRunning;
    private boolean mLogged;
    private java.lang.String mFormat;
    private java.util.Formatter mFormatter;
    private java.util.Locale mFormatterLocale;
    private java.lang.Object[] mFormatterArgs;
    private java.lang.StringBuilder mFormatBuilder;
    private android.widget.Chronometer.OnChronometerTickListener mOnChronometerTickListener;
    private java.lang.StringBuilder mRecycle;
    private boolean mCountDown;
    private final java.lang.Runnable mTickRunnable = null;
    private static final int MIN_IN_SEC = 60;
    private static final int HOUR_IN_SEC = 3600;
    public Chronometer(android.content.Context p0) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void init() {}
    @android.view.RemotableViewMethod
    public void setCountDown(boolean p0) {}
    public boolean isCountDown() { return false; }
    public boolean isTheFinalCountDown() { return false; }
    @android.view.RemotableViewMethod
    public void setBase(long p0) {}
    public long getBase() { return 0L; }
    @android.view.RemotableViewMethod
    public void setFormat(java.lang.String p0) {}
    public java.lang.String getFormat() { return null; }
    public void setOnChronometerTickListener(android.widget.Chronometer.OnChronometerTickListener p0) {}
    public android.widget.Chronometer.OnChronometerTickListener getOnChronometerTickListener() { return null; }
    public void start() {}
    public void stop() {}
    @android.view.RemotableViewMethod
    public void setStarted(boolean p0) {}
    protected void onDetachedFromWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    private synchronized void updateText(long p0) {}
    private void updateRunning() {}
    void dispatchChronometerTick() {}
    private static java.lang.String formatDuration(long p0) { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    public static interface OnChronometerTickListener {
        public void onChronometerTick(android.widget.Chronometer p0);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.Chronometer> {
        private boolean mPropertiesMapped;
        private int mCountDownId;
        private int mFormatId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.Chronometer p0, android.view.inspector.PropertyReader p1) {}
    }
}

package android.widget;

@android.widget.RemoteViews.RemoteView
public class Chronometer extends android.widget.TextView {
    public Chronometer(android.content.Context p0) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
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
    void dispatchChronometerTick() {}
    public java.lang.CharSequence getContentDescription() { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    public static interface OnChronometerTickListener {
        public void onChronometerTick(android.widget.Chronometer p0);
    }
}

package android.widget;

@android.widget.RemoteViews.RemoteView
@java.lang.Deprecated
public class AnalogClock extends android.view.View {
    private android.text.format.Time mCalendar;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mHourHand;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mMinuteHand;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mDial;
    private int mDialWidth;
    private int mDialHeight;
    private boolean mAttached;
    private float mMinutes;
    private float mHour;
    private boolean mChanged;
    private final android.content.BroadcastReceiver mIntentReceiver = null;
    public AnalogClock(android.content.Context p0) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    private void onTimeChanged() {}
    private void updateContentDescription(android.text.format.Time p0) {}
}

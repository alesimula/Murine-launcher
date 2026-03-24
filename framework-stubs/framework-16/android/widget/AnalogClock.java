package android.widget;

@android.widget.RemoteViews.RemoteView
@java.lang.Deprecated
public class AnalogClock extends android.view.View {
    public AnalogClock(android.content.Context p0) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod
    public void setDial(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setDialTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getDialTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setDialTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.BlendMode getDialTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setHourHand(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setHourHandTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getHourHandTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setHourHandTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.BlendMode getHourHandTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setMinuteHand(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setMinuteHandTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getMinuteHandTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setMinuteHandTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.BlendMode getMinuteHandTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setSecondHand(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setSecondHandTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getSecondHandTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setSecondHandTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.BlendMode getSecondHandTintBlendMode() { return null; }
    @android.annotation.Nullable
    public java.lang.String getTimeZone() { return null; }
    @android.view.RemotableViewMethod
    public void setTimeZone(java.lang.String p0) {}
    public void onVisibilityAggregated(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void setClockEventDelegate(android.widget.TextClock.ClockEventDelegate p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected java.time.Instant now() { return null; }
    protected void onTimeChanged() {}

    private final class TintInfo {
        boolean mHasTintList;
        @android.annotation.Nullable
        android.content.res.ColorStateList mTintList;
        boolean mHasTintBlendMode;
        @android.annotation.Nullable
        android.graphics.BlendMode mTintBlendMode;
        @android.annotation.Nullable
        android.graphics.drawable.Drawable apply(android.graphics.drawable.Drawable p0) { return null; }
    }
}

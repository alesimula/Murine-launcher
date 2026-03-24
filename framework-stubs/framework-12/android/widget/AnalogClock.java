package android.widget;

@android.widget.RemoteViews.RemoteView
@java.lang.Deprecated
public class AnalogClock extends android.view.View {
    private static final java.lang.String LOG_TAG = "AnalogClock";
    private final int mSecondsHandFps = 0;
    private java.time.Clock mClock;
    private java.time.ZoneId mTimeZone;
    private android.graphics.drawable.Drawable mHourHand;
    private final android.widget.AnalogClock.TintInfo mHourHandTintInfo = null;
    private android.graphics.drawable.Drawable mMinuteHand;
    private final android.widget.AnalogClock.TintInfo mMinuteHandTintInfo = null;
    private android.graphics.drawable.Drawable mSecondHand;
    private final android.widget.AnalogClock.TintInfo mSecondHandTintInfo = null;
    private android.graphics.drawable.Drawable mDial;
    private final android.widget.AnalogClock.TintInfo mDialTintInfo = null;
    private int mDialWidth;
    private int mDialHeight;
    private boolean mVisible;
    private float mSeconds;
    private float mMinutes;
    private float mHour;
    private boolean mChanged;
    private final android.content.BroadcastReceiver mIntentReceiver = null;
    private boolean mReceiverAttached;
    private final java.lang.Runnable mTick = null;
    public AnalogClock(android.content.Context p0) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AnalogClock(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod
    public void setDial(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setDialTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getDialTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setDialTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.BlendMode getDialTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setHourHand(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setHourHandTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getHourHandTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setHourHandTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.BlendMode getHourHandTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setMinuteHand(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setMinuteHandTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getMinuteHandTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setMinuteHandTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.BlendMode getMinuteHandTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setSecondHand(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public void setSecondHandTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getSecondHandTintList() { return null; }
    @android.view.RemotableViewMethod
    public void setSecondHandTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.BlendMode getSecondHandTintBlendMode() { return null; }
    public java.lang.String getTimeZone() { return null; }
    @android.view.RemotableViewMethod
    public void setTimeZone(java.lang.String p0) {}
    public void onVisibilityAggregated(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    private void onVisible() {}
    private void onInvisible() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected java.time.Instant now() { return null; }
    protected void onTimeChanged() {}
    private void onTimeChanged(java.time.LocalTime p0, long p1) {}
    private void createClock() {}
    private void updateContentDescription(long p0) {}
    private static java.time.ZoneId toZoneId(java.lang.String p0) { return null; }

    private final class TintInfo {
        boolean mHasTintList;
        android.content.res.ColorStateList mTintList;
        boolean mHasTintBlendMode;
        android.graphics.BlendMode mTintBlendMode;
        private TintInfo(android.widget.AnalogClock p0) {}
        android.graphics.drawable.Drawable apply(android.graphics.drawable.Drawable p0) { return null; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.AnalogClock> {
        private boolean mPropertiesMapped;
        private int mDialTintBlendModeId;
        private int mDialTintListId;
        private int mHourHandTintBlendModeId;
        private int mHourHandTintListId;
        private int mMinuteHandTintBlendModeId;
        private int mMinuteHandTintListId;
        private int mSecondHandTintBlendModeId;
        private int mSecondHandTintListId;
        private int mTimeZoneId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.AnalogClock p0, android.view.inspector.PropertyReader p1) {}
    }
}

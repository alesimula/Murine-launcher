package android.widget;

public abstract class AbsSeekBar extends android.widget.ProgressBar {
    float mTouchProgressOffset;
    boolean mIsUserSeekable;
    public AbsSeekBar(android.content.Context p0) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setThumb(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getThumb() { return null; }
    public void setThumbTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getThumbTintList() { return null; }
    public void setThumbTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setThumbTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.PorterDuff.Mode getThumbTintMode() { return null; }
    @android.annotation.Nullable
    public android.graphics.BlendMode getThumbTintBlendMode() { return null; }
    public int getThumbOffset() { return 0; }
    public void setThumbOffset(int p0) {}
    public void setSplitTrack(boolean p0) {}
    public boolean getSplitTrack() { return false; }
    public void setTickMark(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getTickMark() { return null; }
    public void setTickMarkTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getTickMarkTintList() { return null; }
    public void setTickMarkTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setTickMarkTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.PorterDuff.Mode getTickMarkTintMode() { return null; }
    @android.annotation.Nullable
    public android.graphics.BlendMode getTickMarkTintBlendMode() { return null; }
    public void setKeyProgressIncrement(int p0) {}
    public int getKeyProgressIncrement() { return 0; }
    public synchronized void setMin(int p0) {}
    public synchronized void setMax(int p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    void onVisualProgressChanged(int p0, float p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public void growRectTo(android.graphics.Rect p0, int p1) {}
    public void onResolveDrawables(int p0) {}
    protected synchronized void onDraw(android.graphics.Canvas p0) {}
    void drawTrack(android.graphics.Canvas p0) {}
    protected void drawTickMarks(android.graphics.Canvas p0) {}
    void drawThumb(android.graphics.Canvas p0) {}
    protected synchronized void onMeasure(int p0, int p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void onStartTrackingTouch() {}
    void onStopTrackingTouch() {}
    void onKeyChange() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    boolean canUserSetProgress() { return false; }
    public void onRtlPropertiesChanged(int p0) {}
}

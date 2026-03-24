package android.widget;

@android.widget.RemoteViews.RemoteView
public class Switch extends android.widget.CompoundButton {
    public Switch(android.content.Context p0) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setSwitchTextAppearance(android.content.Context p0, int p1) {}
    public void setSwitchTypeface(android.graphics.Typeface p0, int p1) {}
    public void setSwitchTypeface(android.graphics.Typeface p0) {}
    @android.view.RemotableViewMethod
    public void setSwitchPadding(int p0) {}
    public int getSwitchPadding() { return 0; }
    @android.view.RemotableViewMethod
    public void setSwitchMinWidth(int p0) {}
    public int getSwitchMinWidth() { return 0; }
    @android.view.RemotableViewMethod
    public void setThumbTextPadding(int p0) {}
    public int getThumbTextPadding() { return 0; }
    public void setTrackDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setTrackResourceAsync")
    public void setTrackResource(int p0) {}
    public java.lang.Runnable setTrackResourceAsync(int p0) { return null; }
    public android.graphics.drawable.Drawable getTrackDrawable() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setTrackIconAsync")
    public void setTrackIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setTrackIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setTrackTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getTrackTintList() { return null; }
    public void setTrackTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setTrackTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.PorterDuff.Mode getTrackTintMode() { return null; }
    @android.annotation.Nullable
    public android.graphics.BlendMode getTrackTintBlendMode() { return null; }
    public void setThumbDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setThumbResourceAsync")
    public void setThumbResource(int p0) {}
    public java.lang.Runnable setThumbResourceAsync(int p0) { return null; }
    public android.graphics.drawable.Drawable getThumbDrawable() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setThumbIconAsync")
    public void setThumbIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setThumbIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setThumbTintList(android.content.res.ColorStateList p0) {}
    @android.annotation.Nullable
    public android.content.res.ColorStateList getThumbTintList() { return null; }
    public void setThumbTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setThumbTintBlendMode(android.graphics.BlendMode p0) {}
    @android.annotation.Nullable
    public android.graphics.PorterDuff.Mode getThumbTintMode() { return null; }
    @android.annotation.Nullable
    public android.graphics.BlendMode getThumbTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setSplitTrack(boolean p0) {}
    public boolean getSplitTrack() { return false; }
    public java.lang.CharSequence getTextOn() { return null; }
    @android.view.RemotableViewMethod
    public void setTextOn(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getTextOff() { return null; }
    @android.view.RemotableViewMethod
    public void setTextOff(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setShowText(boolean p0) {}
    public boolean getShowText() { return false; }
    public void onMeasure(int p0, int p1) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void toggle() {}
    @android.annotation.NonNull
    protected java.lang.CharSequence getButtonStateDescription() { return null; }
    public void setChecked(boolean p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public int getCompoundPaddingLeft() { return 0; }
    public int getCompoundPaddingRight() { return 0; }
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
}

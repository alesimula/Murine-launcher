package android.widget;

public class Switch extends android.widget.CompoundButton {
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_IDLE = 0;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int MONOSPACE = 3;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mThumbDrawable;
    private android.content.res.ColorStateList mThumbTintList;
    private android.graphics.BlendMode mThumbBlendMode;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mTrackDrawable;
    private android.content.res.ColorStateList mTrackTintList;
    private android.graphics.BlendMode mTrackBlendMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mThumbTextPadding;
    @android.annotation.UnsupportedAppUsage
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private boolean mSplitTrack;
    private java.lang.CharSequence mTextOn;
    private java.lang.CharSequence mTextOff;
    private boolean mShowText;
    private boolean mUseFallbackLineSpacing;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private android.view.VelocityTracker mVelocityTracker;
    private int mMinFlingVelocity;
    private float mThumbPosition;
    @android.annotation.UnsupportedAppUsage
    private int mSwitchWidth;
    @android.annotation.UnsupportedAppUsage
    private int mSwitchHeight;
    @android.annotation.UnsupportedAppUsage
    private int mThumbWidth;
    private int mSwitchLeft;
    private int mSwitchTop;
    private int mSwitchRight;
    private int mSwitchBottom;
    private android.text.TextPaint mTextPaint;
    private android.content.res.ColorStateList mTextColors;
    @android.annotation.UnsupportedAppUsage
    private android.text.Layout mOnLayout;
    @android.annotation.UnsupportedAppUsage
    private android.text.Layout mOffLayout;
    private android.text.method.TransformationMethod2 mSwitchTransformationMethod;
    private android.animation.ObjectAnimator mPositionAnimator;
    private final android.graphics.Rect mTempRect = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final android.util.FloatProperty<android.widget.Switch> THUMB_POS = null;
    public Switch(android.content.Context p0) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setSwitchTextAppearance(android.content.Context p0, int p1) {}
    private void setSwitchTypefaceByIndex(int p0, int p1) {}
    public void setSwitchTypeface(android.graphics.Typeface p0, int p1) {}
    public void setSwitchTypeface(android.graphics.Typeface p0) {}
    public void setSwitchPadding(int p0) {}
    public int getSwitchPadding() { return 0; }
    public void setSwitchMinWidth(int p0) {}
    public int getSwitchMinWidth() { return 0; }
    public void setThumbTextPadding(int p0) {}
    public int getThumbTextPadding() { return 0; }
    public void setTrackDrawable(android.graphics.drawable.Drawable p0) {}
    public void setTrackResource(int p0) {}
    public android.graphics.drawable.Drawable getTrackDrawable() { return null; }
    public void setTrackTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getTrackTintList() { return null; }
    public void setTrackTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setTrackTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getTrackTintMode() { return null; }
    public android.graphics.BlendMode getTrackTintBlendMode() { return null; }
    private void applyTrackTint() {}
    public void setThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setThumbResource(int p0) {}
    public android.graphics.drawable.Drawable getThumbDrawable() { return null; }
    public void setThumbTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getThumbTintList() { return null; }
    public void setThumbTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setThumbTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getThumbTintMode() { return null; }
    public android.graphics.BlendMode getThumbTintBlendMode() { return null; }
    private void applyThumbTint() {}
    public void setSplitTrack(boolean p0) {}
    public boolean getSplitTrack() { return false; }
    public java.lang.CharSequence getTextOn() { return null; }
    public void setTextOn(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getTextOff() { return null; }
    public void setTextOff(java.lang.CharSequence p0) {}
    public void setShowText(boolean p0) {}
    public boolean getShowText() { return false; }
    public void onMeasure(int p0, int p1) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    private android.text.Layout makeLayout(java.lang.CharSequence p0) { return null; }
    private boolean hitThumb(float p0, float p1) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void cancelSuperTouch(android.view.MotionEvent p0) {}
    private void stopDrag(android.view.MotionEvent p0) {}
    private void animateThumbToCheckedState(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    private void cancelPositionAnimator() {}
    private boolean getTargetCheckedState() { return false; }
    @android.annotation.UnsupportedAppUsage
    private void setThumbPosition(float p0) {}
    public void toggle() {}
    public void setChecked(boolean p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public int getCompoundPaddingLeft() { return 0; }
    public int getCompoundPaddingRight() { return 0; }
    private int getThumbOffset() { return 0; }
    private int getThumbScrollRange() { return 0; }
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.Switch> {
        private boolean mPropertiesMapped;
        private int mShowTextId;
        private int mSplitTrackId;
        private int mSwitchMinWidthId;
        private int mSwitchPaddingId;
        private int mTextOffId;
        private int mTextOnId;
        private int mThumbId;
        private int mThumbTextPaddingId;
        private int mThumbTintId;
        private int mThumbTintBlendModeId;
        private int mThumbTintModeId;
        private int mTrackId;
        private int mTrackTintId;
        private int mTrackTintBlendModeId;
        private int mTrackTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.Switch p0, android.view.inspector.PropertyReader p1) {}
    }
}

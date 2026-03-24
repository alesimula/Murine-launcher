package android.widget;

public abstract class AbsSeekBar extends android.widget.ProgressBar {
    private final android.graphics.Rect mTempRect = null;
    private android.graphics.drawable.Drawable mThumb;
    private android.content.res.ColorStateList mThumbTintList;
    private android.graphics.BlendMode mThumbBlendMode;
    private boolean mHasThumbTint;
    private boolean mHasThumbBlendMode;
    private android.graphics.drawable.Drawable mTickMark;
    private android.content.res.ColorStateList mTickMarkTintList;
    private android.graphics.BlendMode mTickMarkBlendMode;
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkBlendMode;
    private int mThumbOffset;
    private boolean mSplitTrack;
    float mTouchProgressOffset;
    boolean mIsUserSeekable;
    private int mKeyProgressIncrement;
    private static final int NO_ALPHA = 255;
    private float mDisabledAlpha;
    private int mThumbExclusionMaxSize;
    private int mScaledTouchSlop;
    private float mTouchDownX;
    private boolean mIsDragging;
    private float mTouchThumbOffset;
    private java.util.List<android.graphics.Rect> mUserGestureExclusionRects;
    private final java.util.List<android.graphics.Rect> mGestureExclusionRects = null;
    private final android.graphics.Rect mThumbRect = null;
    public AbsSeekBar(android.content.Context p0) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setThumb(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getThumb() { return null; }
    public void setThumbTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getThumbTintList() { return null; }
    public void setThumbTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setThumbTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getThumbTintMode() { return null; }
    public android.graphics.BlendMode getThumbTintBlendMode() { return null; }
    private void applyThumbTint() {}
    public int getThumbOffset() { return 0; }
    public void setThumbOffset(int p0) {}
    public void setSplitTrack(boolean p0) {}
    public boolean getSplitTrack() { return false; }
    public void setTickMark(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getTickMark() { return null; }
    public void setTickMarkTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getTickMarkTintList() { return null; }
    public void setTickMarkTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setTickMarkTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getTickMarkTintMode() { return null; }
    public android.graphics.BlendMode getTickMarkTintBlendMode() { return null; }
    private void applyTickMarkTint() {}
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
    private void updateThumbAndTrackPos(int p0, int p1) {}
    private float getScale() { return 0.0f; }
    private void setThumbPos(int p0, android.graphics.drawable.Drawable p1, float p2, int p3) {}
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    private void updateGestureExclusionRects() {}
    public void growRectTo(android.graphics.Rect p0, int p1) {}
    public void onResolveDrawables(int p0) {}
    protected synchronized void onDraw(android.graphics.Canvas p0) {}
    void drawTrack(android.graphics.Canvas p0) {}
    protected void drawTickMarks(android.graphics.Canvas p0) {}
    void drawThumb(android.graphics.Canvas p0) {}
    protected synchronized void onMeasure(int p0, int p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void startDrag(android.view.MotionEvent p0) {}
    private void setHotspot(float p0, float p1) {}
    private void trackTouchEvent(android.view.MotionEvent p0) {}
    private void attemptClaimDrag() {}
    void onStartTrackingTouch() {}
    void onStopTrackingTouch() {}
    void onKeyChange() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    boolean canUserSetProgress() { return false; }
    public void onRtlPropertiesChanged(int p0) {}

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.AbsSeekBar> {
        private boolean mPropertiesMapped;
        private int mThumbTintId;
        private int mThumbTintModeId;
        private int mTickMarkTintId;
        private int mTickMarkTintBlendModeId;
        private int mTickMarkTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.AbsSeekBar p0, android.view.inspector.PropertyReader p1) {}
    }
}

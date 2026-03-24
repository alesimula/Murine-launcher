package android.graphics.drawable;

class RippleBackground extends android.graphics.drawable.RippleComponent {
    private static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    private static final int OPACITY_DURATION = 80;
    private android.animation.ObjectAnimator mAnimator;
    private float mOpacity;
    private boolean mIsBounded;
    private boolean mFocused;
    private boolean mHovered;
    private static final android.graphics.drawable.RippleBackground.BackgroundProperty OPACITY = null;
    public RippleBackground(android.graphics.drawable.RippleDrawable p0, android.graphics.Rect p1, boolean p2) { super(null, null); }
    public boolean isVisible() { return false; }
    public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    public void setState(boolean p0, boolean p1, boolean p2) {}
    private void onStateChanged() {}
    public void jumpToFinal() {}

    private static abstract class BackgroundProperty extends android.util.FloatProperty<android.graphics.drawable.RippleBackground> {
        public BackgroundProperty(java.lang.String p0) { super(null); }
    }
}

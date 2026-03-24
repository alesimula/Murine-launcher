package com.android.internal.widget;

public class DrawableHolder implements android.animation.Animator.AnimatorListener {
    public static final android.view.animation.DecelerateInterpolator EASE_OUT_INTERPOLATOR = null;
    private static final java.lang.String TAG = "DrawableHolder";
    private static final boolean DBG = false;
    private float mX;
    private float mY;
    private float mScaleX;
    private float mScaleY;
    private android.graphics.drawable.BitmapDrawable mDrawable;
    private float mAlpha;
    private java.util.ArrayList<android.animation.ObjectAnimator> mAnimators;
    private java.util.ArrayList<android.animation.ObjectAnimator> mNeedToStart;
    public DrawableHolder(android.graphics.drawable.BitmapDrawable p0) {}
    public DrawableHolder(android.graphics.drawable.BitmapDrawable p0, float p1, float p2) {}
    public android.animation.ObjectAnimator addAnimTo(long p0, long p1, java.lang.String p2, float p3, boolean p4) { return null; }
    public void removeAnimationFor(java.lang.String p0) {}
    public void clearAnimations() {}
    private com.android.internal.widget.DrawableHolder addAnimation(android.animation.ObjectAnimator p0, boolean p1) { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public void startAnimations(android.animation.ValueAnimator.AnimatorUpdateListener p0) {}
    public void setX(float p0) {}
    public void setY(float p0) {}
    public void setScaleX(float p0) {}
    public void setScaleY(float p0) {}
    public void setAlpha(float p0) {}
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getScaleX() { return 0.0f; }
    public float getScaleY() { return 0.0f; }
    public float getAlpha() { return 0.0f; }
    public android.graphics.drawable.BitmapDrawable getDrawable() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public void onAnimationCancel(android.animation.Animator p0) {}
    public void onAnimationEnd(android.animation.Animator p0) {}
    public void onAnimationRepeat(android.animation.Animator p0) {}
    public void onAnimationStart(android.animation.Animator p0) {}
}

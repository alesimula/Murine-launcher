package com.android.internal.app;

public class PlatLogoActivity extends android.app.Activity {
    android.widget.ImageView mZeroView;
    android.widget.ImageView mOneView;
    com.android.internal.app.PlatLogoActivity.BackslashDrawable mBackslash;
    int mClicks;
    static final android.graphics.Paint sPaint = null;
    static final java.lang.String TOUCH_STATS = "touch.stats";
    double mPressureMin;
    double mPressureMax;
    public PlatLogoActivity() { super(); }
    protected void onPause() {}
    protected void onCreate(android.os.Bundle p0) {}
    private void testOverlap() {}
    private void launchNextStage() {}
    private void measureTouchPressure(android.view.MotionEvent p0) {}
    private void syncTouchPressure() {}
    public void onStart() {}
    public void onStop() {}

    static class ZeroDrawable extends android.graphics.drawable.Drawable {
        int mTintColor;
        ZeroDrawable() { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public void setTintList(android.content.res.ColorStateList p0) {}
        public int getOpacity() { return 0; }
    }

    static class OneDrawable extends android.graphics.drawable.Drawable {
        int mTintColor;
        OneDrawable() { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public void setTintList(android.content.res.ColorStateList p0) {}
        public int getOpacity() { return 0; }
    }

    private static class BackslashDrawable extends android.graphics.drawable.Drawable implements android.animation.TimeAnimator.TimeListener {
        android.graphics.Bitmap mTile;
        android.graphics.Paint mPaint;
        android.graphics.BitmapShader mShader;
        android.animation.TimeAnimator mAnimator;
        android.graphics.Matrix mMatrix;
        public void draw(android.graphics.Canvas p0) {}
        BackslashDrawable(int p0) { super(); }
        public void startAnimating() {}
        public void stopAnimating() {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public int getOpacity() { return 0; }
        public void onTimeUpdate(android.animation.TimeAnimator p0, long p1, long p2) {}
    }
}

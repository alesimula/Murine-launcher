package com.android.internal.app;

public class PlatLogoActivity extends android.app.Activity {
    private static final boolean WRITE_SETTINGS = true;
    private static final java.lang.String R_EGG_UNLOCK_SETTING = "egg_mode_r";
    private static final int UNLOCK_TRIES = 3;
    com.android.internal.app.PlatLogoActivity.BigDialView mDialView;
    static final java.lang.String TOUCH_STATS = "touch.stats";
    double mPressureMin;
    double mPressureMax;
    public PlatLogoActivity() { super(); }
    protected void onPause() {}
    protected void onCreate(android.os.Bundle p0) {}
    private void launchNextStage(boolean p0) {}
    private void measureTouchPressure(android.view.MotionEvent p0) {}
    private void syncTouchPressure() {}
    public void onStart() {}
    public void onStop() {}

    class BigDialView extends android.widget.ImageView {
        private static final int COLOR_GREEN = -12723068;
        private static final int COLOR_BLUE = -12417548;
        private static final int COLOR_NAVY = -16306110;
        private static final int COLOR_ORANGE = -497868;
        private static final int COLOR_CHARTREUSE = -1050673;
        private static final int COLOR_LIGHTBLUE = -2625538;
        private static final int STEPS = 11;
        private static final float VALUE_CHANGE_MAX = 0.09090909361839294f;
        private com.android.internal.app.PlatLogoActivity.BigDialView.BigDialDrawable mDialDrawable;
        private boolean mWasLocked;
        BigDialView(com.android.internal.app.PlatLogoActivity p0, android.content.Context p1, android.util.AttributeSet p2) { super((android.content.Context)null); }
        BigDialView(com.android.internal.app.PlatLogoActivity p0, android.content.Context p1, android.util.AttributeSet p2, int p3) { super((android.content.Context)null); }
        BigDialView(com.android.internal.app.PlatLogoActivity p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super((android.content.Context)null); }
        private void init() {}
        public void onDraw(android.graphics.Canvas p0) {}
        double toPositiveDegrees(double p0) { return 0.0; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public boolean performClick() { return false; }
        void setUnlockTries(int p0) {}

        private class BigDialDrawable extends android.graphics.drawable.Drawable {
            public final int STEPS = 0;
            private int mUnlockTries;
            final android.graphics.Paint mPaint = null;
            final android.graphics.drawable.Drawable mEleven = null;
            private boolean mNightMode;
            private float mValue;
            float mElevenAnim;
            android.animation.ObjectAnimator mElevenShowAnimator;
            android.animation.ObjectAnimator mElevenHideAnimator;
            BigDialDrawable(com.android.internal.app.PlatLogoActivity.BigDialView p0) { super(); }
            public void setUnlockTries(int p0) {}
            boolean isLocked() { return false; }
            public void setValue(float p0) {}
            public float getValue() { return 0.0f; }
            public int getUserLevel() { return 0; }
            public void setUserLevel(int p0) {}
            public float getElevenAnim() { return 0.0f; }
            public void setElevenAnim(float p0) {}
            public void draw(android.graphics.Canvas p0) {}
            float clamp(float p0, float p1, float p2) { return 0.0f; }
            float angleToValue(float p0) { return 0.0f; }
            float valueToAngle(float p0) { return 0.0f; }
            public void touchAngle(float p0) {}
            public void setAlpha(int p0) {}
            public void setColorFilter(android.graphics.ColorFilter p0) {}
            public int getOpacity() { return 0; }
        }
    }
}

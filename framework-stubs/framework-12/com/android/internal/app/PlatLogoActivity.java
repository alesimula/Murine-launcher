package com.android.internal.app;

public class PlatLogoActivity extends android.app.Activity {
    private static final java.lang.String TAG = "PlatLogoActivity";
    private static final java.lang.String S_EGG_UNLOCK_SETTING = "egg_mode_s";
    private com.android.internal.app.PlatLogoActivity.SettableAnalogClock mClock;
    private android.widget.ImageView mLogo;
    private com.android.internal.app.PlatLogoActivity.BubblesDrawable mBg;
    static final java.lang.String TOUCH_STATS = "touch.stats";
    double mPressureMin;
    double mPressureMax;
    public PlatLogoActivity() { super(); }
    protected void onPause() {}
    protected void onCreate(android.os.Bundle p0) {}
    private boolean shouldWriteSettings() { return false; }
    private void launchNextStage(boolean p0) {}
    private void measureTouchPressure(android.view.MotionEvent p0) {}
    private void syncTouchPressure() {}
    public void onStart() {}
    public void onStop() {}

    static class Bubble {
        public float x;
        public float y;
        public float r;
        public int color;
        Bubble() {}
    }

    class BubblesDrawable extends android.graphics.drawable.Drawable {
        private static final int MAX_BUBBS = 2000;
        private final int[] mColorIds = null;
        private int[] mColors;
        private final com.android.internal.app.PlatLogoActivity.Bubble[] mBubbs = null;
        private int mNumBubbs;
        private final android.graphics.Paint mPaint = null;
        public float avoid;
        public float padding;
        public float minR;
        BubblesDrawable(com.android.internal.app.PlatLogoActivity p0) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        protected boolean onLevelChange(int p0) { return false; }
        protected void onBoundsChange(android.graphics.Rect p0) {}
        private void randomize() {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public int getOpacity() { return 0; }
    }

    public class SettableAnalogClock extends android.widget.AnalogClock {
        private int mOverrideHour;
        private int mOverrideMinute;
        private boolean mOverride;
        public SettableAnalogClock(com.android.internal.app.PlatLogoActivity p0, android.content.Context p1) { super((android.content.Context)null); }
        protected java.time.Instant now() { return null; }
        double toPositiveDegrees(double p0) { return 0.0; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    }
}

package com.android.internal.app;

public class PlatLogoActivity extends android.app.Activity {
    static final java.lang.String TOUCH_STATS = "touch.stats";
    double mPressureMin;
    double mPressureMax;
    public PlatLogoActivity() { super(); }
    protected void onPause() {}
    protected void onCreate(android.os.Bundle p0) {}
    public void onStart() {}
    public void onStop() {}

    static class Bubble {
        public float x;
        public float y;
        public float r;
        public int color;
        public java.lang.String text;
        Bubble() {}
    }

    class BubblesDrawable extends android.graphics.drawable.Drawable implements android.view.View.OnLongClickListener {
        public float avoid;
        public float padding;
        public float minR;
        BubblesDrawable(com.android.internal.app.PlatLogoActivity p0) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public void chooseEmojiSet() {}
        protected boolean onLevelChange(int p0) { return false; }
        protected void onBoundsChange(android.graphics.Rect p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public int getOpacity() { return 0; }
        public boolean onLongClick(android.view.View p0) { return false; }
    }

    public class SettableAnalogClock extends android.widget.AnalogClock {
        public SettableAnalogClock(com.android.internal.app.PlatLogoActivity p0, android.content.Context p1) { super((android.content.Context)null); }
        protected java.time.Instant now() { return null; }
        double toPositiveDegrees(double p0) { return 0.0; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    }
}

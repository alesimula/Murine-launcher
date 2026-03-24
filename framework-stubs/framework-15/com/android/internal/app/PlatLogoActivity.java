package com.android.internal.app;

public class PlatLogoActivity extends android.app.Activity {
    static final java.lang.String TOUCH_STATS = "touch.stats";
    double mPressureMin;
    double mPressureMax;
    public PlatLogoActivity() { super(); }
    protected void onDestroy() {}
    protected void onCreate(android.os.Bundle p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onResume() {}
    public void onPause() {}
    public void onStart() {}
    public void onStop() {}

    private class RumblePack implements android.os.Handler.Callback {
        @android.annotation.SuppressLint("MissingPermission")
        public boolean handleMessage(android.os.Message p0) { return false; }
        RumblePack(com.android.internal.app.PlatLogoActivity p0) {}
        public void destroy() {}
    }

    private static class Starfield extends android.graphics.drawable.Drawable {
        public void setWarp(float p0) {}
        public float getWarp() { return 0.0f; }
        Starfield(java.util.Random p0, float p1) { super(); }
        public void onBoundsChange(android.graphics.Rect p0) {}
        public void setVelocity(float p0, float p1) {}
        public void draw(android.graphics.Canvas p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public int getOpacity() { return 0; }
        public void update(long p0) {}
    }
}

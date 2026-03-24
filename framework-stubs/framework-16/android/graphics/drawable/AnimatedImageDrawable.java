package android.graphics.drawable;

public class AnimatedImageDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable2 {
    public static final int REPEAT_INFINITE = -1;
    @java.lang.Deprecated
    public static final int LOOP_INFINITE = -1;
    public void setRepeatCount(int p0) {}
    @java.lang.Deprecated
    public void setLoopCount(int p0) {}
    public int getRepeatCount() { return 0; }
    @java.lang.Deprecated
    public int getLoopCount(int p0) { return 0; }
    public AnimatedImageDrawable() { super(); }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public AnimatedImageDrawable(long p0, android.graphics.ImageDecoder p1, int p2, int p3, long p4, boolean p5, int p6, int p7, android.graphics.Rect p8, java.io.InputStream p9, android.content.res.AssetFileDescriptor p10) throws java.io.IOException { super(); }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public void draw(android.graphics.Canvas p0) {}
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    @android.annotation.Nullable
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public int getOpacity() { return 0; }
    public void setAutoMirrored(boolean p0) {}
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    public final boolean isAutoMirrored() { return false; }
    public boolean isRunning() { return false; }
    public void start() {}
    public void stop() {}
    public void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) {}
    public boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) { return false; }
    public void clearAnimationCallbacks() {}
    public void setFilterBitmap(boolean p0) {}
    public boolean isFilterBitmap() { return false; }
    protected void onBoundsChange(android.graphics.Rect p0) {}

    private class State {
        final long mNativePtr = 0L;
        int[] mThemeAttrs;
        boolean mAutoMirrored;
        int mRepeatCount;
        State(android.graphics.drawable.AnimatedImageDrawable p0, long p1, java.io.InputStream p2, android.content.res.AssetFileDescriptor p3) {}
    }
}

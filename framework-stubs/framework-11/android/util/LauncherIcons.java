package android.util;

public final class LauncherIcons {
    private static final float ICON_SIZE_BLUR_FACTOR = 0.010416666977107525f;
    private static final float ICON_SIZE_KEY_SHADOW_DELTA_FACTOR = 0.02083333395421505f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private final android.util.SparseArray<android.graphics.Bitmap> mShadowCache = null;
    private final int mIconSize = 0;
    private final android.content.res.Resources mRes = null;
    public LauncherIcons(android.content.Context p0) {}
    public android.graphics.drawable.Drawable wrapIconDrawableWithShadow(android.graphics.drawable.Drawable p0) { return null; }
    private android.graphics.Bitmap getShadowBitmap(android.graphics.drawable.AdaptiveIconDrawable p0) { return null; }
    public android.graphics.drawable.Drawable getBadgeDrawable(int p0, int p1) { return null; }
    public android.graphics.drawable.Drawable getBadgedDrawable(android.graphics.drawable.Drawable p0, int p1, int p2) { return null; }

    private static class ShadowDrawable extends android.graphics.drawable.DrawableWrapper {
        final android.util.LauncherIcons.ShadowDrawable.MyConstantState mState = null;
        public ShadowDrawable(android.graphics.Bitmap p0, android.graphics.drawable.Drawable p1) { super((android.graphics.drawable.Drawable)null); }
        ShadowDrawable(android.util.LauncherIcons.ShadowDrawable.MyConstantState p0) { super((android.graphics.drawable.Drawable)null); }
        public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
        public void draw(android.graphics.Canvas p0) {}

        private static class MyConstantState extends android.graphics.drawable.Drawable.ConstantState {
            final android.graphics.Paint mPaint = null;
            final android.graphics.Bitmap mShadow = null;
            final android.graphics.drawable.Drawable.ConstantState mChildState = null;
            MyConstantState(android.graphics.Bitmap p0, android.graphics.drawable.Drawable.ConstantState p1) { super(); }
            public android.graphics.drawable.Drawable newDrawable() { return null; }
            public int getChangingConfigurations() { return 0; }
        }
    }
}

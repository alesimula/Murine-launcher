package android.util;

public final class LauncherIcons {
    public LauncherIcons(android.content.Context p0) {}
    public android.graphics.drawable.Drawable wrapIconDrawableWithShadow(android.graphics.drawable.Drawable p0) { return null; }
    public android.graphics.drawable.Drawable getBadgeDrawable(android.graphics.drawable.Drawable p0, int p1) { return null; }
    public android.graphics.drawable.Drawable getBadgedDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, int p2) { return null; }

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

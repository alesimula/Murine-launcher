package com.android.internal.app;

@java.lang.Deprecated
public class SimpleIconFactory {
    @java.lang.Deprecated
    public static com.android.internal.app.SimpleIconFactory obtain(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public void recycle() {}
    @java.lang.Deprecated
    void setWrapperBackgroundColor(int p0) {}
    @java.lang.Deprecated
    android.graphics.Bitmap createUserBadgedIconBitmap(android.graphics.drawable.Drawable p0, android.os.UserHandle p1) { return null; }
    @java.lang.Deprecated
    public android.graphics.Bitmap createAppBadgedIconBitmap(android.graphics.drawable.Drawable p0, android.graphics.Bitmap p1) { return null; }

    public static class FixedScaleDrawable extends android.graphics.drawable.DrawableWrapper {
        public FixedScaleDrawable() { super((android.graphics.drawable.Drawable)null); }
        public void draw(android.graphics.Canvas p0) {}
        public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) {}
        public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) {}
        public void setScale(float p0) {}
    }

    private static class FixedSizeBitmapDrawable extends android.graphics.drawable.BitmapDrawable {
        FixedSizeBitmapDrawable(android.graphics.Bitmap p0) { super(); }
        public int getIntrinsicHeight() { return 0; }
        public int getIntrinsicWidth() { return 0; }
    }
}

package android.graphics;

public final class Outline {
    private static final float RADIUS_UNDEFINED = Float.NEGATIVE_INFINITY;
    public static final int MODE_EMPTY = 0;
    public static final int MODE_ROUND_RECT = 1;
    public static final int MODE_PATH = 2;
    public int mMode;
    public android.graphics.Path mPath;
    public final android.graphics.Rect mRect = null;
    public float mRadius;
    public float mAlpha;
    public Outline() {}
    public Outline(android.graphics.Outline p0) {}
    public void setEmpty() {}
    public boolean isEmpty() { return false; }
    public boolean canClip() { return false; }
    public void setAlpha(float p0) {}
    public float getAlpha() { return 0.0f; }
    public void set(android.graphics.Outline p0) {}
    public void setRect(int p0, int p1, int p2, int p3) {}
    public void setRect(android.graphics.Rect p0) {}
    public void setRoundRect(int p0, int p1, int p2, int p3, float p4) {}
    public void setRoundRect(android.graphics.Rect p0, float p1) {}
    public boolean getRect(android.graphics.Rect p0) { return false; }
    public float getRadius() { return 0.0f; }
    public void setOval(int p0, int p1, int p2, int p3) {}
    public void setOval(android.graphics.Rect p0) {}
    @java.lang.Deprecated
    public void setConvexPath(android.graphics.Path p0) {}
    public void setPath(android.graphics.Path p0) {}
    public void offset(int p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }
}

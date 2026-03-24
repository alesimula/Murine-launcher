package android.view.animation;

public class Transformation {
    public static final int TYPE_IDENTITY = 0;
    public static final int TYPE_ALPHA = 1;
    public static final int TYPE_MATRIX = 2;
    public static final int TYPE_BOTH = 3;
    protected android.graphics.Matrix mMatrix;
    protected float mAlpha;
    protected int mTransformationType;
    private boolean mHasClipRect;
    private android.graphics.Rect mClipRect;
    public Transformation() {}
    public void clear() {}
    public int getTransformationType() { return 0; }
    public void setTransformationType(int p0) {}
    public void set(android.view.animation.Transformation p0) {}
    public void compose(android.view.animation.Transformation p0) {}
    public void postCompose(android.view.animation.Transformation p0) {}
    public android.graphics.Matrix getMatrix() { return null; }
    public void setAlpha(float p0) {}
    public void setClipRect(android.graphics.Rect p0) {}
    public void setClipRect(int p0, int p1, int p2, int p3) {}
    public android.graphics.Rect getClipRect() { return null; }
    public boolean hasClipRect() { return false; }
    public float getAlpha() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public java.lang.String toShortString() { return null; }
    public void toShortString(java.lang.StringBuilder p0) {}
    @android.annotation.UnsupportedAppUsage
    public void printShortString(java.io.PrintWriter p0) {}
}

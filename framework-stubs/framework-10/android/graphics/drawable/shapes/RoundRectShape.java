package android.graphics.drawable.shapes;

public class RoundRectShape extends android.graphics.drawable.shapes.RectShape {
    private float[] mOuterRadii;
    private android.graphics.RectF mInset;
    private float[] mInnerRadii;
    private android.graphics.RectF mInnerRect;
    private android.graphics.Path mPath;
    public RoundRectShape(float[] p0, android.graphics.RectF p1, float[] p2) { super(); }
    public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    public void getOutline(android.graphics.Outline p0) {}
    protected void onResize(float p0, float p1) {}
    public android.graphics.drawable.shapes.RoundRectShape clone() throws java.lang.CloneNotSupportedException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}

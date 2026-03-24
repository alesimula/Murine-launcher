package android.graphics;

public class Path {
    public final long mNativePath = 0L;
    public boolean isSimplePath;
    public android.graphics.Region rects;
    static final android.graphics.Path.FillType[] sFillTypeArray = null;
    public Path() {}
    public Path(android.graphics.Path p0) {}
    public void reset() {}
    public void rewind() {}
    public void set(android.graphics.Path p0) {}
    public boolean op(android.graphics.Path p0, android.graphics.Path.Op p1) { return false; }
    public boolean op(android.graphics.Path p0, android.graphics.Path p1, android.graphics.Path.Op p2) { return false; }
    @java.lang.Deprecated
    public boolean isConvex() { return false; }
    public android.graphics.Path.FillType getFillType() { return null; }
    public void setFillType(android.graphics.Path.FillType p0) {}
    public boolean isInverseFillType() { return false; }
    public void toggleInverseFillType() {}
    public boolean isEmpty() { return false; }
    public boolean isRect(android.graphics.RectF p0) { return false; }
    public void computeBounds(android.graphics.RectF p0, boolean p1) {}
    public void incReserve(int p0) {}
    public void moveTo(float p0, float p1) {}
    public void rMoveTo(float p0, float p1) {}
    public void lineTo(float p0, float p1) {}
    public void rLineTo(float p0, float p1) {}
    public void quadTo(float p0, float p1, float p2, float p3) {}
    public void rQuadTo(float p0, float p1, float p2, float p3) {}
    public void cubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void rCubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void arcTo(android.graphics.RectF p0, float p1, float p2, boolean p3) {}
    public void arcTo(android.graphics.RectF p0, float p1, float p2) {}
    public void arcTo(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6) {}
    public void close() {}
    public void addRect(android.graphics.RectF p0, android.graphics.Path.Direction p1) {}
    public void addRect(float p0, float p1, float p2, float p3, android.graphics.Path.Direction p4) {}
    public void addOval(android.graphics.RectF p0, android.graphics.Path.Direction p1) {}
    public void addOval(float p0, float p1, float p2, float p3, android.graphics.Path.Direction p4) {}
    public void addCircle(float p0, float p1, float p2, android.graphics.Path.Direction p3) {}
    public void addArc(android.graphics.RectF p0, float p1, float p2) {}
    public void addArc(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.Path.Direction p3) {}
    public void addRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Path.Direction p6) {}
    public void addRoundRect(android.graphics.RectF p0, float[] p1, android.graphics.Path.Direction p2) {}
    public void addRoundRect(float p0, float p1, float p2, float p3, float[] p4, android.graphics.Path.Direction p5) {}
    public void addPath(android.graphics.Path p0, float p1, float p2) {}
    public void addPath(android.graphics.Path p0) {}
    public void addPath(android.graphics.Path p0, android.graphics.Matrix p1) {}
    public void offset(float p0, float p1, android.graphics.Path p2) {}
    public void offset(float p0, float p1) {}
    public void setLastPoint(float p0, float p1) {}
    public void transform(android.graphics.Matrix p0, android.graphics.Path p1) {}
    public void transform(android.graphics.Matrix p0) {}
    public final long readOnlyNI() { return 0L; }
    final long mutateNI() { return 0L; }
    public float[] approximate(float p0) { return null; }

    public static enum Direction {
        CW,
        CCW;
        final int nativeInt = 0;
    }

    public static enum FillType {
        WINDING,
        EVEN_ODD,
        INVERSE_WINDING,
        INVERSE_EVEN_ODD;
        final int nativeInt = 0;
    }

    public static enum Op {
        DIFFERENCE,
        INTERSECT,
        UNION,
        XOR,
        REVERSE_DIFFERENCE;
    }
}

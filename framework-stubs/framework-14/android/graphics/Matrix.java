package android.graphics;

public class Matrix {
    public static final int MSCALE_X = 0;
    public static final int MSKEW_X = 1;
    public static final int MTRANS_X = 2;
    public static final int MSKEW_Y = 3;
    public static final int MSCALE_Y = 4;
    public static final int MTRANS_Y = 5;
    public static final int MPERSP_0 = 6;
    public static final int MPERSP_1 = 7;
    public static final int MPERSP_2 = 8;
    public static final android.graphics.Matrix IDENTITY_MATRIX = null;
    public Matrix() {}
    public Matrix(android.graphics.Matrix p0) {}
    public boolean isIdentity() { return false; }
    public boolean isAffine() { return false; }
    public boolean rectStaysRect() { return false; }
    public void set(android.graphics.Matrix p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void reset() {}
    public void setTranslate(float p0, float p1) {}
    public void setScale(float p0, float p1, float p2, float p3) {}
    public void setScale(float p0, float p1) {}
    public void setRotate(float p0, float p1, float p2) {}
    public void setRotate(float p0) {}
    public void setSinCos(float p0, float p1, float p2, float p3) {}
    public void setSinCos(float p0, float p1) {}
    public void setSkew(float p0, float p1, float p2, float p3) {}
    public void setSkew(float p0, float p1) {}
    public boolean setConcat(android.graphics.Matrix p0, android.graphics.Matrix p1) { return false; }
    public boolean preTranslate(float p0, float p1) { return false; }
    public boolean preScale(float p0, float p1, float p2, float p3) { return false; }
    public boolean preScale(float p0, float p1) { return false; }
    public boolean preRotate(float p0, float p1, float p2) { return false; }
    public boolean preRotate(float p0) { return false; }
    public boolean preSkew(float p0, float p1, float p2, float p3) { return false; }
    public boolean preSkew(float p0, float p1) { return false; }
    public boolean preConcat(android.graphics.Matrix p0) { return false; }
    public boolean postTranslate(float p0, float p1) { return false; }
    public boolean postScale(float p0, float p1, float p2, float p3) { return false; }
    public boolean postScale(float p0, float p1) { return false; }
    public boolean postRotate(float p0, float p1, float p2) { return false; }
    public boolean postRotate(float p0) { return false; }
    public boolean postSkew(float p0, float p1, float p2, float p3) { return false; }
    public boolean postSkew(float p0, float p1) { return false; }
    public boolean postConcat(android.graphics.Matrix p0) { return false; }
    public boolean setRectToRect(android.graphics.RectF p0, android.graphics.RectF p1, android.graphics.Matrix.ScaleToFit p2) { return false; }
    public boolean setPolyToPoly(float[] p0, int p1, float[] p2, int p3, int p4) { return false; }
    public boolean invert(android.graphics.Matrix p0) { return false; }
    public void mapPoints(float[] p0, int p1, float[] p2, int p3, int p4) {}
    public void mapVectors(float[] p0, int p1, float[] p2, int p3, int p4) {}
    public void mapPoints(float[] p0, float[] p1) {}
    public void mapVectors(float[] p0, float[] p1) {}
    public void mapPoints(float[] p0) {}
    public void mapVectors(float[] p0) {}
    public boolean mapRect(android.graphics.RectF p0, android.graphics.RectF p1) { return false; }
    public boolean mapRect(android.graphics.RectF p0) { return false; }
    public float mapRadius(float p0) { return 0.0f; }
    public void getValues(float[] p0) {}
    public void setValues(float[] p0) {}
    public java.lang.String toString() { return null; }
    public java.lang.String toShortString() { return null; }
    public final void dump(java.io.PrintWriter p0) {}
    public final long ni() { return 0L; }

    public static enum ScaleToFit {
        FILL,
        START,
        CENTER,
        END;
        final int nativeInt = 0;
    }

    private static class NoImagePreloadHolder {
    }
}

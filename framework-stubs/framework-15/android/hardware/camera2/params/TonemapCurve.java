package android.hardware.camera2.params;

public final class TonemapCurve {
    public static final float LEVEL_BLACK = 0.0f;
    public static final float LEVEL_WHITE = 1.0f;
    public static final int POINT_SIZE = 2;
    public static final int CHANNEL_RED = 0;
    public static final int CHANNEL_GREEN = 1;
    public static final int CHANNEL_BLUE = 2;
    public TonemapCurve(float[] p0, float[] p1, float[] p2) {}
    public int getPointCount(int p0) { return 0; }
    public android.graphics.PointF getPoint(int p0, int p1) { return null; }
    public void copyColorCurve(int p0, float[] p1, int p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

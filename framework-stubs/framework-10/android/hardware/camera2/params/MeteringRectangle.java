package android.hardware.camera2.params;

public final class MeteringRectangle {
    public static final int METERING_WEIGHT_MIN = 0;
    public static final int METERING_WEIGHT_MAX = 1000;
    public static final int METERING_WEIGHT_DONT_CARE = 0;
    private final int mX = 0;
    private final int mY = 0;
    private final int mWidth = 0;
    private final int mHeight = 0;
    private final int mWeight = 0;
    public MeteringRectangle(int p0, int p1, int p2, int p3, int p4) {}
    public MeteringRectangle(android.graphics.Point p0, android.util.Size p1, int p2) {}
    public MeteringRectangle(android.graphics.Rect p0, int p1) {}
    public int getX() { return 0; }
    public int getY() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getMeteringWeight() { return 0; }
    public android.graphics.Point getUpperLeftPoint() { return null; }
    public android.util.Size getSize() { return null; }
    public android.graphics.Rect getRect() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(android.hardware.camera2.params.MeteringRectangle p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

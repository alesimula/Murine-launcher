package android.hardware.display;

public final class DisplayViewport {
    public static final int VIEWPORT_INTERNAL = 1;
    public static final int VIEWPORT_EXTERNAL = 2;
    public static final int VIEWPORT_VIRTUAL = 3;
    public boolean valid;
    public boolean isActive;
    public int displayId;
    public int orientation;
    public final android.graphics.Rect logicalFrame = null;
    public final android.graphics.Rect physicalFrame = null;
    public int deviceWidth;
    public int deviceHeight;
    public java.lang.String uniqueId;
    @android.annotation.Nullable
    public java.lang.Integer physicalPort;
    public int type;
    public int densityDpi;
    public DisplayViewport() {}
    public void copyFrom(android.hardware.display.DisplayViewport p0) {}
    public android.hardware.display.DisplayViewport makeCopy() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ViewportType {
    }
}

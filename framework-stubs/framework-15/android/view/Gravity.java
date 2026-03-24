package android.view;

public class Gravity {
    public static final int NO_GRAVITY = 0;
    public static final int AXIS_SPECIFIED = 1;
    public static final int AXIS_PULL_BEFORE = 2;
    public static final int AXIS_PULL_AFTER = 4;
    public static final int AXIS_CLIP = 8;
    public static final int AXIS_X_SHIFT = 0;
    public static final int AXIS_Y_SHIFT = 4;
    public static final int TOP = 48;
    public static final int BOTTOM = 80;
    public static final int LEFT = 3;
    public static final int RIGHT = 5;
    public static final int CENTER_VERTICAL = 16;
    public static final int FILL_VERTICAL = 112;
    public static final int CENTER_HORIZONTAL = 1;
    public static final int FILL_HORIZONTAL = 7;
    public static final int CENTER = 17;
    public static final int FILL = 119;
    public static final int CLIP_VERTICAL = 128;
    public static final int CLIP_HORIZONTAL = 8;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int HORIZONTAL_GRAVITY_MASK = 7;
    public static final int VERTICAL_GRAVITY_MASK = 112;
    public static final int DISPLAY_CLIP_VERTICAL = 268435456;
    public static final int DISPLAY_CLIP_HORIZONTAL = 16777216;
    public static final int START = 8388611;
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public Gravity() {}
    public static void apply(int p0, int p1, int p2, android.graphics.Rect p3, android.graphics.Rect p4) {}
    public static void apply(int p0, int p1, int p2, android.graphics.Rect p3, android.graphics.Rect p4, int p5) {}
    public static void apply(int p0, int p1, int p2, android.graphics.Rect p3, int p4, int p5, android.graphics.Rect p6) {}
    public static void apply(int p0, int p1, int p2, android.graphics.Rect p3, int p4, int p5, android.graphics.Rect p6, int p7) {}
    public static void applyDisplay(int p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    public static void applyDisplay(int p0, android.graphics.Rect p1, android.graphics.Rect p2, int p3) {}
    public static boolean isVertical(int p0) { return false; }
    public static boolean isHorizontal(int p0) { return false; }
    public static int getAbsoluteGravity(int p0, int p1) { return 0; }
    public static java.lang.String toString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GravityFlags {
    }
}

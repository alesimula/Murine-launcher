package android.view;

public class WindowLayout {
    public static final int UNSPECIFIED_LENGTH = -1;
    static final int MIN_X = -100000;
    static final int MIN_Y = -100000;
    static final int MAX_X = 100000;
    static final int MAX_Y = 100000;
    public WindowLayout() {}
    public void computeFrames(android.view.WindowManager.LayoutParams p0, android.view.InsetsState p1, android.graphics.Rect p2, android.graphics.Rect p3, int p4, int p5, int p6, android.view.InsetsVisibilities p7, float p8, android.window.ClientWindowFrames p9) {}
    public static void extendFrameByCutout(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public static void computeSurfaceSize(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, int p2, int p3, android.graphics.Rect p4, boolean p5, android.graphics.Point p6) {}
}

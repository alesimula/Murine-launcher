package android.window;

public class SnapshotDrawerUtils {
    static final int FLAG_INHERIT_EXCLUDES = 830922808;
    public SnapshotDrawerUtils() {}
    public static boolean isAspectRatioMatch(android.graphics.Rect p0, android.window.TaskSnapshot p1) { return false; }
    public static android.app.ActivityManager.TaskDescription getOrCreateTaskDescription(android.app.ActivityManager.RunningTaskInfo p0) { return null; }
    public static void drawSnapshotOnSurface(android.window.StartingWindowInfo p0, android.view.WindowManager.LayoutParams p1, android.view.SurfaceControl p2, android.window.TaskSnapshot p3, android.graphics.Rect p4, android.graphics.Rect p5, android.view.InsetsState p6, boolean p7) {}
    public static android.view.WindowManager.LayoutParams createLayoutParameters(android.window.StartingWindowInfo p0, java.lang.CharSequence p1, int p2, int p3, android.os.IBinder p4) { return null; }
    static android.graphics.Rect getSystemBarInsets(android.graphics.Rect p0, android.view.InsetsState p1) { return null; }

    public static class SnapshotSurface {
        public SnapshotSurface(android.view.SurfaceControl p0, android.window.TaskSnapshot p1, java.lang.CharSequence p2, android.graphics.Rect p3) {}
        void initiateSystemBarPainter(int p0, int p1, int p2, android.app.ActivityManager.TaskDescription p3, int p4) {}
        void setFrames(android.graphics.Rect p0, android.graphics.Rect p1) {}
        android.graphics.Rect calculateSnapshotCrop(android.graphics.Rect p0) { return null; }
        android.graphics.Rect calculateSnapshotFrame(android.graphics.Rect p0) { return null; }
        void drawBackgroundAndBars(android.graphics.Canvas p0, android.graphics.Rect p1) {}
        void drawStatusBarBackground(android.graphics.Canvas p0, android.graphics.Rect p1) {}
        void drawNavigationBarBackground(android.graphics.Canvas p0) {}
    }

    public static class SystemBarBackgroundPainter {
        public SystemBarBackgroundPainter(int p0, int p1, int p2, android.app.ActivityManager.TaskDescription p3, float p4, int p5) {}
        public void setInsets(android.graphics.Rect p0) {}
        int getStatusBarColorViewHeight() { return 0; }
        public void drawDecors(android.graphics.Canvas p0, android.graphics.Rect p1) {}
        void drawStatusBarBackground(android.graphics.Canvas p0, android.graphics.Rect p1, int p2) {}
        void drawNavigationBarBackground(android.graphics.Canvas p0) {}
    }
}

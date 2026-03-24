package android.window;

public class SnapshotDrawerUtils {
    static final int FLAG_INHERIT_EXCLUDES = 830922810;
    public SnapshotDrawerUtils() {}
    public static android.app.ActivityManager.TaskDescription getOrCreateTaskDescription(android.app.ActivityManager.RunningTaskInfo p0) { return null; }
    public static void drawSnapshotOnSurface(android.view.WindowManager.LayoutParams p0, android.view.SurfaceControl p1, android.window.TaskSnapshot p2, android.graphics.Rect p3, boolean p4) {}
    public static android.view.WindowManager.LayoutParams createLayoutParameters(android.window.StartingWindowInfo p0, java.lang.CharSequence p1, int p2, int p3, android.os.IBinder p4) { return null; }

    public static class SnapshotSurface {
        public SnapshotSurface(android.view.SurfaceControl p0, android.window.TaskSnapshot p1, android.graphics.Rect p2, java.lang.CharSequence p3) {}
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

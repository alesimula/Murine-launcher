package android.window;

public class WindowInfosListenerForTest {
    public WindowInfosListenerForTest() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_SURFACE_FLINGER")
    public void addWindowInfosListener(java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>> p0) {}
    public void removeWindowInfosListener(java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>> p0) {}

    public static class WindowInfo {
        @android.annotation.NonNull
        public final android.os.IBinder windowToken = null;
        @android.annotation.NonNull
        public final java.lang.String name = null;
        public final int displayId = 0;
        @android.annotation.NonNull
        public final android.graphics.Rect bounds = null;
        public final boolean isTrustedOverlay = false;
        public final boolean isVisible = false;
        @android.annotation.NonNull
        public final android.graphics.Matrix transform = null;
        @android.annotation.SuppressLint("UnflaggedApi")
        public final boolean isTouchable = false;
        @android.annotation.SuppressLint("UnflaggedApi")
        public final boolean isFocusable = false;
        @android.annotation.SuppressLint("UnflaggedApi")
        public final boolean isPreventSplitting = false;
        @android.annotation.SuppressLint("UnflaggedApi")
        public final boolean isDuplicateTouchToWallpaper = false;
        @android.annotation.SuppressLint("UnflaggedApi")
        public final boolean isWatchOutsideTouch = false;
        WindowInfo(android.os.IBinder p0, java.lang.String p1, int p2, android.graphics.Rect p3, int p4, android.graphics.Matrix p5) {}
        public java.lang.String toString() { return null; }
    }
}

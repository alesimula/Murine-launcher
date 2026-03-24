package android.window;

public class WindowInfosListenerForTest {
    public WindowInfosListenerForTest() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_SURFACE_FLINGER")
    public void addWindowInfosListener(java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>> p0) {}
    public void removeWindowInfosListener(java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>> p0) {}

    public static class WindowInfo {
        public final android.os.IBinder windowToken = null;
        public final java.lang.String name = null;
        public final int displayId = 0;
        public final android.graphics.Rect bounds = null;
        public final boolean isTrustedOverlay = false;
        public final boolean isVisible = false;
        WindowInfo(android.os.IBinder p0, java.lang.String p1, int p2, android.graphics.Rect p3, int p4) {}
    }
}

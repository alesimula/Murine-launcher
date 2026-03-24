package android.window;

public class WindowTokenClientController {
    @android.annotation.NonNull
    public static android.window.WindowTokenClientController getInstance() { return null; }
    public static void overrideForTesting(android.window.WindowTokenClientController p0) {}
    @android.annotation.NonNull
    public static android.window.WindowTokenClientController createInstanceForTesting() { return null; }
    @android.annotation.Nullable
    public android.content.Context getWindowContext(android.os.IBinder p0) { return null; }
    public boolean attachToDisplayArea(android.window.WindowTokenClient p0, int p1, int p2, android.os.Bundle p3) { return false; }
    public boolean attachToDisplayContent(android.window.WindowTokenClient p0, int p1) { return false; }
    public boolean attachToWindowToken(android.window.WindowTokenClient p0, android.os.IBinder p1) { return false; }
    public void detachIfNeeded(android.window.WindowTokenClient p0) {}
    public void onWindowContextInfoChanged(android.os.IBinder p0, android.window.WindowContextInfo p1) {}
    public void onWindowContextWindowRemoved(android.os.IBinder p0) {}
    @android.annotation.Nullable
    public android.view.IWindowManager getWindowManagerService() { return null; }
}

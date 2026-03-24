package android.window;

public abstract class WindowInfosListener {
    public WindowInfosListener() {}
    public abstract void onWindowInfosChanged(android.view.InputWindowHandle[] p0, android.window.WindowInfosListener.DisplayInfo[] p1);
    public android.util.Pair<android.view.InputWindowHandle[], android.window.WindowInfosListener.DisplayInfo[]> register() { return null; }
    public void unregister() {}

    public static final class DisplayInfo {
        public final int mDisplayId = 0;
        public final android.util.Size mLogicalSize = null;
        public final android.graphics.Matrix mTransform = null;
        public java.lang.String toString() { return null; }
    }
}

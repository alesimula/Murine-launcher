package android.window;

public class WindowContextController {
    public int mAttachedToDisplayArea;
    public WindowContextController(android.window.WindowTokenClient p0) {}
    public void attachToDisplayArea(int p0, int p1, android.os.Bundle p2) {}
    public void attachToWindowToken(android.os.IBinder p0) {}
    public void detachIfNeeded() {}
    public void reparentToDisplayArea(int p0, int p1, android.os.Bundle p2) {}
    @android.annotation.NonNull
    public android.window.WindowTokenClientController getWindowTokenClientController() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttachStatus {
        public static final int STATUS_INITIALIZED = 0;
        public static final int STATUS_ATTACHED = 1;
        public static final int STATUS_DETACHED = 2;
        public static final int STATUS_FAILED = 3;
    }
}

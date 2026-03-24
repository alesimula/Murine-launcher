package android.window;

public class DisplayAreaOrganizer extends android.window.WindowOrganizer {
    public static final int FEATURE_UNDEFINED = -1;
    public static final int FEATURE_SYSTEM_FIRST = 0;
    public static final int FEATURE_ROOT = 0;
    public static final int FEATURE_DEFAULT_TASK_CONTAINER = 1;
    public static final int FEATURE_WINDOW_TOKENS = 2;
    public static final int FEATURE_SYSTEM_LAST = 10000;
    public static final int FEATURE_VENDOR_FIRST = 10001;
    private final android.window.IDisplayAreaOrganizer mInterface = null;
    private static final android.util.Singleton<android.window.IDisplayAreaOrganizerController> IDisplayAreaOrganizerControllerSingleton = null;
    public DisplayAreaOrganizer() { super(); }
    public void registerOrganizer(int p0) {}
    public void unregisterOrganizer() {}
    public void onDisplayAreaAppeared(android.window.DisplayAreaInfo p0, android.view.SurfaceControl p1) {}
    public void onDisplayAreaVanished(android.window.DisplayAreaInfo p0) {}
    public void onDisplayAreaInfoChanged(android.window.DisplayAreaInfo p0) {}
    private static android.window.IDisplayAreaOrganizerController getController() { return null; }
}

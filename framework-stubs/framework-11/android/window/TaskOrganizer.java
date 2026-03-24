package android.window;

public class TaskOrganizer extends android.window.WindowOrganizer {
    private final android.window.ITaskOrganizer mInterface = null;
    private static final android.util.Singleton<android.window.ITaskOrganizerController> ITaskOrganizerControllerSingleton = null;
    public TaskOrganizer() { super(); }
    public final void registerOrganizer(int p0) {}
    public final void unregisterOrganizer() {}
    public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) {}
    public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) {}
    public static android.app.ActivityManager.RunningTaskInfo createRootTask(int p0, int p1) { return null; }
    public static boolean deleteRootTask(android.window.WindowContainerToken p0) { return false; }
    public static java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) { return null; }
    public static java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) { return null; }
    public static android.window.WindowContainerToken getImeTarget(int p0) { return null; }
    public static void setLaunchRoot(int p0, android.window.WindowContainerToken p1) {}
    public void setInterceptBackPressedOnTaskRoot(boolean p0) {}
    private static android.window.ITaskOrganizerController getController() { return null; }
}

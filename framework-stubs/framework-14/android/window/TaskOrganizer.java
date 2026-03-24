package android.window;

public class TaskOrganizer extends android.window.WindowOrganizer {
    public TaskOrganizer() { super(); }
    public TaskOrganizer(android.window.ITaskOrganizerController p0, java.util.concurrent.Executor p1) { super(); }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public java.util.List<android.window.TaskAppearedInfo> registerOrganizer() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void unregisterOrganizer() {}
    public void addStartingWindow(android.window.StartingWindowInfo p0) {}
    public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) {}
    public void copySplashScreenView(int p0) {}
    public void onAppSplashScreenViewRemoved(int p0) {}
    public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) {}
    public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onImeDrawnOnTask(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void createRootTask(int p0, int p1, android.os.IBinder p2, boolean p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void createRootTask(int p0, int p1, android.os.IBinder p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public boolean deleteRootTask(android.window.WindowContainerToken p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public android.window.WindowContainerToken getImeTarget(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void setInterceptBackPressedOnTaskRoot(android.window.WindowContainerToken p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void restartTaskTopActivityProcessIfVisible(android.window.WindowContainerToken p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void updateCameraCompatControlState(android.window.WindowContainerToken p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void setOrientationRequestPolicy(boolean p0, int[] p1, int[] p2) {}
    public java.util.concurrent.Executor getExecutor() { return null; }
}

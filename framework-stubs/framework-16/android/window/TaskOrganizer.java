package android.window;

public class TaskOrganizer extends android.window.WindowOrganizer {
    public TaskOrganizer() { super(); }
    public TaskOrganizer(android.window.ITaskOrganizerController p0, java.util.concurrent.Executor p1) { super(); }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.NonNull
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
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void createRootTask(int p0, int p1, android.os.IBinder p2, boolean p3, boolean p4) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.Nullable
    public void createRootTask(int p0, int p1, android.os.IBinder p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void createRootTask(android.window.TaskOrganizer.CreateRootTaskRequest p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public boolean deleteRootTask(android.window.WindowContainerToken p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.Nullable
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.Nullable
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.Nullable
    public android.window.WindowContainerToken getImeLayeringTarget(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void setInterceptBackPressedOnTaskRoot(android.window.WindowContainerToken p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void restartTaskTopActivityProcessIfVisible(android.window.WindowContainerToken p0) {}
    @android.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() { return null; }

    public static class CreateRootTaskRequest {
        public int displayId;
        public int windowingMode;
        public boolean removeWithTaskOrganizer;
        public boolean reparentOnDisplayRemoval;
        @android.annotation.Nullable
        public android.os.IBinder launchCookie;
        @android.annotation.Nullable
        public java.lang.String name;
        public CreateRootTaskRequest() {}
        public android.window.TaskOrganizer.CreateRootTaskRequest setDisplayId(int p0) { return null; }
        public android.window.TaskOrganizer.CreateRootTaskRequest setWindowingMode(int p0) { return null; }
        public android.window.TaskOrganizer.CreateRootTaskRequest setRemoveWithTaskOrganizer(boolean p0) { return null; }
        public android.window.TaskOrganizer.CreateRootTaskRequest setReparentOnDisplayRemoval(boolean p0) { return null; }
        public android.window.TaskOrganizer.CreateRootTaskRequest setLaunchCookie(android.os.IBinder p0) { return null; }
        public android.window.TaskOrganizer.CreateRootTaskRequest setName(java.lang.String p0) { return null; }
    }
}

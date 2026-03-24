package android.window;

public class WindowOrganizer {
    private static final android.util.Singleton<android.window.IWindowOrganizerController> IWindowOrganizerControllerSingleton = null;
    public WindowOrganizer() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.WindowContainerTransactionCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public android.os.IBinder startTransition(int p0, android.os.IBinder p1, android.window.WindowContainerTransaction p2) { return null; }
    @android.annotation.SuppressLint("ExecutorRegistration")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public int finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1, android.window.WindowContainerTransactionCallback p2) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void registerTransitionPlayer(android.window.ITransitionPlayer p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    android.window.IWindowOrganizerController getWindowOrganizerController() { return null; }
}

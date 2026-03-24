package android.window;

public class WindowOrganizer {
    public WindowOrganizer() {}
    @android.annotation.RequiresPermission(value="android.permission.MANAGE_ACTIVITY_TASKS", conditional=true)
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.WindowContainerTransactionCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public android.os.IBinder startNewTransition(int p0, android.window.WindowContainerTransaction p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void startTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public int finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1, android.window.WindowContainerTransactionCallback p2) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public int startLegacyTransition(int p0, android.view.RemoteAnimationAdapter p1, android.window.WindowContainerTransactionCallback p2, android.window.WindowContainerTransaction p3) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void registerTransitionPlayer(android.window.ITransitionPlayer p0) {}
    public static android.window.ITransitionMetricsReporter getTransitionMetricsReporter() { return null; }
    static android.window.IWindowOrganizerController getWindowOrganizerController() { return null; }
}

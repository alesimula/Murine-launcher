package android.window;

public class WindowOrganizer {
    public WindowOrganizer() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.WindowContainerTransactionCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.NonNull
    public android.os.IBinder startNewTransition(int p0, android.window.WindowContainerTransaction p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void startTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void registerTransitionPlayer(android.window.ITransitionPlayer p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void unregisterTransitionPlayer(android.window.ITransitionPlayer p0) {}
    public static android.window.ITransitionMetricsReporter getTransitionMetricsReporter() { return null; }
    public boolean shareTransactionQueue() { return false; }
    static android.window.IWindowOrganizerController getWindowOrganizerController() { return null; }
}

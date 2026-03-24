package android.window;

public class TaskFragmentOrganizer extends android.window.WindowOrganizer {
    public static final java.lang.String KEY_ERROR_CALLBACK_THROWABLE = "fragment_throwable";
    public static final java.lang.String KEY_ERROR_CALLBACK_TASK_FRAGMENT_INFO = "task_fragment_info";
    public static final java.lang.String KEY_ERROR_CALLBACK_OP_TYPE = "operation_type";
    public static final int TASK_FRAGMENT_TRANSIT_NONE = 0;
    public static final int TASK_FRAGMENT_TRANSIT_OPEN = 1;
    public static final int TASK_FRAGMENT_TRANSIT_CLOSE = 2;
    public static final int TASK_FRAGMENT_TRANSIT_CHANGE = 6;
    public static final int TASK_FRAGMENT_TRANSIT_DRAG_RESIZE = 1017;
    @android.annotation.NonNull
    public static android.os.Bundle putErrorInfoInBundle(java.lang.Throwable p0, android.window.TaskFragmentInfo p1, int p2) { return null; }
    public TaskFragmentOrganizer(java.util.concurrent.Executor p0) { super(); }
    @android.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() { return null; }
    public void registerOrganizer() {}
    @android.annotation.RequiresPermission(value="android.permission.MANAGE_ACTIVITY_TASKS", conditional=true)
    @android.annotation.FlaggedApi("com.android.window.flags.task_fragment_system_organizer_flag")
    public void registerOrganizer(boolean p0) {}
    public void unregisterOrganizer() {}
    public void registerRemoteAnimations(android.view.RemoteAnimationDefinition p0) {}
    public void unregisterRemoteAnimations() {}
    public void onTransactionHandled(android.os.IBinder p0, android.window.WindowContainerTransaction p1, int p2, boolean p3) {}
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    public void applyTransaction(android.window.WindowContainerTransaction p0, int p1, boolean p2) {}
    @android.annotation.FlaggedApi("com.android.window.flags.task_fragment_system_organizer_flag")
    public void applySystemTransaction(android.window.WindowContainerTransaction p0, int p1, android.window.RemoteTransition p2) {}
    public void onTransactionReady(android.window.TaskFragmentTransaction p0) {}
    @android.annotation.NonNull
    public android.window.TaskFragmentOrganizerToken getOrganizerToken() { return null; }
    public boolean isActivityEmbedded(android.os.IBinder p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TaskFragmentTransitionType {
    }
}

package android.window;

public class TaskFragmentOrganizer extends android.window.WindowOrganizer {
    public static final java.lang.String KEY_ERROR_CALLBACK_THROWABLE = "fragment_throwable";
    public static final java.lang.String KEY_ERROR_CALLBACK_TASK_FRAGMENT_INFO = "task_fragment_info";
    public static final java.lang.String KEY_ERROR_CALLBACK_OP_TYPE = "operation_type";
    public static android.os.Bundle putErrorInfoInBundle(java.lang.Throwable p0, android.window.TaskFragmentInfo p1, int p2) { return null; }
    public TaskFragmentOrganizer(java.util.concurrent.Executor p0) { super(); }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public void registerOrganizer() {}
    public void unregisterOrganizer() {}
    public void registerRemoteAnimations(android.view.RemoteAnimationDefinition p0) {}
    public void unregisterRemoteAnimations() {}
    public void onTransactionHandled(android.os.IBinder p0, android.window.WindowContainerTransaction p1, int p2, boolean p3) {}
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    public void applyTransaction(android.window.WindowContainerTransaction p0, int p1, boolean p2) {}
    public static int getTransitionType(android.window.WindowContainerTransaction p0) { return 0; }
    @java.lang.Deprecated
    public void onTaskFragmentAppeared(android.window.TaskFragmentInfo p0) {}
    @java.lang.Deprecated
    public void onTaskFragmentInfoChanged(android.window.TaskFragmentInfo p0) {}
    @java.lang.Deprecated
    public void onTaskFragmentVanished(android.window.TaskFragmentInfo p0) {}
    @java.lang.Deprecated
    public void onTaskFragmentParentInfoChanged(android.os.IBinder p0, android.content.res.Configuration p1) {}
    @java.lang.Deprecated
    public void onTaskFragmentError(android.os.IBinder p0, java.lang.Throwable p1) {}
    public void onTransactionReady(android.window.TaskFragmentTransaction p0) {}
    public android.window.TaskFragmentOrganizerToken getOrganizerToken() { return null; }
    public boolean isActivityEmbedded(android.os.IBinder p0) { return false; }
}

package android.window;

public class TaskOrganizerTaskEmbedder extends android.window.TaskEmbedder {
    private static final java.lang.String TAG = "TaskOrgTaskEmbedder";
    private static final boolean DEBUG = false;
    private android.window.TaskOrganizer mTaskOrganizer;
    private android.app.ActivityManager.RunningTaskInfo mTaskInfo;
    private android.window.WindowContainerToken mTaskToken;
    private android.view.SurfaceControl mTaskLeash;
    private boolean mPendingNotifyBoundsChanged;
    public TaskOrganizerTaskEmbedder(android.content.Context p0, android.window.TaskEmbedder.Host p1) { super(null, null); }
    public boolean isInitialized() { return false; }
    public boolean onInitialize() { return false; }
    protected boolean onRelease() { return false; }
    public void start() {}
    public void stop() {}
    public void notifyBoundsChanged() {}
    public void performBackPress() {}
    public int getId() { return 0; }
    protected android.app.ActivityOptions prepareActivityOptions(android.app.ActivityOptions p0) { return null; }
    private int getTaskId() { return 0; }
    private void resetTaskInfo() {}
    private void log(java.lang.String p0) {}

    private class TaskOrganizerImpl extends android.window.TaskOrganizer {
        private TaskOrganizerImpl(android.window.TaskOrganizerTaskEmbedder p0) { super(); }
        public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) {}
        public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) {}
        public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) {}
        public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) {}
    }
}

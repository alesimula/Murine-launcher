package android.window;

public abstract class TaskEmbedder {
    private static final java.lang.String TAG = "TaskEmbedder";
    protected android.app.IActivityTaskManager mActivityTaskManager;
    protected final android.content.Context mContext = null;
    protected android.window.TaskEmbedder.Host mHost;
    protected android.view.SurfaceControl.Transaction mTransaction;
    protected android.view.SurfaceControl mSurfaceControl;
    protected android.window.TaskEmbedder.Listener mListener;
    protected boolean mOpened;
    public TaskEmbedder(android.content.Context p0, android.window.TaskEmbedder.Host p1) {}
    public boolean initialize(android.view.SurfaceControl p0) { return false; }
    public abstract boolean isInitialized();
    public boolean onInitialize() { return false; }
    protected boolean onRelease() { return false; }
    public void start() {}
    public void stop() {}
    public void notifyBoundsChanged() {}
    public void resizeTask(int p0, int p1) {}
    public abstract void performBackPress();
    public abstract int getId();
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    public int getDisplayId() { return 0; }
    public android.hardware.display.VirtualDisplay getVirtualDisplay() { return null; }
    public void setForwardedInsets(android.graphics.Insets p0) {}
    protected void updateLocationAndTapExcludeRegion() {}
    private void applyTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) {}
    private void clearTapExcludeRegion() {}
    public void setListener(android.window.TaskEmbedder.Listener p0) {}
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1) {}
    public void startActivity(android.app.PendingIntent p0) {}
    public void startActivity(android.app.PendingIntent p0, android.content.Intent p1, android.app.ActivityOptions p2) {}
    public void startShortcutActivity(android.content.pm.ShortcutInfo p0, android.app.ActivityOptions p1, android.graphics.Rect p2) {}
    protected android.app.ActivityOptions prepareActivityOptions(android.app.ActivityOptions p0) { return null; }
    public void release() {}
    private boolean performRelease() { return false; }
    protected void finalize() throws java.lang.Throwable {}

    public static interface Host {
        public android.graphics.Region getTapExcludeRegion();
        public android.graphics.Matrix getScreenToTaskMatrix();
        public android.view.IWindow getWindow();
        public android.graphics.Point getPositionInWindow();
        public android.graphics.Rect getScreenBounds();
        public boolean canReceivePointerEvents();
        public int getWidth();
        public int getHeight();
        public void onTaskBackgroundColorChanged(android.window.TaskEmbedder p0, int p1);
        public boolean post(java.lang.Runnable p0);
    }

    public static interface Listener {
        default public void onInitialized() {}
        default public void onReleased() {}
        default public void onTaskCreated(int p0, android.content.ComponentName p1) {}
        default public void onTaskVisibilityChanged(int p0, boolean p1) {}
        default public void onTaskMovedToFront(int p0) {}
        default public void onTaskRemovalStarted(int p0) {}
        default public void onBackPressedOnTaskRoot(int p0) {}
    }
}

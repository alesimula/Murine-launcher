package android.window;

public class VirtualDisplayTaskEmbedder extends android.window.TaskEmbedder {
    private static final java.lang.String TAG = "VirDispTaskEmbedder";
    private static final java.lang.String DISPLAY_NAME = "TaskVirtualDisplay";
    private int mDisplayDensityDpi;
    private final boolean mSingleTaskInstance = false;
    private final boolean mUsePublicVirtualDisplay = false;
    private final boolean mUseTrustedDisplay = false;
    private android.hardware.display.VirtualDisplay mVirtualDisplay;
    private android.graphics.Insets mForwardedInsets;
    private android.util.DisplayMetrics mTmpDisplayMetrics;
    private android.app.TaskStackListener mTaskStackListener;
    public VirtualDisplayTaskEmbedder(android.content.Context p0, android.window.TaskEmbedder.Host p1, boolean p2, boolean p3, boolean p4) { super(null, null); }
    public boolean isInitialized() { return false; }
    public boolean onInitialize() { return false; }
    protected boolean onRelease() { return false; }
    public void start() {}
    public void stop() {}
    public void resizeTask(int p0, int p1) {}
    public void performBackPress() {}
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public int getId() { return 0; }
    public int getDisplayId() { return 0; }
    public android.hardware.display.VirtualDisplay getVirtualDisplay() { return null; }
    protected android.app.ActivityOptions prepareActivityOptions(android.app.ActivityOptions p0) { return null; }
    public void setForwardedInsets(android.graphics.Insets p0) {}
    protected void updateLocationAndTapExcludeRegion() {}
    private void reportLocation(android.graphics.Matrix p0, android.graphics.Point p1) {}
    private void clearActivityViewGeometryForIme() {}
    private static android.view.KeyEvent createKeyEvent(int p0, int p1, int p2) { return null; }
    private int getBaseDisplayDensity() { return 0; }

    private class TaskStackListenerImpl extends android.app.TaskStackListener {
        private TaskStackListenerImpl(android.window.VirtualDisplayTaskEmbedder p0) { super(); }
        public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        private android.app.ActivityManager.StackInfo getTopMostStackInfo() throws android.os.RemoteException { return null; }
    }
}

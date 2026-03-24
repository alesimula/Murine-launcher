package android.app;

public class ActivityView extends android.view.ViewGroup {
    private static final java.lang.String DISPLAY_NAME = "ActivityViewVirtualDisplay";
    private static final java.lang.String TAG = "ActivityView";
    private android.hardware.display.VirtualDisplay mVirtualDisplay;
    private final android.view.SurfaceView mSurfaceView = null;
    private android.view.SurfaceControl mRootSurfaceControl;
    private final android.app.ActivityView.SurfaceCallback mSurfaceCallback = null;
    private android.app.ActivityView.StateCallback mActivityViewCallback;
    private android.app.IActivityTaskManager mActivityTaskManager;
    private final int[] mLocationInWindow = null;
    private final android.graphics.Region mTapExcludeRegion = null;
    private android.app.TaskStackListener mTaskStackListener;
    private boolean mOpened;
    private final android.view.SurfaceControl.Transaction mTmpTransaction = null;
    private final boolean mSingleTaskInstance = false;
    private android.graphics.Insets mForwardedInsets;
    public ActivityView(android.content.Context p0) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3) { super((android.content.Context)null); }
    public void setCallback(android.app.ActivityView.StateCallback p0) {}
    public void setCornerRadius(float p0) {}
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1) {}
    public void startActivity(android.app.PendingIntent p0) {}
    public void startActivity(android.app.PendingIntent p0, android.app.ActivityOptions p1) {}
    private android.app.ActivityOptions prepareActivityOptions() { return null; }
    public void release() {}
    public void onLocationChanged() {}
    private void clearActivityViewGeometryForIme() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void setAlpha(float p0) {}
    public float getAlpha() { return 0.0f; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    private void updateLocationAndTapExcludeRegion() {}
    private void updateTapExcludeRegion(int p0, int p1) throws android.os.RemoteException {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public int getVirtualDisplayId() { return 0; }
    public void performBackPress() {}
    private static android.view.KeyEvent createKeyEvent(int p0, int p1, int p2) { return null; }
    private void initVirtualDisplay(android.view.SurfaceSession p0) {}
    private void performRelease() {}
    private void cleanTapExcludeRegion() {}
    private int getBaseDisplayDensity() { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    public void setForwardedInsets(android.graphics.Insets p0) {}

    private class TaskStackListenerImpl extends android.app.TaskStackListener {
        private TaskStackListenerImpl(android.app.ActivityView p0) { super(); }
        public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        private android.app.ActivityManager.StackInfo getTopMostStackInfo() throws android.os.RemoteException { return null; }
    }

    private class SurfaceCallback implements android.view.SurfaceHolder.Callback {
        private SurfaceCallback(android.app.ActivityView p0) {}
        public void surfaceCreated(android.view.SurfaceHolder p0) {}
        public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
        public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    }

    public static abstract class StateCallback {
        public StateCallback() {}
        public abstract void onActivityViewReady(android.app.ActivityView p0);
        public abstract void onActivityViewDestroyed(android.app.ActivityView p0);
        public void onTaskCreated(int p0, android.content.ComponentName p1) {}
        public void onTaskMovedToFront(int p0) {}
        public void onTaskRemovalStarted(int p0) {}
    }
}

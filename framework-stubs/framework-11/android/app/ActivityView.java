package android.app;

public class ActivityView extends android.view.ViewGroup implements android.window.TaskEmbedder.Host {
    private static final java.lang.String TAG = "ActivityView";
    private android.window.TaskEmbedder mTaskEmbedder;
    private final android.view.SurfaceView mSurfaceView = null;
    private final android.app.ActivityView.SurfaceCallback mSurfaceCallback = null;
    private boolean mOpened;
    private final android.view.SurfaceControl.Transaction mTmpTransaction = null;
    private final android.graphics.Point mWindowPosition = null;
    private final int[] mTmpArray = null;
    private final android.graphics.Rect mTmpRect = null;
    private final android.graphics.Matrix mScreenSurfaceMatrix = null;
    private final android.graphics.Region mTapExcludeRegion = null;
    public ActivityView(android.content.Context p0) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3, boolean p4) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3, boolean p4, boolean p5) { super((android.content.Context)null); }
    public ActivityView(android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3, boolean p4, boolean p5, boolean p6) { super((android.content.Context)null); }
    public void setCallback(android.app.ActivityView.StateCallback p0) {}
    public void setCornerRadius(float p0) {}
    public float getCornerRadius() { return 0.0f; }
    public void setSurfaceClippingEnabled(boolean p0) {}
    public void setSurfaceClipBounds(android.graphics.Rect p0) {}
    public boolean getSurfaceClipBounds(android.graphics.Rect p0) { return false; }
    public void startShortcutActivity(android.content.pm.ShortcutInfo p0, android.app.ActivityOptions p1, android.graphics.Rect p2) {}
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1) {}
    public void startActivity(android.app.PendingIntent p0) {}
    public void startActivity(android.app.PendingIntent p0, android.content.Intent p1, android.app.ActivityOptions p2) {}
    public void release() {}
    public void onLocationChanged() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void setAlpha(float p0) {}
    public float getAlpha() { return 0.0f; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public int getVirtualDisplayId() { return 0; }
    public android.hardware.display.VirtualDisplay getVirtualDisplay() { return null; }
    public void performBackPress() {}
    private boolean initTaskEmbedder(android.view.SurfaceControl p0) { return false; }
    private void performRelease() {}
    protected void finalize() throws java.lang.Throwable {}
    public void setForwardedInsets(android.graphics.Insets p0) {}
    public void onTaskBackgroundColorChanged(android.window.TaskEmbedder p0, int p1) {}
    public android.graphics.Region getTapExcludeRegion() { return null; }
    public android.graphics.Matrix getScreenToTaskMatrix() { return null; }
    public android.graphics.Point getPositionInWindow() { return null; }
    public android.graphics.Rect getScreenBounds() { return null; }
    public android.view.IWindow getWindow() { return null; }
    public boolean canReceivePointerEvents() { return false; }
    protected boolean useTaskOrganizer() { return false; }

    public static abstract class StateCallback {
        public StateCallback() {}
        public abstract void onActivityViewReady(android.app.ActivityView p0);
        public abstract void onActivityViewDestroyed(android.app.ActivityView p0);
        public void onTaskCreated(int p0, android.content.ComponentName p1) {}
        public void onTaskVisibilityChanged(int p0, boolean p1) {}
        public void onTaskMovedToFront(int p0) {}
        public void onTaskRemovalStarted(int p0) {}
        public void onBackPressedOnTaskRoot(int p0) {}
    }

    private final class StateCallbackAdapter implements android.window.TaskEmbedder.Listener {
        private final android.app.ActivityView.StateCallback mCallback = null;
        private StateCallbackAdapter(android.app.ActivityView p0, android.app.ActivityView.StateCallback p1) {}
        public void onInitialized() {}
        public void onReleased() {}
        public void onTaskCreated(int p0, android.content.ComponentName p1) {}
        public void onTaskVisibilityChanged(int p0, boolean p1) {}
        public void onTaskMovedToFront(int p0) {}
        public void onTaskRemovalStarted(int p0) {}
        public void onBackPressedOnTaskRoot(int p0) {}
    }

    private class SurfaceCallback implements android.view.SurfaceHolder.Callback {
        private final android.view.DisplayInfo mTempDisplayInfo = null;
        private final android.util.DisplayMetrics mTempMetrics = null;
        private SurfaceCallback(android.app.ActivityView p0) {}
        public void surfaceCreated(android.view.SurfaceHolder p0) {}
        public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
        public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    }
}

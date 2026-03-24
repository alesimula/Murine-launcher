package android.view;

public final class WindowManagerImpl implements android.view.WindowManager {
    public final android.content.Context mContext = null;
    public WindowManagerImpl(android.content.Context p0) {}
    public android.view.WindowManagerImpl createLocalWindowManager(android.view.Window p0) { return null; }
    public android.view.WindowManagerImpl createPresentationWindowManager(android.content.Context p0) { return null; }
    public static android.view.WindowManager createWindowContextWindowManager(android.content.Context p0) { return null; }
    public void setDefaultToken(android.os.IBinder p0) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void removeView(android.view.View p0) {}
    public void removeViewImmediate(android.view.View p0) {}
    public void requestAppKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    public void requestImeKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    public android.view.Display getDefaultDisplay() { return null; }
    public android.graphics.Region getCurrentImeTouchRegion() { return null; }
    public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) {}
    public void setShouldShowSystemDecors(int p0, boolean p1) {}
    public boolean shouldShowSystemDecors(int p0) { return false; }
    public void setDisplayImePolicy(int p0, int p1) {}
    public int getDisplayImePolicy(int p0) { return 0; }
    public boolean isGlobalKey(int p0) { return false; }
    public android.view.WindowMetrics getCurrentWindowMetrics() { return null; }
    public android.view.WindowMetrics getMaximumWindowMetrics() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.view.WindowMetrics> getPossibleMaximumWindowMetrics(int p0) { return null; }
    public void holdLock(android.os.IBinder p0, int p1) {}
    public boolean isCrossWindowBlurEnabled() { return false; }
    public void addCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void addProposedRotationListener(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    public void removeProposedRotationListener(java.util.function.IntConsumer p0) {}
    public boolean isTaskSnapshotSupported() { return false; }
    public void registerTaskFpsCallback(int p0, java.util.concurrent.Executor p1, android.window.TaskFpsCallback p2) {}
    public void unregisterTaskFpsCallback(android.window.TaskFpsCallback p0) {}
    public android.graphics.Bitmap snapshotTaskForRecents(int p0) { return null; }
    @android.annotation.NonNull
    public android.os.IBinder getDefaultToken() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) { return null; }
    public boolean replaceContentOnDisplayWithMirror(int p0, android.view.Window p1) { return false; }
    public boolean replaceContentOnDisplayWithSc(int p0, android.view.SurfaceControl p1) { return false; }
    public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.TrustedPresentationThresholds p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void unregisterTrustedPresentationListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    @android.annotation.NonNull
    public android.window.InputTransferToken registerBatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.view.Choreographer p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    @android.annotation.NonNull
    public android.window.InputTransferToken registerUnbatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.os.Looper p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    public void unregisterSurfaceControlInputReceiver(android.view.SurfaceControl p0) {}
    @android.annotation.Nullable
    public android.os.IBinder getSurfaceControlInputClientToken(android.view.SurfaceControl p0) { return null; }
    public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) { return false; }
    public int addScreenRecordingCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { return 0; }
    public void removeScreenRecordingCallback(java.util.function.Consumer<java.lang.Integer> p0) {}

    private static class OnFpsCallbackListenerProxy extends android.window.ITaskFpsCallback.Stub {
        public void onFpsReported(float p0) {}
    }
}

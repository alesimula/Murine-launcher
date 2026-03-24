package android.service.games;

@android.annotation.SystemApi
public abstract class GameSession {
    final android.service.games.IGameSession mInterface = null;
    public GameSession() {}
    public void attach(android.service.games.IGameSessionController p0, int p1, android.content.Context p2, android.view.SurfaceControlViewHost p3, int p4, int p5) {}
    @android.annotation.Hide
    void doCreate() {}
    public void dispatchTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) {}
    public void moveToState(android.service.games.GameSession.LifecycleState p0) {}
    public void onCreate() {}
    public void onDestroy() {}
    public void onGameTaskFocusChanged(boolean p0) {}
    public void onTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) {}
    public void setTaskOverlayView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_ACTIVITY")
    public final boolean restartGame() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_ACTIVITY")
    public void takeScreenshot(java.util.concurrent.Executor p0, android.service.games.GameSession.ScreenshotCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_ACTIVITY")
    public final void startActivityFromGameSessionForResult(android.content.Intent p0, android.os.Bundle p1, java.util.concurrent.Executor p2, android.service.games.GameSessionActivityCallback p3) {}

    private static final class GameSessionRootView extends android.widget.FrameLayout {
        GameSessionRootView(android.content.Context p0, android.view.SurfaceControlViewHost p1) { super((android.content.Context)null); }
        protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    }

    public static enum LifecycleState {
        INITIALIZED,
        CREATED,
        TASK_FOCUSED,
        TASK_UNFOCUSED,
        DESTROYED;
    }

    public static interface ScreenshotCallback {
        public static final int ERROR_TAKE_SCREENSHOT_INTERNAL_ERROR = 0;
        public void onFailure(int p0);
        public void onSuccess();

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ScreenshotFailureStatus {
        }
    }
}

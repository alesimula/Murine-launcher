package android.service.dreams;

public abstract class DreamOverlayService extends android.app.Service {
    public DreamOverlayService() { super(); }
    public DreamOverlayService(java.util.concurrent.Executor p0) { super(); }
    public void onCreate() {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onStartDream(android.view.WindowManager.LayoutParams p0);
    public void onWakeUp() {}
    public void onComeToFront() {}
    public void onEndDream() {}
    public final void requestExit() {}
    @android.annotation.FlaggedApi("android.service.dreams.dream_wake_redirect")
    public final void redirectWake(boolean p0) {}
    @android.annotation.FlaggedApi("android.service.dreams.dream_wake_redirect")
    public void onWakeRequested() {}
    public final boolean shouldShowComplications() { return false; }
    public final android.content.ComponentName getDreamComponent() { return null; }

    private static class OverlayClient extends android.service.dreams.IDreamOverlayClient.Stub {
        android.service.dreams.IDreamOverlayCallback mDreamOverlayCallback;
        OverlayClient(android.service.dreams.DreamOverlayService p0) { super(); }
        public void startDream(android.view.WindowManager.LayoutParams p0, android.service.dreams.IDreamOverlayCallback p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void wakeUp() {}
        public void endDream() {}
        public void comeToFront() {}
        public void onWakeRequested() {}
    }
}

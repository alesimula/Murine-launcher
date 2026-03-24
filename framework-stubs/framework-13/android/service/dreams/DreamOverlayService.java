package android.service.dreams;

public abstract class DreamOverlayService extends android.app.Service {
    public DreamOverlayService() { super(); }
    public DreamOverlayService(java.util.concurrent.Executor p0) { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onStartDream(android.view.WindowManager.LayoutParams p0);
    public void onWakeUp(java.lang.Runnable p0) {}
    public void onEndDream() {}
    public final void requestExit() {}
    public final boolean shouldShowComplications() { return false; }
    public final android.content.ComponentName getDreamComponent() { return null; }

    private static class OverlayClient extends android.service.dreams.IDreamOverlayClient.Stub {
        android.service.dreams.IDreamOverlayCallback mDreamOverlayCallback;
        OverlayClient(android.service.dreams.DreamOverlayService p0) { super(); }
        public void startDream(android.view.WindowManager.LayoutParams p0, android.service.dreams.IDreamOverlayCallback p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void wakeUp() {}
        public void endDream() {}
    }
}

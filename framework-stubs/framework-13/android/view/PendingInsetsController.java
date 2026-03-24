package android.view;

public class PendingInsetsController implements android.view.WindowInsetsController {
    public PendingInsetsController() {}
    public void show(int p0) {}
    public void hide(int p0) {}
    public void setSystemBarsAppearance(int p0, int p1) {}
    public int getSystemBarsAppearance() { return 0; }
    public void setCaptionInsetsHeight(int p0) {}
    public void setSystemBarsBehavior(int p0) {}
    public int getSystemBarsBehavior() { return 0; }
    public void setAnimationsDisabled(boolean p0) {}
    public android.view.InsetsState getState() { return null; }
    public boolean isRequestedVisible(int p0) { return false; }
    public void addOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0) {}
    public void removeOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0) {}
    public void replayAndAttach(android.view.InsetsController p0) {}
    public void detach() {}
    public void setSystemDrivenInsetsAnimationLoggingListener(android.view.WindowInsetsAnimationControlListener p0) {}
    public void controlWindowInsetsAnimation(int p0, long p1, android.view.animation.Interpolator p2, android.os.CancellationSignal p3, android.view.WindowInsetsAnimationControlListener p4) {}

    private static class HideRequest implements android.view.PendingInsetsController.PendingRequest {
        public HideRequest(int p0) {}
        public void replay(android.view.InsetsController p0) {}
    }

    private static interface PendingRequest {
        public void replay(android.view.InsetsController p0);
    }

    private static class ShowRequest implements android.view.PendingInsetsController.PendingRequest {
        public ShowRequest(int p0) {}
        public void replay(android.view.InsetsController p0) {}
    }
}

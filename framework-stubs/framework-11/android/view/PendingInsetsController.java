package android.view;

public class PendingInsetsController implements android.view.WindowInsetsController {
    private static final int KEEP_BEHAVIOR = -1;
    private final java.util.ArrayList<android.view.PendingInsetsController.PendingRequest> mRequests = null;
    private int mAppearance;
    private int mAppearanceMask;
    private int mBehavior;
    private boolean mAnimationsDisabled;
    private final android.view.InsetsState mDummyState = null;
    private android.view.InsetsController mReplayedInsetsController;
    private java.util.ArrayList<android.view.WindowInsetsController.OnControllableInsetsChangedListener> mControllableInsetsChangedListeners;
    private int mCaptionInsetsHeight;
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
    public void controlWindowInsetsAnimation(int p0, long p1, android.view.animation.Interpolator p2, android.os.CancellationSignal p3, android.view.WindowInsetsAnimationControlListener p4) {}

    private static class HideRequest implements android.view.PendingInsetsController.PendingRequest {
        private final int mTypes = 0;
        public HideRequest(int p0) {}
        public void replay(android.view.InsetsController p0) {}
    }

    private static interface PendingRequest {
        public void replay(android.view.InsetsController p0);
    }

    private static class ShowRequest implements android.view.PendingInsetsController.PendingRequest {
        private final int mTypes = 0;
        public ShowRequest(int p0) {}
        public void replay(android.view.InsetsController p0) {}
    }
}

package android.view;

public interface InsetsAnimationControlRunner {
    public int getTypes();
    public int getControllingTypes();
    public void notifyControlRevoked(int p0);
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0);
    public void cancel();
    public android.view.WindowInsetsAnimation getAnimation();
    default public boolean controlsType(int p0) { return false; }
    public int getAnimationType();
    public android.view.inputmethod.ImeTracker.Token getStatsToken();
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1);
}

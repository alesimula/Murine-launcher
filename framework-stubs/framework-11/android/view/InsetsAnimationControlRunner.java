package android.view;

public interface InsetsAnimationControlRunner {
    public int getTypes();
    public void cancel();
    public android.view.WindowInsetsAnimation getAnimation();
    default public boolean controlsInternalType(int p0) { return false; }
    public int getAnimationType();
}

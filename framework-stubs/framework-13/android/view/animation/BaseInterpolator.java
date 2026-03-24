package android.view.animation;

public abstract class BaseInterpolator implements android.view.animation.Interpolator {
    public BaseInterpolator() {}
    public int getChangingConfiguration() { return 0; }
    void setChangingConfiguration(int p0) {}
}

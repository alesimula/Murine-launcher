package android.view;

@android.annotation.SuppressLint("NotCloseable")
public interface WindowInsetsAnimationController {
    @android.annotation.NonNull
    public android.graphics.Insets getHiddenStateInsets();
    @android.annotation.NonNull
    public android.graphics.Insets getShownStateInsets();
    @android.annotation.NonNull
    public android.graphics.Insets getCurrentInsets();
    public float getCurrentFraction();
    public float getCurrentAlpha();
    public int getTypes();
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2);
    public void finish(boolean p0);
    default public boolean isReady() { return false; }
    public boolean isFinished();
    public boolean isCancelled();
    public boolean hasZeroInsetsIme();
    public long getDurationMs();
    public android.view.animation.Interpolator getInsetsInterpolator();
}

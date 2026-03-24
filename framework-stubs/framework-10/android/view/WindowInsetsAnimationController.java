package android.view;

public interface WindowInsetsAnimationController {
    public android.graphics.Insets getHiddenStateInsets();
    public android.graphics.Insets getShownStateInsets();
    public android.graphics.Insets getCurrentInsets();
    public int getTypes();
    public void changeInsets(android.graphics.Insets p0);
    public void finish(int p0);
}

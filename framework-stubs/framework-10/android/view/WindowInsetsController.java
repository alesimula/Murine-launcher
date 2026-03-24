package android.view;

public interface WindowInsetsController {
    public void show(int p0);
    public void hide(int p0);
    public void controlWindowInsetsAnimation(int p0, android.view.WindowInsetsAnimationControlListener p1);
    default public void controlInputMethodAnimation(android.view.WindowInsetsAnimationControlListener p0) {}
    default public void showInputMethod() {}
    default public void hideInputMethod() {}
}

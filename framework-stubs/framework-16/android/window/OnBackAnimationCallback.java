package android.window;

public interface OnBackAnimationCallback extends android.window.OnBackInvokedCallback {
    default public void onBackStarted(android.window.BackEvent p0) {}
    default public void onBackProgressed(android.window.BackEvent p0) {}
    default public void onBackCancelled() {}
}

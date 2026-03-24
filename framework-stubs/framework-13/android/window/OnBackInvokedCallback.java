package android.window;

public interface OnBackInvokedCallback {
    default public void onBackStarted(android.window.BackEvent p0) {}
    default public void onBackProgressed(android.window.BackEvent p0) {}
    public void onBackInvoked();
    default public void onBackCancelled() {}
}

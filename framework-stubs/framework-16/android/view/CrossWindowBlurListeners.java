package android.view;

public final class CrossWindowBlurListeners {
    public static final boolean CROSS_WINDOW_BLUR_SUPPORTED = Boolean.valueOf(false);
    public static android.view.CrossWindowBlurListeners getInstance() { return null; }
    public boolean isCrossWindowBlurEnabled() { return false; }
    public void addListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void removeListener(java.util.function.Consumer<java.lang.Boolean> p0) {}

    private final class BlurEnabledListenerInternal extends android.view.ICrossWindowBlurEnabledListener.Stub {
        public void onCrossWindowBlurEnabledChanged(boolean p0) {}
    }
}

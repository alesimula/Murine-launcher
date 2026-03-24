package android.view;

public final class CrossWindowBlurListeners {
    private static final java.lang.String TAG = "CrossWindowBlurListeners";
    private static final java.lang.String BLUR_PROPERTY = "ro.surface_flinger.supports_background_blur";
    public static final boolean CROSS_WINDOW_BLUR_SUPPORTED = Boolean.valueOf(false);
    private static volatile android.view.CrossWindowBlurListeners sInstance;
    private static final java.lang.Object sLock = null;
    private final android.view.CrossWindowBlurListeners.BlurEnabledListenerInternal mListenerInternal = null;
    private final android.util.ArrayMap<java.util.function.Consumer<java.lang.Boolean>, java.util.concurrent.Executor> mListeners = null;
    private final android.os.Handler mMainHandler = null;
    private boolean mInternalListenerAttached;
    private boolean mCrossWindowBlurEnabled;
    private CrossWindowBlurListeners() {}
    public static android.view.CrossWindowBlurListeners getInstance() { return null; }
    public boolean isCrossWindowBlurEnabled() { return false; }
    public void addListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void removeListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    private void attachInternalListenerIfNeededLocked() {}
    private void notifyListener(java.util.function.Consumer<java.lang.Boolean> p0, java.util.concurrent.Executor p1, boolean p2) {}

    private final class BlurEnabledListenerInternal extends android.view.ICrossWindowBlurEnabledListener.Stub {
        private BlurEnabledListenerInternal(android.view.CrossWindowBlurListeners p0) { super(); }
        public void onCrossWindowBlurEnabledChanged(boolean p0) {}
    }
}

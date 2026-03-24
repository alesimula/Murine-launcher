package android.inputmethodservice;

final class NavigationBarController {
    NavigationBarController(android.inputmethodservice.InputMethodService p0) {}
    void updateTouchableInsets(android.inputmethodservice.InputMethodService.Insets p0, android.view.ViewTreeObserver.InternalInsetsInfo p1) {}
    void onSoftInputWindowCreated(android.inputmethodservice.SoftInputWindow p0) {}
    void onViewInitialized() {}
    void onWindowShown() {}
    void onDestroy() {}
    void onNavButtonFlagsChanged(int p0) {}
    java.lang.String toDebugString() { return null; }

    private static interface Callback {
        public static final android.inputmethodservice.NavigationBarController.Callback NOOP = null;
        default public void updateTouchableInsets(android.inputmethodservice.InputMethodService.Insets p0, android.view.ViewTreeObserver.InternalInsetsInfo p1) {}
        default public void onSoftInputWindowCreated(android.inputmethodservice.SoftInputWindow p0) {}
        default public void onViewInitialized() {}
        default public void onWindowShown() {}
        default public void onDestroy() {}
        default public void onNavButtonFlagsChanged(int p0) {}
        default public java.lang.String toDebugString() { return null; }
    }

    private static final class Impl implements android.inputmethodservice.NavigationBarController.Callback, android.view.Window.DecorCallback {
        android.graphics.Insets mLastInsets;
        Impl(android.inputmethodservice.InputMethodService p0) {}
        public void updateTouchableInsets(android.inputmethodservice.InputMethodService.Insets p0, android.view.ViewTreeObserver.InternalInsetsInfo p1) {}
        public void onSoftInputWindowCreated(android.inputmethodservice.SoftInputWindow p0) {}
        public void onViewInitialized() {}
        public void onDestroy() {}
        public void onWindowShown() {}
        public void onNavButtonFlagsChanged(int p0) {}
        public void onSystemBarAppearanceChanged(int p0) {}
        public boolean onDrawLegacyNavigationBarBackgroundChanged(boolean p0) { return false; }
        public java.lang.String toDebugString() { return null; }
    }
}

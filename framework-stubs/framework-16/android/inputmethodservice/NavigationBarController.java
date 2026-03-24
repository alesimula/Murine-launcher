package android.inputmethodservice;

final class NavigationBarController implements android.view.Window.DecorCallback, android.inputmethodservice.navigationbar.NavigationBarView.ButtonClickListener {
    NavigationBarController(android.inputmethodservice.InputMethodService p0) {}
    void updateInsets(android.inputmethodservice.InputMethodService.Insets p0) {}
    void updateTouchableInsets(android.inputmethodservice.InputMethodService.Insets p0, android.view.ViewTreeObserver.InternalInsetsInfo p1) {}
    void onSoftInputWindowCreated(android.inputmethodservice.SoftInputWindow p0) {}
    void onViewInitialized() {}
    void onDestroy() {}
    void onWindowShown() {}
    void onNavButtonFlagsChanged(int p0) {}
    public void onSystemBarAppearanceChanged(int p0) {}
    public boolean onDrawLegacyNavigationBarBackgroundChanged(boolean p0) { return false; }
    public void onImeSwitchButtonClick(android.view.View p0) {}
    public boolean onImeSwitchButtonLongClick(android.view.View p0) { return false; }
    boolean isShown() { return false; }
    java.lang.String toDebugString() { return null; }
}

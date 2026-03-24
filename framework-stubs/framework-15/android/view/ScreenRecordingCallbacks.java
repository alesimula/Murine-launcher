package android.view;

public final class ScreenRecordingCallbacks {
    static android.view.ScreenRecordingCallbacks getInstance() { return null; }
    @android.annotation.RequiresPermission("android.permission.DETECT_SCREEN_RECORDING")
    int addCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.DETECT_SCREEN_RECORDING")
    void removeCallback(java.util.function.Consumer<java.lang.Integer> p0) {}
}

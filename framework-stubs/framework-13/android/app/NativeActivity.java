package android.app;

public class NativeActivity extends android.app.Activity implements android.view.SurfaceHolder.Callback2, android.view.InputQueue.Callback, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public static final java.lang.String META_DATA_LIB_NAME = "android.app.lib_name";
    public static final java.lang.String META_DATA_FUNC_NAME = "android.app.func_name";
    final int[] mLocation = null;
    int mLastContentX;
    int mLastContentY;
    int mLastContentWidth;
    int mLastContentHeight;
    public NativeActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onPause() {}
    protected void onResume() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onStart() {}
    protected void onStop() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void surfaceRedrawNeeded(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    public void onInputQueueCreated(android.view.InputQueue p0) {}
    public void onInputQueueDestroyed(android.view.InputQueue p0) {}
    public void onGlobalLayout() {}
    void setWindowFlags(int p0, int p1) {}
    void setWindowFormat(int p0) {}
    void showIme(int p0) {}
    void hideIme(int p0) {}

    static class NativeContentView extends android.view.View {
        android.app.NativeActivity mActivity;
        public NativeContentView(android.content.Context p0) { super((android.content.Context)null); }
        public NativeContentView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    }
}

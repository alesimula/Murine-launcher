package android.widget;

public class ToastPresenter {
    private static final java.lang.String TAG = "ToastPresenter";
    private static final java.lang.String WINDOW_TITLE = "Toast";
    private static final long SHORT_DURATION_TIMEOUT = 4000L;
    private static final long LONG_DURATION_TIMEOUT = 7000L;
    public static final int TEXT_TOAST_LAYOUT = 17367351;
    private final android.content.Context mContext = null;
    private final android.content.res.Resources mResources = null;
    private final android.view.WindowManager mWindowManager = null;
    private final android.view.accessibility.IAccessibilityManager mAccessibilityManager = null;
    private final android.app.INotificationManager mNotificationManager = null;
    private final java.lang.String mPackageName = null;
    private final android.view.WindowManager.LayoutParams mParams = null;
    private android.view.View mView;
    private android.os.IBinder mToken;
    public static android.view.View getTextToastView(android.content.Context p0, java.lang.CharSequence p1) { return null; }
    public ToastPresenter(android.content.Context p0, android.view.accessibility.IAccessibilityManager p1, android.app.INotificationManager p2, java.lang.String p3) {}
    public java.lang.String getPackageName() { return null; }
    public android.view.WindowManager.LayoutParams getLayoutParams() { return null; }
    public android.view.View getView() { return null; }
    public android.os.IBinder getToken() { return null; }
    private android.view.WindowManager.LayoutParams createLayoutParams() { return null; }
    private void adjustLayoutParams(android.view.WindowManager.LayoutParams p0, android.os.IBinder p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8) {}
    public void updateLayoutParams(int p0, int p1, float p2, float p3, int p4) {}
    private void setShowForAllUsersIfApplicable(android.view.WindowManager.LayoutParams p0, java.lang.String p1) {}
    private boolean isCrossUserPackage(java.lang.String p0) { return false; }
    public void show(android.view.View p0, android.os.IBinder p1, android.os.IBinder p2, int p3, int p4, int p5, int p6, float p7, float p8, android.app.ITransientNotificationCallback p9) {}
    public void show(android.view.View p0, android.os.IBinder p1, android.os.IBinder p2, int p3, int p4, int p5, int p6, float p7, float p8, android.app.ITransientNotificationCallback p9, boolean p10) {}
    public void hide(android.app.ITransientNotificationCallback p0) {}
    public void trySendAccessibilityEvent(android.view.View p0, java.lang.String p1) {}
    private void addToastView() {}
}

package android.widget;

public class Toast {
    static final java.lang.String TAG = "Toast";
    static final boolean localLOGV = false;
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;
    private static final long CHANGE_TEXT_TOASTS_IN_THE_SYSTEM = 147798919L;
    private final android.os.Binder mToken = null;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    final android.widget.Toast.TN mTN = null;
    int mDuration;
    private final java.util.List<android.widget.Toast.Callback> mCallbacks = null;
    private android.view.View mNextView;
    private java.lang.CharSequence mText;
    private static android.app.INotificationManager sService;
    public Toast(android.content.Context p0) {}
    public Toast(android.content.Context p0, android.os.Looper p1) {}
    private android.os.Looper getLooper(android.os.Looper p0) { return null; }
    public void show() {}
    public void cancel() {}
    @java.lang.Deprecated
    public void setView(android.view.View p0) {}
    @java.lang.Deprecated
    public android.view.View getView() { return null; }
    public void setDuration(int p0) {}
    public int getDuration() { return 0; }
    public void setMargin(float p0, float p1) {}
    public float getHorizontalMargin() { return 0.0f; }
    public float getVerticalMargin() { return 0.0f; }
    public void setGravity(int p0, int p1, int p2) {}
    public int getGravity() { return 0; }
    public int getXOffset() { return 0; }
    public int getYOffset() { return 0; }
    private boolean isSystemRenderedTextToast() { return false; }
    public void addCallback(android.widget.Toast.Callback p0) {}
    public void removeCallback(android.widget.Toast.Callback p0) {}
    public android.view.WindowManager.LayoutParams getWindowParams() { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, java.lang.CharSequence p1, int p2) { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, android.os.Looper p1, java.lang.CharSequence p2, int p3) { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, int p1, int p2) throws android.content.res.Resources.NotFoundException { return null; }
    public void setText(int p0) {}
    public void setText(java.lang.CharSequence p0) {}
    private static android.app.INotificationManager getService() { return null; }

    public static abstract class Callback {
        public Callback() {}
        public void onToastShown() {}
        public void onToastHidden() {}
    }

    private static class CallbackBinder extends android.app.ITransientNotificationCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final java.util.List<android.widget.Toast.Callback> mCallbacks = null;
        private CallbackBinder(java.util.List<android.widget.Toast.Callback> p0, android.os.Handler p1) { super(); }
        public void onToastShown() {}
        public void onToastHidden() {}
        private java.util.List<android.widget.Toast.Callback> getCallbacks() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Duration {
    }

    private static class TN extends android.app.ITransientNotification.Stub {
        private final android.view.WindowManager.LayoutParams mParams = null;
        private static final int SHOW = 0;
        private static final int HIDE = 1;
        private static final int CANCEL = 2;
        final android.os.Handler mHandler = null;
        int mGravity;
        int mX;
        int mY;
        float mHorizontalMargin;
        float mVerticalMargin;
        android.view.View mView;
        android.view.View mNextView;
        int mDuration;
        android.view.WindowManager mWM;
        final java.lang.String mPackageName = null;
        final android.os.Binder mToken = null;
        private final android.widget.ToastPresenter mPresenter = null;
        private final java.util.List<android.widget.Toast.Callback> mCallbacks = null;
        TN(android.content.Context p0, java.lang.String p1, android.os.Binder p2, java.util.List<android.widget.Toast.Callback> p3, android.os.Looper p4) { super(); }
        private java.util.List<android.widget.Toast.Callback> getCallbacks() { return null; }
        public void show(android.os.IBinder p0) {}
        public void hide() {}
        public void cancel() {}
        public void handleShow(android.os.IBinder p0) {}
        public void handleHide() {}
    }
}

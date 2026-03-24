package android.widget;

public class Toast {
    static final java.lang.String TAG = "Toast";
    static final boolean localLOGV = false;
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;
    final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    final android.widget.Toast.TN mTN = null;
    @android.annotation.UnsupportedAppUsage
    int mDuration;
    android.view.View mNextView;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private static android.app.INotificationManager sService;
    public Toast(android.content.Context p0) {}
    public Toast(android.content.Context p0, android.os.Looper p1) {}
    public void show() {}
    public void cancel() {}
    public void setView(android.view.View p0) {}
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
    @android.annotation.UnsupportedAppUsage
    public android.view.WindowManager.LayoutParams getWindowParams() { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, java.lang.CharSequence p1, int p2) { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, android.os.Looper p1, java.lang.CharSequence p2, int p3) { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, int p1, int p2) throws android.content.res.Resources.NotFoundException { return null; }
    public void setText(int p0) {}
    public void setText(java.lang.CharSequence p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private static android.app.INotificationManager getService() { return null; }

    private static class TN extends android.app.ITransientNotification.Stub {
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
        private final android.view.WindowManager.LayoutParams mParams = null;
        private static final int SHOW = 0;
        private static final int HIDE = 1;
        private static final int CANCEL = 2;
        final android.os.Handler mHandler = null;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
        int mGravity;
        int mX;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
        int mY;
        float mHorizontalMargin;
        float mVerticalMargin;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
        android.view.View mView;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
        android.view.View mNextView;
        int mDuration;
        android.view.WindowManager mWM;
        java.lang.String mPackageName;
        static final long SHORT_DURATION_TIMEOUT = 4000L;
        static final long LONG_DURATION_TIMEOUT = 7000L;
        TN(java.lang.String p0, android.os.Looper p1) { super(); }
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public void show(android.os.IBinder p0) {}
        public void hide() {}
        public void cancel() {}
        public void handleShow(android.os.IBinder p0) {}
        private void trySendAccessibilityEvent() {}
        @android.annotation.UnsupportedAppUsage
        public void handleHide() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Duration {
    }
}

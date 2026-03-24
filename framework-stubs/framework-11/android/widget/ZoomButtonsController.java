package android.widget;

@java.lang.Deprecated
public class ZoomButtonsController implements android.view.View.OnTouchListener {
    private static final java.lang.String TAG = "ZoomButtonsController";
    private static final int ZOOM_CONTROLS_TIMEOUT = Integer.valueOf(0);
    private static final int ZOOM_CONTROLS_TOUCH_PADDING = 20;
    private int mTouchPaddingScaledSq;
    private final android.content.Context mContext = null;
    private final android.view.WindowManager mWindowManager = null;
    private boolean mAutoDismissControls;
    private final android.view.View mOwnerView = null;
    private final int[] mOwnerViewRawLocation = null;
    private final android.widget.FrameLayout mContainer = null;
    private android.view.WindowManager.LayoutParams mContainerLayoutParams;
    private final int[] mContainerRawLocation = null;
    private android.widget.ZoomControls mControls;
    private android.view.View mTouchTargetView;
    private final int[] mTouchTargetWindowLocation = null;
    private boolean mReleaseTouchListenerOnUp;
    private boolean mIsVisible;
    private final android.graphics.Rect mTempRect = null;
    private final int[] mTempIntArray = null;
    private android.widget.ZoomButtonsController.OnZoomListener mCallback;
    private java.lang.Runnable mPostedVisibleInitializer;
    private final android.content.IntentFilter mConfigurationChangedFilter = null;
    private final android.content.BroadcastReceiver mConfigurationChangedReceiver = null;
    private static final int MSG_POST_CONFIGURATION_CHANGED = 2;
    private static final int MSG_DISMISS_ZOOM_CONTROLS = 3;
    private static final int MSG_POST_SET_VISIBLE = 4;
    private final android.os.Handler mHandler = null;
    public ZoomButtonsController(android.view.View p0) {}
    public void setZoomInEnabled(boolean p0) {}
    public void setZoomOutEnabled(boolean p0) {}
    public void setZoomSpeed(long p0) {}
    private android.widget.FrameLayout createContainer() { return null; }
    public void setOnZoomListener(android.widget.ZoomButtonsController.OnZoomListener p0) {}
    public void setFocusable(boolean p0) {}
    public boolean isAutoDismissed() { return false; }
    public void setAutoDismissed(boolean p0) {}
    public boolean isVisible() { return false; }
    public void setVisible(boolean p0) {}
    public android.view.ViewGroup getContainer() { return null; }
    public android.view.View getZoomControls() { return null; }
    private void dismissControlsDelayed(int p0) {}
    private void refreshPositioningVariables() {}
    private boolean onContainerKey(android.view.KeyEvent p0) { return false; }
    private boolean isInterestingKey(int p0) { return false; }
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    private void setTouchTargetView(android.view.View p0) {}
    private android.view.View findViewForTouch(int p0, int p1) { return null; }
    private void onPostConfigurationChanged() {}

    private class Container extends android.widget.FrameLayout {
        public Container(android.widget.ZoomButtonsController p0, android.content.Context p1) { super((android.content.Context)null); }
        public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    }

    public static interface OnZoomListener {
        public void onVisibilityChanged(boolean p0);
        public void onZoom(boolean p0);
    }
}

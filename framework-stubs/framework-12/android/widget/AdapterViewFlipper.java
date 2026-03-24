package android.widget;

@android.widget.RemoteViews.RemoteView
public class AdapterViewFlipper extends android.widget.AdapterViewAnimator {
    private static final java.lang.String TAG = "ViewFlipper";
    private static final boolean LOGD = false;
    private static final int DEFAULT_INTERVAL = 10000;
    private int mFlipInterval;
    private boolean mAutoStart;
    private boolean mRunning;
    private boolean mStarted;
    private boolean mVisible;
    private boolean mUserPresent;
    private boolean mAdvancedByHost;
    private final android.content.BroadcastReceiver mReceiver = null;
    private final java.lang.Runnable mFlipRunnable = null;
    public AdapterViewFlipper(android.content.Context p0) { super((android.content.Context)null); }
    public AdapterViewFlipper(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AdapterViewFlipper(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AdapterViewFlipper(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void setAdapter(android.widget.Adapter p0) {}
    public int getFlipInterval() { return 0; }
    public void setFlipInterval(int p0) {}
    public void startFlipping() {}
    public void stopFlipping() {}
    @android.view.RemotableViewMethod
    public void showNext() {}
    @android.view.RemotableViewMethod
    public void showPrevious() {}
    private void updateRunning() {}
    private void updateRunning(boolean p0) {}
    public boolean isFlipping() { return false; }
    public void setAutoStart(boolean p0) {}
    public boolean isAutoStart() { return false; }
    public void fyiWillBeAdvancedByHostKThx() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
}

package android.widget;

@android.widget.RemoteViews.RemoteView
public class ViewFlipper extends android.widget.ViewAnimator {
    private static final java.lang.String TAG = "ViewFlipper";
    private static final boolean LOGD = false;
    private static final int DEFAULT_INTERVAL = 3000;
    private int mFlipInterval;
    private boolean mAutoStart;
    private boolean mRunning;
    private boolean mStarted;
    private boolean mVisible;
    private boolean mUserPresent;
    private final android.content.BroadcastReceiver mReceiver = null;
    private final java.lang.Runnable mFlipRunnable = null;
    public ViewFlipper(android.content.Context p0) { super((android.content.Context)null); }
    public ViewFlipper(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setFlipInterval(int p0) {}
    public int getFlipInterval() { return 0; }
    public void startFlipping() {}
    public void stopFlipping() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    private void updateRunning() {}
    private void updateRunning(boolean p0) {}
    public boolean isFlipping() { return false; }
    public void setAutoStart(boolean p0) {}
    public boolean isAutoStart() { return false; }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ViewFlipper> {
        private boolean mPropertiesMapped;
        private int mAutoStartId;
        private int mFlipIntervalId;
        private int mFlippingId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ViewFlipper p0, android.view.inspector.PropertyReader p1) {}
    }
}

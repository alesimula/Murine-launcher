package android.view.contentcapture;

public final class MainContentCaptureSession extends android.view.contentcapture.ContentCaptureSession {
    private static final java.lang.String TAG = null;
    private static final boolean FORCE_FLUSH = true;
    private static final int MSG_FLUSH = 1;
    public static final java.lang.String EXTRA_BINDER = "binder";
    public static final java.lang.String EXTRA_ENABLED_STATE = "enabled";
    private final java.util.concurrent.atomic.AtomicBoolean mDisabled = null;
    private final android.content.Context mContext = null;
    private final android.view.contentcapture.ContentCaptureManager mManager = null;
    private final android.os.Handler mHandler = null;
    private final android.view.contentcapture.IContentCaptureManager mSystemServerInterface = null;
    private android.view.contentcapture.IContentCaptureDirectManager mDirectServiceInterface;
    private android.os.IBinder.DeathRecipient mDirectServiceVulture;
    private int mState;
    private android.os.IBinder mApplicationToken;
    private android.content.ComponentName mComponentName;
    private java.util.ArrayList<android.view.contentcapture.ContentCaptureEvent> mEvents;
    private long mNextFlush;
    private boolean mNextFlushForTextChanged;
    private final android.util.LocalLog mFlushHistory = null;
    private final com.android.internal.os.IResultReceiver.Stub mSessionStateReceiver = null;
    protected MainContentCaptureSession(android.content.Context p0, android.view.contentcapture.ContentCaptureManager p1, android.os.Handler p2, android.view.contentcapture.IContentCaptureManager p3) { super(); }
    android.view.contentcapture.MainContentCaptureSession getMainCaptureSession() { return null; }
    android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    void start(android.os.IBinder p0, android.content.ComponentName p1, int p2) {}
    void onDestroy() {}
    private void onSessionStarted(int p0, android.os.IBinder p1) {}
    private void sendEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    private void sendEvent(android.view.contentcapture.ContentCaptureEvent p0, boolean p1) {}
    private boolean hasStarted() { return false; }
    private void scheduleFlush(int p0, boolean p1) {}
    private void flushIfNeeded(int p0) {}
    void flush(int p0) {}
    public void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    private android.content.pm.ParceledListSlice<android.view.contentcapture.ContentCaptureEvent> clearEvents() { return null; }
    private void destroySession() {}
    private void resetSession(int p0) {}
    void internalNotifyViewAppeared(android.view.contentcapture.ViewNode.ViewStructureImpl p0) {}
    void internalNotifyViewDisappeared(android.view.autofill.AutofillId p0) {}
    void internalNotifyViewTextChanged(android.view.autofill.AutofillId p0, java.lang.CharSequence p1) {}
    public void internalNotifyViewTreeEvent(boolean p0) {}
    boolean isContentCaptureEnabled() { return false; }
    boolean isDisabled() { return false; }
    boolean setDisabled(boolean p0) { return false; }
    void notifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2) {}
    void notifyChildSessionFinished(int p0, int p1) {}
    void notifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1) {}
    public void notifyViewDisappeared(int p0, android.view.autofill.AutofillId p1) {}
    void notifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2) {}
    public void notifyViewTreeEvent(int p0, boolean p1) {}
    public void notifySessionLifecycle(boolean p0) {}
    void notifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1) {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    private java.lang.String getActivityName() { return null; }
    private java.lang.String getDebugState() { return null; }
    private java.lang.String getDebugState(int p0) { return null; }
}

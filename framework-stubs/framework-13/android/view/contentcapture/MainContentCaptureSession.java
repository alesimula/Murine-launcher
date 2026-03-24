package android.view.contentcapture;

public final class MainContentCaptureSession extends android.view.contentcapture.ContentCaptureSession {
    public static final java.lang.String EXTRA_BINDER = "binder";
    public static final java.lang.String EXTRA_ENABLED_STATE = "enabled";
    protected MainContentCaptureSession(android.view.contentcapture.ContentCaptureManager.StrippedContext p0, android.view.contentcapture.ContentCaptureManager p1, android.os.Handler p2, android.view.contentcapture.IContentCaptureManager p3) { super(); }
    android.view.contentcapture.MainContentCaptureSession getMainCaptureSession() { return null; }
    android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    void start(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) {}
    void onDestroy() {}
    void flush(int p0) {}
    public void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    void internalNotifyViewAppeared(android.view.contentcapture.ViewNode.ViewStructureImpl p0) {}
    void internalNotifyViewDisappeared(android.view.autofill.AutofillId p0) {}
    void internalNotifyViewTextChanged(android.view.autofill.AutofillId p0, java.lang.CharSequence p1) {}
    void internalNotifyViewInsetsChanged(android.graphics.Insets p0) {}
    public void internalNotifyViewTreeEvent(boolean p0) {}
    public void internalNotifySessionResumed() {}
    public void internalNotifySessionPaused() {}
    boolean isContentCaptureEnabled() { return false; }
    boolean isDisabled() { return false; }
    boolean setDisabled(boolean p0) { return false; }
    void notifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2) {}
    void notifyChildSessionFinished(int p0, int p1) {}
    void notifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1) {}
    public void notifyViewDisappeared(int p0, android.view.autofill.AutofillId p1) {}
    void notifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2) {}
    public void notifyViewInsetsChanged(int p0, android.graphics.Insets p1) {}
    public void notifyViewTreeEvent(int p0, boolean p1) {}
    void notifySessionResumed(int p0) {}
    void notifySessionPaused(int p0) {}
    void notifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1) {}
    public void notifyWindowBoundsChanged(int p0, android.graphics.Rect p1) {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    private static class SessionStateReceiver extends com.android.internal.os.IResultReceiver.Stub {
        SessionStateReceiver(android.view.contentcapture.MainContentCaptureSession p0) { super(); }
        public void send(int p0, android.os.Bundle p1) {}
    }
}

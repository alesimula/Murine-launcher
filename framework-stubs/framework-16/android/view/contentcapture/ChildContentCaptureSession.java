package android.view.contentcapture;

final class ChildContentCaptureSession extends android.view.contentcapture.ContentCaptureSession {
    protected ChildContentCaptureSession(android.view.contentcapture.ContentCaptureSession p0, android.view.contentcapture.ContentCaptureContext p1) { super(); }
    android.view.contentcapture.ContentCaptureSession getMainCaptureSession() { return null; }
    void start(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) {}
    boolean isDisabled() { return false; }
    boolean setDisabled(boolean p0) { return false; }
    android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    void flush(int p0) {}
    public void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    void onDestroy() {}
    void internalNotifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2) {}
    void internalNotifyChildSessionFinished(int p0, int p1) {}
    void internalNotifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1) {}
    void internalNotifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1) {}
    void internalNotifyViewDisappeared(int p0, android.view.autofill.AutofillId p1) {}
    void internalNotifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2) {}
    void internalNotifyViewInsetsChanged(int p0, android.graphics.Insets p1) {}
    public void internalNotifyViewTreeEvent(int p0, boolean p1) {}
    void internalNotifySessionResumed() {}
    void internalNotifySessionPaused() {}
    void internalNotifySessionFlushEvent(int p0) {}
    boolean isContentCaptureEnabled() { return false; }
    public void notifyWindowBoundsChanged(int p0, android.graphics.Rect p1) {}
    public void notifyContentCaptureEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
}

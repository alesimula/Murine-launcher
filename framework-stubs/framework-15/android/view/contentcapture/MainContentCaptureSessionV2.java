package android.view.contentcapture;

public final class MainContentCaptureSessionV2 extends android.view.contentcapture.ContentCaptureSession {
    @android.annotation.Nullable
    public android.view.contentcapture.IContentCaptureDirectManager mDirectServiceInterface;
    @android.annotation.Nullable
    public android.content.ComponentName mComponentName;
    @android.annotation.NonNull
    public final java.util.concurrent.ConcurrentLinkedQueue<android.view.contentcapture.ContentCaptureEvent> mEventProcessQueue = null;
    @android.annotation.Nullable
    public java.util.ArrayList<android.view.contentcapture.ContentCaptureEvent> mEvents;
    @android.annotation.Nullable
    public android.view.contentprotection.ContentProtectionEventProcessor mContentProtectionEventProcessor;
    public MainContentCaptureSessionV2(android.view.contentcapture.ContentCaptureManager.StrippedContext p0, android.view.contentcapture.ContentCaptureManager p1, android.os.Handler p2, android.os.Handler p3, android.view.contentcapture.IContentCaptureManager p4) { super(); }
    android.view.contentcapture.ContentCaptureSession getMainCaptureSession() { return null; }
    android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    void start(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) {}
    void onDestroy() {}
    public void onSessionStarted(int p0, android.os.IBinder p1) {}
    public void sendEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    public void flush(int p0) {}
    public void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    public void destroySession() {}
    public void resetSession(int p0) {}
    void internalNotifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1) {}
    void internalNotifyViewDisappeared(int p0, android.view.autofill.AutofillId p1) {}
    void internalNotifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2) {}
    void internalNotifyViewInsetsChanged(int p0, android.graphics.Insets p1) {}
    public void internalNotifyViewTreeEvent(int p0, boolean p1) {}
    public void internalNotifySessionResumed() {}
    public void internalNotifySessionPaused() {}
    boolean isContentCaptureEnabled() { return false; }
    boolean isDisabled() { return false; }
    boolean setDisabled(boolean p0) { return false; }
    void internalNotifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2) {}
    void internalNotifyChildSessionFinished(int p0, int p1) {}
    void internalNotifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1) {}
    public void notifyWindowBoundsChanged(int p0, android.graphics.Rect p1) {}
    public void notifyContentCaptureEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    private static class SessionStateReceiver extends com.android.internal.os.IResultReceiver.Stub {
        SessionStateReceiver(android.view.contentcapture.MainContentCaptureSessionV2 p0) { super(); }
        public void send(int p0, android.os.Bundle p1) {}
    }

    private static final class ViewStructureSession {
        ViewStructureSession() {}
        void setSession(android.view.contentcapture.ContentCaptureSession p0) {}
        void setStructure(android.view.ViewStructure p0) {}
        void notifyViewAppeared() {}
    }
}

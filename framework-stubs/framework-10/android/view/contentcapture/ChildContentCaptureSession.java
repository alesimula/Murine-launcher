package android.view.contentcapture;

final class ChildContentCaptureSession extends android.view.contentcapture.ContentCaptureSession {
    private final android.view.contentcapture.ContentCaptureSession mParent = null;
    protected ChildContentCaptureSession(android.view.contentcapture.ContentCaptureSession p0, android.view.contentcapture.ContentCaptureContext p1) { super(); }
    android.view.contentcapture.MainContentCaptureSession getMainCaptureSession() { return null; }
    android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    void flush(int p0) {}
    public void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    void onDestroy() {}
    void internalNotifyViewAppeared(android.view.contentcapture.ViewNode.ViewStructureImpl p0) {}
    void internalNotifyViewDisappeared(android.view.autofill.AutofillId p0) {}
    void internalNotifyViewTextChanged(android.view.autofill.AutofillId p0, java.lang.CharSequence p1) {}
    public void internalNotifyViewTreeEvent(boolean p0) {}
    boolean isContentCaptureEnabled() { return false; }
}

package android.view.contentcapture;

public abstract class ContentCaptureSession implements java.lang.AutoCloseable {
    public static final int UNKNOWN_STATE = 0;
    public static final int STATE_WAITING_FOR_SERVER = 1;
    public static final int STATE_ACTIVE = 2;
    public static final int STATE_DISABLED = 4;
    public static final int STATE_DUPLICATED_ID = 8;
    public static final int STATE_NO_SERVICE = 16;
    public static final int STATE_FLAG_SECURE = 32;
    public static final int STATE_BY_APP = 64;
    public static final int STATE_NO_RESPONSE = 128;
    public static final int STATE_INTERNAL_ERROR = 256;
    public static final int STATE_NOT_WHITELISTED = 512;
    public static final int STATE_SERVICE_DIED = 1024;
    public static final int STATE_SERVICE_UPDATING = 2048;
    public static final int STATE_SERVICE_RESURRECTED = 4096;
    public static final int FLUSH_REASON_FULL = 1;
    public static final int FLUSH_REASON_VIEW_ROOT_ENTERED = 2;
    public static final int FLUSH_REASON_SESSION_STARTED = 3;
    public static final int FLUSH_REASON_SESSION_FINISHED = 4;
    public static final int FLUSH_REASON_IDLE_TIMEOUT = 5;
    public static final int FLUSH_REASON_TEXT_CHANGE_TIMEOUT = 6;
    public static final int FLUSH_REASON_SESSION_CONNECTED = 7;
    public static final int FLUSH_REASON_FORCE_FLUSH = 8;
    public static final int FLUSH_REASON_VIEW_TREE_APPEARING = 9;
    public static final int FLUSH_REASON_VIEW_TREE_APPEARED = 10;
    protected final int mId = 0;
    protected ContentCaptureSession() {}
    public ContentCaptureSession(int p0) {}
    ContentCaptureSession(android.view.contentcapture.ContentCaptureContext p0) {}
    abstract android.view.contentcapture.MainContentCaptureSession getMainCaptureSession();
    public final android.view.contentcapture.ContentCaptureSessionId getContentCaptureSessionId() { return null; }
    public int getId() { return 0; }
    public final android.view.contentcapture.ContentCaptureSession createContentCaptureSession(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    abstract android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0);
    abstract void flush(int p0);
    public final void setContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
    abstract void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0);
    public final android.view.contentcapture.ContentCaptureContext getContentCaptureContext() { return null; }
    public final void destroy() {}
    abstract void onDestroy();
    public void close() {}
    public final void notifyViewAppeared(android.view.ViewStructure p0) {}
    abstract void internalNotifyViewAppeared(android.view.contentcapture.ViewNode.ViewStructureImpl p0);
    public final void notifyViewDisappeared(android.view.autofill.AutofillId p0) {}
    abstract void internalNotifyViewDisappeared(android.view.autofill.AutofillId p0);
    public final void notifyViewsDisappeared(android.view.autofill.AutofillId p0, long[] p1) {}
    public final void notifyViewTextChanged(android.view.autofill.AutofillId p0, java.lang.CharSequence p1) {}
    abstract void internalNotifyViewTextChanged(android.view.autofill.AutofillId p0, java.lang.CharSequence p1);
    public final void notifyViewInsetsChanged(android.graphics.Insets p0) {}
    abstract void internalNotifyViewInsetsChanged(android.graphics.Insets p0);
    public abstract void internalNotifyViewTreeEvent(boolean p0);
    public final void notifySessionResumed() {}
    abstract void internalNotifySessionResumed();
    public final void notifySessionPaused() {}
    abstract void internalNotifySessionPaused();
    public final android.view.ViewStructure newViewStructure(android.view.View p0) { return null; }
    public android.view.autofill.AutofillId newAutofillId(android.view.autofill.AutofillId p0, long p1) { return null; }
    public final android.view.ViewStructure newVirtualViewStructure(android.view.autofill.AutofillId p0, long p1) { return null; }
    boolean isContentCaptureEnabled() { return false; }
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public java.lang.String toString() { return null; }
    protected static java.lang.String getStateAsString(int p0) { return null; }
    public static java.lang.String getFlushReasonAsString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlushReason {
    }
}

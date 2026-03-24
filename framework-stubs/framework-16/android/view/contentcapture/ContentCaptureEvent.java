package android.view.contentcapture;

@android.annotation.SystemApi
public final class ContentCaptureEvent implements android.os.Parcelable {
    public static final int TYPE_SESSION_FINISHED = -2;
    public static final int TYPE_SESSION_STARTED = -1;
    public static final int TYPE_VIEW_APPEARED = 1;
    public static final int TYPE_VIEW_DISAPPEARED = 2;
    public static final int TYPE_VIEW_TEXT_CHANGED = 3;
    public static final int TYPE_VIEW_TREE_APPEARING = 4;
    public static final int TYPE_VIEW_TREE_APPEARED = 5;
    public static final int TYPE_CONTEXT_UPDATED = 6;
    public static final int TYPE_SESSION_RESUMED = 7;
    public static final int TYPE_SESSION_PAUSED = 8;
    public static final int TYPE_VIEW_INSETS_CHANGED = 9;
    public static final int TYPE_WINDOW_BOUNDS_CHANGED = 10;
    @android.annotation.FlaggedApi("android.view.contentcapture.flags.ccapi_baklava_enabled")
    public static final int TYPE_SESSION_FLUSH = 11;
    public static final int MAX_INVALID_VALUE = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.contentcapture.ContentCaptureEvent> CREATOR = null;
    public ContentCaptureEvent(int p0, int p1, long p2) {}
    public ContentCaptureEvent(int p0, int p1) {}
    public android.view.contentcapture.ContentCaptureEvent setAutofillId(android.view.autofill.AutofillId p0) { return null; }
    public android.view.contentcapture.ContentCaptureEvent setAutofillIds(java.util.ArrayList<android.view.autofill.AutofillId> p0) { return null; }
    public android.view.contentcapture.ContentCaptureEvent addAutofillId(android.view.autofill.AutofillId p0) { return null; }
    public android.view.contentcapture.ContentCaptureEvent setParentSessionId(int p0) { return null; }
    public android.view.contentcapture.ContentCaptureEvent setClientContext(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    @android.annotation.NonNull
    public int getSessionId() { return 0; }
    @android.annotation.Nullable
    public int getParentSessionId() { return 0; }
    @android.annotation.Nullable
    public android.view.contentcapture.ContentCaptureContext getContentCaptureContext() { return null; }
    @android.annotation.NonNull
    public android.view.contentcapture.ContentCaptureEvent setViewNode(android.view.contentcapture.ViewNode p0) { return null; }
    @android.annotation.NonNull
    public android.view.contentcapture.ContentCaptureEvent setText(java.lang.CharSequence p0) { return null; }
    @android.annotation.NonNull
    public android.view.contentcapture.ContentCaptureEvent setComposingIndex(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public boolean hasComposingSpan() { return false; }
    @android.annotation.NonNull
    public android.view.contentcapture.ContentCaptureEvent setSelectionIndex(int p0, int p1) { return null; }
    boolean hasSameComposingSpan(android.view.contentcapture.ContentCaptureEvent p0) { return false; }
    boolean hasSameSelectionSpan(android.view.contentcapture.ContentCaptureEvent p0) { return false; }
    @android.annotation.NonNull
    public android.view.contentcapture.ContentCaptureEvent setInsets(android.graphics.Insets p0) { return null; }
    @android.annotation.NonNull
    public android.view.contentcapture.ContentCaptureEvent setBounds(android.graphics.Rect p0) { return null; }
    public int getType() { return 0; }
    public long getEventTime() { return 0L; }
    @android.annotation.Nullable
    public android.view.contentcapture.ViewNode getViewNode() { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillId getId() { return null; }
    @android.annotation.Nullable
    public java.util.List<android.view.autofill.AutofillId> getIds() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getText() { return null; }
    @android.annotation.Nullable
    public android.graphics.Insets getInsets() { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect getBounds() { return null; }
    public void mergeEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    public void dump(java.io.PrintWriter p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.lang.String getTypeAsString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}

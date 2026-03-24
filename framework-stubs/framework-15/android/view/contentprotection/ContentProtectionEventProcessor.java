package android.view.contentprotection;

public class ContentProtectionEventProcessor {
    @android.annotation.Nullable
    public java.time.Instant mLastFlushTime;
    public ContentProtectionEventProcessor(com.android.internal.util.RingBuffer<android.view.contentcapture.ContentCaptureEvent> p0, android.os.Handler p1, android.view.contentcapture.IContentCaptureManager p2, java.lang.String p3, android.content.ContentCaptureOptions.ContentProtectionOptions p4) {}
    public void processEvent(android.view.contentcapture.ContentCaptureEvent p0) {}

    private static final class SearchGroup {
        public boolean mFound;
        SearchGroup(java.util.List<java.lang.String> p0) {}
        public boolean matches(java.lang.String p0) { return false; }
    }
}

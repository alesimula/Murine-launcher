package android.media.metrics;

public final class EditingSession implements java.lang.AutoCloseable {
    public EditingSession(java.lang.String p0, android.media.metrics.MediaMetricsManager p1) {}
    @android.annotation.FlaggedApi("com.android.media.editing.flags.add_media_metrics_editing")
    public void reportEditingEndedEvent(android.media.metrics.EditingEndedEvent p0) {}
    @android.annotation.NonNull
    public android.media.metrics.LogSessionId getSessionId() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void close() {}
}

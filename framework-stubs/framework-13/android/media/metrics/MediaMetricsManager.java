package android.media.metrics;

public final class MediaMetricsManager {
    public static final long INVALID_TIMESTAMP = -1L;
    public MediaMetricsManager(android.media.metrics.IMediaMetricsManager p0, int p1) {}
    public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.PlaybackMetrics p1) {}
    public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1) {}
    public void reportNetworkEvent(java.lang.String p0, android.media.metrics.NetworkEvent p1) {}
    public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.PlaybackStateEvent p1) {}
    public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.TrackChangeEvent p1) {}
    public android.media.metrics.PlaybackSession createPlaybackSession() { return null; }
    public android.media.metrics.RecordingSession createRecordingSession() { return null; }
    public android.media.metrics.TranscodingSession createTranscodingSession() { return null; }
    public android.media.metrics.EditingSession createEditingSession() { return null; }
    public android.media.metrics.BundleSession createBundleSession() { return null; }
    public void releaseSessionId(java.lang.String p0) {}
    public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.PlaybackErrorEvent p1) {}
}

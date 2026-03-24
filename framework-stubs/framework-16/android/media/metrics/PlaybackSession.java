package android.media.metrics;

public final class PlaybackSession implements java.lang.AutoCloseable {
    public PlaybackSession(java.lang.String p0, android.media.metrics.MediaMetricsManager p1) {}
    public void reportPlaybackMetrics(android.media.metrics.PlaybackMetrics p0) {}
    public void reportPlaybackErrorEvent(android.media.metrics.PlaybackErrorEvent p0) {}
    public void reportNetworkEvent(android.media.metrics.NetworkEvent p0) {}
    public void reportPlaybackStateEvent(android.media.metrics.PlaybackStateEvent p0) {}
    public void reportTrackChangeEvent(android.media.metrics.TrackChangeEvent p0) {}
    @android.annotation.NonNull
    public android.media.metrics.LogSessionId getSessionId() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void close() {}
}

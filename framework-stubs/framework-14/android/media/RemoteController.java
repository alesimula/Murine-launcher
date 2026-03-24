package android.media;

@java.lang.Deprecated
public final class RemoteController {
    public static final int POSITION_SYNCHRONIZATION_NONE = 0;
    public static final int POSITION_SYNCHRONIZATION_CHECK = 1;
    public RemoteController(android.content.Context p0, android.media.RemoteController.OnClientUpdateListener p1) throws java.lang.IllegalArgumentException {}
    public RemoteController(android.content.Context p0, android.media.RemoteController.OnClientUpdateListener p1, android.os.Looper p2) throws java.lang.IllegalArgumentException {}
    public long getEstimatedMediaPosition() { return 0L; }
    public boolean sendMediaKeyEvent(android.view.KeyEvent p0) throws java.lang.IllegalArgumentException { return false; }
    public boolean seekTo(long p0) throws java.lang.IllegalArgumentException { return false; }
    public boolean setArtworkConfiguration(boolean p0, int p1, int p2) throws java.lang.IllegalArgumentException { return false; }
    public boolean setArtworkConfiguration(int p0, int p1) throws java.lang.IllegalArgumentException { return false; }
    public boolean clearArtworkConfiguration() { return false; }
    public boolean setSynchronizationMode(int p0) throws java.lang.IllegalArgumentException { return false; }
    public android.media.RemoteController.MetadataEditor editMetadata() { return null; }
    void startListeningToSessions() {}
    void stopListeningToSessions() {}
    android.media.RemoteController.OnClientUpdateListener getUpdateListener() { return null; }

    public class MetadataEditor extends android.media.MediaMetadataEditor {
        protected MetadataEditor(android.media.RemoteController p0) { super(); }
        protected MetadataEditor(android.media.RemoteController p0, android.os.Bundle p1, long p2) { super(); }
        public synchronized void apply() {}
    }

    public static interface OnClientUpdateListener {
        public void onClientChange(boolean p0);
        public void onClientPlaybackStateUpdate(int p0);
        public void onClientPlaybackStateUpdate(int p0, long p1, long p2, float p3);
        public void onClientTransportControlUpdate(int p0);
        public void onClientMetadataUpdate(android.media.RemoteController.MetadataEditor p0);
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.RemoteController p0, android.media.RemoteController p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class MediaControllerCallback extends android.media.session.MediaController.Callback {
        public void onPlaybackStateChanged(android.media.session.PlaybackState p0) {}
        public void onMetadataChanged(android.media.MediaMetadata p0) {}
    }

    private static class PlaybackInfo {
        int mState;
        long mStateChangeTimeMs;
        long mCurrentPosMs;
        float mSpeed;
        PlaybackInfo(int p0, long p1, long p2, float p3) {}
    }

    private class TopTransportSessionListener implements android.media.session.MediaSessionManager.OnActiveSessionsChangedListener {
        public void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> p0) {}
    }
}

package android.media;

@java.lang.Deprecated
public class RemoteControlClient {
    private static final java.lang.String TAG = "RemoteControlClient";
    private static final boolean DEBUG = false;
    public static final int PLAYSTATE_STOPPED = 1;
    public static final int PLAYSTATE_PAUSED = 2;
    public static final int PLAYSTATE_PLAYING = 3;
    public static final int PLAYSTATE_FAST_FORWARDING = 4;
    public static final int PLAYSTATE_REWINDING = 5;
    public static final int PLAYSTATE_SKIPPING_FORWARDS = 6;
    public static final int PLAYSTATE_SKIPPING_BACKWARDS = 7;
    public static final int PLAYSTATE_BUFFERING = 8;
    public static final int PLAYSTATE_ERROR = 9;
    public static final int PLAYSTATE_NONE = 0;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    private static final int PLAYBACK_TYPE_MIN = 0;
    private static final int PLAYBACK_TYPE_MAX = 1;
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    public static final int PLAYBACKINFO_INVALID_VALUE = -2147483648;
    public static final long PLAYBACK_POSITION_INVALID = -1L;
    public static final long PLAYBACK_POSITION_ALWAYS_UNKNOWN = -9216204211029966080L;
    public static final float PLAYBACK_SPEED_1X = 1.0f;
    public static final int PLAYBACKINFO_PLAYBACK_TYPE = 1;
    public static final int PLAYBACKINFO_VOLUME = 2;
    public static final int PLAYBACKINFO_VOLUME_MAX = 3;
    public static final int PLAYBACKINFO_VOLUME_HANDLING = 4;
    public static final int PLAYBACKINFO_USES_STREAM = 5;
    public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
    public static final int FLAG_KEY_MEDIA_REWIND = 2;
    public static final int FLAG_KEY_MEDIA_PLAY = 4;
    public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
    public static final int FLAG_KEY_MEDIA_PAUSE = 16;
    public static final int FLAG_KEY_MEDIA_STOP = 32;
    public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
    public static final int FLAG_KEY_MEDIA_NEXT = 128;
    public static final int FLAG_KEY_MEDIA_POSITION_UPDATE = 256;
    public static final int FLAG_KEY_MEDIA_RATING = 512;
    public static final int FLAGS_KEY_MEDIA_NONE = 0;
    public static final int FLAG_INFORMATION_REQUEST_METADATA = 1;
    public static final int FLAG_INFORMATION_REQUEST_KEY_MEDIA = 2;
    public static final int FLAG_INFORMATION_REQUEST_PLAYSTATE = 4;
    public static final int FLAG_INFORMATION_REQUEST_ALBUM_ART = 8;
    private android.media.session.MediaSession mSession;
    @android.annotation.UnsupportedAppUsage
    public static int MEDIA_POSITION_READABLE;
    @android.annotation.UnsupportedAppUsage
    public static int MEDIA_POSITION_WRITABLE;
    public static final int DEFAULT_PLAYBACK_VOLUME_HANDLING = 1;
    public static final int DEFAULT_PLAYBACK_VOLUME = 15;
    private final java.lang.Object mCacheLock = null;
    private int mPlaybackState;
    private long mPlaybackStateChangeTimeMs;
    private long mPlaybackPositionMs;
    private float mPlaybackSpeed;
    private android.graphics.Bitmap mOriginalArtwork;
    private int mTransportControlFlags;
    private android.os.Bundle mMetadata;
    private android.media.RemoteControlClient.OnPlaybackPositionUpdateListener mPositionUpdateListener;
    private android.media.RemoteControlClient.OnGetPlaybackPositionListener mPositionProvider;
    private android.media.RemoteControlClient.OnMetadataUpdateListener mMetadataUpdateListener;
    private int mCurrentClientGenId;
    private final android.app.PendingIntent mRcMediaIntent = null;
    private boolean mNeedsPositionSync;
    private android.media.session.PlaybackState mSessionPlaybackState;
    private android.media.MediaMetadata mMediaMetadata;
    public static final int RCSE_ID_UNREGISTERED = -1;
    private android.media.session.MediaSession.Callback mTransportListener;
    private static final long POSITION_REFRESH_PERIOD_PLAYING_MS = 15000L;
    private static final long POSITION_REFRESH_PERIOD_MIN_MS = 2000L;
    private static final long POSITION_DRIFT_MAX_MS = 500L;
    public RemoteControlClient(android.app.PendingIntent p0) {}
    public RemoteControlClient(android.app.PendingIntent p0, android.os.Looper p1) {}
    public void registerWithSession(android.media.session.MediaSessionLegacyHelper p0) {}
    public void unregisterWithSession(android.media.session.MediaSessionLegacyHelper p0) {}
    public android.media.session.MediaSession getMediaSession() { return null; }
    public android.media.RemoteControlClient.MetadataEditor editMetadata(boolean p0) { return null; }
    public void setPlaybackState(int p0) {}
    public void setPlaybackState(int p0, long p1, float p2) {}
    private void setPlaybackStateInt(int p0, long p1, float p2, boolean p3) {}
    public void setTransportControlFlags(int p0) {}
    public void setMetadataUpdateListener(android.media.RemoteControlClient.OnMetadataUpdateListener p0) {}
    public void setPlaybackPositionUpdateListener(android.media.RemoteControlClient.OnPlaybackPositionUpdateListener p0) {}
    public void setOnGetPlaybackPositionListener(android.media.RemoteControlClient.OnGetPlaybackPositionListener p0) {}
    public android.app.PendingIntent getRcMediaIntent() { return null; }
    private void onSeekTo(int p0, long p1) {}
    private void onUpdateMetadata(int p0, int p1, java.lang.Object p2) {}
    static boolean playbackPositionShouldMove(int p0) { return false; }
    private static long getCheckPeriodFromSpeed(float p0) { return 0L; }
    private static int getStateFromRccState(int p0) { return 0; }
    static int getRccStateFromState(int p0) { return 0; }
    private static long getActionsFromRccControlFlags(int p0) { return 0L; }
    static int getRccControlFlagsFromActions(long p0) { return 0; }
    private static long getActionForRccFlag(int p0) { return 0L; }
    private static int getRccFlagForAction(long p0) { return 0; }

    public static interface OnPlaybackPositionUpdateListener {
        public void onPlaybackPositionUpdate(long p0);
    }

    public static interface OnMetadataUpdateListener {
        public void onMetadataUpdate(int p0, java.lang.Object p1);
    }

    public static interface OnGetPlaybackPositionListener {
        public long onGetPlaybackPosition();
    }

    @java.lang.Deprecated
    public class MetadataEditor extends android.media.MediaMetadataEditor {
        public static final int BITMAP_KEY_ARTWORK = 100;
        public static final int METADATA_KEY_ARTWORK = 100;
        private MetadataEditor(android.media.RemoteControlClient p0) { super(); }
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
        public synchronized android.media.RemoteControlClient.MetadataEditor putString(int p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return null; }
        public synchronized android.media.RemoteControlClient.MetadataEditor putLong(int p0, long p1) throws java.lang.IllegalArgumentException { return null; }
        public synchronized android.media.RemoteControlClient.MetadataEditor putBitmap(int p0, android.graphics.Bitmap p1) throws java.lang.IllegalArgumentException { return null; }
        public synchronized android.media.RemoteControlClient.MetadataEditor putObject(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public synchronized void clear() {}
        public synchronized void apply() {}
    }
}

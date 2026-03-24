package android.media.session;

public class MediaSessionLegacyHelper {
    private static final java.lang.String TAG = "MediaSessionHelper";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.Object sLock = null;
    private static android.media.session.MediaSessionLegacyHelper sInstance;
    private android.content.Context mContext;
    private android.media.session.MediaSessionManager mSessionManager;
    private android.os.Handler mHandler;
    private android.util.ArrayMap<android.app.PendingIntent, android.media.session.MediaSessionLegacyHelper.SessionHolder> mSessions;
    private MediaSessionLegacyHelper(android.content.Context p0) {}
    @android.annotation.UnsupportedAppUsage
    public static android.media.session.MediaSessionLegacyHelper getHelper(android.content.Context p0) { return null; }
    public static android.os.Bundle getOldMetadata(android.media.MediaMetadata p0, int p1, int p2) { return null; }
    public android.media.session.MediaSession getSession(android.app.PendingIntent p0) { return null; }
    public void sendMediaButtonEvent(android.view.KeyEvent p0, boolean p1) {}
    public void sendVolumeKeyEvent(android.view.KeyEvent p0, int p1, boolean p2) {}
    public void sendAdjustVolumeBy(int p0, int p1, int p2) {}
    public boolean isGlobalPriorityActive() { return false; }
    public void addRccListener(android.app.PendingIntent p0, android.media.session.MediaSession.Callback p1) {}
    public void removeRccListener(android.app.PendingIntent p0) {}
    public void addMediaButtonListener(android.app.PendingIntent p0, android.content.ComponentName p1, android.content.Context p2) {}
    public void removeMediaButtonListener(android.app.PendingIntent p0) {}
    private static android.graphics.Bitmap scaleBitmapIfTooBig(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    private android.media.session.MediaSessionLegacyHelper.SessionHolder getHolder(android.app.PendingIntent p0, boolean p1) { return null; }
    private static void sendKeyEvent(android.app.PendingIntent p0, android.content.Context p1, android.content.Intent p2) {}

    private class SessionHolder {
        public final android.media.session.MediaSession mSession = null;
        public final android.app.PendingIntent mPi = null;
        public android.media.session.MediaSessionLegacyHelper.MediaButtonListener mMediaButtonListener;
        public android.media.session.MediaSession.Callback mRccListener;
        public int mFlags;
        public android.media.session.MediaSessionLegacyHelper.SessionHolder.SessionCallback mCb;
        public SessionHolder(android.media.session.MediaSessionLegacyHelper p0, android.media.session.MediaSession p1, android.app.PendingIntent p2) {}
        public void update() {}

        private class SessionCallback extends android.media.session.MediaSession.Callback {
            private SessionCallback(android.media.session.MediaSessionLegacyHelper.SessionHolder p0) { super(); }
            public boolean onMediaButtonEvent(android.content.Intent p0) { return false; }
            public void onPlay() {}
            public void onPause() {}
            public void onSkipToNext() {}
            public void onSkipToPrevious() {}
            public void onFastForward() {}
            public void onRewind() {}
            public void onStop() {}
            public void onSeekTo(long p0) {}
            public void onSetRating(android.media.Rating p0) {}
        }
    }

    private static final class MediaButtonListener extends android.media.session.MediaSession.Callback {
        private final android.app.PendingIntent mPendingIntent = null;
        private final android.content.Context mContext = null;
        public MediaButtonListener(android.app.PendingIntent p0, android.content.Context p1) { super(); }
        public boolean onMediaButtonEvent(android.content.Intent p0) { return false; }
        public void onPlay() {}
        public void onPause() {}
        public void onSkipToNext() {}
        public void onSkipToPrevious() {}
        public void onFastForward() {}
        public void onRewind() {}
        public void onStop() {}
        private void sendKeyEvent(int p0) {}
    }
}

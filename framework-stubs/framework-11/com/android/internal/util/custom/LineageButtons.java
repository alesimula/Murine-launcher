package com.android.internal.util.custom;

public final class LineageButtons {
    private final java.lang.String TAG = null;
    private static final int MSG_DISPATCH_VOLKEY_WITH_WAKELOCK = 1;
    private final android.content.Context mContext = null;
    private final com.android.internal.util.custom.LineageButtons.ButtonHandler mHandler = null;
    private boolean mIsLongPress;
    private boolean mVolBtnMusicControls;
    private final android.media.session.MediaSessionManager mMediaSessionManager = null;
    private static final java.lang.Object sInstanceLock = null;
    private static com.android.internal.util.custom.LineageButtons sInstance;
    public static com.android.internal.util.custom.LineageButtons getAttachedInstance(android.content.Context p0) { return null; }
    public LineageButtons(android.content.Context p0) {}
    public boolean handleVolumeKey(android.view.KeyEvent p0, boolean p1) { return false; }
    private void triggerKeyEvents(android.view.KeyEvent p0, android.media.session.MediaController p1) {}
    public void onSkipTrackEvent(android.view.KeyEvent p0) {}
    public void skipTrack() {}
    private int getMediaControllerPlaybackState(android.media.session.MediaController p0) { return 0; }

    private class ButtonHandler extends android.os.Handler {
        private ButtonHandler(com.android.internal.util.custom.LineageButtons p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    class SettingsObserver extends android.database.ContentObserver {
        SettingsObserver(com.android.internal.util.custom.LineageButtons p0, android.os.Handler p1) { super(null); }
        void observe() {}
        public void onChange(boolean p0) {}
        private void update() {}
    }
}

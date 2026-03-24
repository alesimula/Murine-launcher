package android.media.session;

public final class MediaSessionManager {
    private static final java.lang.String TAG = "SessionManager";
    public static final int RESULT_MEDIA_KEY_NOT_HANDLED = 0;
    public static final int RESULT_MEDIA_KEY_HANDLED = 1;
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<android.media.session.MediaSessionManager.OnActiveSessionsChangedListener, android.media.session.MediaSessionManager.SessionsChangedWrapper> mListeners = null;
    private final android.util.ArrayMap<android.media.session.MediaSessionManager.OnSession2TokensChangedListener, android.media.session.MediaSessionManager.Session2TokensChangedWrapper> mSession2TokensListeners = null;
    private final android.media.session.ISessionManager mService = null;
    private android.content.Context mContext;
    private android.media.session.MediaSessionManager.CallbackImpl mCallback;
    private android.media.session.MediaSessionManager.OnVolumeKeyLongPressListenerImpl mOnVolumeKeyLongPressListener;
    private android.media.session.MediaSessionManager.OnMediaKeyListenerImpl mOnMediaKeyListener;
    public MediaSessionManager(android.content.Context p0) {}
    public android.media.session.ISession createSession(android.media.session.MediaSession.CallbackStub p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    public void notifySession2Created(android.media.Session2Token p0) {}
    public java.util.List<android.media.session.MediaController> getActiveSessions(android.content.ComponentName p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.media.session.MediaController> getActiveSessionsForUser(android.content.ComponentName p0, int p1) { return null; }
    public java.util.List<android.media.Session2Token> getSession2Tokens() { return null; }
    public java.util.List<android.media.Session2Token> getSession2Tokens(int p0) { return null; }
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1) {}
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1, android.os.Handler p2) {}
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1, int p2, android.os.Handler p3) {}
    public void removeOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0) {}
    public void addOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0) {}
    public void addOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0, android.os.Handler p1) {}
    public void addOnSession2TokensChangedListener(int p0, android.media.session.MediaSessionManager.OnSession2TokensChangedListener p1, android.os.Handler p2) {}
    public void removeOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0) {}
    public void registerRemoteVolumeController(android.media.IRemoteVolumeController p0) {}
    public void unregisterRemoteVolumeController(android.media.IRemoteVolumeController p0) {}
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0) {}
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0, boolean p1) {}
    public void dispatchMediaKeyEventAsSystemService(android.view.KeyEvent p0) {}
    private void dispatchMediaKeyEventInternal(boolean p0, android.view.KeyEvent p1, boolean p2) {}
    public boolean dispatchMediaKeyEventAsSystemService(android.media.session.MediaSession.Token p0, android.view.KeyEvent p1) { return false; }
    public void dispatchVolumeKeyEvent(android.view.KeyEvent p0, int p1, boolean p2) {}
    public void dispatchVolumeKeyEventAsSystemService(android.view.KeyEvent p0, int p1) {}
    private void dispatchVolumeKeyEventInternal(boolean p0, android.view.KeyEvent p1, int p2, boolean p3) {}
    public void dispatchVolumeKeyEventAsSystemService(android.media.session.MediaSession.Token p0, android.view.KeyEvent p1) {}
    public void dispatchAdjustVolume(int p0, int p1, int p2) {}
    public boolean isTrustedForMediaControl(android.media.session.MediaSessionManager.RemoteUserInfo p0) { return false; }
    public boolean isGlobalPriorityActive() { return false; }
    @android.annotation.SystemApi
    public void setOnVolumeKeyLongPressListener(android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    public void setOnMediaKeyListener(android.media.session.MediaSessionManager.OnMediaKeyListener p0, android.os.Handler p1) {}
    public void setCallback(android.media.session.MediaSessionManager.Callback p0, android.os.Handler p1) {}

    private static final class SessionsChangedWrapper {
        private android.content.Context mContext;
        private android.media.session.MediaSessionManager.OnActiveSessionsChangedListener mListener;
        private android.os.Handler mHandler;
        private final android.media.session.IActiveSessionsListener.Stub mStub = null;
        public SessionsChangedWrapper(android.content.Context p0, android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p1, android.os.Handler p2) {}
        private void release() {}
    }

    private static final class Session2TokensChangedWrapper {
        private final android.media.session.MediaSessionManager.OnSession2TokensChangedListener mListener = null;
        private final android.os.Handler mHandler = null;
        private final android.media.session.ISession2TokensListener.Stub mStub = null;
        Session2TokensChangedWrapper(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0, android.os.Handler p1) {}
        public android.media.session.ISession2TokensListener.Stub getStub() { return null; }
    }

    public static final class RemoteUserInfo {
        private final java.lang.String mPackageName = null;
        private final int mPid = 0;
        private final int mUid = 0;
        public RemoteUserInfo(java.lang.String p0, int p1, int p2) {}
        public java.lang.String getPackageName() { return null; }
        public int getPid() { return 0; }
        public int getUid() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class OnVolumeKeyLongPressListenerImpl extends android.media.session.IOnVolumeKeyLongPressListener.Stub {
        private android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener mListener;
        private android.os.Handler mHandler;
        public OnVolumeKeyLongPressListenerImpl(android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener p0, android.os.Handler p1) { super(); }
        public void onVolumeKeyLongPress(android.view.KeyEvent p0) {}
    }

    @android.annotation.SystemApi
    public static interface OnVolumeKeyLongPressListener {
        public void onVolumeKeyLongPress(android.view.KeyEvent p0);
    }

    public static interface OnSession2TokensChangedListener {
        public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0);
    }

    private static final class OnMediaKeyListenerImpl extends android.media.session.IOnMediaKeyListener.Stub {
        private android.media.session.MediaSessionManager.OnMediaKeyListener mListener;
        private android.os.Handler mHandler;
        public OnMediaKeyListenerImpl(android.media.session.MediaSessionManager.OnMediaKeyListener p0, android.os.Handler p1) { super(); }
        public void onMediaKey(android.view.KeyEvent p0, android.os.ResultReceiver p1) {}
    }

    @android.annotation.SystemApi
    public static interface OnMediaKeyListener {
        public boolean onMediaKey(android.view.KeyEvent p0);
    }

    public static interface OnActiveSessionsChangedListener {
        public void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> p0);
    }

    private static final class CallbackImpl extends android.media.session.ICallback.Stub {
        private final android.media.session.MediaSessionManager.Callback mCallback = null;
        private final android.os.Handler mHandler = null;
        public CallbackImpl(android.media.session.MediaSessionManager.Callback p0, android.os.Handler p1) { super(); }
        public void onMediaKeyEventDispatchedToMediaSession(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) {}
        public void onMediaKeyEventDispatchedToMediaButtonReceiver(android.view.KeyEvent p0, android.content.ComponentName p1) {}
        public void onAddressedPlayerChangedToMediaSession(android.media.session.MediaSession.Token p0) {}
        public void onAddressedPlayerChangedToMediaButtonReceiver(android.content.ComponentName p0) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onMediaKeyEventDispatched(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1);
        public abstract void onMediaKeyEventDispatched(android.view.KeyEvent p0, android.content.ComponentName p1);
        public abstract void onAddressedPlayerChanged(android.media.session.MediaSession.Token p0);
        public abstract void onAddressedPlayerChanged(android.content.ComponentName p0);
    }
}

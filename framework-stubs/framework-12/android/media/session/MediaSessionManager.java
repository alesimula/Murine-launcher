package android.media.session;

public final class MediaSessionManager {
    private static final java.lang.String TAG = "SessionManager";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int RESULT_MEDIA_KEY_NOT_HANDLED = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int RESULT_MEDIA_KEY_HANDLED = 1;
    private final android.media.session.ISessionManager mService = null;
    private final android.media.MediaCommunicationManager mCommunicationManager = null;
    private final android.media.session.MediaSessionManager.OnMediaKeyEventDispatchedListenerStub mOnMediaKeyEventDispatchedListenerStub = null;
    private final android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListenerStub mOnMediaKeyEventSessionChangedListenerStub = null;
    private final android.media.session.MediaSessionManager.RemoteSessionCallbackStub mRemoteSessionCallbackStub = null;
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<android.media.session.MediaSessionManager.OnActiveSessionsChangedListener, android.media.session.MediaSessionManager.SessionsChangedWrapper> mListeners = null;
    private final android.util.ArrayMap<android.media.session.MediaSessionManager.OnSession2TokensChangedListener, android.media.session.MediaSessionManager.Session2TokensChangedWrapper> mSession2TokensListeners = null;
    private final java.util.Map<android.media.session.MediaSessionManager.OnMediaKeyEventDispatchedListener, java.util.concurrent.Executor> mOnMediaKeyEventDispatchedListeners = null;
    private final java.util.Map<android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener, java.util.concurrent.Executor> mMediaKeyEventSessionChangedCallbacks = null;
    private java.lang.String mCurMediaKeyEventSessionPackage;
    private android.media.session.MediaSession.Token mCurMediaKeyEventSession;
    private final java.util.Map<android.media.session.MediaSessionManager.RemoteSessionCallback, java.util.concurrent.Executor> mRemoteSessionCallbacks = null;
    private android.content.Context mContext;
    private android.media.session.MediaSessionManager.OnVolumeKeyLongPressListenerImpl mOnVolumeKeyLongPressListener;
    private android.media.session.MediaSessionManager.OnMediaKeyListenerImpl mOnMediaKeyListener;
    public MediaSessionManager(android.content.Context p0) {}
    public android.media.session.ISession createSession(android.media.session.MediaSession.CallbackStub p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    @java.lang.Deprecated
    public void notifySession2Created(android.media.Session2Token p0) {}
    public java.util.List<android.media.session.MediaController> getActiveSessions(android.content.ComponentName p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public android.media.session.MediaSession.Token getMediaKeyEventSession() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public java.lang.String getMediaKeyEventSessionPackageName() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("UserHandle")
    public java.util.List<android.media.session.MediaController> getActiveSessionsForUser(android.content.ComponentName p0, android.os.UserHandle p1) { return null; }
    private java.util.List<android.media.session.MediaController> getActiveSessionsForUser(android.content.ComponentName p0, int p1) { return null; }
    public java.util.List<android.media.Session2Token> getSession2Tokens() { return null; }
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1) {}
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1, android.os.Handler p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("UserHandle")
    public void addOnActiveSessionsChangedListener(android.content.ComponentName p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p3) {}
    private void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1, int p2, java.util.concurrent.Executor p3) {}
    public void removeOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0) {}
    public void addOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0) {}
    public void addOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0, android.os.Handler p1) {}
    @android.annotation.SuppressLint("UserHandle")
    public void addOnSession2TokensChangedListener(android.os.UserHandle p0, android.media.session.MediaSessionManager.OnSession2TokensChangedListener p1, java.util.concurrent.Executor p2) {}
    private void addOnSession2TokensChangedListener(int p0, android.media.session.MediaSessionManager.OnSession2TokensChangedListener p1, java.util.concurrent.Executor p2) {}
    public void removeOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void registerRemoteSessionCallback(java.util.concurrent.Executor p0, android.media.session.MediaSessionManager.RemoteSessionCallback p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void unregisterRemoteSessionCallback(android.media.session.MediaSessionManager.RemoteSessionCallback p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0, boolean p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchMediaKeyEventAsSystemService(android.view.KeyEvent p0) {}
    private void dispatchMediaKeyEventInternal(android.view.KeyEvent p0, boolean p1, boolean p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public boolean dispatchMediaKeyEventToSessionAsSystemService(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchVolumeKeyEvent(android.view.KeyEvent p0, int p1, boolean p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchVolumeKeyEventAsSystemService(android.view.KeyEvent p0, int p1) {}
    private void dispatchVolumeKeyEventInternal(android.view.KeyEvent p0, int p1, boolean p2, boolean p3) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchVolumeKeyEventToSessionAsSystemService(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) {}
    public void dispatchAdjustVolume(int p0, int p1, int p2) {}
    public boolean isTrustedForMediaControl(android.media.session.MediaSessionManager.RemoteUserInfo p0) { return false; }
    public boolean isGlobalPriorityActive() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER")
    public void setOnVolumeKeyLongPressListener(android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_MEDIA_KEY_LISTENER")
    public void setOnMediaKeyListener(android.media.session.MediaSessionManager.OnMediaKeyListener p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void addOnMediaKeyEventDispatchedListener(java.util.concurrent.Executor p0, android.media.session.MediaSessionManager.OnMediaKeyEventDispatchedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void removeOnMediaKeyEventDispatchedListener(android.media.session.MediaSessionManager.OnMediaKeyEventDispatchedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void addOnMediaKeyEventSessionChangedListener(java.util.concurrent.Executor p0, android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void removeOnMediaKeyEventSessionChangedListener(android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener p0) {}
    public void setCustomMediaKeyDispatcher(java.lang.String p0) {}
    public void setCustomMediaSessionPolicyProvider(java.lang.String p0) {}
    public boolean hasCustomMediaKeyDispatcher(java.lang.String p0) { return false; }
    public boolean hasCustomMediaSessionPolicyProvider(java.lang.String p0) { return false; }
    public int getSessionPolicies(android.media.session.MediaSession.Token p0) { return 0; }
    public void setSessionPolicies(android.media.session.MediaSession.Token p0, int p1) {}

    public static interface OnActiveSessionsChangedListener {
        public void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> p0);
    }

    @android.annotation.SystemApi
    public static interface OnMediaKeyEventDispatchedListener {
        public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2);
    }

    private final class OnMediaKeyEventDispatchedListenerStub extends android.media.session.IOnMediaKeyEventDispatchedListener.Stub {
        private OnMediaKeyEventDispatchedListenerStub(android.media.session.MediaSessionManager p0) { super(); }
        public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2) {}
    }

    @android.annotation.SystemApi
    public static interface OnMediaKeyEventSessionChangedListener {
        public void onMediaKeyEventSessionChanged(java.lang.String p0, android.media.session.MediaSession.Token p1);
    }

    private final class OnMediaKeyEventSessionChangedListenerStub extends android.media.session.IOnMediaKeyEventSessionChangedListener.Stub {
        private OnMediaKeyEventSessionChangedListenerStub(android.media.session.MediaSessionManager p0) { super(); }
        public void onMediaKeyEventSessionChanged(java.lang.String p0, android.media.session.MediaSession.Token p1) {}
    }

    @android.annotation.SystemApi
    public static interface OnMediaKeyListener {
        public boolean onMediaKey(android.view.KeyEvent p0);
    }

    private static final class OnMediaKeyListenerImpl extends android.media.session.IOnMediaKeyListener.Stub {
        private android.media.session.MediaSessionManager.OnMediaKeyListener mListener;
        private android.os.Handler mHandler;
        public OnMediaKeyListenerImpl(android.media.session.MediaSessionManager.OnMediaKeyListener p0, android.os.Handler p1) { super(); }
        public void onMediaKey(android.view.KeyEvent p0, android.os.ResultReceiver p1) {}
    }

    public static interface OnSession2TokensChangedListener {
        public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0);
    }

    @android.annotation.SystemApi
    public static interface OnVolumeKeyLongPressListener {
        public void onVolumeKeyLongPress(android.view.KeyEvent p0);
    }

    private static final class OnVolumeKeyLongPressListenerImpl extends android.media.session.IOnVolumeKeyLongPressListener.Stub {
        private android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener mListener;
        private android.os.Handler mHandler;
        public OnVolumeKeyLongPressListenerImpl(android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener p0, android.os.Handler p1) { super(); }
        public void onVolumeKeyLongPress(android.view.KeyEvent p0) {}
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static interface RemoteSessionCallback {
        public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1);
        public void onDefaultRemoteSessionChanged(android.media.session.MediaSession.Token p0);
    }

    private final class RemoteSessionCallbackStub extends android.media.IRemoteSessionCallback.Stub {
        private RemoteSessionCallbackStub(android.media.session.MediaSessionManager p0) { super(); }
        public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1) {}
        public void onSessionChanged(android.media.session.MediaSession.Token p0) {}
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

    private static final class Session2TokensChangedWrapper {
        private final android.media.session.MediaSessionManager.OnSession2TokensChangedListener mListener = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.media.session.ISession2TokensListener.Stub mStub = null;
        Session2TokensChangedWrapper(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0, java.util.concurrent.Executor p1) {}
        public android.media.session.ISession2TokensListener.Stub getStub() { return null; }
    }

    private static final class SessionsChangedWrapper {
        private android.content.Context mContext;
        private android.media.session.MediaSessionManager.OnActiveSessionsChangedListener mListener;
        private java.util.concurrent.Executor mExecutor;
        private final android.media.session.IActiveSessionsListener.Stub mStub = null;
        public SessionsChangedWrapper(android.content.Context p0, android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p1, java.util.concurrent.Executor p2) {}
        private void callOnActiveSessionsChangedListener(java.util.List<android.media.session.MediaSession.Token> p0) {}
        private void release() {}
    }
}

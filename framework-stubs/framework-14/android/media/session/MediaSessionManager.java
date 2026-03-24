package android.media.session;

public final class MediaSessionManager {
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int RESULT_MEDIA_KEY_NOT_HANDLED = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int RESULT_MEDIA_KEY_HANDLED = 1;
    public MediaSessionManager(android.content.Context p0) {}
    public android.media.session.ISession createSession(android.media.session.MediaSession.CallbackStub p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    @java.lang.Deprecated
    public void notifySession2Created(android.media.Session2Token p0) {}
    public java.util.List<android.media.session.MediaController> getActiveSessions(android.content.ComponentName p0) { return null; }
    public android.media.session.MediaSession.Token getMediaKeyEventSession() { return null; }
    public java.lang.String getMediaKeyEventSessionPackageName() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("UserHandle")
    public java.util.List<android.media.session.MediaController> getActiveSessionsForUser(android.content.ComponentName p0, android.os.UserHandle p1) { return null; }
    public java.util.List<android.media.Session2Token> getSession2Tokens() { return null; }
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1) {}
    public void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0, android.content.ComponentName p1, android.os.Handler p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("UserHandle")
    public void addOnActiveSessionsChangedListener(android.content.ComponentName p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p3) {}
    public void removeOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p0) {}
    public void addOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0) {}
    public void addOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0, android.os.Handler p1) {}
    @android.annotation.SuppressLint("UserHandle")
    public void addOnSession2TokensChangedListener(android.os.UserHandle p0, android.media.session.MediaSessionManager.OnSession2TokensChangedListener p1, java.util.concurrent.Executor p2) {}
    public void removeOnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void registerRemoteSessionCallback(java.util.concurrent.Executor p0, android.media.session.MediaSessionManager.RemoteSessionCallback p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void unregisterRemoteSessionCallback(android.media.session.MediaSessionManager.RemoteSessionCallback p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0, boolean p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchMediaKeyEventAsSystemService(android.view.KeyEvent p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public boolean dispatchMediaKeyEventToSessionAsSystemService(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchVolumeKeyEvent(android.view.KeyEvent p0, int p1, boolean p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void dispatchVolumeKeyEventAsSystemService(android.view.KeyEvent p0, int p1) {}
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
    public void addOnMediaKeyEventSessionChangedListener(java.util.concurrent.Executor p0, android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener p1) {}
    public void removeOnMediaKeyEventSessionChangedListener(android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener p0) {}
    public void setCustomMediaKeyDispatcher(java.lang.String p0) {}
    public void setCustomMediaSessionPolicyProvider(java.lang.String p0) {}
    public boolean hasCustomMediaKeyDispatcher(java.lang.String p0) { return false; }
    public boolean hasCustomMediaSessionPolicyProvider(java.lang.String p0) { return false; }
    public int getSessionPolicies(android.media.session.MediaSession.Token p0) { return 0; }
    public void setSessionPolicies(android.media.session.MediaSession.Token p0, int p1) {}

    public static interface OnSession2TokensChangedListener {
        public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0);
    }

    public static final class RemoteUserInfo {
        public RemoteUserInfo(java.lang.String p0, int p1, int p2) {}
        public java.lang.String getPackageName() { return null; }
        public int getPid() { return 0; }
        public int getUid() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static interface OnActiveSessionsChangedListener {
        public void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> p0);
    }

    public static interface OnMediaKeyEventSessionChangedListener {
        public void onMediaKeyEventSessionChanged(java.lang.String p0, android.media.session.MediaSession.Token p1);
    }

    @android.annotation.SystemApi
    public static interface OnMediaKeyEventDispatchedListener {
        public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2);
    }

    private final class OnMediaKeyEventDispatchedListenerStub extends android.media.session.IOnMediaKeyEventDispatchedListener.Stub {
        public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2) {}
    }

    private final class OnMediaKeyEventSessionChangedListenerStub extends android.media.session.IOnMediaKeyEventSessionChangedListener.Stub {
        public void onMediaKeyEventSessionChanged(java.lang.String p0, android.media.session.MediaSession.Token p1) {}
    }

    @android.annotation.SystemApi
    public static interface OnMediaKeyListener {
        public boolean onMediaKey(android.view.KeyEvent p0);
    }

    private static final class OnMediaKeyListenerImpl extends android.media.session.IOnMediaKeyListener.Stub {
        public OnMediaKeyListenerImpl(android.media.session.MediaSessionManager.OnMediaKeyListener p0, android.os.Handler p1) { super(); }
        public void onMediaKey(android.view.KeyEvent p0, android.os.ResultReceiver p1) {}
    }

    @android.annotation.SystemApi
    public static interface OnVolumeKeyLongPressListener {
        public void onVolumeKeyLongPress(android.view.KeyEvent p0);
    }

    private static final class OnVolumeKeyLongPressListenerImpl extends android.media.session.IOnVolumeKeyLongPressListener.Stub {
        public OnVolumeKeyLongPressListenerImpl(android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener p0, android.os.Handler p1) { super(); }
        public void onVolumeKeyLongPress(android.view.KeyEvent p0) {}
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static interface RemoteSessionCallback {
        public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1);
        public void onDefaultRemoteSessionChanged(android.media.session.MediaSession.Token p0);
    }

    private final class RemoteSessionCallbackStub extends android.media.IRemoteSessionCallback.Stub {
        public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1) {}
        public void onSessionChanged(android.media.session.MediaSession.Token p0) {}
    }

    private static final class Session2TokensChangedWrapper {
        Session2TokensChangedWrapper(android.media.session.MediaSessionManager.OnSession2TokensChangedListener p0, java.util.concurrent.Executor p1) {}
        public android.media.session.ISession2TokensListener.Stub getStub() { return null; }
    }

    private static final class SessionsChangedWrapper {
        public SessionsChangedWrapper(android.content.Context p0, android.media.session.MediaSessionManager.OnActiveSessionsChangedListener p1, java.util.concurrent.Executor p2) {}
    }
}

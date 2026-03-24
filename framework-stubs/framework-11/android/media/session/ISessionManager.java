package android.media.session;

public interface ISessionManager extends android.os.IInterface {
    public android.media.session.ISession createSession(java.lang.String p0, android.media.session.ISessionCallback p1, java.lang.String p2, android.os.Bundle p3, int p4) throws android.os.RemoteException;
    public void notifySession2Created(android.media.Session2Token p0) throws android.os.RemoteException;
    public java.util.List<android.media.session.MediaSession.Token> getSessions(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSession2Tokens(int p0) throws android.os.RemoteException;
    public void dispatchMediaKeyEvent(java.lang.String p0, boolean p1, android.view.KeyEvent p2, boolean p3) throws android.os.RemoteException;
    public boolean dispatchMediaKeyEventToSessionAsSystemService(java.lang.String p0, android.media.session.MediaSession.Token p1, android.view.KeyEvent p2) throws android.os.RemoteException;
    public void dispatchVolumeKeyEvent(java.lang.String p0, java.lang.String p1, boolean p2, android.view.KeyEvent p3, int p4, boolean p5) throws android.os.RemoteException;
    public void dispatchVolumeKeyEventToSessionAsSystemService(java.lang.String p0, java.lang.String p1, android.media.session.MediaSession.Token p2, android.view.KeyEvent p3) throws android.os.RemoteException;
    public void dispatchAdjustVolume(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void addSessionsListener(android.media.session.IActiveSessionsListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void removeSessionsListener(android.media.session.IActiveSessionsListener p0) throws android.os.RemoteException;
    public void addSession2TokensListener(android.media.session.ISession2TokensListener p0, int p1) throws android.os.RemoteException;
    public void removeSession2TokensListener(android.media.session.ISession2TokensListener p0) throws android.os.RemoteException;
    public void registerRemoteVolumeController(android.media.IRemoteVolumeController p0) throws android.os.RemoteException;
    public void unregisterRemoteVolumeController(android.media.IRemoteVolumeController p0) throws android.os.RemoteException;
    public boolean isGlobalPriorityActive() throws android.os.RemoteException;
    public void addOnMediaKeyEventDispatchedListener(android.media.session.IOnMediaKeyEventDispatchedListener p0) throws android.os.RemoteException;
    public void removeOnMediaKeyEventDispatchedListener(android.media.session.IOnMediaKeyEventDispatchedListener p0) throws android.os.RemoteException;
    public void addOnMediaKeyEventSessionChangedListener(android.media.session.IOnMediaKeyEventSessionChangedListener p0) throws android.os.RemoteException;
    public void removeOnMediaKeyEventSessionChangedListener(android.media.session.IOnMediaKeyEventSessionChangedListener p0) throws android.os.RemoteException;
    public void setOnVolumeKeyLongPressListener(android.media.session.IOnVolumeKeyLongPressListener p0) throws android.os.RemoteException;
    public void setOnMediaKeyListener(android.media.session.IOnMediaKeyListener p0) throws android.os.RemoteException;
    public boolean isTrusted(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setCustomMediaKeyDispatcherForTesting(java.lang.String p0) throws android.os.RemoteException;
    public void setCustomSessionPolicyProviderForTesting(java.lang.String p0) throws android.os.RemoteException;
    public int getSessionPolicies(android.media.session.MediaSession.Token p0) throws android.os.RemoteException;
    public void setSessionPolicies(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.session.ISessionManager {
        public Default() {}
        public android.media.session.ISession createSession(java.lang.String p0, android.media.session.ISessionCallback p1, java.lang.String p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
        public void notifySession2Created(android.media.Session2Token p0) throws android.os.RemoteException {}
        public java.util.List<android.media.session.MediaSession.Token> getSessions(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getSession2Tokens(int p0) throws android.os.RemoteException { return null; }
        public void dispatchMediaKeyEvent(java.lang.String p0, boolean p1, android.view.KeyEvent p2, boolean p3) throws android.os.RemoteException {}
        public boolean dispatchMediaKeyEventToSessionAsSystemService(java.lang.String p0, android.media.session.MediaSession.Token p1, android.view.KeyEvent p2) throws android.os.RemoteException { return false; }
        public void dispatchVolumeKeyEvent(java.lang.String p0, java.lang.String p1, boolean p2, android.view.KeyEvent p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void dispatchVolumeKeyEventToSessionAsSystemService(java.lang.String p0, java.lang.String p1, android.media.session.MediaSession.Token p2, android.view.KeyEvent p3) throws android.os.RemoteException {}
        public void dispatchAdjustVolume(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void addSessionsListener(android.media.session.IActiveSessionsListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public void removeSessionsListener(android.media.session.IActiveSessionsListener p0) throws android.os.RemoteException {}
        public void addSession2TokensListener(android.media.session.ISession2TokensListener p0, int p1) throws android.os.RemoteException {}
        public void removeSession2TokensListener(android.media.session.ISession2TokensListener p0) throws android.os.RemoteException {}
        public void registerRemoteVolumeController(android.media.IRemoteVolumeController p0) throws android.os.RemoteException {}
        public void unregisterRemoteVolumeController(android.media.IRemoteVolumeController p0) throws android.os.RemoteException {}
        public boolean isGlobalPriorityActive() throws android.os.RemoteException { return false; }
        public void addOnMediaKeyEventDispatchedListener(android.media.session.IOnMediaKeyEventDispatchedListener p0) throws android.os.RemoteException {}
        public void removeOnMediaKeyEventDispatchedListener(android.media.session.IOnMediaKeyEventDispatchedListener p0) throws android.os.RemoteException {}
        public void addOnMediaKeyEventSessionChangedListener(android.media.session.IOnMediaKeyEventSessionChangedListener p0) throws android.os.RemoteException {}
        public void removeOnMediaKeyEventSessionChangedListener(android.media.session.IOnMediaKeyEventSessionChangedListener p0) throws android.os.RemoteException {}
        public void setOnVolumeKeyLongPressListener(android.media.session.IOnVolumeKeyLongPressListener p0) throws android.os.RemoteException {}
        public void setOnMediaKeyListener(android.media.session.IOnMediaKeyListener p0) throws android.os.RemoteException {}
        public boolean isTrusted(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setCustomMediaKeyDispatcherForTesting(java.lang.String p0) throws android.os.RemoteException {}
        public void setCustomSessionPolicyProviderForTesting(java.lang.String p0) throws android.os.RemoteException {}
        public int getSessionPolicies(android.media.session.MediaSession.Token p0) throws android.os.RemoteException { return 0; }
        public void setSessionPolicies(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.ISessionManager {
        private static final java.lang.String DESCRIPTOR = "android.media.session.ISessionManager";
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_notifySession2Created = 2;
        static final int TRANSACTION_getSessions = 3;
        static final int TRANSACTION_getSession2Tokens = 4;
        static final int TRANSACTION_dispatchMediaKeyEvent = 5;
        static final int TRANSACTION_dispatchMediaKeyEventToSessionAsSystemService = 6;
        static final int TRANSACTION_dispatchVolumeKeyEvent = 7;
        static final int TRANSACTION_dispatchVolumeKeyEventToSessionAsSystemService = 8;
        static final int TRANSACTION_dispatchAdjustVolume = 9;
        static final int TRANSACTION_addSessionsListener = 10;
        static final int TRANSACTION_removeSessionsListener = 11;
        static final int TRANSACTION_addSession2TokensListener = 12;
        static final int TRANSACTION_removeSession2TokensListener = 13;
        static final int TRANSACTION_registerRemoteVolumeController = 14;
        static final int TRANSACTION_unregisterRemoteVolumeController = 15;
        static final int TRANSACTION_isGlobalPriorityActive = 16;
        static final int TRANSACTION_addOnMediaKeyEventDispatchedListener = 17;
        static final int TRANSACTION_removeOnMediaKeyEventDispatchedListener = 18;
        static final int TRANSACTION_addOnMediaKeyEventSessionChangedListener = 19;
        static final int TRANSACTION_removeOnMediaKeyEventSessionChangedListener = 20;
        static final int TRANSACTION_setOnVolumeKeyLongPressListener = 21;
        static final int TRANSACTION_setOnMediaKeyListener = 22;
        static final int TRANSACTION_isTrusted = 23;
        static final int TRANSACTION_setCustomMediaKeyDispatcherForTesting = 24;
        static final int TRANSACTION_setCustomSessionPolicyProviderForTesting = 25;
        static final int TRANSACTION_getSessionPolicies = 26;
        static final int TRANSACTION_setSessionPolicies = 27;
        public Stub() { super(); }
        public static android.media.session.ISessionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.session.ISessionManager p0) { return false; }
        public static android.media.session.ISessionManager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.session.ISessionManager {
            private android.os.IBinder mRemote;
            public static android.media.session.ISessionManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.session.ISession createSession(java.lang.String p0, android.media.session.ISessionCallback p1, java.lang.String p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
            public void notifySession2Created(android.media.Session2Token p0) throws android.os.RemoteException {}
            public java.util.List<android.media.session.MediaSession.Token> getSessions(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getSession2Tokens(int p0) throws android.os.RemoteException { return null; }
            public void dispatchMediaKeyEvent(java.lang.String p0, boolean p1, android.view.KeyEvent p2, boolean p3) throws android.os.RemoteException {}
            public boolean dispatchMediaKeyEventToSessionAsSystemService(java.lang.String p0, android.media.session.MediaSession.Token p1, android.view.KeyEvent p2) throws android.os.RemoteException { return false; }
            public void dispatchVolumeKeyEvent(java.lang.String p0, java.lang.String p1, boolean p2, android.view.KeyEvent p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void dispatchVolumeKeyEventToSessionAsSystemService(java.lang.String p0, java.lang.String p1, android.media.session.MediaSession.Token p2, android.view.KeyEvent p3) throws android.os.RemoteException {}
            public void dispatchAdjustVolume(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void addSessionsListener(android.media.session.IActiveSessionsListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public void removeSessionsListener(android.media.session.IActiveSessionsListener p0) throws android.os.RemoteException {}
            public void addSession2TokensListener(android.media.session.ISession2TokensListener p0, int p1) throws android.os.RemoteException {}
            public void removeSession2TokensListener(android.media.session.ISession2TokensListener p0) throws android.os.RemoteException {}
            public void registerRemoteVolumeController(android.media.IRemoteVolumeController p0) throws android.os.RemoteException {}
            public void unregisterRemoteVolumeController(android.media.IRemoteVolumeController p0) throws android.os.RemoteException {}
            public boolean isGlobalPriorityActive() throws android.os.RemoteException { return false; }
            public void addOnMediaKeyEventDispatchedListener(android.media.session.IOnMediaKeyEventDispatchedListener p0) throws android.os.RemoteException {}
            public void removeOnMediaKeyEventDispatchedListener(android.media.session.IOnMediaKeyEventDispatchedListener p0) throws android.os.RemoteException {}
            public void addOnMediaKeyEventSessionChangedListener(android.media.session.IOnMediaKeyEventSessionChangedListener p0) throws android.os.RemoteException {}
            public void removeOnMediaKeyEventSessionChangedListener(android.media.session.IOnMediaKeyEventSessionChangedListener p0) throws android.os.RemoteException {}
            public void setOnVolumeKeyLongPressListener(android.media.session.IOnVolumeKeyLongPressListener p0) throws android.os.RemoteException {}
            public void setOnMediaKeyListener(android.media.session.IOnMediaKeyListener p0) throws android.os.RemoteException {}
            public boolean isTrusted(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setCustomMediaKeyDispatcherForTesting(java.lang.String p0) throws android.os.RemoteException {}
            public void setCustomSessionPolicyProviderForTesting(java.lang.String p0) throws android.os.RemoteException {}
            public int getSessionPolicies(android.media.session.MediaSession.Token p0) throws android.os.RemoteException { return 0; }
            public void setSessionPolicies(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException {}
        }
    }
}

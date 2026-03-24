package android.media.session;

public interface ISession extends android.os.IInterface {
    public void sendEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public android.media.session.ISessionController getController() throws android.os.RemoteException;
    public void setFlags(int p0) throws android.os.RemoteException;
    public void setActive(boolean p0) throws android.os.RemoteException;
    public void setMediaButtonReceiver(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void setLaunchPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void destroySession() throws android.os.RemoteException;
    public void setMetadata(android.media.MediaMetadata p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public void setPlaybackState(android.media.session.PlaybackState p0) throws android.os.RemoteException;
    public void setQueue(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;
    public void setQueueTitle(java.lang.CharSequence p0) throws android.os.RemoteException;
    public void setExtras(android.os.Bundle p0) throws android.os.RemoteException;
    public void setRatingType(int p0) throws android.os.RemoteException;
    public void setPlaybackToLocal(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public void setPlaybackToRemote(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setCurrentVolume(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.session.ISession {
        public Default() {}
        public void sendEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.media.session.ISessionController getController() throws android.os.RemoteException { return null; }
        public void setFlags(int p0) throws android.os.RemoteException {}
        public void setActive(boolean p0) throws android.os.RemoteException {}
        public void setMediaButtonReceiver(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void setLaunchPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void destroySession() throws android.os.RemoteException {}
        public void setMetadata(android.media.MediaMetadata p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setPlaybackState(android.media.session.PlaybackState p0) throws android.os.RemoteException {}
        public void setQueue(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public void setQueueTitle(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public void setExtras(android.os.Bundle p0) throws android.os.RemoteException {}
        public void setRatingType(int p0) throws android.os.RemoteException {}
        public void setPlaybackToLocal(android.media.AudioAttributes p0) throws android.os.RemoteException {}
        public void setPlaybackToRemote(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setCurrentVolume(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.ISession {
        private static final java.lang.String DESCRIPTOR = "android.media.session.ISession";
        static final int TRANSACTION_sendEvent = 1;
        static final int TRANSACTION_getController = 2;
        static final int TRANSACTION_setFlags = 3;
        static final int TRANSACTION_setActive = 4;
        static final int TRANSACTION_setMediaButtonReceiver = 5;
        static final int TRANSACTION_setLaunchPendingIntent = 6;
        static final int TRANSACTION_destroySession = 7;
        static final int TRANSACTION_setMetadata = 8;
        static final int TRANSACTION_setPlaybackState = 9;
        static final int TRANSACTION_setQueue = 10;
        static final int TRANSACTION_setQueueTitle = 11;
        static final int TRANSACTION_setExtras = 12;
        static final int TRANSACTION_setRatingType = 13;
        static final int TRANSACTION_setPlaybackToLocal = 14;
        static final int TRANSACTION_setPlaybackToRemote = 15;
        static final int TRANSACTION_setCurrentVolume = 16;
        public Stub() { super(); }
        public static android.media.session.ISession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.session.ISession p0) { return false; }
        public static android.media.session.ISession getDefaultImpl() { return null; }

        private static class Proxy implements android.media.session.ISession {
            private android.os.IBinder mRemote;
            public static android.media.session.ISession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public android.media.session.ISessionController getController() throws android.os.RemoteException { return null; }
            public void setFlags(int p0) throws android.os.RemoteException {}
            public void setActive(boolean p0) throws android.os.RemoteException {}
            public void setMediaButtonReceiver(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void setLaunchPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void destroySession() throws android.os.RemoteException {}
            public void setMetadata(android.media.MediaMetadata p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setPlaybackState(android.media.session.PlaybackState p0) throws android.os.RemoteException {}
            public void setQueue(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
            public void setQueueTitle(java.lang.CharSequence p0) throws android.os.RemoteException {}
            public void setExtras(android.os.Bundle p0) throws android.os.RemoteException {}
            public void setRatingType(int p0) throws android.os.RemoteException {}
            public void setPlaybackToLocal(android.media.AudioAttributes p0) throws android.os.RemoteException {}
            public void setPlaybackToRemote(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setCurrentVolume(int p0) throws android.os.RemoteException {}
        }
    }
}

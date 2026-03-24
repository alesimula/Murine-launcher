package android.media.session;

public interface ISessionController extends android.os.IInterface {
    public void sendCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3) throws android.os.RemoteException;
    public boolean sendMediaButton(java.lang.String p0, android.view.KeyEvent p1) throws android.os.RemoteException;
    public void registerCallback(java.lang.String p0, android.media.session.ISessionControllerCallback p1) throws android.os.RemoteException;
    public void unregisterCallback(android.media.session.ISessionControllerCallback p0) throws android.os.RemoteException;
    public java.lang.String getPackageName() throws android.os.RemoteException;
    public java.lang.String getTag() throws android.os.RemoteException;
    public android.os.Bundle getSessionInfo() throws android.os.RemoteException;
    public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException;
    public long getFlags() throws android.os.RemoteException;
    public android.media.session.MediaController.PlaybackInfo getVolumeAttributes() throws android.os.RemoteException;
    public void adjustVolume(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void setVolumeTo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void prepare(java.lang.String p0) throws android.os.RemoteException;
    public void prepareFromMediaId(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void prepareFromSearch(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void prepareFromUri(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void play(java.lang.String p0) throws android.os.RemoteException;
    public void playFromMediaId(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void playFromSearch(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void playFromUri(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void skipToQueueItem(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void pause(java.lang.String p0) throws android.os.RemoteException;
    public void stop(java.lang.String p0) throws android.os.RemoteException;
    public void next(java.lang.String p0) throws android.os.RemoteException;
    public void previous(java.lang.String p0) throws android.os.RemoteException;
    public void fastForward(java.lang.String p0) throws android.os.RemoteException;
    public void rewind(java.lang.String p0) throws android.os.RemoteException;
    public void seekTo(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void rate(java.lang.String p0, android.media.Rating p1) throws android.os.RemoteException;
    public void setPlaybackSpeed(java.lang.String p0, float p1) throws android.os.RemoteException;
    public void sendCustomAction(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public android.media.MediaMetadata getMetadata() throws android.os.RemoteException;
    public android.media.session.PlaybackState getPlaybackState() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getQueue() throws android.os.RemoteException;
    public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException;
    public android.os.Bundle getExtras() throws android.os.RemoteException;
    public int getRatingType() throws android.os.RemoteException;

    public static class Default implements android.media.session.ISessionController {
        public Default() {}
        public void sendCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3) throws android.os.RemoteException {}
        public boolean sendMediaButton(java.lang.String p0, android.view.KeyEvent p1) throws android.os.RemoteException { return false; }
        public void registerCallback(java.lang.String p0, android.media.session.ISessionControllerCallback p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.session.ISessionControllerCallback p0) throws android.os.RemoteException {}
        public java.lang.String getPackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getTag() throws android.os.RemoteException { return null; }
        public android.os.Bundle getSessionInfo() throws android.os.RemoteException { return null; }
        public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException { return null; }
        public long getFlags() throws android.os.RemoteException { return 0L; }
        public android.media.session.MediaController.PlaybackInfo getVolumeAttributes() throws android.os.RemoteException { return null; }
        public void adjustVolume(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void setVolumeTo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void prepare(java.lang.String p0) throws android.os.RemoteException {}
        public void prepareFromMediaId(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void prepareFromSearch(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void prepareFromUri(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void play(java.lang.String p0) throws android.os.RemoteException {}
        public void playFromMediaId(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void playFromSearch(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void playFromUri(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void skipToQueueItem(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void pause(java.lang.String p0) throws android.os.RemoteException {}
        public void stop(java.lang.String p0) throws android.os.RemoteException {}
        public void next(java.lang.String p0) throws android.os.RemoteException {}
        public void previous(java.lang.String p0) throws android.os.RemoteException {}
        public void fastForward(java.lang.String p0) throws android.os.RemoteException {}
        public void rewind(java.lang.String p0) throws android.os.RemoteException {}
        public void seekTo(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void rate(java.lang.String p0, android.media.Rating p1) throws android.os.RemoteException {}
        public void setPlaybackSpeed(java.lang.String p0, float p1) throws android.os.RemoteException {}
        public void sendCustomAction(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.media.MediaMetadata getMetadata() throws android.os.RemoteException { return null; }
        public android.media.session.PlaybackState getPlaybackState() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getQueue() throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException { return null; }
        public android.os.Bundle getExtras() throws android.os.RemoteException { return null; }
        public int getRatingType() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.ISessionController {
        public static final java.lang.String DESCRIPTOR = "android.media.session.ISessionController";
        static final int TRANSACTION_sendCommand = 1;
        static final int TRANSACTION_sendMediaButton = 2;
        static final int TRANSACTION_registerCallback = 3;
        static final int TRANSACTION_unregisterCallback = 4;
        static final int TRANSACTION_getPackageName = 5;
        static final int TRANSACTION_getTag = 6;
        static final int TRANSACTION_getSessionInfo = 7;
        static final int TRANSACTION_getLaunchPendingIntent = 8;
        static final int TRANSACTION_getFlags = 9;
        static final int TRANSACTION_getVolumeAttributes = 10;
        static final int TRANSACTION_adjustVolume = 11;
        static final int TRANSACTION_setVolumeTo = 12;
        static final int TRANSACTION_prepare = 13;
        static final int TRANSACTION_prepareFromMediaId = 14;
        static final int TRANSACTION_prepareFromSearch = 15;
        static final int TRANSACTION_prepareFromUri = 16;
        static final int TRANSACTION_play = 17;
        static final int TRANSACTION_playFromMediaId = 18;
        static final int TRANSACTION_playFromSearch = 19;
        static final int TRANSACTION_playFromUri = 20;
        static final int TRANSACTION_skipToQueueItem = 21;
        static final int TRANSACTION_pause = 22;
        static final int TRANSACTION_stop = 23;
        static final int TRANSACTION_next = 24;
        static final int TRANSACTION_previous = 25;
        static final int TRANSACTION_fastForward = 26;
        static final int TRANSACTION_rewind = 27;
        static final int TRANSACTION_seekTo = 28;
        static final int TRANSACTION_rate = 29;
        static final int TRANSACTION_setPlaybackSpeed = 30;
        static final int TRANSACTION_sendCustomAction = 31;
        static final int TRANSACTION_getMetadata = 32;
        static final int TRANSACTION_getPlaybackState = 33;
        static final int TRANSACTION_getQueue = 34;
        static final int TRANSACTION_getQueueTitle = 35;
        static final int TRANSACTION_getExtras = 36;
        static final int TRANSACTION_getRatingType = 37;
        public Stub() { super(); }
        public static android.media.session.ISessionController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.session.ISessionController p0) { return false; }
        public static android.media.session.ISessionController getDefaultImpl() { return null; }

        private static class Proxy implements android.media.session.ISessionController {
            private android.os.IBinder mRemote;
            public static android.media.session.ISessionController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3) throws android.os.RemoteException {}
            public boolean sendMediaButton(java.lang.String p0, android.view.KeyEvent p1) throws android.os.RemoteException { return false; }
            public void registerCallback(java.lang.String p0, android.media.session.ISessionControllerCallback p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.session.ISessionControllerCallback p0) throws android.os.RemoteException {}
            public java.lang.String getPackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getTag() throws android.os.RemoteException { return null; }
            public android.os.Bundle getSessionInfo() throws android.os.RemoteException { return null; }
            public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException { return null; }
            public long getFlags() throws android.os.RemoteException { return 0L; }
            public android.media.session.MediaController.PlaybackInfo getVolumeAttributes() throws android.os.RemoteException { return null; }
            public void adjustVolume(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void setVolumeTo(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void prepare(java.lang.String p0) throws android.os.RemoteException {}
            public void prepareFromMediaId(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void prepareFromSearch(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void prepareFromUri(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void play(java.lang.String p0) throws android.os.RemoteException {}
            public void playFromMediaId(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void playFromSearch(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void playFromUri(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void skipToQueueItem(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void pause(java.lang.String p0) throws android.os.RemoteException {}
            public void stop(java.lang.String p0) throws android.os.RemoteException {}
            public void next(java.lang.String p0) throws android.os.RemoteException {}
            public void previous(java.lang.String p0) throws android.os.RemoteException {}
            public void fastForward(java.lang.String p0) throws android.os.RemoteException {}
            public void rewind(java.lang.String p0) throws android.os.RemoteException {}
            public void seekTo(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void rate(java.lang.String p0, android.media.Rating p1) throws android.os.RemoteException {}
            public void setPlaybackSpeed(java.lang.String p0, float p1) throws android.os.RemoteException {}
            public void sendCustomAction(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public android.media.MediaMetadata getMetadata() throws android.os.RemoteException { return null; }
            public android.media.session.PlaybackState getPlaybackState() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getQueue() throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException { return null; }
            public android.os.Bundle getExtras() throws android.os.RemoteException { return null; }
            public int getRatingType() throws android.os.RemoteException { return 0; }
        }
    }
}

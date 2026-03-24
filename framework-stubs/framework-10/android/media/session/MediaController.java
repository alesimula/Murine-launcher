package android.media.session;

public final class MediaController {
    private static final java.lang.String TAG = "MediaController";
    private static final int MSG_EVENT = 1;
    private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
    private static final int MSG_UPDATE_METADATA = 3;
    private static final int MSG_UPDATE_VOLUME = 4;
    private static final int MSG_UPDATE_QUEUE = 5;
    private static final int MSG_UPDATE_QUEUE_TITLE = 6;
    private static final int MSG_UPDATE_EXTRAS = 7;
    private static final int MSG_DESTROYED = 8;
    private final android.media.session.ISessionController mSessionBinder = null;
    private final android.media.session.MediaSession.Token mToken = null;
    private final android.content.Context mContext = null;
    private final android.media.session.MediaController.CallbackStub mCbStub = null;
    private final java.util.ArrayList<android.media.session.MediaController.MessageHandler> mCallbacks = null;
    private final java.lang.Object mLock = null;
    private boolean mCbRegistered;
    private java.lang.String mPackageName;
    private java.lang.String mTag;
    private android.os.Bundle mSessionInfo;
    private final android.media.session.MediaController.TransportControls mTransportControls = null;
    public MediaController(android.content.Context p0, android.media.session.MediaSession.Token p1) {}
    public android.media.session.MediaController.TransportControls getTransportControls() { return null; }
    public boolean dispatchMediaButtonEvent(android.view.KeyEvent p0) { return false; }
    public android.media.session.PlaybackState getPlaybackState() { return null; }
    public android.media.MediaMetadata getMetadata() { return null; }
    public java.util.List<android.media.session.MediaSession.QueueItem> getQueue() { return null; }
    public java.lang.CharSequence getQueueTitle() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int getRatingType() { return 0; }
    public long getFlags() { return 0L; }
    public android.media.session.MediaController.PlaybackInfo getPlaybackInfo() { return null; }
    public android.app.PendingIntent getSessionActivity() { return null; }
    public android.media.session.MediaSession.Token getSessionToken() { return null; }
    public void setVolumeTo(int p0, int p1) {}
    public void adjustVolume(int p0, int p1) {}
    public void registerCallback(android.media.session.MediaController.Callback p0) {}
    public void registerCallback(android.media.session.MediaController.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.media.session.MediaController.Callback p0) {}
    public void sendCommand(java.lang.String p0, android.os.Bundle p1, android.os.ResultReceiver p2) {}
    public java.lang.String getPackageName() { return null; }
    public android.os.Bundle getSessionInfo() { return null; }
    public java.lang.String getTag() { return null; }
    android.media.session.ISessionController getSessionBinder() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean controlsSameSession(android.media.session.MediaController p0) { return false; }
    private void addCallbackLocked(android.media.session.MediaController.Callback p0, android.os.Handler p1) {}
    private boolean removeCallbackLocked(android.media.session.MediaController.Callback p0) { return false; }
    private android.media.session.MediaController.MessageHandler getHandlerForCallbackLocked(android.media.session.MediaController.Callback p0) { return null; }
    private void postMessage(int p0, java.lang.Object p1, android.os.Bundle p2) {}

    public final class TransportControls {
        private static final java.lang.String TAG = "TransportController";
        private TransportControls(android.media.session.MediaController p0) {}
        public void prepare() {}
        public void prepareFromMediaId(java.lang.String p0, android.os.Bundle p1) {}
        public void prepareFromSearch(java.lang.String p0, android.os.Bundle p1) {}
        public void prepareFromUri(android.net.Uri p0, android.os.Bundle p1) {}
        public void play() {}
        public void playFromMediaId(java.lang.String p0, android.os.Bundle p1) {}
        public void playFromSearch(java.lang.String p0, android.os.Bundle p1) {}
        public void playFromUri(android.net.Uri p0, android.os.Bundle p1) {}
        public void skipToQueueItem(long p0) {}
        public void pause() {}
        public void stop() {}
        public void seekTo(long p0) {}
        public void fastForward() {}
        public void skipToNext() {}
        public void rewind() {}
        public void skipToPrevious() {}
        public void setRating(android.media.Rating p0) {}
        public void setPlaybackSpeed(float p0) {}
        public void sendCustomAction(android.media.session.PlaybackState.CustomAction p0, android.os.Bundle p1) {}
        public void sendCustomAction(java.lang.String p0, android.os.Bundle p1) {}
    }

    public static final class PlaybackInfo implements android.os.Parcelable {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        private final int mVolumeType = 0;
        private final int mVolumeControl = 0;
        private final int mMaxVolume = 0;
        private final int mCurrentVolume = 0;
        private final android.media.AudioAttributes mAudioAttrs = null;
        public static final android.os.Parcelable.Creator<android.media.session.MediaController.PlaybackInfo> CREATOR = null;
        public PlaybackInfo(int p0, int p1, int p2, int p3, android.media.AudioAttributes p4) {}
        PlaybackInfo(android.os.Parcel p0) {}
        public int getPlaybackType() { return 0; }
        public int getVolumeControl() { return 0; }
        public int getMaxVolume() { return 0; }
        public int getCurrentVolume() { return 0; }
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static final class MessageHandler extends android.os.Handler {
        private final android.media.session.MediaController.Callback mCallback = null;
        private boolean mRegistered;
        MessageHandler(android.os.Looper p0, android.media.session.MediaController.Callback p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void post(int p0, java.lang.Object p1, android.os.Bundle p2) {}
    }

    private static final class CallbackStub extends android.media.session.ISessionControllerCallback.Stub {
        private final java.lang.ref.WeakReference<android.media.session.MediaController> mController = null;
        CallbackStub(android.media.session.MediaController p0) { super(); }
        public void onSessionDestroyed() {}
        public void onEvent(java.lang.String p0, android.os.Bundle p1) {}
        public void onPlaybackStateChanged(android.media.session.PlaybackState p0) {}
        public void onMetadataChanged(android.media.MediaMetadata p0) {}
        public void onQueueChanged(android.content.pm.ParceledListSlice p0) {}
        public void onQueueTitleChanged(java.lang.CharSequence p0) {}
        public void onExtrasChanged(android.os.Bundle p0) {}
        public void onVolumeInfoChanged(android.media.session.MediaController.PlaybackInfo p0) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public void onSessionDestroyed() {}
        public void onSessionEvent(java.lang.String p0, android.os.Bundle p1) {}
        public void onPlaybackStateChanged(android.media.session.PlaybackState p0) {}
        public void onMetadataChanged(android.media.MediaMetadata p0) {}
        public void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> p0) {}
        public void onQueueTitleChanged(java.lang.CharSequence p0) {}
        public void onExtrasChanged(android.os.Bundle p0) {}
        public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo p0) {}
    }
}

package android.media.session;

public final class MediaSession {
    static final java.lang.String TAG = "MediaSession";
    @java.lang.Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    @java.lang.Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int FLAG_EXCLUSIVE_GLOBAL_PRIORITY = 65536;
    public static final int INVALID_UID = -1;
    public static final int INVALID_PID = -1;
    public MediaSession(android.content.Context p0, java.lang.String p1) {}
    public MediaSession(android.content.Context p0, java.lang.String p1, android.os.Bundle p2) {}
    public void setCallback(android.media.session.MediaSession.Callback p0) {}
    public void setCallback(android.media.session.MediaSession.Callback p0, android.os.Handler p1) {}
    public void setSessionActivity(android.app.PendingIntent p0) {}
    @java.lang.Deprecated
    public void setMediaButtonReceiver(android.app.PendingIntent p0) {}
    public void setMediaButtonBroadcastReceiver(android.content.ComponentName p0) {}
    public void setFlags(int p0) {}
    public void setPlaybackToLocal(android.media.AudioAttributes p0) {}
    public void setPlaybackToRemote(android.media.VolumeProvider p0) {}
    public void setActive(boolean p0) {}
    public boolean isActive() { return false; }
    public void sendSessionEvent(java.lang.String p0, android.os.Bundle p1) {}
    public void release() {}
    public android.media.session.MediaSession.Token getSessionToken() { return null; }
    public android.media.session.MediaController getController() { return null; }
    public void setPlaybackState(android.media.session.PlaybackState p0) {}
    public void setMetadata(android.media.MediaMetadata p0) {}
    public void setQueue(java.util.List<android.media.session.MediaSession.QueueItem> p0) {}
    public void setQueueTitle(java.lang.CharSequence p0) {}
    public void setRatingType(int p0) {}
    public void setExtras(android.os.Bundle p0) {}
    public final android.media.session.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() { return null; }
    public void notifyRemoteVolumeChanged(android.media.VolumeProvider p0) {}
    public java.lang.String getCallingPackage() { return null; }
    static boolean hasCustomParcelable(android.os.Bundle p0) { return false; }
    void dispatchPrepare(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchPrepareFromMediaId(android.media.session.MediaSessionManager.RemoteUserInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    void dispatchPrepareFromSearch(android.media.session.MediaSessionManager.RemoteUserInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    void dispatchPrepareFromUri(android.media.session.MediaSessionManager.RemoteUserInfo p0, android.net.Uri p1, android.os.Bundle p2) {}
    void dispatchPlay(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchPlayFromMediaId(android.media.session.MediaSessionManager.RemoteUserInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    void dispatchPlayFromSearch(android.media.session.MediaSessionManager.RemoteUserInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    void dispatchPlayFromUri(android.media.session.MediaSessionManager.RemoteUserInfo p0, android.net.Uri p1, android.os.Bundle p2) {}
    void dispatchSkipToItem(android.media.session.MediaSessionManager.RemoteUserInfo p0, long p1) {}
    void dispatchPause(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchStop(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchNext(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchPrevious(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchFastForward(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchRewind(android.media.session.MediaSessionManager.RemoteUserInfo p0) {}
    void dispatchSeekTo(android.media.session.MediaSessionManager.RemoteUserInfo p0, long p1) {}
    void dispatchRate(android.media.session.MediaSessionManager.RemoteUserInfo p0, android.media.Rating p1) {}
    void dispatchSetPlaybackSpeed(android.media.session.MediaSessionManager.RemoteUserInfo p0, float p1) {}
    void dispatchCustomAction(android.media.session.MediaSessionManager.RemoteUserInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    void dispatchMediaButton(android.media.session.MediaSessionManager.RemoteUserInfo p0, android.content.Intent p1) {}
    void dispatchMediaButtonDelayed(android.media.session.MediaSessionManager.RemoteUserInfo p0, android.content.Intent p1, long p2) {}
    void dispatchAdjustVolume(android.media.session.MediaSessionManager.RemoteUserInfo p0, int p1) {}
    void dispatchSetVolumeTo(android.media.session.MediaSessionManager.RemoteUserInfo p0, int p1) {}
    void dispatchCommand(android.media.session.MediaSessionManager.RemoteUserInfo p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3) {}
    void postToCallback(android.media.session.MediaSessionManager.RemoteUserInfo p0, int p1, java.lang.Object p2, android.os.Bundle p3) {}
    void postToCallbackDelayed(android.media.session.MediaSessionManager.RemoteUserInfo p0, int p1, java.lang.Object p2, android.os.Bundle p3, long p4) {}

    public static abstract class Callback {
        public Callback() {}
        public void onCommand(java.lang.String p0, android.os.Bundle p1, android.os.ResultReceiver p2) {}
        public boolean onMediaButtonEvent(android.content.Intent p0) { return false; }
        public void onPrepare() {}
        public void onPrepareFromMediaId(java.lang.String p0, android.os.Bundle p1) {}
        public void onPrepareFromSearch(java.lang.String p0, android.os.Bundle p1) {}
        public void onPrepareFromUri(android.net.Uri p0, android.os.Bundle p1) {}
        public void onPlay() {}
        public void onPlayFromSearch(java.lang.String p0, android.os.Bundle p1) {}
        public void onPlayFromMediaId(java.lang.String p0, android.os.Bundle p1) {}
        public void onPlayFromUri(android.net.Uri p0, android.os.Bundle p1) {}
        public void onSkipToQueueItem(long p0) {}
        public void onPause() {}
        public void onSkipToNext() {}
        public void onSkipToPrevious() {}
        public void onFastForward() {}
        public void onRewind() {}
        public void onStop() {}
        public void onSeekTo(long p0) {}
        public void onSetRating(android.media.Rating p0) {}
        public void onSetPlaybackSpeed(float p0) {}
        public void onCustomAction(java.lang.String p0, android.os.Bundle p1) {}
    }

    public static final class QueueItem implements android.os.Parcelable {
        public static final int UNKNOWN_ID = -1;
        public static final android.os.Parcelable.Creator<android.media.session.MediaSession.QueueItem> CREATOR = null;
        public QueueItem(android.media.MediaDescription p0, long p1) {}
        public android.media.MediaDescription getDescription() { return null; }
        public long getQueueId() { return 0L; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static final class Token implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.session.MediaSession.Token> CREATOR = null;
        public Token(int p0, android.media.session.ISessionController p1) {}
        Token(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public int getUid() { return 0; }
        public android.media.session.ISessionController getBinder() { return null; }
    }

    private class CallbackMessageHandler extends android.os.Handler {
        CallbackMessageHandler(android.media.session.MediaSession p0, android.os.Looper p1, android.media.session.MediaSession.Callback p2) { super(); }
        void post(android.media.session.MediaSessionManager.RemoteUserInfo p0, int p1, java.lang.Object p2, android.os.Bundle p3, long p4) {}
        public void handleMessage(android.os.Message p0) {}
    }

    public static class CallbackStub extends android.media.session.ISessionCallback.Stub {
        public CallbackStub(android.media.session.MediaSession p0) { super(); }
        public void onCommand(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4, android.os.ResultReceiver p5) {}
        public void onMediaButton(java.lang.String p0, int p1, int p2, android.content.Intent p3, int p4, android.os.ResultReceiver p5) {}
        public void onMediaButtonFromController(java.lang.String p0, int p1, int p2, android.content.Intent p3) {}
        public void onPrepare(java.lang.String p0, int p1, int p2) {}
        public void onPrepareFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) {}
        public void onPrepareFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) {}
        public void onPrepareFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) {}
        public void onPlay(java.lang.String p0, int p1, int p2) {}
        public void onPlayFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) {}
        public void onPlayFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) {}
        public void onPlayFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) {}
        public void onSkipToTrack(java.lang.String p0, int p1, int p2, long p3) {}
        public void onPause(java.lang.String p0, int p1, int p2) {}
        public void onStop(java.lang.String p0, int p1, int p2) {}
        public void onNext(java.lang.String p0, int p1, int p2) {}
        public void onPrevious(java.lang.String p0, int p1, int p2) {}
        public void onFastForward(java.lang.String p0, int p1, int p2) {}
        public void onRewind(java.lang.String p0, int p1, int p2) {}
        public void onSeekTo(java.lang.String p0, int p1, int p2, long p3) {}
        public void onRate(java.lang.String p0, int p1, int p2, android.media.Rating p3) {}
        public void onSetPlaybackSpeed(java.lang.String p0, int p1, int p2, float p3) {}
        public void onCustomAction(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) {}
        public void onAdjustVolume(java.lang.String p0, int p1, int p2, int p3) {}
        public void onSetVolumeTo(java.lang.String p0, int p1, int p2, int p3) {}
    }

    private static final class Command {
        public final java.lang.String command = null;
        public final android.os.Bundle extras = null;
        public final android.os.ResultReceiver stub = null;
        Command(java.lang.String p0, android.os.Bundle p1, android.os.ResultReceiver p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionFlags {
    }
}

package android.media.session;

public final class MediaController {
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
    public boolean controlsSameSession(android.media.session.MediaController p0) { return false; }
    public android.os.Handler getHandlerForCallback(android.media.session.MediaController.Callback p0) { return null; }

    public final class TransportControls {
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
        public static final android.os.Parcelable.Creator<android.media.session.MediaController.PlaybackInfo> CREATOR = null;
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public PlaybackInfo(int p0, int p1, int p2, int p3, android.media.AudioAttributes p4, java.lang.String p5) {}
        PlaybackInfo(android.os.Parcel p0) {}
        public int getPlaybackType() { return 0; }
        public int getVolumeControl() { return 0; }
        public int getMaxVolume() { return 0; }
        public int getCurrentVolume() { return 0; }
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        public java.lang.String getVolumeControlId() { return null; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PlaybackType {
        }
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

    private static final class CallbackStub extends android.media.session.ISessionControllerCallback.Stub {
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

    private static final class MessageHandler extends android.os.Handler {
        MessageHandler(android.os.Looper p0, android.media.session.MediaController.Callback p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void post(int p0, java.lang.Object p1, android.os.Bundle p2) {}
    }
}

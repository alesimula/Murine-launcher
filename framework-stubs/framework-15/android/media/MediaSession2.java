package android.media;

public class MediaSession2 implements java.lang.AutoCloseable {
    MediaSession2() {}
    public void broadcastSessionCommand(android.media.Session2Command p0, android.os.Bundle p1) {}
    public void cancelSessionCommand(android.media.MediaSession2.ControllerInfo p0, java.lang.Object p1) {}
    public void close() {}
    @android.annotation.NonNull
    public java.util.List<android.media.MediaSession2.ControllerInfo> getConnectedControllers() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public android.media.Session2Token getToken() { return null; }
    public boolean isPlaybackActive() { return false; }
    @android.annotation.NonNull
    public java.lang.Object sendSessionCommand(android.media.MediaSession2.ControllerInfo p0, android.media.Session2Command p1, android.os.Bundle p2) { return null; }
    public void setPlaybackActive(boolean p0) {}

    public static final class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.media.MediaSession2 build() { return null; }
        @android.annotation.NonNull
        public android.media.MediaSession2.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaSession2.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaSession2.Builder setSessionActivity(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaSession2.Builder setSessionCallback(java.util.concurrent.Executor p0, android.media.MediaSession2.SessionCallback p1) { return null; }
    }

    public static final class ControllerInfo {
        ControllerInfo() {}
        @android.annotation.NonNull
        public android.os.Bundle getConnectionHints() { return null; }
        @android.annotation.NonNull
        public java.lang.String getPackageName() { return null; }
        @android.annotation.NonNull
        public android.media.session.MediaSessionManager.RemoteUserInfo getRemoteUserInfo() { return null; }
        public int getUid() { return 0; }
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public void onCommandResult(android.media.MediaSession2 p0, android.media.MediaSession2.ControllerInfo p1, java.lang.Object p2, android.media.Session2Command p3, android.media.Session2Command.Result p4) {}
        @android.annotation.Nullable
        public android.media.Session2CommandGroup onConnect(android.media.MediaSession2 p0, android.media.MediaSession2.ControllerInfo p1) { return null; }
        public void onDisconnected(android.media.MediaSession2 p0, android.media.MediaSession2.ControllerInfo p1) {}
        public void onPostConnect(android.media.MediaSession2 p0, android.media.MediaSession2.ControllerInfo p1) {}
        @android.annotation.Nullable
        public android.media.Session2Command.Result onSessionCommand(android.media.MediaSession2 p0, android.media.MediaSession2.ControllerInfo p1, android.media.Session2Command p2, android.os.Bundle p3) { return null; }
    }
}

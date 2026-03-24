package android.media;

public class MediaController2 implements java.lang.AutoCloseable {
    MediaController2() {}
    public void close() {}
    @android.annotation.Nullable
    public android.media.Session2Token getConnectedToken() { return null; }
    public boolean isPlaybackActive() { return false; }
    @android.annotation.NonNull
    public java.lang.Object sendSessionCommand(android.media.Session2Command p0, android.os.Bundle p1) { return null; }
    public void cancelSessionCommand(java.lang.Object p0) {}

    public static abstract class ControllerCallback {
        public ControllerCallback() {}
        public void onConnected(android.media.MediaController2 p0, android.media.Session2CommandGroup p1) {}
        public void onDisconnected(android.media.MediaController2 p0) {}
        public void onPlaybackActiveChanged(android.media.MediaController2 p0, boolean p1) {}
        @android.annotation.Nullable
        public android.media.Session2Command.Result onSessionCommand(android.media.MediaController2 p0, android.media.Session2Command p1, android.os.Bundle p2) { return null; }
        public void onCommandResult(android.media.MediaController2 p0, java.lang.Object p1, android.media.Session2Command p2, android.media.Session2Command.Result p3) {}
    }

    public static final class Builder {
        public Builder(android.content.Context p0, android.media.Session2Token p1) {}
        @android.annotation.NonNull
        public android.media.MediaController2.Builder setConnectionHints(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaController2.Builder setControllerCallback(java.util.concurrent.Executor p0, android.media.MediaController2.ControllerCallback p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaController2 build() { return null; }
    }
}

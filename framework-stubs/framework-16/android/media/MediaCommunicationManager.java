package android.media;

public class MediaCommunicationManager {
    MediaCommunicationManager() {}
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0, boolean p1) {}
    @android.annotation.NonNull
    public java.util.List<android.media.Session2Token> getSession2Tokens() { return null; }
    public int getVersion() { return 0; }
    public void registerSessionCallback(java.util.concurrent.Executor p0, android.media.MediaCommunicationManager.SessionCallback p1) {}
    public void unregisterSessionCallback(android.media.MediaCommunicationManager.SessionCallback p0) {}

    public static interface SessionCallback {
        default public void onSession2TokenCreated(android.media.Session2Token p0) {}
        @android.annotation.FlaggedApi("com.android.media.mainline.flags.enable_pid_to_media_session_2")
        default public void onSession2TokenCreated(android.media.Session2Token p0, int p1) {}
        default public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0) {}
    }
}

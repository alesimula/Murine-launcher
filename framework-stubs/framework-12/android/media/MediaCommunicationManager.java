package android.media;

public class MediaCommunicationManager {
    MediaCommunicationManager() {}
    public int getVersion() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.media.Session2Token> getSession2Tokens() { return null; }
    public void registerSessionCallback(java.util.concurrent.Executor p0, android.media.MediaCommunicationManager.SessionCallback p1) {}
    public void unregisterSessionCallback(android.media.MediaCommunicationManager.SessionCallback p0) {}

    public static interface SessionCallback {
        default public void onSession2TokenCreated(android.media.Session2Token p0) {}
        default public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0) {}
    }
}

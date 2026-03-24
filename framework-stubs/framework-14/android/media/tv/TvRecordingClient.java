package android.media.tv;

public class TvRecordingClient {
    public TvRecordingClient(android.content.Context p0, java.lang.String p1, android.media.tv.TvRecordingClient.RecordingCallback p2, android.os.Handler p3) {}
    public void setTvInteractiveAppView(android.media.tv.interactive.TvInteractiveAppView p0, java.lang.String p1) {}
    public void tune(java.lang.String p0, android.net.Uri p1) {}
    public void tune(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) {}
    public void release() {}
    public void startRecording(android.net.Uri p0) {}
    public void startRecording(android.net.Uri p0, android.os.Bundle p1) {}
    public void stopRecording() {}
    public void pauseRecording() {}
    public void pauseRecording(android.os.Bundle p0) {}
    public void resumeRecording() {}
    public void resumeRecording(android.os.Bundle p0) {}
    public void sendAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public android.media.tv.TvInputManager.SessionCallback getSessionCallback() { return null; }

    public static abstract class RecordingCallback {
        public RecordingCallback() {}
        public void onConnectionFailed(java.lang.String p0) {}
        public void onDisconnected(java.lang.String p0) {}
        public void onTuned(android.net.Uri p0) {}
        public void onRecordingStopped(android.net.Uri p0) {}
        public void onError(int p0) {}
        @android.annotation.SystemApi
        public void onEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
    }

    private class MySessionCallback extends android.media.tv.TvInputManager.SessionCallback {
        final java.lang.String mInputId = null;
        android.net.Uri mChannelUri;
        android.os.Bundle mConnectionParams;
        MySessionCallback(android.media.tv.TvRecordingClient p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3) { super(); }
        public void onSessionCreated(android.media.tv.TvInputManager.Session p0) {}
        public void onTuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onSessionReleased(android.media.tv.TvInputManager.Session p0) {}
        public void onRecordingStopped(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onError(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onSessionEvent(android.media.tv.TvInputManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
    }
}

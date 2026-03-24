package android.media.tv;

public class TvRecordingClient {
    private static final java.lang.String TAG = "TvRecordingClient";
    private static final boolean DEBUG = false;
    private final android.media.tv.TvRecordingClient.RecordingCallback mCallback = null;
    private final android.os.Handler mHandler = null;
    private final android.media.tv.TvInputManager mTvInputManager = null;
    private android.media.tv.TvInputManager.Session mSession;
    private android.media.tv.TvRecordingClient.MySessionCallback mSessionCallback;
    private boolean mIsRecordingStarted;
    private boolean mIsTuned;
    private final java.util.Queue<android.util.Pair<java.lang.String, android.os.Bundle>> mPendingAppPrivateCommands = null;
    public TvRecordingClient(android.content.Context p0, java.lang.String p1, android.media.tv.TvRecordingClient.RecordingCallback p2, android.os.Handler p3) {}
    public void tune(java.lang.String p0, android.net.Uri p1) {}
    public void tune(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) {}
    public void release() {}
    private void resetInternal() {}
    public void startRecording(android.net.Uri p0) {}
    public void stopRecording() {}
    public void sendAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}

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
        void onTuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onSessionReleased(android.media.tv.TvInputManager.Session p0) {}
        public void onRecordingStopped(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onError(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onSessionEvent(android.media.tv.TvInputManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
    }
}

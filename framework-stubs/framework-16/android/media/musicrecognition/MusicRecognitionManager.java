package android.media.musicrecognition;

@android.annotation.SystemApi
public class MusicRecognitionManager {
    public static final int RECOGNITION_FAILED_UNKNOWN = -1;
    public static final int RECOGNITION_FAILED_NOT_FOUND = 1;
    public static final int RECOGNITION_FAILED_NO_CONNECTIVITY = 2;
    public static final int RECOGNITION_FAILED_SERVICE_UNAVAILABLE = 3;
    public static final int RECOGNITION_FAILED_SERVICE_KILLED = 5;
    public static final int RECOGNITION_FAILED_TIMEOUT = 6;
    public static final int RECOGNITION_FAILED_AUDIO_UNAVAILABLE = 7;
    public MusicRecognitionManager(android.media.musicrecognition.IMusicRecognitionManager p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_MUSIC_RECOGNITION")
    public void beginStreamingSearch(android.media.musicrecognition.RecognitionRequest p0, java.util.concurrent.Executor p1, android.media.musicrecognition.MusicRecognitionManager.RecognitionCallback p2) {}

    private final class MusicRecognitionCallbackWrapper extends android.media.musicrecognition.IMusicRecognitionManagerCallback.Stub {
        MusicRecognitionCallbackWrapper(android.media.musicrecognition.MusicRecognitionManager p0, android.media.musicrecognition.RecognitionRequest p1, android.media.musicrecognition.MusicRecognitionManager.RecognitionCallback p2, java.util.concurrent.Executor p3) { super(); }
        public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) {}
        public void onRecognitionFailed(int p0) {}
        public void onAudioStreamClosed() {}
    }

    public static interface RecognitionCallback {
        public void onRecognitionSucceeded(android.media.musicrecognition.RecognitionRequest p0, android.media.MediaMetadata p1, android.os.Bundle p2);
        public void onRecognitionFailed(android.media.musicrecognition.RecognitionRequest p0, int p1);
        public void onAudioStreamClosed();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionFailureCode {
    }
}

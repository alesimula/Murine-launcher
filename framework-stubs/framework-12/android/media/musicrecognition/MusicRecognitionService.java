package android.media.musicrecognition;

@android.annotation.SystemApi
public abstract class MusicRecognitionService extends android.app.Service {
    private static final java.lang.String TAG = null;
    public static final java.lang.String ACTION_MUSIC_SEARCH_LOOKUP = "android.service.musicrecognition.MUSIC_RECOGNITION";
    private android.os.Handler mHandler;
    private final android.media.musicrecognition.IMusicRecognitionService mServiceInterface = null;
    public MusicRecognitionService() { super(); }
    public void onCreate() {}
    public abstract void onRecognize(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.media.musicrecognition.MusicRecognitionService.Callback p2);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    public static interface Callback {
        public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1);
        public void onRecognitionFailed(int p0);
    }
}

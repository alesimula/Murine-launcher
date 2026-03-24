package android.speech.tts;

class AudioPlaybackQueueItem extends android.speech.tts.PlaybackQueueItem {
    private static final java.lang.String TAG = "TTS.AudioQueueItem";
    private final android.content.Context mContext = null;
    private final android.net.Uri mUri = null;
    private final android.speech.tts.TextToSpeechService.AudioOutputParams mAudioParams = null;
    private final android.os.ConditionVariable mDone = null;
    private android.media.MediaPlayer mPlayer;
    private volatile boolean mFinished;
    AudioPlaybackQueueItem(android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p0, java.lang.Object p1, android.content.Context p2, android.net.Uri p3, android.speech.tts.TextToSpeechService.AudioOutputParams p4) { super(null, null); }
    public void run() {}
    private static void setupVolume(android.media.MediaPlayer p0, float p1, float p2) {}
    private static final float clip(float p0, float p1, float p2) { return 0.0f; }
    private void finish() {}
    void stop(int p0) {}
}

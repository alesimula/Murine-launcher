package android.speech.tts;

class PlaybackSynthesisCallback extends android.speech.tts.AbstractSynthesisCallback {
    private static final java.lang.String TAG = "PlaybackSynthesisRequest";
    private static final boolean DBG = false;
    private static final int MIN_AUDIO_BUFFER_SIZE = 8192;
    private final android.speech.tts.TextToSpeechService.AudioOutputParams mAudioParams = null;
    private final java.lang.Object mStateLock = null;
    private final android.speech.tts.AudioPlaybackHandler mAudioTrackHandler = null;
    private android.speech.tts.SynthesisPlaybackQueueItem mItem;
    private volatile boolean mDone;
    protected int mStatusCode;
    private final android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher mDispatcher = null;
    private final java.lang.Object mCallerIdentity = null;
    private final android.speech.tts.AbstractEventLogger mLogger = null;
    PlaybackSynthesisCallback(android.speech.tts.TextToSpeechService.AudioOutputParams p0, android.speech.tts.AudioPlaybackHandler p1, android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p2, java.lang.Object p3, android.speech.tts.AbstractEventLogger p4, boolean p5) { super(false); }
    void stop() {}
    public int getMaxBufferSize() { return 0; }
    public boolean hasStarted() { return false; }
    public boolean hasFinished() { return false; }
    public int start(int p0, int p1, int p2) { return 0; }
    public int audioAvailable(byte[] p0, int p1, int p2) { return 0; }
    public int done() { return 0; }
    public void error() {}
    public void error(int p0) {}
    public void rangeStart(int p0, int p1, int p2) {}
}

package android.speech.tts;

class BlockingAudioTrack {
    private static final java.lang.String TAG = "TTS.BlockingAudioTrack";
    private static final boolean DBG = false;
    private static final long MIN_SLEEP_TIME_MS = 20L;
    private static final long MAX_SLEEP_TIME_MS = 2500L;
    private static final long MAX_PROGRESS_WAIT_MS = 2500L;
    private static final int MIN_AUDIO_BUFFER_SIZE = 8192;
    private final android.speech.tts.TextToSpeechService.AudioOutputParams mAudioParams = null;
    private final int mSampleRateInHz = 0;
    private final int mAudioFormat = 0;
    private final int mChannelCount = 0;
    private final int mBytesPerFrame = 0;
    private boolean mIsShortUtterance;
    private int mAudioBufferSize;
    private int mBytesWritten;
    private java.lang.Object mAudioTrackLock;
    private android.media.AudioTrack mAudioTrack;
    private volatile boolean mStopped;
    private int mSessionId;
    BlockingAudioTrack(android.speech.tts.TextToSpeechService.AudioOutputParams p0, int p1, int p2, int p3) {}
    public boolean init() { return false; }
    public void stop() {}
    public int write(byte[] p0) { return 0; }
    public void waitAndRelease() {}
    static int getChannelConfig(int p0) { return 0; }
    long getAudioLengthMs(int p0) { return 0L; }
    private static int writeToAudioTrack(android.media.AudioTrack p0, byte[] p1) { return 0; }
    private android.media.AudioTrack createStreamingAudioTrack() { return null; }
    private void blockUntilDone(android.media.AudioTrack p0) {}
    private void blockUntilEstimatedCompletion() {}
    private void blockUntilCompletion(android.media.AudioTrack p0) {}
    private static void setupVolume(android.media.AudioTrack p0, float p1, float p2) {}
    private static final long clip(long p0, long p1, long p2) { return 0L; }
    private static final float clip(float p0, float p1, float p2) { return 0.0f; }
    public void setPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener p0) {}
    public void setNotificationMarkerPosition(int p0) {}
}

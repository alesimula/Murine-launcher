package android.speech.tts;

class FileSynthesisCallback extends android.speech.tts.AbstractSynthesisCallback {
    private static final java.lang.String TAG = "FileSynthesisRequest";
    private static final boolean DBG = false;
    private static final int MAX_AUDIO_BUFFER_SIZE = 8192;
    private static final int WAV_HEADER_LENGTH = 44;
    private static final short WAV_FORMAT_PCM = 1;
    private final java.lang.Object mStateLock = null;
    private int mSampleRateInHz;
    private int mAudioFormat;
    private int mChannelCount;
    private java.nio.channels.FileChannel mFileChannel;
    private final android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher mDispatcher = null;
    private boolean mStarted;
    private boolean mDone;
    protected int mStatusCode;
    FileSynthesisCallback(java.nio.channels.FileChannel p0, android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p1, boolean p2) { super(false); }
    void stop() {}
    private void cleanUp() {}
    private void closeFile() {}
    public int getMaxBufferSize() { return 0; }
    public int start(int p0, int p1, int p2) { return 0; }
    public int audioAvailable(byte[] p0, int p1, int p2) { return 0; }
    public int done() { return 0; }
    public void error() {}
    public void error(int p0) {}
    public boolean hasStarted() { return false; }
    public boolean hasFinished() { return false; }
    private java.nio.ByteBuffer makeWavHeader(int p0, int p1, int p2, int p3) { return null; }
    public void rangeStart(int p0, int p1, int p2) {}
}

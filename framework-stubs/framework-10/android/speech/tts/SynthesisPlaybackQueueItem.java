package android.speech.tts;

final class SynthesisPlaybackQueueItem extends android.speech.tts.PlaybackQueueItem implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {
    private static final java.lang.String TAG = "TTS.SynthQueueItem";
    private static final boolean DBG = false;
    private static final long MAX_UNCONSUMED_AUDIO_MS = 500L;
    private final java.util.concurrent.locks.Lock mListLock = null;
    private final java.util.concurrent.locks.Condition mReadReady = null;
    private final java.util.concurrent.locks.Condition mNotFull = null;
    private final java.util.LinkedList<android.speech.tts.SynthesisPlaybackQueueItem.ListEntry> mDataBufferList = null;
    private int mUnconsumedBytes;
    private volatile boolean mStopped;
    private volatile boolean mDone;
    private volatile int mStatusCode;
    private final android.speech.tts.BlockingAudioTrack mAudioTrack = null;
    private final android.speech.tts.AbstractEventLogger mLogger = null;
    private java.util.concurrent.ConcurrentLinkedQueue<android.speech.tts.SynthesisPlaybackQueueItem.ProgressMarker> markerList;
    private static final int NOT_RUN = 0;
    private static final int RUN_CALLED = 1;
    private static final int STOP_CALLED = 2;
    private final java.util.concurrent.atomic.AtomicInteger mRunState = null;
    SynthesisPlaybackQueueItem(android.speech.tts.TextToSpeechService.AudioOutputParams p0, int p1, int p2, int p3, android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p4, java.lang.Object p5, android.speech.tts.AbstractEventLogger p6) { super(null, null); }
    public void run() {}
    private void dispatchEndStatus() {}
    void stop(int p0) {}
    void done() {}
    void updateMarker() {}
    void rangeStart(int p0, int p1, int p2) {}
    public void onMarkerReached(android.media.AudioTrack p0) {}
    public void onPeriodicNotification(android.media.AudioTrack p0) {}
    void put(byte[] p0) throws java.lang.InterruptedException {}
    private byte[] take() throws java.lang.InterruptedException { return null; }

    private class ProgressMarker {
        public final int frames = 0;
        public final int start = 0;
        public final int end = 0;
        public ProgressMarker(android.speech.tts.SynthesisPlaybackQueueItem p0, int p1, int p2, int p3) {}
    }

    static final class ListEntry {
        final byte[] mBytes = null;
        ListEntry(byte[] p0) {}
    }
}

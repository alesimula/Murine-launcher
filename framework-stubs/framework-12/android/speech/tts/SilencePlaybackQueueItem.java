package android.speech.tts;

class SilencePlaybackQueueItem extends android.speech.tts.PlaybackQueueItem {
    private final android.os.ConditionVariable mCondVar = null;
    private final long mSilenceDurationMs = 0L;
    SilencePlaybackQueueItem(android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p0, java.lang.Object p1, long p2) { super(null, null); }
    public void run() {}
    void stop(int p0) {}
}

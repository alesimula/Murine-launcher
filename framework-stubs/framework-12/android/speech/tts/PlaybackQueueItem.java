package android.speech.tts;

abstract class PlaybackQueueItem implements java.lang.Runnable {
    private final android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher mDispatcher = null;
    private final java.lang.Object mCallerIdentity = null;
    PlaybackQueueItem(android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p0, java.lang.Object p1) {}
    java.lang.Object getCallerIdentity() { return null; }
    protected android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher getDispatcher() { return null; }
    public abstract void run();
    abstract void stop(int p0);
}

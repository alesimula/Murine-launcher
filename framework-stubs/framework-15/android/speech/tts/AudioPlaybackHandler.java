package android.speech.tts;

class AudioPlaybackHandler {
    AudioPlaybackHandler() {}
    public void start() {}
    public void enqueue(android.speech.tts.PlaybackQueueItem p0) {}
    public void stopForApp(java.lang.Object p0) {}
    public void stop() {}
    public boolean isSpeaking() { return false; }
    public void quit() {}

    private final class MessageLoop implements java.lang.Runnable {
        public void run() {}
    }
}

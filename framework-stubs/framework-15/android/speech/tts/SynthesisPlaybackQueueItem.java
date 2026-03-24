package android.speech.tts;

final class SynthesisPlaybackQueueItem extends android.speech.tts.PlaybackQueueItem implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {
    SynthesisPlaybackQueueItem(android.speech.tts.TextToSpeechService.AudioOutputParams p0, int p1, int p2, int p3, android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p4, java.lang.Object p5, android.speech.tts.AbstractEventLogger p6) { super(null, null); }
    public void run() {}
    void stop(int p0) {}
    void done() {}
    void updateMarker() {}
    void rangeStart(int p0, int p1, int p2) {}
    public void onMarkerReached(android.media.AudioTrack p0) {}
    public void onPeriodicNotification(android.media.AudioTrack p0) {}
    void put(byte[] p0) throws java.lang.InterruptedException {}

    static final class ListEntry {
        final byte[] mBytes = null;
        ListEntry(byte[] p0) {}
    }

    private class ProgressMarker {
        public final int frames = 0;
        public final int start = 0;
        public final int end = 0;
        public ProgressMarker(android.speech.tts.SynthesisPlaybackQueueItem p0, int p1, int p2, int p3) {}
    }
}

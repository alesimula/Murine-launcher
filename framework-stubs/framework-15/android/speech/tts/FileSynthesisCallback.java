package android.speech.tts;

class FileSynthesisCallback extends android.speech.tts.AbstractSynthesisCallback {
    protected int mStatusCode;
    FileSynthesisCallback(java.nio.channels.FileChannel p0, android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p1, boolean p2) { super(false); }
    void stop() {}
    public int getMaxBufferSize() { return 0; }
    public int start(int p0, int p1, int p2) { return 0; }
    public int audioAvailable(byte[] p0, int p1, int p2) { return 0; }
    public int done() { return 0; }
    public void error() {}
    public void error(int p0) {}
    public boolean hasStarted() { return false; }
    public boolean hasFinished() { return false; }
    public void rangeStart(int p0, int p1, int p2) {}
}

package android.speech.tts;

public abstract class UtteranceProgressListener {
    public UtteranceProgressListener() {}
    public abstract void onStart(java.lang.String p0);
    public abstract void onDone(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void onError(java.lang.String p0);
    public void onError(java.lang.String p0, int p1) {}
    public void onStop(java.lang.String p0, boolean p1) {}
    public void onBeginSynthesis(java.lang.String p0, int p1, int p2, int p3) {}
    public void onAudioAvailable(java.lang.String p0, byte[] p1) {}
    public void onRangeStart(java.lang.String p0, int p1, int p2, int p3) {}
    @java.lang.Deprecated
    public void onUtteranceRangeStart(java.lang.String p0, int p1, int p2) {}
    static android.speech.tts.UtteranceProgressListener from(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener p0) { return null; }
}

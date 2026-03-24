package android.speech;

public interface RecognitionListener {
    public void onReadyForSpeech(android.os.Bundle p0);
    public void onBeginningOfSpeech();
    public void onRmsChanged(float p0);
    public void onBufferReceived(byte[] p0);
    public void onEndOfSpeech();
    public void onError(int p0);
    public void onResults(android.os.Bundle p0);
    public void onPartialResults(android.os.Bundle p0);
    default public void onSegmentResults(android.os.Bundle p0) {}
    default public void onEndOfSegmentedSession() {}
    default public void onLanguageDetection(android.os.Bundle p0) {}
    public void onEvent(int p0, android.os.Bundle p1);
}

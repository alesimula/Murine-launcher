package android.speech.tts;

public interface SynthesisCallback {
    public int getMaxBufferSize();
    public int start(int p0, int p1, int p2);
    public int audioAvailable(byte[] p0, int p1, int p2);
    public int done();
    public void error();
    public void error(int p0);
    public boolean hasStarted();
    public boolean hasFinished();
    default public void rangeStart(int p0, int p1, int p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupportedAudioFormat {
    }
}

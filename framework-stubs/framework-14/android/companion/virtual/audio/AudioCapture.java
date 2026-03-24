package android.companion.virtual.audio;

@android.annotation.SystemApi
@android.annotation.SuppressLint("NotCloseable")
public final class AudioCapture {
    void setAudioRecord(android.media.AudioRecord p0) {}
    AudioCapture(android.media.AudioFormat p0) {}
    void close() {}
    public android.media.AudioFormat getFormat() { return null; }
    public int read(byte[] p0, int p1, int p2) { return 0; }
    public int read(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1) { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public int read(float[] p0, int p1, int p2, int p3) { return 0; }
    public int read(short[] p0, int p1, int p2) { return 0; }
    public int read(short[] p0, int p1, int p2, int p3) { return 0; }
    public void startRecording() {}
    public void stop() {}
    public int getRecordingState() { return 0; }
}

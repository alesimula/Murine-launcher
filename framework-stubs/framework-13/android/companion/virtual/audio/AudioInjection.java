package android.companion.virtual.audio;

@android.annotation.SystemApi
@android.annotation.SuppressLint("NotCloseable")
public final class AudioInjection {
    void setSilent(boolean p0) {}
    void setAudioTrack(android.media.AudioTrack p0) {}
    AudioInjection(android.media.AudioFormat p0) {}
    void close() {}
    public android.media.AudioFormat getFormat() { return null; }
    public int write(byte[] p0, int p1, int p2) { return 0; }
    public int write(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int write(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public int write(java.nio.ByteBuffer p0, int p1, int p2, long p3) { return 0; }
    public int write(float[] p0, int p1, int p2, int p3) { return 0; }
    public int write(short[] p0, int p1, int p2) { return 0; }
    public int write(short[] p0, int p1, int p2, int p3) { return 0; }
    public void play() {}
    public void stop() {}
    public int getPlayState() { return 0; }
}

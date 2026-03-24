package android.media;

public class AsyncPlayer {
    public AsyncPlayer(java.lang.String p0) {}
    public void play(android.content.Context p0, android.net.Uri p1, boolean p2, int p3) {}
    public void play(android.content.Context p0, android.net.Uri p1, boolean p2, android.media.AudioAttributes p3) throws java.lang.IllegalArgumentException {}
    public void stop() {}
    public void setUsesWakeLock(android.content.Context p0) {}

    private static final class Command {
        int code;
        android.content.Context context;
        android.net.Uri uri;
        boolean looping;
        android.media.AudioAttributes attributes;
        long requestTime;
        public java.lang.String toString() { return null; }
    }

    private final class Thread extends java.lang.Thread {
        Thread(android.media.AsyncPlayer p0) { super(); }
        public void run() {}
    }
}

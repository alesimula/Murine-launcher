package android.media;

public class MediaActionSound {
    public static final int SHUTTER_CLICK = 0;
    public static final int FOCUS_COMPLETE = 1;
    public static final int START_VIDEO_RECORDING = 2;
    public static final int STOP_VIDEO_RECORDING = 3;
    public static boolean mustPlayShutterSound() { return false; }
    public MediaActionSound() {}
    public void load(int p0) {}
    public void play(int p0) {}
    public void release() {}

    private class SoundState {
        public final int name = 0;
        public int id;
        public int state;
        public SoundState(android.media.MediaActionSound p0, int p1) {}
    }
}

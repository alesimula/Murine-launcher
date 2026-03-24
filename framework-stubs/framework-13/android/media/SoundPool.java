package android.media;

public class SoundPool extends android.media.PlayerBase {
    public SoundPool(int p0, int p1, int p2) { super(null, 0); }
    public final void release() {}
    protected void finalize() {}
    public int load(java.lang.String p0, int p1) { return 0; }
    public int load(android.content.Context p0, int p1, int p2) { return 0; }
    public int load(android.content.res.AssetFileDescriptor p0, int p1) { return 0; }
    public int load(java.io.FileDescriptor p0, long p1, long p2, int p3) { return 0; }
    public final native boolean unload(int p0);
    public final int play(int p0, float p1, float p2, int p3, int p4, float p5) { return 0; }
    public final native void pause(int p0);
    public final native void resume(int p0);
    public final native void autoPause();
    public final native void autoResume();
    public final native void stop(int p0);
    public final void setVolume(int p0, float p1, float p2) {}
    int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    android.media.VolumeShaper.State playerGetVolumeShaperState(int p0) { return null; }
    void playerSetVolume(boolean p0, float p1, float p2) {}
    int playerSetAuxEffectSendLevel(boolean p0, float p1) { return 0; }
    void playerStart() {}
    void playerPause() {}
    void playerStop() {}
    public void setVolume(int p0, float p1) {}
    public final native void setPriority(int p0, int p1);
    public final native void setLoop(int p0, int p1);
    public final native void setRate(int p0, float p1);
    public void setOnLoadCompleteListener(android.media.SoundPool.OnLoadCompleteListener p0) {}

    public static class Builder {
        public Builder() {}
        public android.media.SoundPool.Builder setMaxStreams(int p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.SoundPool.Builder setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.SoundPool build() { return null; }
    }

    private final class EventHandler extends android.os.Handler {
        EventHandler(android.media.SoundPool p0, android.os.Looper p1, android.media.SoundPool.OnLoadCompleteListener p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnLoadCompleteListener {
        public void onLoadComplete(android.media.SoundPool p0, int p1, int p2);
    }
}

package android.media;

public class Ringtone {
    public Ringtone(android.content.Context p0, boolean p1) {}
    @java.lang.Deprecated
    public void setStreamType(int p0) {}
    @java.lang.Deprecated
    public int getStreamType() { return 0; }
    public void setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException {}
    public void setAudioAttributesField(android.media.AudioAttributes p0) {}
    public boolean preferBuiltinDevice(boolean p0) { return false; }
    public boolean createLocalMediaPlayer() { return false; }
    public boolean hasHapticChannels() { return false; }
    public boolean hasLocalPlayer() { return false; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public void setLooping(boolean p0) {}
    public boolean isLooping() { return false; }
    public void setVolume(float p0) {}
    public float getVolume() { return 0.0f; }
    public boolean setHapticGeneratorEnabled(boolean p0) { return false; }
    public boolean isHapticGeneratorEnabled() { return false; }
    public java.lang.String getTitle(android.content.Context p0) { return null; }
    public static java.lang.String getTitle(android.content.Context p0, android.net.Uri p1, boolean p2, boolean p3) { return null; }
    public void setUri(android.net.Uri p0) {}
    public void setVolumeShaperConfig(android.media.VolumeShaper.Configuration p0) {}
    public void setUri(android.net.Uri p0, android.media.VolumeShaper.Configuration p1) {}
    public android.net.Uri getUri() { return null; }
    public void play() {}
    public void stop() {}
    public boolean isPlaying() { return false; }
    void setTitle(java.lang.String p0) {}
    protected void finalize() {}

    class MyOnCompletionListener implements android.media.MediaPlayer.OnCompletionListener {
        MyOnCompletionListener(android.media.Ringtone p0) {}
        public void onCompletion(android.media.MediaPlayer p0) {}
    }
}

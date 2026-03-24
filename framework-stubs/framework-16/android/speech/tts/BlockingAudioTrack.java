package android.speech.tts;

class BlockingAudioTrack {
    BlockingAudioTrack(android.speech.tts.TextToSpeechService.AudioOutputParams p0, int p1, int p2, int p3) {}
    public boolean init() { return false; }
    public void stop() {}
    public int write(byte[] p0) { return 0; }
    public void waitAndRelease() {}
    static int getChannelConfig(int p0) { return 0; }
    long getAudioLengthMs(int p0) { return 0L; }
    public void setPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener p0) {}
    public void setNotificationMarkerPosition(int p0) {}
}

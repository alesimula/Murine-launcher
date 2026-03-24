package android.media;

public class JetPlayer {
    public static android.media.JetPlayer getJetPlayer() { return null; }
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    protected void finalize() {}
    public void release() {}
    public static int getMaxTracks() { return 0; }
    public boolean loadJetFile(java.lang.String p0) { return false; }
    public boolean loadJetFile(android.content.res.AssetFileDescriptor p0) { return false; }
    public boolean closeJetFile() { return false; }
    public boolean play() { return false; }
    public boolean pause() { return false; }
    public boolean queueJetSegment(int p0, int p1, int p2, int p3, int p4, byte p5) { return false; }
    public boolean queueJetSegmentMuteArray(int p0, int p1, int p2, int p3, boolean[] p4, byte p5) { return false; }
    public boolean setMuteFlags(int p0, boolean p1) { return false; }
    public boolean setMuteArray(boolean[] p0, boolean p1) { return false; }
    public boolean setMuteFlag(int p0, boolean p1, boolean p2) { return false; }
    public boolean triggerClip(int p0) { return false; }
    public boolean clearQueue() { return false; }
    public void setEventListener(android.media.JetPlayer.OnJetEventListener p0) {}
    public void setEventListener(android.media.JetPlayer.OnJetEventListener p0, android.os.Handler p1) {}

    public static interface OnJetEventListener {
        public void onJetEvent(android.media.JetPlayer p0, short p1, byte p2, byte p3, byte p4, byte p5);
        public void onJetUserIdUpdate(android.media.JetPlayer p0, int p1, int p2);
        public void onJetNumQueuedSegmentUpdate(android.media.JetPlayer p0, int p1);
        public void onJetPauseUpdate(android.media.JetPlayer p0, int p1);
    }

    private class NativeEventHandler extends android.os.Handler {
        public NativeEventHandler(android.media.JetPlayer p0, android.media.JetPlayer p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}

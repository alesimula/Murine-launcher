package android.media;

class SRTTrack extends android.media.WebVttTrack {
    SRTTrack(android.media.WebVttRenderingWidget p0, android.media.MediaFormat p1) { super(null, null); }
    SRTTrack(android.os.Handler p0, android.media.MediaFormat p1) { super(null, null); }
    protected void onData(android.media.SubtitleData p0) {}
    public void onData(byte[] p0, boolean p1, long p2) {}
    public void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
}

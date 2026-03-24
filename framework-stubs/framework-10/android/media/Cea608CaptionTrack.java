package android.media;

class Cea608CaptionTrack extends android.media.SubtitleTrack {
    private final android.media.Cea608CCParser mCCParser = null;
    private final android.media.Cea608CCWidget mRenderingWidget = null;
    Cea608CaptionTrack(android.media.Cea608CCWidget p0, android.media.MediaFormat p1) { super(null); }
    public void onData(byte[] p0, boolean p1, long p2) {}
    public android.media.SubtitleTrack.RenderingWidget getRenderingWidget() { return null; }
    public void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
}

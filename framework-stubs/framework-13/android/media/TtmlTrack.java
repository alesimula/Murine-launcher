package android.media;

class TtmlTrack extends android.media.SubtitleTrack implements android.media.TtmlNodeListener {
    TtmlTrack(android.media.TtmlRenderingWidget p0, android.media.MediaFormat p1) { super(null); }
    public android.media.TtmlRenderingWidget getRenderingWidget() { return null; }
    public void onData(byte[] p0, boolean p1, long p2) {}
    public void onTtmlNodeParsed(android.media.TtmlNode p0) {}
    public void onRootNodeParsed(android.media.TtmlNode p0) {}
    public void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
    public android.media.TtmlCue getNextResult() { return null; }
}

package android.media;

class TtmlTrack extends android.media.SubtitleTrack implements android.media.TtmlNodeListener {
    private static final java.lang.String TAG = "TtmlTrack";
    private final android.media.TtmlParser mParser = null;
    private final android.media.TtmlRenderingWidget mRenderingWidget = null;
    private java.lang.String mParsingData;
    private java.lang.Long mCurrentRunID;
    private final java.util.LinkedList<android.media.TtmlNode> mTtmlNodes = null;
    private final java.util.TreeSet<java.lang.Long> mTimeEvents = null;
    private android.media.TtmlNode mRootNode;
    TtmlTrack(android.media.TtmlRenderingWidget p0, android.media.MediaFormat p1) { super(null); }
    public android.media.TtmlRenderingWidget getRenderingWidget() { return null; }
    public void onData(byte[] p0, boolean p1, long p2) {}
    public void onTtmlNodeParsed(android.media.TtmlNode p0) {}
    public void onRootNodeParsed(android.media.TtmlNode p0) {}
    public void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
    public android.media.TtmlCue getNextResult() { return null; }
    private void addTimeEvents(android.media.TtmlNode p0) {}
    private java.util.List<android.media.TtmlNode> getActiveNodes(long p0, long p1) { return null; }
}

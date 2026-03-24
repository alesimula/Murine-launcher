package android.media;

class WebVttTrack extends android.media.SubtitleTrack implements android.media.WebVttCueListener {
    private static final java.lang.String TAG = "WebVttTrack";
    private final android.media.WebVttParser mParser = null;
    private final android.media.UnstyledTextExtractor mExtractor = null;
    private final android.media.Tokenizer mTokenizer = null;
    private final java.util.Vector<java.lang.Long> mTimestamps = null;
    private final android.media.WebVttRenderingWidget mRenderingWidget = null;
    private final java.util.Map<java.lang.String, android.media.TextTrackRegion> mRegions = null;
    private java.lang.Long mCurrentRunID;
    WebVttTrack(android.media.WebVttRenderingWidget p0, android.media.MediaFormat p1) { super(null); }
    public android.media.WebVttRenderingWidget getRenderingWidget() { return null; }
    public void onData(byte[] p0, boolean p1, long p2) {}
    public void onCueParsed(android.media.TextTrackCue p0) {}
    public void onRegionParsed(android.media.TextTrackRegion p0) {}
    public void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
}

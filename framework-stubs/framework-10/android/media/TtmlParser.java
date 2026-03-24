package android.media;

class TtmlParser {
    static final java.lang.String TAG = "TtmlParser";
    private static final int DEFAULT_FRAMERATE = 30;
    private static final int DEFAULT_SUBFRAMERATE = 1;
    private static final int DEFAULT_TICKRATE = 1;
    private org.xmlpull.v1.XmlPullParser mParser;
    private final android.media.TtmlNodeListener mListener = null;
    private long mCurrentRunId;
    public TtmlParser(android.media.TtmlNodeListener p0) {}
    public void parse(java.lang.String p0, long p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void loadParser(java.lang.String p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void extractAttribute(org.xmlpull.v1.XmlPullParser p0, int p1, java.lang.StringBuilder p2) {}
    private void parseTtml() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private android.media.TtmlNode parseNode(android.media.TtmlNode p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private boolean isEndOfDoc() throws org.xmlpull.v1.XmlPullParserException { return false; }
    private static boolean isSupportedTag(java.lang.String p0) { return false; }
}

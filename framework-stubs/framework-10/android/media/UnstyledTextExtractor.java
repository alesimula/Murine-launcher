package android.media;

class UnstyledTextExtractor implements android.media.Tokenizer.OnTokenListener {
    java.lang.StringBuilder mLine;
    java.util.Vector<android.media.TextTrackCueSpan[]> mLines;
    java.util.Vector<android.media.TextTrackCueSpan> mCurrentLine;
    long mLastTimestamp;
    UnstyledTextExtractor() {}
    private void init() {}
    public void onData(java.lang.String p0) {}
    public void onStart(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) {}
    public void onEnd(java.lang.String p0) {}
    public void onTimeStamp(long p0) {}
    public void onLineEnd() {}
    public android.media.TextTrackCueSpan[][] getText() { return null; }
}

package android.media;

class TextTrackCue extends android.media.SubtitleTrack.Cue {
    static final int WRITING_DIRECTION_HORIZONTAL = 100;
    static final int WRITING_DIRECTION_VERTICAL_RL = 101;
    static final int WRITING_DIRECTION_VERTICAL_LR = 102;
    static final int ALIGNMENT_MIDDLE = 200;
    static final int ALIGNMENT_START = 201;
    static final int ALIGNMENT_END = 202;
    static final int ALIGNMENT_LEFT = 203;
    static final int ALIGNMENT_RIGHT = 204;
    java.lang.String mId;
    boolean mPauseOnExit;
    int mWritingDirection;
    java.lang.String mRegionId;
    boolean mSnapToLines;
    java.lang.Integer mLinePosition;
    boolean mAutoLinePosition;
    int mTextPosition;
    int mSize;
    int mAlignment;
    java.lang.String[] mStrings;
    android.media.TextTrackCueSpan[][] mLines;
    android.media.TextTrackRegion mRegion;
    TextTrackCue() { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.StringBuilder appendStringsToBuilder(java.lang.StringBuilder p0) { return null; }
    public java.lang.StringBuilder appendLinesToBuilder(java.lang.StringBuilder p0) { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public void onTime(long p0) {}
}

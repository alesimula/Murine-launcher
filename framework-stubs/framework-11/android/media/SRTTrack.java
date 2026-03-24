package android.media;

class SRTTrack extends android.media.WebVttTrack {
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int KEY_STRUCT_TEXT = 16;
    private static final int KEY_START_TIME = 7;
    private static final int KEY_LOCAL_SETTING = 102;
    private static final java.lang.String TAG = "SRTTrack";
    private final android.os.Handler mEventHandler = null;
    SRTTrack(android.media.WebVttRenderingWidget p0, android.media.MediaFormat p1) { super(null, null); }
    SRTTrack(android.os.Handler p0, android.media.MediaFormat p1) { super(null, null); }
    protected void onData(android.media.SubtitleData p0) {}
    public void onData(byte[] p0, boolean p1, long p2) {}
    public void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
    private static long parseMs(java.lang.String p0) { return 0L; }
}

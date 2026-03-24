package android.media;

public class SRTRenderer extends android.media.SubtitleController.Renderer {
    private final android.content.Context mContext = null;
    private final boolean mRender = false;
    private final android.os.Handler mEventHandler = null;
    private android.media.WebVttRenderingWidget mRenderingWidget;
    public SRTRenderer(android.content.Context p0) { super(); }
    SRTRenderer(android.content.Context p0, android.os.Handler p1) { super(); }
    public boolean supports(android.media.MediaFormat p0) { return false; }
    public android.media.SubtitleTrack createTrack(android.media.MediaFormat p0) { return null; }
}

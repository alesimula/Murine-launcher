package android.media;

public class WebVttRenderer extends android.media.SubtitleController.Renderer {
    private final android.content.Context mContext = null;
    private android.media.WebVttRenderingWidget mRenderingWidget;
    public WebVttRenderer(android.content.Context p0) { super(); }
    public boolean supports(android.media.MediaFormat p0) { return false; }
    public android.media.SubtitleTrack createTrack(android.media.MediaFormat p0) { return null; }
}

package android.media;

public class TtmlRenderer extends android.media.SubtitleController.Renderer {
    private final android.content.Context mContext = null;
    private static final java.lang.String MEDIA_MIMETYPE_TEXT_TTML = "application/ttml+xml";
    private android.media.TtmlRenderingWidget mRenderingWidget;
    @android.annotation.UnsupportedAppUsage
    public TtmlRenderer(android.content.Context p0) { super(); }
    public boolean supports(android.media.MediaFormat p0) { return false; }
    public android.media.SubtitleTrack createTrack(android.media.MediaFormat p0) { return null; }
}

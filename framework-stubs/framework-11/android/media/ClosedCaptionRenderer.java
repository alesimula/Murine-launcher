package android.media;

public class ClosedCaptionRenderer extends android.media.SubtitleController.Renderer {
    private final android.content.Context mContext = null;
    private android.media.Cea608CCWidget mCCWidget;
    public ClosedCaptionRenderer(android.content.Context p0) { super(); }
    public boolean supports(android.media.MediaFormat p0) { return false; }
    public android.media.SubtitleTrack createTrack(android.media.MediaFormat p0) { return null; }
}

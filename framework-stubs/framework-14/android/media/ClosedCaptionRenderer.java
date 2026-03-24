package android.media;

public class ClosedCaptionRenderer extends android.media.SubtitleController.Renderer {
    public ClosedCaptionRenderer(android.content.Context p0) { super(); }
    public boolean supports(android.media.MediaFormat p0) { return false; }
    public android.media.SubtitleTrack createTrack(android.media.MediaFormat p0) { return null; }
}

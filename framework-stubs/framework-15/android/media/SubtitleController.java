package android.media;

public class SubtitleController {
    public SubtitleController(android.content.Context p0, android.media.MediaTimeProvider p1, android.media.SubtitleController.Listener p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public android.media.SubtitleTrack[] getTracks() { return null; }
    public android.media.SubtitleTrack getSelectedTrack() { return null; }
    public boolean selectTrack(android.media.SubtitleTrack p0) { return false; }
    public android.media.SubtitleTrack getDefaultTrack() { return null; }
    public void selectDefaultTrack() {}
    public void reset() {}
    public android.media.SubtitleTrack addTrack(android.media.MediaFormat p0) { return null; }
    public void show() {}
    public void hide() {}
    public void registerRenderer(android.media.SubtitleController.Renderer p0) {}
    public boolean hasRendererFor(android.media.MediaFormat p0) { return false; }
    public void setAnchor(android.media.SubtitleController.Anchor p0) {}

    public static interface Anchor {
        public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget p0);
        public android.os.Looper getSubtitleLooper();
    }

    public static interface Listener {
        public void onSubtitleTrackSelected(android.media.SubtitleTrack p0);
    }

    public static abstract class Renderer {
        public Renderer() {}
        public abstract boolean supports(android.media.MediaFormat p0);
        public abstract android.media.SubtitleTrack createTrack(android.media.MediaFormat p0);
    }
}

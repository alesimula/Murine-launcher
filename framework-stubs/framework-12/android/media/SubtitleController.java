package android.media;

public class SubtitleController {
    private android.media.MediaTimeProvider mTimeProvider;
    private java.util.Vector<android.media.SubtitleController.Renderer> mRenderers;
    private java.util.Vector<android.media.SubtitleTrack> mTracks;
    private android.media.SubtitleTrack mSelectedTrack;
    private boolean mShowing;
    private android.view.accessibility.CaptioningManager mCaptioningManager;
    private android.os.Handler mHandler;
    private static final int WHAT_SHOW = 1;
    private static final int WHAT_HIDE = 2;
    private static final int WHAT_SELECT_TRACK = 3;
    private static final int WHAT_SELECT_DEFAULT_TRACK = 4;
    private final android.os.Handler.Callback mCallback = null;
    private android.view.accessibility.CaptioningManager.CaptioningChangeListener mCaptioningChangeListener;
    private boolean mTrackIsExplicit;
    private boolean mVisibilityIsExplicit;
    private android.media.SubtitleController.Anchor mAnchor;
    private android.media.SubtitleController.Listener mListener;
    public SubtitleController(android.content.Context p0, android.media.MediaTimeProvider p1, android.media.SubtitleController.Listener p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public android.media.SubtitleTrack[] getTracks() { return null; }
    public android.media.SubtitleTrack getSelectedTrack() { return null; }
    private android.media.SubtitleTrack.RenderingWidget getRenderingWidget() { return null; }
    public boolean selectTrack(android.media.SubtitleTrack p0) { return false; }
    private void doSelectTrack(android.media.SubtitleTrack p0) {}
    public android.media.SubtitleTrack getDefaultTrack() { return null; }
    public void selectDefaultTrack() {}
    private void doSelectDefaultTrack() {}
    public void reset() {}
    public android.media.SubtitleTrack addTrack(android.media.MediaFormat p0) { return null; }
    public void show() {}
    private void doShow() {}
    public void hide() {}
    private void doHide() {}
    public void registerRenderer(android.media.SubtitleController.Renderer p0) {}
    public boolean hasRendererFor(android.media.MediaFormat p0) { return false; }
    public void setAnchor(android.media.SubtitleController.Anchor p0) {}
    private void checkAnchorLooper() {}
    private void processOnAnchor(android.os.Message p0) {}

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

package android.media;

class WebVttRenderingWidget extends android.view.ViewGroup implements android.media.SubtitleTrack.RenderingWidget {
    private static final boolean DEBUG = false;
    private static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT_CAPTION_STYLE = null;
    private static final int DEBUG_REGION_BACKGROUND = -2147483393;
    private static final int DEBUG_CUE_BACKGROUND = -2130771968;
    private static final float LINE_HEIGHT_RATIO = 0.053300000727176666f;
    private final android.util.ArrayMap<android.media.TextTrackRegion, android.media.WebVttRenderingWidget.RegionLayout> mRegionBoxes = null;
    private final android.util.ArrayMap<android.media.TextTrackCue, android.media.WebVttRenderingWidget.CueLayout> mCueBoxes = null;
    private final android.view.accessibility.CaptioningManager mManager = null;
    private android.media.SubtitleTrack.RenderingWidget.OnChangedListener mListener;
    private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
    private float mFontSize;
    private boolean mHasChangeListener;
    private final android.view.accessibility.CaptioningManager.CaptioningChangeListener mCaptioningListener = null;
    public WebVttRenderingWidget(android.content.Context p0) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setSize(int p0, int p1) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void setOnChangedListener(android.media.SubtitleTrack.RenderingWidget.OnChangedListener p0) {}
    public void setVisible(boolean p0) {}
    private void manageChangeListener() {}
    public void setActiveCues(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
    private void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
    private void prune() {}
    private void prepForPrune() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    private void layoutRegion(int p0, int p1, android.media.WebVttRenderingWidget.RegionLayout p2) {}
    private void layoutCue(int p0, int p1, android.media.WebVttRenderingWidget.CueLayout p2) {}
    private int calculateLinePosition(android.media.WebVttRenderingWidget.CueLayout p0) { return 0; }
    private static int resolveCueAlignment(int p0, int p1) { return 0; }

    private static class CueLayout extends android.widget.LinearLayout {
        public final android.media.TextTrackCue mCue = null;
        private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
        private float mFontSize;
        private boolean mActive;
        private int mOrder;
        public CueLayout(android.content.Context p0, android.media.TextTrackCue p1, android.view.accessibility.CaptioningManager.CaptionStyle p2, float p3) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
        public void prepForPrune() {}
        public void update() {}
        protected void onMeasure(int p0, int p1) {}
        public void measureForParent(int p0, int p1) {}
        public void setOrder(int p0) {}
        public boolean isActive() { return false; }
        public android.media.TextTrackCue getCue() { return null; }
    }

    private static class RegionLayout extends android.widget.LinearLayout {
        private final java.util.ArrayList<android.media.WebVttRenderingWidget.CueLayout> mRegionCueBoxes = null;
        private final android.media.TextTrackRegion mRegion = null;
        private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
        private float mFontSize;
        public RegionLayout(android.content.Context p0, android.media.TextTrackRegion p1, android.view.accessibility.CaptioningManager.CaptionStyle p2, float p3) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
        public void measureForParent(int p0, int p1) {}
        public void prepForPrune() {}
        public void put(android.media.TextTrackCue p0) {}
        public boolean prune() { return false; }
        public android.media.TextTrackRegion getRegion() { return null; }
    }

    private static class SpanLayout extends com.android.internal.widget.SubtitleView {
        private final android.text.SpannableStringBuilder mBuilder = null;
        private final android.media.TextTrackCueSpan[] mSpans = null;
        public SpanLayout(android.content.Context p0, android.media.TextTrackCueSpan[] p1) { super((android.content.Context)null); }
        public void update() {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
    }
}

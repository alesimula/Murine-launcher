package android.media;

class WebVttRenderingWidget extends android.view.ViewGroup implements android.media.SubtitleTrack.RenderingWidget {
    public WebVttRenderingWidget(android.content.Context p0) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setSize(int p0, int p1) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void setOnChangedListener(android.media.SubtitleTrack.RenderingWidget.OnChangedListener p0) {}
    public void setVisible(boolean p0) {}
    public void setActiveCues(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}

    private static class CueLayout extends android.widget.LinearLayout {
        public final android.media.TextTrackCue mCue = null;
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
        public RegionLayout(android.content.Context p0, android.media.TextTrackRegion p1, android.view.accessibility.CaptioningManager.CaptionStyle p2, float p3) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
        public void measureForParent(int p0, int p1) {}
        public void prepForPrune() {}
        public void put(android.media.TextTrackCue p0) {}
        public boolean prune() { return false; }
        public android.media.TextTrackRegion getRegion() { return null; }
    }

    private static class SpanLayout extends com.android.internal.widget.SubtitleView {
        public SpanLayout(android.content.Context p0, android.media.TextTrackCueSpan[] p1) { super((android.content.Context)null); }
        public void update() {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
    }
}

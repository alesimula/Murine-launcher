package android.media;

class Cea608CCWidget extends android.media.ClosedCaptionWidget implements android.media.Cea608CCParser.DisplayListener {
    public Cea608CCWidget(android.content.Context p0) { super((android.content.Context)null); }
    public Cea608CCWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Cea608CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Cea608CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.media.ClosedCaptionWidget.ClosedCaptionLayout createCaptionLayout(android.content.Context p0) { return null; }
    public void onDisplayChanged(android.text.SpannableStringBuilder[] p0) {}
    public android.view.accessibility.CaptioningManager.CaptionStyle getCaptionStyle() { return null; }

    private static class CCLayout extends android.widget.LinearLayout implements android.media.ClosedCaptionWidget.ClosedCaptionLayout {
        CCLayout(android.content.Context p0) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void setFontScale(float p0) {}
        void update(android.text.SpannableStringBuilder[] p0) {}
        protected void onMeasure(int p0, int p1) {}
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    }

    private static class CCLineBox extends android.widget.TextView {
        CCLineBox(android.content.Context p0) { super((android.content.Context)null); }
        void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        protected void onMeasure(int p0, int p1) {}
        protected void onDraw(android.graphics.Canvas p0) {}
    }
}

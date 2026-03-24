package android.media;

class Cea708CCWidget extends android.media.ClosedCaptionWidget implements android.media.Cea708CCParser.DisplayListener {
    public Cea708CCWidget(android.content.Context p0) { super((android.content.Context)null); }
    public Cea708CCWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Cea708CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Cea708CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.media.ClosedCaptionWidget.ClosedCaptionLayout createCaptionLayout(android.content.Context p0) { return null; }
    public void emitEvent(android.media.Cea708CCParser.CaptionEvent p0) {}
    public void onDraw(android.graphics.Canvas p0) {}

    static class CCHandler implements android.os.Handler.Callback {
        public CCHandler(android.media.Cea708CCWidget.CCLayout p0) {}
        public boolean handleMessage(android.os.Message p0) { return false; }
        public void processCaptionEvent(android.media.Cea708CCParser.CaptionEvent p0) {}
        public void reset() {}
    }

    static class CCLayout extends android.media.Cea708CCWidget.ScaledLayout implements android.media.ClosedCaptionWidget.ClosedCaptionLayout {
        public CCLayout(android.content.Context p0) { super(null); }
        public void addOrUpdateViewToSafeTitleArea(android.media.Cea708CCWidget.CCWindowLayout p0, android.media.Cea708CCWidget.ScaledLayout.ScaledLayoutParams p1) {}
        public void removeViewFromSafeTitleArea(android.media.Cea708CCWidget.CCWindowLayout p0) {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void setFontScale(float p0) {}
    }

    static class CCView extends com.android.internal.widget.SubtitleView {
        public CCView(android.content.Context p0) { super((android.content.Context)null); }
        public CCView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public CCView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public CCView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
    }

    static class CCWindowLayout extends android.widget.RelativeLayout implements android.view.View.OnLayoutChangeListener {
        public CCWindowLayout(android.content.Context p0) { super((android.content.Context)null); }
        public CCWindowLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public CCWindowLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public CCWindowLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void setFontScale(float p0) {}
        public int getCaptionWindowId() { return 0; }
        public void setCaptionWindowId(int p0) {}
        public void clear() {}
        public void show() {}
        public void hide() {}
        public void setPenAttr(android.media.Cea708CCParser.CaptionPenAttr p0) {}
        public void setPenColor(android.media.Cea708CCParser.CaptionPenColor p0) {}
        public void setPenLocation(int p0, int p1) {}
        public void setWindowAttr(android.media.Cea708CCParser.CaptionWindowAttr p0) {}
        public void sendBuffer(java.lang.String p0) {}
        public void sendControl(char p0) {}
        public void initWindow(android.media.Cea708CCWidget.CCLayout p0, android.media.Cea708CCParser.CaptionWindow p1) {}
        public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
        public void removeFromCaptionView() {}
        public void setText(java.lang.String p0) {}
        public void appendText(java.lang.String p0) {}
        public void clearText() {}
        public void setRowLimit(int p0) {}
    }

    static class ScaledLayout extends android.view.ViewGroup {
        public ScaledLayout(android.content.Context p0) { super((android.content.Context)null); }
        public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
        protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
        protected void onMeasure(int p0, int p1) {}
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
        public void dispatchDraw(android.graphics.Canvas p0) {}

        static class ScaledLayoutParams extends android.view.ViewGroup.LayoutParams {
            public static final float SCALE_UNSPECIFIED = -1.0f;
            public float scaleStartRow;
            public float scaleEndRow;
            public float scaleStartCol;
            public float scaleEndCol;
            public ScaledLayoutParams(float p0, float p1, float p2, float p3) { super((android.view.ViewGroup.LayoutParams)null); }
            public ScaledLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        }
    }
}

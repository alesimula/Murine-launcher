package android.media;

class Cea608CCWidget extends android.media.ClosedCaptionWidget implements android.media.Cea608CCParser.DisplayListener {
    private static final android.graphics.Rect mTextBounds = null;
    private static final java.lang.String mDummyText = "1234567890123456789012345678901234";
    public Cea608CCWidget(android.content.Context p0) { super((android.content.Context)null); }
    public Cea608CCWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Cea608CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Cea608CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.media.ClosedCaptionWidget.ClosedCaptionLayout createCaptionLayout(android.content.Context p0) { return null; }
    public void onDisplayChanged(android.text.SpannableStringBuilder[] p0) {}
    public android.view.accessibility.CaptioningManager.CaptionStyle getCaptionStyle() { return null; }

    private static class CCLineBox extends android.widget.TextView {
        private static final float FONT_PADDING_RATIO = 0.75f;
        private static final float EDGE_OUTLINE_RATIO = 0.10000000149011612f;
        private static final float EDGE_SHADOW_RATIO = 0.05000000074505806f;
        private float mOutlineWidth;
        private float mShadowRadius;
        private float mShadowOffset;
        private int mTextColor;
        private int mBgColor;
        private int mEdgeType;
        private int mEdgeColor;
        CCLineBox(android.content.Context p0) { super((android.content.Context)null); }
        void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        protected void onMeasure(int p0, int p1) {}
        protected void onDraw(android.graphics.Canvas p0) {}
        private void drawEdgeOutline(android.graphics.Canvas p0) {}
        private void drawEdgeRaisedOrDepressed(android.graphics.Canvas p0) {}
        private void setBackgroundSpans(int p0) {}
    }

    private static class CCLayout extends android.widget.LinearLayout implements android.media.ClosedCaptionWidget.ClosedCaptionLayout {
        private static final int MAX_ROWS = 15;
        private static final float SAFE_AREA_RATIO = 0.8999999761581421f;
        private final android.media.Cea608CCWidget.CCLineBox[] mLineBoxes = null;
        CCLayout(android.content.Context p0) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void setFontScale(float p0) {}
        void update(android.text.SpannableStringBuilder[] p0) {}
        protected void onMeasure(int p0, int p1) {}
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    }
}

package android.text.style;

public class DrawableMarginSpan implements android.text.style.LeadingMarginSpan, android.text.style.LineHeightSpan {
    private static final int STANDARD_PAD_WIDTH = 0;
    private final android.graphics.drawable.Drawable mDrawable = null;
    private final int mPad = 0;
    public DrawableMarginSpan(android.graphics.drawable.Drawable p0) {}
    public DrawableMarginSpan(android.graphics.drawable.Drawable p0, int p1) {}
    public int getLeadingMargin(boolean p0) { return 0; }
    public void drawLeadingMargin(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6, java.lang.CharSequence p7, int p8, int p9, boolean p10, android.text.Layout p11) {}
    public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5) {}
}

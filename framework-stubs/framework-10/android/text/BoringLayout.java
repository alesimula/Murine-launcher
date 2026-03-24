package android.text;

public class BoringLayout extends android.text.Layout implements android.text.TextUtils.EllipsizeCallback {
    private java.lang.String mDirect;
    private android.graphics.Paint mPaint;
    int mBottom;
    int mDesc;
    private int mTopPadding;
    private int mBottomPadding;
    private float mMax;
    private int mEllipsizedWidth;
    private int mEllipsizedStart;
    private int mEllipsizedCount;
    public static android.text.BoringLayout make(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7) { return null; }
    public static android.text.BoringLayout make(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { return null; }
    public android.text.BoringLayout replaceOrMake(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7) { return null; }
    public android.text.BoringLayout replaceOrMake(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { return null; }
    public BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    public BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    void init(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.Layout.Alignment p2, android.text.BoringLayout.Metrics p3, boolean p4, boolean p5) {}
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1) { return null; }
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.BoringLayout.Metrics p2) { return null; }
    private static boolean hasAnyInterestingChars(java.lang.CharSequence p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.TextDirectionHeuristic p2, android.text.BoringLayout.Metrics p3) { return null; }
    public int getHeight() { return 0; }
    public int getLineCount() { return 0; }
    public int getLineTop(int p0) { return 0; }
    public int getLineDescent(int p0) { return 0; }
    public int getLineStart(int p0) { return 0; }
    public int getParagraphDirection(int p0) { return 0; }
    public boolean getLineContainsTab(int p0) { return false; }
    public float getLineMax(int p0) { return 0.0f; }
    public float getLineWidth(int p0) { return 0.0f; }
    public final android.text.Layout.Directions getLineDirections(int p0) { return null; }
    public int getTopPadding() { return 0; }
    public int getBottomPadding() { return 0; }
    public int getEllipsisCount(int p0) { return 0; }
    public int getEllipsisStart(int p0) { return 0; }
    public int getEllipsizedWidth() { return 0; }
    public void draw(android.graphics.Canvas p0, android.graphics.Path p1, android.graphics.Paint p2, int p3) {}
    public void ellipsized(int p0, int p1) {}

    public static class Metrics extends android.graphics.Paint.FontMetricsInt {
        public int width;
        public Metrics() { super(); }
        public java.lang.String toString() { return null; }
        private void reset() {}
    }
}

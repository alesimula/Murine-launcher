package android.text.style;

public abstract class ReplacementSpan extends android.text.style.MetricAffectingSpan {
    public ReplacementSpan() { super(); }
    public abstract int getSize(android.graphics.Paint p0, java.lang.CharSequence p1, int p2, int p3, android.graphics.Paint.FontMetricsInt p4);
    public abstract void draw(android.graphics.Canvas p0, java.lang.CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, android.graphics.Paint p8);
    @android.annotation.Nullable
    public java.lang.CharSequence getContentDescription() { return null; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    public void updateDrawState(android.text.TextPaint p0) {}
}

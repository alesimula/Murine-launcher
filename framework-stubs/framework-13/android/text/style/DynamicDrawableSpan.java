package android.text.style;

public abstract class DynamicDrawableSpan extends android.text.style.ReplacementSpan {
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_CENTER = 2;
    protected final int mVerticalAlignment = 0;
    public DynamicDrawableSpan() { super(); }
    protected DynamicDrawableSpan(int p0) { super(); }
    public int getVerticalAlignment() { return 0; }
    public abstract android.graphics.drawable.Drawable getDrawable();
    public int getSize(android.graphics.Paint p0, java.lang.CharSequence p1, int p2, int p3, android.graphics.Paint.FontMetricsInt p4) { return 0; }
    public void draw(android.graphics.Canvas p0, java.lang.CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, android.graphics.Paint p8) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlignmentType {
    }
}

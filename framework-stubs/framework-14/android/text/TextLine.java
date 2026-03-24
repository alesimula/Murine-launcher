package android.text;

public class TextLine {
    public TextLine() {}
    public static android.text.TextLine obtain() { return null; }
    public static android.text.TextLine recycle(android.text.TextLine p0) { return null; }
    public void set(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, int p4, android.text.Layout.Directions p5, boolean p6, android.text.Layout.TabStops p7, int p8, int p9, boolean p10) {}
    public void justify(float p0) {}
    void draw(android.graphics.Canvas p0, float p1, int p2, int p3, int p4) {}
    public float metrics(android.graphics.Paint.FontMetricsInt p0) { return 0.0f; }
    void shape(android.text.TextShaper.GlyphsConsumer p0) {}
    public float measure(int p0, boolean p1, android.graphics.Paint.FontMetricsInt p2) { return 0.0f; }
    public void measureAllBounds(float[] p0, float[] p1) {}
    public float[] measureAllOffsets(boolean[] p0, android.graphics.Paint.FontMetricsInt p1) { return null; }
    int getOffsetToLeftRightOf(int p0, boolean p1) { return 0; }
    static void updateMetrics(android.graphics.Paint.FontMetricsInt p0, int p1, int p2, int p3, int p4, int p5) {}
    float nextTab(float p0) { return 0.0f; }
    public static boolean isLineEndSpace(char p0) { return false; }

    private static final class DecorationInfo {
        public boolean isStrikeThruText;
        public boolean isUnderlineText;
        public int underlineColor;
        public float underlineThickness;
        public int start;
        public int end;
        public boolean hasDecoration() { return false; }
        public android.text.TextLine.DecorationInfo copyInfo() { return null; }
    }
}

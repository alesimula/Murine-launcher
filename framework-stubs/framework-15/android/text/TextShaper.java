package android.text;

public class TextShaper {
    public static void shapeText(java.lang.CharSequence p0, int p1, int p2, android.text.TextDirectionHeuristic p3, android.text.TextPaint p4, android.text.TextShaper.GlyphsConsumer p5) {}

    public static interface GlyphsConsumer {
        public void accept(int p0, int p1, android.graphics.text.PositionedGlyphs p2, android.text.TextPaint p3);
    }
}

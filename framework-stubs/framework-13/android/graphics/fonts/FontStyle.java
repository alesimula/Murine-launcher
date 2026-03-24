package android.graphics.fonts;

public final class FontStyle {
    public static final int FONT_WEIGHT_MIN = 1;
    public static final int FONT_WEIGHT_THIN = 100;
    public static final int FONT_WEIGHT_EXTRA_LIGHT = 200;
    public static final int FONT_WEIGHT_LIGHT = 300;
    public static final int FONT_WEIGHT_NORMAL = 400;
    public static final int FONT_WEIGHT_MEDIUM = 500;
    public static final int FONT_WEIGHT_SEMI_BOLD = 600;
    public static final int FONT_WEIGHT_BOLD = 700;
    public static final int FONT_WEIGHT_EXTRA_BOLD = 800;
    public static final int FONT_WEIGHT_BLACK = 900;
    public static final int FONT_WEIGHT_MAX = 1000;
    public static final int FONT_SLANT_UPRIGHT = 0;
    public static final int FONT_SLANT_ITALIC = 1;
    public FontStyle() {}
    public FontStyle(int p0, int p1) {}
    public int getWeight() { return 0; }
    public int getSlant() { return 0; }
    public int getMatchScore(android.graphics.fonts.FontStyle p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FontSlant {
    }
}

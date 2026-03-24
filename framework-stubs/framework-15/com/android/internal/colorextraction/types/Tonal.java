package com.android.internal.colorextraction.types;

public class Tonal implements com.android.internal.colorextraction.types.ExtractionType {
    public static final int MAIN_COLOR_LIGHT = -2433824;
    public static final int MAIN_COLOR_DARK = -14671580;
    public static final int MAIN_COLOR_REGULAR = -16777216;
    public Tonal(android.content.Context p0) {}
    public void extractInto(android.app.WallpaperColors p0, com.android.internal.colorextraction.ColorExtractor.GradientColors p1, com.android.internal.colorextraction.ColorExtractor.GradientColors p2, com.android.internal.colorextraction.ColorExtractor.GradientColors p3) {}
    public void applyFallback(android.app.WallpaperColors p0, com.android.internal.colorextraction.ColorExtractor.GradientColors p1) {}

    public static class ColorRange {
        public ColorRange(android.util.Range<java.lang.Float> p0, android.util.Range<java.lang.Float> p1, android.util.Range<java.lang.Float> p2) {}
        public boolean containsColor(float p0, float p1, float p2) { return false; }
        public float[] getCenter() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class ConfigParser {
        public ConfigParser(android.content.Context p0) {}
        public java.util.ArrayList<com.android.internal.colorextraction.types.Tonal.TonalPalette> getTonalPalettes() { return null; }
    }

    public static class TonalPalette {
        public final float[] h = null;
        public final float[] s = null;
        public final float[] l = null;
        public final float minHue = 0.0f;
        public final float maxHue = 0.0f;
        TonalPalette(float[] p0, float[] p1, float[] p2) {}
    }
}

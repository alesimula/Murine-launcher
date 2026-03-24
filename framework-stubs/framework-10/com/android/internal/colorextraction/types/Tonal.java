package com.android.internal.colorextraction.types;

public class Tonal implements com.android.internal.colorextraction.types.ExtractionType {
    private static final java.lang.String TAG = "Tonal";
    private static final float FIT_WEIGHT_H = 1.0f;
    private static final float FIT_WEIGHT_S = 1.0f;
    private static final float FIT_WEIGHT_L = 10.0f;
    private static final boolean DEBUG = true;
    public static final int MAIN_COLOR_LIGHT = -2433824;
    public static final int MAIN_COLOR_DARK = -14671580;
    public static final int MAIN_COLOR_REGULAR = -16777216;
    private final com.android.internal.colorextraction.types.Tonal.TonalPalette mGreyPalette = null;
    private final java.util.ArrayList<com.android.internal.colorextraction.types.Tonal.TonalPalette> mTonalPalettes = null;
    private final android.content.Context mContext = null;
    private float[] mTmpHSL;
    public Tonal(android.content.Context p0) {}
    public void extractInto(android.app.WallpaperColors p0, com.android.internal.colorextraction.ColorExtractor.GradientColors p1, com.android.internal.colorextraction.ColorExtractor.GradientColors p2, com.android.internal.colorextraction.ColorExtractor.GradientColors p3) {}
    private boolean runTonalExtraction(android.app.WallpaperColors p0, com.android.internal.colorextraction.ColorExtractor.GradientColors p1, com.android.internal.colorextraction.ColorExtractor.GradientColors p2, com.android.internal.colorextraction.ColorExtractor.GradientColors p3) { return false; }
    private void applyFallback(android.app.WallpaperColors p0, com.android.internal.colorextraction.ColorExtractor.GradientColors p1, com.android.internal.colorextraction.ColorExtractor.GradientColors p2, com.android.internal.colorextraction.ColorExtractor.GradientColors p3) {}
    public void applyFallback(android.app.WallpaperColors p0, com.android.internal.colorextraction.ColorExtractor.GradientColors p1) {}
    private int getColorInt(int p0, float[] p1, float[] p2, float[] p3) { return 0; }
    private int[] getColorPalette(float[] p0, float[] p1, float[] p2) { return null; }
    private int[] getColorPalette(com.android.internal.colorextraction.types.Tonal.TonalPalette p0) { return null; }
    private static float[] fit(float[] p0, float p1, int p2, float p3, float p4) { return null; }
    private static int bestFit(com.android.internal.colorextraction.types.Tonal.TonalPalette p0, float p1, float p2, float p3) { return 0; }
    private com.android.internal.colorextraction.types.Tonal.TonalPalette findTonalPalette(float p0, float p1) { return null; }
    private static float fract(float p0) { return 0.0f; }

    public static class TonalPalette {
        public final float[] h = null;
        public final float[] s = null;
        public final float[] l = null;
        public final float minHue = 0.0f;
        public final float maxHue = 0.0f;
        TonalPalette(float[] p0, float[] p1, float[] p2) {}
    }

    public static class ConfigParser {
        private final java.util.ArrayList<com.android.internal.colorextraction.types.Tonal.TonalPalette> mTonalPalettes = null;
        public ConfigParser(android.content.Context p0) {}
        public java.util.ArrayList<com.android.internal.colorextraction.types.Tonal.TonalPalette> getTonalPalettes() { return null; }
        private com.android.internal.colorextraction.types.Tonal.ColorRange readRange(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        private void parsePalettes(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
        private com.android.internal.colorextraction.types.Tonal.TonalPalette readPalette(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        private float[] readFloatArray(java.lang.String p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    }

    public static class ColorRange {
        private android.util.Range<java.lang.Float> mHue;
        private android.util.Range<java.lang.Float> mSaturation;
        private android.util.Range<java.lang.Float> mLightness;
        public ColorRange(android.util.Range<java.lang.Float> p0, android.util.Range<java.lang.Float> p1, android.util.Range<java.lang.Float> p2) {}
        public boolean containsColor(float p0, float p1, float p2) { return false; }
        public float[] getCenter() { return null; }
        public java.lang.String toString() { return null; }
    }
}

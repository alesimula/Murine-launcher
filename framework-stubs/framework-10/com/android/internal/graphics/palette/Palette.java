package com.android.internal.graphics.palette;

public final class Palette {
    static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
    static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    static final float MIN_CONTRAST_TITLE_TEXT = 3.0f;
    static final float MIN_CONTRAST_BODY_TEXT = 4.5f;
    static final java.lang.String LOG_TAG = "Palette";
    static final boolean LOG_TIMINGS = false;
    private final java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mSwatches = null;
    private final java.util.List<com.android.internal.graphics.palette.Target> mTargets = null;
    private final java.util.Map<com.android.internal.graphics.palette.Target, com.android.internal.graphics.palette.Palette.Swatch> mSelectedSwatches = null;
    private final android.util.SparseBooleanArray mUsedColors = null;
    private final com.android.internal.graphics.palette.Palette.Swatch mDominantSwatch = null;
    static final com.android.internal.graphics.palette.Palette.Filter DEFAULT_FILTER = null;
    public static com.android.internal.graphics.palette.Palette.Builder from(android.graphics.Bitmap p0) { return null; }
    public static com.android.internal.graphics.palette.Palette from(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) { return null; }
    @java.lang.Deprecated
    public static com.android.internal.graphics.palette.Palette generate(android.graphics.Bitmap p0) { return null; }
    @java.lang.Deprecated
    public static com.android.internal.graphics.palette.Palette generate(android.graphics.Bitmap p0, int p1) { return null; }
    @java.lang.Deprecated
    public static android.os.AsyncTask<android.graphics.Bitmap, java.lang.Void, com.android.internal.graphics.palette.Palette> generateAsync(android.graphics.Bitmap p0, com.android.internal.graphics.palette.Palette.PaletteAsyncListener p1) { return null; }
    @java.lang.Deprecated
    public static android.os.AsyncTask<android.graphics.Bitmap, java.lang.Void, com.android.internal.graphics.palette.Palette> generateAsync(android.graphics.Bitmap p0, int p1, com.android.internal.graphics.palette.Palette.PaletteAsyncListener p2) { return null; }
    Palette(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0, java.util.List<com.android.internal.graphics.palette.Target> p1) {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getSwatches() { return null; }
    public java.util.List<com.android.internal.graphics.palette.Target> getTargets() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getVibrantSwatch() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getLightVibrantSwatch() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getDarkVibrantSwatch() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getMutedSwatch() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getLightMutedSwatch() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getDarkMutedSwatch() { return null; }
    public int getVibrantColor(int p0) { return 0; }
    public int getLightVibrantColor(int p0) { return 0; }
    public int getDarkVibrantColor(int p0) { return 0; }
    public int getMutedColor(int p0) { return 0; }
    public int getLightMutedColor(int p0) { return 0; }
    public int getDarkMutedColor(int p0) { return 0; }
    public com.android.internal.graphics.palette.Palette.Swatch getSwatchForTarget(com.android.internal.graphics.palette.Target p0) { return null; }
    public int getColorForTarget(com.android.internal.graphics.palette.Target p0, int p1) { return 0; }
    public com.android.internal.graphics.palette.Palette.Swatch getDominantSwatch() { return null; }
    public int getDominantColor(int p0) { return 0; }
    void generate() {}
    private com.android.internal.graphics.palette.Palette.Swatch generateScoredTarget(com.android.internal.graphics.palette.Target p0) { return null; }
    private com.android.internal.graphics.palette.Palette.Swatch getMaxScoredSwatchForTarget(com.android.internal.graphics.palette.Target p0) { return null; }
    private boolean shouldBeScoredForTarget(com.android.internal.graphics.palette.Palette.Swatch p0, com.android.internal.graphics.palette.Target p1) { return false; }
    private float generateScore(com.android.internal.graphics.palette.Palette.Swatch p0, com.android.internal.graphics.palette.Target p1) { return 0.0f; }
    private com.android.internal.graphics.palette.Palette.Swatch findDominantSwatch() { return null; }
    private static float[] copyHslValues(com.android.internal.graphics.palette.Palette.Swatch p0) { return null; }

    public static final class Swatch {
        private final int mRed = 0;
        private final int mGreen = 0;
        private final int mBlue = 0;
        private final int mRgb = 0;
        private final int mPopulation = 0;
        private boolean mGeneratedTextColors;
        private int mTitleTextColor;
        private int mBodyTextColor;
        private float[] mHsl;
        public Swatch(int p0, int p1) {}
        Swatch(int p0, int p1, int p2, int p3) {}
        Swatch(float[] p0, int p1) {}
        public int getRgb() { return 0; }
        public float[] getHsl() { return null; }
        public int getPopulation() { return 0; }
        public int getTitleTextColor() { return 0; }
        public int getBodyTextColor() { return 0; }
        private void ensureTextColorsGenerated() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static interface PaletteAsyncListener {
        public void onGenerated(com.android.internal.graphics.palette.Palette p0);
    }

    public static interface Filter {
        public boolean isAllowed(int p0, float[] p1);
    }

    public static final class Builder {
        private final java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mSwatches = null;
        private final android.graphics.Bitmap mBitmap = null;
        private final java.util.List<com.android.internal.graphics.palette.Target> mTargets = null;
        private int mMaxColors;
        private int mResizeArea;
        private int mResizeMaxDimension;
        private final java.util.List<com.android.internal.graphics.palette.Palette.Filter> mFilters = null;
        private android.graphics.Rect mRegion;
        private com.android.internal.graphics.palette.Quantizer mQuantizer;
        public Builder(android.graphics.Bitmap p0) {}
        public Builder(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) {}
        public com.android.internal.graphics.palette.Palette.Builder maximumColorCount(int p0) { return null; }
        @java.lang.Deprecated
        public com.android.internal.graphics.palette.Palette.Builder resizeBitmapSize(int p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder resizeBitmapArea(int p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder clearFilters() { return null; }
        public com.android.internal.graphics.palette.Palette.Builder addFilter(com.android.internal.graphics.palette.Palette.Filter p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder setQuantizer(com.android.internal.graphics.palette.Quantizer p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder setRegion(int p0, int p1, int p2, int p3) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder clearRegion() { return null; }
        public com.android.internal.graphics.palette.Palette.Builder addTarget(com.android.internal.graphics.palette.Target p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder clearTargets() { return null; }
        public com.android.internal.graphics.palette.Palette generate() { return null; }
        public android.os.AsyncTask<android.graphics.Bitmap, java.lang.Void, com.android.internal.graphics.palette.Palette> generate(com.android.internal.graphics.palette.Palette.PaletteAsyncListener p0) { return null; }
        private int[] getPixelsFromBitmap(android.graphics.Bitmap p0) { return null; }
        private android.graphics.Bitmap scaleBitmapDown(android.graphics.Bitmap p0) { return null; }
    }
}

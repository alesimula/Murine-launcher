package com.android.internal.graphics.palette;

public final class Palette {
    static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
    static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    static final java.lang.String LOG_TAG = "Palette";
    static final com.android.internal.graphics.palette.Palette.Filter DEFAULT_FILTER = null;
    public static com.android.internal.graphics.palette.Palette.Builder from(android.graphics.Bitmap p0, com.android.internal.graphics.palette.Quantizer p1) { return null; }
    public static com.android.internal.graphics.palette.Palette from(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) { return null; }
    Palette(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getSwatches() { return null; }
    public com.android.internal.graphics.palette.Palette.Swatch getDominantSwatch() { return null; }

    public static class Builder {
        public Builder(android.graphics.Bitmap p0, com.android.internal.graphics.palette.Quantizer p1) {}
        public Builder(java.util.List<com.android.internal.graphics.palette.Palette.Swatch> p0) {}
        public com.android.internal.graphics.palette.Palette.Builder maximumColorCount(int p0) { return null; }
        @java.lang.Deprecated
        public com.android.internal.graphics.palette.Palette.Builder resizeBitmapSize(int p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder resizeBitmapArea(int p0) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder setRegion(int p0, int p1, int p2, int p3) { return null; }
        public com.android.internal.graphics.palette.Palette.Builder clearRegion() { return null; }
        public com.android.internal.graphics.palette.Palette generate() { return null; }
        @java.lang.Deprecated
        public android.os.AsyncTask<android.graphics.Bitmap, java.lang.Void, com.android.internal.graphics.palette.Palette> generate(com.android.internal.graphics.palette.Palette.PaletteAsyncListener p0) { return null; }
    }

    public static interface Filter {
        public boolean isAllowed(int p0, float[] p1);
    }

    public static interface PaletteAsyncListener {
        public void onGenerated(com.android.internal.graphics.palette.Palette p0);
    }

    public static class Swatch {
        public Swatch(int p0, int p1) {}
        public int getInt() { return 0; }
        public int getPopulation() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}

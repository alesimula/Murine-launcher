package com.android.internal.colorextraction;

public class ColorExtractor implements android.app.WallpaperManager.OnColorsChangedListener {
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_DARK = 1;
    public static final int TYPE_EXTRA_DARK = 2;
    protected final android.util.SparseArray<com.android.internal.colorextraction.ColorExtractor.GradientColors[]> mGradientColors = null;
    protected android.app.WallpaperColors mSystemColors;
    protected android.app.WallpaperColors mLockColors;
    public ColorExtractor(android.content.Context p0) {}
    public ColorExtractor(android.content.Context p0, com.android.internal.colorextraction.types.ExtractionType p1, boolean p2, android.app.WallpaperManager p3) {}
    protected void extractWallpaperColors() {}
    @android.annotation.NonNull
    public com.android.internal.colorextraction.ColorExtractor.GradientColors getColors(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.colorextraction.ColorExtractor.GradientColors getColors(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.app.WallpaperColors getWallpaperColors(int p0) { return null; }
    public void onColorsChanged(android.app.WallpaperColors p0, int p1) {}
    protected void triggerColorsChanged(int p0) {}
    public void destroy() {}
    public void addOnColorsChangedListener(com.android.internal.colorextraction.ColorExtractor.OnColorsChangedListener p0) {}
    public void removeOnColorsChangedListener(com.android.internal.colorextraction.ColorExtractor.OnColorsChangedListener p0) {}

    public static class GradientColors {
        public GradientColors() {}
        public void setMainColor(int p0) {}
        public void setSecondaryColor(int p0) {}
        public void setColorPalette(int[] p0) {}
        public void setSupportsDarkText(boolean p0) {}
        public void set(com.android.internal.colorextraction.ColorExtractor.GradientColors p0) {}
        public int getMainColor() { return 0; }
        public int getSecondaryColor() { return 0; }
        public int[] getColorPalette() { return null; }
        public boolean supportsDarkText() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private class LoadWallpaperColors extends android.os.AsyncTask<android.app.WallpaperManager, java.lang.Void, java.lang.Void> {
        protected java.lang.Void doInBackground(android.app.WallpaperManager... p0) { return null; }
        protected void onPostExecute(java.lang.Void p0) {}
    }

    public static interface OnColorsChangedListener {
        public void onColorsChanged(com.android.internal.colorextraction.ColorExtractor p0, int p1);
    }
}

package android.graphics.fonts;

public final class Font {
    public Font(long p0) {}
    public java.nio.ByteBuffer getBuffer() { return null; }
    public java.io.File getFile() { return null; }
    public android.graphics.fonts.FontStyle getStyle() { return null; }
    public int getTtcIndex() { return 0; }
    public android.graphics.fonts.FontVariationAxis[] getAxes() { return null; }
    public android.os.LocaleList getLocaleList() { return null; }
    public float getGlyphBounds(int p0, android.graphics.Paint p1, android.graphics.RectF p2) { return 0.0f; }
    public void getMetrics(android.graphics.Paint p0, android.graphics.Paint.FontMetrics p1) {}
    public long getNativePtr() { return 0L; }
    public int getSourceIdentifier() { return 0; }
    public boolean paramEquals(android.graphics.fonts.Font p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.util.Set<android.graphics.fonts.Font> getAvailableFonts() { return null; }

    public static final class Builder {
        public Builder(java.nio.ByteBuffer p0) {}
        public Builder(java.nio.ByteBuffer p0, java.io.File p1, java.lang.String p2) {}
        public Builder(java.io.File p0, java.lang.String p1) {}
        public Builder(java.io.File p0) {}
        public Builder(android.os.ParcelFileDescriptor p0) {}
        public Builder(android.os.ParcelFileDescriptor p0, long p1, long p2) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1, boolean p2, int p3) {}
        public Builder(android.content.res.Resources p0, int p1) {}
        public Builder(android.graphics.fonts.Font p0) {}
        public static java.nio.ByteBuffer createBuffer(android.content.res.AssetManager p0, java.lang.String p1, boolean p2, int p3) throws java.io.IOException { return null; }
        public android.graphics.fonts.Font.Builder setWeight(int p0) { return null; }
        public android.graphics.fonts.Font.Builder setSlant(int p0) { return null; }
        public android.graphics.fonts.Font.Builder setTtcIndex(int p0) { return null; }
        public android.graphics.fonts.Font.Builder setFontVariationSettings(java.lang.String p0) { return null; }
        public android.graphics.fonts.Font.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] p0) { return null; }
        public android.graphics.fonts.Font build() throws java.io.IOException { return null; }
    }
}

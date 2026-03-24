package android.graphics.fonts;

public final class Font {
    private static final java.lang.String TAG = "Font";
    private static final int NOT_SPECIFIED = -1;
    private static final int STYLE_ITALIC = 1;
    private static final int STYLE_NORMAL = 0;
    private final long mNativePtr = 0L;
    private final java.lang.Object mLock = null;
    private java.nio.ByteBuffer mBuffer;
    private boolean mIsFileInitialized;
    private java.io.File mFile;
    private android.graphics.fonts.FontStyle mFontStyle;
    private android.graphics.fonts.FontVariationAxis[] mAxes;
    private android.os.LocaleList mLocaleList;
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
    private boolean isSameSource(android.graphics.fonts.Font p0) { return false; }
    public boolean paramEquals(android.graphics.fonts.Font p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.util.Set<android.graphics.fonts.Font> getAvailableFonts() { return null; }
    private static native long nGetMinikinFontPtr(long p0);
    private static native long nCloneFont(long p0);
    private static native java.nio.ByteBuffer nNewByteBuffer(long p0);
    private static native long nGetBufferAddress(long p0);
    private static native int nGetSourceId(long p0);
    private static native long nGetReleaseNativeFont();
    private static native float nGetGlyphBounds(long p0, int p1, long p2, android.graphics.RectF p3);
    private static native float nGetFontMetrics(long p0, long p1, android.graphics.Paint.FontMetrics p2);
    private static native java.lang.String nGetFontPath(long p0);
    private static native java.lang.String nGetLocaleList(long p0);
    private static native int nGetPackedStyle(long p0);
    private static native int nGetIndex(long p0);
    private static native int nGetAxisCount(long p0);
    private static native long nGetAxisInfo(long p0, int p1);
    private static native long[] nGetAvailableFontSet();

    public static final class Builder {
        private java.nio.ByteBuffer mBuffer;
        private java.io.File mFile;
        private android.graphics.fonts.Font mFont;
        private java.lang.String mLocaleList;
        private int mWeight;
        private int mItalic;
        private int mTtcIndex;
        private android.graphics.fonts.FontVariationAxis[] mAxes;
        private java.io.IOException mException;
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
        private static native long nInitBuilder();
        private static native void nAddAxis(long p0, int p1, float p2);
        private static native long nBuild(long p0, java.nio.ByteBuffer p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, int p6);
        private static native long nGetReleaseNativeFont();
        private static native long nClone(long p0, long p1, int p2, boolean p3, int p4);
    }
}

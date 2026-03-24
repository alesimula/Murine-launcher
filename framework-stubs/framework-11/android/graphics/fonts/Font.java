package android.graphics.fonts;

public final class Font {
    private static final java.lang.String TAG = "Font";
    private static final int NOT_SPECIFIED = -1;
    private static final int STYLE_ITALIC = 1;
    private static final int STYLE_NORMAL = 0;
    private final long mNativePtr = 0L;
    private final java.nio.ByteBuffer mBuffer = null;
    private final java.io.File mFile = null;
    private final android.graphics.fonts.FontStyle mFontStyle = null;
    private final int mTtcIndex = 0;
    private final android.graphics.fonts.FontVariationAxis[] mAxes = null;
    private final java.lang.String mLocaleList = null;
    private Font(long p0, java.nio.ByteBuffer p1, java.io.File p2, android.graphics.fonts.FontStyle p3, int p4, android.graphics.fonts.FontVariationAxis[] p5, java.lang.String p6) {}
    public java.nio.ByteBuffer getBuffer() { return null; }
    public java.io.File getFile() { return null; }
    public android.graphics.fonts.FontStyle getStyle() { return null; }
    public int getTtcIndex() { return 0; }
    public android.graphics.fonts.FontVariationAxis[] getAxes() { return null; }
    public android.os.LocaleList getLocaleList() { return null; }
    public long getNativePtr() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private java.nio.ByteBuffer mBuffer;
        private java.io.File mFile;
        private java.lang.String mLocaleList;
        private int mWeight;
        private int mItalic;
        private int mTtcIndex;
        private android.graphics.fonts.FontVariationAxis[] mAxes;
        private java.io.IOException mException;
        public Builder(java.nio.ByteBuffer p0) {}
        public Builder(java.nio.ByteBuffer p0, java.io.File p1, java.lang.String p2) {}
        public Builder(java.io.File p0) {}
        public Builder(android.os.ParcelFileDescriptor p0) {}
        public Builder(android.os.ParcelFileDescriptor p0, long p1, long p2) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1, boolean p2, int p3) {}
        public Builder(android.content.res.Resources p0, int p1) {}
        public static java.nio.ByteBuffer createBuffer(android.content.res.AssetManager p0, java.lang.String p1, boolean p2, int p3) throws java.io.IOException { return null; }
        public android.graphics.fonts.Font.Builder setWeight(int p0) { return null; }
        public android.graphics.fonts.Font.Builder setSlant(int p0) { return null; }
        public android.graphics.fonts.Font.Builder setTtcIndex(int p0) { return null; }
        public android.graphics.fonts.Font.Builder setFontVariationSettings(java.lang.String p0) { return null; }
        public android.graphics.fonts.Font.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] p0) { return null; }
        public android.graphics.fonts.Font build() throws java.io.IOException { return null; }
        private static native long nInitBuilder();
        private static native void nAddAxis(long p0, int p1, float p2);
        private static native long nBuild(long p0, java.nio.ByteBuffer p1, java.lang.String p2, int p3, boolean p4, int p5);
        private static native long nGetReleaseNativeFont();
    }
}

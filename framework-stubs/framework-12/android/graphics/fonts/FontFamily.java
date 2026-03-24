package android.graphics.fonts;

public final class FontFamily {
    private static final java.lang.String TAG = "FontFamily";
    private final long mNativePtr = 0L;
    public FontFamily(long p0) {}
    public java.lang.String getLangTags() { return null; }
    public int getVariant() { return 0; }
    public android.graphics.fonts.Font getFont(int p0) { return null; }
    public int getSize() { return 0; }
    public long getNativePtr() { return 0L; }
    private static native int nGetFontSize(long p0);
    private static native long nGetFont(long p0, int p1);
    private static native java.lang.String nGetLangTags(long p0);
    private static native int nGetVariant(long p0);

    public static final class Builder {
        private final java.util.ArrayList<android.graphics.fonts.Font> mFonts = null;
        private final android.util.SparseIntArray mStyles = null;
        public Builder(android.graphics.fonts.Font p0) {}
        public android.graphics.fonts.FontFamily.Builder addFont(android.graphics.fonts.Font p0) { return null; }
        public android.graphics.fonts.FontFamily build() { return null; }
        public android.graphics.fonts.FontFamily build(java.lang.String p0, int p1, boolean p2) { return null; }
        private static int makeStyleIdentifier(android.graphics.fonts.Font p0) { return 0; }
        private static native long nInitBuilder();
        private static native void nAddFont(long p0, long p1);
        private static native long nBuild(long p0, java.lang.String p1, int p2, boolean p3);
        private static native long nGetReleaseNativeFamily();
    }
}

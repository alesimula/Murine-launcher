package android.text;

public final class FontConfig {
    private final android.text.FontConfig.Family[] mFamilies = null;
    private final android.text.FontConfig.Alias[] mAliases = null;
    public FontConfig(android.text.FontConfig.Family[] p0, android.text.FontConfig.Alias[] p1) {}
    @android.annotation.UnsupportedAppUsage
    public android.text.FontConfig.Family[] getFamilies() { return null; }
    public android.text.FontConfig.Alias[] getAliases() { return null; }

    public static final class Font {
        private final java.lang.String mFontName = null;
        private final int mTtcIndex = 0;
        private final android.graphics.fonts.FontVariationAxis[] mAxes = null;
        private final int mWeight = 0;
        private final boolean mIsItalic = false;
        private android.net.Uri mUri;
        private final java.lang.String mFallbackFor = null;
        public Font(java.lang.String p0, int p1, android.graphics.fonts.FontVariationAxis[] p2, int p3, boolean p4, java.lang.String p5) {}
        public java.lang.String getFontName() { return null; }
        @android.annotation.UnsupportedAppUsage
        public int getTtcIndex() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public android.graphics.fonts.FontVariationAxis[] getAxes() { return null; }
        @android.annotation.UnsupportedAppUsage
        public int getWeight() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public boolean isItalic() { return false; }
        public android.net.Uri getUri() { return null; }
        public void setUri(android.net.Uri p0) {}
        public java.lang.String getFallbackFor() { return null; }
    }

    public static final class Family {
        private final java.lang.String mName = null;
        private final android.text.FontConfig.Font[] mFonts = null;
        private final java.lang.String mLanguages = null;
        public static final int VARIANT_DEFAULT = 0;
        public static final int VARIANT_COMPACT = 1;
        public static final int VARIANT_ELEGANT = 2;
        private final int mVariant = 0;
        public Family(java.lang.String p0, android.text.FontConfig.Font[] p1, java.lang.String p2, int p3) {}
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getName() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.text.FontConfig.Font[] getFonts() { return null; }
        public java.lang.String getLanguages() { return null; }
        @android.annotation.UnsupportedAppUsage
        public int getVariant() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Variant {
        }
    }

    public static final class Alias {
        private final java.lang.String mName = null;
        private final java.lang.String mToName = null;
        private final int mWeight = 0;
        public Alias(java.lang.String p0, java.lang.String p1, int p2) {}
        public java.lang.String getName() { return null; }
        public java.lang.String getToName() { return null; }
        public int getWeight() { return 0; }
    }
}

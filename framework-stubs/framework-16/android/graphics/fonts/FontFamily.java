package android.graphics.fonts;

public final class FontFamily {
    public FontFamily(long p0) {}
    @android.annotation.Nullable
    public java.lang.String getLangTags() { return null; }
    public int getVariant() { return 0; }
    @android.annotation.NonNull
    public android.graphics.fonts.Font getFont(int p0) { return null; }
    public int getSize() { return 0; }
    public long getNativePtr() { return 0L; }

    public static final class Builder {
        public static final int VARIABLE_FONT_FAMILY_TYPE_UNKNOWN = -1;
        public static final int VARIABLE_FONT_FAMILY_TYPE_NONE = 0;
        public static final int VARIABLE_FONT_FAMILY_TYPE_SINGLE_FONT_WGHT_ONLY = 1;
        public static final int VARIABLE_FONT_FAMILY_TYPE_SINGLE_FONT_WGHT_ITAL = 2;
        public static final int VARIABLE_FONT_FAMILY_TYPE_TWO_FONTS_WGHT = 3;
        public Builder(android.graphics.fonts.Font p0) {}
        @android.annotation.NonNull
        public android.graphics.fonts.FontFamily.Builder addFont(android.graphics.fonts.Font p0) { return null; }
        @android.annotation.SuppressLint("BuilderSetStyle")
        @android.annotation.FlaggedApi("com.android.text.flags.new_fonts_fallback_xml")
        @android.annotation.Nullable
        public android.graphics.fonts.FontFamily buildVariableFamily() { return null; }
        @android.annotation.NonNull
        public android.graphics.fonts.FontFamily build() { return null; }
        @android.annotation.NonNull
        public android.graphics.fonts.FontFamily build(java.lang.String p0, int p1, boolean p2, boolean p3, int p4) { return null; }
        public static int analyzeAndResolveVariableType(java.util.ArrayList<android.graphics.fonts.Font> p0) { return 0; }

        private static class NoImagePreloadHolder {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface VariableFontFamilyType {
        }
    }
}

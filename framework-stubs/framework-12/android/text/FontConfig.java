package android.text;

@android.annotation.SystemApi
public final class FontConfig implements android.os.Parcelable {
    private final java.util.List<android.text.FontConfig.FontFamily> mFamilies = null;
    private final java.util.List<android.text.FontConfig.Alias> mAliases = null;
    private final long mLastModifiedTimeMillis = 0L;
    private final int mConfigVersion = 0;
    public static final android.os.Parcelable.Creator<android.text.FontConfig> CREATOR = null;
    public FontConfig(java.util.List<android.text.FontConfig.FontFamily> p0, java.util.List<android.text.FontConfig.Alias> p1, long p2, int p3) {}
    public java.util.List<android.text.FontConfig.FontFamily> getFontFamilies() { return null; }
    public java.util.List<android.text.FontConfig.Alias> getAliases() { return null; }
    public long getLastModifiedTimeMillis() { return 0L; }
    public int getConfigVersion() { return 0; }
    @java.lang.Deprecated
    public android.text.FontConfig.FontFamily[] getFamilies() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Alias implements android.os.Parcelable {
        private final java.lang.String mName = null;
        private final java.lang.String mOriginal = null;
        private final int mWeight = 0;
        public static final android.os.Parcelable.Creator<android.text.FontConfig.Alias> CREATOR = null;
        public Alias(java.lang.String p0, java.lang.String p1, int p2) {}
        public java.lang.String getName() { return null; }
        public java.lang.String getOriginal() { return null; }
        public int getWeight() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class Font implements android.os.Parcelable {
        private final java.io.File mFile = null;
        private final java.io.File mOriginalFile = null;
        private final java.lang.String mPostScriptName = null;
        private final android.graphics.fonts.FontStyle mStyle = null;
        private final int mIndex = 0;
        private final java.lang.String mFontVariationSettings = null;
        private final java.lang.String mFontFamilyName = null;
        public static final android.os.Parcelable.Creator<android.text.FontConfig.Font> CREATOR = null;
        public Font(java.io.File p0, java.io.File p1, java.lang.String p2, android.graphics.fonts.FontStyle p3, int p4, java.lang.String p5, java.lang.String p6) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.io.File getFile() { return null; }
        public java.io.File getOriginalFile() { return null; }
        public android.graphics.fonts.FontStyle getStyle() { return null; }
        public java.lang.String getFontVariationSettings() { return null; }
        public java.lang.String getFontFamilyName() { return null; }
        public int getTtcIndex() { return 0; }
        public java.lang.String getPostScriptName() { return null; }
        @java.lang.Deprecated
        public android.graphics.fonts.FontVariationAxis[] getAxes() { return null; }
        @java.lang.Deprecated
        public int getWeight() { return 0; }
        @java.lang.Deprecated
        public boolean isItalic() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class FontFamily implements android.os.Parcelable {
        private final java.util.List<android.text.FontConfig.Font> mFonts = null;
        private final java.lang.String mName = null;
        private final android.os.LocaleList mLocaleList = null;
        private final int mVariant = 0;
        public static final int VARIANT_DEFAULT = 0;
        public static final int VARIANT_COMPACT = 1;
        public static final int VARIANT_ELEGANT = 2;
        public static final android.os.Parcelable.Creator<android.text.FontConfig.FontFamily> CREATOR = null;
        public FontFamily(java.util.List<android.text.FontConfig.Font> p0, java.lang.String p1, android.os.LocaleList p2, int p3) {}
        public java.util.List<android.text.FontConfig.Font> getFontList() { return null; }
        public java.lang.String getName() { return null; }
        public android.os.LocaleList getLocaleList() { return null; }
        public int getVariant() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @java.lang.Deprecated
        public android.text.FontConfig.Font[] getFonts() { return null; }
        @java.lang.Deprecated
        public java.lang.String getLanguages() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Variant {
        }
    }
}

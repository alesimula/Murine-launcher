package android.text;

@android.annotation.SystemApi
public final class FontConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.text.FontConfig> CREATOR = null;
    public FontConfig(java.util.List<android.text.FontConfig.FontFamily> p0, java.util.List<android.text.FontConfig.Alias> p1, java.util.List<android.text.FontConfig.NamedFamilyList> p2, java.util.List<android.text.FontConfig.Customization.LocaleFallback> p3, long p4, int p5) {}
    public FontConfig(java.util.List<android.text.FontConfig.FontFamily> p0, java.util.List<android.text.FontConfig.Alias> p1, long p2, int p3) {}
    @android.annotation.NonNull
    public java.util.List<android.text.FontConfig.FontFamily> getFontFamilies() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.text.FontConfig.Alias> getAliases() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.text.FontConfig.NamedFamilyList> getNamedFamilyLists() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.text.FontConfig.Customization.LocaleFallback> getLocaleFallbackCustomizations() { return null; }
    public long getLastModifiedTimeMillis() { return 0L; }
    public int getConfigVersion() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.text.FontConfig.FontFamily[] getFamilies() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String resolveScript(java.util.Locale p0) { return null; }

    public static final class Alias implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.text.FontConfig.Alias> CREATOR = null;
        public Alias(java.lang.String p0, java.lang.String p1, int p2) {}
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        @android.annotation.NonNull
        public java.lang.String getOriginal() { return null; }
        public int getWeight() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class Customization {

        public static class LocaleFallback {
            public static final int OPERATION_PREPEND = 0;
            public static final int OPERATION_APPEND = 1;
            public static final int OPERATION_REPLACE = 2;
            public LocaleFallback(java.util.Locale p0, int p1, android.text.FontConfig.FontFamily p2) {}
            @android.annotation.NonNull
            public java.util.Locale getLocale() { return null; }
            public int getOperation() { return 0; }
            @android.annotation.NonNull
            public android.text.FontConfig.FontFamily getFamily() { return null; }
            @android.annotation.NonNull
            public java.lang.String getScript() { return null; }
            public java.lang.String toString() { return null; }

            @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
            public static @interface Operation {
            }
        }
    }

    public static final class Font implements android.os.Parcelable {
        public static final int VAR_TYPE_AXES_NONE = 0;
        public static final int VAR_TYPE_AXES_WGHT = 1;
        public static final int VAR_TYPE_AXES_ITAL = 2;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.text.FontConfig.Font> CREATOR = null;
        public Font(java.io.File p0, java.io.File p1, java.lang.String p2, android.graphics.fonts.FontStyle p3, int p4, java.lang.String p5, java.lang.String p6, int p7) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.io.File getFile() { return null; }
        @android.annotation.Nullable
        public java.io.File getOriginalFile() { return null; }
        @android.annotation.NonNull
        public android.graphics.fonts.FontStyle getStyle() { return null; }
        @android.annotation.NonNull
        public java.lang.String getFontVariationSettings() { return null; }
        @android.annotation.Nullable
        public java.lang.String getFontFamilyName() { return null; }
        public int getTtcIndex() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getPostScriptName() { return null; }
        public int getVarTypeAxes() { return 0; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.graphics.fonts.FontVariationAxis[] getAxes() { return null; }
        @java.lang.Deprecated
        public int getWeight() { return 0; }
        @java.lang.Deprecated
        public boolean isItalic() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface VarTypeAxes {
        }
    }

    public static final class FontFamily implements android.os.Parcelable {
        public static final int VARIANT_DEFAULT = 0;
        public static final int VARIANT_COMPACT = 1;
        public static final int VARIANT_ELEGANT = 2;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.text.FontConfig.FontFamily> CREATOR = null;
        public FontFamily(java.util.List<android.text.FontConfig.Font> p0, android.os.LocaleList p1, int p2) {}
        @android.annotation.NonNull
        public java.util.List<android.text.FontConfig.Font> getFontList() { return null; }
        @java.lang.Deprecated
        @android.annotation.Nullable
        public java.lang.String getName() { return null; }
        @android.annotation.NonNull
        public android.os.LocaleList getLocaleList() { return null; }
        public int getVariant() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @java.lang.Deprecated
        @android.annotation.Nullable
        public android.text.FontConfig.Font[] getFonts() { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.lang.String getLanguages() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Variant {
        }
    }

    public static final class NamedFamilyList implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.text.FontConfig.NamedFamilyList> CREATOR = null;
        public NamedFamilyList(java.util.List<android.text.FontConfig.FontFamily> p0, java.lang.String p1) {}
        public NamedFamilyList(android.text.FontConfig.FontFamily p0) {}
        @android.annotation.NonNull
        public java.util.List<android.text.FontConfig.FontFamily> getFamilies() { return null; }
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

package android.content.res;

public class FontResourcesParser {
    public FontResourcesParser() {}
    public static android.content.res.FontResourcesParser.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }

    public static interface FamilyResourceEntry {
    }

    public static final class FontFamilyFilesResourceEntry implements android.content.res.FontResourcesParser.FamilyResourceEntry {
        public FontFamilyFilesResourceEntry(android.content.res.FontResourcesParser.FontFileResourceEntry[] p0) {}
        public android.content.res.FontResourcesParser.FontFileResourceEntry[] getEntries() { return null; }
    }

    public static final class FontFileResourceEntry {
        public static final int RESOLVE_BY_FONT_TABLE = -1;
        public static final int UPRIGHT = 0;
        public static final int ITALIC = 1;
        public FontFileResourceEntry(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4) {}
        public java.lang.String getFileName() { return null; }
        public int getWeight() { return 0; }
        public int getItalic() { return 0; }
        public java.lang.String getVariationSettings() { return null; }
        public int getTtcIndex() { return 0; }
    }

    public static final class ProviderResourceEntry implements android.content.res.FontResourcesParser.FamilyResourceEntry {
        public ProviderResourceEntry(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.util.List<java.lang.String>> p3, java.lang.String p4) {}
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getPackage() { return null; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getSystemFontFamilyName() { return null; }
        public java.util.List<java.util.List<java.lang.String>> getCerts() { return null; }
    }
}

package android.graphics.fonts;

public class FontCustomizationParser {
    public FontCustomizationParser() {}
    public static android.graphics.fonts.FontCustomizationParser.Result parse(java.io.InputStream p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static void validate(android.graphics.fonts.FontCustomizationParser.Result p0) {}
    private static android.graphics.fonts.FontCustomizationParser.Result readFamilies(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static void readFamily(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, android.graphics.fonts.FontCustomizationParser.Result p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static class Result {
        java.util.ArrayList<android.text.FontConfig.Family> mAdditionalNamedFamilies;
        java.util.ArrayList<android.text.FontConfig.Alias> mAdditionalAliases;
        public Result() {}
    }
}

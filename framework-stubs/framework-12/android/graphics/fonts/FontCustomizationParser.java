package android.graphics.fonts;

public class FontCustomizationParser {
    public FontCustomizationParser() {}
    public static android.graphics.fonts.FontCustomizationParser.Result parse(java.io.InputStream p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static java.util.Map<java.lang.String, android.text.FontConfig.FontFamily> validateAndTransformToMap(java.util.List<android.text.FontConfig.FontFamily> p0) { return null; }
    private static android.graphics.fonts.FontCustomizationParser.Result readFamilies(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static void readFamily(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.List<android.text.FontConfig.FontFamily> p2, java.util.Map<java.lang.String, java.io.File> p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static class Result {
        private final java.util.Map<java.lang.String, android.text.FontConfig.FontFamily> mAdditionalNamedFamilies = null;
        private final java.util.List<android.text.FontConfig.Alias> mAdditionalAliases = null;
        public Result() {}
        public Result(java.util.Map<java.lang.String, android.text.FontConfig.FontFamily> p0, java.util.List<android.text.FontConfig.Alias> p1) {}
        public java.util.Map<java.lang.String, android.text.FontConfig.FontFamily> getAdditionalNamedFamilies() { return null; }
        public java.util.List<android.text.FontConfig.Alias> getAdditionalAliases() { return null; }
    }
}

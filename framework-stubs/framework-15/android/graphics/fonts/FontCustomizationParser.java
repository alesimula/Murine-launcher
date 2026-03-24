package android.graphics.fonts;

public class FontCustomizationParser {
    public FontCustomizationParser() {}
    public static android.graphics.fonts.FontCustomizationParser.Result parse(java.io.InputStream p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }

    public static class Result {
        public Result() {}
        public Result(java.util.Map<java.lang.String, android.text.FontConfig.NamedFamilyList> p0, java.util.List<android.text.FontConfig.Customization.LocaleFallback> p1, java.util.List<android.text.FontConfig.Alias> p2) {}
        public java.util.Map<java.lang.String, android.text.FontConfig.NamedFamilyList> getAdditionalNamedFamilies() { return null; }
        public java.util.List<android.text.FontConfig.Alias> getAdditionalAliases() { return null; }
        public java.util.List<android.text.FontConfig.Customization.LocaleFallback> getLocaleFamilyCustomizations() { return null; }
    }
}

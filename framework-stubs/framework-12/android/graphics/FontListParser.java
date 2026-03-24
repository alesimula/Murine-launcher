package android.graphics;

public class FontListParser {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_LANG = "lang";
    private static final java.lang.String ATTR_VARIANT = "variant";
    private static final java.lang.String TAG_FONT = "font";
    private static final java.lang.String VARIANT_COMPACT = "compact";
    private static final java.lang.String VARIANT_ELEGANT = "elegant";
    public static final java.lang.String ATTR_INDEX = "index";
    public static final java.lang.String ATTR_WEIGHT = "weight";
    public static final java.lang.String ATTR_POSTSCRIPT_NAME = "postScriptName";
    public static final java.lang.String ATTR_STYLE = "style";
    public static final java.lang.String ATTR_FALLBACK_FOR = "fallbackFor";
    public static final java.lang.String STYLE_ITALIC = "italic";
    public static final java.lang.String STYLE_NORMAL = "normal";
    public static final java.lang.String TAG_AXIS = "axis";
    public static final java.lang.String ATTR_TAG = "tag";
    public static final java.lang.String ATTR_STYLEVALUE = "stylevalue";
    private static final java.util.regex.Pattern FILENAME_WHITESPACE_PATTERN = null;
    public FontListParser() {}
    public static android.text.FontConfig parse(java.io.InputStream p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.text.FontConfig parse(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map<java.lang.String, java.io.File> p4, long p5, int p6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.text.FontConfig readFamilies(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, android.graphics.fonts.FontCustomizationParser.Result p2, java.util.Map<java.lang.String, java.io.File> p3, long p4, int p5, boolean p6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static boolean keepReading(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    public static android.text.FontConfig.FontFamily readFamily(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2, boolean p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.text.FontConfig.Font readFont(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.Map<java.lang.String, java.io.File> p2, boolean p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static java.lang.String findUpdatedFontFile(java.lang.String p0, java.util.Map<java.lang.String, java.io.File> p1) { return null; }
    private static android.graphics.fonts.FontVariationAxis readAxis(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.text.FontConfig.Alias readAlias(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static void skip(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
}

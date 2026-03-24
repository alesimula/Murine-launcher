package android.content.pm.parsing.component;

public class ComponentParseUtils {
    private static final java.lang.String TAG = "PackageParsing";
    public ComponentParseUtils() {}
    public static boolean isImplicitlyExposedIntent(android.content.pm.parsing.component.ParsedIntentInfo p0) { return false; }
    static <Component extends android.content.pm.parsing.component.ParsedComponent> android.content.pm.parsing.result.ParseResult<Component> parseAllMetaData(android.content.pm.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, java.lang.String p3, Component p4, android.content.pm.parsing.result.ParseInput p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.String> buildProcessName(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, int p3, java.lang.String[] p4, android.content.pm.parsing.result.ParseInput p5) { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.String> buildTaskAffinityName(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, android.content.pm.parsing.result.ParseInput p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.String> buildCompoundName(java.lang.String p0, java.lang.CharSequence p1, java.lang.String p2, android.content.pm.parsing.result.ParseInput p3) { return null; }
    public static int flag(int p0, int p1, android.content.res.TypedArray p2) { return 0; }
    public static int flag(int p0, int p1, boolean p2, android.content.res.TypedArray p3) { return 0; }
    public static java.lang.CharSequence getNonLocalizedLabel(android.content.pm.parsing.component.ParsedComponent p0) { return null; }
    public static int getIcon(android.content.pm.parsing.component.ParsedComponent p0) { return 0; }
    public static boolean isMatch(android.content.pm.PackageUserState p0, boolean p1, boolean p2, android.content.pm.parsing.component.ParsedMainComponent p3, int p4) { return false; }
    public static boolean isEnabled(android.content.pm.PackageUserState p0, boolean p1, android.content.pm.parsing.component.ParsedMainComponent p2, int p3) { return false; }
}

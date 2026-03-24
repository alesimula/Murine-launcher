package android.content.pm.parsing;

public class ApkLiteParseUtils {
    public static final java.lang.String APK_FILE_EXTENSION = ".apk";
    public static final int DEFAULT_MIN_SDK_VERSION = 1;
    public static final java.lang.String ANDROID_MANIFEST_FILENAME = "AndroidManifest.xml";
    public ApkLiteParseUtils() {}
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parsePackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parseMonolithicPackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parseMonolithicPackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.FileDescriptor p1, java.lang.String p2, int p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parseClusterPackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> composePackageLiteFromApks(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, android.content.pm.parsing.ApkLite p2, android.util.ArrayMap<java.lang.String, android.content.pm.parsing.ApkLite> p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> composePackageLiteFromApks(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, android.content.pm.parsing.ApkLite p2, android.util.ArrayMap<java.lang.String, android.content.pm.parsing.ApkLite> p3, boolean p4) { return null; }
    public static java.lang.String splitNameToFileName(android.content.pm.parsing.ApkLite p0) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.ApkLite> parseApkLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.ApkLite> parseApkLite(android.content.pm.parsing.result.ParseInput p0, java.io.FileDescriptor p1, java.lang.String p2, int p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.Pair<java.lang.String, java.lang.String>> parsePackageSplitNames(android.content.pm.parsing.result.ParseInput p0, android.content.res.XmlResourceParser p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>>> parseRequiredSplitTypes(android.content.pm.parsing.result.ParseInput p0, android.content.res.XmlResourceParser p1) { return null; }
    public static android.content.pm.VerifierInfo parseVerifier(android.util.AttributeSet p0) { return null; }
    public static boolean isApkFile(java.io.File p0) { return false; }
    public static boolean isApkPath(java.lang.String p0) { return false; }

    private static class SplitNameComparator implements java.util.Comparator<java.lang.String> {
        public int compare(java.lang.String p0, java.lang.String p1) { return 0; }
    }
}

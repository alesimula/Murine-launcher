package android.content.pm.dex;

public class DexMetadataHelper {
    public static final java.lang.String TAG = "DexMetadataHelper";
    public static final boolean DEBUG = Boolean.valueOf(false);
    public static boolean isDexMetadataFile(java.io.File p0) { return false; }
    public static boolean isFsVerityRequired() { return false; }
    public static long getPackageDexMetadataSize(android.content.pm.parsing.PackageLite p0) { return 0L; }
    public static java.io.File findDexMetadataForFile(java.io.File p0) { return null; }
    public static java.util.Map<java.lang.String, java.lang.String> buildPackageApkToDexMetadataMap(java.util.List<java.lang.String> p0) { return null; }
    public static java.lang.String buildDexMetadataPathForApk(java.lang.String p0) { return null; }
    public static android.content.pm.parsing.result.ParseResult validateDexMetadataFile(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, java.lang.String p2, long p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult validateDexMetadataFile(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, java.lang.String p2, long p3, boolean p4) { return null; }
    public static void validateDexPaths(java.lang.String[] p0) {}
}

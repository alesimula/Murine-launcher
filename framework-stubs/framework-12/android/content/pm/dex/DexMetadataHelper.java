package android.content.pm.dex;

public class DexMetadataHelper {
    public static final java.lang.String TAG = "DexMetadataHelper";
    public static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String PROPERTY_DM_JSON_MANIFEST_REQUIRED = "pm.dexopt.dm.require_manifest";
    private static final java.lang.String PROPERTY_DM_FSVERITY_REQUIRED = "pm.dexopt.dm.require_fsverity";
    private static final java.lang.String DEX_METADATA_FILE_EXTENSION = ".dm";
    private DexMetadataHelper() {}
    public static boolean isDexMetadataFile(java.io.File p0) { return false; }
    private static boolean isDexMetadataPath(java.lang.String p0) { return false; }
    public static boolean isFsVerityRequired() { return false; }
    public static long getPackageDexMetadataSize(android.content.pm.parsing.PackageLite p0) { return 0L; }
    public static java.io.File findDexMetadataForFile(java.io.File p0) { return null; }
    private static java.util.Map<java.lang.String, java.lang.String> getPackageDexMetadata(android.content.pm.parsing.PackageLite p0) { return null; }
    public static java.util.Map<java.lang.String, java.lang.String> buildPackageApkToDexMetadataMap(java.util.List<java.lang.String> p0) { return null; }
    public static java.lang.String buildDexMetadataPathForApk(java.lang.String p0) { return null; }
    private static java.lang.String buildDexMetadataPathForFile(java.io.File p0) { return null; }
    public static void validateDexMetadataFile(java.lang.String p0, java.lang.String p1, long p2) throws android.content.pm.PackageParser.PackageParserException {}
    public static void validateDexMetadataFile(java.lang.String p0, java.lang.String p1, long p2, boolean p3) throws android.content.pm.PackageParser.PackageParserException {}
    private static void validateDexMetadataManifest(java.lang.String p0, android.util.jar.StrictJarFile p1, java.lang.String p2, long p3, boolean p4) throws java.io.IOException, android.content.pm.PackageParser.PackageParserException {}
    public static void validateDexPaths(java.lang.String[] p0) {}
}

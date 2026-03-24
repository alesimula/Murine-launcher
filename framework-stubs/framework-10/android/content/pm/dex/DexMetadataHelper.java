package android.content.pm.dex;

public class DexMetadataHelper {
    private static final java.lang.String DEX_METADATA_FILE_EXTENSION = ".dm";
    private DexMetadataHelper() {}
    public static boolean isDexMetadataFile(java.io.File p0) { return false; }
    private static boolean isDexMetadataPath(java.lang.String p0) { return false; }
    public static long getPackageDexMetadataSize(android.content.pm.PackageParser.PackageLite p0) { return 0L; }
    public static java.io.File findDexMetadataForFile(java.io.File p0) { return null; }
    public static java.util.Map<java.lang.String, java.lang.String> getPackageDexMetadata(android.content.pm.PackageParser.Package p0) { return null; }
    private static java.util.Map<java.lang.String, java.lang.String> getPackageDexMetadata(android.content.pm.PackageParser.PackageLite p0) { return null; }
    private static java.util.Map<java.lang.String, java.lang.String> buildPackageApkToDexMetadataMap(java.util.List<java.lang.String> p0) { return null; }
    public static java.lang.String buildDexMetadataPathForApk(java.lang.String p0) { return null; }
    private static java.lang.String buildDexMetadataPathForFile(java.io.File p0) { return null; }
    public static void validatePackageDexMetadata(android.content.pm.PackageParser.Package p0) throws android.content.pm.PackageParser.PackageParserException {}
    private static void validateDexMetadataFile(java.lang.String p0) throws android.content.pm.PackageParser.PackageParserException {}
    public static void validateDexPaths(java.lang.String[] p0) {}
}
